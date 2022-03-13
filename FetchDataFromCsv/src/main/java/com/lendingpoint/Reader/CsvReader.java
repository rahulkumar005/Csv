package com.lendingpoint.Reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.DownloadErrorException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.lendingpoint.Dto.CustomerDto;

public class CsvReader {

	public static List<CustomerDto> readCsvFile(String fileName) throws FileNotFoundException, IOException {
//		String filePath = "F:\\" + fileName;
		String filepath = "/lendingpoint team folder/capital markets/forward flow/penfed/transfer_file/20211213_penfed_lendingpoint_transfer_file_"
				+ fileName;

		CsvMapper csvMapper = new CsvMapper();
		CsvSchema schema = CsvSchema.emptySchema().withHeader();
		ObjectReader objectReader = csvMapper.readerFor(CustomerDto.class).with(schema);
		DbxRequestConfig config = DbxRequestConfig.newBuilder("lp-finance-loan-tapes").build();
		DbxClientV2 client = new DbxClientV2(config,
				"x_P2-JcFcD0AAAAAAAAAAduUvk9fjX9pfmbqm2R03xA3H5CJaGNSn9KBWSmQNaPe");
		List<CustomerDto> customerList = new ArrayList<>();

		try {
//			File file = new File(filePath);
			InputStream inputStream = client.files().download(filepath).getInputStream();
			MappingIterator<CustomerDto> mapList = objectReader.readValues(inputStream);
			customerList = mapList.readAll();
		} catch (DownloadErrorException e) {
			e.printStackTrace();
		} catch (DbxException e) {
			e.printStackTrace();
		}
		return customerList;
	}

}
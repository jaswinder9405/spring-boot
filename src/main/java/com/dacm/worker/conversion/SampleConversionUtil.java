package com.dacm.worker.conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dacm.worker.response.SampleResponse;
import com.dacm.worker.utils.CommonUtility;

@Component
public class SampleConversionUtil {

	@Autowired
	private CommonUtility commonUtility;

 
	public SampleResponse getSampleResponse() {

		SampleResponse sampleResponse = new SampleResponse();
		sampleResponse.setName("Test User");
		sampleResponse.setAge("22");
		return sampleResponse;

	}

}

package com.dacm.worker.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.common.integration.service.ISIntegrationService;
import com.common.model.response.UserAccessDetailsResponse;
import com.dacm.worker.conversion.SampleConversionUtil;
import com.dacm.worker.exception.NotFoundException;
import com.dacm.worker.request.SampleCreateRequest;
import com.dacm.worker.request.SampleUpdateRequest;
import com.dacm.worker.response.SampleResponse;
import com.dacm.worker.service.SampleService;
import com.dacm.worker.utils.CommonUtility;
import com.dacm.worker.utils.DWToolBox;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private CommonUtility commonUtility;

	@Autowired
	private ISIntegrationService isIntegrationService;

	@Autowired
	private SampleConversionUtil sampleConversionUtil;

	@Override
	public SampleResponse addSample(String authorizationToken, SampleCreateRequest sampleCreateRequest,
			UserAccessDetailsResponse validateTokenResponse) throws Exception {
		log.info("add Sample request received:: ");
		return sampleConversionUtil.getSampleResponse();

	}

	@Override
	public SampleResponse updateSampleByUuid(String authorizationToken, SampleUpdateRequest sampleUpdateRequest,
			UserAccessDetailsResponse validateTokenResponse, String sampleUuid) throws Exception {
		// TODO Auto-generated method stub
		return sampleConversionUtil.getSampleResponse();
	}

	@Override
	public SampleResponse getSampleByUuid(String authorizationToken, String sampleUuid) throws Exception {
		// TODO Auto-generated method stub
		return sampleConversionUtil.getSampleResponse();
	}

	@Override
	public ResponseEntity<List<SampleResponse>> getAllSamples(String authorizationToken, String customerUuid,
			String sampleUuid, String status, Integer offset, Integer limit, String sortBy, String order,
			String modifiedBy, String modifiedOn, String createdBy, String createdOn) throws Exception {
		List<SampleResponse> sampleResponseList = new ArrayList<SampleResponse>();
		sampleResponseList.add(sampleConversionUtil.getSampleResponse());
		Long totalCount = 1L;
		HttpHeaders headers = new HttpHeaders();
		DWToolBox.setHeaders(headers, offset, limit, totalCount, sampleResponseList.size());
		String nextPage = DWToolBox.setNextPage(totalCount, offset, limit, sampleResponseList.size());
		headers.add("X-Pagination-Throttled", nextPage);
		return new ResponseEntity<>(sampleResponseList, headers, HttpStatus.OK);
	}

	@Override
	public void deleteSampleByUuid(String sampleUuid, UserAccessDetailsResponse validateTokenResponse)
			throws NotFoundException {
		// TODO Auto-generated method stub

	}

}

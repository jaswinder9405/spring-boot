package  com.dacm.worker.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.common.model.response.UserAccessDetailsResponse;
import com.dacm.worker.exception.NotFoundException;
import com.dacm.worker.request.SampleCreateRequest;
import com.dacm.worker.request.SampleUpdateRequest;
import com.dacm.worker.response.SampleResponse;

public interface SampleService {

	SampleResponse addSample(String authorizationToken, SampleCreateRequest sampleCreateRequest,
			UserAccessDetailsResponse validateTokenResponse) throws Exception;

	SampleResponse updateSampleByUuid(String authorizationToken, SampleUpdateRequest sampleUpdateRequest,
			UserAccessDetailsResponse validateTokenResponse, String sampleUuid) throws Exception;

	SampleResponse getSampleByUuid(String authorizationToken, String sampleUuid) throws Exception;

	ResponseEntity<List<SampleResponse>> getAllSamples(String authorizationToken, String customerUuid,
			String sampleUuid, String status, Integer offset, Integer limit, String sortBy,
			String order, String modifiedBy, String modifiedOn, String createdBy, String createdOn) throws Exception;

	void deleteSampleByUuid(String sampleUuid, UserAccessDetailsResponse validateTokenResponse)
			throws NotFoundException;

}

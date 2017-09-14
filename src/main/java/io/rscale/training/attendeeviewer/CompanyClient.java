package io.rscale.training.attendeeviewer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "company")
public interface CompanyClient {

	@RequestMapping(method = RequestMethod.GET, value = "/company")
	Company getCompany(String id);
	
}

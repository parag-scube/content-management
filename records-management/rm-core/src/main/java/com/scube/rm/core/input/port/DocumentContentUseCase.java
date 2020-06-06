package com.scube.rm.core.input.port;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentContentUseCase {
	
	ResponseEntity<?> setContent(Long Id, MultipartFile file);
	
	ResponseEntity<?> getContent(Long Id);
	
	ResponseEntity<?> unsetContent(Long Id);
	
	ResponseEntity<?> searchContent(String queryString);

}

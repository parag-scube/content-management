package com.scube.rm.core.output.port;

import java.io.InputStream;
import java.util.Optional;

import com.scube.rm.domain.Document;

public interface DocumentFSPersistencePort {
	
	Optional<Document> setContent(Document document, InputStream content);
	
	InputStream getContent(Document document);
	
	Document unsetContent(Document document);

}

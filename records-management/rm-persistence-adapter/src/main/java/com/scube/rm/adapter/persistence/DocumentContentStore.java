package com.scube.rm.adapter.persistence;

import org.springframework.content.commons.repository.ContentStore;
import org.springframework.content.commons.search.Searchable;

public interface DocumentContentStore extends ContentStore<DocumentJpaEntity, String>, Searchable<String> {

}

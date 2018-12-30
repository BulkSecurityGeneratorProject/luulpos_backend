package com.luulsolutions.luulpos.repository.search;

import com.luulsolutions.luulpos.domain.SuspensionHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the SuspensionHistory entity.
 */
public interface SuspensionHistorySearchRepository extends ElasticsearchRepository<SuspensionHistory, Long> {
}

package service;

import java.util.ArrayList;

/**
 * @author YeChunBo
 * @time 2019��3��31��
 *
 *       ��˵��
 */

public interface ElasticService {

	String getIndexDataCount(String indexName);
	
	String createIndex(String indexName);

	String deleteIndex(String indexName);

	ArrayList<String> getAllIndex();

	Boolean bulkData2Es(String indexName);

	ArrayList<String> queryData(String queryParm);
	
//	queryDataFrom

}

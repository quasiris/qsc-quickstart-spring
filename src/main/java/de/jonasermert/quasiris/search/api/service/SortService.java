package de.jonasermert.quasiris.search.api.service;
/*

import com.quasiris.qsf.order.OrderBy;
import com.quasiris.qsf.order.SortField;
import com.quasiris.qsf.query.Query;
import com.quasiris.qsf.query.QueryResult;

public class SortService {

    // Sortierung nach Relevanz
    public QueryResult orderByScore(String queryString) {
        Query query = new Query(queryString);
        QueryResult queryResultScore = query.execute();
        SortField sortField = new SortField("score", SortField.Type.SCORE);
        OrderBy orderBy = new OrderBy(sortField);
        queryResult.sort(orderBy);
        return queryResultScore;
    }

    // Sortierung nach Preis aufsteigend
    public QueryResult orderByPriceASC(String queryString) {
        Query query = new Query(queryString);
        QueryResult queryResultPriceASC = query.execute();
        SortField sortField = new SortField("price", SortField.Type.DOUBLE);
        OrderBy orderBy = new OrderBy(sortField);
        queryResult.sort(orderBy);
        return queryResultPriceASC;
    }

    // Sortierung nach Preis aufsteigend
     public QueryResult orderByPriceDESC(String queryString) {
        Query query = new Query(queryString);
        QueryResult queryResultPriceDESC = query.execute();
        SortField sortField = new SortField("price", SortField.Type.DOUBLE);
        OrderBy orderBy = new OrderBy(sortField);
        queryResult.sort(orderBy);
        return queryResultPriceDESC;
    }

    // Sortierung nach zuletzt gekauft
    public QueryResult orderByLastPurchased(String queryString) {
        Query query = new Query(queryString);
        QueryResult queryResultLastPurchased = query.execute();
        SortField sortField = new SortField("last_purchase_date", SortField.Type.DATE);
        OrderBy orderBy = new OrderBy(sortField);
        queryResult.sort(orderBy);
        return queryResultLastPurchased;
    }

    // Sortierung Titel A - Z
     public QueryResult orderByTitleAtoZ(String queryString) {
        Query query = new Query(queryString);
        QueryResult queryResultTitleAtoZ = query.execute();
        SortField sortField = new SortField("title", SortField.Type.STRING);
        OrderBy orderBy = new OrderBy(sortField);
        orderBy.setOrder(Order.ASC);
        queryResult.sort(orderBy);
        return queryResultTitleAtoZ;
    }

    // Sortierung Titel Z - A
    public QueryResult orderByTitleZtoA(String queryString) {
        Query query = new Query(queryString);
        QueryResult queryResultTitleZtoA = query.execute();
        SortField sortField = new SortField("title", SortField.Type.STRING);
        OrderBy orderBy = new OrderBy(sortField);
        orderBy.setOrder(Order.DESC);
        queryResult.sort(orderBy);
        return queryResultTitleZtoA;
    }
}

*/
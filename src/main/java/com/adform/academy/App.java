package com.adform.academy;

import com.adform.academy.data.dao.DaoClient;
import com.adform.academy.data.dao.DaoClientType;
import com.adform.academy.data.dao.DaoException;
import com.adform.academy.data.dao.DaoFactory;

public class App
{
    public static void main( String[] args ) throws DaoException {
        //DataReader reader = new DataReader();
//        DaoClient client = DaoFactory.getInstance().getDAO(DaoClientType.AE);
        DataReader reader = new DataReader();
        reader.readFromKafka();
        System.out.println("ok");
    }
}

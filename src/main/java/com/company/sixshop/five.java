//package main.java.com.company.sixshop;
//
//public class five {
//}
//

//SELECT m.ID, m.NAME, SUM(c.AMOUNT) AS AMOUNT
//        FROM CARD_USAGES c
//        INNER JOIN MERCHANTS  m ON  c.MERCHANT_ID = m.ID  AND c.AMOUNT >0
//        GROUP BY  c.MERCHANT_ID
//        ORDER BY SUM(c.AMOUNT) DESC
//        LIMIT 5
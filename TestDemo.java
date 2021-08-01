import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException {

        /**
         * 鍒涘缓琛�         */
        //鍏堝垱寤轰竴涓狿rince_Yu:student鐨勮〃锛屽垪鏃忔湁info锛宻core
        String[] columnFamily = {"info","score"};
        String tableName = "Prince_Yu:student";
        CreateDome.create(tableName,columnFamily);
 
        /**
         * 鎻掑叆鏁版嵁
         * 
         */

        //鎻掑叆Tom鐨勪俊鎭拰鎴愮哗
        InsertDemo.insertData("Prince_Yu:student","Tom","info","student_Id","20210000000001");
        InsertDemo.insertData("Prince_Yu:student","Tom","info","class","1");
        InsertDemo.insertData("Prince_Yu:student","Tom","score","understanding","75");
        InsertDemo.insertData("Prince_Yu:student","Tom","score","programming","82");

        //鎻掑叆Jerry鐨勪俊鎭拰鎴愮哗
        InsertDemo.insertData("Prince_Yu:student","Jerry","info","student_Id","20210000000002");
        InsertDemo.insertData("Prince_Yu:student","Jerry","info","class","1");
        InsertDemo.insertData("Prince_Yu:student","Jerry","score","understanding","85");
        InsertDemo.insertData("Prince_Yu:student","Jerry","score","programming","67");

        //鎻掑叆Jack鐨勪俊鎭拰鎴愮哗
        InsertDemo.insertData("Prince_Yu:student","Jack","info","student_Id","20210000000003");
        InsertDemo.insertData("Prince_Yu:student","Jack","info","class","2");
        InsertDemo.insertData("Prince_Yu:student","Jack","score","understanding","80");
        InsertDemo.insertData("Prince_Yu:student","Jack","score","programming","80");

        //鎻掑叆Rose鐨勪俊鎭拰鎴愮哗
        InsertDemo.insertData("Prince_Yu:student","Rose","info","student_Id","20210000000004");
        InsertDemo.insertData("Prince_Yu:student","Rose","info","class","2");
        InsertDemo.insertData("Prince_Yu:student","Rose","score","understanding","60");
        InsertDemo.insertData("Prince_Yu:student","Rose","score","programming","61");

        //鎻掑叆鑷繁鐨勪俊鎭拰鎴愮哗
        InsertDemo.insertData("Prince_Yu:student","Prince_Yu","info","student_Id","G20190343020221");
        InsertDemo.insertData("Prince_Yu:student","Prince_Yu","info","class","4");
        InsertDemo.insertData("Prince_Yu:student","Prince_Yu","score","understanding","100");
        InsertDemo.insertData("Prince_Yu:student","Prince_Yu","score","programming","100");

        /**
         * 鏌ヨ鏁版嵁
         */
        //鏌ヨ鏁版嵁,鏌ヨPrince_Yu鐨剈nderstanding鎴愮哗
        String tableName1 = "Prince_Yu:student";
        String row = "Prince_Yu";
        String columnFamily1 = "score";
        String column = "understanding";
        
        GetDemo.getData(tableName1,row,columnFamily1,column);
 
        /**
         * 鍒犻櫎鏁版嵁
         */
        //鍒犻櫎鏁版嵁Prince_Yu鐨刬nfo鍒楁棌涓殑class
        DeleteDome.deleteData(tableName1,row,"info","class");

    }

}
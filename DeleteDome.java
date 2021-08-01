import java.io.IOException;

public class DeleteDome {

    //鍒犻櫎鎸囧畾鍒楃殑鏁版嵁
    public static void deleteData(String tableName,String rowKey,String cf,String cn) throws IOException{
    
        Table table = connection.getTable(tableName.valueOf(tableName));

        Delete delete = new Delete(Bytes.toBytes(rowKey));
        //addColumn鏄垹闄ゆ渶鏂扮増鏈殑鍒楃殑鏁版嵁锛屼篃鍙互浼犲叆鏃堕棿鎴筹紝浼氬垹闄ゆ寚瀹氭椂闂存埑鐨勯偅涓増鏈暟鎹�        //delete.addColumn(Bytes.toBytes(cf),Bytes.toBytes(cn));

        //addColumns鏄垹闄ゆ墍鏈夌増鏈殑鍒楃殑鏁版嵁锛屼篃鍙互浼犲叆鏃堕棿鎴筹紝浼氬皢灏忎簬绛変簬浼犲叆鐨勬椂闂存埑鐨勫叏閮ㄧ増鏈垹闄ゆ帀
        delete.addColumns(Bytes.toBytes(cf),Bytes.toBytes(cn));

        table.delete(delete);

        table.close();
    }

}
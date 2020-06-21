package com.jiangbei.test.pojo;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/14 18:54
 * @Version: 1.0
 * @Description:映射mysql中crm内的base_dict表
 */
public class DEPT {
    private String DeptNo;
    private String DName;
    private String Loc;
    private String RowId;

    public String getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(String deptNo) {
        DeptNo = deptNo;
    }

    public String getDName() {
        return DName;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public String getRowId() {
        return RowId;
    }

    public void setRowId(String rowId) {
        RowId = rowId;
    }

    @Override
    public String toString() {
        return "DEPT{" +
                "DeptNo='" + DeptNo + '\'' +
                ", DName='" + DName + '\'' +
                ", Loc='" + Loc + '\'' +
                ", RowId='" + RowId + '\'' +
                '}';
    }
}

package cn.mainfunc.test.model;

public class Company {

    private long coId;          //主键Id
    private String coName;      //公司名称
    private String creator;     //录入者
    private String updatetime;  //创建时间
    private int mineId;
    private String mineName;

    public long getCoId() {
        return coId;
    }

    public void setCoId(long coId) {
        this.coId = coId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public int getMineId() {
        return mineId;
    }

    public void setMineId(int mineId) {
        this.mineId = mineId;
    }

    public String getMineName() {
        return mineName;
    }

    public void setMineName(String mineName) {
        this.mineName = mineName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "coId=" + coId +
                ", coName='" + coName + '\'' +
                ", creator='" + creator + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", mineName='" + mineName + '\'' +
                '}';
    }
}

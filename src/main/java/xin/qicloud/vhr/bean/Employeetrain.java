package xin.qicloud.vhr.bean;

import java.util.Date;

public class Employeetrain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.id
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.eid
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private Integer eid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.trainDate
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private Date traindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.trainContent
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private String traincontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.remark
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.id
     *
     * @return the value of employeetrain.id
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.id
     *
     * @param id the value for employeetrain.id
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.eid
     *
     * @return the value of employeetrain.eid
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.eid
     *
     * @param eid the value for employeetrain.eid
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.trainDate
     *
     * @return the value of employeetrain.trainDate
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public Date getTraindate() {
        return traindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.trainDate
     *
     * @param traindate the value for employeetrain.trainDate
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setTraindate(Date traindate) {
        this.traindate = traindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.trainContent
     *
     * @return the value of employeetrain.trainContent
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public String getTraincontent() {
        return traincontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.trainContent
     *
     * @param traincontent the value for employeetrain.trainContent
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.remark
     *
     * @return the value of employeetrain.remark
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.remark
     *
     * @param remark the value for employeetrain.remark
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
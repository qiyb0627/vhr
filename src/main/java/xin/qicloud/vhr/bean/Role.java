package xin.qicloud.vhr.bean;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.nameZh
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    private String namezh;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.name
     *
     * @return the value of role.name
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.name
     *
     * @param name the value for role.name
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.nameZh
     *
     * @return the value of role.nameZh
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public String getNamezh() {
        return namezh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.nameZh
     *
     * @param namezh the value for role.nameZh
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    public void setNamezh(String namezh) {
        this.namezh = namezh == null ? null : namezh.trim();
    }
}
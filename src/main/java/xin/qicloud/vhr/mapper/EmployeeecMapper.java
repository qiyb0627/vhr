package xin.qicloud.vhr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xin.qicloud.vhr.bean.Employeeec;
import xin.qicloud.vhr.bean.EmployeeecExample;

public interface EmployeeecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    long countByExample(EmployeeecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByExample(EmployeeecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insert(Employeeec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insertSelective(Employeeec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    List<Employeeec> selectByExample(EmployeeecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    Employeeec selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") Employeeec record, @Param("example") EmployeeecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExample(@Param("record") Employeeec record, @Param("example") EmployeeecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKeySelective(Employeeec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKey(Employeeec record);
}
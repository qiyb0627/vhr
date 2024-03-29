package xin.qicloud.vhr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xin.qicloud.vhr.bean.Salary;
import xin.qicloud.vhr.bean.SalaryExample;

public interface SalaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    long countByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insert(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insertSelective(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    List<Salary> selectByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    Salary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") Salary record, @Param("example") SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExample(@Param("record") Salary record, @Param("example") SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKeySelective(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salary
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKey(Salary record);
}
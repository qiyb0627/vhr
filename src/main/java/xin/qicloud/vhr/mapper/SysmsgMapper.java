package xin.qicloud.vhr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xin.qicloud.vhr.bean.Sysmsg;
import xin.qicloud.vhr.bean.SysmsgExample;

public interface SysmsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    long countByExample(SysmsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByExample(SysmsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insert(Sysmsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insertSelective(Sysmsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    List<Sysmsg> selectByExample(SysmsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    Sysmsg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") Sysmsg record, @Param("example") SysmsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExample(@Param("record") Sysmsg record, @Param("example") SysmsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKeySelective(Sysmsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmsg
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKey(Sysmsg record);
}
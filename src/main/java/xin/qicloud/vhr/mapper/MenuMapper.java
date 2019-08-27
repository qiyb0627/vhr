package xin.qicloud.vhr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xin.qicloud.vhr.bean.Menu;
import xin.qicloud.vhr.bean.MenuExample;

public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    long countByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int insertSelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    Menu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 27 19:29:39 CST 2019
     */
    int updateByPrimaryKey(Menu record);
}
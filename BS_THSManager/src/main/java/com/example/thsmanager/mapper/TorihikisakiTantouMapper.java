package com.example.thsmanager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.thsmanager.entity.TorihikisakiTantou;
import com.example.thsmanager.entity.TorihikisakiTantouExample;

@Mapper
public interface TorihikisakiTantouMapper {
	@Select("select * from TORIHIKISAKI_TANTOU")
	List<TorihikisakiTantou> selectTorihikisakiTantous();
	
	@Select("select * from TORIHIKISAKI_TANTOU where TANTOU_ID=#{tantouId}")
	TorihikisakiTantou selectTorihikisakiTantou(Integer tantouId);
	
	@Insert("insert into TORIHIKISAKI_TANTOU(FIRST_NAME, LAST_NAME, SYOZOKU, YAKUSYOKU, MAIL, TEL)"
	        + "values(#{firstName}, #{lastName}, #{syozoku}, #{yakusyoku}, #{mail}, #{tel})")
	void addTorihikisakiTantou(TorihikisakiTantou torihikisakiTantou);
	
	@Delete("delete from TORIHIKISAKI_TANTOU where TANTOU_ID=#{tantouId}")
	void delTorihikisakiTantou(Integer tantouId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    long countByExample(TorihikisakiTantouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int deleteByExample(TorihikisakiTantouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int deleteByPrimaryKey(Integer tantouId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int insert(TorihikisakiTantou row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int insertSelective(TorihikisakiTantou row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    List<TorihikisakiTantou> selectByExample(TorihikisakiTantouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    TorihikisakiTantou selectByPrimaryKey(Integer tantouId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int updateByExampleSelective(@Param("row") TorihikisakiTantou row, @Param("example") TorihikisakiTantouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int updateByExample(@Param("row") TorihikisakiTantou row, @Param("example") TorihikisakiTantouExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int updateByPrimaryKeySelective(TorihikisakiTantou row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table torihikisaki_tantou
     *
     * @mbg.generated Mon Jan 01 09:41:55 KST 2024
     */
    int updateByPrimaryKey(TorihikisakiTantou row);
}
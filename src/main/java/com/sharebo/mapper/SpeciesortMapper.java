package com.sharebo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sharebo.entity.Patterntype;
import com.sharebo.entity.Speciesort;
import com.sharebo.entity.dto.SpeciesortDto;

/**
 * @author Administrator
 * 车类型
 */
public interface SpeciesortMapper {
	/**
	 * 查询全部车类型
	 * @return
	 */
	public List<Speciesort> loadSpeciesortAll();
	/**
	 * 查询车类别
	 * @param specieid
	 * @return
	 */
	public List<Patterntype>loadAllPatterntype(@Param("specieid")String specieid);
	public List<SpeciesortDto> loadAllPatterntype2();
}

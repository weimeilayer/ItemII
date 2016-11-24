package com.sharebo.mapper;

import org.apache.ibatis.annotations.Param;

import com.sharebo.entity.Wallet;
import com.sharebo.entity.dto.WalletDto;

public interface WalletMapper {
	/**
	 * 查询用户可用余额和冻结金额
	 * @param userid
	 * @return
	 */
	public WalletDto getAvailableBalance(@Param("userid")String userid);
	public int addWalletation(Wallet wallet);
}

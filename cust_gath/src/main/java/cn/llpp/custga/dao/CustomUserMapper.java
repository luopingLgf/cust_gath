package cn.llpp.custga.dao;

import cn.llpp.custga.model.CustomUser;

public interface CustomUserMapper {
	/**
	 * �����û�
	 * @param customUser
	 * @return
	 */
	public int saveCustomUser(CustomUser customUser);
}

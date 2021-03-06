package com.resoft.credit.mortgageOtherInfo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resoft.credit.mortgageOtherInfo.dao.MortgageOtherInfoDao;
import com.resoft.credit.mortgageOtherInfo.entity.MortgageOtherInfo;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.persistence.annotation.DbType;
import com.thinkgem.jeesite.common.service.CrudService;

/**
 * 其他抵质押物信息Service
 * @author yanwanmei
 * @version 2016-02-24
 */
@Service @DbType("cre.dbType")
@Transactional(value="CRE",readOnly = true)
public class MortgageOtherInfoService extends CrudService<MortgageOtherInfoDao, MortgageOtherInfo> {

	public MortgageOtherInfo get(String id) {
		return super.get(id);
	}
	
	public List<MortgageOtherInfo> findList(MortgageOtherInfo mortgageOtherInfo) {
		return super.findList(mortgageOtherInfo);
	}
	
	public Page<MortgageOtherInfo> findPage(Page<MortgageOtherInfo> page, MortgageOtherInfo mortgageOtherInfo) {
		return super.findPage(page, mortgageOtherInfo);
	}
	
	@Transactional(value="CRE",readOnly = false)
	public void save(MortgageOtherInfo mortgageOtherInfo) {
		super.save(mortgageOtherInfo);
	}
	
	@Transactional(value="CRE",readOnly = false)
	public void delete(MortgageOtherInfo mortgageOtherInfo) {
		super.delete(mortgageOtherInfo);
	}
	
	@Transactional(value="CRE",readOnly=false)
	public void batchDelete(List<String> idList){
		if(null!=idList && idList.size()>0){
			Map<String,Object> param = new HashMap<String, Object>();
			param.put("idList", idList);
			super.dao.batchDelete(param);
		}
	}
	
	public List<MortgageOtherInfo> getPageByApplyNo(String applyNo){
		return super.dao.getPageByApplyNo(applyNo);
	}

	/**
	 * 查询要推送的其他其质押物信息
	 * @return 
	 */
	@Transactional(value = "CRE", readOnly = false)
	public List<MortgageOtherInfo> getOtherData(String applyNo) {
		return super.dao.getOtherData(applyNo);
	}
	

	
}
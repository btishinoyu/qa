package com.example.ws.goods;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.example.domain.model.GoodsInfo;

/**
 * 商品WebサービスのIF
 */
@WebService(targetNamespace = "http://example.com/goods")
public interface GoodsWebService {
	@WebMethod
	@WebResult(name = "goodsInfo")
	GoodsInfo getGoodsInfo(@WebParam(name = "goodsId") String goodsId);

	@WebMethod
	void setGoodsInfo(@WebParam(name = "goodsInfo") GoodsInfo goodsInfo);
}

package com.example.ws.goods;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.example.domain.model.GoodsInfo;


@WebService(
        portName = "GoodsWebPort",
        serviceName = "GoodsWebService",
        targetNamespace = "http://example.com/goods",
        endpointInterface = "com.example.ws.goods.GoodsWebService")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class GoodsWebServiceImpl extends SpringBeanAutowiringSupport implements GoodsWebService {

	private static Logger logger = LoggerFactory.getLogger(GoodsWebServiceImpl.class);

	@Override
	public GoodsInfo getGoodsInfo(String goodsId) {
		GoodsInfo gi = new GoodsInfo();
		gi.setName("ねるねるねるね");
		gi.setPrice(108);
		return gi;
	}

	@Override
	public void setGoodsInfo(GoodsInfo goodsInfo) {
		logger.debug(goodsInfo.getName());
		logger.debug("" + goodsInfo.getPrice());
	}

}

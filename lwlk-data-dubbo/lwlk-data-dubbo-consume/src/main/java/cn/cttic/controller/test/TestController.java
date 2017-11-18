package cn.cttic.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.cttic.reference.test.TestReference;
import cn.cttic.utils.ResponseData;
import cn.cttic.utils.ResultEntity;

@RestController
@RequestMapping("/lwlk/test")
public class TestController extends ResponseData {
	@Autowired
	private TestReference testReference;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResultEntity get(HttpServletRequest request) {
		ResultEntity res = null;
		try {
			testReference.testService();
			res = this.getResultEntity(true, 200, "查询成功！", null);
		} catch (Exception e) {
			e.printStackTrace();
			res = this.getResultEntity(false, 500, "系统内部错误！", null);
		}
		return res;
	}
}

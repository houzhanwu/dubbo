package cn.cttic.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cttic.utils.ResultEntity;

@ControllerAdvice
public class GlobalExceptionHandler {
	private Logger logger = LoggerFactory
			.getLogger(GlobalExceptionHandler.class);

	/**
	 * 系统异常处理，比如：404,500
	 * 
	 * @param req
	 * @param resp
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultEntity defaultErrorHandler(HttpServletRequest req, Exception e)
			throws Exception {
		logger.error("", e);
		ResultEntity r = new ResultEntity();
		if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
			r.setCode(404);
			r.setMessage("访问路径不存在");
		} else if (e instanceof java.lang.IllegalStateException) {
			r.setCode(401);
			r.setMessage("请求参数错误");
		} else if (e instanceof org.springframework.web.HttpRequestMethodNotSupportedException) {
			r.setCode(406);
			r.setMessage("请求方法错误");
		} else {
			r.setCode(500);
			r.setMessage("系统内部错误");
		}
		r.setData(null);
		r.setStatus(false);
		return r;
	}
}
package cn.cttic.utils;


public class ResponseData {

	public ResultEntity getResultEntity(boolean status, int code,
			String message,Object data) {
		ResultEntity res = new ResultEntity();
		res.setStatus(status);
		res.setCode(code);
		res.setMessage(message);
		res.setData(data);
		return res;
	}
	
	//分页
	public PageResult getResult(boolean status, int code,
			String message,int count,int page,int pageSize,Object data) {
		PageResult res = new PageResult();
		res.setStatus(status);
		res.setCode(code);
		res.setMessage(message);
		res.setCount(count);
		res.setPage(page);
		res.setPageSize(pageSize);
		res.setData(data);
		return res;
	}
}

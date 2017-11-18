package cn.cttic.utils;

import java.util.List;

public class PageVo<T> {

	private int totals; // 记录总数

	private int pages;// 总页数

	private int size;// 每页记录数

	private int current;// 当前页

	private List<T> list;// 记录集合

	public void setData(int total, int page, int size, List<T> lst) {
		this.totals = total;
		this.size = size == 0 ? total : size;
		if (total == 0) {
			this.pages = 0;
		} else {
			this.pages = size == 0 ? 1 : (total - 1) / size + 1;
		}
		this.current = page > pages ? pages : page;
		this.list = lst;
	}

	public int getTotals() {
		return totals;
	}

	public void setTotals(int totals) {
		this.totals = totals;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}

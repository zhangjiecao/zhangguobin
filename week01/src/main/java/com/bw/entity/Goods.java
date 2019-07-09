package com.bw.entity;

public class Goods {
	private int gid;
	private String gname;
	/**
	 * @return the gid
	 */
	public int getGid() {
		return gid;
	}
	/**
	 * @param gid the gid to set
	 */
	public void setGid(int gid) {
		this.gid = gid;
	}
	/**
	 * @return the gname
	 */
	public String getGname() {
		return gname;
	}
	/**
	 * @param gname the gname to set
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Goods(int gid, String gname) {
		super();
		this.gid = gid;
		this.gname = gname;
	}
	public Goods() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + "]";
	}
	
	
}

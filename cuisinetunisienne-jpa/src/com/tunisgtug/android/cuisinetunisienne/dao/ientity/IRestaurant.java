package com.tunisgtug.android.cuisinetunisienne.dao.ientity;

public interface IRestaurant {

	public abstract long getResid();

	public abstract void setResid(long id);

	public abstract void setResname(String param);

	public abstract String getResname();

	public abstract void setAmbiances(String param);

	public abstract String getAmbiances();

	public abstract void setAddress(String param);

	public abstract String getAddress();

	public abstract void setSincedate(String param);

	public abstract String getSincedate();

	public abstract void setResrating(int param);

	public abstract int getResrating();

}
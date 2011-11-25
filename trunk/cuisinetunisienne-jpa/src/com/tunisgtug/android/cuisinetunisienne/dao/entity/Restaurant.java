package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

import com.tunisgtug.android.cuisinetunisienne.dao.ientity.IRestaurant;
import static javax.persistence.TemporalType.DATE;

@Entity(name = "Restaurant")
public class Restaurant implements IRestaurant {

	@Id
	private long resid;
	@Basic
	private String resname;
	@Basic
	private String ambiances;
	@Basic
	private String address;
	@Basic
	@Temporal(DATE)
	private String sincedate;
	@Basic
	private int resrating;
	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#getResid()
	 */
	public long getResid() {
		return resid;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#setResid(long)
	 */
	public void setResid(long id) {
		this.resid = id;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#setResname(java.lang.String)
	 */
	public void setResname(String param) {
		this.resname = param;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#getResname()
	 */
	public String getResname() {
		return resname;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#setAmbiances(java.lang.String)
	 */
	public void setAmbiances(String param) {
		this.ambiances = param;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#getAmbiances()
	 */
	public String getAmbiances() {
		return ambiances;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#setAddress(java.lang.String)
	 */
	public void setAddress(String param) {
		this.address = param;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#getAddress()
	 */
	public String getAddress() {
		return address;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#setSincedate(java.lang.String)
	 */
	public void setSincedate(String param) {
		this.sincedate = param;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#getSincedate()
	 */
	public String getSincedate() {
		return sincedate;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#setResrating(int)
	 */
	public void setResrating(int param) {
		this.resrating = param;
	}

	/* (non-Javadoc)
	 * @see com.tunisgtug.android.cuisinetunisienne.dao.entity.IRestaurant#getResrating()
	 */
	public int getResrating() {
		return resrating;
	}

}
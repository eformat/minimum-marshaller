package org.mk300.marshal.minimum.test.pojo;



public class POJO010 {
	
	private String attribute1_ = null;
	private String attribute2_ = null;
	private String attribute3_ = null;
	private String attribute4_ = null;
	private String attribute5_ = null;
	private String attribute6_ = null;
	private String attribute7_ = null;
	private String attribute8_ = null;
	private String attribute9_ = null;
	private String attribute10_ = null;
	
	public POJO010() {
		super();
	}

	public String getAttribute1() {
		return attribute1_;
	}

	public void setAttribute1(String attribute1) {
		attribute1_ = attribute1;
	}

	public String getAttribute2() {
		return attribute2_;
	}

	public void setAttribute2(String attribute2) {
		attribute2_ = attribute2;
	}

	public String getAttribute3() {
		return attribute3_;
	}

	public void setAttribute3(String attribute3) {
		attribute3_ = attribute3;
	}

	public String getAttribute4() {
		return attribute4_;
	}

	public void setAttribute4(String attribute4) {
		attribute4_ = attribute4;
	}

	public String getAttribute5() {
		return attribute5_;
	}

	public void setAttribute5(String attribute5) {
		attribute5_ = attribute5;
	}

	public String getAttribute6() {
		return attribute6_;
	}

	public void setAttribute6(String attribute6) {
		attribute6_ = attribute6;
	}

	public String getAttribute7() {
		return attribute7_;
	}

	public void setAttribute7(String attribute7) {
		attribute7_ = attribute7;
	}

	public String getAttribute8() {
		return attribute8_;
	}

	public void setAttribute8(String attribute8) {
		attribute8_ = attribute8;
	}

	public String getAttribute9() {
		return attribute9_;
	}

	public void setAttribute9(String attribute9) {
		attribute9_ = attribute9;
	}

	public String getAttribute10() {
		return attribute10_;
	}

	public void setAttribute10(String attribute10) {
		attribute10_ = attribute10;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((attribute10_ == null) ? 0 : attribute10_.hashCode());
		result = prime * result
				+ ((attribute1_ == null) ? 0 : attribute1_.hashCode());
		result = prime * result
				+ ((attribute2_ == null) ? 0 : attribute2_.hashCode());
		result = prime * result
				+ ((attribute3_ == null) ? 0 : attribute3_.hashCode());
		result = prime * result
				+ ((attribute4_ == null) ? 0 : attribute4_.hashCode());
		result = prime * result
				+ ((attribute5_ == null) ? 0 : attribute5_.hashCode());
		result = prime * result
				+ ((attribute6_ == null) ? 0 : attribute6_.hashCode());
		result = prime * result
				+ ((attribute7_ == null) ? 0 : attribute7_.hashCode());
		result = prime * result
				+ ((attribute8_ == null) ? 0 : attribute8_.hashCode());
		result = prime * result
				+ ((attribute9_ == null) ? 0 : attribute9_.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		POJO010 other = (POJO010) obj;
		if (attribute10_ == null) {
			if (other.attribute10_ != null)
				return false;
		} else if (!attribute10_.equals(other.attribute10_))
			return false;
		if (attribute1_ == null) {
			if (other.attribute1_ != null)
				return false;
		} else if (!attribute1_.equals(other.attribute1_))
			return false;
		if (attribute2_ == null) {
			if (other.attribute2_ != null)
				return false;
		} else if (!attribute2_.equals(other.attribute2_))
			return false;
		if (attribute3_ == null) {
			if (other.attribute3_ != null)
				return false;
		} else if (!attribute3_.equals(other.attribute3_))
			return false;
		if (attribute4_ == null) {
			if (other.attribute4_ != null)
				return false;
		} else if (!attribute4_.equals(other.attribute4_))
			return false;
		if (attribute5_ == null) {
			if (other.attribute5_ != null)
				return false;
		} else if (!attribute5_.equals(other.attribute5_))
			return false;
		if (attribute6_ == null) {
			if (other.attribute6_ != null)
				return false;
		} else if (!attribute6_.equals(other.attribute6_))
			return false;
		if (attribute7_ == null) {
			if (other.attribute7_ != null)
				return false;
		} else if (!attribute7_.equals(other.attribute7_))
			return false;
		if (attribute8_ == null) {
			if (other.attribute8_ != null)
				return false;
		} else if (!attribute8_.equals(other.attribute8_))
			return false;
		if (attribute9_ == null) {
			if (other.attribute9_ != null)
				return false;
		} else if (!attribute9_.equals(other.attribute9_))
			return false;
		return true;
	}

	
}

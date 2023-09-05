package interview;

public class Inventory {
     int productId;
     String invName;
     String desc;
     String unitPrice;
     String createdBy;
     String modifiedBy;
     String createdTime;
     String modifiedTime;
     String stock;
	public Inventory(int productId, String invName, String desc, String unitPrice, String createdBy, String modifiedBy,
			String createdTime, String modifiedTime, String stock) {
		super();
		this.productId = productId;
		this.invName = invName;
		this.desc = desc;
		this.unitPrice = unitPrice;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.stock = stock;
		add();
	}
	public static void add(){
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getInvName() {
		return invName;
	}
	public void setInvName(String invName) {
		this.invName = invName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
     
}

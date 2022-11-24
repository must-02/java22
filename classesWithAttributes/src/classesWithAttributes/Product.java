package classesWithAttributes;

public class Product {
	// classlar sadece fonksiyon(metot)tutmazlar,özellikte(nitelik)tutarlar.
	// bunlara attribute veya field denir.

	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String renk) {
		this._renk = renk;
	}

	// getter bloğu id için.
	public int getId() {
		return _id;
	}

	// setter bloğu id için.
	public void setId(int id) {
		_id = id;
	}

	public String get_kod() {
		return _kod;
	}

	public void set_kod(String kod) {
		this._kod = kod;
	}

}

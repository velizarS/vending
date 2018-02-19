
package MyVendingM;

import java.util.Objects;


public class Product implements Info {
 protected  int id;
 protected String name;
 protected double price;
 protected String info;

 public Product(int id, String name, double price,String info) {

	this.id = id;
	this.name = name;
	this.price = price;
        this.info = info;
}

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }



public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 public void Info(){
     System.out.println("name : " + name + " price : " + price );
     System.out.println("");
    System.out.println("info : " + info );
 }

    @Override
    public String toString() {
        return " "+name + "  "+price+" ";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return true;
    }

} 


package dto.tm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.scene.control.Button;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemTm  {
    private String code;
    private String desc;
    private double unitPrice;
    private int qty;
    private Button btn;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public ItemTm(String code, String desc, double unitPrice, int qty, Button btn) {
        this.code = code;
        this.desc = desc;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.btn =  btn;
    }



    @Override
    public String toString() {
        return "ItemTm{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", qty=" + qty +
                ", btn=" + btn +
                '}';
    }
}

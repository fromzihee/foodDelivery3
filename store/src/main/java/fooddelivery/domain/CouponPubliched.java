package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponPubliched extends AbstractEvent {

    private Long id;
    private String foodid;
    private String orderid;
    private String kindofdish;
    private String address;

    public CouponPubliched(OrderMange aggregate){
        super(aggregate);
    }
    public CouponPubliched(){
        super();
    }
}

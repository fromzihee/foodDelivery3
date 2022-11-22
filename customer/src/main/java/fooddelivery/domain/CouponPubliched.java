package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CouponPubliched extends AbstractEvent {

    private Long id;
    private String foodid;
    private String orderid;
    private String kindofdish;
    private String address;
}



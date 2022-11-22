package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStart extends AbstractEvent {

    private Long id;
    private String foodid;
    private String orderid;
    private String sts;
    private String preference;

    public CookStart(OrderMange aggregate){
        super(aggregate);
    }
    public CookStart(){
        super();
    }
}

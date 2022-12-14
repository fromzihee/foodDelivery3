package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private String foodid;
    private String orderid;
    private String sts;

    public Rejected(OrderMange aggregate){
        super(aggregate);
    }
    public Rejected(){
        super();
    }
}

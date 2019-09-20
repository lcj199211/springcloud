package cn.how2j.trend.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class IndexData implements Serializable {
    String date;
    float closePoint;
}

package dataStructure;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */

@Getter
@Setter
public class OdolNode {
    private OdolNode rearNode;
    private Object data;
}

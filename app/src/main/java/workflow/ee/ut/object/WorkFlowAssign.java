package workflow.ee.ut.object;

/**
 * Created by ding on 2/1/2015.
 */
public class WorkFlowAssign extends WorkFlowActivity {
    public String from;
    public String to;
    public WorkFlowAssign(String _name, String _from, String _to){
        super(_name);
        from=_from;
        to = _to;
    }
}

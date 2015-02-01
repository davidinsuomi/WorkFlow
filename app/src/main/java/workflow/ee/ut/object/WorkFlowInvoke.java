package workflow.ee.ut.object;

/**
 * Created by ding on 2/1/2015.
 */
public class WorkFlowInvoke extends WorkFlowActivity {
    public String partnerLink;
    public String operation;
    public String inputVariable;
    public String outputVariable;
    public WorkFlowInvoke(String _name, String _partnerLink, String _operation, String _inputVariable, String _outputVariable){
        super(_name);
        partnerLink = _partnerLink;
        operation = _operation;
        inputVariable = _inputVariable;
        outputVariable = _outputVariable;
    }
}
package workflow.ee.ut.object;

/**
 * Created by ding on 2/1/2015.
 */
public class WorkFlowVariable {
    public String name;
    public String messageType;
    public byte[] value;
    public WorkFlowVariable(String _name, String _messageType){
        name =_name;
        messageType = _messageType;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + "     " + messageType + "\n";
    }


}

//<variable name="request" messageType="tns:nameMessage" />
//<!-- holds the outgoing message -->
//<variable name="response" messageType="tns:greetingMessage" />
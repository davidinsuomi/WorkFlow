package workflow.ee.ut.object;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by ding on 2/1/2015.
 */
public class WorkFlowActivity {
    public String name;
    public AtomicBoolean status = new AtomicBoolean(false);
    public WorkFlowActivity(String activityName){
        name = activityName;
    }
}

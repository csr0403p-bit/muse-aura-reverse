package X;

import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.execution.gen.TaskExecutor;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GTn {
    public GSS A00;
    public DevXAgentApi A01;
    public Function0<? extends AudioModule> A03;
    public boolean A04;
    public final TaskExecutor A05;
    public final Map<Integer, String> A06 = C3cG.A0j();
    public Integer A02 = C79.A00;

    public GTn(TaskExecutor taskExecutor) {
        this.A05 = taskExecutor;
    }
}

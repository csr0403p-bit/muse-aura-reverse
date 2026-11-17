package X;

import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GUl extends CallManagerClient {
    public final GU5 A00;
    public final F0C A01 = C5322DgG.A01((Function0) new FZP(this, 6));
    public final TaskExecutor A02;

    @Override // com.facebook.rsys.callmanager.gen.CallManagerClient
    public final AudioModule getAudioModule() {
        return (AudioModule) this.A01.getValue();
    }

    @Override // com.facebook.rsys.callmanager.gen.CallManagerClient
    public final EnvironmentVariablesProxy getEnvironmentVariables() {
        return this.A00.A02;
    }

    @Override // com.facebook.rsys.callmanager.gen.CallManagerClient
    public final TaskExecutor getTaskExecutor() {
        return this.A02;
    }

    public GUl(GU5 gu5) {
        this.A00 = gu5;
        this.A02 = gu5.A03;
    }
}

package X;

import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTask;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerTaskRunner;

/* loaded from: classes6.dex */
public final class HlA extends AudioStateManagerTaskRunner {
    public final /* synthetic */ GSV A00;

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerTaskRunner
    public final void post(AppDrivenAudioTask appDrivenAudioTask, long j) {
        C7384Etj.A0Y(appDrivenAudioTask, 0);
        AnonymousClass001.A1J(new BU3(appDrivenAudioTask, null, 11, j), this.A00.A05);
    }

    public HlA(GSV gsv) {
        this.A00 = gsv;
    }
}

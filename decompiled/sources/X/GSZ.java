package X;

import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy;

/* loaded from: classes6.dex */
public final class GSZ extends AudioStateManagerProxy {
    public final GSV A00;

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
    public final void setTransport(AppDrivenAudioTransport appDrivenAudioTransport) {
        C7384Etj.A0Y(appDrivenAudioTransport, 0);
        GSV gsv = this.A00;
        gsv.A04.execute(new GSY(gsv, appDrivenAudioTransport));
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
    public final boolean builtInAecIsAvailable() {
        return this.A00.A03.builtInAecIsAvailable();
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
    public final boolean builtInAgcIsAvailable() {
        return this.A00.A03.builtInAgcIsAvailable();
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
    public final boolean builtInNsIsAvailable() {
        return this.A00.A03.builtInNsIsAvailable();
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
    public final void notifyMicrophoneMute(boolean z) {
        GSV gsv = this.A00;
        gsv.A04.execute(new RunnableC9619GSc(gsv, z));
    }

    public GSZ(GSV gsv) {
        this.A00 = gsv;
    }
}

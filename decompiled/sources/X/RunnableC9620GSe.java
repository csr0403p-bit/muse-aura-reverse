package X;

import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioPcmSink;

/* renamed from: X.GSe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9620GSe implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$setRecordingSink$1";
    public final /* synthetic */ GSV A00;
    public final /* synthetic */ AppDrivenAudioPcmSink A01;

    public RunnableC9620GSe(GSV gsv, AppDrivenAudioPcmSink appDrivenAudioPcmSink) {
        this.A00 = gsv;
        this.A01 = appDrivenAudioPcmSink;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03.setRecordingSink(this.A01);
    }
}

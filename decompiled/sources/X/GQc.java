package X;

import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice;

/* loaded from: classes6.dex */
public final class GQc implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$startRecordingDevice$1";
    public final /* synthetic */ GSV A00;

    public GQc(GSV gsv) {
        this.A00 = gsv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GSV gsv = this.A00;
        AbstractC2159Azp.A0z("initRecordingInternal::begin", "%", "%%");
        AppDrivenAudioDevice appDrivenAudioDevice = gsv.A03;
        appDrivenAudioDevice.initRecording(false);
        AbstractC2159Azp.A0z("initRecordingInternal::end", "%", "%%");
        AbstractC2159Azp.A0z("startRecordingInternal::begin", "%", "%%");
        appDrivenAudioDevice.startRecording();
        AbstractC2159Azp.A0z("startRecordingInternal::end", "%", "%%");
    }
}

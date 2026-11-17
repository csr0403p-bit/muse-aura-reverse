package X;

import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener;

/* renamed from: X.GQa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9585GQa implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$setupAudioStateAndStartDuplexDevice$1";
    public final /* synthetic */ GSV A00;
    public final /* synthetic */ GSX A01;
    public final /* synthetic */ AudioStateManagerListener A02;
    public final /* synthetic */ GX5 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public RunnableC9585GQa(GSV gsv, GSX gsx, AudioStateManagerListener audioStateManagerListener, GX5 gx5, String str, boolean z, boolean z2) {
        this.A00 = gsv;
        this.A04 = str;
        this.A01 = gsx;
        this.A02 = audioStateManagerListener;
        this.A03 = gx5;
        this.A06 = z;
        this.A05 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        GSV gsv = this.A00;
        String str = this.A04;
        if (GSV.A03(gsv, str)) {
            GSV.A01(gsv, this.A01, this.A02, this.A03, str, this.A06, this.A05);
            AbstractC2159Azp.A0z("initRecordingInternal::begin", "%", "%%");
            AppDrivenAudioDevice appDrivenAudioDevice = gsv.A03;
            appDrivenAudioDevice.initRecording(false);
            AbstractC2159Azp.A0z("initRecordingInternal::end", "%", "%%");
            AbstractC2159Azp.A0z("startRecordingInternal::begin", "%", "%%");
            appDrivenAudioDevice.startRecording();
            AbstractC2159Azp.A0z("startRecordingInternal::end", "%", "%%");
            AbstractC2159Azp.A0z("initPlayoutInternal::begin", "%", "%%");
            appDrivenAudioDevice.initPlayout(false);
            AbstractC2159Azp.A0z("initPlayoutInternal::end", "%", "%%");
            AbstractC2159Azp.A0z("startPlayoutInternal::begin", "%", "%%");
            appDrivenAudioDevice.startPlayout();
            AbstractC2159Azp.A0z("startPlayoutInternal::end", "%", "%%");
        }
    }
}

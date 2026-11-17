package X;

import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GSY implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$audioDeviceSetTransport$1";
    public final /* synthetic */ GSV A00;
    public final /* synthetic */ AppDrivenAudioTransport A01;

    public GSY(GSV gsv, AppDrivenAudioTransport appDrivenAudioTransport) {
        this.A00 = gsv;
        this.A01 = appDrivenAudioTransport;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2159Azp.A0z("audioDeviceSetTransport::begin", "%", "%%");
        GSV gsv = this.A00;
        Map<String, String> mapA0d = AnonymousClass007.A0d("app_driven_audio_setup_for_rtc_end", String.valueOf(gsv.A01), C3cG.A0r("app_driven_audio_setup_for_rtc_begin", String.valueOf(gsv.A00)));
        AppDrivenAudioTransport appDrivenAudioTransport = this.A01;
        appDrivenAudioTransport.notifyStringEvents(2, mapA0d);
        gsv.A09 = appDrivenAudioTransport;
        gsv.A03.setTransport(appDrivenAudioTransport);
        AbstractC2159Azp.A0z("audioDeviceSetTransport::end", "%", "%%");
    }
}

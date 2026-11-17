package X;

import android.os.Trace;
import com.facebook.rsys.audio.gen.AudioDeviceApi;
import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* loaded from: classes6.dex */
public final class GXi implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$onAudioRouteChanged$audioOutputRunnable$1";
    public final /* synthetic */ AudioOutputRoute A00;
    public final /* synthetic */ GXO A01;

    public GXi(AudioOutputRoute audioOutputRoute, GXO gxo) {
        this.A01 = gxo;
        this.A00 = audioOutputRoute;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GXO gxo = this.A01;
        AudioOutputRoute audioOutputRoute = this.A00;
        AbstractC3136BzG.A00("AndroidAudioProxy.onAudioRouteChanged");
        try {
            AudioDeviceApi audioDeviceApi = gxo.A01;
            if (audioDeviceApi != null) {
                audioDeviceApi.setAudioOutputRoute(audioOutputRoute);
            }
        } finally {
            Trace.endSection();
        }
    }
}

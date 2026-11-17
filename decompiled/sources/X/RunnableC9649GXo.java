package X;

import com.facebook.rsys.audio.gen.AudioDeviceApi;

/* renamed from: X.GXo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9649GXo implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$setAudioOn$runnable$1$1$audioOnRunnable$1";
    public final /* synthetic */ GXO A00;
    public final /* synthetic */ boolean A01;

    public RunnableC9649GXo(GXO gxo, boolean z) {
        this.A00 = gxo;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioDeviceApi audioDeviceApi = this.A00.A01;
        if (audioDeviceApi != null) {
            audioDeviceApi.setAudioActivationState(this.A01 ? 2 : 0);
        }
    }
}

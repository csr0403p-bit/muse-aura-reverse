package X;

import android.media.AudioManager;

/* renamed from: X.GVq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9633GVq implements Runnable {
    public static final String __redex_internal_original_name = "VolumeChangeAnnouncer$MyContentObserver$createOnVolumeChangeRunnable$1";
    public final /* synthetic */ C9632GVp A00;
    public final /* synthetic */ GVo A01;

    public RunnableC9633GVq(C9632GVp c9632GVp, GVo gVo) {
        this.A01 = gVo;
        this.A00 = c9632GVp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioManager audioManager = this.A01.A04;
        int i = audioManager.isBluetoothScoOn() ? 6 : 0;
        int streamVolume = audioManager.getStreamVolume(i);
        C9632GVp c9632GVp = this.A00;
        if (streamVolume != c9632GVp.A00) {
            c9632GVp.A00 = streamVolume;
            int streamMaxVolume = audioManager.getStreamMaxVolume(i);
            c9632GVp.A01.A00.A09.A8D("Volume level changed to %f", Float.valueOf(streamMaxVolume > 0 ? streamVolume / streamMaxVolume : -1.0f));
        }
    }
}

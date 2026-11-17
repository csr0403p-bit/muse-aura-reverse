package X;

import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class GX7 implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerBase$setAudioManagerMicrophoneMute$runnable$1";
    public final /* synthetic */ GX4 A00;
    public final /* synthetic */ boolean A01;

    public GX7(GX4 gx4, boolean z) {
        this.A00 = gx4;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GX4 gx4 = this.A00;
        AudioManager audioManager = gx4.A04;
        boolean zIsMicrophoneMute = audioManager.isMicrophoneMute();
        boolean z = this.A01;
        if (z != zIsMicrophoneMute) {
            try {
                audioManager.setMicrophoneMute(z);
            } catch (SecurityException e) {
                gx4.A09.AAr("RtcAudioOutputManagerBase", "Exception when calling AudioManager#setMicrophoneMute", e, BV4.A1W());
            }
        }
    }
}

package X;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class GX6 {
    public E88 A00;
    public final AudioManager.OnAudioFocusChangeListener A01;
    public final C5981DtO A02;
    public final C10538Hql A03;
    public final InterfaceC9648GXn A04;
    public final boolean A05;
    public final GY6 A06;

    public GX6(AudioManager audioManager, GY6 gy6, InterfaceC9648GXn interfaceC9648GXn, boolean z) {
        C7384Etj.A0Y(audioManager, 0);
        this.A06 = gy6;
        this.A04 = interfaceC9648GXn;
        this.A05 = z;
        this.A02 = new C5981DtO(audioManager);
        this.A03 = new C10538Hql(null);
        this.A01 = new GX8(this);
    }

    public final void A00() {
        E88 e88 = this.A00;
        if (e88 != null) {
            this.A04.A8D("releasing audio focus for call", BV4.A1W());
            this.A02.A00.abandonAudioFocusRequest((AudioFocusRequest) e88.A01);
        }
        this.A00 = null;
    }
}

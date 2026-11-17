package X;

import android.media.AudioTrack;

/* renamed from: X.EAc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6513EAc {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final EAt A05;

    public final void A00() {
        this.A00 = 0;
        this.A03 = 0L;
        this.A01 = -1L;
        this.A02 = BV8.A0G();
        this.A04 = 5000L;
    }

    public C6513EAc(AudioTrack audioTrack) {
        this.A05 = new EAt(audioTrack);
        A00();
    }
}

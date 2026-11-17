package X;

import android.media.MediaCodec;

/* renamed from: X.Dj9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5473Dj9 {
    public byte[] A00;
    public byte[] A01;
    public int[] A02;
    public int[] A03;
    public final MediaCodec.CryptoInfo A04;
    public final C5504Djg A05;

    public C5473Dj9() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A04 = cryptoInfo;
        this.A05 = new C5504Djg(cryptoInfo);
    }
}

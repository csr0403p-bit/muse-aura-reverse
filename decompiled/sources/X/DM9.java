package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class DM9 extends AbstractC3584CVf<DMA> {
    public final DMB A01;
    public boolean A00 = true;
    public final long[] A02 = new long[8];
    public final long[] A03 = new long[8];

    public static void A00(DMA dma, long[] jArr, int i) {
        dma.mobileBytesTx += jArr[i | 3];
        dma.mobileBytesRx += jArr[i | 2];
        dma.wifiBytesTx += jArr[i | 1];
        dma.wifiBytesRx += jArr[i];
    }

    public DM9(Context context) {
        this.A01 = new DMB(context);
    }
}

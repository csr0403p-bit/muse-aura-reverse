package X;

import android.media.MediaCodecInfo;
import android.util.Range;

/* renamed from: X.Be4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2572Be4 extends BWb implements InterfaceC2436BbP {
    public static final BpS<BdF, InterfaceC2436BbP> A01 = new F5L(9);
    public final MediaCodecInfo.VideoCapabilities A00;

    @Override // X.InterfaceC2436BbP
    public final boolean A5v() {
        return true;
    }

    @Override // X.InterfaceC2436BbP
    public final int AGE() {
        return this.A00.getHeightAlignment();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALK() {
        return this.A00.getBitrateRange();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALM() {
        return this.A00.getSupportedHeights();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALN(int i) {
        try {
            return this.A00.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALR() {
        return this.A00.getSupportedWidths();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALS(int i) {
        try {
            return this.A00.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // X.InterfaceC2436BbP
    public final int AMl() {
        return this.A00.getWidthAlignment();
    }

    @Override // X.InterfaceC2436BbP
    public final boolean AP3(int i, int i2) {
        return this.A00.isSizeSupported(i, i2);
    }

    public C2572Be4(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A01.getVideoCapabilities();
        videoCapabilities.getClass();
        this.A00 = videoCapabilities;
    }
}

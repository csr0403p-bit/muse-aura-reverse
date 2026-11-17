package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;

/* renamed from: X.FQf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8028FQf implements FP7 {
    public static final C8028FQf A00 = new C8028FQf();

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7610F5x.A0c(num);
    }

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        int iA0G = AbstractC7609F5w.A0G(num);
        return (iA0G == 12 || iA0G == 13) ? new FP8(FP5.A07, 1.0f) : FQY.A00.A5K(num);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        DspSpectrumRef dspSpectrumRef;
        int i;
        int i2;
        int iA0L = AnonymousClass003.A0L(fp5);
        if (iA0L == 106) {
            dspSpectrumRef = null;
            i = -14931149;
            i2 = -920329;
        } else {
            if (iA0L != 248) {
                return FQY.A00.A6Y(fp5);
            }
            dspSpectrumRef = null;
            i = -1;
            i2 = -14931149;
        }
        return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        return AbstractC7608F5v.A0M(num).A7P(num);
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        return AbstractC7610F5x.A05(num);
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        return AbstractC7608F5v.A0M(hi8).Aft(hi8);
    }

    @Override // X.FP7
    public final FPJ Ahb(Integer num) {
        return AbstractC7608F5v.A0M(num).Ahb(num);
    }
}

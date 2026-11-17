package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;

/* loaded from: classes6.dex */
public final class FQV implements FP7 {
    public static final FQV A00 = new FQV();

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7608F5v.A0N(num).A4K(num);
    }

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        return AbstractC7608F5v.A0N(num).A5K(num);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        DspSpectrumRef dspSpectrumRef;
        int i;
        int i2;
        int iA0L = AnonymousClass003.A0L(fp5);
        if (iA0L == 26) {
            dspSpectrumRef = null;
            i = 201326592;
            i2 = 268435455;
        } else if (iA0L != 248) {
            if (iA0L != 260) {
                return FQT.A00.A6Y(fp5);
            }
            dspSpectrumRef = null;
            i = 201326592;
            i2 = 268435455;
        } else {
            dspSpectrumRef = null;
            i = -197380;
            i2 = -16448251;
        }
        return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        if (AbstractC7609F5w.A0G(num) == 18) {
            return 12;
        }
        return FQO.A00.A7P(num);
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        return AbstractC7608F5v.A0N(num).Afi(num);
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        return AbstractC7608F5v.A0N(hi8).Aft(hi8);
    }

    @Override // X.FP7
    public final FPJ Ahb(Integer num) {
        FP6 fp6;
        FQM fqmA00;
        float f;
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 1:
            case 4:
            case 5:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.062832f);
                f = 15.0f;
                break;
            case 2:
            case 22:
            case 24:
            case 30:
            case 31:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(0.9377929f);
                f = 17.0f;
                break;
            case 6:
            case 28:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.1387485f);
                f = 14.0f;
                break;
            case 13:
            case 17:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(0.89676446f);
                f = 32.0f;
                break;
            case 26:
            case 33:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.2263446f);
                f = 13.0f;
                break;
            default:
                return FQT.A00.Ahb(num);
        }
        return new FPJ(fqmA00, fp6, f, 0.0f);
    }
}

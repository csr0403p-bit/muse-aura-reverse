package X;

import com.facebook.dsp.core.ColorData;

/* loaded from: classes6.dex */
public final class FQU implements FP7 {
    public static final FQU A00 = new FQU();

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
        return AnonymousClass003.A0L(fp5) == 22 ? new ColorData(null, null, -16751404, -11818498) : FQT.A00.A6Y(fp5);
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        return AbstractC7608F5v.A0N(num).A7P(num);
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
        int iA0G = AbstractC7609F5w.A0G(num);
        if (iA0G == 14) {
            fp6 = FP6.A08;
            fqmA00 = FQM.A00(0.9043928f);
            f = 24.0f;
        } else if (iA0G == 20 || iA0G == 21) {
            fp6 = FP6.A08;
            fqmA00 = FQM.A00(0.9161381f);
            f = 11.0f;
        } else if (iA0G != 30) {
            if (iA0G != 35) {
                return FQT.A00.Ahb(num);
            }
            fp6 = FP6.A08;
            fqmA00 = FQM.A00(0.9161381f);
            f = 11.0f;
        } else {
            fp6 = FP6.A08;
            fqmA00 = FQM.A00(1.003192f);
            f = 17.0f;
        }
        return new FPJ(fqmA00, fp6, f, 0.0f);
    }
}

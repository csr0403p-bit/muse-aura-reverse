package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.FQc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8026FQc implements FP7 {
    public static final C8026FQc A00 = new C8026FQc();

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7610F5x.A0c(num);
    }

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        return AbstractC7610F5x.A0d(num);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        return AnonymousClass003.A0L(fp5) == 167 ? new ColorData(null, null, -16250871, -854793) : FQN.A00.A6Y(fp5);
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        return AbstractC7610F5x.A0N(num);
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        return AbstractC7610F5x.A05(num);
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        return AbstractC7610F5x.A04(hi8);
    }

    @Override // X.FP7
    public final FPJ Ahb(Integer num) {
        FP6 fp6;
        FQM fqmA00;
        float f;
        float f2;
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 4:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.2857f);
                f = 14.0f;
                f2 = -0.15f;
                break;
            case 1:
            case 5:
            case 13:
            case 17:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.2857f);
                f = 14.0f;
                f2 = -0.154f;
                break;
            default:
                return FQN.A00.Ahb(num);
        }
        return new FPJ(fqmA00, fp6, f, f2);
    }
}

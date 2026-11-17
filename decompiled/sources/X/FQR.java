package X;

import com.facebook.dsp.core.ColorData;

/* loaded from: classes6.dex */
public final class FQR implements FP7 {
    public static final FQR A00 = new FQR();

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQQ.A00.A5K(num);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        C7384Etj.A0Y(fp5, 0);
        return FQQ.A00.A6Y(fp5);
    }

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7610F5x.A0c(num);
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
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 1:
            case 4:
            case 5:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0002f);
                f = 15.6f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 2:
            case 3:
            case 22:
            case 23:
            case 24:
            case 25:
            case 30:
            case 31:
            case 32:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 15.2f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 6:
            case 26:
            case 27:
            case 28:
            case 33:
            case 34:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 13.5f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 7:
            case 29:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 13.0f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 8:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 48.0f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 9:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(0.9485621f);
                f = 27.0f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 10:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(0.8892769f);
                f = 48.0f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 11:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(0.9024375f);
                f = 43.0f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 12:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(0.9358808f);
                f = 34.0f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 13:
            case 14:
            case 17:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 24.0f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 15:
            case 16:
            case 18:
            case 19:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 17.1f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            case 20:
            case 21:
            case 35:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 11.1f;
                return new FPJ(fqmA00, fp6, f, 0.0f);
            default:
                return FQQ.A00.Ahb(num);
        }
    }
}

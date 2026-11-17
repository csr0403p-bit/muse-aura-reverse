package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.FQe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8027FQe implements FP7 {
    public static final C8027FQe A00 = new C8027FQe();

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        C7384Etj.A0Y(fp5, 0);
        return FQS.A00.A6Y(fp5);
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQW.A00.A7P(num);
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQW.A00.Afi(num);
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        C7384Etj.A0Y(hi8, 0);
        return FQW.A00.Aft(hi8);
    }

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7608F5v.A0N(num).A4K(num);
    }

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        return AbstractC7608F5v.A0N(num).A5K(num);
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
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0002f);
                f = 15.6f;
                f2 = 0.09f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 1:
            case 5:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.3f);
                f = 15.6f;
                f2 = 0.09f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 2:
            case 22:
            case 24:
            case 25:
            case 31:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 15.2f;
                f2 = 0.3f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 3:
            case 23:
            case 32:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 15.2f;
                f2 = 0.3f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 6:
            case 26:
            case 27:
            case 28:
            case 33:
            case 34:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 13.5f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 7:
            case 29:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 13.0f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 8:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 48.0f;
                f2 = 0.9f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 30:
            default:
                return FQW.A00.Ahb(num);
            case 13:
            case 17:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 24.0f;
                f2 = 0.9f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 15:
            case 16:
            case 18:
            case 19:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 17.1f;
                f2 = 0.43f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 20:
            case 21:
            case 35:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 11.1f;
                f2 = 0.44f;
                return new FPJ(fqmA00, fp6, f, f2);
        }
    }
}

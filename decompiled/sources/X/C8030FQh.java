package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.FQh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8030FQh implements FP7 {
    public static final C8030FQh A00 = new C8030FQh();

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
        return AbstractC7610F5x.A0e(fp5);
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
            case 2:
            case 3:
            case 4:
            case 5:
            case 22:
            case 23:
            case 24:
            case 25:
            case 30:
            case 31:
            case 32:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.3333334f);
                f = 15.0f;
                break;
            case 6:
            case 7:
            case 26:
            case 27:
            case 28:
            case 29:
            case 33:
            case 34:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.3846154f);
                f = 13.0f;
                break;
            case 8:
            case 10:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.1458334f);
                f = 48.0f;
                break;
            case 9:
            default:
                return FQN.A00.Ahb(num);
            case 11:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.1627907f);
                f = 43.0f;
                break;
            case 12:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.2058823f);
                f = 34.0f;
                break;
            case 13:
            case 17:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.2916666f);
                f = 24.0f;
                break;
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.2941177f);
                f = 17.0f;
                break;
            case 20:
            case 21:
            case 35:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.3636364f);
                f = 11.0f;
                break;
        }
        return new FPJ(fqmA00, fp6, f, 0.0f);
    }
}

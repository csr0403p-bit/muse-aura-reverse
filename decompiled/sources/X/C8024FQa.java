package X;

import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;

/* renamed from: X.FQa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8024FQa implements FP7 {
    public static final C8024FQa A00 = new C8024FQa();

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
        int i;
        DspSpectrumRef dspSpectrumRef;
        int i2;
        switch (AnonymousClass003.A0L(fp5)) {
            case 8:
                dspSpectrumRef = null;
                i = -526861;
                i2 = -16117740;
                break;
            case 24:
                dspSpectrumRef = null;
                i = -16117740;
                i2 = -526086;
                break;
            case 26:
                dspSpectrumRef = null;
                i = -7498343;
                i2 = -9669254;
                break;
            case 106:
                dspSpectrumRef = null;
                i = -14931149;
                i2 = -920329;
                break;
            case 128:
                dspSpectrumRef = null;
                i = -1441736;
                i2 = -307103;
                break;
            case 145:
            case 242:
            case 298:
            case MC.mwa_time_spent_killswitch.__CONFIG__ /* 306 */:
                dspSpectrumRef = null;
                i = -15264234;
                i2 = -328966;
                break;
            case 152:
                dspSpectrumRef = null;
                i = -436207617;
                i2 = -452984832;
                break;
            case 212:
                dspSpectrumRef = null;
                i = -12954268;
                i2 = -14565277;
                break;
            case 218:
                dspSpectrumRef = null;
                i = -4998723;
                i2 = -12695731;
                break;
            case 233:
            case 234:
            case 262:
                dspSpectrumRef = null;
                i = -10787992;
                i2 = -7498343;
                break;
            case 244:
                dspSpectrumRef = null;
                i = -921877;
                i2 = -14408154;
                break;
            case 248:
                i = -1;
                dspSpectrumRef = null;
                i2 = -14931149;
                break;
            default:
                return FQY.A00.A6Y(fp5);
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
        int iA0L = AnonymousClass003.A0L(hi8);
        if (iA0L == 44) {
            return 0.0f;
        }
        if (iA0L != 66) {
            return FQY.A00.Aft(hi8);
        }
        return 4.0f;
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
                fqmA00 = FQM.A00(1.430143f);
                f = 14.0f;
                f2 = 0.25f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 1:
            case 30:
                fp6 = FP6.A0A;
                fqmA00 = FQM.A00(1.0001f);
                f = 14.0f;
                f2 = 0.25f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 2:
            case 22:
            case 24:
            case 31:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.50015f);
                f = 16.0f;
                f2 = 0.2f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 20:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 29:
            default:
                return FQY.A00.Ahb(num);
            case 5:
                fp6 = FP6.A0A;
                fqmA00 = FQM.A00(1.0001f);
                f = 14.0f;
                f2 = 0.25f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 6:
            case 28:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.33f);
                f = 12.0f;
                f2 = 0.2f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 13:
            case 17:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.27f);
                f = 22.0f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 15:
            case 16:
            case 18:
            case 19:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.5f);
                f = 16.0f;
                f2 = 0.2f;
                return new FPJ(fqmA00, fp6, f, f2);
        }
    }
}

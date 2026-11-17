package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.FQg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8029FQg implements FP7 {
    public static final C8029FQg A00 = new C8029FQg();

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQZ.A00.A5K(num);
    }

    @Override // X.FP7
    public final FPJ Ahb(Integer num) {
        C7384Etj.A0Y(num, 0);
        return FQZ.A00.Ahb(num);
    }

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7610F5x.A0c(num);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        return AnonymousClass003.A0L(fp5) == 157 ? new ColorData(null, null, -1, -1) : FQZ.A00.A6Y(fp5);
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        int iA0G = AbstractC7609F5w.A0G(num);
        if (iA0G != 18) {
            if (iA0G == 22) {
                return 12;
            }
            if (iA0G != 26) {
                return FQZ.A00.A7P(num);
            }
        }
        return 8;
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        return AbstractC7610F5x.A05(num);
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        int iA0L = AnonymousClass003.A0L(hi8);
        if (iA0L == 42) {
            return 52.0f;
        }
        if (iA0L == 54 || iA0L == 55) {
            return 6.0f;
        }
        return FQZ.A00.Aft(hi8);
    }
}

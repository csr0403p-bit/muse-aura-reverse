package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.FQi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8031FQi implements FP7 {
    public static final C8031FQi A00 = new C8031FQi();

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
        int iA0G = AbstractC7609F5w.A0G(num);
        if (iA0G != 13 && iA0G != 17) {
            return FQN.A00.Ahb(num);
        }
        return new FPJ(FQM.A00(1.0001f), FP6.A08, 24.0f, 0.9f);
    }
}

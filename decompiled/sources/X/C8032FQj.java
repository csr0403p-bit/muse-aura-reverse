package X;

import com.facebook.aura.maps.scene.HatchMapTheme;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;

/* renamed from: X.FQj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8032FQj implements FP7 {
    public static final C8032FQj A00 = new C8032FQj();

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
        DspSpectrumRef dspSpectrumRef;
        int i;
        int i2;
        int iA0L = AnonymousClass003.A0L(fp5);
        if (iA0L == 65) {
            dspSpectrumRef = null;
            i = -1;
            i2 = HatchMapTheme.DEFAULT_PIN_LABEL_COLOR;
        } else {
            if (iA0L == 209) {
                return new ColorData(null, null, 16777215, 16777215);
            }
            if (iA0L != 260) {
                return FQN.A00.A6Y(fp5);
            }
            dspSpectrumRef = null;
            i = -1;
            i2 = -14931149;
        }
        return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
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
        return AbstractC7610F5x.A0f(num);
    }
}

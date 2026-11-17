package X;

import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class FQT implements FP7 {
    public static final FQT A00 = new FQT();

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
        int i;
        DspSpectrumRef dspSpectrumRef;
        int i2;
        DspSpectrumRef dspSpectrumRef2;
        int i3;
        int i4;
        int i5;
        DspSpectrumRef dspSpectrumRef3;
        int i6;
        switch (AnonymousClass003.A0L(fp5)) {
            case 24:
                i2 = -10654597;
                dspSpectrumRef = null;
                i = -1579033;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i2, i);
            case 26:
                i2 = -2235672;
                dspSpectrumRef = null;
                i = Integer.MIN_VALUE;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i2, i);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                i5 = 16777215;
                i6 = 16777215;
                dspSpectrumRef3 = null;
                return new ColorData(dspSpectrumRef3, dspSpectrumRef3, i5, i6);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
                dspSpectrumRef2 = null;
                i3 = -16777216;
                i4 = -1;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i4);
            case 58:
                i2 = -1;
                dspSpectrumRef = null;
                i = -868730824;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i2, i);
            case 71:
                dspSpectrumRef2 = null;
                i3 = -1579033;
                i4 = 1811939327;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i4);
            case 145:
                return new ColorData(null, null, -16751404, -16751404);
            case 148:
            case 152:
            case 195:
                i2 = -1;
                i = -1;
                dspSpectrumRef = null;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i2, i);
            case 161:
                i5 = 1275068416;
                dspSpectrumRef3 = null;
                i6 = -1543503873;
                return new ColorData(dspSpectrumRef3, dspSpectrumRef3, i5, i6);
            case 196:
                dspSpectrumRef2 = null;
                i3 = 654311423;
                i4 = 637534208;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i4);
            case 234:
            case 262:
                i = -6904140;
                dspSpectrumRef = null;
                i2 = -10131348;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i2, i);
            case 248:
                dspSpectrumRef2 = null;
                i3 = -789259;
                i4 = -15066598;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i4);
            case 260:
                dspSpectrumRef2 = null;
                i3 = -1;
                i4 = 268435455;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i4);
            case MC.mwa_time_spent_killswitch.__CONFIG__ /* 306 */:
                i = -1;
                dspSpectrumRef = null;
                i2 = -16751404;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i2, i);
            default:
                return FQO.A00.A6Y(fp5);
        }
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
        switch (AbstractC7609F5w.A0G(num)) {
            case 2:
            case 22:
            case 24:
            case 31:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.2941f);
                f = 17.0f;
                break;
            case 13:
            case 17:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 30.0f;
                break;
            default:
                return FQO.A00.Ahb(num);
        }
        return new FPJ(fqmA00, fp6, f, 0.9f);
    }
}

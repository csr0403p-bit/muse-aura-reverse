package X;

import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ei9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7197Ei9 extends AbstractC7191Ei2 {
    public static C7197Ei9 A0P;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final ColorFilter A05;
    public final PointF A06;
    public final PointF A07;
    public final Drawable A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final InterfaceC8647Fhz A0C;
    public final InterfaceC8647Fhz A0D;
    public final InterfaceC8647Fhz A0E;
    public final InterfaceC7136Egs A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    static {
        C7196Ei8 c7196Ei8 = new C7196Ei8();
        InterfaceC8647Fhz interfaceC8647Fhz = InterfaceC8647Fhz.A02;
        c7196Ei8.A0D = interfaceC8647Fhz;
        c7196Ei8.A0E = interfaceC8647Fhz;
        c7196Ei8.A0C = interfaceC8647Fhz;
        ((C7249EjT) c7196Ei8).A00 = EnumC7203EiK.A02;
        A0P = new C7197Ei9(c7196Ei8);
    }

    public static final C7196Ei8 A00() {
        return new C7196Ei8(A0P);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                C7197Ei9 c7197Ei9 = (C7197Ei9) obj;
                if (C7384Etj.areEqual(this.A0H, c7197Ei9.A0H) && this.A03 == c7197Ei9.A03 && AbstractC7213Eib.A00(this.A0A, c7197Ei9.A0A) && AbstractC7213Eib.A00(this.A0D, c7197Ei9.A0D) && AbstractC7213Eib.A00(this.A07, c7197Ei9.A07) && this.A0O == c7197Ei9.A0O && C7384Etj.areEqual(this.A0G, c7197Ei9.A0G) && this.A00 == c7197Ei9.A00 && AbstractC7213Eib.A00(this.A0C, c7197Ei9.A0C) && AbstractC7213Eib.A00(this.A06, c7197Ei9.A06) && this.A0M == c7197Ei9.A0M && this.A02 == c7197Ei9.A02 && AbstractC7213Eib.A00(this.A09, c7197Ei9.A09)) {
                    Drawable drawable = this.A08;
                    Drawable drawable2 = c7197Ei9.A08;
                    if (!AbstractC7213Eib.A00(drawable, drawable2) || this.A04 != c7197Ei9.A04 || this.A0B != c7197Ei9.A0B || this.A0E != c7197Ei9.A0E || this.A0N != c7197Ei9.A0N || !AbstractC7213Eib.A00(this.A05, c7197Ei9.A05) || this.A0L != c7197Ei9.A0L || this.A01 != c7197Ei9.A01 || this.A0I != c7197Ei9.A0I || this.A0J != c7197Ei9.A0J || !AbstractC7213Eib.A00(this.A0F, c7197Ei9.A0F) || drawable != drawable2 || !AbstractC7213Eib.A00(super.A06, ((AbstractC7191Ei2) c7197Ei9).A06) || !AbstractC7213Eib.A00(super.A08, ((AbstractC7191Ei2) c7197Ei9).A08) || !AbstractC7213Eib.A00(super.A07, ((AbstractC7191Ei2) c7197Ei9).A07) || !AbstractC7213Eib.A00(super.A05, ((AbstractC7191Ei2) c7197Ei9).A05) || !AbstractC7213Eib.A00(super.A04, ((AbstractC7191Ei2) c7197Ei9).A04) || !AbstractC7213Eib.A00(((AbstractC7191Ei2) this).A02, ((AbstractC7191Ei2) c7197Ei9).A02) || super.A0A != ((AbstractC7191Ei2) c7197Ei9).A0A || super.A0E != ((AbstractC7191Ei2) c7197Ei9).A0E || !AbstractC7213Eib.A00(((AbstractC7191Ei2) this).A01, ((AbstractC7191Ei2) c7197Ei9).A01) || !AbstractC7213Eib.A00(((AbstractC7191Ei2) this).A00, ((AbstractC7191Ei2) c7197Ei9).A00) || super.A0D != ((AbstractC7191Ei2) c7197Ei9).A0D || super.A0C != ((AbstractC7191Ei2) c7197Ei9).A0C || !C7384Etj.areEqual(super.A09, ((AbstractC7191Ei2) c7197Ei9).A09) || !AbstractC7213Eib.A00(super.A03, ((AbstractC7191Ei2) c7197Ei9).A03) || super.A0B != ((AbstractC7191Ei2) c7197Ei9).A0B || !AbstractC7213Eib.A00(((AbstractC7202EiH) this).A00, ((AbstractC7202EiH) c7197Ei9).A00) || !AbstractC7213Eib.A00(((AbstractC7202EiH) this).A01, ((AbstractC7202EiH) c7197Ei9).A01) || !AbstractC7213Eib.A00(((AbstractC7202EiH) this).A02, ((AbstractC7202EiH) c7197Ei9).A02)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C7197Ei9(C7196Ei8 c7196Ei8) {
        super(c7196Ei8);
        this.A0H = c7196Ei8.A0H;
        this.A03 = c7196Ei8.A03;
        this.A0A = c7196Ei8.A0A;
        this.A0D = c7196Ei8.A0D;
        this.A07 = c7196Ei8.A07;
        this.A0O = c7196Ei8.A0M;
        this.A04 = c7196Ei8.A04;
        this.A0B = c7196Ei8.A0B;
        this.A0E = c7196Ei8.A0E;
        this.A0N = c7196Ei8.A0L;
        this.A0G = c7196Ei8.A0G;
        this.A00 = c7196Ei8.A00;
        this.A0C = c7196Ei8.A0C;
        this.A06 = c7196Ei8.A06;
        this.A08 = c7196Ei8.A08;
        this.A0M = c7196Ei8.A0K;
        this.A05 = c7196Ei8.A05;
        this.A02 = c7196Ei8.A02;
        this.A09 = c7196Ei8.A09;
        this.A0L = c7196Ei8.A0O;
        this.A01 = c7196Ei8.A01;
        this.A0I = c7196Ei8.A0I;
        this.A0K = c7196Ei8.A0N;
        this.A0J = c7196Ei8.A0J;
        this.A0F = c7196Ei8.A0F;
    }

    @Override // X.AbstractC7191Ei2, X.AbstractC7202EiH
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.A0H;
        int iIntValue = (((((((((((iHashCode + (num != null ? num.intValue() : 0)) * 31) + this.A03) * 31) + C60R.A01(this.A0A)) * 31) + C60R.A01(this.A0D)) * 31) + C60R.A01(this.A07)) * 31) + (this.A0O ? 1 : 0)) * 31;
        Integer num2 = this.A0G;
        int iIntValue2 = (((((((((((((((((((((((((((((((((iIntValue + (num2 != null ? num2.intValue() : 0)) * 31) + this.A00) * 31) + C60R.A01(this.A0C)) * 31) + C60R.A01(this.A06)) * 31) + C60R.A01(this.A08)) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A02) * 31) + C60R.A01(this.A09)) * 31 * 31) + C60R.A01(this.A0B)) * 31) + C60R.A01(this.A0E)) * 31) + (this.A0N ? 1 : 0)) * 31) + C60R.A01(this.A05)) * 31) + (this.A0L ? 1 : 0)) * 31) + this.A01) * 31) + (this.A0I ? 1 : 0)) * 31) + (this.A0J ? 1 : 0)) * 31 * 31) + this.A04) * 31;
        InterfaceC7136Egs interfaceC7136Egs = this.A0F;
        return iIntValue2 + (interfaceC7136Egs != null ? interfaceC7136Egs.hashCode() : 0);
    }

    public final String toString() {
        C7200EiD c7200EiD = new C7200EiD(C3cI.A0Y(this));
        C7200EiD.A00(c7200EiD, ((AbstractC7202EiH) this).A00, "priority");
        C7200EiD.A00(c7200EiD, ((AbstractC7202EiH) this).A01, "cacheChoice");
        C7200EiD.A00(c7200EiD, ((AbstractC7202EiH) this).A02, "diskCacheId");
        C7200EiD.A00(c7200EiD, super.A06, "resizeOptions");
        C7200EiD.A00(c7200EiD, super.A08, "downsampleOverride");
        C7200EiD.A00(c7200EiD, super.A07, "rotationOptions");
        C7200EiD.A00(c7200EiD, null, "postprocessor");
        C7200EiD.A00(c7200EiD, null, "intermediateImageBitmapTransformation");
        C7200EiD.A00(c7200EiD, super.A05, "imageDecodeOptions");
        C7200EiD.A00(c7200EiD, super.A04, "roundingOptions");
        C7200EiD.A00(c7200EiD, ((AbstractC7191Ei2) this).A02, "animatedOptions");
        c7200EiD.A02("enableSingleFrameRendering", super.A0A);
        c7200EiD.A02("shouldRoundUpFractionalFrameBudget", super.A0E);
        C7200EiD.A00(c7200EiD, null, "borderOptions");
        C7200EiD.A00(c7200EiD, ((AbstractC7191Ei2) this).A01, "actualImageScaleType");
        C7200EiD.A00(c7200EiD, ((AbstractC7191Ei2) this).A00, "actualImageFocusPoint");
        c7200EiD.A02("localThumbnailPreviewsEnabled", super.A0D);
        c7200EiD.A02("loadThumbnailOnly", super.A0C);
        C7200EiD.A00(c7200EiD, super.A03, "bitmapConfig");
        C7200EiD.A00(c7200EiD, super.A09, "progressiveRenderingEnabled");
        c7200EiD.A02("isFirstFrameThumbnailEnabled", super.A0B);
        C7200EiD.A00(c7200EiD, this.A0H, "placeholderColor");
        C7200EiD.A01(c7200EiD, "placeholderRes", this.A03);
        C7200EiD.A00(c7200EiD, this.A0A, "placeholderDrawable");
        C7200EiD.A00(c7200EiD, this.A0D, "placeholderScaleType");
        C7200EiD.A00(c7200EiD, this.A07, "placeholderFocusPoint");
        c7200EiD.A02("placeholderApplyRoundingOptions", this.A0O);
        C7200EiD.A01(c7200EiD, "progressRes", this.A04);
        C7200EiD.A00(c7200EiD, this.A0B, "progressDrawable");
        C7200EiD.A00(c7200EiD, this.A0E, "progressScaleType");
        c7200EiD.A02("keepProgressIndicatorDuringIntermediateImages", this.A0N);
        C7200EiD.A00(c7200EiD, this.A0G, "errorColor");
        C7200EiD.A01(c7200EiD, "errorRes", this.A00);
        C7200EiD.A00(c7200EiD, this.A0C, "errorScaleType");
        C7200EiD.A00(c7200EiD, this.A06, "errorFocusPoint");
        C7200EiD.A00(c7200EiD, this.A08, "errorDrawable");
        c7200EiD.A02("errorApplyRoundingOptions", this.A0M);
        C7200EiD.A00(c7200EiD, this.A05, "actualImageColorFilter");
        C7200EiD.A01(c7200EiD, "overlayRes", this.A02);
        C7200EiD.A00(c7200EiD, this.A09, "overlayDrawable");
        C7200EiD.A00(c7200EiD, null, "backgroundDrawable");
        c7200EiD.A02("resizeToViewport", this.A0L);
        c7200EiD.A02("autoPlay", this.A0I);
        c7200EiD.A02("autoStop", this.A0J);
        c7200EiD.A02("mPerfMediaRemountInstrumentationFix", false);
        C7200EiD.A01(c7200EiD, "fadeDurationMs", this.A01);
        C7200EiD.A00(c7200EiD, this.A0F, "customDrawableFactory");
        return BV8.A0v(c7200EiD, C60O.A0x("ImageOptions{"));
    }
}

package X;

import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.dsp.core.ColorData;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;

/* loaded from: classes6.dex */
public final class FOY {
    public HiG A00;
    public HiG A01;
    public CdsOpenScreenCallerDismissCallback A02;
    public G0U<?, Boolean> A03;
    public boolean A04;
    public boolean A05;
    public final CcvBloksHelperKt.AnonymousClass5 A06;
    public final ColorData A07;
    public final ColorData A08;
    public final ColorData A09;
    public final ColorData A0A;
    public final EnumC7953FMj A0B;
    public final CdsBottomSheetDimmingBehaviour A0C;
    public final CdsBottomSheetTopSpan A0D;
    public final EnumC7951FMh A0E;
    public final CdsOpenScreenConfig$BottomSheetMargins A0F;
    public final EnumC7952FMi A0G;
    public final EnumC7950FMg A0H;
    public final EnumC7949FMf A0I;
    public final FPN A0J;
    public final EnumC7946FMb A0K;
    public final Boolean A0L;
    public final Float A0M;
    public final Float A0N;
    public final Float A0O;
    public final Integer A0P;
    public final String A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public FOY() {
        C7986FOd c7986FOd = new C7986FOd(null, false, false);
        Integer num = C79.A0C;
        EnumC7949FMf enumC7949FMf = EnumC7949FMf.A03;
        EnumC7951FMh enumC7951FMh = EnumC7951FMh.A06;
        EnumC7950FMg enumC7950FMg = EnumC7950FMg.A03;
        HiG hiG = HiG.A02;
        EnumC7952FMi enumC7952FMi = EnumC7952FMi.A03;
        this(hiG, hiG, null, null, null, null, null, EnumC7953FMj.A02, CdsBottomSheetDimmingBehaviour.Default.A00, null, null, enumC7951FMh, null, enumC7952FMi, enumC7950FMg, enumC7949FMf, c7986FOd, EnumC7946FMb.A03, null, null, null, null, num, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public final FOY A01(C7999FOs c7999FOs) {
        FOY foyA00 = this;
        ColorData colorData = c7999FOs.A01;
        if (colorData != null) {
            foyA00 = A00(null, colorData, null, null, foyA00, null, null, -67108865, false);
        }
        ColorData colorData2 = c7999FOs.A00;
        return colorData2 != null ? A00(colorData2, null, null, null, foyA00, null, null, -513, false) : foyA00;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FOY) {
                FOY foy = (FOY) obj;
                if (!this.A0J.equals(foy.A0J) || this.A0P != foy.A0P || this.A0I != foy.A0I || this.A0E != foy.A0E || this.A0H != foy.A0H || this.A00 != foy.A00 || this.A01 != foy.A01 || this.A0Z != foy.A0Z || this.A0R != foy.A0R || !C7384Etj.areEqual(this.A08, foy.A08) || !C7384Etj.areEqual(this.A07, foy.A07) || !C7384Etj.areEqual(this.A0F, foy.A0F) || this.A0G != foy.A0G || !C7384Etj.areEqual(this.A0M, foy.A0M) || !C7384Etj.areEqual(this.A02, foy.A02) || !C7384Etj.areEqual(this.A06, foy.A06) || this.A0W != foy.A0W || this.A0T != foy.A0T || !C7384Etj.areEqual(this.A0Q, foy.A0Q) || !C7384Etj.areEqual(this.A0D, foy.A0D) || this.A0b != foy.A0b || this.A0Y != foy.A0Y || this.A0S != foy.A0S || this.A0X != foy.A0X || !this.A0C.equals(foy.A0C) || this.A0K != foy.A0K || !C7384Etj.areEqual(this.A0A, foy.A0A) || this.A0U != foy.A0U || !C7384Etj.areEqual(this.A09, foy.A09) || !C7384Etj.areEqual(this.A0O, foy.A0O) || !C7384Etj.areEqual(this.A0N, foy.A0N) || !C7384Etj.areEqual(this.A0L, foy.A0L) || this.A0a != foy.A0a || this.A0B != foy.A0B || !C7384Etj.areEqual(this.A03, foy.A03) || this.A05 != foy.A05 || this.A04 != foy.A04 || this.A0V != foy.A0V) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FOY A00(ColorData colorData, ColorData colorData2, EnumC7950FMg enumC7950FMg, EnumC7949FMf enumC7949FMf, FOY foy, FPN fpn, EnumC7946FMb enumC7946FMb, int i, boolean z) {
        EnumC7950FMg enumC7950FMg2 = enumC7950FMg;
        EnumC7949FMf enumC7949FMf2 = enumC7949FMf;
        FPN fpn2 = fpn;
        boolean z2 = z;
        EnumC7946FMb enumC7946FMb2 = enumC7946FMb;
        ColorData colorData3 = colorData2;
        if ((i & 1) != 0) {
            fpn2 = foy.A0J;
        }
        Integer num = foy.A0P;
        if ((i & 4) != 0) {
            enumC7949FMf2 = foy.A0I;
        }
        EnumC7951FMh enumC7951FMh = foy.A0E;
        if ((i & 16) != 0) {
            enumC7950FMg2 = foy.A0H;
        }
        HiG hiG = foy.A00;
        HiG hiG2 = foy.A01;
        boolean z3 = foy.A0Z;
        boolean z4 = foy.A0R;
        if ((i & 512) != 0) {
            colorData = foy.A08;
        }
        ColorData colorData4 = foy.A07;
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = foy.A0F;
        EnumC7952FMi enumC7952FMi = foy.A0G;
        Float f = foy.A0M;
        CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = foy.A02;
        CcvBloksHelperKt.AnonymousClass5 anonymousClass5 = foy.A06;
        boolean z5 = foy.A0W;
        boolean z6 = foy.A0T;
        String str = foy.A0Q;
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = foy.A0D;
        boolean z7 = foy.A0b;
        boolean z8 = foy.A0Y;
        boolean z9 = foy.A0S;
        boolean z10 = foy.A0X;
        CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour = foy.A0C;
        if ((i & 33554432) != 0) {
            enumC7946FMb2 = foy.A0K;
        }
        if ((i & 67108864) != 0) {
            colorData3 = foy.A0A;
        }
        if ((i & 134217728) != 0) {
            z2 = foy.A0U;
        }
        ColorData colorData5 = foy.A09;
        Float f2 = foy.A0O;
        Float f3 = foy.A0N;
        Boolean bool = foy.A0L;
        boolean z11 = foy.A0a;
        EnumC7953FMj enumC7953FMj = foy.A0B;
        G0U<?, Boolean> g0u = foy.A03;
        boolean z12 = foy.A05;
        boolean z13 = foy.A04;
        boolean z14 = foy.A0V;
        AnonymousClass003.A0v(fpn2, enumC7949FMf2);
        C7384Etj.A0Y(enumC7950FMg2, 4);
        C7384Etj.A0Y(enumC7946FMb2, 25);
        return new FOY(hiG, hiG2, anonymousClass5, colorData, colorData4, colorData3, colorData5, enumC7953FMj, cdsBottomSheetDimmingBehaviour, cdsBottomSheetTopSpan, cdsOpenScreenCallerDismissCallback, enumC7951FMh, cdsOpenScreenConfig$BottomSheetMargins, enumC7952FMi, enumC7950FMg2, enumC7949FMf2, fpn2, enumC7946FMb2, bool, f, f2, f3, num, str, g0u, z3, z4, z5, z6, z7, z8, z9, z10, z2, z11, z12, z13, z14);
    }

    public final boolean A02() {
        EnumC7949FMf enumC7949FMf = this.A0I;
        if (enumC7949FMf != EnumC7949FMf.A03) {
            return enumC7949FMf == EnumC7949FMf.A04;
        }
        FPN fpn = this.A0J;
        if (fpn instanceof FPC) {
            return ((FPC) fpn).ACc();
        }
        return false;
    }

    public final int hashCode() {
        int iA0E = AnonymousClass005.A0E(this.A0J);
        Integer num = this.A0P;
        return C0KA.A00(C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.A0B, C0KA.A01((((((((C0KA.A01((AnonymousClass005.A0F(this.A0K, AnonymousClass005.A0F(this.A0C, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((((C0KA.A01(C0KA.A01((((((AnonymousClass005.A0F(this.A0G, (((((C0KA.A01(C0KA.A01((((AnonymousClass005.A0F(this.A0H, AnonymousClass005.A0F(this.A0E, AnonymousClass005.A0F(this.A0I, (iA0E + BV5.A03(num, FPI.A00(num))) * 31))) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A01)) * 31, this.A0Z), this.A0R) + AnonymousClass006.A0D(this.A08)) * 31) + AnonymousClass006.A0D(this.A07)) * 31) + AnonymousClass006.A0D(this.A0F)) * 31) + AnonymousClass006.A0D(this.A0M)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A06)) * 31, this.A0W), this.A0T) + AnonymousClass006.A0G(this.A0Q)) * 31) + AnonymousClass006.A0D(this.A0D)) * 31, this.A0b), this.A0Y), this.A0S), this.A0X))) + AnonymousClass006.A0D(this.A0A)) * 31, this.A0U) + AnonymousClass006.A0D(this.A09)) * 31) + AnonymousClass006.A0D(this.A0O)) * 31) + AnonymousClass006.A0D(this.A0N)) * 31) + AnonymousClass006.A0D(this.A0L)) * 31, this.A0a)) + C3cH.A02(this.A03)) * 31, this.A05), this.A04), this.A0V);
    }

    public final String toString() {
        FPN fpn = this.A0J;
        Integer num = this.A0P;
        EnumC7949FMf enumC7949FMf = this.A0I;
        EnumC7951FMh enumC7951FMh = this.A0E;
        EnumC7950FMg enumC7950FMg = this.A0H;
        HiG hiG = this.A00;
        HiG hiG2 = this.A01;
        boolean z = this.A0Z;
        boolean z2 = this.A0R;
        ColorData colorData = this.A08;
        ColorData colorData2 = this.A07;
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = this.A0F;
        EnumC7952FMi enumC7952FMi = this.A0G;
        Float f = this.A0M;
        CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = this.A02;
        CcvBloksHelperKt.AnonymousClass5 anonymousClass5 = this.A06;
        boolean z3 = this.A0W;
        boolean z4 = this.A0T;
        String str = this.A0Q;
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = this.A0D;
        boolean z5 = this.A0b;
        boolean z6 = this.A0Y;
        boolean z7 = this.A0S;
        boolean z8 = this.A0X;
        CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour = this.A0C;
        EnumC7946FMb enumC7946FMb = this.A0K;
        ColorData colorData3 = this.A0A;
        boolean z9 = this.A0U;
        ColorData colorData4 = this.A09;
        Float f2 = this.A0O;
        Float f3 = this.A0N;
        Boolean bool = this.A0L;
        boolean z10 = this.A0a;
        EnumC7953FMj enumC7953FMj = this.A0B;
        G0U<?, Boolean> g0u = this.A03;
        boolean z11 = this.A05;
        boolean z12 = this.A04;
        boolean z13 = this.A0V;
        StringBuilder sbA0f = C3cG.A0f(fpn, "FoaBottomSheetConfig(layoutConfig=");
        sbA0f.append(", darkModeConfig=");
        sbA0f.append(FPI.A00(num));
        sbA0f.append(", dragToDismiss=");
        sbA0f.append(enumC7949FMf);
        sbA0f.append(", backgroundMode=");
        sbA0f.append(enumC7951FMh);
        sbA0f.append(", dimmedBackgroundTapToDismiss=");
        sbA0f.append(enumC7950FMg);
        sbA0f.append(", animationType=");
        sbA0f.append(hiG);
        sbA0f.append(", dismissAnimationType=");
        sbA0f.append(hiG2);
        sbA0f.append(", shouldClearTopActivity=");
        sbA0f.append(z);
        sbA0f.append(", activityClearTask=");
        sbA0f.append(z2);
        sbA0f.append(", dimmedBackgroundColor=");
        sbA0f.append(colorData);
        sbA0f.append(", backgroundOverlayColor=");
        sbA0f.append(colorData2);
        sbA0f.append(", bottomSheetMargins=");
        sbA0f.append(cdsOpenScreenConfig$BottomSheetMargins);
        sbA0f.append(", cornerStyle=");
        sbA0f.append(enumC7952FMi);
        sbA0f.append(", cornerRadius=");
        sbA0f.append(f);
        sbA0f.append(", onDismissCallback=");
        sbA0f.append(cdsOpenScreenCallerDismissCallback);
        sbA0f.append(", nativeCustomLoadingViewResolver=");
        sbA0f.append(anonymousClass5);
        sbA0f.append(", nativeUseSlideAnimationForFullScreenOpen=");
        sbA0f.append(z3);
        sbA0f.append(", disableLoadingScreenCancelButton=");
        sbA0f.append(z4);
        sbA0f.append(", bloksScreenId=");
        sbA0f.append(str);
        sbA0f.append(", bottomSheetTopSpan=");
        sbA0f.append(cdsBottomSheetTopSpan);
        sbA0f.append(", slideToAnchorImmediately=");
        sbA0f.append(z5);
        sbA0f.append(", renderBehindNavbar=");
        sbA0f.append(z6);
        sbA0f.append(", disableFadeOutGradientBackground=");
        sbA0f.append(z7);
        sbA0f.append(", removeGradientBackground=");
        sbA0f.append(z8);
        sbA0f.append(", dimmingBehaviour=");
        sbA0f.append(cdsBottomSheetDimmingBehaviour);
        sbA0f.append(", keyboardMode=");
        sbA0f.append(enumC7946FMb);
        sbA0f.append(", solidBackgroundColor=");
        sbA0f.append(colorData3);
        sbA0f.append(", enableEdgeToEdge=");
        sbA0f.append(z9);
        sbA0f.append(", dragHandleColor=");
        sbA0f.append(colorData4);
        sbA0f.append(", dragHandleTopBoundOffsetPx=");
        sbA0f.append(f2);
        sbA0f.append(", dismissFriction=");
        sbA0f.append(f3);
        sbA0f.append(", dragHandleHidden=");
        sbA0f.append(bool);
        sbA0f.append(", skipExitAnimation=");
        sbA0f.append(z10);
        sbA0f.append(", bottomSheetTopMargin=");
        sbA0f.append(enumC7953FMj);
        sbA0f.append(", onBackPressed=");
        sbA0f.append(g0u);
        sbA0f.append(", hideStatusBarBackground=");
        sbA0f.append(z11);
        sbA0f.append(", drawUnderStatusBar=");
        sbA0f.append(z12);
        return C8j5.A0W(", keepsHostOrientation=", sbA0f, z13);
    }

    public FOY(HiG hiG, HiG hiG2, CcvBloksHelperKt.AnonymousClass5 anonymousClass5, ColorData colorData, ColorData colorData2, ColorData colorData3, ColorData colorData4, EnumC7953FMj enumC7953FMj, CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour, CdsBottomSheetTopSpan cdsBottomSheetTopSpan, CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback, EnumC7951FMh enumC7951FMh, CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins, EnumC7952FMi enumC7952FMi, EnumC7950FMg enumC7950FMg, EnumC7949FMf enumC7949FMf, FPN fpn, EnumC7946FMb enumC7946FMb, Boolean bool, Float f, Float f2, Float f3, Integer num, String str, G0U g0u, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        C7384Etj.A0Y(fpn, 0);
        this.A0J = fpn;
        this.A0P = num;
        this.A0I = enumC7949FMf;
        this.A0E = enumC7951FMh;
        this.A0H = enumC7950FMg;
        this.A00 = hiG;
        this.A01 = hiG2;
        this.A0Z = z;
        this.A0R = z2;
        this.A08 = colorData;
        this.A07 = colorData2;
        this.A0F = cdsOpenScreenConfig$BottomSheetMargins;
        this.A0G = enumC7952FMi;
        this.A0M = f;
        this.A02 = cdsOpenScreenCallerDismissCallback;
        this.A06 = anonymousClass5;
        this.A0W = z3;
        this.A0T = z4;
        this.A0Q = str;
        this.A0D = cdsBottomSheetTopSpan;
        this.A0b = z5;
        this.A0Y = z6;
        this.A0S = z7;
        this.A0X = z8;
        this.A0C = cdsBottomSheetDimmingBehaviour;
        this.A0K = enumC7946FMb;
        this.A0A = colorData3;
        this.A0U = z9;
        this.A09 = colorData4;
        this.A0O = f2;
        this.A0N = f3;
        this.A0L = bool;
        this.A0a = z10;
        this.A0B = enumC7953FMj;
        this.A03 = g0u;
        this.A05 = z11;
        this.A04 = z12;
        this.A0V = z13;
    }
}

package com.facebook.aura.header.view;

import X.ATD;
import X.AXN;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AaC;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BFM;
import X.BNH;
import X.BRg;
import X.C10G;
import X.C1DG;
import X.C1OP;
import X.C1OQ;
import X.C2VU;
import X.C3TG;
import X.C3UC;
import X.C7384Etj;
import X.EnumC1820Arj;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.ui.adaptive.AuraAvatarPanelShape;
import com.facebook.aura.ui.adaptive.AuraAvatarPanelShapeKt;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchExpandedAvatarPanelKt {
    public static final float ExpandedPanelContentGap = 27.0f;
    public static final float ExpandedPanelControlsZIndex = 1.0f;
    public static final float ExpandedPanelCornerRadius = 36.0f;
    public static final float ExpandedPanelMediaTopOffset = 36.0f;
    public static final float ExpandedPanelShadowElevation = 16.0f;

    /* renamed from: com.facebook.aura.header.view.HatchExpandedAvatarPanelKt$HatchExpandedAvatarPanelSurface$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $panelBottomPx;
        public final /* synthetic */ Function0<Float> $progress;
        public final /* synthetic */ InterfaceC05151eP $this_HatchExpandedAvatarPanelSurface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC05151eP interfaceC05151eP, Function0<Float> function0, Function0<Float> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$this_HatchExpandedAvatarPanelSurface = interfaceC05151eP;
            this.$panelBottomPx = function0;
            this.$progress = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchExpandedAvatarPanelKt.HatchExpandedAvatarPanelSurface(this.$this_HatchExpandedAvatarPanelSurface, this.$panelBottomPx, this.$progress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchExpandedAvatarPanelKt$heightFrom$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ Function0<Float> $heightPx;

        /* renamed from: com.facebook.aura.header.view.HatchExpandedAvatarPanelKt$heightFrom$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01831 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                ayu.A0A(this.$placeable, 0.0f, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01831(AZE aze) {
                super(1);
                this.$placeable = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Float> function0) {
            super(3);
            this.$heightPx = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m990invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m990invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
            int iA04 = ATD.A04(Ab3.A01(AnonymousClass003.A04(this.$heightPx)), zA1b ? 1 : 0, Constraints.A00(j));
            AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), Constraints.A01(j), iA04, iA04));
            return AnonymousClass002.A0X(axy, new C01831(azeAQW), azeAQW.A01, iA04);
        }
    }

    public static final float hatchExpandedAvatarPanelHeight(BFM bfm, int i) {
        return squarePanelSide(bfm, 0);
    }

    public static final float hatchExpandedAvatarSize(BFM bfm, int i) {
        float fSafeLayoutWidth;
        int iOrdinal = AuraAvatarPanelShapeKt.auraAvatarPanelShape(bfm, 0).ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(-941038788);
            fSafeLayoutWidth = safeLayoutWidth(bfm, 0);
        } else {
            if (iOrdinal != 1) {
                throw AnonymousClass005.A0k(bfm, -941040959);
            }
            bfm.AgE(-941037028);
            fSafeLayoutWidth = squarePanelSide(bfm, 0);
        }
        AnonymousClass001.A1D(bfm);
        return fSafeLayoutWidth;
    }

    public static final float squarePanelSide(BFM bfm, int i) {
        C1DG c1dg = new C1DG(fullWidthPanelHeight(bfm, 0));
        C1DG c1dg2 = new C1DG(safeLayoutWidth(bfm, 0));
        if (c1dg.compareTo(c1dg2) <= 0) {
            c1dg2 = c1dg;
        }
        return c1dg2.A00;
    }

    public static final float stretchedPanelBottom(float f, float f2, AvatarFullScreen avatarFullScreen) {
        AaC destination;
        return (f2 == 0.0f || avatarFullScreen == null || (destination = avatarFullScreen.getDestination()) == null) ? f : f + ((destination.A00 - f) * f2);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraAvatarPanelShape.values().length];
            try {
                AnonymousClass002.A13(AuraAvatarPanelShape.FullWidth, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraAvatarPanelShape.Square, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchExpandedAvatarPanelSurface(X.InterfaceC05151eP r20, kotlin.jvm.functions.Function0<java.lang.Float> r21, kotlin.jvm.functions.Function0<java.lang.Float> r22, X.BRg r23, X.BFM r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchExpandedAvatarPanelKt.HatchExpandedAvatarPanelSurface(X.1eP, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final float getExpandedPanelContentGap() {
        return ExpandedPanelContentGap;
    }

    public static final float getExpandedPanelCornerRadius() {
        return ExpandedPanelCornerRadius;
    }

    public static final float getExpandedPanelMediaTopOffset() {
        return ExpandedPanelMediaTopOffset;
    }

    /* renamed from: hatchExpandedAvatarPanelInset-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ BRg m988hatchExpandedAvatarPanelInsetziNgDLE$default(BRg bRg, float f, HatchForegroundHeaderState hatchForegroundHeaderState, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchForegroundHeaderState = null;
        }
        return m987hatchExpandedAvatarPanelInsetziNgDLE(bRg, f, hatchForegroundHeaderState, function0);
    }

    public static final BRg heightFrom(BRg bRg, Function0<Float> function0) {
        return C3UC.A00(bRg, new AnonymousClass1(function0));
    }

    public static final BRg expandedAvatarPanelWidth(BRg bRg, BFM bfm, int i) {
        BRg bRgA0R = AnonymousClass001.A0R(BNH.A00(new C1OQ(C1OP.A00(bfm), 15), bRg));
        int iOrdinal = AuraAvatarPanelShapeKt.auraAvatarPanelShape(bfm, 0).ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(-2032502256);
        } else {
            if (iOrdinal != 1) {
                throw AnonymousClass005.A0k(bfm, -2032504334);
            }
            bfm.AgE(-2032499936);
            bRgA0R = C10G.A08(C10G.A00(C2VU.A00, bRgA0R, false), squarePanelSide(bfm, 0));
        }
        AnonymousClass001.A1D(bfm);
        return bRgA0R;
    }

    public static final float fullWidthPanelHeight(BFM bfm, int i) {
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        int iA09 = AnonymousClass002.A09(AuraLayoutSizeKt.auraLayoutContainerSize(bfm, 0));
        Integer numValueOf = Integer.valueOf(iA09);
        if (iA09 <= 0) {
            numValueOf = null;
        }
        return axnA0Y.Agx((numValueOf != null ? numValueOf.intValue() : axnA0Y.Abr(AuraLayoutSizeKt.auraLayoutHeight(bfm, 0))) * 0.45f);
    }

    /* renamed from: hatchExpandedAvatarPanelInset-ziNgDLE, reason: not valid java name */
    public static final BRg m987hatchExpandedAvatarPanelInsetziNgDLE(BRg bRg, float f, HatchForegroundHeaderState hatchForegroundHeaderState, Function0<Float> function0) {
        AnonymousClass003.A0w(bRg, function0);
        return C3UC.A00(bRg, new HatchExpandedAvatarPanelKt$hatchExpandedAvatarPanelInset$1(f, function0, hatchForegroundHeaderState));
    }

    public static final float safeLayoutWidth(BFM bfm, int i) {
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
        int iAuraLayoutContainerSize = (int) (AuraLayoutSizeKt.auraLayoutContainerSize(bfm, 0) >> 32);
        Integer numValueOf = Integer.valueOf(iAuraLayoutContainerSize);
        if (iAuraLayoutContainerSize <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : axnA0Y.Abr(AuraLayoutSizeKt.auraLayoutWidth(bfm, 0));
        C1OP c1opA00 = C1OP.A00(bfm);
        int iAH1 = (iIntValue - c1opA00.AH1(axnA0Y, enumC1820ArjA0d)) - c1opA00.AJo(axnA0Y, enumC1820ArjA0d);
        if (iAH1 < 0) {
            iAH1 = 0;
        }
        return axnA0Y.Agy(iAH1);
    }
}

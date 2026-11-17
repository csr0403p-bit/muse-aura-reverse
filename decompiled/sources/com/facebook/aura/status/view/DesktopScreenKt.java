package com.facebook.aura.status.view;

import X.AKQ;
import X.ARL;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C0A8;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.browsertask.data.HatchDesktopImage;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskScreenshot;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class DesktopScreenKt {
    public static final float FallbackPreviewAspectRatio = 1.5347826f;
    public static final float RowPreviewHeight = 48.0f;
    public static final float RowPreviewWidth = 72.0f;
    public static final C1D3 PreviewShape = C1D8.A00(12.0f);
    public static final C1D3 RowPreviewShape = C1D8.A00(4.0f);

    /* renamed from: com.facebook.aura.status.view.DesktopScreenKt$BrowserTaskListHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isOpeningBrowser;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onNewSession;
        public final /* synthetic */ int $taskCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, boolean z, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$taskCount = i;
            this.$isOpeningBrowser = z;
            this.$onNewSession = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DesktopScreenKt.BrowserTaskListHeader(this.$taskCount, this.$isOpeningBrowser, this.$onNewSession, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.DesktopScreenKt$BrowserTaskRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ BrowserTaskPresentation $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140712(BrowserTaskPresentation browserTaskPresentation, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$task = browserTaskPresentation;
            this.$onClick = function0;
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
            DesktopScreenKt.BrowserTaskRow(this.$task, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.DesktopScreenKt$DesktopNullState$2, reason: invalid class name and case insensitive filesystem */
    public final class C140722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDesktopImage $desktopImage;
        public final /* synthetic */ boolean $isOpeningBrowser;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenBrowser;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140722(HatchDesktopImage hatchDesktopImage, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$desktopImage = hatchDesktopImage;
            this.$isOpeningBrowser = z;
            this.$onOpenBrowser = function0;
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
            DesktopScreenKt.DesktopNullState(this.$desktopImage, this.$isOpeningBrowser, this.$onOpenBrowser, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.DesktopScreenKt$OpenBrowserButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C140732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140732(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            DesktopScreenKt.OpenBrowserButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.DesktopScreenKt$OpenBrowserSpinner$2, reason: invalid class name and case insensitive filesystem */
    public final class C140742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140742(BRg bRg, int i, int i2) {
            super(2);
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
            DesktopScreenKt.OpenBrowserSpinner(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void BrowserTaskListHeader(int i, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-2088697643);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(bRgA0R, C3cG.A00(bfm, auraTheme), AuraDimensKt.SpacingMicroPlusNano);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A03, bfm, C2VU.A04, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f100027), null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (z) {
                OpenBrowserSpinner(C3U4.A09(C10G.A07(C3cG.A09(bfm, 193047450), 32.0f), 8.0f), bfm, 6, 0);
            } else {
                bfm.AgE(193139210);
                AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208d3), function0, null, false, 32.0f, AuraIconSize.TINY, null, null, false, false, bfm, 1769472 | AVy.$stable | (iA0D & 896), 0, 1944);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, z, function0, bRgA0Q, i2, i3);
        }
    }

    public static final void BrowserTaskRow(BrowserTaskPresentation browserTaskPresentation, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(-262952318);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(browserTaskPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            BrowserTaskScreenshot browserTaskScreenshot = browserTaskPresentation.latestScreenshot;
            boolean zA1K = AnonymousClass003.A1K(bfm, browserTaskScreenshot != null ? browserTaskScreenshot.url : null, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                BrowserTaskScreenshot browserTaskScreenshot2 = browserTaskPresentation.latestScreenshot;
                objAaT = (browserTaskScreenshot2 == null || (str = browserTaskScreenshot2.url) == null) ? null : WorkspaceUriResolver.INSTANCE.resolveScreenshotUrl(str, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(bRgA04, C3cG.A00(bfm, auraTheme), AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingMedium);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0K);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (str2 != null) {
                bfm.AgE(1590988204);
                ARL arl = B18.A00;
                BRg bRgA0C = C10G.A0C(BRg.A00, RowPreviewWidth, RowPreviewHeight);
                C1D3 c1d3 = RowPreviewShape;
                AuraImageKt.m2573AuraImageXRP3Ue8(str2, C1DI.A02(C11U.A03(bRgA0C, c1d3), c1d3, 1.0f, auraTheme.getColors(bfm, 6).photoBorder), arl, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 384, 0, 32760);
            } else {
                bfm.AgE(1591293988);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str3 = browserTaskPresentation.activityTitle;
            if (str3 == null && (str3 = browserTaskPresentation.title) == null) {
                str3 = "";
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str4 = browserTaskPresentation.siteDomain;
            if (str4 == null) {
                bfm.AgE(925100274);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str4, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 925100275).subheadlineRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140712(browserTaskPresentation, function0, bRg2, i, i2);
        }
    }

    public static final void DesktopNullState(HatchDesktopImage hatchDesktopImage, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-1303239785);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDesktopImage, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A03(BJe.A00(bRg2, (hatchDesktopImage == null || (i3 = hatchDesktopImage.height) <= 0) ? FallbackPreviewAspectRatio : hatchDesktopImage.width / i3, false), PreviewShape), C3cH.A0W(bfm).highlight);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A07, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (hatchDesktopImage != null) {
                bfm.AgE(-2118464476);
                AuraImageKt.m2573AuraImageXRP3Ue8(hatchDesktopImage.url, C10G.A01, B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 432, 0, 32760);
            } else {
                bfm.AgE(-2118323023);
            }
            BBI.A0R(bbi, false);
            if (z) {
                OpenBrowserSpinner(C10G.A07(c0z7.A4C(C2VU.A09, C3cG.A09(bfm, -2118293480)), 32.0f), bfm, 0, 0);
            } else {
                OpenBrowserButton(function0, C3U4.A09(C3cG.A09(bfm, -2118198899), AuraDimensKt.SpacingXsmall), bfm, (iA05 >> 6) & 14, 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140722(hatchDesktopImage, z, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* renamed from: DesktopScreen-pBklqvs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2217DesktopScreenpBklqvs(float r17, float r18, X.BRg r19, com.facebook.aura.status.viewmodel.DesktopViewModel r20, X.BFM r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.DesktopScreenKt.m2217DesktopScreenpBklqvs(float, float, X.BRg, com.facebook.aura.status.viewmodel.DesktopViewModel, X.BFM, int, int):void");
    }

    public static final void OpenBrowserButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1359650350);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208d4);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA04 = C0v5.A04(C1b8.A01(C11U.A03(bRg2, auraTheme.getShapes(bfm, 6).pill), auraTheme.getColors(bfm, 6).elevated), C3cG.A0A(0), strA01, function0, true);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingXsmall;
            BRg bRgA0B = C3U4.A0B(bRgA04, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f2), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, 0L, auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(BRg.A00, 12.0f), BOf.A00(bfm, R.drawable.arrows_expand_wght400_outline, 0), AuraIconSize.X_TINY, null, 0L, null, bfm, (AVy.$stable << 3) | 3462, 48);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140732(function0, bRg2, i, i2);
        }
    }

    public static final void logOpen(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, hatchComponent, null, null, null);
    }

    public static final void OpenBrowserSpinner(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(608301417);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208d5);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new DesktopScreenKt$OpenBrowserSpinner$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRg, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140742(bRg, i, i2);
        }
    }
}

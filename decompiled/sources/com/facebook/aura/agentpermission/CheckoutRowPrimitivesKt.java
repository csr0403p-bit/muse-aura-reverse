package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C0881AGi;
import X.C0jP;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutRowPrimitivesKt {
    public static final float CheckoutLeadingSlotSize = 32.0f;
    public static final C1D3 CheckoutSectionShape = C1D8.A00(24.0f);
    public static final String TAG = "CheckoutRowPrimitives";

    /* renamed from: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt$CheckoutIconRow$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $onClickLabel;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, String str, String str2, BRg bRg, Function0<Unit> function0, String str3, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$onClickLabel = str3;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutRowPrimitivesKt.CheckoutIconRow(this.$iconRes, this.$title, this.$subtitle, this.$modifier, this.$onClick, this.$onClickLabel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt$CheckoutLegalFooter$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ApQ $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ApQ apQ, BRg bRg, int i, int i2) {
            super(2);
            this.$text = apQ;
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
            CheckoutRowPrimitivesKt.CheckoutLegalFooter(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt$CheckoutLegalFooter$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ApQ $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ApQ apQ, BRg bRg, int i, int i2) {
            super(2);
            this.$text = apQ;
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
            CheckoutRowPrimitivesKt.CheckoutLegalFooter(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt$CheckoutRowText$2, reason: invalid class name and case insensitive filesystem */
    public final class C108082 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ int $subtitleMaxLines;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108082(String str, String str2, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$subtitleMaxLines = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutRowPrimitivesKt.CheckoutRowText(this.$title, this.$subtitle, this.$modifier, this.$subtitleMaxLines, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt$CheckoutSummaryBody$1, reason: invalid class name and case insensitive filesystem */
    public final class C108091 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<HatchAgentPermissionsRepository.CheckoutTotal> $totals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108091(List<HatchAgentPermissionsRepository.CheckoutTotal> list, BRg bRg, int i, int i2) {
            super(2);
            this.$totals = list;
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
            CheckoutRowPrimitivesKt.CheckoutSummaryBody(this.$totals, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt$CheckoutTextRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $onClickLabel;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ int $subtitleMaxLines;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108102(String str, String str2, BRg bRg, int i, Function0<Unit> function0, String str3, int i2, int i3) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$subtitleMaxLines = i;
            this.$onClick = function0;
            this.$onClickLabel = str3;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutRowPrimitivesKt.CheckoutTextRow(this.$title, this.$subtitle, this.$modifier, this.$subtitleMaxLines, this.$onClick, this.$onClickLabel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt$CheckoutTotalRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C108111 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $amount;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $onClickLabel;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108111(String str, String str2, BRg bRg, Function0<Unit> function0, String str3, String str4, int i, int i2) {
            super(2);
            this.$label = str;
            this.$amount = str2;
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$onClickLabel = str3;
            this.$totalPromoCaption = str4;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutRowPrimitivesKt.CheckoutTotalRow(this.$label, this.$amount, this.$modifier, this.$onClick, this.$onClickLabel, this.$totalPromoCaption, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CheckoutSummaryBody(List<HatchAgentPermissionsRepository.CheckoutTotal> list, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(list, 0);
        bfm.AgG(384457321);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            CheckoutApprovalSummaryBodyKt.CheckoutSummaryGroups(CheckoutApprovalPresentationKt.retailCheckoutSummary(list), bRg, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | CheckoutSummaryPresentation.$stable, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108091(list, bRg, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isRenderable(com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutTotal r1) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            java.lang.String r0 = r1.displayText
            if (r0 == 0) goto Lf
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.isRenderable(com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutTotal):boolean");
    }

    public static final String trimToNonEmpty(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final void CheckoutIconRow(int i, String str, String str2, BRg bRg, Function0<Unit> function0, String str3, BFM bfm, int i2, int i3) {
        BRg bRgA06;
        BRg bRg2;
        BRg bRgA0Q = bRg;
        Function0<Unit> function02 = function0;
        String str4 = str3;
        bfm.AgG(404979512);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0X(bfm, function02);
        }
        int i6 = i3 & 32;
        int iA0i = 196608;
        if (i6 != 0) {
            iA0D |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str4);
            iA0D |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0D, 74898), bfm, iA0D)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i5 != 0) {
                function02 = null;
            }
            if (i6 != 0) {
                str4 = null;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            if (function02 != null) {
                bRg2 = BRg.A00;
                bRgA06 = C3cI.A06(bRg2, str4, function02);
            } else {
                bRgA06 = BRg.A00;
                bRg2 = bRgA06;
            }
            BRg bRgThen = bRgA0R.then(bRgA06);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgThen, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BRg bRgA07 = C10G.A07(bRg2, CheckoutLeadingSlotSize);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.SMALL, null, C3cH.A0W(bfm).primaryText, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            C01N.A09(bfm, bRg2, f2);
            CheckoutRowText(str, str2, AnonymousClass001.A0O(c90m, bRg2, true), 0, bfm, (iA0D >> 3) & 126, 8);
            if (function02 != null) {
                bfm.AgE(412919368);
                CheckoutRowChevronKt.CheckoutRowChevron(null, bfm, 0, 1);
            } else {
                bfm.AgE(-84382258);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, str, str2, bRgA0Q, function02, str4, i2, i3);
        }
    }

    public static final void CheckoutLegalFooter(ApQ apQ, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(apQ, 0);
        bfm.AgG(-527300680);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, apQ) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).caption1Regular, null, null, null, null, null, null, null, null, 3, 0, 0, 16744447, 0L, 0L, 0L, 0L);
            if (apQ.A04(0, apQ.length()).isEmpty()) {
                bfm.AgE(-2118930850);
                AuraTextKt.m2640AuraTextVmYn7U0(apQ, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), c1822ArmA00, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 32752);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(apQ, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -2118765558);
            C0jP c0jP = (C0jP) bfm.A6v(Am0.A0G);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            int i4 = iA0d & 14;
            boolean zA1T = AnonymousClass001.A1T(bfm, c0jP, i4 == 4);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new CheckoutRowPrimitivesKt$CheckoutLegalFooter$2$1(apQ, c0jP);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, bRgA0R, (G0U) objAaT, null, null, null, false, jA07, c1822ArmA00, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, i4, 0, 1048184);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(apQ, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void CheckoutRowText(String str, String str2, BRg bRg, int i, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        int i4 = i;
        bfm.AgG(-1542816245);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (i6 != 0) {
                i4 = 2;
            }
            String strA0a = C3cI.A0a(str);
            String strTrimToNonEmpty = str2 != null ? trimToNonEmpty(str2) : null;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (strA0a != null) {
                bfm.AgE(-665946999);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA0a, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            } else {
                bfm.AgE(-665733471);
            }
            BBI.A0R(bbi, false);
            if (strTrimToNonEmpty != null) {
                bfm.AgE(-665684367);
                AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strTrimToNonEmpty, null, C3cH.A07(bfm, auraTheme2), C3cH.A0E(bfm, auraTheme2), null, null, null, false, 0, i4, 2, null, null, null, bfm, (iA0d << 18) & 1879048192, 6, 14834);
            } else {
                bfm.AgE(-665447775);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108082(str, str2, bRg2, i4, i2, i3);
        }
    }

    public static final void CheckoutTextRow(String str, String str2, BRg bRg, int i, Function0<Unit> function0, String str3, BFM bfm, int i2, int i3) {
        BRg bRgA0Q = bRg;
        int i4 = i;
        Function0<Unit> function02 = function0;
        String str4 = str3;
        bfm.AgG(-1227020654);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i4);
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i8 = i3 & 32;
        int iA0i = 196608;
        if (i8 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str4);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i5 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i6 != 0) {
                i4 = 2;
            }
            if (i7 != 0) {
                function02 = null;
            }
            if (i8 != 0) {
                str4 = null;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            BRg bRgA05 = BRg.A00;
            if (function02 != null) {
                bRgA05 = C0v5.A05(bRgA05, str4, function02, true);
            }
            BRg bRgA0B = C3U4.A0B(bRgA0R.then(bRgA05), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            CheckoutRowText(str, str2, AnonymousClass001.A0O(C90m.A00, bRgA05, true), i4, bfm, iA0d & 7294, 0);
            if (function02 != null) {
                bfm.AgE(-276185566);
                CheckoutRowChevronKt.CheckoutRowChevron(null, bfm, 0, 1);
            } else {
                bfm.AgE(28201268);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108102(str, str2, bRgA0Q, i4, function02, str4, i2, i3);
        }
    }

    public static final void CheckoutTotalRow(String str, String str2, BRg bRg, Function0<Unit> function0, String str3, String str4, BFM bfm, int i, int i2) {
        Function0<Unit> function02 = function0;
        String str5 = str3;
        String str6 = str4;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-426679079);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str5);
        }
        int i6 = i2 & 32;
        int iA0i = 196608;
        if (i6 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str6);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            if (i5 != 0) {
                str5 = null;
            }
            if (i6 != 0) {
                str6 = null;
            }
            int i7 = iA0d >> 3;
            CheckoutAmountRowKt.CheckoutAmountRow(new CheckoutAmountPresentation(CheckoutAmountLabel.PROVIDED, str, str2, null, false, CheckoutAmountLayout.RECEIPT, false, false, C0881AGi.A00), bRg2, function02, str5, str6, bfm, AnonymousClass003.A07(i7, AnonymousClass002.A07(i7, CheckoutAmountPresentation.$stable)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108111(str, str2, bRg2, function02, str5, str6, i, i2);
        }
    }

    public static final float getCheckoutLeadingSlotSize() {
        return CheckoutLeadingSlotSize;
    }

    public static final C1D3 getCheckoutSectionShape() {
        return CheckoutSectionShape;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: rememberCheckoutLegalText-XO-JAsU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ApQ m189rememberCheckoutLegalTextXOJAsU(java.lang.String r25, java.util.List<com.facebook.aura.agentpermission.LegalLink> r26, long r27, X.BFM r29, int r30) {
        /*
            r9 = r25
            r5 = r26
            boolean r7 = X.AnonymousClass004.A1b(r9, r5)
            r3 = r30
            r0 = r30 & 14
            r0 = r0 ^ 6
            r1 = 4
            r8 = r29
            if (r0 <= r1) goto L19
            boolean r0 = r8.A65(r9)
            if (r0 != 0) goto L1e
        L19:
            r0 = r30 & 6
            r6 = 0
            if (r0 != r1) goto L1f
        L1e:
            r6 = 1
        L1f:
            r0 = r30 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L2d
            boolean r0 = r8.A65(r5)
            if (r0 != 0) goto L32
        L2d:
            r1 = r30 & 48
            r0 = 0
            if (r1 != r2) goto L33
        L32:
            r0 = 1
        L33:
            r6 = r6 | r0
            r0 = r3 & 896(0x380, float:1.256E-42)
            r2 = r0 ^ 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            r0 = r27
            if (r2 <= r4) goto L44
            boolean r2 = r8.A64(r0)
            if (r2 != 0) goto L49
        L44:
            r3 = r3 & 384(0x180, float:5.38E-43)
            r2 = 0
            if (r3 != r4) goto L4a
        L49:
            r2 = 1
        L4a:
            r2 = r2 | r6
            java.lang.Object r3 = r8.AaT()
            if (r2 != 0) goto L55
            java.lang.Object r2 = X.C78N.A00
            if (r3 != r2) goto Lac
        L55:
            X.ApS r6 = X.AnonymousClass006.A0X(r9)
            java.util.Iterator r10 = r5.iterator()
        L5d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r3 = r10.next()
            com.facebook.aura.agentpermission.LegalLink r3 = (com.facebook.aura.agentpermission.LegalLink) r3
            java.lang.String r2 = r3.label
            r12 = 0
            int r5 = X.C7BY.A0B(r9, r2, r7, r7)
            if (r5 < 0) goto L5d
            java.lang.String r2 = r3.label
            int r4 = r2.length()
            int r4 = r4 + r5
            java.lang.String r3 = r3.url
            X.1OR r2 = new X.1OR
            r2.<init>(r3)
            r6.A0B(r2, r5, r4)
            long r25 = X.C1809ArT.A01
            long r29 = X.B6A.A07
            X.Aro r11 = new X.Aro
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r0
            r27 = r25
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29)
            r6.A0A(r11, r5, r4)
            goto L5d
        La5:
            X.ApQ r3 = r6.A04()
            r8.Ai0(r3)
        Lac:
            X.ApQ r3 = (X.ApQ) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.m189rememberCheckoutLegalTextXOJAsU(java.lang.String, java.util.List, long, X.BFM, int):X.ApQ");
    }
}

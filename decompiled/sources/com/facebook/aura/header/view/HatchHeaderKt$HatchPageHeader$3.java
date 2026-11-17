package com.facebook.aura.header.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C19U;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchHeaderKt$HatchPageHeader$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
    public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ boolean $logBackClick;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationContent;
    public final /* synthetic */ String $navigationContentDescription;
    public final /* synthetic */ int $navigationIcon;
    public final /* synthetic */ Function0<Unit> $onBackClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ boolean $showNavigationButton;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ long $subtitleColor;
    public final /* synthetic */ C1822Arm $subtitleStyle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ long $titleColor;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ int $titleOverflow;
    public final /* synthetic */ boolean $trackNavigationBounds;

    /* renamed from: com.facebook.aura.header.view.HatchHeaderKt$HatchPageHeader$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
        public final /* synthetic */ boolean $logBackClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationContent;
        public final /* synthetic */ String $navigationContentDescription;
        public final /* synthetic */ int $navigationIcon;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ boolean $showNavigationButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, String str, Function0<Unit> function0, boolean z2, HatchBackClickAnalytics hatchBackClickAnalytics) {
            super(2);
            this.$showNavigationButton = z;
            this.$navigationContent = g0v;
            this.$navigationIcon = i;
            this.$navigationContentDescription = str;
            this.$onBackClick = function0;
            this.$logBackClick = z2;
            this.$backClickAnalytics = hatchBackClickAnalytics;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$showNavigationButton) {
                    bfm.AgE(-2090703290);
                    if (this.$navigationContent != null) {
                        bfm.AgE(-2090683512);
                        AnonymousClass001.A1H(bfm, this.$navigationContent, 0);
                    } else {
                        bfm.AgE(-2090596154);
                        AVy aVyA00 = BOf.A00(bfm, this.$navigationIcon, 0);
                        String strA01 = this.$navigationContentDescription;
                        if (strA01 == null) {
                            bfm.AgE(1733683854);
                            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206bb);
                        } else {
                            bfm.AgE(1733681932);
                        }
                        AnonymousClass001.A1D(bfm);
                        Function0<Unit> function0 = this.$onBackClick;
                        boolean zA65 = bfm.A65(function0) | AnonymousClass001.A1R(bfm, this.$backClickAnalytics, bfm.A66(this.$logBackClick));
                        boolean z = this.$logBackClick;
                        HatchBackClickAnalytics hatchBackClickAnalytics = this.$backClickAnalytics;
                        Function0<Unit> function02 = this.$onBackClick;
                        Object objAaT = bfm.AaT();
                        if (zA65 || objAaT == C78N.A00) {
                            objAaT = new HatchHeaderKt$HatchPageHeader$3$1$1$1(z, hatchBackClickAnalytics, function02);
                            bfm.Ai0(objAaT);
                        }
                        AnonymousClass005.A0o(bfm, aVyA00, strA01, (Function0) objAaT);
                    }
                    AnonymousClass001.A1D(bfm);
                } else {
                    bfm.AgE(-2089754783);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchHeaderKt$HatchPageHeader$3$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ long $subtitleColor;
        public final /* synthetic */ C1822Arm $subtitleStyle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
        public final /* synthetic */ long $titleColor;
        public final /* synthetic */ BRg $titleModifier;
        public final /* synthetic */ int $titleOverflow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, String str, String str2, BRg bRg, long j, int i, C1822Arm c1822Arm, long j2) {
            super(2);
            this.$centerContent = g0v;
            this.$titleAlignment = hatchHeaderTitleAlignment;
            this.$title = str;
            this.$subtitle = str2;
            this.$titleModifier = bRg;
            this.$titleColor = j;
            this.$titleOverflow = i;
            this.$subtitleStyle = c1822Arm;
            this.$subtitleColor = j2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            C3TH c3th;
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$centerContent != null) {
                    bfm.AgE(-1161571281);
                    AnonymousClass001.A1H(bfm, this.$centerContent, 0);
                } else if (this.$titleAlignment != HatchHeaderTitleAlignment.HIDDEN && this.$title.length() > 0) {
                    bfm.AgE(-1161377221);
                    HatchHeaderTitleAlignment hatchHeaderTitleAlignment = this.$titleAlignment;
                    HatchHeaderTitleAlignment hatchHeaderTitleAlignment2 = HatchHeaderTitleAlignment.CENTER;
                    int i2 = 5;
                    if (hatchHeaderTitleAlignment == hatchHeaderTitleAlignment2) {
                        i2 = 3;
                    }
                    AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                    C1822Arm c1822ArmA00 = C1822Arm.A00(null, AnonymousClass001.A0g(bfm, akh).bodyEmphasized, null, null, C1736ApY.A03, null, null, null, null, null, 0, 0, 0, 16646139, 0L, 0L, 0L, C19U.A03(24));
                    if (this.$subtitle.length() == 0) {
                        bfm.AgE(-1160983366);
                        AuraTextKt.m2639AuraTextUY9GdpU(this.$title, C3U4.A07(this.$titleModifier, 8.0f), this.$titleColor, c1822ArmA00, null, null, new C1YL(i2), false, 0, 1, this.$titleOverflow, null, null, null, bfm, 805306368, 0, 14768);
                    } else {
                        bfm.AgE(-1160578165);
                        BRg bRgA07 = C3U4.A07(BRg.A00, 8.0f);
                        C9m9 c9m9A00 = AcQ.A00(4.0f);
                        if (this.$titleAlignment == hatchHeaderTitleAlignment2) {
                            c3th = C2VU.A00;
                        } else {
                            c3th = C2VU.A02;
                        }
                        String str = this.$title;
                        BRg bRg = this.$titleModifier;
                        long j = this.$titleColor;
                        int i3 = this.$titleOverflow;
                        C1822Arm c1822Arm = this.$subtitleStyle;
                        String str2 = this.$subtitle;
                        long j2 = this.$subtitleColor;
                        InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 6);
                        BBI bbi = (BBI) bfm;
                        int iA0J = AnonymousClass003.A0J(bbi);
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm, bRgA07);
                        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                        if (bbi.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                        AuraTextKt.m2639AuraTextUY9GdpU(str, bRg, j, c1822ArmA00, null, null, new C1YL(i2), false, 0, 1, i3, null, null, null, bfm, 805306368, 0, 14768);
                        if (c1822Arm == null) {
                            bfm.AgE(-1862751569);
                            c1822Arm = AnonymousClass001.A0g(bfm, akh).caption1Regular;
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(-1862752747);
                            BBI.A0R(bbi, false);
                        }
                        AuraTextKt.m2639AuraTextUY9GdpU(str2, null, j2, c1822Arm, null, null, new C1YL(i2), false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14770);
                        BBI.A0R(bbi, true);
                    }
                    AnonymousClass001.A1D(bfm);
                } else {
                    bfm.AgE(-1159404288);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchHeaderKt$HatchPageHeader$3$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
        public final /* synthetic */ AHD<HeaderAction> $headerActions;
        public final /* synthetic */ AHD<HeaderButton> $headerButtons;
        public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0V<? super BFM, ? super Integer, Unit> g0v, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2) {
            super(2);
            this.$actions = g0v;
            this.$headerButtons = ahd;
            this.$onHeaderButtonClick = g0u;
            this.$headerActions = ahd2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                if (this.$actions != null) {
                    bfm.AgE(-232417324);
                    AnonymousClass001.A1H(bfm, this.$actions, 0);
                } else {
                    bfm.AgE(-232362671);
                    HeaderButtonKt.m1025HatchHeaderButtonRow_6dBP3U(this.$headerButtons, this.$onHeaderButtonClick, null, null, null, this.$headerActions, null, false, false, bfm, 0, 476);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchHeaderKt$HatchPageHeader$3(G0V<? super BFM, ? super Integer, Unit> g0v, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z, boolean z2, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, String str, Function0<Unit> function0, boolean z3, HatchBackClickAnalytics hatchBackClickAnalytics, G0V<? super BFM, ? super Integer, Unit> g0v3, String str2, String str3, BRg bRg, long j, int i2, C1822Arm c1822Arm, long j2, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2) {
        super(2);
        this.$actions = g0v;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$trackNavigationBounds = z;
        this.$showNavigationButton = z2;
        this.$navigationContent = g0v2;
        this.$navigationIcon = i;
        this.$navigationContentDescription = str;
        this.$onBackClick = function0;
        this.$logBackClick = z3;
        this.$backClickAnalytics = hatchBackClickAnalytics;
        this.$centerContent = g0v3;
        this.$title = str2;
        this.$subtitle = str3;
        this.$titleModifier = bRg;
        this.$titleColor = j;
        this.$titleOverflow = i2;
        this.$subtitleStyle = c1822Arm;
        this.$subtitleColor = j2;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u;
        this.$headerActions = ahd2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zA1X = AnonymousClass002.A1X(this.$actions);
            HatchHeaderKt.m993HatchHeaderContentyBXNGS4(this.$titleAlignment, AnonymousClass001.A0U(C10G.A02, 60.0f), 0.0f, null, null, this.$trackNavigationBounds, zA1X, B1V.A00(bfm, new AnonymousClass1(this.$showNavigationButton, this.$navigationContent, this.$navigationIcon, this.$navigationContentDescription, this.$onBackClick, this.$logBackClick, this.$backClickAnalytics), -2013836191), B1V.A00(bfm, new AnonymousClass2(this.$centerContent, this.$titleAlignment, this.$title, this.$subtitle, this.$titleModifier, this.$titleColor, this.$titleOverflow, this.$subtitleStyle, this.$subtitleColor), 438381858), B1V.A00(bfm, new AnonymousClass3(this.$actions, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions), -1404367389), bfm, 918552624, 28);
            return;
        }
        bfm.Afo();
    }
}

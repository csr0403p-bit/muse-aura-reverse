package com.facebook.aura.header.view;

import X.AHD;
import X.AKH;
import X.AKJ;
import X.AKQ;
import X.AbstractC04540eo;
import X.AbstractC7559F3s;
import X.Akx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0wg;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1DH;
import X.C1DM;
import X.C1OM;
import X.C1OP;
import X.C2VU;
import X.C3Ue;
import X.C78N;
import X.C8jn;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.ui.HatchSurfaceKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.ui.adaptive.AuraPageCardKt;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPageScreenKt$HatchPageScreen$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
    public final /* synthetic */ Akx $avatarScrollConnection;
    public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ C1DH $cardBorder;
    public final /* synthetic */ long $cardShadowColor;
    public final /* synthetic */ C1DM $cardShape;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ boolean $closesModalFlow;
    public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraContentRole $contentRole;
    public final /* synthetic */ float $contentTopSpacing;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ AuraThemeMode $headerModeOverride;
    public final /* synthetic */ BRg $headerModifier;
    public final /* synthetic */ boolean $isCard;
    public final /* synthetic */ boolean $isFloating;
    public final /* synthetic */ boolean $logBackClick;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationContent;
    public final /* synthetic */ String $navigationContentDescription;
    public final /* synthetic */ int $navigationIcon;
    public final /* synthetic */ Function0<Unit> $onBackClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ ScrimConfig $scrimConfig;
    public final /* synthetic */ float $scrimProgress;
    public final /* synthetic */ ScrimScrollState $scrimState;
    public final /* synthetic */ BRg $scrollModifier;
    public final /* synthetic */ boolean $showHeader;
    public final /* synthetic */ boolean $showNavigationButton;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ long $subtitleColor;
    public final /* synthetic */ C1822Arm $subtitleStyle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ long $titleColor;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ int $titleOverflow;

    /* renamed from: com.facebook.aura.header.view.HatchPageScreenKt$HatchPageScreen$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
        public final /* synthetic */ Akx $avatarScrollConnection;
        public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
        public final /* synthetic */ long $backgroundColor;
        public final /* synthetic */ float $bottomPadding;
        public final /* synthetic */ C1DH $cardBorder;
        public final /* synthetic */ long $cardShadowColor;
        public final /* synthetic */ C1DM $cardShape;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
        public final /* synthetic */ boolean $closesModalFlow;
        public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraContentRole $contentRole;
        public final /* synthetic */ float $contentTopSpacing;
        public final /* synthetic */ AHD<HeaderAction> $headerActions;
        public final /* synthetic */ AHD<HeaderButton> $headerButtons;
        public final /* synthetic */ AuraThemeMode $headerModeOverride;
        public final /* synthetic */ BRg $headerModifier;
        public final /* synthetic */ boolean $isCard;
        public final /* synthetic */ boolean $isFloating;
        public final /* synthetic */ boolean $logBackClick;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationContent;
        public final /* synthetic */ String $navigationContentDescription;
        public final /* synthetic */ int $navigationIcon;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
        public final /* synthetic */ ScrimConfig $scrimConfig;
        public final /* synthetic */ float $scrimProgress;
        public final /* synthetic */ BRg $scrollModifier;
        public final /* synthetic */ boolean $showHeader;
        public final /* synthetic */ boolean $showNavigationButton;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ long $subtitleColor;
        public final /* synthetic */ C1822Arm $subtitleStyle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
        public final /* synthetic */ long $titleColor;
        public final /* synthetic */ BRg $titleModifier;
        public final /* synthetic */ int $titleOverflow;

        /* renamed from: com.facebook.aura.header.view.HatchPageScreenKt$HatchPageScreen$3$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
            public final /* synthetic */ Akx $avatarScrollConnection;
            public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
            public final /* synthetic */ float $bottomPadding;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
            public final /* synthetic */ boolean $closesModalFlow;
            public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
            public final /* synthetic */ AuraContentRole $contentRole;
            public final /* synthetic */ float $contentTopSpacing;
            public final /* synthetic */ AHD<HeaderAction> $headerActions;
            public final /* synthetic */ AHD<HeaderButton> $headerButtons;
            public final /* synthetic */ AuraThemeMode $headerModeOverride;
            public final /* synthetic */ BRg $headerModifier;
            public final /* synthetic */ boolean $isCard;
            public final /* synthetic */ boolean $isFloating;
            public final /* synthetic */ boolean $logBackClick;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationContent;
            public final /* synthetic */ String $navigationContentDescription;
            public final /* synthetic */ int $navigationIcon;
            public final /* synthetic */ Function0<Unit> $onBackClick;
            public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
            public final /* synthetic */ ScrimConfig $scrimConfig;
            public final /* synthetic */ float $scrimProgress;
            public final /* synthetic */ BRg $scrollModifier;
            public final /* synthetic */ boolean $showHeader;
            public final /* synthetic */ boolean $showNavigationButton;
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
            public AnonymousClass2(BRg bRg, Akx akx, float f, boolean z, boolean z2, AuraContentRole auraContentRole, ScrimConfig scrimConfig, float f2, boolean z3, AuraThemeMode auraThemeMode, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, float f3, boolean z4, int i, String str, String str2, String str3, Function0<Unit> function0, BRg bRg2, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z5, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, G0V<? super BFM, ? super Integer, Unit> g0v2, long j, long j2, C1822Arm c1822Arm, BRg bRg3, int i2, G0V<? super BFM, ? super Integer, Unit> g0v3, HatchBackClickAnalytics hatchBackClickAnalytics, boolean z6) {
                super(2);
                this.$scrollModifier = bRg;
                this.$avatarScrollConnection = akx;
                this.$contentTopSpacing = f;
                this.$isFloating = z;
                this.$isCard = z2;
                this.$contentRole = auraContentRole;
                this.$scrimConfig = scrimConfig;
                this.$scrimProgress = f2;
                this.$showHeader = z3;
                this.$headerModeOverride = auraThemeMode;
                this.$content = g2j;
                this.$bottomPadding = f3;
                this.$closesModalFlow = z4;
                this.$navigationIcon = i;
                this.$navigationContentDescription = str;
                this.$title = str2;
                this.$subtitle = str3;
                this.$onBackClick = function0;
                this.$headerModifier = bRg2;
                this.$titleAlignment = hatchHeaderTitleAlignment;
                this.$showNavigationButton = z5;
                this.$navigationContent = g0v;
                this.$headerButtons = ahd;
                this.$onHeaderButtonClick = g0u;
                this.$headerActions = ahd2;
                this.$actions = g0v2;
                this.$titleColor = j;
                this.$subtitleColor = j2;
                this.$subtitleStyle = c1822Arm;
                this.$titleModifier = bRg3;
                this.$titleOverflow = i2;
                this.$centerContent = g0v3;
                this.$backClickAnalytics = hatchBackClickAnalytics;
                this.$logBackClick = z6;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                float fA00;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    BRg bRgA00 = C8jn.A00(C10G.A01.then(this.$scrollModifier), this.$avatarScrollConnection, null);
                    float f = this.$contentTopSpacing;
                    boolean z = this.$isFloating;
                    boolean z2 = this.$isCard;
                    AuraContentRole auraContentRole = this.$contentRole;
                    ScrimConfig scrimConfig = this.$scrimConfig;
                    float f2 = this.$scrimProgress;
                    boolean z3 = this.$showHeader;
                    AuraThemeMode auraThemeMode = this.$headerModeOverride;
                    G2j<C1DG, C1DG, BFM, Integer, Unit> g2j = this.$content;
                    float f3 = this.$bottomPadding;
                    boolean z4 = this.$closesModalFlow;
                    int i2 = this.$navigationIcon;
                    String str = this.$navigationContentDescription;
                    String str2 = this.$title;
                    String str3 = this.$subtitle;
                    Function0<Unit> function0 = this.$onBackClick;
                    BRg bRg = this.$headerModifier;
                    HatchHeaderTitleAlignment hatchHeaderTitleAlignment = this.$titleAlignment;
                    boolean z5 = this.$showNavigationButton;
                    G0V<BFM, Integer, Unit> g0v = this.$navigationContent;
                    AHD<HeaderButton> ahd = this.$headerButtons;
                    G0U<HeaderButton, Unit> g0u = this.$onHeaderButtonClick;
                    AHD<HeaderAction> ahd2 = this.$headerActions;
                    G0V<BFM, Integer, Unit> g0v2 = this.$actions;
                    long j = this.$titleColor;
                    long j2 = this.$subtitleColor;
                    C1822Arm c1822Arm = this.$subtitleStyle;
                    BRg bRg2 = this.$titleModifier;
                    int i3 = this.$titleOverflow;
                    G0V<BFM, Integer, Unit> g0v3 = this.$centerContent;
                    HatchBackClickAnalytics hatchBackClickAnalytics = this.$backClickAnalytics;
                    boolean z6 = this.$logBackClick;
                    InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA00);
                    Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                    float fM998getHatchPageHeaderHeightkHDZbjc = HatchPageScreenKt.m998getHatchPageHeaderHeightkHDZbjc(f, bfm, 0, 0);
                    HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
                    boolean zA1I = AnonymousClass003.A1I(bfm, hatchStatusPillMetricsA0a, fM998getHatchPageHeaderHeightkHDZbjc);
                    Object objAaT = bfm.AaT();
                    if (zA1I || objAaT == C78N.A00) {
                        objAaT = new HatchPageScreenKt$HatchPageScreen$3$1$2$1$1$1(hatchStatusPillMetricsA0a, fM998getHatchPageHeaderHeightkHDZbjc);
                        bfm.Ai0(objAaT);
                    }
                    AnonymousClass001.A15(bfm, objAaT);
                    if (z) {
                        bfm.AgE(-1936372937);
                        BBI.A0R(bbi, false);
                        fA00 = 0.0f;
                    } else {
                        bfm.AgE(-1936366085);
                        fA00 = C0wg.A00(bfm, C1OP.A00(bfm).ALn(AnonymousClass002.A0Y(bfm)));
                        BBI.A0R(bbi, false);
                    }
                    AuraPageCardKt.ProvideAuraPageCardLayoutSize(z2, auraContentRole, B1V.A00(bfm, new HatchPageScreenKt$HatchPageScreen$3$1$2$1$2(auraContentRole, g2j, fM998getHatchPageHeaderHeightkHDZbjc, f3), -409797258), bfm, 384);
                    HatchHeaderScrimKt.m995HatchHeaderScrimDzVHIIc(scrimConfig, fM998getHatchPageHeaderHeightkHDZbjc - fA00, null, f2, bfm, 0, 4);
                    if (z3) {
                        bfm.AgE(102634021);
                        if (auraThemeMode == null) {
                            auraThemeMode = AuraThemeMode.DEFAULT;
                        }
                        AuraModeOverriderKt.AuraModeOverrider(auraThemeMode, null, B1V.A00(bfm, new HatchPageScreenKt$HatchPageScreen$3$1$2$1$3(z4, i2, str, str2, str3, function0, bRg, hatchHeaderTitleAlignment, z5, g0v, ahd, g0u, ahd2, g0v2, j, j2, c1822Arm, bRg2, i3, g0v3, hatchBackClickAnalytics, z6), 1957606659), bfm, 384, 2);
                    } else {
                        bfm.AgE(103994797);
                    }
                    AnonymousClass003.A0q(bbi);
                    return;
                }
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BRg bRg, boolean z, C1DM c1dm, long j, C1DH c1dh, AuraContentRole auraContentRole, long j2, BRg bRg2, Akx akx, float f, boolean z2, ScrimConfig scrimConfig, float f2, boolean z3, AuraThemeMode auraThemeMode, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, float f3, boolean z4, int i, String str, String str2, String str3, Function0<Unit> function0, BRg bRg3, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z5, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, G0V<? super BFM, ? super Integer, Unit> g0v2, long j3, long j4, C1822Arm c1822Arm, BRg bRg4, int i2, G0V<? super BFM, ? super Integer, Unit> g0v3, HatchBackClickAnalytics hatchBackClickAnalytics, boolean z6) {
            super(2);
            this.$modifier = bRg;
            this.$isCard = z;
            this.$cardShape = c1dm;
            this.$backgroundColor = j;
            this.$cardBorder = c1dh;
            this.$contentRole = auraContentRole;
            this.$cardShadowColor = j2;
            this.$scrollModifier = bRg2;
            this.$avatarScrollConnection = akx;
            this.$contentTopSpacing = f;
            this.$isFloating = z2;
            this.$scrimConfig = scrimConfig;
            this.$scrimProgress = f2;
            this.$showHeader = z3;
            this.$headerModeOverride = auraThemeMode;
            this.$content = g2j;
            this.$bottomPadding = f3;
            this.$closesModalFlow = z4;
            this.$navigationIcon = i;
            this.$navigationContentDescription = str;
            this.$title = str2;
            this.$subtitle = str3;
            this.$onBackClick = function0;
            this.$headerModifier = bRg3;
            this.$titleAlignment = hatchHeaderTitleAlignment;
            this.$showNavigationButton = z5;
            this.$navigationContent = g0v;
            this.$headerButtons = ahd;
            this.$onHeaderButtonClick = g0u;
            this.$headerActions = ahd2;
            this.$actions = g0v2;
            this.$titleColor = j3;
            this.$subtitleColor = j4;
            this.$subtitleStyle = c1822Arm;
            this.$titleModifier = bRg4;
            this.$titleOverflow = i2;
            this.$centerContent = g0v3;
            this.$backClickAnalytics = hatchBackClickAnalytics;
            this.$logBackClick = z6;
        }

        public final void invoke(BFM bfm, int i) {
            C1DM c1dm;
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.AgE(62554589);
                BRg bRgA0T = AnonymousClass001.A0T(this.$modifier);
                boolean z = this.$isCard;
                AuraContentRole auraContentRole = this.$contentRole;
                C1DM c1dm2 = this.$cardShape;
                long j = this.$cardShadowColor;
                if (z) {
                    bRgA0T = bRgA0T.then(AbstractC04540eo.A00(AuraPageCardKt.auraPageCardFrame(BRg.A00, auraContentRole, bfm, 6), c1dm2, 8.0f, 4, j, j));
                }
                AnonymousClass002.A19(bfm);
                boolean z2 = this.$isCard;
                if (z2) {
                    c1dm = this.$cardShape;
                } else {
                    c1dm = C1OM.A00;
                }
                HatchSurfaceKt.m2328HatchSurfaceY0xEhic(bRgA0T, c1dm, this.$backgroundColor, 0L, this.$cardBorder, B1V.A00(bfm, new AnonymousClass2(this.$scrollModifier, this.$avatarScrollConnection, this.$contentTopSpacing, this.$isFloating, z2, this.$contentRole, this.$scrimConfig, this.$scrimProgress, this.$showHeader, this.$headerModeOverride, this.$content, this.$bottomPadding, this.$closesModalFlow, this.$navigationIcon, this.$navigationContentDescription, this.$title, this.$subtitle, this.$onBackClick, this.$headerModifier, this.$titleAlignment, this.$showNavigationButton, this.$navigationContent, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions, this.$actions, this.$titleColor, this.$subtitleColor, this.$subtitleStyle, this.$titleModifier, this.$titleOverflow, this.$centerContent, this.$backClickAnalytics, this.$logBackClick), -1834860177), bfm, 196608, 8);
                return;
            }
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPageScreenKt$HatchPageScreen$3(ScrimScrollState scrimScrollState, boolean z, BRg bRg, boolean z2, C1DM c1dm, long j, C1DH c1dh, AuraContentRole auraContentRole, long j2, BRg bRg2, Akx akx, float f, ScrimConfig scrimConfig, float f2, boolean z3, AuraThemeMode auraThemeMode, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, float f3, boolean z4, int i, String str, String str2, String str3, Function0<Unit> function0, BRg bRg3, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z5, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, G0V<? super BFM, ? super Integer, Unit> g0v2, long j3, long j4, C1822Arm c1822Arm, BRg bRg4, int i2, G0V<? super BFM, ? super Integer, Unit> g0v3, HatchBackClickAnalytics hatchBackClickAnalytics, boolean z6) {
        super(2);
        this.$scrimState = scrimScrollState;
        this.$isFloating = z;
        this.$modifier = bRg;
        this.$isCard = z2;
        this.$cardShape = c1dm;
        this.$backgroundColor = j;
        this.$cardBorder = c1dh;
        this.$contentRole = auraContentRole;
        this.$cardShadowColor = j2;
        this.$scrollModifier = bRg2;
        this.$avatarScrollConnection = akx;
        this.$contentTopSpacing = f;
        this.$scrimConfig = scrimConfig;
        this.$scrimProgress = f2;
        this.$showHeader = z3;
        this.$headerModeOverride = auraThemeMode;
        this.$content = g2j;
        this.$bottomPadding = f3;
        this.$closesModalFlow = z4;
        this.$navigationIcon = i;
        this.$navigationContentDescription = str;
        this.$title = str2;
        this.$subtitle = str3;
        this.$onBackClick = function0;
        this.$headerModifier = bRg3;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$showNavigationButton = z5;
        this.$navigationContent = g0v;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u;
        this.$headerActions = ahd2;
        this.$actions = g0v2;
        this.$titleColor = j3;
        this.$subtitleColor = j4;
        this.$subtitleStyle = c1822Arm;
        this.$titleModifier = bRg4;
        this.$titleOverflow = i2;
        this.$centerContent = g0v3;
        this.$backClickAnalytics = hatchBackClickAnalytics;
        this.$logBackClick = z6;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AKJ<ScrimScrollState> akjA04 = ScrimScrollConnectionKt.LocalScrimScrollState.A04(this.$scrimState);
            AKH<Boolean> akh = HatchPageScreenKt.LocalHatchPageFloating;
            boolean z = this.$isFloating;
            AnonymousClass003.A0p(bfm, new AnonymousClass1(this.$modifier, this.$isCard, this.$cardShape, this.$backgroundColor, this.$cardBorder, this.$contentRole, this.$cardShadowColor, this.$scrollModifier, this.$avatarScrollConnection, this.$contentTopSpacing, z, this.$scrimConfig, this.$scrimProgress, this.$showHeader, this.$headerModeOverride, this.$content, this.$bottomPadding, this.$closesModalFlow, this.$navigationIcon, this.$navigationContentDescription, this.$title, this.$subtitle, this.$onBackClick, this.$headerModifier, this.$titleAlignment, this.$showNavigationButton, this.$navigationContent, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions, this.$actions, this.$titleColor, this.$subtitleColor, this.$subtitleStyle, this.$titleModifier, this.$titleOverflow, this.$centerContent, this.$backClickAnalytics, this.$logBackClick), new AKJ[]{akjA04, akh.A04(Boolean.valueOf(z))}, 1778834064);
            return;
        }
        bfm.Afo();
    }
}

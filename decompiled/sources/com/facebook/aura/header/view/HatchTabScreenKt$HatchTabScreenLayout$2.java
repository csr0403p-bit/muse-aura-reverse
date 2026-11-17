package com.facebook.aura.header.view;

import X.AHD;
import X.AKQ;
import X.AbstractC7559F3s;
import X.Akx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C8jn;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.ui.HatchSurfaceKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTabScreenKt$HatchTabScreenLayout$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Akx $avatarScrollConnection;
    public final /* synthetic */ HeaderButton $badgedHeaderButton;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ BRg $collapseModifier;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ AuraContentRole $contentRole;
    public final /* synthetic */ float $contentTopPadding;
    public final /* synthetic */ float $contentTopSpacing;
    public final /* synthetic */ ScrimConfig $effectiveScrim;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $handleLeadingButtonClick;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ AuraThemeMode $headerModeOverride;
    public final /* synthetic */ boolean $isTitleCompact;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ boolean $leadingButtonEnabled;
    public final /* synthetic */ boolean $leadingButtonRotating;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $pageHeaderActions;
    public final /* synthetic */ float $scrimProgress;
    public final /* synthetic */ BRg $scrollModifier;
    public final /* synthetic */ boolean $showStatusPill;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ BRg $tabRegistrationModifier;
    public final /* synthetic */ String $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ float $titleAlpha;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ B6A $trailingButtonTint;
    public final /* synthetic */ boolean $usePageHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabScreenKt$HatchTabScreenLayout$2(BRg bRg, BRg bRg2, Akx akx, BRg bRg3, long j, AuraThemeMode auraThemeMode, BRg bRg4, float f, AuraContentRole auraContentRole, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, float f2, boolean z, ScrimConfig scrimConfig, float f3, float f4, String str, HeaderLeadingButton headerLeadingButton, G0U<? super HeaderLeadingButton, Unit> g0u, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg5, AHD<HeaderAction> ahd2, HeaderButton headerButton, boolean z2, boolean z3, float f5, boolean z4, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, String str2, B6A b6a, boolean z5, G0V<? super BFM, ? super Integer, Unit> g0v2) {
        super(2);
        this.$collapseModifier = bRg;
        this.$scrollModifier = bRg2;
        this.$avatarScrollConnection = akx;
        this.$tabRegistrationModifier = bRg3;
        this.$color = j;
        this.$headerModeOverride = auraThemeMode;
        this.$modifier = bRg4;
        this.$contentBottomPadding = f;
        this.$contentRole = auraContentRole;
        this.$content = g0w;
        this.$contentTopPadding = f2;
        this.$usePageHeader = z;
        this.$effectiveScrim = scrimConfig;
        this.$contentTopSpacing = f3;
        this.$scrimProgress = f4;
        this.$title = str;
        this.$leadingButton = headerLeadingButton;
        this.$handleLeadingButtonClick = g0u;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u2;
        this.$pageHeaderActions = g0v;
        this.$titleModifier = bRg5;
        this.$headerActions = ahd2;
        this.$badgedHeaderButton = headerButton;
        this.$leadingButtonEnabled = z2;
        this.$leadingButtonRotating = z3;
        this.$titleAlpha = f5;
        this.$isTitleCompact = z4;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$subtitle = str2;
        this.$trailingButtonTint = b6a;
        this.$showStatusPill = z5;
        this.$centerContent = g0v2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgThen = C8jn.A00(c1062ATq.then(this.$collapseModifier).then(this.$scrollModifier), this.$avatarScrollConnection, null).then(this.$tabRegistrationModifier);
            long j = this.$color;
            AuraThemeMode auraThemeMode = this.$headerModeOverride;
            BRg bRg = this.$modifier;
            float f = this.$contentBottomPadding;
            AuraContentRole auraContentRole = this.$contentRole;
            G0W<C1DG, BFM, Integer, Unit> g0w = this.$content;
            float f2 = this.$contentTopPadding;
            boolean z = this.$usePageHeader;
            ScrimConfig scrimConfig = this.$effectiveScrim;
            float f3 = this.$contentTopSpacing;
            float f4 = this.$scrimProgress;
            String str = this.$title;
            HeaderLeadingButton headerLeadingButton = this.$leadingButton;
            G0U<HeaderLeadingButton, Unit> g0u = this.$handleLeadingButtonClick;
            AHD<HeaderButton> ahd = this.$headerButtons;
            G0U<HeaderButton, Unit> g0u2 = this.$onHeaderButtonClick;
            G0V<BFM, Integer, Unit> g0v = this.$pageHeaderActions;
            BRg bRg2 = this.$titleModifier;
            AHD<HeaderAction> ahd2 = this.$headerActions;
            HeaderButton headerButton = this.$badgedHeaderButton;
            boolean z2 = this.$leadingButtonEnabled;
            boolean z3 = this.$leadingButtonRotating;
            float f5 = this.$titleAlpha;
            boolean z4 = this.$isTitleCompact;
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = this.$titleAlignment;
            String str2 = this.$subtitle;
            B6A b6a = this.$trailingButtonTint;
            boolean z5 = this.$showStatusPill;
            G0V<BFM, Integer, Unit> g0v2 = this.$centerContent;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u3);
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(c1062ATq, c1dm, j);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90l c90l = C90l.A00;
            C1062ATq c1062ATq2 = C10G.A02;
            HatchSurfaceKt.m2328HatchSurfaceY0xEhic(AnonymousClass001.A0N(c90l, bRg.then(c1062ATq2), true), c1dm, j, 0L, null, B1V.A00(bfm, new HatchTabScreenKt$HatchTabScreenLayout$2$1$1$1(auraContentRole, g0w, f2), -1097517944), bfm, 196656, 24);
            C01N.A04(bfm, bbi, c1062ATq2, f, true);
            if (auraThemeMode == null) {
                auraThemeMode = AuraThemeMode.DEFAULT;
            }
            AuraModeOverriderKt.AuraModeOverrider(auraThemeMode, null, B1V.A00(bfm, new HatchTabScreenKt$HatchTabScreenLayout$2$1$2(z, scrimConfig, f3, f4, str, headerLeadingButton, g0u, ahd, g0u2, g0v, bRg2, ahd2, headerButton, z2, z3, f5, z4, hatchHeaderTitleAlignment, str2, b6a, z5, g0v2), 1419995562), bfm, 384, 2);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}

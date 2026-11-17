package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTabScreenKt$HatchTabScreen$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HeaderButton $badgedHeaderButton;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraContentRole $contentRole;
    public final /* synthetic */ float $contentTopSpacing;
    public final /* synthetic */ boolean $dimNavBar;
    public final /* synthetic */ boolean $drawBehindNavigationBars;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ AuraThemeMode $headerModeOverride;
    public final /* synthetic */ boolean $isTitleCompact;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ boolean $leadingButtonEnabled;
    public final /* synthetic */ boolean $leadingButtonRotating;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $onLeadingButtonClick;
    public final /* synthetic */ Function0<Unit> $onTabReselected;
    public final /* synthetic */ boolean $registerWithTabBar;
    public final /* synthetic */ ScrimConfig $scrim;
    public final /* synthetic */ boolean $showStatusPill;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ AuraTabRootNavKey $tabRoot;
    public final /* synthetic */ String $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ float $titleAlpha;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ B6A $trailingButtonTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabScreenKt$HatchTabScreen$4(AuraTabRootNavKey auraTabRootNavKey, BRg bRg, AuraContentRole auraContentRole, String str, long j, ScrimConfig scrimConfig, BRg bRg2, float f, boolean z, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, String str2, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, HeaderButton headerButton, HeaderLeadingButton headerLeadingButton, boolean z2, boolean z3, G0U<? super HeaderLeadingButton, Unit> g0u2, Function0<Unit> function0, B6A b6a, AuraThemeMode auraThemeMode, boolean z4, boolean z5, boolean z6, boolean z7, float f2, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, int i, int i2, int i3, int i4) {
        super(2);
        this.$tabRoot = auraTabRootNavKey;
        this.$modifier = bRg;
        this.$contentRole = auraContentRole;
        this.$title = str;
        this.$color = j;
        this.$scrim = scrimConfig;
        this.$titleModifier = bRg2;
        this.$titleAlpha = f;
        this.$isTitleCompact = z;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$subtitle = str2;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u;
        this.$headerActions = ahd2;
        this.$badgedHeaderButton = headerButton;
        this.$leadingButton = headerLeadingButton;
        this.$leadingButtonEnabled = z2;
        this.$leadingButtonRotating = z3;
        this.$onLeadingButtonClick = g0u2;
        this.$onTabReselected = function0;
        this.$trailingButtonTint = b6a;
        this.$headerModeOverride = auraThemeMode;
        this.$dimNavBar = z4;
        this.$drawBehindNavigationBars = z5;
        this.$showStatusPill = z6;
        this.$registerWithTabBar = z7;
        this.$contentTopSpacing = f2;
        this.$centerContent = g0v;
        this.$content = g0w;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchTabScreenKt.m1022HatchTabScreenTsp2nRQ(this.$tabRoot, this.$modifier, this.$contentRole, this.$title, this.$color, this.$scrim, this.$titleModifier, this.$titleAlpha, this.$isTitleCompact, this.$titleAlignment, this.$subtitle, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions, this.$badgedHeaderButton, this.$leadingButton, this.$leadingButtonEnabled, this.$leadingButtonRotating, this.$onLeadingButtonClick, this.$onTabReselected, this.$trailingButtonTint, this.$headerModeOverride, this.$dimNavBar, this.$drawBehindNavigationBars, this.$showStatusPill, this.$registerWithTabBar, this.$contentTopSpacing, this.$centerContent, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}

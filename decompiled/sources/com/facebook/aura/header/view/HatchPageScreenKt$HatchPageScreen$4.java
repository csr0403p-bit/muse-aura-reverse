package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1DG;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPageScreenKt$HatchPageScreen$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
    public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraContentRole $contentRole;
    public final /* synthetic */ float $contentTopSpacing;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ AuraThemeMode $headerModeOverride;
    public final /* synthetic */ BRg $headerModifier;
    public final /* synthetic */ boolean $logBackClick;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationContent;
    public final /* synthetic */ String $navigationContentDescription;
    public final /* synthetic */ int $navigationIcon;
    public final /* synthetic */ Function0<Unit> $onBackClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ AuraContainer.AuraScreen $screenType;
    public final /* synthetic */ ScrimConfig $scrimConfig;
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
    public HatchPageScreenKt$HatchPageScreen$4(AuraContainer.AuraScreen auraScreen, BRg bRg, AuraContentRole auraContentRole, long j, String str, String str2, Function0<Unit> function0, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z, boolean z2, int i, String str3, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, G0V<? super BFM, ? super Integer, Unit> g0v2, long j2, long j3, C1822Arm c1822Arm, float f, ScrimConfig scrimConfig, BRg bRg2, BRg bRg3, int i2, G0V<? super BFM, ? super Integer, Unit> g0v3, AuraThemeMode auraThemeMode, HatchBackClickAnalytics hatchBackClickAnalytics, boolean z3, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, int i3, int i4, int i5, int i6) {
        super(2);
        this.$screenType = auraScreen;
        this.$modifier = bRg;
        this.$contentRole = auraContentRole;
        this.$backgroundColor = j;
        this.$title = str;
        this.$subtitle = str2;
        this.$onBackClick = function0;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$showHeader = z;
        this.$showNavigationButton = z2;
        this.$navigationIcon = i;
        this.$navigationContentDescription = str3;
        this.$navigationContent = g0v;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u;
        this.$headerActions = ahd2;
        this.$actions = g0v2;
        this.$titleColor = j2;
        this.$subtitleColor = j3;
        this.$subtitleStyle = c1822Arm;
        this.$contentTopSpacing = f;
        this.$scrimConfig = scrimConfig;
        this.$headerModifier = bRg2;
        this.$titleModifier = bRg3;
        this.$titleOverflow = i2;
        this.$centerContent = g0v3;
        this.$headerModeOverride = auraThemeMode;
        this.$backClickAnalytics = hatchBackClickAnalytics;
        this.$logBackClick = z3;
        this.$content = g2j;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$default = i6;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchPageScreenKt.m997HatchPageScreenZOcclw(this.$screenType, this.$modifier, this.$contentRole, this.$backgroundColor, this.$title, this.$subtitle, this.$onBackClick, this.$titleAlignment, this.$showHeader, this.$showNavigationButton, this.$navigationIcon, this.$navigationContentDescription, this.$navigationContent, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions, this.$actions, this.$titleColor, this.$subtitleColor, this.$subtitleStyle, this.$contentTopSpacing, this.$scrimConfig, this.$headerModifier, this.$titleModifier, this.$titleOverflow, this.$centerContent, this.$headerModeOverride, this.$backClickAnalytics, this.$logBackClick, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}

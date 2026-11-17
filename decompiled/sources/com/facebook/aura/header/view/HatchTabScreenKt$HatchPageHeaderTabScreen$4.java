package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTabScreenKt$HatchPageHeaderTabScreen$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraContentRole $contentRole;
    public final /* synthetic */ float $contentTopSpacing;
    public final /* synthetic */ boolean $dimNavBar;
    public final /* synthetic */ AuraThemeMode $headerModeOverride;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $onLeadingButtonClick;
    public final /* synthetic */ Function0<Unit> $onTabReselected;
    public final /* synthetic */ ScrimConfig $scrim;
    public final /* synthetic */ AuraTabRootNavKey $tabRoot;
    public final /* synthetic */ String $title;
    public final /* synthetic */ BRg $titleModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabScreenKt$HatchPageHeaderTabScreen$4(AuraTabRootNavKey auraTabRootNavKey, String str, HeaderLeadingButton headerLeadingButton, BRg bRg, AuraContentRole auraContentRole, long j, ScrimConfig scrimConfig, BRg bRg2, G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super HeaderLeadingButton, Unit> g0u, Function0<Unit> function0, AuraThemeMode auraThemeMode, boolean z, float f, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, int i, int i2, int i3) {
        super(2);
        this.$tabRoot = auraTabRootNavKey;
        this.$title = str;
        this.$leadingButton = headerLeadingButton;
        this.$modifier = bRg;
        this.$contentRole = auraContentRole;
        this.$color = j;
        this.$scrim = scrimConfig;
        this.$titleModifier = bRg2;
        this.$actions = g0v;
        this.$onLeadingButtonClick = g0u;
        this.$onTabReselected = function0;
        this.$headerModeOverride = auraThemeMode;
        this.$dimNavBar = z;
        this.$contentTopSpacing = f;
        this.$content = g0w;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchTabScreenKt.m1021HatchPageHeaderTabScreenvn_pVgY(this.$tabRoot, this.$title, this.$leadingButton, this.$modifier, this.$contentRole, this.$color, this.$scrim, this.$titleModifier, this.$actions, this.$onLeadingButtonClick, this.$onTabReselected, this.$headerModeOverride, this.$dimNavBar, this.$contentTopSpacing, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

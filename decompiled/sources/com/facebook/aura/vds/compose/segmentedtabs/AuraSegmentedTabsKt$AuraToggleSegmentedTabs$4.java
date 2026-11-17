package com.facebook.aura.vds.compose.segmentedtabs;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.InterfaceC1072AWd;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSegmentedTabsKt$AuraToggleSegmentedTabs$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerBackground;
    public final /* synthetic */ float $containerPadding;
    public final /* synthetic */ AuraIconSize $iconSize;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<AuraTab, Integer, Unit> $onTabClicked;
    public final /* synthetic */ long $selectedBackground;
    public final /* synthetic */ int $selectedIndex;
    public final /* synthetic */ float $tabHorizontalPadding;
    public final /* synthetic */ float $tabVerticalPadding;
    public final /* synthetic */ AHD<AuraTab> $tabs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSegmentedTabsKt$AuraToggleSegmentedTabs$4(G0V<? super AuraTab, ? super Integer, Unit> g0v, AHD<? extends AuraTab> ahd, int i, BRg bRg, long j, long j2, float f, float f2, float f3, AuraIconSize auraIconSize, InterfaceC1072AWd interfaceC1072AWd, int i2, int i3, int i4) {
        super(2);
        this.$onTabClicked = g0v;
        this.$tabs = ahd;
        this.$selectedIndex = i;
        this.$modifier = bRg;
        this.$containerBackground = j;
        this.$selectedBackground = j2;
        this.$tabHorizontalPadding = f;
        this.$tabVerticalPadding = f2;
        this.$containerPadding = f3;
        this.$iconSize = auraIconSize;
        this.$interactionSource = interfaceC1072AWd;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSegmentedTabsKt.m2609AuraToggleSegmentedTabswDTT_x8(this.$onTabClicked, this.$tabs, this.$selectedIndex, this.$modifier, this.$containerBackground, this.$selectedBackground, this.$tabHorizontalPadding, this.$tabVerticalPadding, this.$containerPadding, this.$iconSize, this.$interactionSource, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

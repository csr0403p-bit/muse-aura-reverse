package com.facebook.aura.vds.compose.segmentedtabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSegmentedTabsKt$AuraSegmentedTab$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraIconSize $iconSize;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ B6A $selectedTextColor;
    public final /* synthetic */ AuraTab $tab;
    public final /* synthetic */ B6A $unselectedTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSegmentedTabsKt$AuraSegmentedTab$4(AuraTab auraTab, boolean z, AuraIconSize auraIconSize, B6A b6a, B6A b6a2, int i, int i2) {
        super(2);
        this.$tab = auraTab;
        this.$selected = z;
        this.$iconSize = auraIconSize;
        this.$selectedTextColor = b6a;
        this.$unselectedTextColor = b6a2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSegmentedTabsKt.m2608AuraSegmentedTabx3qM97A(this.$tab, this.$selected, this.$iconSize, this.$selectedTextColor, this.$unselectedTextColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

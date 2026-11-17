package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$AuraFixedNavBar$7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraTabRootNavKey $currentTabRoot;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $navigationBarBottomPadding;
    public final /* synthetic */ float $navigationBarLeftPadding;
    public final /* synthetic */ float $navigationBarRightPadding;
    public final /* synthetic */ Function0<Unit> $onOtherTabSelected;
    public final /* synthetic */ Function0<Unit> $onTabReselected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFixedNavBarKt$AuraFixedNavBar$7(AuraTabRootNavKey auraTabRootNavKey, float f, float f2, float f3, BRg bRg, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$currentTabRoot = auraTabRootNavKey;
        this.$navigationBarBottomPadding = f;
        this.$navigationBarLeftPadding = f2;
        this.$navigationBarRightPadding = f3;
        this.$modifier = bRg;
        this.$onTabReselected = function0;
        this.$onOtherTabSelected = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraFixedNavBarKt.m2287AuraFixedNavBarXiNizjQ(this.$currentTabRoot, this.$navigationBarBottomPadding, this.$navigationBarLeftPadding, this.$navigationBarRightPadding, this.$modifier, this.$onTabReselected, this.$onOtherTabSelected, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$FixedTabSlot$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOtherTabSelected;
    public final /* synthetic */ Function0<Unit> $onTabReselected;
    public final /* synthetic */ FixedTab $tab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFixedNavBarKt$FixedTabSlot$2$1(C0dx c0dx, FixedTab fixedTab, boolean z, AuraNavigator auraNavigator, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$haptic = c0dx;
        this.$tab = fixedTab;
        this.$isSelected = z;
        this.$navigator = auraNavigator;
        this.$onTabReselected = function0;
        this.$onOtherTabSelected = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptic.AXr(AuraHaptics.SEGMENT_SWITCH);
        AuraFixedNavBarKt.onFixedTabClick(this.$tab, this.$isSelected, this.$navigator, this.$onTabReselected, this.$onOtherTabSelected, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

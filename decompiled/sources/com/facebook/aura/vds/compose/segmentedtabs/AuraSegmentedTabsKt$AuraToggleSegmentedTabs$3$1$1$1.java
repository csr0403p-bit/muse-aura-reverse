package com.facebook.aura.vds.compose.segmentedtabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0dx;
import X.G0V;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSegmentedTabsKt$AuraToggleSegmentedTabs$3$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0V<AuraTab, Integer, Unit> $onTabClicked;
    public final /* synthetic */ int $selectedIndex;
    public final /* synthetic */ AuraTab $tab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSegmentedTabsKt$AuraToggleSegmentedTabs$3$1$1$1(int i, int i2, C0dx c0dx, G0V<? super AuraTab, ? super Integer, Unit> g0v, AuraTab auraTab) {
        super(0);
        this.$index = i;
        this.$selectedIndex = i2;
        this.$haptics = c0dx;
        this.$onTabClicked = g0v;
        this.$tab = auraTab;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$index != this.$selectedIndex) {
            this.$haptics.AXr(AuraHaptics.SEGMENT_SWITCH);
        }
        AnonymousClass001.A1H(this.$tab, this.$onTabClicked, this.$index);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

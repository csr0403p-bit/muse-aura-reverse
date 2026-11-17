package com.facebook.aura.vds.compose.icons;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0dx;
import X.G0U;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraIconToggleButtonKt$AuraIconToggleButton$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraIconToggleButtonKt$AuraIconToggleButton$2$1(C0dx c0dx, G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$haptics = c0dx;
        this.$onCheckedChange = g0u;
    }

    public final void invoke(boolean z) {
        this.$haptics.AXr(z ? AuraHaptics.TOGGLE_ON : AuraHaptics.TOGGLE_OFF);
        AnonymousClass001.A1K(z, this.$onCheckedChange);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}

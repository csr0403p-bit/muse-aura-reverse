package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0dx;
import X.G0U;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class GoalCheckboxKt$GoalCheckbox$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ G0U<Boolean, Boolean> $onCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalCheckboxKt$GoalCheckbox$2$1(G0U<? super Boolean, Boolean> g0u, C0dx c0dx) {
        super(1);
        this.$onCheckedChange = g0u;
        this.$haptic = c0dx;
    }

    public final void invoke(boolean z) {
        if (!AnonymousClass003.A1X(Boolean.valueOf(z), this.$onCheckedChange) || z) {
            return;
        }
        this.$haptic.AXr(AuraHaptics.BUTTON_TAP);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}

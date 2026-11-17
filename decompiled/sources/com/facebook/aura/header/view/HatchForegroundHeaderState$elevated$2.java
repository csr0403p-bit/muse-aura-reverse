package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchForegroundHeaderState$elevated$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ HatchForegroundHeaderState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchForegroundHeaderState$elevated$2(HatchForegroundHeaderState hatchForegroundHeaderState, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(0);
        this.this$0 = hatchForegroundHeaderState;
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass003.A1Y(this.this$0.available) && (MutableState.A0A(this.$pillMetrics.avatarExpanded$delegate) || this.$pillMetrics.avatarPanelProgress$delegate.AFn() > 0.0f));
    }
}

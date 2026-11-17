package com.facebook.aura.main;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$panelPresent$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$panelPresent$2$1(HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(0);
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$pillMetrics.avatarPanelOwner$delegate.getValue() != null && (MutableState.A0A(this.$pillMetrics.avatarExpanded$delegate) || this.$pillMetrics.avatarPanelProgress$delegate.AFn() > 0.0f));
    }
}

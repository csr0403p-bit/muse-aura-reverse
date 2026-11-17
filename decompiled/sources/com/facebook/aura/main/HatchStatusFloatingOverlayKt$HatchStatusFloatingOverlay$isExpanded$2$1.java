package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$isExpanded$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<AuraNavKey> $topNonOverlay$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$isExpanded$2$1(AuraNavigator auraNavigator, C1BO<? extends AuraNavKey> c1bo) {
        super(0);
        this.$navigator = auraNavigator;
        this.$topNonOverlay$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        AuraNavKey auraNavKeyCurrentKey = this.$navigator.currentKey(true);
        if ((auraNavKeyCurrentKey instanceof HatchStatusScreenKey) || ((auraNavKeyCurrentKey instanceof AuraBottomSheetNavKey) && (this.$topNonOverlay$delegate.getValue() instanceof HatchStatusScreenKey))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

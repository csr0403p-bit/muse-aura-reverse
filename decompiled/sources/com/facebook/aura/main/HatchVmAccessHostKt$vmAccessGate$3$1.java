package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmLoginScreenKey;

/* loaded from: classes.dex */
public final class HatchVmAccessHostKt$vmAccessGate$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavKey $currentDestination;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessHostKt$vmAccessGate$3$1(AuraNavKey auraNavKey, AuraNavigator auraNavigator) {
        super(1);
        this.$currentDestination = auraNavKey;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!(this.$currentDestination instanceof ConfidentialVmLoginScreenKey)) {
            this.$navigator.navigate((AuraNavKey) ConfidentialVmLoginScreenKey.INSTANCE, false);
        }
        return new C78g() { // from class: com.facebook.aura.main.HatchVmAccessHostKt$vmAccessGate$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

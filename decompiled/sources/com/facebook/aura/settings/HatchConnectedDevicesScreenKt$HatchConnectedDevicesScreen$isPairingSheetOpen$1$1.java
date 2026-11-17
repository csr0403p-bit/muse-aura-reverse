package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;
import com.facebook.aura.navigation.key.HatchLinkPairingSheetKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$isPairingSheetOpen$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$isPairingSheetOpen$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AuraNavKey auraNavKeyCurrentKey = this.$navigator.currentKey(true);
        return Boolean.valueOf((auraNavKeyCurrentKey instanceof HatchLinkPairingSheetKey) || (auraNavKeyCurrentKey instanceof HatchLinkActivePairingSheetKey));
    }
}

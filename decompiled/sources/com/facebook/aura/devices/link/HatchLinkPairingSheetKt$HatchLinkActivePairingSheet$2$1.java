package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchLinkActivePairingSheetKey $activePairingKey;
    public final /* synthetic */ AuraNavKey $currentKey;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$2$1(AuraNavKey auraNavKey, HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, AuraNavigator auraNavigator) {
        super(1);
        this.$currentKey = auraNavKey;
        this.$activePairingKey = hatchLinkActivePairingSheetKey;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C7384Etj.areEqual(this.$currentKey, this.$activePairingKey)) {
            this.$navigator.back();
        }
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

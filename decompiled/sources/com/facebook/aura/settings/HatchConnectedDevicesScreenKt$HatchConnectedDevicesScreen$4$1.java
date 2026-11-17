package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C0Yr;
import X.C78g;
import X.C9hr;
import X.F0C;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkPairingPurpose;
import com.facebook.aura.navigation.key.HatchLinkPairingSheetKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<Boolean> $isPairingSheetOpen;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $pairAgainTarget;
    public final /* synthetic */ boolean $showHatchLinks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$4$1(String str, boolean z, Function0<Boolean> function0, AuraNavigator auraNavigator) {
        super(1);
        this.$pairAgainTarget = str;
        this.$showHatchLinks = z;
        this.$isPairingSheetOpen = function0;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$pairAgainTarget != null && this.$showHatchLinks && !AnonymousClass003.A1Y(this.$isPairingSheetOpen)) {
            HatchPendingPairAgain.INSTANCE.setAutoSelectTarget(this.$pairAgainTarget);
            AuraNavigator auraNavigator = this.$navigator;
            F0C<C9hr<Object>>[] f0cArr = HatchLinkPairingSheetKey.$childSerializers;
            auraNavigator.navigate((AuraNavKey) new HatchLinkPairingSheetKey(HatchLinkPairingPurpose.PAIR_AGAIN, false, AnonymousClass002.A0k(), null), false);
        }
        return new C78g() { // from class: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

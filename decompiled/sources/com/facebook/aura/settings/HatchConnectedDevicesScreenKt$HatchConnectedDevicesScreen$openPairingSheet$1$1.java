package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkPairingPurpose;
import com.facebook.aura.navigation.key.HatchLinkPairingSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$openPairingSheet$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Function0<Boolean> $isPairingSheetOpen;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$openPairingSheet$1$1(Function0<Boolean> function0, AuraNavigator auraNavigator) {
        super(1);
        this.$isPairingSheetOpen = function0;
        this.$navigator = auraNavigator;
    }

    public final void invoke(boolean z) {
        if (AnonymousClass003.A1Y(this.$isPairingSheetOpen)) {
            return;
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICES, HatchComponent.PLUS_BUTTON, null, null, null);
        this.$navigator.navigate((AuraNavKey) new HatchLinkPairingSheetKey((HatchLinkPairingPurpose) null, z, (String) null, (String) null, 13, (C06H) null), false);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingMode;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingTriggerSource;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchDevicePairingViewModel$showPairingFlow$startLogger$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $blePermissionAtOpen;
    public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
    public final /* synthetic */ HatchDevicePairingMode $pairingMode;
    public final /* synthetic */ HatchDevicePairingTriggerSource $triggerSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingViewModel$showPairingFlow$startLogger$1(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HatchDevicePairingTriggerSource hatchDevicePairingTriggerSource, HatchDevicePairingMode hatchDevicePairingMode, boolean z) {
        super(0);
        this.$logger = hatchDevicePairingUserFlowLogger;
        this.$triggerSource = hatchDevicePairingTriggerSource;
        this.$pairingMode = hatchDevicePairingMode;
        this.$blePermissionAtOpen = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logger.start(this.$triggerSource, this.$pairingMode, this.$blePermissionAtOpen);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

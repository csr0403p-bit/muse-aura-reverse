package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ List<HatchDeviceWiFiNetwork> $savedNetworks;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        List<HatchDeviceWiFiNetwork> list = this.$savedNetworks;
        HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
        Iterator<HatchDeviceWiFiNetwork> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$3$1$1$1(it.next(), hatchDevicePairingActions), -1851291624);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$3$1(List<HatchDeviceWiFiNetwork> list, HatchDevicePairingActions hatchDevicePairingActions) {
        super(1);
        this.$savedNetworks = list;
        this.$actions = hatchDevicePairingActions;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

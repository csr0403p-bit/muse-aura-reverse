package com.facebook.aura.devices.pairing;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ HatchDevicePairingUiState $state;
    public final /* synthetic */ HatchDevicePairingStrings $strings;

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingStrings hatchDevicePairingStrings, HatchDevicePairingActions hatchDevicePairingActions) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$strings = hatchDevicePairingStrings;
            this.$actions = hatchDevicePairingActions;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String pairingTargetName = this.$state.getPairingTargetName();
                if (pairingTargetName == null) {
                    bfm.AgE(-379019529);
                    int i2 = this.$strings.fallbackDeviceNameRes;
                    bfm.AgE(2138870651);
                    pairingTargetName = AbstractC2271BQs.A01(bfm, i2);
                    AnonymousClass002.A19(bfm);
                } else {
                    bfm.AgE(-379021172);
                }
                AnonymousClass001.A1D(bfm);
                boolean zA67 = bfm.A67(this.$actions);
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1$2$1$1(hatchDevicePairingActions);
                    bfm.Ai0(objAaT);
                }
                HatchDevicePairingBottomSheetsKt.PairingDeviceRow(pairingTargetName, (Function0) objAaT, null, false, false, null, null, bfm, 0, 124);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        if (this.$state.getDiscoveredDevices().isEmpty()) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$state, this.$strings, this.$actions), 187314883);
            return;
        }
        List<HatchDiscoveredDevice> discoveredDevices = this.$state.getDiscoveredDevices();
        HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
        Iterator<HatchDiscoveredDevice> it = discoveredDevices.iterator();
        while (it.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1$1$1(it.next(), hatchDevicePairingActions), -365405055);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings) {
        super(1);
        this.$state = hatchDevicePairingUiState;
        this.$actions = hatchDevicePairingActions;
        this.$strings = hatchDevicePairingStrings;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

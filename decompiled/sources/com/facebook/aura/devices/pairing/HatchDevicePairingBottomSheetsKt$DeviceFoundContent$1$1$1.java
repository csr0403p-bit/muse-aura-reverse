package com.facebook.aura.devices.pairing;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ HatchDevicePairingUiState $state;
    public final /* synthetic */ HatchDevicePairingStrings $strings;

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingStrings hatchDevicePairingStrings) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$strings = hatchDevicePairingStrings;
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
                    bfm.AgE(-218285110);
                    int i2 = this.$strings.fallbackDeviceNameRes;
                    bfm.AgE(2138870651);
                    pairingTargetName = AbstractC2271BQs.A01(bfm, i2);
                    AnonymousClass002.A19(bfm);
                } else {
                    bfm.AgE(-218285947);
                }
                AnonymousClass001.A1D(bfm);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$1$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                HatchDevicePairingBottomSheetsKt.PairingDeviceRow(pairingTargetName, (Function0) objAaT, null, true, false, null, null, bfm, 3120, 116);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$state, this.$strings), 419884118);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$1$1(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingStrings hatchDevicePairingStrings) {
        super(1);
        this.$state = hatchDevicePairingUiState;
        this.$strings = hatchDevicePairingStrings;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

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
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchDevicePairingActions hatchDevicePairingActions) {
            super(3);
            this.$actions = hatchDevicePairingActions;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_wifi_other);
                boolean zA67 = bfm.A67(this.$actions);
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$2$1$1$1$1(hatchDevicePairingActions);
                    bfm.Ai0(objAaT);
                }
                HatchDevicePairingBottomSheetsKt.WifiListRow(strA01, (Function0) objAaT, null, null, bfm, 0, 12);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$actions), 1816116635);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$2$1(HatchDevicePairingActions hatchDevicePairingActions) {
        super(1);
        this.$actions = hatchDevicePairingActions;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

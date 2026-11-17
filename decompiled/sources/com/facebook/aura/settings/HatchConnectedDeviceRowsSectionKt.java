package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectedDeviceRowsSectionKt {

    /* renamed from: com.facebook.aura.settings.HatchConnectedDeviceRowsSectionKt$ConnectedDeviceRowCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConnectedDeviceRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectedDeviceRow connectedDeviceRow) {
            super(2);
            this.$row = connectedDeviceRow;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                Integer num = this.$row.subtitleRes;
                if (num == null) {
                    bfm.AgE(170528019);
                } else {
                    AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass003.A0g(bfm, num, 170528020), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDeviceRowsSectionKt$ConnectedDeviceRowCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectedDeviceRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConnectedDeviceRow connectedDeviceRow, BRg bRg, int i, int i2) {
            super(2);
            this.$row = connectedDeviceRow;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectedDeviceRowsSectionKt.ConnectedDeviceRowCard(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConnectedDeviceRowCard(ConnectedDeviceRow connectedDeviceRow, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectedDeviceRow, 0);
        bfm.AgG(1847518715);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectedDeviceRow, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            int i4 = connectedDeviceRow.iconRes;
            String strA01 = connectedDeviceRow.title;
            if (strA01 == null) {
                bfm.AgE(1643998275);
                strA01 = AbstractC2271BQs.A01(bfm, connectedDeviceRow.titleFallbackRes);
            } else {
                bfm.AgE(1643997872);
            }
            AnonymousClass001.A1D(bfm);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(connectedDeviceRow), 391282996);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(connectedDeviceRow))) {
                z = true;
            }
            boolean z2 = zA67 | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchConnectedDeviceRowsSectionKt$ConnectedDeviceRowCard$2$1(auraNavigatorA0b, connectedDeviceRow);
                bfm.Ai0(objAaT);
            }
            HatchDeviceRowPartsKt.DeviceRowCard(i4, strA01, b1uA00, AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(bRg2, (Function0) objAaT, null, 0, null), false, bfm, 384, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(connectedDeviceRow, bRg2, i, i2);
        }
    }
}

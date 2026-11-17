package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0W;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchGadgetsSectionKt$GadgetsSection$2$1$1$2$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ ConnectedDeviceRow $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGadgetsSectionKt$GadgetsSection$2$1$1$2$1(ConnectedDeviceRow connectedDeviceRow) {
        super(3);
        this.$row = connectedDeviceRow;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchConnectedDeviceRowsSectionKt.ConnectedDeviceRowCard(this.$row, null, bfm, ConnectedDeviceRow.$stable, 2);
        } else {
            bfm.Afo();
        }
    }
}

package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ G0U<NodeListEntry, Boolean> $canRemoveDevice;
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onRemoveDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1(NodeListEntry nodeListEntry, G0U<? super NodeListEntry, Unit> g0u, G0U<? super NodeListEntry, Boolean> g0u2, G0U<? super NodeListEntry, Unit> g0u3) {
        super(3);
        this.$device = nodeListEntry;
        this.$onDeviceClick = g0u;
        this.$canRemoveDevice = g0u2;
        this.$onRemoveDevice = g0u3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        BBI bbi;
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Ag8(-928730973, this.$device.nodeId);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDeviceClick, bfm.A67(this.$device));
            NodeListEntry nodeListEntry = this.$device;
            G0U<NodeListEntry, Unit> g0u = this.$onDeviceClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1$openDevice$1$1(nodeListEntry, g0u);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            B1U b1uA00 = B1V.A00(bfm, new HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1$content$1(this.$device), 823961498);
            if (AnonymousClass003.A1X(this.$device, this.$canRemoveDevice)) {
                bfm.AgE(1274731345);
                HatchConnectedDevicesScreenKt.RemovableDevice(this.$device, function0, this.$onRemoveDevice, null, b1uA00, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 8);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1274955258);
                b1uA00.invoke(AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(BRg.A00, function0, null, 0, null), bfm, 48);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            return;
        }
        bfm.Afo();
    }
}

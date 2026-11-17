package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1$content$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ NodeListEntry $device;

    /* renamed from: com.facebook.aura.settings.HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1$content$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NodeListEntry $device;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NodeListEntry nodeListEntry) {
            super(2);
            this.$device = nodeListEntry;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchDeviceRowPartsKt.DeviceStatusLine(this.$device, null, null, bfm, 48, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1$content$1(NodeListEntry nodeListEntry) {
        super(3);
        this.$device = nodeListEntry;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            int iDeviceIconRes = HatchDeviceRowPartsKt.deviceIconRes(this.$device);
            NodeListEntry nodeListEntry = this.$device;
            String str = nodeListEntry.displayName;
            if (str.length() == 0) {
                str = nodeListEntry.nodeId;
            }
            HatchDeviceRowPartsKt.DeviceRowCard(iDeviceIconRes, str, B1V.A00(bfm, new AnonymousClass2(this.$device), -1051645869), bRg, HatchDeviceRowPartsKt.opensInMetaAi(nodeListEntry), bfm, ((i << 9) & 7168) | 384, 0);
            return;
        }
        bfm.Afo();
    }
}

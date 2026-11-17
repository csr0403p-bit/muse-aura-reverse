package com.facebook.aura.settings;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchGadgetsSectionKt$GadgetsSection$2$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
    public final /* synthetic */ ConnectedDeviceSections $sections;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<GadgetRow> ahd = this.$sections.gadgets;
        G0U<NodeListEntry, Unit> g0u = this.$onDeviceClick;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new HatchGadgetsSectionKt$GadgetsSection$2$1$1$1$1((GadgetRow) it.next(), g0u), -52449980);
        }
        Iterator it2 = this.$sections.bluetoothGadgets.iterator();
        while (it2.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new HatchGadgetsSectionKt$GadgetsSection$2$1$1$2$1((ConnectedDeviceRow) it2.next()), 984877854);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGadgetsSectionKt$GadgetsSection$2$1$1(ConnectedDeviceSections connectedDeviceSections, G0U<? super NodeListEntry, Unit> g0u) {
        super(1);
        this.$sections = connectedDeviceSections;
        this.$onDeviceClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

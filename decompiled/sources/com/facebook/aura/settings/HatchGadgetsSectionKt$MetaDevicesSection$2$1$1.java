package com.facebook.aura.settings;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchGadgetsSectionKt$MetaDevicesSection$2$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ G0U<NodeListEntry, Boolean> $canRemoveDevice;
    public final /* synthetic */ AHD<NodeListEntry> $devices;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onRemoveDevice;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<NodeListEntry> ahd = this.$devices;
        G0U<NodeListEntry, Unit> g0u = this.$onDeviceClick;
        G0U<NodeListEntry, Boolean> g0u2 = this.$canRemoveDevice;
        G0U<NodeListEntry, Unit> g0u3 = this.$onRemoveDevice;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new HatchGadgetsSectionKt$MetaDevicesSection$2$1$1$1$1((NodeListEntry) it.next(), g0u, g0u2, g0u3), 365513617);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGadgetsSectionKt$MetaDevicesSection$2$1$1(AHD<NodeListEntry> ahd, G0U<? super NodeListEntry, Unit> g0u, G0U<? super NodeListEntry, Boolean> g0u2, G0U<? super NodeListEntry, Unit> g0u3) {
        super(1);
        this.$devices = ahd;
        this.$onDeviceClick = g0u;
        this.$canRemoveDevice = g0u2;
        this.$onRemoveDevice = g0u3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

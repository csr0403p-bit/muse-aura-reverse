package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGadgetsSectionKt$GadgetDeviceRow$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGadgetsSectionKt$GadgetDeviceRow$3$1(NodeListEntry nodeListEntry, G0U<? super NodeListEntry, Unit> g0u) {
        super(0);
        this.$device = nodeListEntry;
        this.$onDeviceClick = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchDeviceRowPartsKt.logDeviceRowClick(this.$device, false);
        this.$onDeviceClick.invoke(this.$device);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

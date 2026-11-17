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
public final class HatchAppsSectionKt$ThisDeviceSection$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ AHD<NodeListEntry> $devices;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<NodeListEntry> ahd = this.$devices;
        G0U<NodeListEntry, Unit> g0u = this.$onDeviceClick;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new HatchAppsSectionKt$ThisDeviceSection$1$1$1$1$1((NodeListEntry) it.next(), g0u), -511796344);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAppsSectionKt$ThisDeviceSection$1$1$1(AHD<NodeListEntry> ahd, G0U<? super NodeListEntry, Unit> g0u) {
        super(1);
        this.$devices = ahd;
        this.$onDeviceClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

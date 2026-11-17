package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0U;
import X.G0W;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAppsSectionKt$ThisDeviceSection$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAppsSectionKt$ThisDeviceSection$1$1$1$1$1(NodeListEntry nodeListEntry, G0U<? super NodeListEntry, Unit> g0u) {
        super(3);
        this.$device = nodeListEntry;
        this.$onDeviceClick = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchAppsSectionKt.AppDeviceRow(this.$device, true, this.$onDeviceClick, null, bfm, 48, 8);
        } else {
            bfm.Afo();
        }
    }
}

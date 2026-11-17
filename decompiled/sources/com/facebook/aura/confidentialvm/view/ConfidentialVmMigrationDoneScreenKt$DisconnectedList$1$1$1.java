package com.facebook.aura.confidentialvm.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDisconnectedItem;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneScreenKt$DisconnectedList$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ AHD<ConfidentialVmDisconnectedItem> $items;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Iterator it = this.$items.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new ConfidentialVmMigrationDoneScreenKt$DisconnectedList$1$1$1$1$1((ConfidentialVmDisconnectedItem) it.next()), -348188431);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmMigrationDoneScreenKt$DisconnectedList$1$1$1(AHD<ConfidentialVmDisconnectedItem> ahd) {
        super(1);
        this.$items = ahd;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

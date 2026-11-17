package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0W;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDisconnectedItem;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneScreenKt$DisconnectedList$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ ConfidentialVmDisconnectedItem $disconnected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmMigrationDoneScreenKt$DisconnectedList$1$1$1$1$1(ConfidentialVmDisconnectedItem confidentialVmDisconnectedItem) {
        super(3);
        this.$disconnected = confidentialVmDisconnectedItem;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            ConfidentialVmMigrationDoneScreenKt.DisconnectedRow(this.$disconnected, null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

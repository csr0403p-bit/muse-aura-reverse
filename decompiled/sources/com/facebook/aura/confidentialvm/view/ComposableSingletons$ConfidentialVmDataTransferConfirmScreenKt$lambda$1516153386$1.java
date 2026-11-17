package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C1SA;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* renamed from: com.facebook.aura.confidentialvm.view.ComposableSingletons$ConfidentialVmDataTransferConfirmScreenKt$lambda$-1516153386$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmDataTransferConfirmScreenKt$lambda$1516153386$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmDataTransferConfirmScreenKt$lambda$1516153386$1 INSTANCE = new ComposableSingletons$ConfidentialVmDataTransferConfirmScreenKt$lambda$1516153386$1();

    public ComposableSingletons$ConfidentialVmDataTransferConfirmScreenKt$lambda$1516153386$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            C1SA.A02(bfm, BRg.A00, BOf.A00(bfm, R.drawable.confidential_vm_data_transfer_illustration, 0), 64.0f);
        } else {
            bfm.Afo();
        }
    }
}

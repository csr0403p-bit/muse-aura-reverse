package com.facebook.aura.confidentialvm.view.setup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmProgressLayoutKt$ConfidentialVmProgressLayout$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmProgressLayoutKt$ConfidentialVmProgressLayout$1$1(String str, String str2) {
        super(2);
        this.$title = str;
        this.$description = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            ConfidentialVmProgressLayoutKt.ConfidentialVmProgressCopy(this.$title, this.$description, null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
    }
}

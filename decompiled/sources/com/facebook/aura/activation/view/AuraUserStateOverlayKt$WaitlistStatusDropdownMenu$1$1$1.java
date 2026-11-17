package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C0yq;
import X.C5b2;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C5b2 $status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$1(C5b2 c5b2) {
        super(2);
        this.$status = c5b2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            C0yq.A00(bfm, null, null, null, null, null, null, null, this.$status.name(), null, 0, 0, 0, 0, 0, 131070, 0L, 0L, 0L, 0L, false);
        } else {
            bfm.Afo();
        }
    }
}

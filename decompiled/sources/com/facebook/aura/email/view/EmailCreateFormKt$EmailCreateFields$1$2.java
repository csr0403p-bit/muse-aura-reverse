package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.email.viewmodel.EmailState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailCreateFormKt$EmailCreateFields$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ EmailState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailCreateFormKt$EmailCreateFields$1$2(EmailState emailState) {
        super(2);
        this.$state = emailState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            EmailCreateFormKt.EmailAvailabilityIcon(this.$state.addressAvailability, null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }
}

package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.email.viewmodel.EmailState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSenderNameErrorKt$EmailSenderNameError$message$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ EmailState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSenderNameErrorKt$EmailSenderNameError$message$1(EmailState emailState, BRg bRg, int i, int i2) {
        super(2);
        this.$state = emailState;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        EmailSenderNameErrorKt.EmailSenderNameError(this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

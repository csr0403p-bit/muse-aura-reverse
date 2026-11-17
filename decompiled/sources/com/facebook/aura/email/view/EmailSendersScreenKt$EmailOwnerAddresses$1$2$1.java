package com.facebook.aura.email.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.view.EmailSendersScreenKt$EmailOwnerAddresses$1$2$1", f = "EmailSendersScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailSendersScreenKt$EmailOwnerAddresses$1$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ EmailViewModel $model;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSendersScreenKt$EmailOwnerAddresses$1$2$1(EmailViewModel emailViewModel, HtJ<? super EmailSendersScreenKt$EmailOwnerAddresses$1$2$1> htJ) {
        super(2, htJ);
        this.$model = emailViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmailSendersScreenKt$EmailOwnerAddresses$1$2$1(this.$model, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$model.loadSenders(true, false);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new EmailSendersScreenKt$EmailOwnerAddresses$1$2$1(this.$model, htJ).invokeSuspend(Unit.INSTANCE);
    }
}

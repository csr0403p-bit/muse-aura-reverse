package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSendersScreenKt$EmailSendersScreen$2$1 extends AbstractC7559F3s implements G0U<EmailViewModel, Unit> {
    public static final EmailSendersScreenKt$EmailSendersScreen$2$1 INSTANCE = new EmailSendersScreenKt$EmailSendersScreen$2$1();

    public EmailSendersScreenKt$EmailSendersScreen$2$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EmailViewModel emailViewModel) {
        C7384Etj.A0Y(emailViewModel, 0);
        emailViewModel.loadSenders(false, true);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel) {
        invoke2(emailViewModel);
        return Unit.INSTANCE;
    }
}

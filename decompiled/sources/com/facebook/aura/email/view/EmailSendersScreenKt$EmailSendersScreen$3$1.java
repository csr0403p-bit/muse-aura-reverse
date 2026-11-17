package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailState;

/* loaded from: classes.dex */
public final class EmailSendersScreenKt$EmailSendersScreen$3$1 extends AbstractC7559F3s implements G0U<EmailState, Boolean> {
    public static final EmailSendersScreenKt$EmailSendersScreen$3$1 INSTANCE = new EmailSendersScreenKt$EmailSendersScreen$3$1();

    public EmailSendersScreenKt$EmailSendersScreen$3$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(EmailState emailState) {
        C7384Etj.A0Y(emailState, 0);
        return Boolean.valueOf(emailState.sendersPullRefreshing);
    }
}

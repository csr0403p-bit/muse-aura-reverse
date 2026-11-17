package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailState;

/* loaded from: classes.dex */
public final class EmailAddSenderScreenKt$EmailAddSenderScreen$1$1 extends AbstractC7559F3s implements G0U<EmailState, Boolean> {
    public static final EmailAddSenderScreenKt$EmailAddSenderScreen$1$1 INSTANCE = new EmailAddSenderScreenKt$EmailAddSenderScreen$1$1();

    public EmailAddSenderScreenKt$EmailAddSenderScreen$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(EmailState emailState) {
        C7384Etj.A0Y(emailState, 0);
        return Boolean.valueOf(emailState.confirmingOwner);
    }
}

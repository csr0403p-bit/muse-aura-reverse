package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.viewmodel.EmailState;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailSettingsScreen$1$1 extends AbstractC7559F3s implements G0U<EmailState, Boolean> {
    public static final EmailSettingsScreenKt$EmailSettingsScreen$1$1 INSTANCE = new EmailSettingsScreenKt$EmailSettingsScreen$1$1();

    public EmailSettingsScreenKt$EmailSettingsScreen$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(EmailState emailState) {
        C7384Etj.A0Y(emailState, 0);
        EmailMailbox emailMailbox = emailState.mailbox;
        boolean z = false;
        if (emailMailbox != null && !emailMailbox.isTakenDown()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

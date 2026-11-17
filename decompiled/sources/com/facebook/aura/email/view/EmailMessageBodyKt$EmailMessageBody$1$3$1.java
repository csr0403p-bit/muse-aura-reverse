package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.model.EmailBodyPart;

/* loaded from: classes.dex */
public final class EmailMessageBodyKt$EmailMessageBody$1$3$1 extends AbstractC7559F3s implements G0U<EmailBodyPart, CharSequence> {
    public static final EmailMessageBodyKt$EmailMessageBody$1$3$1 INSTANCE = new EmailMessageBodyKt$EmailMessageBody$1$3$1();

    public EmailMessageBodyKt$EmailMessageBody$1$3$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(EmailBodyPart emailBodyPart) {
        EmailBodyPart emailBodyPart2 = emailBodyPart;
        C7384Etj.A0Y(emailBodyPart2, 0);
        return emailBodyPart2.text;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(EmailBodyPart emailBodyPart) {
        C7384Etj.A0Y(emailBodyPart, 0);
        return emailBodyPart.text;
    }
}

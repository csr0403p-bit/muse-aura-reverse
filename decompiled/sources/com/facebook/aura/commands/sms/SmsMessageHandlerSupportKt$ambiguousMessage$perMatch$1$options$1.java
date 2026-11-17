package com.facebook.aura.commands.sms;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;

/* loaded from: classes3.dex */
public final class SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1$options$1 extends AbstractC7559F3s implements G0U<ContactCandidate, CharSequence> {
    public static final SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1$options$1 INSTANCE = new SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1$options$1();

    public SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1$options$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(ContactCandidate contactCandidate) {
        C7384Etj.A0Y(contactCandidate, 0);
        return FGI.A0j(contactCandidate.name, " (", contactCandidate.phone, ", contact_id ", contactCandidate.contactId, ")");
    }
}

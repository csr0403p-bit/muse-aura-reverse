package com.facebook.aura.commands.sms;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class SmsMessageHandlerSupportKt$resolveMessageRecipients$resolution$1 extends AbstractC7559F3s implements G0U<RequestedRecipient, CharSequence> {
    public static final SmsMessageHandlerSupportKt$resolveMessageRecipients$resolution$1 INSTANCE = new SmsMessageHandlerSupportKt$resolveMessageRecipients$resolution$1();

    public SmsMessageHandlerSupportKt$resolveMessageRecipients$resolution$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(RequestedRecipient requestedRecipient) {
        RequestedRecipient requestedRecipient2 = requestedRecipient;
        C7384Etj.A0Y(requestedRecipient2, 0);
        return requestedRecipient2.address;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(RequestedRecipient requestedRecipient) {
        C7384Etj.A0Y(requestedRecipient, 0);
        return requestedRecipient.address;
    }
}

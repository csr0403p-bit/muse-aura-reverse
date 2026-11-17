package com.facebook.aura.commands.sms;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;

/* loaded from: classes3.dex */
public final class SmsMessageHandlerSupportKt$unverifiedNameMessage$summary$1 extends AbstractC7559F3s implements G0U<UnconfirmedName, CharSequence> {
    public static final SmsMessageHandlerSupportKt$unverifiedNameMessage$summary$1 INSTANCE = new SmsMessageHandlerSupportKt$unverifiedNameMessage$summary$1();

    public SmsMessageHandlerSupportKt$unverifiedNameMessage$summary$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(UnconfirmedName unconfirmedName) {
        C7384Etj.A0Y(unconfirmedName, 0);
        return FGI.A0d("\"", unconfirmedName.claimedName, "\" \u2192 ", unconfirmedName.address);
    }
}

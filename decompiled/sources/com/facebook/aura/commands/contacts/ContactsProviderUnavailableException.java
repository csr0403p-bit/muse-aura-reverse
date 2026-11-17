package com.facebook.aura.commands.contacts;

import X.C7384Etj;
import X.FGI;

/* loaded from: classes3.dex */
public final class ContactsProviderUnavailableException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsProviderUnavailableException(String str) {
        super(FGI.A0M("Contacts provider returned no cursor for ", str));
        C7384Etj.A0Y(str, 0);
    }
}

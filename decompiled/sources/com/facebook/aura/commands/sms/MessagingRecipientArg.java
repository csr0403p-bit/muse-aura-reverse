package com.facebook.aura.commands.sms;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class MessagingRecipientArg extends C06G {
    public final String address;
    public final String contactName;

    public MessagingRecipientArg(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.address = str;
        this.contactName = str2;
    }

    public final MessagingRecipientArg copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new MessagingRecipientArg(str, str2);
    }

    public static /* synthetic */ MessagingRecipientArg copy$default(MessagingRecipientArg messagingRecipientArg, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagingRecipientArg.address;
        }
        if ((i & 2) != 0) {
            str2 = messagingRecipientArg.contactName;
        }
        C7384Etj.A0Y(str, 0);
        return new MessagingRecipientArg(str, str2);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.contactName;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingRecipientArg(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}

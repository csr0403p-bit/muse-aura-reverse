package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class MessagingCardRecipient extends C06G {
    public static final int $stable = 0;
    public final String address;
    public final String contactName;

    public MessagingCardRecipient(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.address = str;
        this.contactName = str2;
    }

    public final MessagingCardRecipient copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new MessagingCardRecipient(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessagingCardRecipient) {
                MessagingCardRecipient messagingCardRecipient = (MessagingCardRecipient) obj;
                if (!C7384Etj.areEqual(this.address, messagingCardRecipient.address) || !C7384Etj.areEqual(this.contactName, messagingCardRecipient.contactName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessagingCardRecipient copy$default(MessagingCardRecipient messagingCardRecipient, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagingCardRecipient.address;
        }
        if ((i & 2) != 0) {
            str2 = messagingCardRecipient.contactName;
        }
        C7384Etj.A0Y(str, 0);
        return new MessagingCardRecipient(str, str2);
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

    public int hashCode() {
        return AnonymousClass001.A0G(this.address) + AnonymousClass006.A0G(this.contactName);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingCardRecipient(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}

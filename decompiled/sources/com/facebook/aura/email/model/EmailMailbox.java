package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailMailbox extends C06G {
    public final String emailAddress;
    public final String environmentId;
    public final String handle;
    public final String id;
    public final String name;
    public final EmailMailboxRestriction restriction;
    public final EmailRestrictionNotice restrictionNotice;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailMailbox) {
                EmailMailbox emailMailbox = (EmailMailbox) obj;
                if (!C7384Etj.areEqual(this.id, emailMailbox.id) || !C7384Etj.areEqual(this.environmentId, emailMailbox.environmentId) || !C7384Etj.areEqual(this.name, emailMailbox.name) || !C7384Etj.areEqual(this.handle, emailMailbox.handle) || !C7384Etj.areEqual(this.emailAddress, emailMailbox.emailAddress) || this.restriction != emailMailbox.restriction || !C7384Etj.areEqual(this.restrictionNotice, emailMailbox.restrictionNotice)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailMailbox copy$default(EmailMailbox emailMailbox, String str, String str2, String str3, String str4, String str5, EmailMailboxRestriction emailMailboxRestriction, EmailRestrictionNotice emailRestrictionNotice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailMailbox.id;
        }
        if ((i & 2) != 0) {
            str2 = emailMailbox.environmentId;
        }
        if ((i & 4) != 0) {
            str3 = emailMailbox.name;
        }
        if ((i & 8) != 0) {
            str4 = emailMailbox.handle;
        }
        if ((i & 16) != 0) {
            str5 = emailMailbox.emailAddress;
        }
        if ((i & 32) != 0) {
            emailMailboxRestriction = emailMailbox.restriction;
        }
        if ((i & 64) != 0) {
            emailRestrictionNotice = emailMailbox.restrictionNotice;
        }
        return emailMailbox.copy(str, str2, str3, str4, str5, emailMailboxRestriction, emailRestrictionNotice);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.environmentId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.handle;
    }

    public final String component5() {
        return this.emailAddress;
    }

    public final EmailMailboxRestriction component6() {
        return this.restriction;
    }

    public final EmailRestrictionNotice component7() {
        return this.restrictionNotice;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getRequiresSenderNameChange() {
        return AnonymousClass002.A1Z(this.restriction, EmailMailboxRestriction.SENDER_NAME_CHANGE_REQUIRED);
    }

    public final EmailMailboxRestriction getRestriction() {
        return this.restriction;
    }

    public final EmailRestrictionNotice getRestrictionNotice() {
        return this.restrictionNotice;
    }

    public final EmailRestrictionNotice getSenderNameNotice() {
        EmailRestrictionNotice emailRestrictionNotice = this.restrictionNotice;
        if (getRequiresSenderNameChange()) {
            return emailRestrictionNotice;
        }
        return null;
    }

    public final EmailRestrictionNotice getTakenDownNotice() {
        EmailRestrictionNotice emailRestrictionNotice = this.restrictionNotice;
        if (isTakenDown()) {
            return emailRestrictionNotice;
        }
        return null;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.emailAddress, AnonymousClass005.A0I(this.handle, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.environmentId, AnonymousClass001.A0G(this.id))))) + AnonymousClass006.A0D(this.restriction)) * 31) + C06G.A04(this.restrictionNotice);
    }

    public final boolean isTakenDown() {
        return AnonymousClass002.A1Z(this.restriction, EmailMailboxRestriction.TAKEN_DOWN);
    }

    public EmailMailbox(String str, String str2, String str3, String str4, String str5, EmailMailboxRestriction emailMailboxRestriction, EmailRestrictionNotice emailRestrictionNotice) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.id = str;
        this.environmentId = str2;
        this.name = str3;
        this.handle = str4;
        this.emailAddress = str5;
        this.restriction = emailMailboxRestriction;
        this.restrictionNotice = emailRestrictionNotice;
    }

    public final EmailMailbox copy(String str, String str2, String str3, String str4, String str5, EmailMailboxRestriction emailMailboxRestriction, EmailRestrictionNotice emailRestrictionNotice) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new EmailMailbox(str, str2, str3, str4, str5, emailMailboxRestriction, emailRestrictionNotice);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailMailbox(String str, String str2, String str3, String str4, String str5, EmailMailboxRestriction emailMailboxRestriction, EmailRestrictionNotice emailRestrictionNotice, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : emailMailboxRestriction, (i & 64) != 0 ? null : emailRestrictionNotice);
    }
}

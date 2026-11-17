package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailRestrictionNotice extends C06G {
    public final EmailRestrictionAction action;
    public final String body;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailRestrictionNotice) {
                EmailRestrictionNotice emailRestrictionNotice = (EmailRestrictionNotice) obj;
                if (!C7384Etj.areEqual(this.title, emailRestrictionNotice.title) || !C7384Etj.areEqual(this.body, emailRestrictionNotice.body) || !C7384Etj.areEqual(this.action, emailRestrictionNotice.action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailRestrictionNotice copy$default(EmailRestrictionNotice emailRestrictionNotice, String str, String str2, EmailRestrictionAction emailRestrictionAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailRestrictionNotice.title;
        }
        if ((i & 2) != 0) {
            str2 = emailRestrictionNotice.body;
        }
        if ((i & 4) != 0) {
            emailRestrictionAction = emailRestrictionNotice.action;
        }
        return emailRestrictionNotice.copy(str, str2, emailRestrictionAction);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final EmailRestrictionAction component3() {
        return this.action;
    }

    public final EmailRestrictionAction getAction() {
        return this.action;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.body, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0D(this.action);
    }

    public EmailRestrictionNotice(String str, String str2, EmailRestrictionAction emailRestrictionAction) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.body = str2;
        this.action = emailRestrictionAction;
    }

    public final EmailRestrictionNotice copy(String str, String str2, EmailRestrictionAction emailRestrictionAction) {
        AnonymousClass003.A0u(str, str2);
        return new EmailRestrictionNotice(str, str2, emailRestrictionAction);
    }

    public String toString() {
        return super.toString();
    }
}

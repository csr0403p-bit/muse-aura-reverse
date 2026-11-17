package com.facebook.aura.email.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailOwnerVerification extends C06G {
    public final String challengeId;
    public final EmailSender owner;

    public EmailOwnerVerification(EmailSender emailSender, String str) {
        C7384Etj.A0Y(emailSender, 0);
        this.owner = emailSender;
        this.challengeId = str;
    }

    public final EmailOwnerVerification copy(EmailSender emailSender, String str) {
        C7384Etj.A0Y(emailSender, 0);
        return new EmailOwnerVerification(emailSender, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailOwnerVerification) {
                EmailOwnerVerification emailOwnerVerification = (EmailOwnerVerification) obj;
                if (!C7384Etj.areEqual(this.owner, emailOwnerVerification.owner) || !C7384Etj.areEqual(this.challengeId, emailOwnerVerification.challengeId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailOwnerVerification copy$default(EmailOwnerVerification emailOwnerVerification, EmailSender emailSender, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            emailSender = emailOwnerVerification.owner;
        }
        if ((i & 2) != 0) {
            str = emailOwnerVerification.challengeId;
        }
        C7384Etj.A0Y(emailSender, 0);
        return new EmailOwnerVerification(emailSender, str);
    }

    public final EmailSender component1() {
        return this.owner;
    }

    public final String component2() {
        return this.challengeId;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final EmailSender getOwner() {
        return this.owner;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.owner) + AnonymousClass006.A0G(this.challengeId);
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailBodyPart extends C06G {
    public final boolean isQuote;
    public final String text;

    public EmailBodyPart(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.isQuote = z;
    }

    public final EmailBodyPart copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new EmailBodyPart(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailBodyPart) {
                EmailBodyPart emailBodyPart = (EmailBodyPart) obj;
                if (!C7384Etj.areEqual(this.text, emailBodyPart.text) || this.isQuote != emailBodyPart.isQuote) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailBodyPart copy$default(EmailBodyPart emailBodyPart, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailBodyPart.text;
        }
        if ((i & 2) != 0) {
            z = emailBodyPart.isQuote;
        }
        C7384Etj.A0Y(str, 0);
        return new EmailBodyPart(str, z);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isQuote;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.text), this.isQuote);
    }

    public final boolean isQuote() {
        return this.isQuote;
    }

    public String toString() {
        return super.toString();
    }
}

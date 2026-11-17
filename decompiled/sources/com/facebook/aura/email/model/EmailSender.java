package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* loaded from: classes.dex */
public final class EmailSender extends C06G {
    public final String emailAddress;
    public final String id;
    public final String status;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSender) {
                EmailSender emailSender = (EmailSender) obj;
                if (!C7384Etj.areEqual(this.id, emailSender.id) || !C7384Etj.areEqual(this.emailAddress, emailSender.emailAddress) || !C7384Etj.areEqual(this.status, emailSender.status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSender copy$default(EmailSender emailSender, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSender.id;
        }
        if ((i & 2) != 0) {
            str2 = emailSender.emailAddress;
        }
        if ((i & 4) != 0) {
            str3 = emailSender.status;
        }
        return emailSender.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.emailAddress;
    }

    public final String component3() {
        return this.status;
    }

    public final boolean getCanVerify() {
        String str = this.status;
        return HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING.equals(str) || "PROVISIONAL".equals(str);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.status, AnonymousClass005.A0I(this.emailAddress, AnonymousClass001.A0G(this.id)));
    }

    public EmailSender(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.emailAddress = str2;
        this.status = str3;
    }

    public final EmailSender copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new EmailSender(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}

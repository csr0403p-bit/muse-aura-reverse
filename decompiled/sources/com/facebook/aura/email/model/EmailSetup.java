package com.facebook.aura.email.model;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06827l3;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class EmailSetup extends C06G {
    public final EmailSetupDisplay display;
    public final String domain;
    public final String handle;
    public final String name;
    public final String senderName;

    public EmailSetup(String str, String str2, String str3, String str4, EmailSetupDisplay emailSetupDisplay) {
        AnonymousClass002.A1C(str2, 1, emailSetupDisplay);
        this.name = str;
        this.domain = str2;
        this.handle = str3;
        this.senderName = str4;
        this.display = emailSetupDisplay;
    }

    public final EmailSetup copy(String str, String str2, String str3, String str4, EmailSetupDisplay emailSetupDisplay) {
        AnonymousClass002.A1C(str2, 1, emailSetupDisplay);
        return new EmailSetup(str, str2, str3, str4, emailSetupDisplay);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetup) {
                EmailSetup emailSetup = (EmailSetup) obj;
                if (!C7384Etj.areEqual(this.name, emailSetup.name) || !C7384Etj.areEqual(this.domain, emailSetup.domain) || !C7384Etj.areEqual(this.handle, emailSetup.handle) || !C7384Etj.areEqual(this.senderName, emailSetup.senderName) || !C7384Etj.areEqual(this.display, emailSetup.display)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetup copy$default(EmailSetup emailSetup, String str, String str2, String str3, String str4, EmailSetupDisplay emailSetupDisplay, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSetup.name;
        }
        if ((i & 2) != 0) {
            str2 = emailSetup.domain;
        }
        if ((i & 4) != 0) {
            str3 = emailSetup.handle;
        }
        if ((i & 8) != 0) {
            str4 = emailSetup.senderName;
        }
        if ((i & 16) != 0) {
            emailSetupDisplay = emailSetup.display;
        }
        return emailSetup.copy(str, str2, str3, str4, emailSetupDisplay);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.domain;
    }

    public final String component3() {
        return this.handle;
    }

    public final String component4() {
        return this.senderName;
    }

    public final EmailSetupDisplay component5() {
        return this.display;
    }

    public final EmailSetupDisplay getDisplay() {
        return this.display;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerFirstName() {
        String strA0l;
        List listA05;
        String str;
        String str2 = this.name;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || (listA05 = new C06827l3("\\s+").A05(strA0l)) == null || (str = (String) AbstractC0878AGe.A0G(listA05)) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.display, (((AnonymousClass005.A0I(this.domain, AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.handle)) * 31) + AnonymousClass005.A0H(this.senderName)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSetup(String str, String str2, String str3, String str4, EmailSetupDisplay emailSetupDisplay, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? new EmailSetupDisplay(null, null, null, null, null, null, null, null, null, null, null) : emailSetupDisplay);
    }
}

package com.facebook.aura.email.model;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailPermissionMethod extends C06G {
    public final String key;
    public final EmailSendPermission mode;
    public final boolean needsVerifiedEmail;
    public final AHD<EmailSendPermission> options;
    public final boolean restricted;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailPermissionMethod) {
                EmailPermissionMethod emailPermissionMethod = (EmailPermissionMethod) obj;
                if (!C7384Etj.areEqual(this.key, emailPermissionMethod.key) || !C7384Etj.areEqual(this.title, emailPermissionMethod.title) || this.mode != emailPermissionMethod.mode || !C7384Etj.areEqual(this.options, emailPermissionMethod.options) || this.restricted != emailPermissionMethod.restricted || this.needsVerifiedEmail != emailPermissionMethod.needsVerifiedEmail) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailPermissionMethod copy$default(EmailPermissionMethod emailPermissionMethod, String str, String str2, EmailSendPermission emailSendPermission, AHD ahd, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailPermissionMethod.key;
        }
        if ((i & 2) != 0) {
            str2 = emailPermissionMethod.title;
        }
        if ((i & 4) != 0) {
            emailSendPermission = emailPermissionMethod.mode;
        }
        if ((i & 8) != 0) {
            ahd = emailPermissionMethod.options;
        }
        if ((i & 16) != 0) {
            z = emailPermissionMethod.restricted;
        }
        if ((i & 32) != 0) {
            z2 = emailPermissionMethod.needsVerifiedEmail;
        }
        return emailPermissionMethod.copy(str, str2, emailSendPermission, ahd, z, z2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.title;
    }

    public final EmailSendPermission component3() {
        return this.mode;
    }

    public final AHD<EmailSendPermission> component4() {
        return this.options;
    }

    public final boolean component5() {
        return this.restricted;
    }

    public final boolean component6() {
        return this.needsVerifiedEmail;
    }

    public final String getKey() {
        return this.key;
    }

    public final EmailSendPermission getMode() {
        return this.mode;
    }

    public final boolean getNeedsVerifiedEmail() {
        return this.needsVerifiedEmail;
    }

    public final AHD<EmailSendPermission> getOptions() {
        return this.options;
    }

    public final boolean getRestricted() {
        return this.restricted;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.options, AnonymousClass005.A0F(this.mode, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.key)))), this.restricted), this.needsVerifiedEmail);
    }

    public final boolean isEditable() {
        return (this.restricted || this.needsVerifiedEmail || this.options.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailPermissionMethod(String str, String str2, EmailSendPermission emailSendPermission, AHD<? extends EmailSendPermission> ahd, boolean z, boolean z2) {
        AnonymousClass005.A14(str, str2, emailSendPermission, ahd);
        this.key = str;
        this.title = str2;
        this.mode = emailSendPermission;
        this.options = ahd;
        this.restricted = z;
        this.needsVerifiedEmail = z2;
    }

    public final EmailPermissionMethod copy(String str, String str2, EmailSendPermission emailSendPermission, AHD<? extends EmailSendPermission> ahd, boolean z, boolean z2) {
        AnonymousClass005.A14(str, str2, emailSendPermission, ahd);
        return new EmailPermissionMethod(str, str2, emailSendPermission, ahd, z, z2);
    }

    public String toString() {
        return super.toString();
    }
}

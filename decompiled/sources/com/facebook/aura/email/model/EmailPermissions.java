package com.facebook.aura.email.model;

import X.AHD;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailPermissions extends C06G {
    public final AHD<EmailPermissionMethod> methods;

    public EmailPermissions(AHD<EmailPermissionMethod> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.methods = ahd;
    }

    public final EmailPermissions copy(AHD<EmailPermissionMethod> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new EmailPermissions(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailPermissions) && C7384Etj.areEqual(this.methods, ((EmailPermissions) obj).methods));
    }

    public static /* synthetic */ EmailPermissions copy$default(EmailPermissions emailPermissions, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = emailPermissions.methods;
        }
        C7384Etj.A0Y(ahd, 0);
        return new EmailPermissions(ahd);
    }

    public final AHD<EmailPermissionMethod> component1() {
        return this.methods;
    }

    public final AHD<EmailPermissionMethod> getMethods() {
        return this.methods;
    }

    public int hashCode() {
        return this.methods.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.email.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailSettings extends C06G {
    public final EmailSettingsCopy copy;
    public final boolean showPermissions;
    public final EmailSignature signature;

    public EmailSettings(EmailSignature emailSignature, boolean z, EmailSettingsCopy emailSettingsCopy) {
        C7384Etj.A0Y(emailSettingsCopy, 2);
        this.signature = emailSignature;
        this.showPermissions = z;
        this.copy = emailSettingsCopy;
    }

    public final EmailSettings copy(EmailSignature emailSignature, boolean z, EmailSettingsCopy emailSettingsCopy) {
        C7384Etj.A0Y(emailSettingsCopy, 2);
        return new EmailSettings(emailSignature, z, emailSettingsCopy);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSettings) {
                EmailSettings emailSettings = (EmailSettings) obj;
                if (!C7384Etj.areEqual(this.signature, emailSettings.signature) || this.showPermissions != emailSettings.showPermissions || !C7384Etj.areEqual(this.copy, emailSettings.copy)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSettings copy$default(EmailSettings emailSettings, EmailSignature emailSignature, boolean z, EmailSettingsCopy emailSettingsCopy, int i, Object obj) {
        if ((i & 1) != 0) {
            emailSignature = emailSettings.signature;
        }
        if ((i & 2) != 0) {
            z = emailSettings.showPermissions;
        }
        if ((i & 4) != 0) {
            emailSettingsCopy = emailSettings.copy;
        }
        return emailSettings.copy(emailSignature, z, emailSettingsCopy);
    }

    public final EmailSignature component1() {
        return this.signature;
    }

    public final boolean component2() {
        return this.showPermissions;
    }

    public final EmailSettingsCopy component3() {
        return this.copy;
    }

    public final EmailSettingsCopy getCopy() {
        return this.copy;
    }

    public final boolean getShowPermissions() {
        return this.showPermissions;
    }

    public final EmailSignature getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.copy, C0KA.A01(AnonymousClass006.A0D(this.signature) * 31, this.showPermissions));
    }

    public String toString() {
        return super.toString();
    }
}

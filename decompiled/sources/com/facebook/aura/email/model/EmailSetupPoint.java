package com.facebook.aura.email.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailSetupPoint extends C06G {
    public final String description;
    public final String icon;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupPoint) {
                EmailSetupPoint emailSetupPoint = (EmailSetupPoint) obj;
                if (!C7384Etj.areEqual(this.icon, emailSetupPoint.icon) || !C7384Etj.areEqual(this.title, emailSetupPoint.title) || !C7384Etj.areEqual(this.description, emailSetupPoint.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetupPoint copy$default(EmailSetupPoint emailSetupPoint, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSetupPoint.icon;
        }
        if ((i & 2) != 0) {
            str2 = emailSetupPoint.title;
        }
        if ((i & 4) != 0) {
            str3 = emailSetupPoint.description;
        }
        return emailSetupPoint.copy(str, str2, str3);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.description, AnonymousClass005.A0I(this.title, AnonymousClass006.A0G(this.icon) * 31));
    }

    public EmailSetupPoint(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        this.icon = str;
        this.title = str2;
        this.description = str3;
    }

    public final EmailSetupPoint copy(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        return new EmailSetupPoint(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}

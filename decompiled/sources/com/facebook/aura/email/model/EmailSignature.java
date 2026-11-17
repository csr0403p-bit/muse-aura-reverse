package com.facebook.aura.email.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailSignature extends C06G {
    public final boolean isOn;
    public final String subtitle;
    public final String title;

    public EmailSignature(boolean z, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        this.isOn = z;
        this.title = str;
        this.subtitle = str2;
    }

    public final EmailSignature copy(boolean z, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        return new EmailSignature(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSignature) {
                EmailSignature emailSignature = (EmailSignature) obj;
                if (this.isOn != emailSignature.isOn || !C7384Etj.areEqual(this.title, emailSignature.title) || !C7384Etj.areEqual(this.subtitle, emailSignature.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSignature copy$default(EmailSignature emailSignature, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailSignature.isOn;
        }
        if ((i & 2) != 0) {
            str = emailSignature.title;
        }
        if ((i & 4) != 0) {
            str2 = emailSignature.subtitle;
        }
        return emailSignature.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.isOn;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.title, C0KA.A02(this.isOn)) + AnonymousClass006.A0G(this.subtitle);
    }

    public final boolean isOn() {
        return this.isOn;
    }

    public String toString() {
        return super.toString();
    }
}

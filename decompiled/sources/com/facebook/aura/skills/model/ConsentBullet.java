package com.facebook.aura.skills.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConsentBullet extends C06G {
    public final ConsentBulletIcon icon;
    public final String text;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConsentBullet) {
                ConsentBullet consentBullet = (ConsentBullet) obj;
                if (this.icon != consentBullet.icon || !C7384Etj.areEqual(this.text, consentBullet.text) || !C7384Etj.areEqual(this.title, consentBullet.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConsentBullet copy$default(ConsentBullet consentBullet, ConsentBulletIcon consentBulletIcon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            consentBulletIcon = consentBullet.icon;
        }
        if ((i & 2) != 0) {
            str = consentBullet.text;
        }
        if ((i & 4) != 0) {
            str2 = consentBullet.title;
        }
        return consentBullet.copy(consentBulletIcon, str, str2);
    }

    public final ConsentBulletIcon component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.title;
    }

    public final ConsentBulletIcon getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text, AnonymousClass005.A0E(this.icon)) + AnonymousClass006.A0G(this.title);
    }

    public ConsentBullet(ConsentBulletIcon consentBulletIcon, String str, String str2) {
        AnonymousClass003.A0u(consentBulletIcon, str);
        this.icon = consentBulletIcon;
        this.text = str;
        this.title = str2;
    }

    public final ConsentBullet copy(ConsentBulletIcon consentBulletIcon, String str, String str2) {
        AnonymousClass003.A0u(consentBulletIcon, str);
        return new ConsentBullet(consentBulletIcon, str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConsentBullet(ConsentBulletIcon consentBulletIcon, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? ConsentBulletIcon.INFO : consentBulletIcon, str, AnonymousClass006.A0t(i, str2));
    }
}

package com.facebook.aura.connectorconsent;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectorConsentBullet extends C06G {
    public static final int $stable = 0;
    public final int iconRes;
    public final String text;
    public final String title;

    public ConnectorConsentBullet(int i, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        this.iconRes = i;
        this.text = str;
        this.title = str2;
    }

    public final ConnectorConsentBullet copy(int i, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        return new ConnectorConsentBullet(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorConsentBullet) {
                ConnectorConsentBullet connectorConsentBullet = (ConnectorConsentBullet) obj;
                if (this.iconRes != connectorConsentBullet.iconRes || !C7384Etj.areEqual(this.text, connectorConsentBullet.text) || !C7384Etj.areEqual(this.title, connectorConsentBullet.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorConsentBullet copy$default(ConnectorConsentBullet connectorConsentBullet, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = connectorConsentBullet.iconRes;
        }
        if ((i2 & 2) != 0) {
            str = connectorConsentBullet.text;
        }
        if ((i2 & 4) != 0) {
            str2 = connectorConsentBullet.title;
        }
        return connectorConsentBullet.copy(i, str, str2);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.title;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text, this.iconRes * 31) + AnonymousClass006.A0G(this.title);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorConsentBullet(int i, String str, String str2, int i2, C06H c06h) {
        this(i, str, AnonymousClass006.A0t(i2, str2));
    }
}

package com.facebook.aura.connectorconsent;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectorConsentUiModel extends C06G {
    public static final int $stable = 0;
    public final AHD<ConnectorConsentBullet> bullets;
    public final AHD<String> calloutParagraphs;
    public final String calloutTitle;
    public final String description;
    public final AHD<String> footerParagraphs;
    public final Integer iconRes;
    public final boolean iconTinted;
    public final String iconUrl;
    public final String title;

    public ConnectorConsentUiModel(String str, Integer num, boolean z, String str2, String str3, AHD<ConnectorConsentBullet> ahd, AHD<String> ahd2, AHD<String> ahd3, String str4) {
        C7384Etj.A0Y(str2, 3);
        AnonymousClass005.A0z(ahd, ahd2, ahd3);
        this.iconUrl = str;
        this.iconRes = num;
        this.iconTinted = z;
        this.title = str2;
        this.description = str3;
        this.bullets = ahd;
        this.footerParagraphs = ahd2;
        this.calloutParagraphs = ahd3;
        this.calloutTitle = str4;
    }

    public final ConnectorConsentUiModel copy(String str, Integer num, boolean z, String str2, String str3, AHD<ConnectorConsentBullet> ahd, AHD<String> ahd2, AHD<String> ahd3, String str4) {
        C7384Etj.A0Y(str2, 3);
        AnonymousClass005.A0z(ahd, ahd2, ahd3);
        return new ConnectorConsentUiModel(str, num, z, str2, str3, ahd, ahd2, ahd3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorConsentUiModel) {
                ConnectorConsentUiModel connectorConsentUiModel = (ConnectorConsentUiModel) obj;
                if (!C7384Etj.areEqual(this.iconUrl, connectorConsentUiModel.iconUrl) || !C7384Etj.areEqual(this.iconRes, connectorConsentUiModel.iconRes) || this.iconTinted != connectorConsentUiModel.iconTinted || !C7384Etj.areEqual(this.title, connectorConsentUiModel.title) || !C7384Etj.areEqual(this.description, connectorConsentUiModel.description) || !C7384Etj.areEqual(this.bullets, connectorConsentUiModel.bullets) || !C7384Etj.areEqual(this.footerParagraphs, connectorConsentUiModel.footerParagraphs) || !C7384Etj.areEqual(this.calloutParagraphs, connectorConsentUiModel.calloutParagraphs) || !C7384Etj.areEqual(this.calloutTitle, connectorConsentUiModel.calloutTitle)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorConsentUiModel copy$default(ConnectorConsentUiModel connectorConsentUiModel, String str, Integer num, boolean z, String str2, String str3, AHD ahd, AHD ahd2, AHD ahd3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorConsentUiModel.iconUrl;
        }
        if ((i & 2) != 0) {
            num = connectorConsentUiModel.iconRes;
        }
        if ((i & 4) != 0) {
            z = connectorConsentUiModel.iconTinted;
        }
        if ((i & 8) != 0) {
            str2 = connectorConsentUiModel.title;
        }
        if ((i & 16) != 0) {
            str3 = connectorConsentUiModel.description;
        }
        if ((i & 32) != 0) {
            ahd = connectorConsentUiModel.bullets;
        }
        if ((i & 64) != 0) {
            ahd2 = connectorConsentUiModel.footerParagraphs;
        }
        if ((i & 128) != 0) {
            ahd3 = connectorConsentUiModel.calloutParagraphs;
        }
        if ((i & 256) != 0) {
            str4 = connectorConsentUiModel.calloutTitle;
        }
        return connectorConsentUiModel.copy(str, num, z, str2, str3, ahd, ahd2, ahd3, str4);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final Integer component2() {
        return this.iconRes;
    }

    public final boolean component3() {
        return this.iconTinted;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final AHD<ConnectorConsentBullet> component6() {
        return this.bullets;
    }

    public final AHD<String> component7() {
        return this.footerParagraphs;
    }

    public final AHD<String> component8() {
        return this.calloutParagraphs;
    }

    public final String component9() {
        return this.calloutTitle;
    }

    public final AHD<ConnectorConsentBullet> getBullets() {
        return this.bullets;
    }

    public final AHD<String> getCalloutParagraphs() {
        return this.calloutParagraphs;
    }

    public final String getCalloutTitle() {
        return this.calloutTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AHD<String> getFooterParagraphs() {
        return this.footerParagraphs;
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final boolean getIconTinted() {
        return this.iconTinted;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.calloutParagraphs, AnonymousClass005.A0F(this.footerParagraphs, AnonymousClass005.A0F(this.bullets, (AnonymousClass005.A0I(this.title, C0KA.A01(((AnonymousClass006.A0G(this.iconUrl) * 31) + AnonymousClass006.A0D(this.iconRes)) * 31, this.iconTinted)) + AnonymousClass006.A0G(this.description)) * 31))) + AnonymousClass005.A0H(this.calloutTitle);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorConsentUiModel(String str, Integer num, boolean z, String str2, String str3, AHD ahd, AHD ahd2, AHD ahd3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, AnonymousClass005.A1O(i, z), str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? AHI.A01 : ahd, (i & 64) != 0 ? AHI.A01 : ahd2, (i & 128) != 0 ? AHI.A01 : ahd3, (i & 256) != 0 ? null : str4);
    }
}

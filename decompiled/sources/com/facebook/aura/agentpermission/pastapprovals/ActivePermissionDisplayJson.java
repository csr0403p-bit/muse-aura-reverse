package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivePermissionDisplayJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String iconKey;
    public final String iconUrl;
    public final String mode_label;
    public final String permissionCaption;
    public final String summaryTitle;

    public final class Companion {
        public final C9hr<ActivePermissionDisplayJson> serializer() {
            return ActivePermissionDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionDisplayJson activePermissionDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activePermissionDisplayJson.summaryTitle != null) {
            c9j5.AAP(activePermissionDisplayJson.summaryTitle, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activePermissionDisplayJson.permissionCaption != null) {
            c9j5.AAP(activePermissionDisplayJson.permissionCaption, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activePermissionDisplayJson.iconKey != null) {
            c9j5.AAP(activePermissionDisplayJson.iconKey, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activePermissionDisplayJson.iconUrl != null) {
            c9j5.AAP(activePermissionDisplayJson.iconUrl, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || activePermissionDisplayJson.mode_label != null) {
            c9j5.AAP(activePermissionDisplayJson.mode_label, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionDisplayJson) {
                ActivePermissionDisplayJson activePermissionDisplayJson = (ActivePermissionDisplayJson) obj;
                if (!C7384Etj.areEqual(this.summaryTitle, activePermissionDisplayJson.summaryTitle) || !C7384Etj.areEqual(this.permissionCaption, activePermissionDisplayJson.permissionCaption) || !C7384Etj.areEqual(this.iconKey, activePermissionDisplayJson.iconKey) || !C7384Etj.areEqual(this.iconUrl, activePermissionDisplayJson.iconUrl) || !C7384Etj.areEqual(this.mode_label, activePermissionDisplayJson.mode_label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionDisplayJson copy$default(ActivePermissionDisplayJson activePermissionDisplayJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activePermissionDisplayJson.summaryTitle;
        }
        if ((i & 2) != 0) {
            str2 = activePermissionDisplayJson.permissionCaption;
        }
        if ((i & 4) != 0) {
            str3 = activePermissionDisplayJson.iconKey;
        }
        if ((i & 8) != 0) {
            str4 = activePermissionDisplayJson.iconUrl;
        }
        if ((i & 16) != 0) {
            str5 = activePermissionDisplayJson.mode_label;
        }
        return activePermissionDisplayJson.copy(str, str2, str3, str4, str5);
    }

    public static /* synthetic */ void getIconKey$annotations() {
    }

    public static /* synthetic */ void getIconUrl$annotations() {
    }

    public static /* synthetic */ void getPermissionCaption$annotations() {
    }

    public static /* synthetic */ void getSummaryTitle$annotations() {
    }

    public final String component1() {
        return this.summaryTitle;
    }

    public final String component2() {
        return this.permissionCaption;
    }

    public final String component3() {
        return this.iconKey;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final String component5() {
        return this.mode_label;
    }

    public final ActivePermissionDisplayJson copy(String str, String str2, String str3, String str4, String str5) {
        return new ActivePermissionDisplayJson(str, str2, str3, str4, str5);
    }

    public final String getIconKey() {
        return this.iconKey;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMode_label() {
        return this.mode_label;
    }

    public final String getPermissionCaption() {
        return this.permissionCaption;
    }

    public final String getSummaryTitle() {
        return this.summaryTitle;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.summaryTitle) * 31) + AnonymousClass006.A0G(this.permissionCaption)) * 31) + AnonymousClass006.A0G(this.iconKey)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass005.A0H(this.mode_label);
    }

    public final ActivePermissionDisplay toDomain() {
        String str = this.summaryTitle;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        String str2 = this.permissionCaption;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        ActivePermissionIconKey activePermissionIconKeyFromWire = ActivePermissionIconKey.Companion.fromWire(this.iconKey);
        String str3 = this.iconUrl;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        String str4 = this.mode_label;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        return new ActivePermissionDisplay(str, str2, activePermissionIconKeyFromWire, str3, str4);
    }

    public ActivePermissionDisplayJson(String str, String str2, String str3, String str4, String str5) {
        this.summaryTitle = str;
        this.permissionCaption = str2;
        this.iconKey = str3;
        this.iconUrl = str4;
        this.mode_label = str5;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionDisplayJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ ActivePermissionDisplayJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.summaryTitle = null;
        } else {
            this.summaryTitle = str;
        }
        if ((i & 2) == 0) {
            this.permissionCaption = null;
        } else {
            this.permissionCaption = str2;
        }
        if ((i & 4) == 0) {
            this.iconKey = null;
        } else {
            this.iconKey = str3;
        }
        if ((i & 8) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str4;
        }
        if ((i & 16) == 0) {
            this.mode_label = null;
        } else {
            this.mode_label = str5;
        }
    }

    public ActivePermissionDisplayJson() {
        this(null, null, null, null, null);
    }
}

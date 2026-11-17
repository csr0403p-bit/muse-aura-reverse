package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivePermissionDisplay extends C06G {
    public static final int $stable = 0;
    public final ActivePermissionIconKey iconKey;
    public final String iconUrl;
    public final String modeLabel;
    public final String permissionCaption;
    public final String summaryTitle;

    public ActivePermissionDisplay(String str, String str2, ActivePermissionIconKey activePermissionIconKey, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.summaryTitle = str;
        this.permissionCaption = str2;
        this.iconKey = activePermissionIconKey;
        this.iconUrl = str3;
        this.modeLabel = str4;
    }

    public final ActivePermissionDisplay copy(String str, String str2, ActivePermissionIconKey activePermissionIconKey, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new ActivePermissionDisplay(str, str2, activePermissionIconKey, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionDisplay) {
                ActivePermissionDisplay activePermissionDisplay = (ActivePermissionDisplay) obj;
                if (!C7384Etj.areEqual(this.summaryTitle, activePermissionDisplay.summaryTitle) || !C7384Etj.areEqual(this.permissionCaption, activePermissionDisplay.permissionCaption) || this.iconKey != activePermissionDisplay.iconKey || !C7384Etj.areEqual(this.iconUrl, activePermissionDisplay.iconUrl) || !C7384Etj.areEqual(this.modeLabel, activePermissionDisplay.modeLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionDisplay copy$default(ActivePermissionDisplay activePermissionDisplay, String str, String str2, ActivePermissionIconKey activePermissionIconKey, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activePermissionDisplay.summaryTitle;
        }
        if ((i & 2) != 0) {
            str2 = activePermissionDisplay.permissionCaption;
        }
        if ((i & 4) != 0) {
            activePermissionIconKey = activePermissionDisplay.iconKey;
        }
        if ((i & 8) != 0) {
            str3 = activePermissionDisplay.iconUrl;
        }
        if ((i & 16) != 0) {
            str4 = activePermissionDisplay.modeLabel;
        }
        return activePermissionDisplay.copy(str, str2, activePermissionIconKey, str3, str4);
    }

    public final String component1() {
        return this.summaryTitle;
    }

    public final String component2() {
        return this.permissionCaption;
    }

    public final ActivePermissionIconKey component3() {
        return this.iconKey;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final String component5() {
        return this.modeLabel;
    }

    public final ActivePermissionIconKey getIconKey() {
        return this.iconKey;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getModeLabel() {
        return this.modeLabel;
    }

    public final String getPermissionCaption() {
        return this.permissionCaption;
    }

    public final String getSummaryTitle() {
        return this.summaryTitle;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.summaryTitle) + AnonymousClass006.A0G(this.permissionCaption)) * 31) + AnonymousClass006.A0D(this.iconKey)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass005.A0H(this.modeLabel);
    }

    public String toString() {
        return super.toString();
    }
}

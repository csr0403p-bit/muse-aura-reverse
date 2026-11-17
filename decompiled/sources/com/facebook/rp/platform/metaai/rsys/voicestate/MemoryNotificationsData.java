package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class MemoryNotificationsData extends C06G {

    @SerializedName("admin_text")
    public final String adminText;

    @SerializedName("cta_text")
    public final String ctaText;

    @SerializedName("cta_url")
    public final String ctaUrl;

    @SerializedName("identifier")
    public final String identifier;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MemoryNotificationsData) {
                MemoryNotificationsData memoryNotificationsData = (MemoryNotificationsData) obj;
                if (!C7384Etj.areEqual(this.adminText, memoryNotificationsData.adminText) || !C7384Etj.areEqual(this.ctaText, memoryNotificationsData.ctaText) || !C7384Etj.areEqual(this.ctaUrl, memoryNotificationsData.ctaUrl) || !C7384Etj.areEqual(this.identifier, memoryNotificationsData.identifier)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MemoryNotificationsData copy$default(MemoryNotificationsData memoryNotificationsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoryNotificationsData.adminText;
        }
        if ((i & 2) != 0) {
            str2 = memoryNotificationsData.ctaText;
        }
        if ((i & 4) != 0) {
            str3 = memoryNotificationsData.ctaUrl;
        }
        if ((i & 8) != 0) {
            str4 = memoryNotificationsData.identifier;
        }
        return new MemoryNotificationsData(str, str2, str3, str4);
    }

    public final String component1() {
        return this.adminText;
    }

    public final String component2() {
        return this.ctaText;
    }

    public final String component3() {
        return this.ctaUrl;
    }

    public final String component4() {
        return this.identifier;
    }

    public final MemoryNotificationsData copy(String str, String str2, String str3, String str4) {
        return new MemoryNotificationsData(str, str2, str3, str4);
    }

    public final String getAdminText() {
        return this.adminText;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.adminText) * 31) + AnonymousClass006.A0G(this.ctaText)) * 31) + AnonymousClass006.A0G(this.ctaUrl)) * 31) + AnonymousClass005.A0H(this.identifier);
    }

    public String toString() {
        return FGI.A0m("MemoryNotificationsData(adminText=", this.adminText, ", ctaText=", this.ctaText, ", ctaUrl=", this.ctaUrl, ", identifier=", this.identifier, ")");
    }

    public MemoryNotificationsData(String str, String str2, String str3, String str4) {
        this.adminText = str;
        this.ctaText = str2;
        this.ctaUrl = str3;
        this.identifier = str4;
    }
}

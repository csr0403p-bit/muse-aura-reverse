package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class TransparencyViewModel extends C06G {

    @SerializedName("admin_text")
    public final String adminText;

    @SerializedName("cta_text")
    public final String ctaText;

    @SerializedName("cta_url")
    public final String ctaUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TransparencyViewModel) {
                TransparencyViewModel transparencyViewModel = (TransparencyViewModel) obj;
                if (!C7384Etj.areEqual(this.adminText, transparencyViewModel.adminText) || !C7384Etj.areEqual(this.ctaText, transparencyViewModel.ctaText) || !C7384Etj.areEqual(this.ctaUrl, transparencyViewModel.ctaUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TransparencyViewModel copy$default(TransparencyViewModel transparencyViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transparencyViewModel.adminText;
        }
        if ((i & 2) != 0) {
            str2 = transparencyViewModel.ctaText;
        }
        if ((i & 4) != 0) {
            str3 = transparencyViewModel.ctaUrl;
        }
        return new TransparencyViewModel(str, str2, str3);
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

    public final TransparencyViewModel copy(String str, String str2, String str3) {
        return new TransparencyViewModel(str, str2, str3);
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

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.adminText) * 31) + AnonymousClass006.A0G(this.ctaText)) * 31) + AnonymousClass005.A0H(this.ctaUrl);
    }

    public String toString() {
        return FGI.A0k("TransparencyViewModel(adminText=", this.adminText, ", ctaText=", this.ctaText, ", ctaUrl=", this.ctaUrl, ")");
    }

    public TransparencyViewModel(String str, String str2, String str3) {
        this.adminText = str;
        this.ctaText = str2;
        this.ctaUrl = str3;
    }
}

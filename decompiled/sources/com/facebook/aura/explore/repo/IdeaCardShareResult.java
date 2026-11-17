package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IdeaCardShareResult extends C06G {
    public final String iconMimeType;
    public final String iconUrl;
    public final String shareUrl;
    public final String shareableIdeaId;
    public final String summary;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardShareResult) {
                IdeaCardShareResult ideaCardShareResult = (IdeaCardShareResult) obj;
                if (!C7384Etj.areEqual(this.shareableIdeaId, ideaCardShareResult.shareableIdeaId) || !C7384Etj.areEqual(this.shareUrl, ideaCardShareResult.shareUrl) || !C7384Etj.areEqual(this.title, ideaCardShareResult.title) || !C7384Etj.areEqual(this.summary, ideaCardShareResult.summary) || !C7384Etj.areEqual(this.iconUrl, ideaCardShareResult.iconUrl) || !C7384Etj.areEqual(this.iconMimeType, ideaCardShareResult.iconMimeType)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardShareResult copy$default(IdeaCardShareResult ideaCardShareResult, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardShareResult.shareableIdeaId;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardShareResult.shareUrl;
        }
        if ((i & 4) != 0) {
            str3 = ideaCardShareResult.title;
        }
        if ((i & 8) != 0) {
            str4 = ideaCardShareResult.summary;
        }
        if ((i & 16) != 0) {
            str5 = ideaCardShareResult.iconUrl;
        }
        if ((i & 32) != 0) {
            str6 = ideaCardShareResult.iconMimeType;
        }
        return ideaCardShareResult.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.shareableIdeaId;
    }

    public final String component2() {
        return this.shareUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.iconMimeType;
    }

    public final String getIconMimeType() {
        return this.iconMimeType;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getShareableIdeaId() {
        return this.shareableIdeaId;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.shareUrl, AnonymousClass001.A0G(this.shareableIdeaId)))) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass005.A0H(this.iconMimeType);
    }

    public IdeaCardShareResult(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.shareableIdeaId = str;
        this.shareUrl = str2;
        this.title = str3;
        this.summary = str4;
        this.iconUrl = str5;
        this.iconMimeType = str6;
    }

    public final IdeaCardShareResult copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new IdeaCardShareResult(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }
}

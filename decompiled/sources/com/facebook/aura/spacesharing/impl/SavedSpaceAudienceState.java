package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudience;

/* loaded from: classes3.dex */
public final class SavedSpaceAudienceState extends C06G {
    public static final int $stable = 8;
    public final SavedSpaceAudience audience;
    public final String iconUrl;
    public final String shareUrl;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedSpaceAudienceState) {
                SavedSpaceAudienceState savedSpaceAudienceState = (SavedSpaceAudienceState) obj;
                if (!C7384Etj.areEqual(this.title, savedSpaceAudienceState.title) || !C7384Etj.areEqual(this.iconUrl, savedSpaceAudienceState.iconUrl) || !C7384Etj.areEqual(this.shareUrl, savedSpaceAudienceState.shareUrl) || !C7384Etj.areEqual(this.audience, savedSpaceAudienceState.audience)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SavedSpaceAudienceState(String str, String str2, String str3, SavedSpaceAudience savedSpaceAudience, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? SavedSpaceAudience.Loading.INSTANCE : savedSpaceAudience);
    }

    public static /* synthetic */ SavedSpaceAudienceState copy$default(SavedSpaceAudienceState savedSpaceAudienceState, String str, String str2, String str3, SavedSpaceAudience savedSpaceAudience, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedSpaceAudienceState.title;
        }
        if ((i & 2) != 0) {
            str2 = savedSpaceAudienceState.iconUrl;
        }
        if ((i & 4) != 0) {
            str3 = savedSpaceAudienceState.shareUrl;
        }
        if ((i & 8) != 0) {
            savedSpaceAudience = savedSpaceAudienceState.audience;
        }
        AnonymousClass003.A0w(str, savedSpaceAudience);
        return new SavedSpaceAudienceState(str, str2, str3, savedSpaceAudience);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.shareUrl;
    }

    public final SavedSpaceAudience component4() {
        return this.audience;
    }

    public final SavedSpaceAudience getAudience() {
        return this.audience;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.audience, (((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass005.A0H(this.shareUrl)) * 31);
    }

    public final SavedSpaceAudienceState copy(String str, String str2, String str3, SavedSpaceAudience savedSpaceAudience) {
        AnonymousClass003.A0w(str, savedSpaceAudience);
        return new SavedSpaceAudienceState(str, str2, str3, savedSpaceAudience);
    }

    public String toString() {
        return super.toString();
    }

    public SavedSpaceAudienceState(String str, String str2, String str3, SavedSpaceAudience savedSpaceAudience) {
        AnonymousClass003.A0w(str, savedSpaceAudience);
        this.title = str;
        this.iconUrl = str2;
        this.shareUrl = str3;
        this.audience = savedSpaceAudience;
    }
}

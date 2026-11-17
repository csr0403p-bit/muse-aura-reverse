package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NativeLoginProfileUiModel extends C06G {
    public static final int $stable = 0;
    public final String displayName;
    public final String photoUrl;
    public final String platform;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginProfileUiModel) {
                NativeLoginProfileUiModel nativeLoginProfileUiModel = (NativeLoginProfileUiModel) obj;
                if (!C7384Etj.areEqual(this.platform, nativeLoginProfileUiModel.platform) || !C7384Etj.areEqual(this.photoUrl, nativeLoginProfileUiModel.photoUrl) || !C7384Etj.areEqual(this.displayName, nativeLoginProfileUiModel.displayName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginProfileUiModel copy$default(NativeLoginProfileUiModel nativeLoginProfileUiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLoginProfileUiModel.platform;
        }
        if ((i & 2) != 0) {
            str2 = nativeLoginProfileUiModel.photoUrl;
        }
        if ((i & 4) != 0) {
            str3 = nativeLoginProfileUiModel.displayName;
        }
        return new NativeLoginProfileUiModel(str, str2, str3);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.photoUrl;
    }

    public final String component3() {
        return this.displayName;
    }

    public final NativeLoginProfileUiModel copy(String str, String str2, String str3) {
        return new NativeLoginProfileUiModel(str, str2, str3);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.platform) * 31) + AnonymousClass006.A0G(this.photoUrl)) * 31) + AnonymousClass005.A0H(this.displayName);
    }

    public NativeLoginProfileUiModel(String str, String str2, String str3) {
        this.platform = str;
        this.photoUrl = str2;
        this.displayName = str3;
    }

    public String toString() {
        return super.toString();
    }
}

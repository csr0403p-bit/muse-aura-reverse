package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NativeLoginLinkedAccountUiModel extends C06G {
    public static final int $stable = 0;
    public final String photoUrl;
    public final String platform;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginLinkedAccountUiModel) {
                NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel = (NativeLoginLinkedAccountUiModel) obj;
                if (!C7384Etj.areEqual(this.platform, nativeLoginLinkedAccountUiModel.platform) || !C7384Etj.areEqual(this.photoUrl, nativeLoginLinkedAccountUiModel.photoUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginLinkedAccountUiModel copy$default(NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLoginLinkedAccountUiModel.platform;
        }
        if ((i & 2) != 0) {
            str2 = nativeLoginLinkedAccountUiModel.photoUrl;
        }
        return new NativeLoginLinkedAccountUiModel(str, str2);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.photoUrl;
    }

    public final NativeLoginLinkedAccountUiModel copy(String str, String str2) {
        return new NativeLoginLinkedAccountUiModel(str, str2);
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.platform) * 31) + AnonymousClass005.A0H(this.photoUrl);
    }

    public NativeLoginLinkedAccountUiModel(String str, String str2) {
        this.platform = str;
        this.photoUrl = str2;
    }

    public String toString() {
        return super.toString();
    }
}

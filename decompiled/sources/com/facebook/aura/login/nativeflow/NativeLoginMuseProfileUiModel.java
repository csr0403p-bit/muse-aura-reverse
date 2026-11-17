package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NativeLoginMuseProfileUiModel extends C06G {
    public static final int $stable = 0;
    public final String name;
    public final String photoUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginMuseProfileUiModel) {
                NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel = (NativeLoginMuseProfileUiModel) obj;
                if (!C7384Etj.areEqual(this.name, nativeLoginMuseProfileUiModel.name) || !C7384Etj.areEqual(this.photoUrl, nativeLoginMuseProfileUiModel.photoUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginMuseProfileUiModel copy$default(NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLoginMuseProfileUiModel.name;
        }
        if ((i & 2) != 0) {
            str2 = nativeLoginMuseProfileUiModel.photoUrl;
        }
        AnonymousClass003.A0u(str, str2);
        return new NativeLoginMuseProfileUiModel(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.photoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.photoUrl, AnonymousClass001.A0G(this.name));
    }

    public NativeLoginMuseProfileUiModel(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.photoUrl = str2;
    }

    public final NativeLoginMuseProfileUiModel copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new NativeLoginMuseProfileUiModel(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}

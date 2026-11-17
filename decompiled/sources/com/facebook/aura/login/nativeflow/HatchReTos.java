package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchReTos extends C06G {
    public final String contentVersion;
    public final HatchReTosScreen screen;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchReTos) {
                HatchReTos hatchReTos = (HatchReTos) obj;
                if (!C7384Etj.areEqual(this.contentVersion, hatchReTos.contentVersion) || !C7384Etj.areEqual(this.screen, hatchReTos.screen)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchReTos copy$default(HatchReTos hatchReTos, String str, HatchReTosScreen hatchReTosScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchReTos.contentVersion;
        }
        if ((i & 2) != 0) {
            hatchReTosScreen = hatchReTos.screen;
        }
        AnonymousClass003.A0u(str, hatchReTosScreen);
        return new HatchReTos(str, hatchReTosScreen);
    }

    public final String component1() {
        return this.contentVersion;
    }

    public final HatchReTosScreen component2() {
        return this.screen;
    }

    public final String getContentVersion() {
        return this.contentVersion;
    }

    public final HatchReTosScreen getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.screen, AnonymousClass001.A0G(this.contentVersion));
    }

    public HatchReTos(String str, HatchReTosScreen hatchReTosScreen) {
        AnonymousClass003.A0u(str, hatchReTosScreen);
        this.contentVersion = str;
        this.screen = hatchReTosScreen;
    }

    public final HatchReTos copy(String str, HatchReTosScreen hatchReTosScreen) {
        AnonymousClass003.A0u(str, hatchReTosScreen);
        return new HatchReTos(str, hatchReTosScreen);
    }

    public String toString() {
        return super.toString();
    }
}

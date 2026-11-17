package com.facebook.aura.commands.app;

import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HomeScreenShortcutJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean pinned;
    public final boolean supported;

    public final class Companion {
        public final C9hr<HomeScreenShortcutJson> serializer() {
            return HomeScreenShortcutJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_app_app(HomeScreenShortcutJson homeScreenShortcutJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, homeScreenShortcutJson.supported);
        c9j5.AA7(c9iZ, 1, homeScreenShortcutJson.pinned);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeScreenShortcutJson) {
                HomeScreenShortcutJson homeScreenShortcutJson = (HomeScreenShortcutJson) obj;
                if (this.supported != homeScreenShortcutJson.supported || this.pinned != homeScreenShortcutJson.pinned) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HomeScreenShortcutJson copy$default(HomeScreenShortcutJson homeScreenShortcutJson, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = homeScreenShortcutJson.supported;
        }
        if ((i & 2) != 0) {
            z2 = homeScreenShortcutJson.pinned;
        }
        return new HomeScreenShortcutJson(z, z2);
    }

    public final boolean component1() {
        return this.supported;
    }

    public final boolean component2() {
        return this.pinned;
    }

    public final HomeScreenShortcutJson copy(boolean z, boolean z2) {
        return new HomeScreenShortcutJson(z, z2);
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final boolean getSupported() {
        return this.supported;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.supported), this.pinned);
    }

    public HomeScreenShortcutJson(boolean z, boolean z2) {
        this.supported = z;
        this.pinned = z2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HomeScreenShortcutJson(int i, boolean z, boolean z2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HomeScreenShortcutJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.supported = z;
        this.pinned = z2;
    }
}

package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class LocalBrowserScreenKey implements AuraFullScreenNavKey {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean initialTakeover;
    public final String taskId;

    public final class Companion {
        public final C9hr<LocalBrowserScreenKey> serializer() {
            return LocalBrowserScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalBrowserScreenKey(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.taskId = str;
        this.initialTakeover = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_keys_keys(LocalBrowserScreenKey localBrowserScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(localBrowserScreenKey.taskId, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, localBrowserScreenKey.initialTakeover);
    }

    public final LocalBrowserScreenKey copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new LocalBrowserScreenKey(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserScreenKey) {
                LocalBrowserScreenKey localBrowserScreenKey = (LocalBrowserScreenKey) obj;
                if (!C7384Etj.areEqual(this.taskId, localBrowserScreenKey.taskId) || this.initialTakeover != localBrowserScreenKey.initialTakeover) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserScreenKey copy$default(LocalBrowserScreenKey localBrowserScreenKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localBrowserScreenKey.taskId;
        }
        if ((i & 2) != 0) {
            z = localBrowserScreenKey.initialTakeover;
        }
        C7384Etj.A0Y(str, 0);
        return new LocalBrowserScreenKey(str, z);
    }

    public final String component1() {
        return this.taskId;
    }

    public final boolean component2() {
        return this.initialTakeover;
    }

    public final boolean getInitialTakeover() {
        return this.initialTakeover;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.taskId), this.initialTakeover);
    }

    public String toString() {
        return FGI.A0n("LocalBrowserScreenKey(taskId=", this.taskId, ", initialTakeover=", ")", this.initialTakeover);
    }

    public /* synthetic */ LocalBrowserScreenKey(int i, String str, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(LocalBrowserScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.taskId = str;
        this.initialTakeover = z;
    }
}

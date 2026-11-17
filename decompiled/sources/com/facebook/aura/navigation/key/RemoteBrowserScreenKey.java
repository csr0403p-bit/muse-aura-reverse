package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class RemoteBrowserScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String taskId;

    public final class Companion {
        public final C9hr<RemoteBrowserScreenKey> serializer() {
            return RemoteBrowserScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final RemoteBrowserScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new RemoteBrowserScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RemoteBrowserScreenKey) && C7384Etj.areEqual(this.taskId, ((RemoteBrowserScreenKey) obj).taskId));
    }

    public /* synthetic */ RemoteBrowserScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(RemoteBrowserScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.taskId = str;
    }

    public static /* synthetic */ RemoteBrowserScreenKey copy$default(RemoteBrowserScreenKey remoteBrowserScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteBrowserScreenKey.taskId;
        }
        C7384Etj.A0Y(str, 0);
        return new RemoteBrowserScreenKey(str);
    }

    public final String component1() {
        return this.taskId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return this.taskId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public RemoteBrowserScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.taskId = str;
    }
}

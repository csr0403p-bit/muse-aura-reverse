package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionDisconnectedJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean disconnected;

    public final class Companion {
        public final C9hr<ConnectionDisconnectedJson> serializer() {
            return ConnectionDisconnectedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionDisconnectedJson connectionDisconnectedJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || connectionDisconnectedJson.disconnected) {
            c9j5.AA7(c9iZ, 0, connectionDisconnectedJson.disconnected);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectionDisconnectedJson) && this.disconnected == ((ConnectionDisconnectedJson) obj).disconnected);
    }

    public static /* synthetic */ ConnectionDisconnectedJson copy$default(ConnectionDisconnectedJson connectionDisconnectedJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectionDisconnectedJson.disconnected;
        }
        return new ConnectionDisconnectedJson(z);
    }

    public final boolean component1() {
        return this.disconnected;
    }

    public final ConnectionDisconnectedJson copy(boolean z) {
        return new ConnectionDisconnectedJson(z);
    }

    public final boolean getDisconnected() {
        return this.disconnected;
    }

    public int hashCode() {
        return this.disconnected ? 1231 : 1237;
    }

    public /* synthetic */ ConnectionDisconnectedJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.disconnected = false;
        } else {
            this.disconnected = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionDisconnectedJson(boolean z) {
        this.disconnected = z;
    }

    public /* synthetic */ ConnectionDisconnectedJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public ConnectionDisconnectedJson() {
        this(false);
    }
}

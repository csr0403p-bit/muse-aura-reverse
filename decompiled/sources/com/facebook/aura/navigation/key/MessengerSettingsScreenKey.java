package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class MessengerSettingsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean isLinked;

    public final class Companion {
        public final C9hr<MessengerSettingsScreenKey> serializer() {
            return MessengerSettingsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(MessengerSettingsScreenKey messengerSettingsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || messengerSettingsScreenKey.isLinked) {
            c9j5.AA7(c9iZ, 0, messengerSettingsScreenKey.isLinked);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MessengerSettingsScreenKey) && this.isLinked == ((MessengerSettingsScreenKey) obj).isLinked);
    }

    public static /* synthetic */ MessengerSettingsScreenKey copy$default(MessengerSettingsScreenKey messengerSettingsScreenKey, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messengerSettingsScreenKey.isLinked;
        }
        return new MessengerSettingsScreenKey(z);
    }

    public final boolean component1() {
        return this.isLinked;
    }

    public final MessengerSettingsScreenKey copy(boolean z) {
        return new MessengerSettingsScreenKey(z);
    }

    public int hashCode() {
        return this.isLinked ? 1231 : 1237;
    }

    public final boolean isLinked() {
        return this.isLinked;
    }

    public /* synthetic */ MessengerSettingsScreenKey(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public String toString() {
        return super.toString();
    }

    public MessengerSettingsScreenKey(boolean z) {
        this.isLinked = z;
    }

    public /* synthetic */ MessengerSettingsScreenKey(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.isLinked = false;
        } else {
            this.isLinked = z;
        }
    }

    public MessengerSettingsScreenKey() {
        this(false);
    }
}

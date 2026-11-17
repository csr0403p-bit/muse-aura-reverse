package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class WhatsAppSettingsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean isLinked;
    public final boolean needsAttention;

    public final class Companion {
        public final C9hr<WhatsAppSettingsScreenKey> serializer() {
            return WhatsAppSettingsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(WhatsAppSettingsScreenKey whatsAppSettingsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || whatsAppSettingsScreenKey.isLinked) {
            c9j5.AA7(c9iZ, 0, whatsAppSettingsScreenKey.isLinked);
        }
        if (zAfR || whatsAppSettingsScreenKey.needsAttention) {
            c9j5.AA7(c9iZ, 1, whatsAppSettingsScreenKey.needsAttention);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppSettingsScreenKey) {
                WhatsAppSettingsScreenKey whatsAppSettingsScreenKey = (WhatsAppSettingsScreenKey) obj;
                if (this.isLinked != whatsAppSettingsScreenKey.isLinked || this.needsAttention != whatsAppSettingsScreenKey.needsAttention) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WhatsAppSettingsScreenKey copy$default(WhatsAppSettingsScreenKey whatsAppSettingsScreenKey, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = whatsAppSettingsScreenKey.isLinked;
        }
        if ((i & 2) != 0) {
            z2 = whatsAppSettingsScreenKey.needsAttention;
        }
        return new WhatsAppSettingsScreenKey(z, z2);
    }

    public final boolean component1() {
        return this.isLinked;
    }

    public final boolean component2() {
        return this.needsAttention;
    }

    public final WhatsAppSettingsScreenKey copy(boolean z, boolean z2) {
        return new WhatsAppSettingsScreenKey(z, z2);
    }

    public final boolean getNeedsAttention() {
        return this.needsAttention;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.isLinked), this.needsAttention);
    }

    public final boolean isLinked() {
        return this.isLinked;
    }

    public WhatsAppSettingsScreenKey(boolean z, boolean z2) {
        this.isLinked = z;
        this.needsAttention = z2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WhatsAppSettingsScreenKey(int i, boolean z, boolean z2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.isLinked = false;
        } else {
            this.isLinked = z;
        }
        if ((i & 2) == 0) {
            this.needsAttention = false;
        } else {
            this.needsAttention = z2;
        }
    }

    public /* synthetic */ WhatsAppSettingsScreenKey(boolean z, boolean z2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2));
    }

    public WhatsAppSettingsScreenKey() {
        this(false, false);
    }
}

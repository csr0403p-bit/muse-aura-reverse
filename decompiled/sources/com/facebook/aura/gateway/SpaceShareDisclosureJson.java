package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceShareDisclosureJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean contains_chat_history;
    public final boolean contains_personal_information;
    public final boolean contains_secrets_or_credentials;
    public final boolean contains_user_shared_media;

    public final class Companion {
        public final C9hr<SpaceShareDisclosureJson> serializer() {
            return SpaceShareDisclosureJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(SpaceShareDisclosureJson spaceShareDisclosureJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || spaceShareDisclosureJson.contains_personal_information) {
            c9j5.AA7(c9iZ, 0, spaceShareDisclosureJson.contains_personal_information);
        }
        if (zAfR || spaceShareDisclosureJson.contains_chat_history) {
            c9j5.AA7(c9iZ, 1, spaceShareDisclosureJson.contains_chat_history);
        }
        if (zAfR || spaceShareDisclosureJson.contains_user_shared_media) {
            c9j5.AA7(c9iZ, 2, spaceShareDisclosureJson.contains_user_shared_media);
        }
        if (zAfR || spaceShareDisclosureJson.contains_secrets_or_credentials) {
            c9j5.AA7(c9iZ, 3, spaceShareDisclosureJson.contains_secrets_or_credentials);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareDisclosureJson) {
                SpaceShareDisclosureJson spaceShareDisclosureJson = (SpaceShareDisclosureJson) obj;
                if (this.contains_personal_information != spaceShareDisclosureJson.contains_personal_information || this.contains_chat_history != spaceShareDisclosureJson.contains_chat_history || this.contains_user_shared_media != spaceShareDisclosureJson.contains_user_shared_media || this.contains_secrets_or_credentials != spaceShareDisclosureJson.contains_secrets_or_credentials) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceShareDisclosureJson copy$default(SpaceShareDisclosureJson spaceShareDisclosureJson, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = spaceShareDisclosureJson.contains_personal_information;
        }
        if ((i & 2) != 0) {
            z2 = spaceShareDisclosureJson.contains_chat_history;
        }
        if ((i & 4) != 0) {
            z3 = spaceShareDisclosureJson.contains_user_shared_media;
        }
        if ((i & 8) != 0) {
            z4 = spaceShareDisclosureJson.contains_secrets_or_credentials;
        }
        return new SpaceShareDisclosureJson(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.contains_personal_information;
    }

    public final boolean component2() {
        return this.contains_chat_history;
    }

    public final boolean component3() {
        return this.contains_user_shared_media;
    }

    public final boolean component4() {
        return this.contains_secrets_or_credentials;
    }

    public final SpaceShareDisclosureJson copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new SpaceShareDisclosureJson(z, z2, z3, z4);
    }

    public final boolean getContains_chat_history() {
        return this.contains_chat_history;
    }

    public final boolean getContains_personal_information() {
        return this.contains_personal_information;
    }

    public final boolean getContains_secrets_or_credentials() {
        return this.contains_secrets_or_credentials;
    }

    public final boolean getContains_user_shared_media() {
        return this.contains_user_shared_media;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A02(this.contains_personal_information), this.contains_chat_history), this.contains_user_shared_media), this.contains_secrets_or_credentials);
    }

    public /* synthetic */ SpaceShareDisclosureJson(int i, boolean z, boolean z2, boolean z3, boolean z4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.contains_personal_information = false;
        } else {
            this.contains_personal_information = z;
        }
        if ((i & 2) == 0) {
            this.contains_chat_history = false;
        } else {
            this.contains_chat_history = z2;
        }
        if ((i & 4) == 0) {
            this.contains_user_shared_media = false;
        } else {
            this.contains_user_shared_media = z3;
        }
        if ((i & 8) == 0) {
            this.contains_secrets_or_credentials = false;
        } else {
            this.contains_secrets_or_credentials = z4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SpaceShareDisclosureJson(boolean z, boolean z2, boolean z3, boolean z4) {
        this.contains_personal_information = z;
        this.contains_chat_history = z2;
        this.contains_user_shared_media = z3;
        this.contains_secrets_or_credentials = z4;
    }

    public /* synthetic */ SpaceShareDisclosureJson(boolean z, boolean z2, boolean z3, boolean z4, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), AnonymousClass005.A1P(i, z4));
    }

    public SpaceShareDisclosureJson() {
        this(false, false, false, false);
    }
}

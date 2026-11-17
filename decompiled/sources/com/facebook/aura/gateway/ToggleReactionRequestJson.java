package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ToggleReactionRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String emoji;
    public final String message_id;
    public final String session_id;

    public final class Companion {
        public final C9hr<ToggleReactionRequestJson> serializer() {
            return ToggleReactionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ToggleReactionRequestJson toggleReactionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(toggleReactionRequestJson.message_id, c9iZ, 0);
        c9j5.AAV(toggleReactionRequestJson.emoji, c9iZ, 1);
        if (c9j5.AfR() || toggleReactionRequestJson.session_id != null) {
            c9j5.AAP(toggleReactionRequestJson.session_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToggleReactionRequestJson) {
                ToggleReactionRequestJson toggleReactionRequestJson = (ToggleReactionRequestJson) obj;
                if (!C7384Etj.areEqual(this.message_id, toggleReactionRequestJson.message_id) || !C7384Etj.areEqual(this.emoji, toggleReactionRequestJson.emoji) || !C7384Etj.areEqual(this.session_id, toggleReactionRequestJson.session_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ToggleReactionRequestJson copy$default(ToggleReactionRequestJson toggleReactionRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toggleReactionRequestJson.message_id;
        }
        if ((i & 2) != 0) {
            str2 = toggleReactionRequestJson.emoji;
        }
        if ((i & 4) != 0) {
            str3 = toggleReactionRequestJson.session_id;
        }
        return toggleReactionRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.message_id;
    }

    public final String component2() {
        return this.emoji;
    }

    public final String component3() {
        return this.session_id;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.emoji, AnonymousClass001.A0G(this.message_id)) + AnonymousClass006.A0G(this.session_id);
    }

    public ToggleReactionRequestJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.message_id = str;
        this.emoji = str2;
        this.session_id = str3;
    }

    public final ToggleReactionRequestJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new ToggleReactionRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ToggleReactionRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ToggleReactionRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.message_id = str;
        this.emoji = str2;
        this.session_id = C3cI.A0W(i, str3);
    }

    public /* synthetic */ ToggleReactionRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}

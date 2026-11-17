package com.facebook.aura.navigation.key;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConversationSearchScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String initialQuery;

    public final class Companion {
        public final C9hr<ConversationSearchScreenKey> serializer() {
            return ConversationSearchScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ConversationSearchScreenKey conversationSearchScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || conversationSearchScreenKey.initialQuery != null) {
            c9j5.AAP(conversationSearchScreenKey.initialQuery, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConversationSearchScreenKey) && C7384Etj.areEqual(this.initialQuery, ((ConversationSearchScreenKey) obj).initialQuery));
    }

    public static /* synthetic */ ConversationSearchScreenKey copy$default(ConversationSearchScreenKey conversationSearchScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationSearchScreenKey.initialQuery;
        }
        return new ConversationSearchScreenKey(str);
    }

    public final String component1() {
        return this.initialQuery;
    }

    public final ConversationSearchScreenKey copy(String str) {
        return new ConversationSearchScreenKey(str);
    }

    public final String getInitialQuery() {
        return this.initialQuery;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.initialQuery);
    }

    public /* synthetic */ ConversationSearchScreenKey(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public String toString() {
        return super.toString();
    }

    public ConversationSearchScreenKey(String str) {
        this.initialQuery = str;
    }

    public /* synthetic */ ConversationSearchScreenKey(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.initialQuery = null;
        } else {
            this.initialQuery = str;
        }
    }

    public ConversationSearchScreenKey() {
        this(null);
    }
}

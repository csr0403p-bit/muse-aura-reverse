package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class CancelChatPayloadJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean cancelled;
    public final String message_id;

    public final class Companion {
        public final C9hr<CancelChatPayloadJson> serializer() {
            return CancelChatPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CancelChatPayloadJson(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        this.cancelled = z;
        this.message_id = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(CancelChatPayloadJson cancelChatPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || cancelChatPayloadJson.cancelled) {
            c9j5.AA7(c9iZ, 0, cancelChatPayloadJson.cancelled);
        }
        if (zAfR || !C3cH.A1Q(cancelChatPayloadJson.message_id)) {
            c9j5.AAV(cancelChatPayloadJson.message_id, c9iZ, 1);
        }
    }

    public final CancelChatPayloadJson copy(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        return new CancelChatPayloadJson(z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CancelChatPayloadJson) {
                CancelChatPayloadJson cancelChatPayloadJson = (CancelChatPayloadJson) obj;
                if (this.cancelled != cancelChatPayloadJson.cancelled || !C7384Etj.areEqual(this.message_id, cancelChatPayloadJson.message_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CancelChatPayloadJson copy$default(CancelChatPayloadJson cancelChatPayloadJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cancelChatPayloadJson.cancelled;
        }
        if ((i & 2) != 0) {
            str = cancelChatPayloadJson.message_id;
        }
        C7384Etj.A0Y(str, 1);
        return new CancelChatPayloadJson(z, str);
    }

    public final boolean component1() {
        return this.cancelled;
    }

    public final String component2() {
        return this.message_id;
    }

    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.message_id, C0KA.A02(this.cancelled));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CancelChatPayloadJson(int i, boolean z, String str, C2hx c2hx) {
        this.cancelled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.message_id = "";
        } else {
            this.message_id = str;
        }
    }

    public /* synthetic */ CancelChatPayloadJson(boolean z, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? "" : str);
    }

    public CancelChatPayloadJson() {
        this(false, "");
    }
}

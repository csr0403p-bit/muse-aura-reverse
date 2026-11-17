package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ReplyTargetTypeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String type;

    public final class Companion {
        public final C9hr<ReplyTargetTypeJson> serializer() {
            return ReplyTargetTypeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ReplyTargetTypeJson replyTargetTypeJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || replyTargetTypeJson.type != null) {
            c9j5.AAP(replyTargetTypeJson.type, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ReplyTargetTypeJson) && C7384Etj.areEqual(this.type, ((ReplyTargetTypeJson) obj).type));
    }

    public static /* synthetic */ ReplyTargetTypeJson copy$default(ReplyTargetTypeJson replyTargetTypeJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyTargetTypeJson.type;
        }
        return new ReplyTargetTypeJson(str);
    }

    public final String component1() {
        return this.type;
    }

    public final ReplyTargetTypeJson copy(String str) {
        return new ReplyTargetTypeJson(str);
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.type);
    }

    public /* synthetic */ ReplyTargetTypeJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ReplyTargetTypeJson(String str) {
        this.type = str;
    }

    public /* synthetic */ ReplyTargetTypeJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ReplyTargetTypeJson() {
        this(null);
    }
}

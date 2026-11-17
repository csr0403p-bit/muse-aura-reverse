package com.facebook.aura.user.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TosStatusResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean has_accepted_tos;

    public final class Companion {
        public final C9hr<TosStatusResponseJson> serializer() {
            return TosStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_user_repo_repo(TosStatusResponseJson tosStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || tosStatusResponseJson.has_accepted_tos) {
            c9j5.AA7(c9iZ, 0, tosStatusResponseJson.has_accepted_tos);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TosStatusResponseJson) && this.has_accepted_tos == ((TosStatusResponseJson) obj).has_accepted_tos);
    }

    public static /* synthetic */ TosStatusResponseJson copy$default(TosStatusResponseJson tosStatusResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tosStatusResponseJson.has_accepted_tos;
        }
        return new TosStatusResponseJson(z);
    }

    public final boolean component1() {
        return this.has_accepted_tos;
    }

    public final TosStatusResponseJson copy(boolean z) {
        return new TosStatusResponseJson(z);
    }

    public final boolean getHas_accepted_tos() {
        return this.has_accepted_tos;
    }

    public int hashCode() {
        return this.has_accepted_tos ? 1231 : 1237;
    }

    public /* synthetic */ TosStatusResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.has_accepted_tos = false;
        } else {
            this.has_accepted_tos = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public TosStatusResponseJson(boolean z) {
        this.has_accepted_tos = z;
    }

    public /* synthetic */ TosStatusResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public TosStatusResponseJson() {
        this(false);
    }
}

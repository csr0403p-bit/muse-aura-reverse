package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SuccessResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean success;

    public final class Companion {
        public final C9hr<SuccessResponseJson> serializer() {
            return SuccessResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(SuccessResponseJson successResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || successResponseJson.success) {
            c9j5.AA7(c9iZ, 0, successResponseJson.success);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SuccessResponseJson) && this.success == ((SuccessResponseJson) obj).success);
    }

    public static /* synthetic */ SuccessResponseJson copy$default(SuccessResponseJson successResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = successResponseJson.success;
        }
        return new SuccessResponseJson(z);
    }

    public final boolean component1() {
        return this.success;
    }

    public final SuccessResponseJson copy(boolean z) {
        return new SuccessResponseJson(z);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.success ? 1231 : 1237;
    }

    public /* synthetic */ SuccessResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.success = false;
        } else {
            this.success = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SuccessResponseJson(boolean z) {
        this.success = z;
    }

    public /* synthetic */ SuccessResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public SuccessResponseJson() {
        this(false);
    }
}

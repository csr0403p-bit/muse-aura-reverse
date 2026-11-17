package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class NativeLoginCheckpointDecryptResponseJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final Long frl_account_id;

    public final class Companion {
        public final C9hr<NativeLoginCheckpointDecryptResponseJson> serializer() {
            return NativeLoginCheckpointDecryptResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_checkpoint_checkpoint(NativeLoginCheckpointDecryptResponseJson nativeLoginCheckpointDecryptResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || nativeLoginCheckpointDecryptResponseJson.access_token != null) {
            c9j5.AAP(nativeLoginCheckpointDecryptResponseJson.access_token, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || nativeLoginCheckpointDecryptResponseJson.frl_account_id != null) {
            c9j5.AAP(nativeLoginCheckpointDecryptResponseJson.frl_account_id, C9j1.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginCheckpointDecryptResponseJson) {
                NativeLoginCheckpointDecryptResponseJson nativeLoginCheckpointDecryptResponseJson = (NativeLoginCheckpointDecryptResponseJson) obj;
                if (!C7384Etj.areEqual(this.access_token, nativeLoginCheckpointDecryptResponseJson.access_token) || !C7384Etj.areEqual(this.frl_account_id, nativeLoginCheckpointDecryptResponseJson.frl_account_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginCheckpointDecryptResponseJson copy$default(NativeLoginCheckpointDecryptResponseJson nativeLoginCheckpointDecryptResponseJson, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLoginCheckpointDecryptResponseJson.access_token;
        }
        if ((i & 2) != 0) {
            l = nativeLoginCheckpointDecryptResponseJson.frl_account_id;
        }
        return new NativeLoginCheckpointDecryptResponseJson(str, l);
    }

    public final String component1() {
        return this.access_token;
    }

    public final Long component2() {
        return this.frl_account_id;
    }

    public final NativeLoginCheckpointDecryptResponseJson copy(String str, Long l) {
        return new NativeLoginCheckpointDecryptResponseJson(str, l);
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final Long getFrl_account_id() {
        return this.frl_account_id;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.access_token) * 31) + C3cH.A02(this.frl_account_id);
    }

    public String toString() {
        return C3cJ.A0L(this.frl_account_id, ", frl_account_id=", C3cI.A0x("NativeLoginCheckpointDecryptResponseJson(access_token=", this.access_token));
    }

    public final String validatedAccessToken() {
        Long l;
        String str = this.access_token;
        if (str == null || C7BY.A0j(str) || (l = this.frl_account_id) == null || l.longValue() <= 0) {
            return null;
        }
        return str;
    }

    public NativeLoginCheckpointDecryptResponseJson(String str, Long l) {
        this.access_token = str;
        this.frl_account_id = l;
    }

    public /* synthetic */ NativeLoginCheckpointDecryptResponseJson(int i, String str, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.access_token = null;
        } else {
            this.access_token = str;
        }
        if ((i & 2) == 0) {
            this.frl_account_id = null;
        } else {
            this.frl_account_id = l;
        }
    }

    public /* synthetic */ NativeLoginCheckpointDecryptResponseJson(String str, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }

    public NativeLoginCheckpointDecryptResponseJson() {
        this(null, null);
    }
}

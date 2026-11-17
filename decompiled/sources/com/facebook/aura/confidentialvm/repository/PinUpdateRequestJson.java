package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PinUpdateRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String encrypted_pin_verifier;
    public final long last_successful_entry_at_ms;
    public final String replaces_update_id;
    public final String update_id;

    public final class Companion {
        public final C9hr<PinUpdateRequestJson> serializer() {
            return PinUpdateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PinUpdateRequestJson copy$default(PinUpdateRequestJson pinUpdateRequestJson, String str, String str2, String str3, long j, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j2 = j;
        if ((i & 1) != 0) {
            str4 = pinUpdateRequestJson.update_id;
        }
        if ((i & 2) != 0) {
            str5 = pinUpdateRequestJson.replaces_update_id;
        }
        if ((i & 4) != 0) {
            str6 = pinUpdateRequestJson.encrypted_pin_verifier;
        }
        if ((i & 8) != 0) {
            j2 = pinUpdateRequestJson.last_successful_entry_at_ms;
        }
        AnonymousClass003.A0v(str4, str6);
        return new PinUpdateRequestJson(str4, str5, str6, j2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(PinUpdateRequestJson pinUpdateRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pinUpdateRequestJson.update_id, c9iZ, 0);
        if (c9j5.AfR() || pinUpdateRequestJson.replaces_update_id != null) {
            c9j5.AAP(pinUpdateRequestJson.replaces_update_id, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAV(pinUpdateRequestJson.encrypted_pin_verifier, c9iZ, 2);
        c9j5.AAN(c9iZ, 3, pinUpdateRequestJson.last_successful_entry_at_ms);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PinUpdateRequestJson) {
                PinUpdateRequestJson pinUpdateRequestJson = (PinUpdateRequestJson) obj;
                if (!C7384Etj.areEqual(this.update_id, pinUpdateRequestJson.update_id) || !C7384Etj.areEqual(this.replaces_update_id, pinUpdateRequestJson.replaces_update_id) || !C7384Etj.areEqual(this.encrypted_pin_verifier, pinUpdateRequestJson.encrypted_pin_verifier) || this.last_successful_entry_at_ms != pinUpdateRequestJson.last_successful_entry_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.update_id;
    }

    public final String component2() {
        return this.replaces_update_id;
    }

    public final String component3() {
        return this.encrypted_pin_verifier;
    }

    public final long component4() {
        return this.last_successful_entry_at_ms;
    }

    public final String getEncrypted_pin_verifier() {
        return this.encrypted_pin_verifier;
    }

    public final long getLast_successful_entry_at_ms() {
        return this.last_successful_entry_at_ms;
    }

    public final String getReplaces_update_id() {
        return this.replaces_update_id;
    }

    public final String getUpdate_id() {
        return this.update_id;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.last_successful_entry_at_ms, AnonymousClass005.A0I(this.encrypted_pin_verifier, (AnonymousClass001.A0G(this.update_id) + AnonymousClass006.A0G(this.replaces_update_id)) * 31));
    }

    public PinUpdateRequestJson(String str, String str2, String str3, long j) {
        AnonymousClass003.A0v(str, str3);
        this.update_id = str;
        this.replaces_update_id = str2;
        this.encrypted_pin_verifier = str3;
        this.last_successful_entry_at_ms = j;
    }

    public final PinUpdateRequestJson copy(String str, String str2, String str3, long j) {
        AnonymousClass003.A0v(str, str3);
        return new PinUpdateRequestJson(str, str2, str3, j);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PinUpdateRequestJson(int i, String str, String str2, String str3, long j, C2hx c2hx) {
        if (13 != (i & 13)) {
            C9iI.A00(PinUpdateRequestJson$$serializer.descriptor, i, 13);
            throw F60.createAndThrow();
        }
        this.update_id = str;
        this.replaces_update_id = C8j4.A0t(i, str2);
        this.encrypted_pin_verifier = str3;
        this.last_successful_entry_at_ms = j;
    }

    public /* synthetic */ PinUpdateRequestJson(String str, String str2, String str3, long j, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), str3, j);
    }
}

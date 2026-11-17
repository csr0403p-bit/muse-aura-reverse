package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
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
public final class PinStateJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String encrypted_pin_verifier;
    public final long last_successful_entry_at_ms;
    public final long reminder_interval_days;
    public final String replaces_update_id;
    public final long state_revision;
    public final String update_id;

    public final class Companion {
        public final C9hr<PinStateJson> serializer() {
            return PinStateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(PinStateJson pinStateJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAN(c9iZ, 0, pinStateJson.state_revision);
        c9j5.AAV(pinStateJson.update_id, c9iZ, 1);
        if (c9j5.AfR() || pinStateJson.replaces_update_id != null) {
            c9j5.AAP(pinStateJson.replaces_update_id, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAV(pinStateJson.encrypted_pin_verifier, c9iZ, 3);
        c9j5.AAN(c9iZ, 4, pinStateJson.last_successful_entry_at_ms);
        c9j5.AAN(c9iZ, 5, pinStateJson.reminder_interval_days);
    }

    public final PinStateJson copy(long j, String str, String str2, String str3, long j2, long j3) {
        AnonymousClass002.A1B(str, 1, str3);
        return new PinStateJson(j, str, str2, str3, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PinStateJson) {
                PinStateJson pinStateJson = (PinStateJson) obj;
                if (this.state_revision != pinStateJson.state_revision || !C7384Etj.areEqual(this.update_id, pinStateJson.update_id) || !C7384Etj.areEqual(this.replaces_update_id, pinStateJson.replaces_update_id) || !C7384Etj.areEqual(this.encrypted_pin_verifier, pinStateJson.encrypted_pin_verifier) || this.last_successful_entry_at_ms != pinStateJson.last_successful_entry_at_ms || this.reminder_interval_days != pinStateJson.reminder_interval_days) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PinStateJson(int i, long j, String str, String str2, String str3, long j2, long j3, C2hx c2hx) {
        if (59 != (i & 59)) {
            C9iI.A00(PinStateJson$$serializer.descriptor, i, 59);
            throw F60.createAndThrow();
        }
        this.state_revision = j;
        this.update_id = str;
        this.replaces_update_id = C3cI.A0W(i, str2);
        this.encrypted_pin_verifier = str3;
        this.last_successful_entry_at_ms = j2;
        this.reminder_interval_days = j3;
    }

    public static /* synthetic */ PinStateJson copy$default(PinStateJson pinStateJson, long j, String str, String str2, String str3, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pinStateJson.state_revision;
        }
        if ((i & 2) != 0) {
            str = pinStateJson.update_id;
        }
        if ((i & 4) != 0) {
            str2 = pinStateJson.replaces_update_id;
        }
        if ((i & 8) != 0) {
            str3 = pinStateJson.encrypted_pin_verifier;
        }
        if ((i & 16) != 0) {
            j2 = pinStateJson.last_successful_entry_at_ms;
        }
        if ((i & 32) != 0) {
            j3 = pinStateJson.reminder_interval_days;
        }
        return pinStateJson.copy(j, str, str2, str3, j2, j3);
    }

    public final long component1() {
        return this.state_revision;
    }

    public final String component2() {
        return this.update_id;
    }

    public final String component3() {
        return this.replaces_update_id;
    }

    public final String component4() {
        return this.encrypted_pin_verifier;
    }

    public final long component5() {
        return this.last_successful_entry_at_ms;
    }

    public final long component6() {
        return this.reminder_interval_days;
    }

    public final String getEncrypted_pin_verifier() {
        return this.encrypted_pin_verifier;
    }

    public final long getLast_successful_entry_at_ms() {
        return this.last_successful_entry_at_ms;
    }

    public final long getReminder_interval_days() {
        return this.reminder_interval_days;
    }

    public final String getReplaces_update_id() {
        return this.replaces_update_id;
    }

    public final long getState_revision() {
        return this.state_revision;
    }

    public final String getUpdate_id() {
        return this.update_id;
    }

    public int hashCode() {
        return C8j4.A0B(this.reminder_interval_days, AnonymousClass006.A06(this.last_successful_entry_at_ms, AnonymousClass005.A0I(this.encrypted_pin_verifier, (AnonymousClass005.A0I(this.update_id, AnonymousClass005.A07(this.state_revision)) + AnonymousClass006.A0G(this.replaces_update_id)) * 31)));
    }

    public String toString() {
        return super.toString();
    }

    public PinStateJson(long j, String str, String str2, String str3, long j2, long j3) {
        AnonymousClass002.A1B(str, 1, str3);
        this.state_revision = j;
        this.update_id = str;
        this.replaces_update_id = str2;
        this.encrypted_pin_verifier = str3;
        this.last_successful_entry_at_ms = j2;
        this.reminder_interval_days = j3;
    }

    public /* synthetic */ PinStateJson(long j, String str, String str2, String str3, long j2, long j3, int i, C06H c06h) {
        this(j, str, AnonymousClass006.A0t(i, str2), str3, j2, j3);
    }
}

package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
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
public final class PinConfirmRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean had_wrong_guess;
    public final long last_successful_entry_at_ms;
    public final String reminder_id;
    public final long state_revision;
    public final String update_id;

    public final class Companion {
        public final C9hr<PinConfirmRequestJson> serializer() {
            return PinConfirmRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(PinConfirmRequestJson pinConfirmRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pinConfirmRequestJson.reminder_id, c9iZ, 0);
        c9j5.AAV(pinConfirmRequestJson.update_id, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, pinConfirmRequestJson.state_revision);
        c9j5.AA7(c9iZ, 3, pinConfirmRequestJson.had_wrong_guess);
        c9j5.AAN(c9iZ, 4, pinConfirmRequestJson.last_successful_entry_at_ms);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PinConfirmRequestJson) {
                PinConfirmRequestJson pinConfirmRequestJson = (PinConfirmRequestJson) obj;
                if (!C7384Etj.areEqual(this.reminder_id, pinConfirmRequestJson.reminder_id) || !C7384Etj.areEqual(this.update_id, pinConfirmRequestJson.update_id) || this.state_revision != pinConfirmRequestJson.state_revision || this.had_wrong_guess != pinConfirmRequestJson.had_wrong_guess || this.last_successful_entry_at_ms != pinConfirmRequestJson.last_successful_entry_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PinConfirmRequestJson(int i, String str, String str2, long j, boolean z, long j2, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(PinConfirmRequestJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.reminder_id = str;
        this.update_id = str2;
        this.state_revision = j;
        this.had_wrong_guess = z;
        this.last_successful_entry_at_ms = j2;
    }

    public static /* synthetic */ PinConfirmRequestJson copy$default(PinConfirmRequestJson pinConfirmRequestJson, String str, String str2, long j, boolean z, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinConfirmRequestJson.reminder_id;
        }
        if ((i & 2) != 0) {
            str2 = pinConfirmRequestJson.update_id;
        }
        if ((i & 4) != 0) {
            j = pinConfirmRequestJson.state_revision;
        }
        if ((i & 8) != 0) {
            z = pinConfirmRequestJson.had_wrong_guess;
        }
        if ((i & 16) != 0) {
            j2 = pinConfirmRequestJson.last_successful_entry_at_ms;
        }
        return pinConfirmRequestJson.copy(str, str2, j, z, j2);
    }

    public final String component1() {
        return this.reminder_id;
    }

    public final String component2() {
        return this.update_id;
    }

    public final long component3() {
        return this.state_revision;
    }

    public final boolean component4() {
        return this.had_wrong_guess;
    }

    public final long component5() {
        return this.last_successful_entry_at_ms;
    }

    public final boolean getHad_wrong_guess() {
        return this.had_wrong_guess;
    }

    public final long getLast_successful_entry_at_ms() {
        return this.last_successful_entry_at_ms;
    }

    public final String getReminder_id() {
        return this.reminder_id;
    }

    public final long getState_revision() {
        return this.state_revision;
    }

    public final String getUpdate_id() {
        return this.update_id;
    }

    public int hashCode() {
        return C8j4.A0B(this.last_successful_entry_at_ms, C0KA.A01(AnonymousClass006.A06(this.state_revision, AnonymousClass005.A0I(this.update_id, AnonymousClass001.A0G(this.reminder_id))), this.had_wrong_guess));
    }

    public final PinConfirmRequestJson copy(String str, String str2, long j, boolean z, long j2) {
        AnonymousClass003.A0u(str, str2);
        return new PinConfirmRequestJson(str, str2, j, z, j2);
    }

    public String toString() {
        return super.toString();
    }

    public PinConfirmRequestJson(String str, String str2, long j, boolean z, long j2) {
        AnonymousClass003.A0u(str, str2);
        this.reminder_id = str;
        this.update_id = str2;
        this.state_revision = j;
        this.had_wrong_guess = z;
        this.last_successful_entry_at_ms = j2;
    }
}

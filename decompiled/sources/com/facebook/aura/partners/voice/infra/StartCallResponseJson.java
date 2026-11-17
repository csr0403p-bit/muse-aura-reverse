package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class StartCallResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean avatar_updating;
    public final String call_id;
    public final boolean ok;
    public final boolean preempted;
    public final String session_id;

    public final class Companion {
        public final C9hr<StartCallResponseJson> serializer() {
            return StartCallResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(StartCallResponseJson startCallResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || startCallResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, startCallResponseJson.ok);
        }
        if (zAfR || startCallResponseJson.call_id != null) {
            c9j5.AAP(startCallResponseJson.call_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || startCallResponseJson.session_id != null) {
            c9j5.AAP(startCallResponseJson.session_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || startCallResponseJson.preempted) {
            c9j5.AA7(c9iZ, 3, startCallResponseJson.preempted);
        }
        if (zAfR || startCallResponseJson.avatar_updating) {
            c9j5.AA7(c9iZ, 4, startCallResponseJson.avatar_updating);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StartCallResponseJson) {
                StartCallResponseJson startCallResponseJson = (StartCallResponseJson) obj;
                if (this.ok != startCallResponseJson.ok || !C7384Etj.areEqual(this.call_id, startCallResponseJson.call_id) || !C7384Etj.areEqual(this.session_id, startCallResponseJson.session_id) || this.preempted != startCallResponseJson.preempted || this.avatar_updating != startCallResponseJson.avatar_updating) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StartCallResponseJson copy$default(StartCallResponseJson startCallResponseJson, boolean z, String str, String str2, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = startCallResponseJson.ok;
        }
        if ((i & 2) != 0) {
            str = startCallResponseJson.call_id;
        }
        if ((i & 4) != 0) {
            str2 = startCallResponseJson.session_id;
        }
        if ((i & 8) != 0) {
            z2 = startCallResponseJson.preempted;
        }
        if ((i & 16) != 0) {
            z3 = startCallResponseJson.avatar_updating;
        }
        return startCallResponseJson.copy(z, str, str2, z2, z3);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final String component2() {
        return this.call_id;
    }

    public final String component3() {
        return this.session_id;
    }

    public final boolean component4() {
        return this.preempted;
    }

    public final boolean component5() {
        return this.avatar_updating;
    }

    public final StartCallResponseJson copy(boolean z, String str, String str2, boolean z2, boolean z3) {
        return new StartCallResponseJson(z, str, str2, z2, z3);
    }

    public final boolean getAvatar_updating() {
        return this.avatar_updating;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final boolean getPreempted() {
        return this.preempted;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((((C0KA.A02(this.ok) + AnonymousClass006.A0G(this.call_id)) * 31) + AnonymousClass005.A0H(this.session_id)) * 31, this.preempted), this.avatar_updating);
    }

    public StartCallResponseJson(boolean z, String str, String str2, boolean z2, boolean z3) {
        this.ok = z;
        this.call_id = str;
        this.session_id = str2;
        this.preempted = z2;
        this.avatar_updating = z3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StartCallResponseJson(boolean z, String str, String str2, boolean z2, boolean z3, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, AnonymousClass005.A1P(i, z2), C3cI.A1S(i, z3));
    }

    public /* synthetic */ StartCallResponseJson(int i, boolean z, String str, String str2, boolean z2, boolean z3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.ok = false;
        } else {
            this.ok = z;
        }
        if ((i & 2) == 0) {
            this.call_id = null;
        } else {
            this.call_id = str;
        }
        if ((i & 4) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str2;
        }
        if ((i & 8) == 0) {
            this.preempted = false;
        } else {
            this.preempted = z2;
        }
        if ((i & 16) == 0) {
            this.avatar_updating = false;
        } else {
            this.avatar_updating = z3;
        }
    }

    public StartCallResponseJson() {
        this(false, null, null, false, false);
    }
}

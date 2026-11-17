package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionCapabilitiesJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean conversation_worker;
    public final String disconnect_effect;
    public final boolean ordinary_provider_messaging;
    public final boolean rules_enforced;
    public final boolean typed_shares;
    public final boolean worker_tasks;

    public final class Companion {
        public final C9hr<ConnectionCapabilitiesJson> serializer() {
            return ConnectionCapabilitiesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ConnectionCapabilitiesJson copy$default(ConnectionCapabilitiesJson connectionCapabilitiesJson, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, int i, Object obj) {
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        boolean z10 = z5;
        String str2 = str;
        if ((i & 1) != 0) {
            z6 = connectionCapabilitiesJson.conversation_worker;
        }
        if ((i & 2) != 0) {
            z7 = connectionCapabilitiesJson.worker_tasks;
        }
        if ((i & 4) != 0) {
            z8 = connectionCapabilitiesJson.ordinary_provider_messaging;
        }
        if ((i & 8) != 0) {
            z9 = connectionCapabilitiesJson.rules_enforced;
        }
        if ((i & 16) != 0) {
            z10 = connectionCapabilitiesJson.typed_shares;
        }
        if ((i & 32) != 0) {
            str2 = connectionCapabilitiesJson.disconnect_effect;
        }
        return new ConnectionCapabilitiesJson(z6, z7, z8, z9, z10, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionCapabilitiesJson connectionCapabilitiesJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || connectionCapabilitiesJson.conversation_worker) {
            c9j5.AA7(c9iZ, 0, connectionCapabilitiesJson.conversation_worker);
        }
        if (zAfR || connectionCapabilitiesJson.worker_tasks) {
            c9j5.AA7(c9iZ, 1, connectionCapabilitiesJson.worker_tasks);
        }
        if (zAfR || connectionCapabilitiesJson.ordinary_provider_messaging) {
            c9j5.AA7(c9iZ, 2, connectionCapabilitiesJson.ordinary_provider_messaging);
        }
        if (zAfR || connectionCapabilitiesJson.rules_enforced) {
            c9j5.AA7(c9iZ, 3, connectionCapabilitiesJson.rules_enforced);
        }
        if (zAfR || connectionCapabilitiesJson.typed_shares) {
            c9j5.AA7(c9iZ, 4, connectionCapabilitiesJson.typed_shares);
        }
        if (zAfR || connectionCapabilitiesJson.disconnect_effect != null) {
            c9j5.AAP(connectionCapabilitiesJson.disconnect_effect, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionCapabilitiesJson) {
                ConnectionCapabilitiesJson connectionCapabilitiesJson = (ConnectionCapabilitiesJson) obj;
                if (this.conversation_worker != connectionCapabilitiesJson.conversation_worker || this.worker_tasks != connectionCapabilitiesJson.worker_tasks || this.ordinary_provider_messaging != connectionCapabilitiesJson.ordinary_provider_messaging || this.rules_enforced != connectionCapabilitiesJson.rules_enforced || this.typed_shares != connectionCapabilitiesJson.typed_shares || !C7384Etj.areEqual(this.disconnect_effect, connectionCapabilitiesJson.disconnect_effect)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.conversation_worker;
    }

    public final boolean component2() {
        return this.worker_tasks;
    }

    public final boolean component3() {
        return this.ordinary_provider_messaging;
    }

    public final boolean component4() {
        return this.rules_enforced;
    }

    public final boolean component5() {
        return this.typed_shares;
    }

    public final String component6() {
        return this.disconnect_effect;
    }

    public final ConnectionCapabilitiesJson copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        return new ConnectionCapabilitiesJson(z, z2, z3, z4, z5, str);
    }

    public final boolean getConversation_worker() {
        return this.conversation_worker;
    }

    public final String getDisconnect_effect() {
        return this.disconnect_effect;
    }

    public final boolean getOrdinary_provider_messaging() {
        return this.ordinary_provider_messaging;
    }

    public final boolean getRules_enforced() {
        return this.rules_enforced;
    }

    public final boolean getTyped_shares() {
        return this.typed_shares;
    }

    public final boolean getWorker_tasks() {
        return this.worker_tasks;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.conversation_worker), this.worker_tasks), this.ordinary_provider_messaging), this.rules_enforced), this.typed_shares) + AnonymousClass006.A0G(this.disconnect_effect);
    }

    public ConnectionCapabilitiesJson(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        this.conversation_worker = z;
        this.worker_tasks = z2;
        this.ordinary_provider_messaging = z3;
        this.rules_enforced = z4;
        this.typed_shares = z5;
        this.disconnect_effect = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionCapabilitiesJson(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), AnonymousClass005.A1P(i, z4), AnonymousClass005.A1Q(i, z5), (i & 32) != 0 ? null : str);
    }

    public /* synthetic */ ConnectionCapabilitiesJson(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.conversation_worker = false;
        } else {
            this.conversation_worker = z;
        }
        if ((i & 2) == 0) {
            this.worker_tasks = false;
        } else {
            this.worker_tasks = z2;
        }
        if ((i & 4) == 0) {
            this.ordinary_provider_messaging = false;
        } else {
            this.ordinary_provider_messaging = z3;
        }
        if ((i & 8) == 0) {
            this.rules_enforced = false;
        } else {
            this.rules_enforced = z4;
        }
        if ((i & 16) == 0) {
            this.typed_shares = false;
        } else {
            this.typed_shares = z5;
        }
        if ((i & 32) == 0) {
            this.disconnect_effect = null;
        } else {
            this.disconnect_effect = str;
        }
    }

    public ConnectionCapabilitiesJson() {
        this(false, false, false, false, false, null);
    }
}

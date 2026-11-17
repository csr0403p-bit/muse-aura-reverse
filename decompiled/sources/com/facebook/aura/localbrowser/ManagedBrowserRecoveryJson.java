package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserRecoveryJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ManagedBrowserCapabilitiesJson admitted_capabilities;
    public final ManagedBrowserBindingJson binding;
    public final ManagedBrowserSensitiveSitePolicyJson sensitive_site_policy;
    public final long state_revision;
    public final String unresolved_operation;

    public final class Companion {
        public final C9hr<ManagedBrowserRecoveryJson> serializer() {
            return ManagedBrowserRecoveryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserRecoveryJson) {
                ManagedBrowserRecoveryJson managedBrowserRecoveryJson = (ManagedBrowserRecoveryJson) obj;
                if (!C7384Etj.areEqual(this.binding, managedBrowserRecoveryJson.binding) || !C7384Etj.areEqual(this.admitted_capabilities, managedBrowserRecoveryJson.admitted_capabilities) || this.state_revision != managedBrowserRecoveryJson.state_revision || !C7384Etj.areEqual(this.sensitive_site_policy, managedBrowserRecoveryJson.sensitive_site_policy) || !C7384Etj.areEqual(this.unresolved_operation, managedBrowserRecoveryJson.unresolved_operation)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserRecoveryJson(int i, ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, long j, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, String str, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(ManagedBrowserRecoveryJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.binding = managedBrowserBindingJson;
        this.admitted_capabilities = managedBrowserCapabilitiesJson;
        this.state_revision = j;
        this.sensitive_site_policy = managedBrowserSensitiveSitePolicyJson;
        if ((i & 16) == 0) {
            this.unresolved_operation = null;
        } else {
            this.unresolved_operation = str;
        }
    }

    public static /* synthetic */ ManagedBrowserRecoveryJson copy$default(ManagedBrowserRecoveryJson managedBrowserRecoveryJson, ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, long j, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            managedBrowserBindingJson = managedBrowserRecoveryJson.binding;
        }
        if ((i & 2) != 0) {
            managedBrowserCapabilitiesJson = managedBrowserRecoveryJson.admitted_capabilities;
        }
        if ((i & 4) != 0) {
            j = managedBrowserRecoveryJson.state_revision;
        }
        if ((i & 8) != 0) {
            managedBrowserSensitiveSitePolicyJson = managedBrowserRecoveryJson.sensitive_site_policy;
        }
        if ((i & 16) != 0) {
            str = managedBrowserRecoveryJson.unresolved_operation;
        }
        return managedBrowserRecoveryJson.copy(managedBrowserBindingJson, managedBrowserCapabilitiesJson, j, managedBrowserSensitiveSitePolicyJson, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserRecoveryJson managedBrowserRecoveryJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(managedBrowserRecoveryJson.binding, ManagedBrowserBindingJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAQ(managedBrowserRecoveryJson.admitted_capabilities, ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, managedBrowserRecoveryJson.state_revision);
        c9j5.AAQ(managedBrowserRecoveryJson.sensitive_site_policy, ManagedBrowserSensitiveSitePolicyJson$$serializer.INSTANCE, c9iZ, 3);
        if (c9j5.AfR() || managedBrowserRecoveryJson.unresolved_operation != null) {
            c9j5.AAP(managedBrowserRecoveryJson.unresolved_operation, C07779iq.A01, c9iZ, 4);
        }
    }

    public final ManagedBrowserBindingJson component1() {
        return this.binding;
    }

    public final ManagedBrowserCapabilitiesJson component2() {
        return this.admitted_capabilities;
    }

    public final long component3() {
        return this.state_revision;
    }

    public final ManagedBrowserSensitiveSitePolicyJson component4() {
        return this.sensitive_site_policy;
    }

    public final String component5() {
        return this.unresolved_operation;
    }

    public final ManagedBrowserCapabilitiesJson getAdmitted_capabilities() {
        return this.admitted_capabilities;
    }

    public final ManagedBrowserBindingJson getBinding() {
        return this.binding;
    }

    public final ManagedBrowserSensitiveSitePolicyJson getSensitive_site_policy() {
        return this.sensitive_site_policy;
    }

    public final long getState_revision() {
        return this.state_revision;
    }

    public final String getUnresolved_operation() {
        return this.unresolved_operation;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.sensitive_site_policy, C60R.A00(this.state_revision, AnonymousClass005.A0F(this.admitted_capabilities, AnonymousClass005.A0E(this.binding)))) + AnonymousClass006.A0G(this.unresolved_operation);
    }

    public String toString() {
        ManagedBrowserBindingJson managedBrowserBindingJson = this.binding;
        ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson = this.admitted_capabilities;
        long j = this.state_revision;
        ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson = this.sensitive_site_policy;
        String str = this.unresolved_operation;
        StringBuilder sbA0f = C3cG.A0f(managedBrowserBindingJson, "ManagedBrowserRecoveryJson(binding=");
        sbA0f.append(", admitted_capabilities=");
        sbA0f.append(managedBrowserCapabilitiesJson);
        sbA0f.append(", state_revision=");
        sbA0f.append(j);
        sbA0f.append(", sensitive_site_policy=");
        sbA0f.append(managedBrowserSensitiveSitePolicyJson);
        return C3cJ.A0N(", unresolved_operation=", str, sbA0f);
    }

    public final ManagedBrowserRecoveryJson copy(ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, long j, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, String str) {
        AnonymousClass005.A0y(managedBrowserBindingJson, managedBrowserCapabilitiesJson, managedBrowserSensitiveSitePolicyJson);
        return new ManagedBrowserRecoveryJson(managedBrowserBindingJson, managedBrowserCapabilitiesJson, j, managedBrowserSensitiveSitePolicyJson, str);
    }

    public ManagedBrowserRecoveryJson(ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, long j, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, String str) {
        AnonymousClass005.A0y(managedBrowserBindingJson, managedBrowserCapabilitiesJson, managedBrowserSensitiveSitePolicyJson);
        this.binding = managedBrowserBindingJson;
        this.admitted_capabilities = managedBrowserCapabilitiesJson;
        this.state_revision = j;
        this.sensitive_site_policy = managedBrowserSensitiveSitePolicyJson;
        this.unresolved_operation = str;
    }

    public /* synthetic */ ManagedBrowserRecoveryJson(ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, long j, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, String str, int i, C06H c06h) {
        this(managedBrowserBindingJson, managedBrowserCapabilitiesJson, j, managedBrowserSensitiveSitePolicyJson, (i & 16) != 0 ? null : str);
    }
}

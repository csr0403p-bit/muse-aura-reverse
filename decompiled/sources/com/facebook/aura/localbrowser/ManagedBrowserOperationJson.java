package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserOperationJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ManagedBrowserActionJson action;
    public final ManagedBrowserCapabilitiesJson capabilities;
    public final String control;
    public final String kind;
    public final Long next_state_revision;
    public final String operation_id;
    public final ManagedBrowserBindingJson previous_binding;
    public final ManagedBrowserSensitiveSitePolicyJson sensitive_site_policy;
    public final String unresolved_operation;

    public final class Companion {
        public final C9hr<ManagedBrowserOperationJson> serializer() {
            return ManagedBrowserOperationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserOperationJson managedBrowserOperationJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(managedBrowserOperationJson.kind, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || managedBrowserOperationJson.capabilities != null) {
            c9j5.AAP(managedBrowserOperationJson.capabilities, ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || managedBrowserOperationJson.sensitive_site_policy != null) {
            c9j5.AAP(managedBrowserOperationJson.sensitive_site_policy, ManagedBrowserSensitiveSitePolicyJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || managedBrowserOperationJson.previous_binding != null) {
            c9j5.AAP(managedBrowserOperationJson.previous_binding, ManagedBrowserBindingJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || managedBrowserOperationJson.unresolved_operation != null) {
            c9j5.AAP(managedBrowserOperationJson.unresolved_operation, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || managedBrowserOperationJson.control != null) {
            c9j5.AAP(managedBrowserOperationJson.control, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || managedBrowserOperationJson.next_state_revision != null) {
            c9j5.AAP(managedBrowserOperationJson.next_state_revision, C9j1.A00, c9iZ, 6);
        }
        if (zAfR || managedBrowserOperationJson.action != null) {
            c9j5.AAP(managedBrowserOperationJson.action, ManagedBrowserActionJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || managedBrowserOperationJson.operation_id != null) {
            c9j5.AAP(managedBrowserOperationJson.operation_id, C07779iq.A01, c9iZ, 8);
        }
    }

    public final ManagedBrowserOperationJson copy(String str, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, ManagedBrowserBindingJson managedBrowserBindingJson, String str2, String str3, Long l, ManagedBrowserActionJson managedBrowserActionJson, String str4) {
        C7384Etj.A0Y(str, 0);
        return new ManagedBrowserOperationJson(str, managedBrowserCapabilitiesJson, managedBrowserSensitiveSitePolicyJson, managedBrowserBindingJson, str2, str3, l, managedBrowserActionJson, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserOperationJson) {
                ManagedBrowserOperationJson managedBrowserOperationJson = (ManagedBrowserOperationJson) obj;
                if (!C7384Etj.areEqual(this.kind, managedBrowserOperationJson.kind) || !C7384Etj.areEqual(this.capabilities, managedBrowserOperationJson.capabilities) || !C7384Etj.areEqual(this.sensitive_site_policy, managedBrowserOperationJson.sensitive_site_policy) || !C7384Etj.areEqual(this.previous_binding, managedBrowserOperationJson.previous_binding) || !C7384Etj.areEqual(this.unresolved_operation, managedBrowserOperationJson.unresolved_operation) || !C7384Etj.areEqual(this.control, managedBrowserOperationJson.control) || !C7384Etj.areEqual(this.next_state_revision, managedBrowserOperationJson.next_state_revision) || !C7384Etj.areEqual(this.action, managedBrowserOperationJson.action) || !C7384Etj.areEqual(this.operation_id, managedBrowserOperationJson.operation_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserOperationJson(int i, String str, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, ManagedBrowserBindingJson managedBrowserBindingJson, String str2, String str3, Long l, ManagedBrowserActionJson managedBrowserActionJson, String str4, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ManagedBrowserOperationJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.kind = str;
        if ((i & 2) == 0) {
            this.capabilities = null;
        } else {
            this.capabilities = managedBrowserCapabilitiesJson;
        }
        if ((i & 4) == 0) {
            this.sensitive_site_policy = null;
        } else {
            this.sensitive_site_policy = managedBrowserSensitiveSitePolicyJson;
        }
        if ((i & 8) == 0) {
            this.previous_binding = null;
        } else {
            this.previous_binding = managedBrowserBindingJson;
        }
        if ((i & 16) == 0) {
            this.unresolved_operation = null;
        } else {
            this.unresolved_operation = str2;
        }
        if ((i & 32) == 0) {
            this.control = null;
        } else {
            this.control = str3;
        }
        if ((i & 64) == 0) {
            this.next_state_revision = null;
        } else {
            this.next_state_revision = l;
        }
        if ((i & 128) == 0) {
            this.action = null;
        } else {
            this.action = managedBrowserActionJson;
        }
        if ((i & 256) == 0) {
            this.operation_id = null;
        } else {
            this.operation_id = str4;
        }
    }

    public static /* synthetic */ ManagedBrowserOperationJson copy$default(ManagedBrowserOperationJson managedBrowserOperationJson, String str, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, ManagedBrowserBindingJson managedBrowserBindingJson, String str2, String str3, Long l, ManagedBrowserActionJson managedBrowserActionJson, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedBrowserOperationJson.kind;
        }
        if ((i & 2) != 0) {
            managedBrowserCapabilitiesJson = managedBrowserOperationJson.capabilities;
        }
        if ((i & 4) != 0) {
            managedBrowserSensitiveSitePolicyJson = managedBrowserOperationJson.sensitive_site_policy;
        }
        if ((i & 8) != 0) {
            managedBrowserBindingJson = managedBrowserOperationJson.previous_binding;
        }
        if ((i & 16) != 0) {
            str2 = managedBrowserOperationJson.unresolved_operation;
        }
        if ((i & 32) != 0) {
            str3 = managedBrowserOperationJson.control;
        }
        if ((i & 64) != 0) {
            l = managedBrowserOperationJson.next_state_revision;
        }
        if ((i & 128) != 0) {
            managedBrowserActionJson = managedBrowserOperationJson.action;
        }
        if ((i & 256) != 0) {
            str4 = managedBrowserOperationJson.operation_id;
        }
        return managedBrowserOperationJson.copy(str, managedBrowserCapabilitiesJson, managedBrowserSensitiveSitePolicyJson, managedBrowserBindingJson, str2, str3, l, managedBrowserActionJson, str4);
    }

    public final String component1() {
        return this.kind;
    }

    public final ManagedBrowserCapabilitiesJson component2() {
        return this.capabilities;
    }

    public final ManagedBrowserSensitiveSitePolicyJson component3() {
        return this.sensitive_site_policy;
    }

    public final ManagedBrowserBindingJson component4() {
        return this.previous_binding;
    }

    public final String component5() {
        return this.unresolved_operation;
    }

    public final String component6() {
        return this.control;
    }

    public final Long component7() {
        return this.next_state_revision;
    }

    public final ManagedBrowserActionJson component8() {
        return this.action;
    }

    public final String component9() {
        return this.operation_id;
    }

    public final ManagedBrowserActionJson getAction() {
        return this.action;
    }

    public final ManagedBrowserCapabilitiesJson getCapabilities() {
        return this.capabilities;
    }

    public final String getControl() {
        return this.control;
    }

    public final String getKind() {
        return this.kind;
    }

    public final Long getNext_state_revision() {
        return this.next_state_revision;
    }

    public final String getOperation_id() {
        return this.operation_id;
    }

    public final ManagedBrowserBindingJson getPrevious_binding() {
        return this.previous_binding;
    }

    public final ManagedBrowserSensitiveSitePolicyJson getSensitive_site_policy() {
        return this.sensitive_site_policy;
    }

    public final String getUnresolved_operation() {
        return this.unresolved_operation;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0D(this.capabilities)) * 31) + AnonymousClass006.A0D(this.sensitive_site_policy)) * 31) + AnonymousClass006.A0D(this.previous_binding)) * 31) + AnonymousClass006.A0G(this.unresolved_operation)) * 31) + AnonymousClass006.A0G(this.control)) * 31) + AnonymousClass006.A0D(this.next_state_revision)) * 31) + AnonymousClass006.A0D(this.action)) * 31) + AnonymousClass005.A0H(this.operation_id);
    }

    public String toString() {
        String str = this.kind;
        ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson = this.capabilities;
        ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson = this.sensitive_site_policy;
        ManagedBrowserBindingJson managedBrowserBindingJson = this.previous_binding;
        String str2 = this.unresolved_operation;
        String str3 = this.control;
        Long l = this.next_state_revision;
        ManagedBrowserActionJson managedBrowserActionJson = this.action;
        String str4 = this.operation_id;
        StringBuilder sbA0x = C3cI.A0x("ManagedBrowserOperationJson(kind=", str);
        sbA0x.append(", capabilities=");
        sbA0x.append(managedBrowserCapabilitiesJson);
        sbA0x.append(", sensitive_site_policy=");
        sbA0x.append(managedBrowserSensitiveSitePolicyJson);
        sbA0x.append(", previous_binding=");
        sbA0x.append(managedBrowserBindingJson);
        sbA0x.append(", unresolved_operation=");
        sbA0x.append(str2);
        sbA0x.append(", control=");
        sbA0x.append(str3);
        sbA0x.append(", next_state_revision=");
        sbA0x.append(l);
        sbA0x.append(", action=");
        sbA0x.append(managedBrowserActionJson);
        return C3cJ.A0N(", operation_id=", str4, sbA0x);
    }

    public ManagedBrowserOperationJson(String str, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, ManagedBrowserBindingJson managedBrowserBindingJson, String str2, String str3, Long l, ManagedBrowserActionJson managedBrowserActionJson, String str4) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.capabilities = managedBrowserCapabilitiesJson;
        this.sensitive_site_policy = managedBrowserSensitiveSitePolicyJson;
        this.previous_binding = managedBrowserBindingJson;
        this.unresolved_operation = str2;
        this.control = str3;
        this.next_state_revision = l;
        this.action = managedBrowserActionJson;
        this.operation_id = str4;
    }

    public /* synthetic */ ManagedBrowserOperationJson(String str, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, ManagedBrowserBindingJson managedBrowserBindingJson, String str2, String str3, Long l, ManagedBrowserActionJson managedBrowserActionJson, String str4, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : managedBrowserCapabilitiesJson, (i & 4) != 0 ? null : managedBrowserSensitiveSitePolicyJson, (i & 8) != 0 ? null : managedBrowserBindingJson, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : managedBrowserActionJson, (i & 256) != 0 ? null : str4);
    }
}

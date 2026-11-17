package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserRegistrationJson {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement active_task;
    public final ManagedBrowserCapabilitiesJson capabilities;
    public final String executor_instance_id;
    public final String implementation_id;
    public final String lifecycle;
    public final long sequence;

    public final class Companion {
        public final C9hr<ManagedBrowserRegistrationJson> serializer() {
            return ManagedBrowserRegistrationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserRegistrationJson managedBrowserRegistrationJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(managedBrowserRegistrationJson.implementation_id, c9iZ, 0);
        c9j5.AAV(managedBrowserRegistrationJson.executor_instance_id, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, managedBrowserRegistrationJson.sequence);
        c9j5.AAQ(managedBrowserRegistrationJson.capabilities, ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, c9iZ, 3);
        c9j5.AAV(managedBrowserRegistrationJson.lifecycle, c9iZ, 4);
        c9j5.AAQ(managedBrowserRegistrationJson.active_task, JsonElementSerializer.A00, c9iZ, 5);
    }

    public final ManagedBrowserRegistrationJson copy(String str, String str2, long j, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, String str3, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, managedBrowserCapabilitiesJson, str3, jsonElement, 1);
        return new ManagedBrowserRegistrationJson(str, str2, j, managedBrowserCapabilitiesJson, str3, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserRegistrationJson) {
                ManagedBrowserRegistrationJson managedBrowserRegistrationJson = (ManagedBrowserRegistrationJson) obj;
                if (!C7384Etj.areEqual(this.implementation_id, managedBrowserRegistrationJson.implementation_id) || !C7384Etj.areEqual(this.executor_instance_id, managedBrowserRegistrationJson.executor_instance_id) || this.sequence != managedBrowserRegistrationJson.sequence || !C7384Etj.areEqual(this.capabilities, managedBrowserRegistrationJson.capabilities) || !C7384Etj.areEqual(this.lifecycle, managedBrowserRegistrationJson.lifecycle) || !C7384Etj.areEqual(this.active_task, managedBrowserRegistrationJson.active_task)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserRegistrationJson(int i, String str, String str2, long j, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, String str3, JsonElement jsonElement, C2hx c2hx) {
        if (63 != (i & 63)) {
            C9iI.A00(ManagedBrowserRegistrationJson$$serializer.descriptor, i, 63);
            throw F60.createAndThrow();
        }
        this.implementation_id = str;
        this.executor_instance_id = str2;
        this.sequence = j;
        this.capabilities = managedBrowserCapabilitiesJson;
        this.lifecycle = str3;
        this.active_task = jsonElement;
    }

    public static /* synthetic */ ManagedBrowserRegistrationJson copy$default(ManagedBrowserRegistrationJson managedBrowserRegistrationJson, String str, String str2, long j, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, String str3, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedBrowserRegistrationJson.implementation_id;
        }
        if ((i & 2) != 0) {
            str2 = managedBrowserRegistrationJson.executor_instance_id;
        }
        if ((i & 4) != 0) {
            j = managedBrowserRegistrationJson.sequence;
        }
        if ((i & 8) != 0) {
            managedBrowserCapabilitiesJson = managedBrowserRegistrationJson.capabilities;
        }
        if ((i & 16) != 0) {
            str3 = managedBrowserRegistrationJson.lifecycle;
        }
        if ((i & 32) != 0) {
            jsonElement = managedBrowserRegistrationJson.active_task;
        }
        return managedBrowserRegistrationJson.copy(str, str2, j, managedBrowserCapabilitiesJson, str3, jsonElement);
    }

    public final String component1() {
        return this.implementation_id;
    }

    public final String component2() {
        return this.executor_instance_id;
    }

    public final long component3() {
        return this.sequence;
    }

    public final ManagedBrowserCapabilitiesJson component4() {
        return this.capabilities;
    }

    public final String component5() {
        return this.lifecycle;
    }

    public final JsonElement component6() {
        return this.active_task;
    }

    public final JsonElement getActive_task() {
        return this.active_task;
    }

    public final ManagedBrowserCapabilitiesJson getCapabilities() {
        return this.capabilities;
    }

    public final String getExecutor_instance_id() {
        return this.executor_instance_id;
    }

    public final String getImplementation_id() {
        return this.implementation_id;
    }

    public final String getLifecycle() {
        return this.lifecycle;
    }

    public final long getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.active_task, AnonymousClass005.A0I(this.lifecycle, AnonymousClass005.A0F(this.capabilities, C60R.A00(this.sequence, AnonymousClass005.A0I(this.executor_instance_id, AnonymousClass001.A0G(this.implementation_id))))));
    }

    public String toString() {
        String str = this.implementation_id;
        String str2 = this.executor_instance_id;
        long j = this.sequence;
        ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson = this.capabilities;
        String str3 = this.lifecycle;
        JsonElement jsonElement = this.active_task;
        StringBuilder sbA0x = C3cI.A0x("ManagedBrowserRegistrationJson(implementation_id=", str);
        sbA0x.append(", executor_instance_id=");
        sbA0x.append(str2);
        sbA0x.append(", sequence=");
        sbA0x.append(j);
        sbA0x.append(", capabilities=");
        sbA0x.append(managedBrowserCapabilitiesJson);
        sbA0x.append(", lifecycle=");
        sbA0x.append(str3);
        return C3cJ.A0L(jsonElement, ", active_task=", sbA0x);
    }

    public ManagedBrowserRegistrationJson(String str, String str2, long j, ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, String str3, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, managedBrowserCapabilitiesJson, str3, jsonElement, 1);
        this.implementation_id = str;
        this.executor_instance_id = str2;
        this.sequence = j;
        this.capabilities = managedBrowserCapabilitiesJson;
        this.lifecycle = str3;
        this.active_task = jsonElement;
    }
}

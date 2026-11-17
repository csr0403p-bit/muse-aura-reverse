package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserBindingJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String account_id;
    public final String browser_task_id;
    public final long control_epoch;
    public final String device_id;
    public final String executor_instance_id;
    public final String task_binding_id;
    public final String transport_generation;
    public final String vm_id;

    public final class Companion {
        public final C9hr<ManagedBrowserBindingJson> serializer() {
            return ManagedBrowserBindingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserBindingJson managedBrowserBindingJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(managedBrowserBindingJson.browser_task_id, c9iZ, 0);
        c9j5.AAV(managedBrowserBindingJson.device_id, c9iZ, 1);
        c9j5.AAV(managedBrowserBindingJson.account_id, c9iZ, 2);
        c9j5.AAV(managedBrowserBindingJson.vm_id, c9iZ, 3);
        c9j5.AAV(managedBrowserBindingJson.executor_instance_id, c9iZ, 4);
        c9j5.AAV(managedBrowserBindingJson.task_binding_id, c9iZ, 5);
        c9j5.AAV(managedBrowserBindingJson.transport_generation, c9iZ, 6);
        c9j5.AAN(c9iZ, 7, managedBrowserBindingJson.control_epoch);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserBindingJson) {
                ManagedBrowserBindingJson managedBrowserBindingJson = (ManagedBrowserBindingJson) obj;
                if (!C7384Etj.areEqual(this.browser_task_id, managedBrowserBindingJson.browser_task_id) || !C7384Etj.areEqual(this.device_id, managedBrowserBindingJson.device_id) || !C7384Etj.areEqual(this.account_id, managedBrowserBindingJson.account_id) || !C7384Etj.areEqual(this.vm_id, managedBrowserBindingJson.vm_id) || !C7384Etj.areEqual(this.executor_instance_id, managedBrowserBindingJson.executor_instance_id) || !C7384Etj.areEqual(this.task_binding_id, managedBrowserBindingJson.task_binding_id) || !C7384Etj.areEqual(this.transport_generation, managedBrowserBindingJson.transport_generation) || this.control_epoch != managedBrowserBindingJson.control_epoch) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ManagedBrowserBindingJson copy$default(ManagedBrowserBindingJson managedBrowserBindingJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedBrowserBindingJson.browser_task_id;
        }
        if ((i & 2) != 0) {
            str2 = managedBrowserBindingJson.device_id;
        }
        if ((i & 4) != 0) {
            str3 = managedBrowserBindingJson.account_id;
        }
        if ((i & 8) != 0) {
            str4 = managedBrowserBindingJson.vm_id;
        }
        if ((i & 16) != 0) {
            str5 = managedBrowserBindingJson.executor_instance_id;
        }
        if ((i & 32) != 0) {
            str6 = managedBrowserBindingJson.task_binding_id;
        }
        if ((i & 64) != 0) {
            str7 = managedBrowserBindingJson.transport_generation;
        }
        if ((i & 128) != 0) {
            j = managedBrowserBindingJson.control_epoch;
        }
        return managedBrowserBindingJson.copy(str, str2, str3, str4, str5, str6, str7, j);
    }

    public final String component1() {
        return this.browser_task_id;
    }

    public final String component2() {
        return this.device_id;
    }

    public final String component3() {
        return this.account_id;
    }

    public final String component4() {
        return this.vm_id;
    }

    public final String component5() {
        return this.executor_instance_id;
    }

    public final String component6() {
        return this.task_binding_id;
    }

    public final String component7() {
        return this.transport_generation;
    }

    public final long component8() {
        return this.control_epoch;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getBrowser_task_id() {
        return this.browser_task_id;
    }

    public final long getControl_epoch() {
        return this.control_epoch;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getExecutor_instance_id() {
        return this.executor_instance_id;
    }

    public final String getTask_binding_id() {
        return this.task_binding_id;
    }

    public final String getTransport_generation() {
        return this.transport_generation;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.control_epoch, AnonymousClass005.A0I(this.transport_generation, AnonymousClass005.A0I(this.task_binding_id, AnonymousClass005.A0I(this.executor_instance_id, AnonymousClass005.A0I(this.vm_id, AnonymousClass005.A0I(this.account_id, AnonymousClass005.A0I(this.device_id, AnonymousClass001.A0G(this.browser_task_id))))))));
    }

    public String toString() {
        String str = this.browser_task_id;
        String str2 = this.device_id;
        String str3 = this.account_id;
        String str4 = this.vm_id;
        String str5 = this.executor_instance_id;
        String str6 = this.task_binding_id;
        String str7 = this.transport_generation;
        long j = this.control_epoch;
        StringBuilder sbA0x = C3cI.A0x("ManagedBrowserBindingJson(browser_task_id=", str);
        sbA0x.append(", device_id=");
        sbA0x.append(str2);
        sbA0x.append(", account_id=");
        sbA0x.append(str3);
        sbA0x.append(", vm_id=");
        sbA0x.append(str4);
        sbA0x.append(", executor_instance_id=");
        sbA0x.append(str5);
        sbA0x.append(", task_binding_id=");
        sbA0x.append(str6);
        sbA0x.append(", transport_generation=");
        sbA0x.append(str7);
        sbA0x.append(", control_epoch=");
        sbA0x.append(j);
        return AnonymousClass001.A0v(")", sbA0x);
    }

    public ManagedBrowserBindingJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, str7);
        this.browser_task_id = str;
        this.device_id = str2;
        this.account_id = str3;
        this.vm_id = str4;
        this.executor_instance_id = str5;
        this.task_binding_id = str6;
        this.transport_generation = str7;
        this.control_epoch = j;
    }

    public final ManagedBrowserBindingJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, str7);
        return new ManagedBrowserBindingJson(str, str2, str3, str4, str5, str6, str7, j);
    }

    public /* synthetic */ ManagedBrowserBindingJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, C2hx c2hx) {
        if (255 != (i & 255)) {
            C9iI.A00(ManagedBrowserBindingJson$$serializer.descriptor, i, 255);
            throw F60.createAndThrow();
        }
        this.browser_task_id = str;
        this.device_id = str2;
        this.account_id = str3;
        this.vm_id = str4;
        this.executor_instance_id = str5;
        this.task_binding_id = str6;
        this.transport_generation = str7;
        this.control_epoch = j;
    }
}

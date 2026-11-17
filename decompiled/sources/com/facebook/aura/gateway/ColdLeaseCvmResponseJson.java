package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ColdLeaseCvmResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean created;
    public final String vm_id;

    public final class Companion {
        public final C9hr<ColdLeaseCvmResponseJson> serializer() {
            return ColdLeaseCvmResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ColdLeaseCvmResponseJson(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.vm_id = str;
        this.created = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ColdLeaseCvmResponseJson coldLeaseCvmResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(coldLeaseCvmResponseJson.vm_id)) {
            c9j5.AAV(coldLeaseCvmResponseJson.vm_id, c9iZ, 0);
        }
        if (zAfR || coldLeaseCvmResponseJson.created) {
            c9j5.AA7(c9iZ, 1, coldLeaseCvmResponseJson.created);
        }
    }

    public final ColdLeaseCvmResponseJson copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new ColdLeaseCvmResponseJson(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ColdLeaseCvmResponseJson) {
                ColdLeaseCvmResponseJson coldLeaseCvmResponseJson = (ColdLeaseCvmResponseJson) obj;
                if (!C7384Etj.areEqual(this.vm_id, coldLeaseCvmResponseJson.vm_id) || this.created != coldLeaseCvmResponseJson.created) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ColdLeaseCvmResponseJson copy$default(ColdLeaseCvmResponseJson coldLeaseCvmResponseJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coldLeaseCvmResponseJson.vm_id;
        }
        if ((i & 2) != 0) {
            z = coldLeaseCvmResponseJson.created;
        }
        C7384Etj.A0Y(str, 0);
        return new ColdLeaseCvmResponseJson(str, z);
    }

    public final String component1() {
        return this.vm_id;
    }

    public final boolean component2() {
        return this.created;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.vm_id), this.created);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ColdLeaseCvmResponseJson(int i, String str, boolean z, C2hx c2hx) {
        this.vm_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.created = false;
        } else {
            this.created = z;
        }
    }

    public /* synthetic */ ColdLeaseCvmResponseJson(String str, boolean z, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass001.A1Q(i, z));
    }

    public ColdLeaseCvmResponseJson() {
        this("", false);
    }
}

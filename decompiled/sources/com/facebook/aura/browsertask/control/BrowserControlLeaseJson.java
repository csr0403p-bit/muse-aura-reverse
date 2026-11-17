package com.facebook.aura.browsertask.control;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserControlLeaseJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long control_expires_at_ms;
    public final String control_owner;
    public final String takeover_id;
    public final String task_id;

    public final class Companion {
        public final C9hr<BrowserControlLeaseJson> serializer() {
            return BrowserControlLeaseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_browsertask_control_control(BrowserControlLeaseJson browserControlLeaseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(browserControlLeaseJson.control_owner)) {
            c9j5.AAV(browserControlLeaseJson.control_owner, c9iZ, 0);
        }
        if (zAfR || !"".equals(browserControlLeaseJson.task_id)) {
            c9j5.AAV(browserControlLeaseJson.task_id, c9iZ, 1);
        }
        if (zAfR || browserControlLeaseJson.control_expires_at_ms != null) {
            c9j5.AAP(browserControlLeaseJson.control_expires_at_ms, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || browserControlLeaseJson.takeover_id != null) {
            c9j5.AAP(browserControlLeaseJson.takeover_id, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserControlLeaseJson) {
                BrowserControlLeaseJson browserControlLeaseJson = (BrowserControlLeaseJson) obj;
                if (!C7384Etj.areEqual(this.control_owner, browserControlLeaseJson.control_owner) || !C7384Etj.areEqual(this.task_id, browserControlLeaseJson.task_id) || !C7384Etj.areEqual(this.control_expires_at_ms, browserControlLeaseJson.control_expires_at_ms) || !C7384Etj.areEqual(this.takeover_id, browserControlLeaseJson.takeover_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserControlLeaseJson copy$default(BrowserControlLeaseJson browserControlLeaseJson, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserControlLeaseJson.control_owner;
        }
        if ((i & 2) != 0) {
            str2 = browserControlLeaseJson.task_id;
        }
        if ((i & 4) != 0) {
            l = browserControlLeaseJson.control_expires_at_ms;
        }
        if ((i & 8) != 0) {
            str3 = browserControlLeaseJson.takeover_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new BrowserControlLeaseJson(str, str2, l, str3);
    }

    public final String component1() {
        return this.control_owner;
    }

    public final String component2() {
        return this.task_id;
    }

    public final Long component3() {
        return this.control_expires_at_ms;
    }

    public final String component4() {
        return this.takeover_id;
    }

    public final Long getControl_expires_at_ms() {
        return this.control_expires_at_ms;
    }

    public final String getControl_owner() {
        return this.control_owner;
    }

    public final String getTakeover_id() {
        return this.takeover_id;
    }

    public final String getTask_id() {
        return this.task_id;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.task_id, AnonymousClass001.A0G(this.control_owner)) + AnonymousClass006.A0D(this.control_expires_at_ms)) * 31) + AnonymousClass005.A0H(this.takeover_id);
    }

    public final BrowserControlLease toDomain() {
        return new BrowserControlLease(this.control_owner, this.task_id, this.control_expires_at_ms, this.takeover_id);
    }

    public String toString() {
        String str = this.control_owner;
        String str2 = this.task_id;
        Long l = this.control_expires_at_ms;
        String str3 = this.takeover_id;
        StringBuilder sbA0x = C3cI.A0x("BrowserControlLeaseJson(control_owner=", str);
        sbA0x.append(", task_id=");
        sbA0x.append(str2);
        sbA0x.append(", control_expires_at_ms=");
        sbA0x.append(l);
        return C3cJ.A0N(", takeover_id=", str3, sbA0x);
    }

    public BrowserControlLeaseJson(String str, String str2, Long l, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.control_owner = str;
        this.task_id = str2;
        this.control_expires_at_ms = l;
        this.takeover_id = str3;
    }

    public final BrowserControlLeaseJson copy(String str, String str2, Long l, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new BrowserControlLeaseJson(str, str2, l, str3);
    }

    public /* synthetic */ BrowserControlLeaseJson(int i, String str, String str2, Long l, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.control_owner = "";
        } else {
            this.control_owner = str;
        }
        if ((i & 2) == 0) {
            this.task_id = "";
        } else {
            this.task_id = str2;
        }
        if ((i & 4) == 0) {
            this.control_expires_at_ms = null;
        } else {
            this.control_expires_at_ms = l;
        }
        if ((i & 8) == 0) {
            this.takeover_id = null;
        } else {
            this.takeover_id = str3;
        }
    }

    public /* synthetic */ BrowserControlLeaseJson(String str, String str2, Long l, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3);
    }

    public BrowserControlLeaseJson() {
        this("", "", null, null);
    }
}

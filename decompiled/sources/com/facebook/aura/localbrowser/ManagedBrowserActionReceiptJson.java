package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserActionReceiptJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action;
    public final String dispatch;
    public final String error;
    public final int i;
    public final String locator;
    public final long ms;
    public final String readiness;
    public final String verification;
    public final long waited_ms;

    public final class Companion {
        public final C9hr<ManagedBrowserActionReceiptJson> serializer() {
            return ManagedBrowserActionReceiptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || managedBrowserActionReceiptJson.i != 0) {
            c9j5.AAK(c9iZ, 0, managedBrowserActionReceiptJson.i);
        }
        c9j5.AAV(managedBrowserActionReceiptJson.action, c9iZ, 1);
        if (zAfR || managedBrowserActionReceiptJson.locator != null) {
            c9j5.AAP(managedBrowserActionReceiptJson.locator, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAV(managedBrowserActionReceiptJson.dispatch, c9iZ, 3);
        c9j5.AAV(managedBrowserActionReceiptJson.verification, c9iZ, 4);
        c9j5.AAV(managedBrowserActionReceiptJson.readiness, c9iZ, 5);
        c9j5.AAN(c9iZ, 6, managedBrowserActionReceiptJson.waited_ms);
        c9j5.AAN(c9iZ, 7, managedBrowserActionReceiptJson.ms);
        if (zAfR || managedBrowserActionReceiptJson.error != null) {
            c9j5.AAP(managedBrowserActionReceiptJson.error, C07779iq.A01, c9iZ, 8);
        }
    }

    public final ManagedBrowserActionReceiptJson copy(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6) {
        AnonymousClass005.A16(str, str3, str4, str5, 1);
        return new ManagedBrowserActionReceiptJson(i, str, str2, str3, str4, str5, j, j2, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserActionReceiptJson) {
                ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson = (ManagedBrowserActionReceiptJson) obj;
                if (this.i != managedBrowserActionReceiptJson.i || !C7384Etj.areEqual(this.action, managedBrowserActionReceiptJson.action) || !C7384Etj.areEqual(this.locator, managedBrowserActionReceiptJson.locator) || !C7384Etj.areEqual(this.dispatch, managedBrowserActionReceiptJson.dispatch) || !C7384Etj.areEqual(this.verification, managedBrowserActionReceiptJson.verification) || !C7384Etj.areEqual(this.readiness, managedBrowserActionReceiptJson.readiness) || this.waited_ms != managedBrowserActionReceiptJson.waited_ms || this.ms != managedBrowserActionReceiptJson.ms || !C7384Etj.areEqual(this.error, managedBrowserActionReceiptJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserActionReceiptJson(int i, int i2, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, C2hx c2hx) {
        if (250 != (i & 250)) {
            C9iI.A00(ManagedBrowserActionReceiptJson$$serializer.descriptor, i, 250);
            throw F60.createAndThrow();
        }
        this.i = (i & 1) == 0 ? 0 : i2;
        this.action = str;
        if ((i & 4) == 0) {
            this.locator = null;
        } else {
            this.locator = str2;
        }
        this.dispatch = str3;
        this.verification = str4;
        this.readiness = str5;
        this.waited_ms = j;
        this.ms = j2;
        if ((i & 256) == 0) {
            this.error = null;
        } else {
            this.error = str6;
        }
    }

    public static /* synthetic */ ManagedBrowserActionReceiptJson copy$default(ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson, int i, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = managedBrowserActionReceiptJson.i;
        }
        if ((i2 & 2) != 0) {
            str = managedBrowserActionReceiptJson.action;
        }
        if ((i2 & 4) != 0) {
            str2 = managedBrowserActionReceiptJson.locator;
        }
        if ((i2 & 8) != 0) {
            str3 = managedBrowserActionReceiptJson.dispatch;
        }
        if ((i2 & 16) != 0) {
            str4 = managedBrowserActionReceiptJson.verification;
        }
        if ((i2 & 32) != 0) {
            str5 = managedBrowserActionReceiptJson.readiness;
        }
        if ((i2 & 64) != 0) {
            j = managedBrowserActionReceiptJson.waited_ms;
        }
        if ((i2 & 128) != 0) {
            j2 = managedBrowserActionReceiptJson.ms;
        }
        if ((i2 & 256) != 0) {
            str6 = managedBrowserActionReceiptJson.error;
        }
        return managedBrowserActionReceiptJson.copy(i, str, str2, str3, str4, str5, j, j2, str6);
    }

    public final int component1() {
        return this.i;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.locator;
    }

    public final String component4() {
        return this.dispatch;
    }

    public final String component5() {
        return this.verification;
    }

    public final String component6() {
        return this.readiness;
    }

    public final long component7() {
        return this.waited_ms;
    }

    public final long component8() {
        return this.ms;
    }

    public final String component9() {
        return this.error;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDispatch() {
        return this.dispatch;
    }

    public final String getError() {
        return this.error;
    }

    public final int getI() {
        return this.i;
    }

    public final String getLocator() {
        return this.locator;
    }

    public final long getMs() {
        return this.ms;
    }

    public final String getReadiness() {
        return this.readiness;
    }

    public final String getVerification() {
        return this.verification;
    }

    public final long getWaited_ms() {
        return this.waited_ms;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.ms, AnonymousClass006.A06(this.waited_ms, AnonymousClass005.A0I(this.readiness, AnonymousClass005.A0I(this.verification, AnonymousClass005.A0I(this.dispatch, (AnonymousClass005.A0I(this.action, this.i * 31) + AnonymousClass006.A0G(this.locator)) * 31))))) + AnonymousClass005.A0H(this.error);
    }

    public String toString() {
        int i = this.i;
        String str = this.action;
        String str2 = this.locator;
        String str3 = this.dispatch;
        String str4 = this.verification;
        String str5 = this.readiness;
        long j = this.waited_ms;
        long j2 = this.ms;
        String str6 = this.error;
        StringBuilder sbA0y = C60O.A0y("ManagedBrowserActionReceiptJson(i=", i);
        sbA0y.append(", action=");
        sbA0y.append(str);
        sbA0y.append(", locator=");
        sbA0y.append(str2);
        sbA0y.append(", dispatch=");
        sbA0y.append(str3);
        sbA0y.append(", verification=");
        sbA0y.append(str4);
        sbA0y.append(", readiness=");
        sbA0y.append(str5);
        sbA0y.append(", waited_ms=");
        sbA0y.append(j);
        sbA0y.append(", ms=");
        sbA0y.append(j2);
        return C3cJ.A0N(", error=", str6, sbA0y);
    }

    public ManagedBrowserActionReceiptJson(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6) {
        AnonymousClass005.A16(str, str3, str4, str5, 1);
        this.i = i;
        this.action = str;
        this.locator = str2;
        this.dispatch = str3;
        this.verification = str4;
        this.readiness = str5;
        this.waited_ms = j;
        this.ms = j2;
        this.error = str6;
    }

    public /* synthetic */ ManagedBrowserActionReceiptJson(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), str, (i2 & 4) != 0 ? null : str2, str3, str4, str5, j, j2, (i2 & 256) != 0 ? null : str6);
    }
}

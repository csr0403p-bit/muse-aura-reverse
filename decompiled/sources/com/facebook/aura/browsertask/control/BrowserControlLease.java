package com.facebook.aura.browsertask.control;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class BrowserControlLease {
    public static final int $stable = 0;
    public final Long controlExpiresAtMs;
    public final String controlOwner;
    public final String takeoverId;
    public final String taskId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserControlLease) {
                BrowserControlLease browserControlLease = (BrowserControlLease) obj;
                if (!C7384Etj.areEqual(this.controlOwner, browserControlLease.controlOwner) || !C7384Etj.areEqual(this.taskId, browserControlLease.taskId) || !C7384Etj.areEqual(this.controlExpiresAtMs, browserControlLease.controlExpiresAtMs) || !C7384Etj.areEqual(this.takeoverId, browserControlLease.takeoverId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserControlLease copy$default(BrowserControlLease browserControlLease, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserControlLease.controlOwner;
        }
        if ((i & 2) != 0) {
            str2 = browserControlLease.taskId;
        }
        if ((i & 4) != 0) {
            l = browserControlLease.controlExpiresAtMs;
        }
        if ((i & 8) != 0) {
            str3 = browserControlLease.takeoverId;
        }
        AnonymousClass003.A0u(str, str2);
        return new BrowserControlLease(str, str2, l, str3);
    }

    public final String component1() {
        return this.controlOwner;
    }

    public final String component2() {
        return this.taskId;
    }

    public final Long component3() {
        return this.controlExpiresAtMs;
    }

    public final String component4() {
        return this.takeoverId;
    }

    public final Long getControlExpiresAtMs() {
        return this.controlExpiresAtMs;
    }

    public final String getControlOwner() {
        return this.controlOwner;
    }

    public final String getTakeoverId() {
        return this.takeoverId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.taskId, AnonymousClass001.A0G(this.controlOwner)) + AnonymousClass006.A0D(this.controlExpiresAtMs)) * 31) + AnonymousClass005.A0H(this.takeoverId);
    }

    public String toString() {
        String str = this.controlOwner;
        String str2 = this.taskId;
        Long l = this.controlExpiresAtMs;
        String str3 = this.takeoverId;
        StringBuilder sbA0x = C3cI.A0x("BrowserControlLease(controlOwner=", str);
        sbA0x.append(", taskId=");
        sbA0x.append(str2);
        sbA0x.append(", controlExpiresAtMs=");
        sbA0x.append(l);
        return C3cJ.A0N(", takeoverId=", str3, sbA0x);
    }

    public BrowserControlLease(String str, String str2, Long l, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.controlOwner = str;
        this.taskId = str2;
        this.controlExpiresAtMs = l;
        this.takeoverId = str3;
    }

    public final BrowserControlLease copy(String str, String str2, Long l, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new BrowserControlLease(str, str2, l, str3);
    }

    public /* synthetic */ BrowserControlLease(String str, String str2, Long l, String str3, int i, C06H c06h) {
        this(str, str2, l, AnonymousClass006.A0u(i, str3));
    }
}

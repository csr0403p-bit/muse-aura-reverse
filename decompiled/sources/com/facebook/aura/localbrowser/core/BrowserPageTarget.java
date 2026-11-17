package com.facebook.aura.localbrowser.core;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public final class BrowserPageTarget {
    public static final int $stable = 0;
    public final String browserInstanceId;
    public final String endpoint;
    public final String targetId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserPageTarget) {
                BrowserPageTarget browserPageTarget = (BrowserPageTarget) obj;
                if (!C7384Etj.areEqual(this.endpoint, browserPageTarget.endpoint) || !C7384Etj.areEqual(this.browserInstanceId, browserPageTarget.browserInstanceId) || !C7384Etj.areEqual(this.targetId, browserPageTarget.targetId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserPageTarget copy$default(BrowserPageTarget browserPageTarget, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserPageTarget.endpoint;
        }
        if ((i & 2) != 0) {
            str2 = browserPageTarget.browserInstanceId;
        }
        if ((i & 4) != 0) {
            str3 = browserPageTarget.targetId;
        }
        return browserPageTarget.copy(str, str2, str3);
    }

    public final String component1() {
        return this.endpoint;
    }

    public final String component2() {
        return this.browserInstanceId;
    }

    public final String component3() {
        return this.targetId;
    }

    public final String getBrowserInstanceId() {
        return this.browserInstanceId;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.targetId, AnonymousClass005.A0I(this.browserInstanceId, AnonymousClass001.A0G(this.endpoint)));
    }

    public String toString() {
        return FGI.A0k("BrowserPageTarget(endpoint=", this.endpoint, ", browserInstanceId=", this.browserInstanceId, ", targetId=", this.targetId, ")");
    }

    public BrowserPageTarget(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.endpoint = str;
        this.browserInstanceId = str2;
        this.targetId = str3;
    }

    public final BrowserPageTarget copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new BrowserPageTarget(str, str2, str3);
    }
}

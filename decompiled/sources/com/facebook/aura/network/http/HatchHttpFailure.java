package com.facebook.aura.network.http;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes3.dex */
public final class HatchHttpFailure extends C06G {
    public final String detail;
    public final String reason;

    public HatchHttpFailure(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.reason = str;
        this.detail = str2;
    }

    public final HatchHttpFailure copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchHttpFailure(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchHttpFailure) {
                HatchHttpFailure hatchHttpFailure = (HatchHttpFailure) obj;
                if (!C7384Etj.areEqual(this.reason, hatchHttpFailure.reason) || !C7384Etj.areEqual(this.detail, hatchHttpFailure.detail)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchHttpFailure copy$default(HatchHttpFailure hatchHttpFailure, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchHttpFailure.reason;
        }
        if ((i & 2) != 0) {
            str2 = hatchHttpFailure.detail;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchHttpFailure(str, str2);
    }

    public final String component1() {
        return this.reason;
    }

    public final String component2() {
        return this.detail;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getLogValue() {
        String str = this.detail;
        return str != null ? FGI.A0U(this.reason, " detail=", str) : this.reason;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.reason) + AnonymousClass006.A0G(this.detail);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchHttpFailure(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}

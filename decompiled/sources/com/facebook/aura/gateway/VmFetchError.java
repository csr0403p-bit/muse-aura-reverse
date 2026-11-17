package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class VmFetchError extends C06G {
    public static final int $stable = 0;
    public final String summary;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VmFetchError) {
                VmFetchError vmFetchError = (VmFetchError) obj;
                if (!C7384Etj.areEqual(this.title, vmFetchError.title) || !C7384Etj.areEqual(this.summary, vmFetchError.summary)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VmFetchError copy$default(VmFetchError vmFetchError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmFetchError.title;
        }
        if ((i & 2) != 0) {
            str2 = vmFetchError.summary;
        }
        return new VmFetchError(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.summary;
    }

    public final VmFetchError copy(String str, String str2) {
        return new VmFetchError(str, str2);
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.summary);
    }

    public VmFetchError(String str, String str2) {
        this.title = str;
        this.summary = str2;
    }

    public String toString() {
        return super.toString();
    }
}

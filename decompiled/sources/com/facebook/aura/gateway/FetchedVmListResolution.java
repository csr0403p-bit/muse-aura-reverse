package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import java.util.List;

/* loaded from: classes4.dex */
public final class FetchedVmListResolution extends C06G {
    public static final int $stable = 8;
    public final String fallbackBackendErrorCode;
    public final List<VmEntryV2Json> fetchedVms;

    public FetchedVmListResolution(List<VmEntryV2Json> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.fetchedVms = list;
        this.fallbackBackendErrorCode = str;
    }

    public final FetchedVmListResolution copy(List<VmEntryV2Json> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new FetchedVmListResolution(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FetchedVmListResolution) {
                FetchedVmListResolution fetchedVmListResolution = (FetchedVmListResolution) obj;
                if (!C7384Etj.areEqual(this.fetchedVms, fetchedVmListResolution.fetchedVms) || !C7384Etj.areEqual(this.fallbackBackendErrorCode, fetchedVmListResolution.fallbackBackendErrorCode)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FetchedVmListResolution copy$default(FetchedVmListResolution fetchedVmListResolution, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fetchedVmListResolution.fetchedVms;
        }
        if ((i & 2) != 0) {
            str = fetchedVmListResolution.fallbackBackendErrorCode;
        }
        C7384Etj.A0Y(list, 0);
        return new FetchedVmListResolution(list, str);
    }

    public final List<VmEntryV2Json> component1() {
        return this.fetchedVms;
    }

    public final String component2() {
        return this.fallbackBackendErrorCode;
    }

    public final String getFallbackBackendErrorCode() {
        return this.fallbackBackendErrorCode;
    }

    public final List<VmEntryV2Json> getFetchedVms() {
        return this.fetchedVms;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.fetchedVms) + AnonymousClass006.A0G(this.fallbackBackendErrorCode);
    }

    public String toString() {
        return super.toString();
    }
}

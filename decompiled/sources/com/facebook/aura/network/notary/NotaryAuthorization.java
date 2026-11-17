package com.facebook.aura.network.notary;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class NotaryAuthorization extends C06G {
    public final Map<String, String> headers;
    public final String vmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotaryAuthorization) {
                NotaryAuthorization notaryAuthorization = (NotaryAuthorization) obj;
                if (!C7384Etj.areEqual(this.vmId, notaryAuthorization.vmId) || !C7384Etj.areEqual(this.headers, notaryAuthorization.headers)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NotaryAuthorization copy$default(NotaryAuthorization notaryAuthorization, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notaryAuthorization.vmId;
        }
        if ((i & 2) != 0) {
            map = notaryAuthorization.headers;
        }
        AnonymousClass003.A0u(str, map);
        return new NotaryAuthorization(str, map);
    }

    public final String component1() {
        return this.vmId;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.headers, AnonymousClass001.A0G(this.vmId));
    }

    public NotaryAuthorization(String str, Map<String, String> map) {
        AnonymousClass003.A0u(str, map);
        this.vmId = str;
        this.headers = map;
    }

    public final NotaryAuthorization copy(String str, Map<String, String> map) {
        AnonymousClass003.A0u(str, map);
        return new NotaryAuthorization(str, map);
    }

    public String toString() {
        return super.toString();
    }
}

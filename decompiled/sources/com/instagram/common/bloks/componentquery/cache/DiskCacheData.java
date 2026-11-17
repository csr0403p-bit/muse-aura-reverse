package com.instagram.common.bloks.componentquery.cache;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.instagram.common.bloks.payload.RawComponentPayload;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes6.dex */
public final class DiskCacheData implements Serializable {
    public static final long serialVersionUID = 2;
    public final List<RawComponentPayload> extensions;
    public final RawComponentPayload initialResponse;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiskCacheData) {
                DiskCacheData diskCacheData = (DiskCacheData) obj;
                if (!C7384Etj.areEqual(this.initialResponse, diskCacheData.initialResponse) || !C7384Etj.areEqual(this.extensions, diskCacheData.extensions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DiskCacheData copy$default(DiskCacheData diskCacheData, RawComponentPayload rawComponentPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            rawComponentPayload = diskCacheData.initialResponse;
        }
        if ((i & 2) != 0) {
            list = diskCacheData.extensions;
        }
        AnonymousClass003.A0u(rawComponentPayload, list);
        return new DiskCacheData(rawComponentPayload, list);
    }

    public final RawComponentPayload component1() {
        return this.initialResponse;
    }

    public final List<RawComponentPayload> component2() {
        return this.extensions;
    }

    public final List<RawComponentPayload> getExtensions() {
        return this.extensions;
    }

    public final RawComponentPayload getInitialResponse() {
        return this.initialResponse;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.extensions, AnonymousClass005.A0E(this.initialResponse));
    }

    public String toString() {
        return C3cJ.A0L(this.extensions, ", extensions=", C3cG.A0f(this.initialResponse, "DiskCacheData(initialResponse="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiskCacheData(RawComponentPayload rawComponentPayload, List<? extends RawComponentPayload> list) {
        AnonymousClass003.A0u(rawComponentPayload, list);
        this.initialResponse = rawComponentPayload;
        this.extensions = list;
    }

    public final DiskCacheData copy(RawComponentPayload rawComponentPayload, List<? extends RawComponentPayload> list) {
        AnonymousClass003.A0u(rawComponentPayload, list);
        return new DiskCacheData(rawComponentPayload, list);
    }
}

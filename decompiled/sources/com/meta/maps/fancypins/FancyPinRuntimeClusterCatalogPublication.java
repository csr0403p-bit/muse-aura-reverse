package com.meta.maps.fancypins;

import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterCatalogPublication {
    public final byte[] blob;
    public final List<FancyPinClusterBlueprint> blueprints;

    public final byte[] getBlob() {
        return this.blob;
    }

    public final List<FancyPinClusterBlueprint> getBlueprints() {
        return this.blueprints;
    }

    public FancyPinRuntimeClusterCatalogPublication(List<FancyPinClusterBlueprint> list, byte[] bArr) {
        AnonymousClass003.A0u(list, bArr);
        this.blueprints = list;
        this.blob = bArr;
    }
}

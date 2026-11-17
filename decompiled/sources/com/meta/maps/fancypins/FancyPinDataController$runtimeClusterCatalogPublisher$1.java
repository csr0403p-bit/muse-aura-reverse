package com.meta.maps.fancypins;

import X.C3cI;
import X.C7384Etj;
import X.C7438Evz;
import X.Ht9;
import X.InterfaceC2349BUy;
import java.util.List;

/* loaded from: classes6.dex */
public final /* synthetic */ class FancyPinDataController$runtimeClusterCatalogPublisher$1 implements InterfaceC2349BUy, FancyPinRuntimeClusterCatalogSink {
    public final /* synthetic */ FancyPinEngineDataSink $tmp0;

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterCatalogSink
    public final List<Integer> replace(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return this.$tmp0.replaceClusterBlueprintCatalog(bArr);
    }

    public FancyPinDataController$runtimeClusterCatalogPublisher$1(FancyPinEngineDataSink fancyPinEngineDataSink) {
        this.$tmp0 = fancyPinEngineDataSink;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FancyPinRuntimeClusterCatalogSink) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(1, this.$tmp0, FancyPinEngineDataSink.class, "replaceClusterBlueprintCatalog", "replaceClusterBlueprintCatalog([B)Ljava/util/List;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

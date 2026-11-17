package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import android.util.SparseIntArray;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.fancypins.FancyPinRuntimeClusterCatalog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterSynthesizer {
    public FancyPinRuntimeClusterCatalog cachedCatalog;
    public long cachedCatalogGeneration;
    public long cachedMetadataGeneration;
    public List<FancyPinRuntimeClusterPresentation> cachedPresentations;
    public List<String> cachedVariantIds;
    public boolean hasCachedSnapshot;
    public final SparseIntArray renderVariantIndices = new SparseIntArray();

    private final void indexRenderVariants(FancyPinRenderFrame fancyPinRenderFrame) {
        this.renderVariantIndices.clear();
        int i = fancyPinRenderFrame.count;
        for (int i2 = 0; i2 < i; i2++) {
            this.renderVariantIndices.put(fancyPinRenderFrame.slotIndices[i2], fancyPinRenderFrame.variantIndices[i2]);
        }
    }

    private final int renderVariantIndexAt(int i) {
        return this.renderVariantIndices.get(i, -1);
    }

    public final List<FancyPinRuntimeClusterPresentation> synthesize(FancyPinRenderFrame fancyPinRenderFrame, FancyPinRuntimeClusterCatalog fancyPinRuntimeClusterCatalog) {
        boolean zA1a = AnonymousClass002.A1a(fancyPinRenderFrame, fancyPinRuntimeClusterCatalog);
        if (fancyPinRenderFrame.getClusterMetadataSupportsGenerationCache$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() && this.hasCachedSnapshot && this.cachedMetadataGeneration == fancyPinRenderFrame.clusterMetadataGeneration && this.cachedCatalog == fancyPinRuntimeClusterCatalog && this.cachedCatalogGeneration == fancyPinRuntimeClusterCatalog.generation && C7384Etj.areEqual(this.cachedVariantIds, fancyPinRenderFrame.variantIds)) {
            return this.cachedPresentations;
        }
        boolean clusterMetadataSupportsGenerationCache$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = fancyPinRenderFrame.getClusterMetadataSupportsGenerationCache$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
        if (!clusterMetadataSupportsGenerationCache$xplat_maps_sdk_packages_fancypins_fancypins_kotlin) {
            indexRenderVariants(fancyPinRenderFrame);
        }
        int i = fancyPinRenderFrame.clusterMetadataCount;
        ArrayList arrayListA11 = C60O.A11(i);
        for (int i2 = 0; i2 < i; i2++) {
            FancyPinRuntimeClusterCatalog.Entry entryEntryAt = fancyPinRuntimeClusterCatalog.entryAt(fancyPinRenderFrame.clusterBlueprintIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2));
            if (entryEntryAt != null) {
                long jClusterSlotIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = fancyPinRenderFrame.clusterSlotIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2);
                if (jClusterSlotIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin <= 2147483647L) {
                    int i3 = (int) jClusterSlotIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin;
                    String str = (String) AbstractC0878AGe.A0A(!clusterMetadataSupportsGenerationCache$xplat_maps_sdk_packages_fancypins_fancypins_kotlin ? this.renderVariantIndices.get(i3, -1) : fancyPinRenderFrame.clusterVariantIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2), fancyPinRenderFrame.variantIds);
                    if (str != null && entryEntryAt.clusterBlueprint.variantIds.contains(str)) {
                        long jClusterIdentityAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = fancyPinRenderFrame.clusterIdentityAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2);
                        long jClusterMemberCountAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = fancyPinRenderFrame.clusterMemberCountAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2);
                        String strMake = FancyPinRuntimeClusterId.INSTANCE.make(jClusterIdentityAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
                        FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext = new FancyPinRuntimeClusterContext(strMake, jClusterMemberCountAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
                        FancyPin fancyPin = new FancyPin(strMake, new GeoCoordinates(fancyPinRenderFrame.clusterLatitudeAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2), fancyPinRenderFrame.clusterLongitudeAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2)), entryEntryAt.presentationBlueprint.id, C3cG.A1S(FGI.A0J("{\"member_count\":", jClusterMemberCountAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin, "}")), fancyPinRenderFrame.clusterRankAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2));
                        arrayListA11.add(new FancyPinRuntimeClusterPresentation(fancyPin, entryEntryAt.clusterBlueprint, entryEntryAt.presentationBlueprint, new FancyPinFrameState(fancyPin.id, fancyPin.coordinates, str, fancyPin.rank), i3, fancyPinRuntimeClusterContext, fancyPinRenderFrame.clusterFlagsAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i2)));
                    }
                }
            }
        }
        List<FancyPinRuntimeClusterPresentation> listA0X = AbstractC0878AGe.A0X(arrayListA11);
        if (!fancyPinRenderFrame.getClusterMetadataSupportsGenerationCache$xplat_maps_sdk_packages_fancypins_fancypins_kotlin()) {
            this.hasCachedSnapshot = false;
            return listA0X;
        }
        this.hasCachedSnapshot = zA1a;
        this.cachedMetadataGeneration = fancyPinRenderFrame.clusterMetadataGeneration;
        this.cachedCatalog = fancyPinRuntimeClusterCatalog;
        this.cachedCatalogGeneration = fancyPinRuntimeClusterCatalog.generation;
        this.cachedVariantIds = AbstractC0878AGe.A0X(fancyPinRenderFrame.variantIds);
        this.cachedPresentations = listA0X;
        return listA0X;
    }

    public FancyPinRuntimeClusterSynthesizer() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this.cachedVariantIds = c0881AGi;
        this.cachedPresentations = c0881AGi;
    }
}

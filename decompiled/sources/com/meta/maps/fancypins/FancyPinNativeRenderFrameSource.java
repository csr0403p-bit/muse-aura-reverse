package com.meta.maps.fancypins;

import X.AnonymousClass004;
import X.BMp;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import com.meta.maps.fancypins.FancyPinRenderFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public final class FancyPinNativeRenderFrameSource implements FancyPinRenderFrameSource {

    @Deprecated
    public static final String COPY_FRAME_TRACE_SECTION = "FancyPins#copyFrame";
    public static final Companion Companion = new Companion();
    public ByteBuffer clusterMetadataScratchBuffer;
    public final FancyPinNativeBufferCopier copier;
    public ByteBuffer overlapMaskScratchBuffer;
    public ByteBuffer overlapSourceScratchBuffer;
    public final FancyPinRenderBufferProvider provider;
    public ByteBuffer scratchBuffer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinNativeRenderFrameSource(final FancyPinEngine fancyPinEngine) {
        this(new FancyPinRenderBufferProvider() { // from class: com.meta.maps.fancypins.FancyPinNativeRenderFrameSource.1
            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public int clusterMetadataBufferEntryCount() {
                return fancyPinEngine.clusterMetadataBufferEntryCount();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public long clusterMetadataBufferGeneration() {
                return fancyPinEngine.clusterMetadataBufferGeneration();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public long clusterMetadataBufferPointer() {
                return fancyPinEngine.clusterMetadataBufferPointer();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public int clusterMetadataBufferStride() {
                return fancyPinEngine.clusterMetadataBufferStride();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public long overlapMaskBufferPointer() {
                return fancyPinEngine.overlapMaskBufferPointer();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public int overlapMaskBufferRowCount() {
                return fancyPinEngine.overlapMaskBufferRowCount();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public int overlapMaskBufferStride() {
                return fancyPinEngine.overlapMaskBufferStride();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public long overlapSourceBufferPointer() {
                return fancyPinEngine.overlapSourceBufferPointer();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public int overlapSourceCount() {
                return fancyPinEngine.overlapSourceCount();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public long placementIndicesPointer() {
                return fancyPinEngine.placementIndicesPointer();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public int placementIndicesStride() {
                return fancyPinEngine.placementIndicesStride();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public int renderBufferEntryCount() {
                return fancyPinEngine.renderBufferEntryCount();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public long renderBufferGeneration() {
                return fancyPinEngine.renderBufferGeneration();
            }

            @Override // com.meta.maps.fancypins.FancyPinRenderBufferProvider
            public long renderBufferPointer() {
                return fancyPinEngine.renderBufferPointer();
            }
        }, JniNativeBufferCopier.INSTANCE);
        C7384Etj.A0Y(fancyPinEngine, 0);
    }

    @Override // com.meta.maps.fancypins.FancyPinRenderFrameSource
    public void copyInto(FancyPinRenderFrame fancyPinRenderFrame) {
        C7384Etj.A0Y(fancyPinRenderFrame, 0);
        copyFrameInto(fancyPinRenderFrame);
    }

    public final class Companion {
        public Companion() {
        }

        public final ByteBuffer newBuffer(int i) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            C7384Etj.A0U(byteBufferOrder);
            return byteBufferOrder;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    private final void copyClusterMetadata(FancyPinRenderFrame fancyPinRenderFrame) {
        int iClusterMetadataBufferEntryCount = this.provider.clusterMetadataBufferEntryCount();
        int iClusterMetadataBufferStride = this.provider.clusterMetadataBufferStride();
        int iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = FancyPinRenderFrame.Companion.checkedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(iClusterMetadataBufferEntryCount, iClusterMetadataBufferStride);
        long jClusterMetadataBufferGeneration = this.provider.clusterMetadataBufferGeneration();
        long j = 0;
        if (iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > 0) {
            long jClusterMetadataBufferPointer = this.provider.clusterMetadataBufferPointer();
            if (jClusterMetadataBufferPointer == 0) {
                throw C60O.A0i("Non-empty cluster metadata buffer must have a non-null pointer");
            }
            if (BMp.A01(jClusterMetadataBufferPointer, (-1) - iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin) > 0) {
                throw C60O.A0i("Cluster metadata buffer address range overflows");
            }
            j = jClusterMetadataBufferPointer;
        }
        ByteBuffer byteBufferPrepareScratchBuffer = prepareScratchBuffer(this.clusterMetadataScratchBuffer, iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
        this.clusterMetadataScratchBuffer = byteBufferPrepareScratchBuffer;
        if (iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > 0) {
            this.copier.copy(j, iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin, byteBufferPrepareScratchBuffer);
        }
        fancyPinRenderFrame.replaceClusterMetadata$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(iClusterMetadataBufferEntryCount, iClusterMetadataBufferStride, jClusterMetadataBufferGeneration, this.clusterMetadataScratchBuffer);
    }

    private final void copyFrameInto(FancyPinRenderFrame fancyPinRenderFrame) {
        fancyPinRenderFrame.renderBufferGeneration = this.provider.renderBufferGeneration();
        int iRenderBufferEntryCount = this.provider.renderBufferEntryCount();
        if (iRenderBufferEntryCount < 0) {
            throw C60O.A0i("Render buffer entry count must be non-negative");
        }
        if (iRenderBufferEntryCount == 0) {
            fancyPinRenderFrame.clear();
        } else {
            long jRenderBufferPointer = this.provider.renderBufferPointer();
            if (jRenderBufferPointer == 0) {
                throw C60O.A0i("Non-empty render buffer must have a non-null pointer");
            }
            long j = iRenderBufferEntryCount * 16;
            if (j > 2147483647L) {
                throw C60O.A0i("Render buffer exceeds Android addressable capacity");
            }
            int i = (int) j;
            ensureScratchCapacity(i);
            this.scratchBuffer.clear();
            this.scratchBuffer.limit(i);
            this.copier.copy(jRenderBufferPointer, i, this.scratchBuffer);
            this.scratchBuffer.position(0);
            this.scratchBuffer.limit(i);
            FancyPinRenderBufferDecoder.INSTANCE.decode(this.scratchBuffer, iRenderBufferEntryCount, fancyPinRenderFrame);
        }
        copyClusterMetadata(fancyPinRenderFrame);
        if (iRenderBufferEntryCount == 0) {
            return;
        }
        copyPlacementIndices(fancyPinRenderFrame);
        copyOverlapTables(fancyPinRenderFrame);
    }

    private final void copyOverlapTables(FancyPinRenderFrame fancyPinRenderFrame) {
        long jOverlapMaskBufferPointer;
        int iOverlapMaskBufferRowCount = this.provider.overlapMaskBufferRowCount();
        int iOverlapMaskBufferStride = this.provider.overlapMaskBufferStride();
        int iOverlapSourceCount = this.provider.overlapSourceCount();
        FancyPinRenderFrame.Companion companion = FancyPinRenderFrame.Companion;
        int iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = companion.checkedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(iOverlapMaskBufferRowCount, iOverlapMaskBufferStride);
        int iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = companion.checkedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(iOverlapSourceCount);
        long j = 0;
        if (iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > 0) {
            jOverlapMaskBufferPointer = this.provider.overlapMaskBufferPointer();
            if (jOverlapMaskBufferPointer == 0) {
                throw C60O.A0i("Non-empty overlap mask buffer must have a non-null pointer");
            }
        } else {
            jOverlapMaskBufferPointer = 0;
        }
        if (iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > 0) {
            long jOverlapSourceBufferPointer = this.provider.overlapSourceBufferPointer();
            if (jOverlapSourceBufferPointer == 0) {
                throw C60O.A0i("Non-empty overlap source buffer must have a non-null pointer");
            }
            j = jOverlapSourceBufferPointer;
        }
        ByteBuffer byteBufferPrepareScratchBuffer = prepareScratchBuffer(this.overlapMaskScratchBuffer, iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
        this.overlapMaskScratchBuffer = byteBufferPrepareScratchBuffer;
        if (iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > 0) {
            this.copier.copy(jOverlapMaskBufferPointer, iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin, byteBufferPrepareScratchBuffer);
        }
        ByteBuffer byteBufferPrepareScratchBuffer2 = prepareScratchBuffer(this.overlapSourceScratchBuffer, iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin);
        this.overlapSourceScratchBuffer = byteBufferPrepareScratchBuffer2;
        if (iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > 0) {
            this.copier.copy(j, iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin, byteBufferPrepareScratchBuffer2);
        }
        fancyPinRenderFrame.replaceOverlapTables$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(iOverlapMaskBufferRowCount, iOverlapMaskBufferStride, this.overlapMaskScratchBuffer, iOverlapSourceCount, this.overlapSourceScratchBuffer);
    }

    private final void copyPlacementIndices(FancyPinRenderFrame fancyPinRenderFrame) {
        int iPlacementIndicesStride = this.provider.placementIndicesStride();
        if (iPlacementIndicesStride < 0) {
            throw C60O.A0i("Placement stride must be non-negative");
        }
        if (iPlacementIndicesStride == 0) {
            fancyPinRenderFrame.clearPlacementIndices$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
            return;
        }
        int i = fancyPinRenderFrame.count;
        int iMax = -1;
        for (int i2 = 0; i2 < i; i2++) {
            iMax = Math.max(iMax, fancyPinRenderFrame.slotIndices[i2]);
        }
        long j = iMax + 1;
        if (j > 2147483647L) {
            throw C60O.A0i("Placement row count exceeds Android range");
        }
        long j2 = iPlacementIndicesStride * j;
        if (j2 > 2147483647L) {
            throw C60O.A0i("Placement buffer exceeds Android addressable capacity");
        }
        long jPlacementIndicesPointer = this.provider.placementIndicesPointer();
        if (jPlacementIndicesPointer == 0) {
            throw C60O.A0i("Non-empty placement buffer must have a non-null pointer");
        }
        int i3 = (int) j2;
        ensureScratchCapacity(i3);
        this.scratchBuffer.clear();
        this.scratchBuffer.limit(i3);
        this.copier.copy(jPlacementIndicesPointer, i3, this.scratchBuffer);
        this.scratchBuffer.position(0);
        this.scratchBuffer.limit(i3);
        fancyPinRenderFrame.replacePlacementIndices$xplat_maps_sdk_packages_fancypins_fancypins_kotlin((int) j, iPlacementIndicesStride, this.scratchBuffer);
    }

    private final void ensureScratchCapacity(int i) {
        if (this.scratchBuffer.capacity() < i) {
            int iMax = Math.max(16, this.scratchBuffer.capacity());
            while (iMax < i) {
                int i2 = iMax;
                iMax *= 2;
                if (i2 > 1073741823) {
                    iMax = i;
                }
            }
            this.scratchBuffer = Companion.newBuffer(iMax);
        }
    }

    private final int grownCapacity(ByteBuffer byteBuffer, int i) {
        int iMax = Math.max(16, byteBuffer.capacity());
        while (iMax < i) {
            int i2 = iMax;
            iMax *= 2;
            if (i2 > 1073741823) {
                iMax = i;
            }
        }
        return iMax;
    }

    private final ByteBuffer prepareScratchBuffer(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.capacity() < i) {
            byteBuffer = Companion.newBuffer(grownCapacity(byteBuffer, i));
        }
        byteBuffer.clear();
        byteBuffer.limit(i);
        return byteBuffer;
    }

    public FancyPinNativeRenderFrameSource(FancyPinRenderBufferProvider fancyPinRenderBufferProvider, FancyPinNativeBufferCopier fancyPinNativeBufferCopier) {
        boolean zA1b = AnonymousClass004.A1b(fancyPinRenderBufferProvider, fancyPinNativeBufferCopier);
        this.provider = fancyPinRenderBufferProvider;
        this.copier = fancyPinNativeBufferCopier;
        Companion companion = Companion;
        this.scratchBuffer = companion.newBuffer(zA1b ? 1 : 0);
        this.clusterMetadataScratchBuffer = companion.newBuffer(zA1b ? 1 : 0);
        this.overlapMaskScratchBuffer = companion.newBuffer(zA1b ? 1 : 0);
        this.overlapSourceScratchBuffer = companion.newBuffer(zA1b ? 1 : 0);
    }

    public /* synthetic */ FancyPinNativeRenderFrameSource(FancyPinRenderBufferProvider fancyPinRenderBufferProvider, FancyPinNativeBufferCopier fancyPinNativeBufferCopier, int i, C06H c06h) {
        this(fancyPinRenderBufferProvider, (i & 2) != 0 ? JniNativeBufferCopier.INSTANCE : fancyPinNativeBufferCopier);
    }
}

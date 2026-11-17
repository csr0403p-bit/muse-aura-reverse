package com.meta.maps.fancypins;

/* loaded from: classes6.dex */
public interface FancyPinRenderBufferProvider {
    int clusterMetadataBufferEntryCount();

    long clusterMetadataBufferGeneration();

    long clusterMetadataBufferPointer();

    int clusterMetadataBufferStride();

    long overlapMaskBufferPointer();

    int overlapMaskBufferRowCount();

    int overlapMaskBufferStride();

    long overlapSourceBufferPointer();

    int overlapSourceCount();

    long placementIndicesPointer();

    int placementIndicesStride();

    int renderBufferEntryCount();

    long renderBufferGeneration();

    long renderBufferPointer();
}

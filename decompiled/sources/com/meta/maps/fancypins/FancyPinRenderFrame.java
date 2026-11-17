package com.meta.maps.fancypins;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C0881AGi;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C8j3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinRenderFrame {
    public static final int CLUSTER_BLUEPRINT_INDEX_OFFSET = 28;
    public static final int CLUSTER_FLAGS_OFFSET = 44;
    public static final int CLUSTER_LATITUDE_OFFSET = 8;
    public static final int CLUSTER_LONGITUDE_OFFSET = 16;
    public static final int CLUSTER_MEMBER_COUNT_OFFSET = 32;
    public static final int CLUSTER_METADATA_V1_PREFIX_BYTES = 40;
    public static final int CLUSTER_METADATA_V2_ROW_BYTES = 48;
    public static final int CLUSTER_RANK_OFFSET = 36;
    public static final int CLUSTER_SLOT_INDEX_OFFSET = 24;
    public static final int CLUSTER_VARIANT_INDEX_OFFSET = 40;
    public static final Companion Companion = new Companion();
    public static final int MAX_OVERLAP_SOURCE_COUNT = 50;
    public static final int MINIMUM_CAPACITY = 16;
    public static final int MISSING_CLUSTER_VARIANT_INDEX = -1;
    public static final int OVERLAP_SOURCE_PART_OFFSET = 4;
    public static final int OVERLAP_SOURCE_RESERVED_OFFSET = 6;
    public static final int OVERLAP_SOURCE_ROW_BYTES = 8;
    public static final int STATE_FLAG_PROJECTION_ONLY = 1;
    public static final int STATE_FLAG_RETIRING_REMOVED = 2;
    public static final long UNSIGNED_INT_MASK = 4294967295L;
    public static final int UNSIGNED_SHORT_MASK = 65535;
    public long[] clusterBlueprintIndices;
    public long[] clusterFlags;
    public long[] clusterIdentities;
    public double[] clusterLatitudes;
    public double[] clusterLongitudes;
    public long[] clusterMemberCounts;
    public int clusterMetadataCount;
    public long clusterMetadataGeneration;
    public int clusterMetadataStride;
    public int[] clusterRanks;
    public long[] clusterSlotIndices;
    public int[] clusterVariantIndices;
    public int count;
    public int[] dirtyFlags;
    public long mapFrameIdentity;
    public int overlapMaskRowCount;
    public int overlapMaskStride;
    public long[] overlapMasks;
    public int overlapSourceCount;
    public int[] overlapSourcePartIndices;
    public int[] overlapSourceSlots;
    public byte[] placementIndices;
    public int placementRowCount;
    public int placementStride;
    public long presentationEpoch;
    public long renderBufferGeneration;
    public float[] screenXs;
    public float[] screenYs;
    public int[] slotIndices;
    public int[] stateFlags;
    public List<String> variantIds;
    public int[] variantIndices;

    public final class Companion {
        public final int checkedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2) {
            if (i < 0) {
                throw C60O.A0i("Cluster metadata count must be non-negative");
            }
            if (i2 < 0) {
                throw C60O.A0i("Cluster metadata stride must be non-negative");
            }
            if (i != 0 && i2 < 40) {
                throw C60O.A0i("Non-empty cluster metadata rows must include the v1 prefix");
            }
            long j = i * i2;
            if (j <= 2147483647L) {
                return (int) j;
            }
            throw C60O.A0i("Cluster metadata buffer exceeds Android addressable capacity");
        }

        public final int checkedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2) {
            if (i < 0) {
                throw C60O.A0i("Overlap mask row count must be non-negative");
            }
            if (i2 < 0) {
                throw C60O.A0i("Overlap mask stride must be non-negative");
            }
            if (AnonymousClass002.A1M(i) != (i2 == 0)) {
                throw C60O.A0i("Overlap mask row count and stride must both be zero or positive");
            }
            long j = i * i2;
            long j2 = 8 * j;
            if (j > 2147483647L || j2 > 2147483647L) {
                throw C60O.A0i("Overlap mask buffer exceeds Android addressable capacity");
            }
            return (int) j2;
        }

        public final int checkedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
            if (i < 0 || i >= 51) {
                throw C60O.A0i("Overlap source count exceeds the shared mask capacity");
            }
            return i * 8;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public FancyPinRenderFrame() {
        this(0);
    }

    public final void clear() {
        this.count = 0;
        clearClusterMetadata$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
        clearPlacementIndices$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
        clearOverlapTables$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
    }

    public final void clearClusterMetadata$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        this.clusterMetadataCount = 0;
        this.clusterMetadataStride = 0;
        this.clusterMetadataGeneration = 0L;
    }

    public final void clearOverlapTables$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        this.overlapMaskRowCount = 0;
        this.overlapMaskStride = 0;
        this.overlapSourceCount = 0;
    }

    public final void clearPlacementIndices$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        this.placementRowCount = 0;
        this.placementStride = 0;
    }

    public final void replaceClusterMetadata$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2, long j, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 3);
        if (byteBuffer.position() != 0) {
            throw C60O.A0i("Cluster metadata buffer position must be zero");
        }
        int iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = Companion.checkedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i, i2);
        if (iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > byteBuffer.limit()) {
            throw C8j3.A0v("Cluster metadata buffer requires ", " bytes but limit is ", iCheckedClusterMetadataByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin, byteBuffer.limit());
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        ensureClusterMetadataCapacity(i);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * i2;
            this.clusterIdentities[i3] = byteBuffer.getLong(i4);
            this.clusterLatitudes[i3] = byteBuffer.getDouble(i4 + 8);
            this.clusterLongitudes[i3] = byteBuffer.getDouble(i4 + 16);
            this.clusterSlotIndices[i3] = byteBuffer.getInt(i4 + 24) & 4294967295L;
            this.clusterBlueprintIndices[i3] = byteBuffer.getInt(i4 + 28) & 4294967295L;
            this.clusterMemberCounts[i3] = byteBuffer.getInt(i4 + 32) & 4294967295L;
            this.clusterRanks[i3] = byteBuffer.getInt(i4 + 36);
            this.clusterVariantIndices[i3] = i2 >= 48 ? byteBuffer.getShort(i4 + 40) & 65535 : -1;
            this.clusterFlags[i3] = i2 >= 48 ? byteBuffer.getInt(i4 + 44) & 4294967295L : 0L;
        }
        this.clusterMetadataCount = i;
        this.clusterMetadataStride = i2;
        this.clusterMetadataGeneration = j;
    }

    public final void replaceOverlapTables$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2) {
        AnonymousClass002.A1C(byteBuffer, 2, byteBuffer2);
        if (byteBuffer.position() != 0) {
            throw C60O.A0i("Overlap mask buffer position must be zero");
        }
        if (byteBuffer2.position() != 0) {
            throw C60O.A0i("Overlap source buffer position must be zero");
        }
        Companion companion = Companion;
        int iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = companion.checkedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i, i2);
        if (iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > byteBuffer.limit()) {
            throw C8j3.A0v("Overlap mask buffer requires ", " bytes but limit is ", iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin, byteBuffer.limit());
        }
        int iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = companion.checkedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i3);
        if (iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin > byteBuffer2.limit()) {
            throw C8j3.A0v("Overlap source buffer requires ", " bytes but limit is ", iCheckedOverlapSourceByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin, byteBuffer2.limit());
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        byteBuffer2.order(ByteOrder.nativeOrder());
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * 8;
            if (BV4.A03(byteBuffer2.getInt(i6)) > 2147483647L) {
                throw C60O.A0i("Overlap source slot exceeds Android range");
            }
            if (byteBuffer2.getShort(i6 + 6) != 0) {
                throw C60O.A0i("Overlap source reserved bytes must be zero");
            }
        }
        int i7 = iCheckedOverlapMaskByteCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin / 8;
        if (this.overlapMasks.length < i7) {
            this.overlapMasks = new long[i7];
        }
        for (int i8 = 0; i8 < i7; i8++) {
            this.overlapMasks[i8] = byteBuffer.getLong(i8 * 8);
        }
        if (this.overlapSourceSlots.length < i3) {
            this.overlapSourceSlots = new int[i3];
            this.overlapSourcePartIndices = new int[i3];
            int i9 = 0 * 8;
            this.overlapSourceSlots[0] = byteBuffer2.getInt(i9);
            this.overlapSourcePartIndices[0] = byteBuffer2.getShort(i9 + 4) & 65535;
            i4 = 0 + 1;
        }
        while (i4 < i3) {
            int i10 = i4 * 8;
            this.overlapSourceSlots[i4] = byteBuffer2.getInt(i10);
            this.overlapSourcePartIndices[i4] = byteBuffer2.getShort(i10 + 4) & 65535;
            i4++;
        }
        this.overlapMaskRowCount = i;
        this.overlapMaskStride = i2;
        this.overlapSourceCount = i3;
    }

    public final void replacePlacementIndices$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 2);
        if (i < 0) {
            throw C60O.A0i("Placement row count must be non-negative");
        }
        if (i2 < 0) {
            throw C60O.A0i("Placement stride must be non-negative");
        }
        int i3 = 0;
        if (AnonymousClass002.A1M(i) != (i2 == 0)) {
            throw C60O.A0i("Placement row count and stride must both be zero or positive");
        }
        if (byteBuffer.position() != 0) {
            throw C60O.A0i("Placement buffer position must be zero");
        }
        long j = i * i2;
        if (j > 2147483647L) {
            throw C60O.A0i("Placement buffer exceeds Android addressable capacity");
        }
        if (j > byteBuffer.limit()) {
            throw C60O.A0i(C60P.A1O(" bytes but limit is ", C60O.A0z("Placement buffer requires ", j), byteBuffer.limit()));
        }
        int i4 = (int) j;
        if (this.placementIndices.length < i4) {
            this.placementIndices = new byte[i4];
            this.placementIndices[0] = byteBuffer.get(0);
            i3 = 0 + 1;
        }
        while (i3 < i4) {
            this.placementIndices[i3] = byteBuffer.get(i3);
            i3++;
        }
        this.placementRowCount = i;
        this.placementStride = i2;
    }

    public final void setVariantIds$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(List<String> list) {
        C7384Etj.A0Y(list, 0);
        this.variantIds = list;
    }

    private final void ensureCapacity(int i) {
        int[] iArr = this.slotIndices;
        int length = iArr.length;
        if (i > length) {
            int iA06 = AbstractC7608F5v.A06(16, length * 2, i);
            this.slotIndices = AbstractC7607F5u.A1a(iArr, iA06);
            this.variantIndices = AbstractC7607F5u.A1a(this.variantIndices, iA06);
            this.dirtyFlags = AbstractC7607F5u.A1a(this.dirtyFlags, iA06);
            this.stateFlags = AbstractC7607F5u.A1a(this.stateFlags, iA06);
            float[] fArrCopyOf = Arrays.copyOf(this.screenXs, iA06);
            C7384Etj.A0U(fArrCopyOf);
            this.screenXs = fArrCopyOf;
            float[] fArrCopyOf2 = Arrays.copyOf(this.screenYs, iA06);
            C7384Etj.A0U(fArrCopyOf2);
            this.screenYs = fArrCopyOf2;
        }
    }

    private final void ensureClusterMetadataCapacity(int i) {
        long[] jArr = this.clusterIdentities;
        int length = jArr.length;
        if (i > length) {
            int iA06 = AbstractC7608F5v.A06(16, length * 2, i);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iA06);
            C7384Etj.A0U(jArrCopyOf);
            this.clusterIdentities = jArrCopyOf;
            double[] dArrCopyOf = Arrays.copyOf(this.clusterLatitudes, iA06);
            C7384Etj.A0U(dArrCopyOf);
            this.clusterLatitudes = dArrCopyOf;
            double[] dArrCopyOf2 = Arrays.copyOf(this.clusterLongitudes, iA06);
            C7384Etj.A0U(dArrCopyOf2);
            this.clusterLongitudes = dArrCopyOf2;
            long[] jArrCopyOf2 = Arrays.copyOf(this.clusterSlotIndices, iA06);
            C7384Etj.A0U(jArrCopyOf2);
            this.clusterSlotIndices = jArrCopyOf2;
            long[] jArrCopyOf3 = Arrays.copyOf(this.clusterBlueprintIndices, iA06);
            C7384Etj.A0U(jArrCopyOf3);
            this.clusterBlueprintIndices = jArrCopyOf3;
            long[] jArrCopyOf4 = Arrays.copyOf(this.clusterMemberCounts, iA06);
            C7384Etj.A0U(jArrCopyOf4);
            this.clusterMemberCounts = jArrCopyOf4;
            this.clusterRanks = AbstractC7607F5u.A1a(this.clusterRanks, iA06);
            this.clusterVariantIndices = AbstractC7607F5u.A1a(this.clusterVariantIndices, iA06);
            long[] jArrCopyOf5 = Arrays.copyOf(this.clusterFlags, iA06);
            C7384Etj.A0U(jArrCopyOf5);
            this.clusterFlags = jArrCopyOf5;
        }
    }

    private final void requireClusterMetadataIndex(int i) {
        if (i < 0 || i >= this.clusterMetadataCount) {
            throw C60O.A0i("Cluster metadata index is out of bounds");
        }
    }

    public final void append(int i, int i2, int i3, int i4, float f, float f2) {
        ensureCapacity(this.count + 1);
        int[] iArr = this.slotIndices;
        int i5 = this.count;
        iArr[i5] = i;
        this.variantIndices[i5] = i2;
        this.dirtyFlags[i5] = i3;
        this.stateFlags[i5] = i4;
        this.screenXs[i5] = f;
        this.screenYs[i5] = f2;
        this.count = i5 + 1;
    }

    public final int dirtyFlagsAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.dirtyFlags[i];
    }

    public final int getClusterMetadataCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.clusterMetadataCount;
    }

    public final long getClusterMetadataGeneration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.clusterMetadataGeneration;
    }

    public final int getClusterMetadataStride$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.clusterMetadataStride;
    }

    public final boolean getClusterMetadataSupportsGenerationCache$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return BV5.A1P(this.clusterMetadataStride, 48);
    }

    public final int getCount() {
        return this.count;
    }

    public final long getMapFrameIdentity$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.mapFrameIdentity;
    }

    public final int getOverlapMaskRowCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.overlapMaskRowCount;
    }

    public final int getOverlapMaskStride$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.overlapMaskStride;
    }

    public final int getOverlapSourceCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.overlapSourceCount;
    }

    public final int getPlacementRowCount$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.placementRowCount;
    }

    public final int getPlacementStride$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.placementStride;
    }

    public final long getPresentationEpoch$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.presentationEpoch;
    }

    public final long getRenderBufferGeneration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.renderBufferGeneration;
    }

    public final List<String> getVariantIds$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.variantIds;
    }

    public final long overlapMaskAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2) {
        int i3;
        if (i < 0 || i >= this.overlapMaskRowCount) {
            throw C60O.A0i("Overlap mask slot is out of bounds");
        }
        if (i2 < 0 || i2 >= (i3 = this.overlapMaskStride)) {
            throw C60O.A0i("Overlap mask part is out of bounds");
        }
        return this.overlapMasks[(i * i3) + i2];
    }

    public final int overlapSourcePartIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        if (i < 0 || i >= this.overlapSourceCount) {
            throw C60O.A0i("Overlap source is out of bounds");
        }
        return this.overlapSourcePartIndices[i];
    }

    public final int overlapSourceSlotAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        if (i < 0 || i >= this.overlapSourceCount) {
            throw C60O.A0i("Overlap source is out of bounds");
        }
        return this.overlapSourceSlots[i];
    }

    public final int placementIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2) {
        int i3;
        if (i < 0 || i >= this.placementRowCount) {
            throw C60O.A0i("Placement slot is out of bounds");
        }
        if (i2 < 0 || i2 >= (i3 = this.placementStride)) {
            throw C60O.A0i("Placement part is out of bounds");
        }
        return this.placementIndices[(i * i3) + i2] & 255;
    }

    public final float screenXAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.screenXs[i];
    }

    public final float screenYAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.screenYs[i];
    }

    public final void setMapFrameIdentity$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(long j) {
        this.mapFrameIdentity = j;
    }

    public final void setPresentationEpoch$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(long j) {
        this.presentationEpoch = j;
    }

    public final void setRenderBufferGeneration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(long j) {
        this.renderBufferGeneration = j;
    }

    public final int slotIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.slotIndices[i];
    }

    public final int stateFlagsAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.stateFlags[i];
    }

    public final int variantIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.variantIndices[i];
    }

    public final long clusterBlueprintIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterBlueprintIndices[i];
    }

    public final long clusterFlagsAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterFlags[i];
    }

    public final long clusterIdentityAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterIdentities[i];
    }

    public final double clusterLatitudeAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterLatitudes[i];
    }

    public final double clusterLongitudeAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterLongitudes[i];
    }

    public final long clusterMemberCountAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterMemberCounts[i];
    }

    public final int clusterRankAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterRanks[i];
    }

    public final long clusterSlotIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterSlotIndices[i];
    }

    public final int clusterVariantIndexAt$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        requireClusterMetadataIndex(i);
        return this.clusterVariantIndices[i];
    }

    public /* synthetic */ FancyPinRenderFrame(int i, int i2, C06H c06h) {
        this(C3cI.A00(i2, i));
    }

    public FancyPinRenderFrame(int i) {
        this.slotIndices = new int[i];
        this.variantIndices = new int[i];
        this.dirtyFlags = new int[i];
        this.stateFlags = new int[i];
        this.screenXs = new float[i];
        this.screenYs = new float[i];
        this.clusterIdentities = new long[i];
        this.clusterLatitudes = new double[i];
        this.clusterLongitudes = new double[i];
        this.clusterSlotIndices = new long[i];
        this.clusterBlueprintIndices = new long[i];
        this.clusterMemberCounts = new long[i];
        this.clusterRanks = new int[i];
        this.clusterVariantIndices = new int[i];
        this.clusterFlags = new long[i];
        this.placementIndices = new byte[0];
        this.overlapMasks = new long[0];
        this.overlapSourceSlots = new int[0];
        this.overlapSourcePartIndices = new int[0];
        this.variantIds = C0881AGi.A00;
    }
}

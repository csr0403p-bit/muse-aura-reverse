package com.meta.maps.fancypins;

import X.C06H;
import com.meta.maps.NativeBase;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinEngine extends NativeBase {
    public static final Companion Companion = new Companion();
    public Double clusterFormationZoomDelta;

    public static final native void disposeNativeHandle(long j);

    public final native int clusterMetadataBufferEntryCount();

    public final native long clusterMetadataBufferGeneration();

    public final native long clusterMetadataBufferPointer();

    public final native int clusterMetadataBufferStride();

    public final native List<String> copyRankedRuntimeClusterMemberPinIds(String str, int i);

    public final native List<String> copyRuntimeClusterMemberPinIds(String str);

    public final native Double getClusterFormationZoomDelta();

    public final native long overlapMaskBufferPointer();

    public final native int overlapMaskBufferRowCount();

    public final native int overlapMaskBufferStride();

    public final native long overlapSourceBufferPointer();

    public final native int overlapSourceCount();

    public final native long placementIndicesPointer();

    public final native int placementIndicesStride();

    public final native void registerBlueprint(byte[] bArr);

    public final native void releaseRetiringPin(String str);

    public final native int renderBufferEntryCount();

    public final native long renderBufferGeneration();

    public final native long renderBufferPointer();

    public final native List<Integer> replaceClusterBlueprintCatalog(byte[] bArr);

    public final native void reportResidentSlots(byte[] bArr, long j);

    public final native void requestClusterFormation();

    public final native void setClusterFormationZoomDelta(Double d);

    public final native void setDelegate(FancyPinEngineDelegate fancyPinEngineDelegate);

    public final native int slotForPinId(String str);

    public final native void updateLayouts(List<PinLayout> list);

    public final native void updatePinMapping(Map<String, String> map);

    public final native void updateRuntimeClusterLayouts(List<PinLayout> list);

    public final native void updateRuntimeClusterRanks(Map<String, Integer> map);

    public final native void updateRuntimeClusterVariants(Map<String, String> map);

    public final native void updateStates(List<FancyPinFrameState> list);

    public final native void upsertLayouts(List<PinLayout> list);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        private final void disposeNativeHandle(long j) {
            FancyPinEngine.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            FancyPinEngine.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public FancyPinEngine(long j, Object obj) {
        super(j, Companion);
    }
}

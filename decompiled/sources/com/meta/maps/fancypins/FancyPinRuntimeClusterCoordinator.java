package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.AbstractC7611F5y;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C8j4;
import X.C9jH;
import X.CU7;
import X.G0U;
import X.HsK;
import android.util.Log;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.meta.maps.core.GeoCoordinates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterCoordinator implements FancyPinRuntimeClusterFrameConsumer {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "FancyPinRuntimeClusters";
    public boolean automaticRetryConsumed;
    public final Function0<FancyPinRuntimeClusterCatalog> catalogProvider;
    public boolean closed;
    public final FancyPinRuntimeClusterEngineSink engine;
    public long generation;
    public final FancyPinRuntimeClusterLayoutResolver layoutResolver;
    public final FancyPinMeasurementPipeline measurementPipeline;
    public G0U<? super List<FancyPin>, Unit> pinsChangedListener;
    public Map<String, FancyPin> publishedPinsById;
    public final FancyPinViewRegistry registry;
    public final Function0<Unit> requestUpdate;
    public final LinkedHashMap<String, Integer> requestedRanks;
    public final LinkedHashMap<String, String> requestedVariants;
    public FancyPinRuntimeClusterCatalog retryCatalog;
    public List<PresentationKey> retryPresentationKeys;
    public Map<String, Long> retryRegistrationRevisions;
    public FancyPinRuntimeClusterCatalog submittedCatalog;
    public List<PresentationKey> submittedPresentationKeys;
    public boolean submittedPresentationReady;
    public List<FancyPinRuntimeClusterPresentation> submittedPresentations;
    public Map<String, Long> submittedRegistrationRevisions;
    public final FancyPinRuntimeClusterSynthesizer synthesizer;

    public final class PresentationKey {
        public final Double altitude;
        public final String blueprintId;
        public final long flags;
        public final double latitude;
        public final double longitude;
        public final long memberCount;
        public final String pinId;
        public final int rank;
        public final int slotIndex;
        public final String variantId;

        /* JADX WARN: Illegal instructions before constructor call */
        public PresentationKey(FancyPinRuntimeClusterPresentation fancyPinRuntimeClusterPresentation) {
            C7384Etj.A0Y(fancyPinRuntimeClusterPresentation, 0);
            FancyPin fancyPin = fancyPinRuntimeClusterPresentation.pin;
            String str = fancyPin.id;
            GeoCoordinates geoCoordinates = fancyPin.coordinates;
            double d = geoCoordinates.latitude;
            double d2 = geoCoordinates.longitude;
            Double d3 = geoCoordinates.altitude;
            String str2 = fancyPinRuntimeClusterPresentation.blueprint.id;
            FancyPinFrameState fancyPinFrameState = fancyPinRuntimeClusterPresentation.state;
            this(str, d, d2, d3, str2, fancyPinFrameState.variantId, fancyPinFrameState.rank, fancyPinRuntimeClusterPresentation.slotIndex, fancyPinRuntimeClusterPresentation.runtimeCluster.memberCount, fancyPinRuntimeClusterPresentation.flags);
        }

        public final PresentationKey copy(String str, double d, double d2, Double d3, String str2, String str3, int i, int i2, long j, long j2) {
            C7384Etj.A0Y(str, 0);
            AnonymousClass003.A0y(str2, str3);
            return new PresentationKey(str, d, d2, d3, str2, str3, i, i2, j, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PresentationKey) {
                    PresentationKey presentationKey = (PresentationKey) obj;
                    if (!C7384Etj.areEqual(this.pinId, presentationKey.pinId) || Double.compare(this.latitude, presentationKey.latitude) != 0 || Double.compare(this.longitude, presentationKey.longitude) != 0 || !C7384Etj.areEqual(this.altitude, presentationKey.altitude) || !C7384Etj.areEqual(this.blueprintId, presentationKey.blueprintId) || !C7384Etj.areEqual(this.variantId, presentationKey.variantId) || this.rank != presentationKey.rank || this.slotIndex != presentationKey.slotIndex || this.memberCount != presentationKey.memberCount || this.flags != presentationKey.flags) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PresentationKey copy$default(PresentationKey presentationKey, String str, double d, double d2, Double d3, String str2, String str3, int i, int i2, long j, long j2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = presentationKey.pinId;
            }
            if ((i3 & 2) != 0) {
                d = presentationKey.latitude;
            }
            if ((i3 & 4) != 0) {
                d2 = presentationKey.longitude;
            }
            if ((i3 & 8) != 0) {
                d3 = presentationKey.altitude;
            }
            if ((i3 & 16) != 0) {
                str2 = presentationKey.blueprintId;
            }
            if ((i3 & 32) != 0) {
                str3 = presentationKey.variantId;
            }
            if ((i3 & 64) != 0) {
                i = presentationKey.rank;
            }
            if ((i3 & 128) != 0) {
                i2 = presentationKey.slotIndex;
            }
            if ((i3 & 256) != 0) {
                j = presentationKey.memberCount;
            }
            if ((i3 & 512) != 0) {
                j2 = presentationKey.flags;
            }
            return presentationKey.copy(str, d, d2, d3, str2, str3, i, i2, j, j2);
        }

        public final String component1() {
            return this.pinId;
        }

        public final long component10() {
            return this.flags;
        }

        public final double component2() {
            return this.latitude;
        }

        public final double component3() {
            return this.longitude;
        }

        public final Double component4() {
            return this.altitude;
        }

        public final String component5() {
            return this.blueprintId;
        }

        public final String component6() {
            return this.variantId;
        }

        public final int component7() {
            return this.rank;
        }

        public final int component8() {
            return this.slotIndex;
        }

        public final long component9() {
            return this.memberCount;
        }

        public final Double getAltitude() {
            return this.altitude;
        }

        public final String getBlueprintId() {
            return this.blueprintId;
        }

        public final long getFlags() {
            return this.flags;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final long getMemberCount() {
            return this.memberCount;
        }

        public final String getPinId() {
            return this.pinId;
        }

        public final int getRank() {
            return this.rank;
        }

        public final int getSlotIndex() {
            return this.slotIndex;
        }

        public final String getVariantId() {
            return this.variantId;
        }

        public int hashCode() {
            return C8j4.A0B(this.flags, AnonymousClass006.A06(this.memberCount, (((AnonymousClass005.A0I(this.variantId, AnonymousClass005.A0I(this.blueprintId, (HsK.A01(this.longitude, HsK.A01(this.latitude, AnonymousClass001.A0G(this.pinId))) + AnonymousClass006.A0D(this.altitude)) * 31)) + this.rank) * 31) + this.slotIndex) * 31));
        }

        public String toString() {
            String str = this.pinId;
            double d = this.latitude;
            double d2 = this.longitude;
            Double d3 = this.altitude;
            String str2 = this.blueprintId;
            String str3 = this.variantId;
            int i = this.rank;
            int i2 = this.slotIndex;
            long j = this.memberCount;
            long j2 = this.flags;
            StringBuilder sbA0x = C3cI.A0x("PresentationKey(pinId=", str);
            sbA0x.append(", latitude=");
            sbA0x.append(d);
            sbA0x.append(", longitude=");
            sbA0x.append(d2);
            sbA0x.append(", altitude=");
            sbA0x.append(d3);
            sbA0x.append(", blueprintId=");
            sbA0x.append(str2);
            sbA0x.append(", variantId=");
            sbA0x.append(str3);
            sbA0x.append(", rank=");
            sbA0x.append(i);
            sbA0x.append(", slotIndex=");
            sbA0x.append(i2);
            sbA0x.append(", memberCount=");
            sbA0x.append(j);
            sbA0x.append(", flags=");
            sbA0x.append(j2);
            return BV7.A10(sbA0x);
        }

        public PresentationKey(String str, double d, double d2, Double d3, String str2, String str3, int i, int i2, long j, long j2) {
            C7384Etj.A0Y(str, 0);
            AnonymousClass003.A0y(str2, str3);
            this.pinId = str;
            this.latitude = d;
            this.longitude = d2;
            this.altitude = d3;
            this.blueprintId = str2;
            this.variantId = str3;
            this.rank = i;
            this.slotIndex = i2;
            this.memberCount = j;
            this.flags = j2;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinRuntimeClusterCoordinator$onFrame$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<FancyPinMeasurementBatch, Unit> {
        public final /* synthetic */ List<FancyPinBlueprint> $blueprints;
        public final /* synthetic */ FancyPinRuntimeClusterCatalog $catalog;
        public final /* synthetic */ List<FancyPinRuntimeClusterPresentation> $presentations;
        public final /* synthetic */ long $submittedGeneration;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FancyPinMeasurementBatch fancyPinMeasurementBatch) {
            C7384Etj.A0Y(fancyPinMeasurementBatch, 0);
            FancyPinRuntimeClusterCoordinator.this.publish(this.$submittedGeneration, this.$catalog, this.$presentations, this.$blueprints, fancyPinMeasurementBatch.measurements, fancyPinMeasurementBatch.registrationRevisions);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(long j, FancyPinRuntimeClusterCatalog fancyPinRuntimeClusterCatalog, List<FancyPinRuntimeClusterPresentation> list, List<FancyPinBlueprint> list2) {
            super(1);
            this.$submittedGeneration = j;
            this.$catalog = fancyPinRuntimeClusterCatalog;
            this.$presentations = list;
            this.$blueprints = list2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(FancyPinMeasurementBatch fancyPinMeasurementBatch) {
            invoke2(fancyPinMeasurementBatch);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinRuntimeClusterCoordinator$onFrame$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ long $submittedGeneration;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7384Etj.A0Y(th, 0);
            FancyPinRuntimeClusterCoordinator fancyPinRuntimeClusterCoordinator = FancyPinRuntimeClusterCoordinator.this;
            if (fancyPinRuntimeClusterCoordinator.generation == this.$submittedGeneration) {
                fancyPinRuntimeClusterCoordinator.handleFailure(th);
                Log.e(FancyPinRuntimeClusterCoordinator.TAG, "FancyPins: Runtime cluster measurement failed", th);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(long j) {
            super(1);
            this.$submittedGeneration = j;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    private final void clearSubmittedSnapshot() {
        this.submittedCatalog = null;
        this.submittedPresentations = null;
        this.submittedPresentationKeys = null;
        this.submittedRegistrationRevisions = C9jH.A00;
        this.submittedPresentationReady = false;
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public boolean clearActiveVariant(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        if (!this.publishedPinsById.containsKey(str) && !this.requestedVariants.containsKey(str)) {
            return false;
        }
        this.requestedVariants.remove(str);
        publishRequestedVariants();
        this.requestUpdate.invoke();
        return true;
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public boolean clearRank(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        FancyPin fancyPin = this.publishedPinsById.get(str);
        if (fancyPin == null) {
            return false;
        }
        int iIntValue = fancyPin.rank;
        Integer numRemove = this.requestedRanks.remove(str);
        try {
            publishRequestedRanks();
            this.registry.updateRank$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.engine, str, iIntValue);
            this.requestUpdate.invoke();
            return true;
        } catch (Throwable th) {
            restoreRequestedRank(str, numRemove);
            if (numRemove != null) {
                iIntValue = numRemove.intValue();
            }
            rollbackRankMutation(str, iIntValue, th);
            throw th;
        }
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public boolean clearZOrder(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        if (!this.publishedPinsById.containsKey(str)) {
            return false;
        }
        this.registry.updateZOrder$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.engine, str, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[LOOP:1: B:17:0x005b->B:19:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[LOOP:3: B:27:0x009f->B:29:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5 A[LOOP:4: B:31:0x00bf->B:33:0x00c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onFrame(com.meta.maps.fancypins.FancyPinRenderFrame r15) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinRuntimeClusterCoordinator.onFrame(com.meta.maps.fancypins.FancyPinRenderFrame):boolean");
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public FancyPin pin(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        FancyPin fancyPin = this.publishedPinsById.get(str);
        if (fancyPin != null) {
            return AbstractC7611F5y.A0P(fancyPin);
        }
        return null;
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public boolean setActiveVariant(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        if (!this.publishedPinsById.containsKey(str)) {
            return false;
        }
        this.requestedVariants.put(str, str2);
        publishRequestedVariants();
        this.requestUpdate.invoke();
        return zA1a;
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public boolean setRank(String str, int i) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        FancyPin fancyPin = this.publishedPinsById.get(str);
        if (fancyPin == null) {
            return false;
        }
        int iIntValue = fancyPin.rank;
        Integer num = this.requestedRanks.get(str);
        C8j4.A1O(str, this.requestedRanks, i);
        try {
            publishRequestedRanks();
            this.registry.updateRank$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.engine, str, i);
            this.requestUpdate.invoke();
            return true;
        } catch (Throwable th) {
            restoreRequestedRank(str, num);
            if (num != null) {
                iIntValue = num.intValue();
            }
            rollbackRankMutation(str, iIntValue, th);
            throw th;
        }
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public boolean setZOrder(String str, float f) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        if (!this.publishedPinsById.containsKey(str)) {
            return false;
        }
        this.registry.updateZOrder$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.engine, str, Float.valueOf(f));
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFailure(Throwable th) {
        if (this.automaticRetryConsumed) {
            return;
        }
        this.automaticRetryConsumed = true;
        clearSubmittedSnapshot();
        try {
            this.requestUpdate.invoke();
        } catch (Throwable th2) {
            CU7.A01(th, th2);
        }
    }

    private final boolean hasAutoSizedPart(FancyPinBlueprint fancyPinBlueprint) {
        List<FancyPinVariant> list = fancyPinBlueprint.variants;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<FancyPinVariant> it = list.iterator();
            while (it.hasNext()) {
                List<FancyPinPart> list2 = it.next().parts;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<FancyPinPart> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().size.constraint == SizeConstraint.AUTO) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean publish(long j, FancyPinRuntimeClusterCatalog fancyPinRuntimeClusterCatalog, List<FancyPinRuntimeClusterPresentation> list, List<FancyPinBlueprint> list2, List<PinMeasurement> list3, Map<String, Long> map) {
        if (!this.closed && this.generation == j) {
            if (this.catalogProvider.invoke() != fancyPinRuntimeClusterCatalog) {
                clearSubmittedSnapshot();
                try {
                    this.requestUpdate.invoke();
                    return false;
                } catch (Throwable th) {
                    Log.e(TAG, "FancyPins: Runtime cluster catalog refresh request failed", th);
                    return false;
                }
            }
            try {
                FancyPinRuntimeClusterLayoutSnapshot fancyPinRuntimeClusterLayoutSnapshotResolve = this.layoutResolver.resolve(fancyPinRuntimeClusterCatalog, list, list3);
                this.engine.updateRuntimeClusterLayouts(fancyPinRuntimeClusterLayoutSnapshotResolve.measuredLayouts);
                HashSet hashSetA13 = C60O.A13();
                Iterator<FancyPinRuntimeClusterPresentation> it = list.iterator();
                while (it.hasNext()) {
                    hashSetA13.add(it.next().pin.id);
                }
                this.requestedVariants.keySet().retainAll(hashSetA13);
                this.requestedRanks.keySet().retainAll(hashSetA13);
                publishRequestedVariants();
                publishRequestedRanks();
                FancyPinViewRegistry fancyPinViewRegistry = this.registry;
                FancyPinRuntimeClusterEngineSink fancyPinRuntimeClusterEngineSink = this.engine;
                ArrayList arrayListA0m = AnonymousClass002.A0m(list);
                Iterator<FancyPinRuntimeClusterPresentation> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayListA0m.add(it2.next().pin);
                }
                List<PinLayout> list4 = fancyPinRuntimeClusterLayoutSnapshotResolve.layouts;
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
                Iterator<FancyPinRuntimeClusterPresentation> it3 = list.iterator();
                while (it3.hasNext()) {
                    FancyPinFrameState fancyPinFrameState = it3.next().state;
                    String str = fancyPinFrameState.id;
                    GeoCoordinates geoCoordinates = fancyPinFrameState.coordinate;
                    String str2 = fancyPinFrameState.variantId;
                    Integer num = this.requestedRanks.get(str);
                    arrayListA0m2.add(new FancyPinFrameState(str, geoCoordinates, str2, num != null ? num.intValue() : fancyPinFrameState.rank));
                }
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                for (FancyPinRuntimeClusterPresentation fancyPinRuntimeClusterPresentation : list) {
                    linkedHashMapA0j.put(fancyPinRuntimeClusterPresentation.pin.id, fancyPinRuntimeClusterPresentation.runtimeCluster);
                }
                FancyPinViewRegistry.replaceRuntimePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin$default(fancyPinViewRegistry, fancyPinRuntimeClusterEngineSink, arrayListA0m, list2, list4, arrayListA0m2, linkedHashMapA0j, map, null, 128, null);
                this.submittedRegistrationRevisions = map;
                this.submittedPresentationReady = true;
                LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
                Iterator<FancyPinRuntimeClusterPresentation> it4 = list.iterator();
                while (it4.hasNext()) {
                    FancyPin fancyPin = it4.next().pin;
                    linkedHashMapA0j2.put(fancyPin.id, AbstractC7611F5y.A0P(fancyPin));
                }
                this.publishedPinsById = linkedHashMapA0j2;
                try {
                    G0U<? super List<FancyPin>, Unit> g0u = this.pinsChangedListener;
                    if (g0u != null) {
                        Collection collectionValues = linkedHashMapA0j2.values();
                        ArrayList arrayListA0m3 = AnonymousClass002.A0m(collectionValues);
                        Iterator it5 = collectionValues.iterator();
                        while (it5.hasNext()) {
                            arrayListA0m3.add(AbstractC7611F5y.A0P((FancyPin) it5.next()));
                        }
                        g0u.invoke(arrayListA0m3);
                    }
                } catch (Throwable th2) {
                    Log.e(TAG, "FancyPins: Runtime cluster pins callback failed", th2);
                }
                if (!this.closed && this.generation == j) {
                    try {
                        this.requestUpdate.invoke();
                        return true;
                    } catch (Throwable th3) {
                        Log.e(TAG, "FancyPins: Runtime cluster update request failed", th3);
                        return true;
                    }
                }
            } catch (Throwable th4) {
                if (this.generation == j) {
                    handleFailure(th4);
                }
                Log.e(TAG, "FancyPins: Runtime cluster publication failed", th4);
            }
        }
        return false;
    }

    private final void publishRequestedRanks() {
        FancyPinRuntimeClusterEngineSink fancyPinRuntimeClusterEngineSink = this.engine;
        LinkedHashMap<String, Integer> linkedHashMap = this.requestedRanks;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        C7384Etj.A0Y(linkedHashMap, 0);
        linkedHashMapA0j.putAll(linkedHashMap);
        fancyPinRuntimeClusterEngineSink.updateRuntimeClusterRanks(linkedHashMapA0j);
    }

    private final void publishRequestedVariants() {
        FancyPinRuntimeClusterEngineSink fancyPinRuntimeClusterEngineSink = this.engine;
        LinkedHashMap<String, String> linkedHashMap = this.requestedVariants;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        C7384Etj.A0Y(linkedHashMap, 0);
        linkedHashMapA0j.putAll(linkedHashMap);
        fancyPinRuntimeClusterEngineSink.updateRuntimeClusterVariants(linkedHashMapA0j);
    }

    private final void restoreRequestedRank(String str, Integer num) {
        LinkedHashMap<String, Integer> linkedHashMap = this.requestedRanks;
        if (num == null) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, num);
        }
    }

    public FancyPinRuntimeClusterCoordinator(FancyPinRuntimeClusterEngineSink fancyPinRuntimeClusterEngineSink, FancyPinRuntimeClusterLayoutResolver fancyPinRuntimeClusterLayoutResolver, FancyPinViewRegistry fancyPinViewRegistry, FancyPinMeasurementPipeline fancyPinMeasurementPipeline, Function0<FancyPinRuntimeClusterCatalog> function0, Function0<Unit> function02) {
        AnonymousClass005.A17(fancyPinRuntimeClusterEngineSink, fancyPinRuntimeClusterLayoutResolver, fancyPinViewRegistry, fancyPinMeasurementPipeline, function0);
        C7384Etj.A0Y(function02, 5);
        this.engine = fancyPinRuntimeClusterEngineSink;
        this.layoutResolver = fancyPinRuntimeClusterLayoutResolver;
        this.registry = fancyPinViewRegistry;
        this.measurementPipeline = fancyPinMeasurementPipeline;
        this.catalogProvider = function0;
        this.requestUpdate = function02;
        this.synthesizer = new FancyPinRuntimeClusterSynthesizer();
        C9jH c9jH = C9jH.A00;
        this.submittedRegistrationRevisions = c9jH;
        this.retryRegistrationRevisions = c9jH;
        this.requestedVariants = C3cG.A0j();
        this.requestedRanks = C3cG.A0j();
        this.publishedPinsById = c9jH;
    }

    private final void checkMainThread() {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("FancyPin runtime clusters must be coordinated on the main thread");
        }
    }

    private final void rollbackRankMutation(String str, int i, Throwable th) {
        try {
            publishRequestedRanks();
        } catch (Throwable th2) {
            CU7.A01(th, th2);
        }
        try {
            this.registry.updateRank$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.engine, str, i);
        } catch (Throwable th3) {
            CU7.A01(th, th3);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        checkMainThread();
        if (this.closed) {
            return;
        }
        long j = this.generation;
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw C3cG.A0Q("Runtime cluster publication generation overflow");
        }
        this.generation = j + 1;
        this.closed = true;
        this.pinsChangedListener = null;
        this.publishedPinsById = C9jH.A00;
        this.requestedVariants.clear();
        this.requestedRanks.clear();
        this.measurementPipeline.close();
    }

    @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer
    public void setPinsChangedListener(G0U<? super List<FancyPin>, Unit> g0u) {
        checkMainThread();
        if (this.closed) {
            throw C3cG.A0Q("FancyPin runtime cluster coordinator is closed");
        }
        this.pinsChangedListener = g0u;
    }
}

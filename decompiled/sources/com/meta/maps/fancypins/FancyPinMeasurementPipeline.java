package com.meta.maps.fancypins;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AbstractC7611F5y;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV5;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9jH;
import X.G0U;
import X.Hr7;
import X.HsJ;
import X.HxE;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FancyPinMeasurementPipeline implements AutoCloseable {
    public final Executor backgroundExecutor;
    public boolean closed;
    public long generation;
    public PendingRequest pendingRequest;
    public final FancyPinViewRegistry registry;
    public final Executor uiExecutor;

    /* renamed from: com.meta.maps.fancypins.FancyPinMeasurementPipeline$submit$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleOwned(final List<FancyPin> list, final List<FancyPinBlueprint> list2, final Map<String, FancyPinRuntimeClusterContext> map, final PendingRequest pendingRequest, boolean z) {
        if (this.generation == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw C3cG.A0Q("FancyPin measurement generation overflow");
        }
        final FancyPinPartRegistrationSnapshot fancyPinPartRegistrationSnapshotMeasurementSnapshot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.measurementSnapshot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
        PendingRequest pendingRequest2 = z ? this.pendingRequest : null;
        final long j = this.generation + 1;
        this.generation = j;
        if (z) {
            this.pendingRequest = pendingRequest;
            if (pendingRequest2 != null) {
                pendingRequest2.fail(new CancellationException("FancyPin measurement was superseded"));
            }
            if (this.closed || this.generation != j) {
                return;
            }
        }
        try {
            this.backgroundExecutor.execute(new Runnable() { // from class: com.meta.maps.fancypins.FancyPinMeasurementPipeline.scheduleOwned.2
                @Override // java.lang.Runnable
                public final void run() {
                    final Object objA0s;
                    FancyPinMeasurementPipeline fancyPinMeasurementPipeline = FancyPinMeasurementPipeline.this;
                    List<FancyPin> list3 = list;
                    List<FancyPinBlueprint> list4 = list2;
                    Map<String, FancyPinRuntimeClusterContext> map2 = map;
                    FancyPinPartRegistrationSnapshot fancyPinPartRegistrationSnapshot = fancyPinPartRegistrationSnapshotMeasurementSnapshot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin;
                    try {
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    if (C3cH.A1K()) {
                        throw C3cG.A0Q("FancyPin measurement must run off the main thread");
                    }
                    objA0s = fancyPinMeasurementPipeline.measure(list3, list4, map2, fancyPinPartRegistrationSnapshot);
                    try {
                        final FancyPinMeasurementPipeline fancyPinMeasurementPipeline2 = FancyPinMeasurementPipeline.this;
                        Executor executor = fancyPinMeasurementPipeline2.uiExecutor;
                        final long j2 = j;
                        final List<FancyPin> list5 = list;
                        final List<FancyPinBlueprint> list6 = list2;
                        final Map<String, FancyPinRuntimeClusterContext> map3 = map;
                        final PendingRequest pendingRequest3 = pendingRequest;
                        executor.execute(new Runnable() { // from class: com.meta.maps.fancypins.FancyPinMeasurementPipeline.scheduleOwned.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                fancyPinMeasurementPipeline2.checkMainThread("deliver");
                                FancyPinMeasurementPipeline fancyPinMeasurementPipeline3 = fancyPinMeasurementPipeline2;
                                if (fancyPinMeasurementPipeline3.closed || fancyPinMeasurementPipeline3.generation != j2) {
                                    return;
                                }
                                Object obj = objA0s;
                                if (obj instanceof C10571Hud) {
                                    obj = null;
                                }
                                FancyPinMeasurementBatch fancyPinMeasurementBatch = (FancyPinMeasurementBatch) obj;
                                if (fancyPinMeasurementBatch != null && !fancyPinMeasurementPipeline3.registry.registrationRevisionsAreCurrent$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinMeasurementBatch.registrationRevisions)) {
                                    fancyPinMeasurementPipeline2.scheduleOwned(list5, list6, map3, pendingRequest3, false);
                                    return;
                                }
                                fancyPinMeasurementPipeline2.pendingRequest = null;
                                Object obj2 = objA0s;
                                PendingRequest pendingRequest4 = pendingRequest3;
                                Throwable thA00 = HsJ.A00(obj2);
                                if (thA00 == null) {
                                    pendingRequest4.succeed((FancyPinMeasurementBatch) obj2);
                                } else {
                                    pendingRequest4.fail(thA00);
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        pendingRequest.fail(th2);
                    }
                }
            });
        } catch (Throwable th) {
            this.pendingRequest = null;
            pendingRequest.fail(th);
        }
    }

    public final void cancelPending(CancellationException cancellationException) {
        C7384Etj.A0Y(cancellationException, 0);
        checkMainThread("cancelPending");
        if (this.closed) {
            throw C3cG.A0Q("FancyPin measurement pipeline is closed");
        }
        long j = this.generation;
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw C3cG.A0Q("FancyPin measurement generation overflow");
        }
        this.generation = j + 1;
        PendingRequest pendingRequest = this.pendingRequest;
        this.pendingRequest = null;
        if (pendingRequest != null) {
            pendingRequest.fail(cancellationException);
        }
    }

    public final Map<String, Long> registrationRevisions(List<FancyPinBlueprint> list) {
        C7384Etj.A0Y(list, 0);
        checkMainThread("registrationRevisions");
        if (this.closed) {
            throw C3cG.A0Q("FancyPin measurement pipeline is closed");
        }
        FancyPinPartRegistrationSnapshot fancyPinPartRegistrationSnapshotMeasurementSnapshot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = this.registry.measurementSnapshot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator<FancyPinBlueprint> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().id;
            linkedHashMapA0j.put(str, Long.valueOf(fancyPinPartRegistrationSnapshotMeasurementSnapshot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin.revision(str)));
        }
        return linkedHashMapA0j;
    }

    public final void submit(List<FancyPin> list, List<FancyPinBlueprint> list2, G0U<? super FancyPinMeasurementBatch, Unit> g0u, G0U<? super Throwable, Unit> g0u2, Map<String, FancyPinRuntimeClusterContext> map) {
        C7384Etj.A0Y(list, 0);
        AnonymousClass005.A11(list2, g0u, g0u2, 1);
        C7384Etj.A0Y(map, 4);
        checkMainThread(BrowserOperationCatalogKt.SUBMIT);
        if (this.closed) {
            throw C3cG.A0Q("FancyPin measurement pipeline is closed");
        }
        PendingRequest pendingRequest = new PendingRequest(g0u, g0u2);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<FancyPin> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(AbstractC7611F5y.A0P(it.next()));
        }
        scheduleOwned(arrayListA0i, AbstractC0878AGe.A0X(list2), AGH.A0A(map), pendingRequest, true);
    }

    public final class PendingRequest {
        public final AtomicBoolean completed;
        public final G0U<Throwable, Unit> onFailure;
        public final G0U<FancyPinMeasurementBatch, Unit> onReady;

        public final void fail(Throwable th) {
            C7384Etj.A0Y(th, 0);
            if (this.completed.compareAndSet(false, true)) {
                this.onFailure.invoke(th);
            }
        }

        public final void succeed(FancyPinMeasurementBatch fancyPinMeasurementBatch) {
            C7384Etj.A0Y(fancyPinMeasurementBatch, 0);
            if (this.completed.compareAndSet(false, true)) {
                this.onReady.invoke(fancyPinMeasurementBatch);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PendingRequest(G0U<? super FancyPinMeasurementBatch, Unit> g0u, G0U<? super Throwable, Unit> g0u2) {
            AnonymousClass003.A0u(g0u, g0u2);
            this.onReady = g0u;
            this.onFailure = g0u2;
            this.completed = new AtomicBoolean();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FancyPinMeasurementBatch measure(List<FancyPin> list, List<FancyPinBlueprint> list2, Map<String, FancyPinRuntimeClusterContext> map, FancyPinPartRegistrationSnapshot fancyPinPartRegistrationSnapshot) {
        int iA03 = C3cG.A03(list2, 10);
        if (iA03 < 16) {
            iA03 = 16;
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(iA03);
        for (FancyPinBlueprint fancyPinBlueprint : list2) {
            linkedHashMapA15.put(fancyPinBlueprint.id, fancyPinBlueprint);
        }
        Collection<FancyPinBlueprint> collectionValues = linkedHashMapA15.values();
        HashSet hashSetA13 = C60O.A13();
        for (FancyPinBlueprint fancyPinBlueprint2 : collectionValues) {
            String str = fancyPinBlueprint2.id;
            if (FancyPinMeasurementPipelineKt.hasAutoSizedPart(fancyPinBlueprint2) && str != null) {
                hashSetA13.add(str);
            }
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (FancyPin fancyPin : list) {
            if (hashSetA13.contains(fancyPin.blueprintId)) {
                arrayListA0h.add(fancyPin);
            }
        }
        List<PinMeasurement> listMeasure = new FancyPinMeasurer(fancyPinPartRegistrationSnapshot).measure(arrayListA0h, linkedHashMapA15, map);
        FancyPinMeasurementPipelineKt.validateCompleteMeasurements(arrayListA0h, linkedHashMapA15, listMeasure);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listMeasure);
        for (PinMeasurement pinMeasurement : listMeasure) {
            String str2 = pinMeasurement.id;
            Set<Map.Entry<String, VariantMeasurement>> setEntrySet = pinMeasurement.variants.entrySet();
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (Map.Entry<String, VariantMeasurement> entry : setEntrySet) {
                if (!entry.getValue().parts.isEmpty()) {
                    arrayListA0h2.add(entry);
                }
            }
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator it = arrayListA0h2.iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                HxE hxEA0r = C3cG.A0r(entryA0l.getKey(), entryA0l.getValue());
                linkedHashMapA0j.put(hxEA0r.first, hxEA0r.second);
            }
            arrayListA0m.add(new PinMeasurement(str2, linkedHashMapA0j));
        }
        LinkedHashMap linkedHashMapA152 = C60O.A15(Hr7.A1C(list2));
        Iterator<FancyPinBlueprint> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str3 = it2.next().id;
            HxE hxEA0r2 = C3cG.A0r(str3, Long.valueOf(fancyPinPartRegistrationSnapshot.revision(str3)));
            linkedHashMapA152.put(hxEA0r2.first, hxEA0r2.second);
        }
        return new FancyPinMeasurementBatch(list, list2, arrayListA0m, linkedHashMapA152);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submit$default(FancyPinMeasurementPipeline fancyPinMeasurementPipeline, List list, List list2, G0U g0u, G0U g0u2, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            g0u2 = AnonymousClass1.INSTANCE;
        }
        if ((i & 16) != 0) {
            map = C9jH.A00;
        }
        fancyPinMeasurementPipeline.submit(list, list2, g0u, g0u2, map);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        checkMainThread("close");
        if (this.closed) {
            return;
        }
        long j = this.generation;
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw C3cG.A0Q("FancyPin measurement generation overflow");
        }
        this.generation = j + 1;
        this.closed = true;
        PendingRequest pendingRequest = this.pendingRequest;
        this.pendingRequest = null;
        if (pendingRequest != null) {
            pendingRequest.fail(new CancellationException("FancyPin measurement pipeline was closed"));
        }
    }

    public FancyPinMeasurementPipeline(FancyPinViewRegistry fancyPinViewRegistry, Executor executor, Executor executor2) {
        AnonymousClass005.A0x(fancyPinViewRegistry, executor, executor2);
        this.registry = fancyPinViewRegistry;
        this.backgroundExecutor = executor;
        this.uiExecutor = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkMainThread(String str) {
        if (!C3cH.A1K()) {
            throw BV5.A0V("FancyPinMeasurementPipeline.", str, " must run on the main thread");
        }
    }
}

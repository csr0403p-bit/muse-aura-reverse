package com.meta.maps.fancypins;

import X.A3q;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AbstractC7609F5w;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9jH;
import X.F0C;
import X.FGI;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinViewRegistry {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int INITIAL_SLOT_CAPACITY = 64;

    @Deprecated
    public static final String TAG = "FancyPinViewRegistry";
    public boolean clustersArriveWithData;
    public FancyPinOrderingObserver orderingObserver;
    public Object overlayObserverOwner;
    public FancyPinRetirementPresenter retirementPresenter;
    public final FancyPinPresentationEpoch presentationEpoch = new FancyPinPresentationEpoch();
    public final HashMap<String, Map<String, FancyPinErasedPartRegistration>> partRegistrations = BV4.A0u();
    public final HashMap<String, Long> registrationRevisions = BV4.A0u();
    public FancyPinSlotRows sourceRows = new FancyPinSlotRows(0);
    public FancyPinSlotRows runtimeRows = new FancyPinSlotRows(0);
    public boolean[] contentDirtySlots = new boolean[64];
    public List<String> variantIds = C0881AGi.A00;
    public SparseArray<FancyPinRetirement> retirementsBySlot = BV4.A0B();
    public final LinkedHashSet<String> pendingAnimatedAppearancePinIds = C3cG.A0k();
    public final LinkedHashSet<String> formedRuntimeClusterAppearancePinIds = C3cG.A0k();
    public boolean validatesPresentationLayouts = true;

    /* renamed from: com.meta.maps.fancypins.FancyPinViewRegistry$lazyPartConfigurations$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Map<String, ? extends Map<String, ? extends FancyPinErasedPartConfiguration>>> {
        public final /* synthetic */ FancyPinBlueprint $blueprint;
        public final /* synthetic */ Map<String, Object> $properties;
        public final /* synthetic */ FancyPinRuntimeClusterContext $runtimeCluster;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FancyPinBlueprint fancyPinBlueprint, Map<String, ? extends Object> map, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
            super(0);
            this.$blueprint = fancyPinBlueprint;
            this.$properties = map;
            this.$runtimeCluster = fancyPinRuntimeClusterContext;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends Map<String, ? extends FancyPinErasedPartConfiguration>> invoke() {
            return FancyPinViewRegistry.this.resolvePartConfigurations(this.$blueprint, this.$properties, this.$runtimeCluster);
        }
    }

    public final void detachOverlayObservers$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(Object obj) {
        C7384Etj.A0Y(obj, 0);
        checkMainThread("detachOverlayObservers");
        if (this.overlayObserverOwner == obj) {
            this.overlayObserverOwner = null;
            this.retirementPresenter = null;
            this.orderingObserver = null;
        }
    }

    public final void didBeginAnimatedAppearance$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str) {
        C7384Etj.A0Y(str, 0);
        this.pendingAnimatedAppearancePinIds.remove(str);
        this.formedRuntimeClusterAppearancePinIds.remove(str);
    }

    public final void discardAnimatedAppearance$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str) {
        C7384Etj.A0Y(str, 0);
        this.pendingAnimatedAppearancePinIds.remove(str);
        this.formedRuntimeClusterAppearancePinIds.remove(str);
    }

    public final void expireFrameScopedAppearanceIntent$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        this.clustersArriveWithData = false;
        if (this.formedRuntimeClusterAppearancePinIds.isEmpty()) {
            return;
        }
        this.pendingAnimatedAppearancePinIds.removeAll(this.formedRuntimeClusterAppearancePinIds);
        this.formedRuntimeClusterAppearancePinIds.clear();
    }

    public final boolean hasPendingAnimatedAppearance$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str) {
        C7384Etj.A0Y(str, 0);
        return this.pendingAnimatedAppearancePinIds.contains(str);
    }

    public final void onVariantTableUpdated$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(List<String> list) {
        C7384Etj.A0Y(list, 0);
        checkMainThread("onVariantTableUpdated");
        if (C7384Etj.areEqual(this.variantIds, list)) {
            return;
        }
        this.variantIds = AbstractC0878AGe.A0X(list);
        for (FancyPinSlotRows fancyPinSlotRows : Arrays.asList(this.sourceRows, this.runtimeRows)) {
            int size = fancyPinSlotRows.presentations.size();
            for (int i = 0; i < size; i++) {
                this.contentDirtySlots[fancyPinSlotRows.presentations.keyAt(i)] = true;
            }
        }
    }

    public final Long registrationRevision$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str) {
        C7384Etj.A0Y(str, 0);
        return this.registrationRevisions.get(str);
    }

    public final boolean registrationRevisionsAreCurrent$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(Map<String, Long> map) {
        C7384Etj.A0Y(map, 0);
        checkMainThread("registrationRevisionsAreCurrent");
        if (!map.isEmpty()) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                Object key = entryA0l.getKey();
                if (C60P.A01(BV6.A0j(key, this.registrationRevisions)) != C3cG.A05(entryA0l.getValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    private final F0C<Map<String, Map<String, FancyPinErasedPartConfiguration>>> lazyPartConfigurations(FancyPinBlueprint fancyPinBlueprint, Map<String, ? extends Object> map, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        return AbstractC5321DgF.A02(C79.A0C, new AnonymousClass1(fancyPinBlueprint, map, fancyPinRuntimeClusterContext));
    }

    public static /* synthetic */ F0C lazyPartConfigurations$default(FancyPinViewRegistry fancyPinViewRegistry, FancyPinBlueprint fancyPinBlueprint, Map map, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, int i, Object obj) {
        if ((i & 4) != 0) {
            fancyPinRuntimeClusterContext = null;
        }
        return fancyPinViewRegistry.lazyPartConfigurations(fancyPinBlueprint, map, fancyPinRuntimeClusterContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.meta.maps.fancypins.FancyPinViewRegistry] */
    public static /* synthetic */ Set replacePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin$default(FancyPinViewRegistry fancyPinViewRegistry, FancyPinSlotResolver fancyPinSlotResolver, List list, List list2, List list3, List list4, Map map, List list5, Set set, Set set2, Map map2, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            map = null;
        }
        if ((i & 64) != 0) {
            list5 = C0881AGi.A00;
        }
        if ((i & 128) != 0) {
            set = A3q.A00;
        }
        if ((i & 256) != 0) {
            set2 = C3cG.A0k();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC7609F5w.A1Q(set2, it);
            }
        }
        if ((i & 512) != 0) {
            map2 = C9jH.A00;
        }
        return fancyPinViewRegistry.replacePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinSlotResolver, list, list2, list3, list4, map, list5, set, set2, map2, C3cG.A1K(i & 1024, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.meta.maps.fancypins.FancyPinViewRegistry] */
    public static /* synthetic */ void replaceRuntimePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin$default(FancyPinViewRegistry fancyPinViewRegistry, FancyPinSlotResolver fancyPinSlotResolver, List list, List list2, List list3, List list4, Map map, Map map2, Set set, int i, Object obj) {
        if ((i & 64) != 0) {
            map2 = null;
        }
        if ((i & 128) != 0) {
            set = C3cG.A0k();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC7609F5w.A1Q(set, it);
            }
        }
        fancyPinViewRegistry.replaceRuntimePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinSlotResolver, list, list2, list3, list4, map, map2, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Map<String, FancyPinErasedPartConfiguration>> resolvePartConfigurations(FancyPinBlueprint fancyPinBlueprint, Map<String, ? extends Object> map, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        List<FancyPinVariant> list = fancyPinBlueprint.variants;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (FancyPinVariant fancyPinVariant : list) {
            List<FancyPinPart> list2 = fancyPinVariant.parts;
            ArrayList arrayListA0h = C3cG.A0h();
            for (FancyPinPart fancyPinPart : list2) {
                FancyPinErasedPartRegistration fancyPinErasedPartRegistrationPartRegistration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = partRegistration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinBlueprint.id, fancyPinPart.id);
                if (fancyPinErasedPartRegistrationPartRegistration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin != null) {
                    AnonymousClass002.A1J(fancyPinPart.id, fancyPinErasedPartRegistrationPartRegistration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin.resolveForApply(new FancyPinPartResolveContext(fancyPinPart.attachedConfig, fancyPinPart.style, map, fancyPinRuntimeClusterContext)), arrayListA0h);
                }
            }
            LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
            AGH.A0F(arrayListA0h, linkedHashMapA0j2);
            linkedHashMapA0j.put(fancyPinVariant.id, linkedHashMapA0j2);
        }
        return linkedHashMapA0j;
    }

    private final FancyPinSlotRows rowsForSlot(int i) {
        if (this.sourceRows.contains(i)) {
            return this.sourceRows;
        }
        if (this.runtimeRows.contains(i)) {
            return this.runtimeRows;
        }
        return null;
    }

    public final void clearAnimatedAppearances$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        this.pendingAnimatedAppearancePinIds.clear();
        this.formedRuntimeClusterAppearancePinIds.clear();
        this.clustersArriveWithData = false;
    }

    public final void clearRetirements$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        checkMainThread("clearRetirements");
        this.presentationEpoch.advance(new FancyPinViewRegistry$clearRetirements$1(this));
        FancyPinRetirementPresenter fancyPinRetirementPresenter = this.retirementPresenter;
        if (fancyPinRetirementPresenter != null) {
            fancyPinRetirementPresenter.present(C0881AGi.A00);
        }
    }

    public final void didApply$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        if (i >= 0) {
            boolean[] zArr = this.contentDirtySlots;
            if (i < zArr.length) {
                zArr[i] = false;
            }
        }
    }

    public final int effectiveRankForSlotOrDefault$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i, int i2) {
        FancyPinSlotRows fancyPinSlotRows;
        int iIndexOfKey = this.sourceRows.effectiveRanks.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            fancyPinSlotRows = this.sourceRows;
        } else {
            iIndexOfKey = this.runtimeRows.effectiveRanks.indexOfKey(i);
            if (iIndexOfKey < 0) {
                return i2;
            }
            fancyPinSlotRows = this.runtimeRows;
        }
        return fancyPinSlotRows.effectiveRanks.valueAt(iIndexOfKey);
    }

    public final boolean getHasPendingAnimatedAppearances$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return !this.pendingAnimatedAppearancePinIds.isEmpty();
    }

    public final FancyPinPresentationEpoch getPresentationEpoch$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.presentationEpoch;
    }

    public final boolean getValidatesPresentationLayouts$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.validatesPresentationLayouts;
    }

    public final void invalidatePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        checkMainThread("invalidatePresentation");
        this.presentationEpoch.invalidate();
    }

    public final boolean isContentDirty$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        if (i >= 0) {
            boolean[] zArr = this.contentDirtySlots;
            if (i < zArr.length && zArr[i]) {
                return true;
            }
        }
        return false;
    }

    public final FancyPinPartRegistrationSnapshot measurementSnapshot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        checkMainThread("measurementSnapshot");
        HashMap<String, Map<String, FancyPinErasedPartRegistration>> map = this.partRegistrations;
        HashMap mapA0u = BV4.A0u();
        Iterator itA0i = C3cG.A0i(map);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            mapA0u.put(entryA0l.getKey(), AGH.A0A((Map) entryA0l.getValue()));
        }
        return new FancyPinPartRegistrationSnapshot(mapA0u, AGH.A0A(this.registrationRevisions));
    }

    public final FancyPin pinForSlot(int i) {
        FancyPin fancyPin;
        FancyPinPresentation fancyPinPresentation = this.sourceRows.presentations.get(i);
        if (fancyPinPresentation != null && (fancyPin = fancyPinPresentation.pin) != null) {
            return fancyPin;
        }
        FancyPinPresentation fancyPinPresentation2 = this.runtimeRows.presentations.get(i);
        if (fancyPinPresentation2 != null) {
            return fancyPinPresentation2.pin;
        }
        return null;
    }

    public final FancyPinPresentation presentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        FancyPinPresentation fancyPinPresentation = this.sourceRows.presentations.get(i);
        return fancyPinPresentation == null ? this.runtimeRows.presentations.get(i) : fancyPinPresentation;
    }

    public final FancyPinRetirement retirementForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        return this.retirementsBySlot.get(i);
    }

    public final void setValidatesPresentationLayouts$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(boolean z) {
        this.validatesPresentationLayouts = z;
    }

    public final Float zOrderOverrideForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        Float f = this.sourceRows.zOrderOverrides.get(i);
        return f == null ? this.runtimeRows.zOrderOverrides.get(i) : f;
    }

    private final void checkMainThread(String str) {
        if (!C3cH.A1K()) {
            throw BV5.A0V("FancyPinViewRegistry.", str, " must run on the main thread");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean[] makeDirtySlots(com.meta.maps.fancypins.FancyPinSlotRows r7, com.meta.maps.fancypins.FancyPinSlotRows r8, java.util.Set<java.lang.String> r9) {
        /*
            r6 = this;
            int r4 = r8.highestSlot()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r0) goto L7d
            boolean[] r3 = r6.contentDirtySlots
            int r2 = r3.length
        Lc:
            if (r2 > r4) goto L19
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r2
            int r2 = r2 * 2
            if (r0 <= r1) goto Lc
            int r2 = r4 + 1
            goto Lc
        L19:
            boolean[] r5 = java.util.Arrays.copyOf(r3, r2)
            X.C7384Etj.A0U(r5)
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinPresentation> r0 = r7.presentations
            int r3 = r0.size()
            r2 = 0
            r1 = 0
        L28:
            if (r1 >= r3) goto L35
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinPresentation> r0 = r7.presentations
            int r0 = r0.keyAt(r1)
            r5[r0] = r2
            int r1 = r1 + 1
            goto L28
        L35:
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinPresentation> r0 = r8.presentations
            int r4 = r0.size()
            r3 = 0
        L3c:
            if (r3 >= r4) goto L7c
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinPresentation> r0 = r8.presentations
            int r2 = r0.keyAt(r3)
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinPresentation> r0 = r8.presentations
            java.lang.Object r0 = r0.valueAt(r3)
            com.meta.maps.fancypins.FancyPinPresentation r0 = (com.meta.maps.fancypins.FancyPinPresentation) r0
            com.meta.maps.fancypins.FancyPin r0 = r0.pin
            java.lang.String r1 = r0.id
            boolean r0 = r9.contains(r1)
            if (r0 != 0) goto L72
            android.util.SparseArray<com.meta.maps.fancypins.FancyPinPresentation> r0 = r7.presentations
            java.lang.Object r0 = r0.get(r2)
            com.meta.maps.fancypins.FancyPinPresentation r0 = (com.meta.maps.fancypins.FancyPinPresentation) r0
            if (r0 == 0) goto L7a
            com.meta.maps.fancypins.FancyPin r0 = r0.pin
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.id
        L66:
            boolean r0 = X.C7384Etj.areEqual(r0, r1)
            if (r0 == 0) goto L78
            boolean r0 = r6.isContentDirty$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(r2)
            if (r0 == 0) goto L78
        L72:
            r0 = 1
        L73:
            r5[r2] = r0
            int r3 = r3 + 1
            goto L3c
        L78:
            r0 = 0
            goto L73
        L7a:
            r0 = 0
            goto L66
        L7c:
            return r5
        L7d:
            java.lang.String r0 = "FancyPin slot index exceeds Android array capacity"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinViewRegistry.makeDirtySlots(com.meta.maps.fancypins.FancyPinSlotRows, com.meta.maps.fancypins.FancyPinSlotRows, java.util.Set):boolean[]");
    }

    public final void attachOverlayObservers$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(Object obj, FancyPinRetirementPresenter fancyPinRetirementPresenter, FancyPinOrderingObserver fancyPinOrderingObserver) {
        AnonymousClass005.A0x(obj, fancyPinRetirementPresenter, fancyPinOrderingObserver);
        checkMainThread("attachOverlayObservers");
        Object obj2 = this.overlayObserverOwner;
        if (obj2 != null && obj2 != obj) {
            throw C3cG.A0Q("FancyPinViewRegistry supports one attached overlay");
        }
        this.overlayObserverOwner = obj;
        this.retirementPresenter = fancyPinRetirementPresenter;
        this.orderingObserver = fancyPinOrderingObserver;
    }

    public final Integer effectiveRankForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        SparseIntArray sparseIntArray;
        int iA02;
        FancyPinSlotRows fancyPinSlotRowsRowsForSlot = rowsForSlot(i);
        if (fancyPinSlotRowsRowsForSlot == null || (sparseIntArray = fancyPinSlotRowsRowsForSlot.effectiveRanks) == null || (iA02 = BV6.A02(sparseIntArray.indexOfKey(i))) < 0) {
            return null;
        }
        return Integer.valueOf(sparseIntArray.valueAt(iA02));
    }

    public final FancyPinErasedPartRegistration partRegistration$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        Map<String, FancyPinErasedPartRegistration> map = this.partRegistrations.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final <Configuration extends FancyPinPartConfiguration, PartView extends View & FancyPinPartView<Configuration>> void register(String str, String str2, FancyPinPartRegistration<Configuration, PartView> fancyPinPartRegistration) {
        long jLongValue;
        AnonymousClass005.A0x(str, str2, fancyPinPartRegistration);
        checkMainThread("register");
        HashMap<String, Map<String, FancyPinErasedPartRegistration>> map = this.partRegistrations;
        Map<String, FancyPinErasedPartRegistration> mapA0u = map.get(str);
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            map.put(str, mapA0u);
        }
        if (mapA0u.put(str2, fancyPinPartRegistration.erasedRegistration) != null) {
            Log.w(TAG, FGI.A0h("FancyPins: Overwriting registration for blueprint '", str, "', part '", str2, "'"));
        }
        Number numberA0j = BV6.A0j(str, this.registrationRevisions);
        if (numberA0j != null) {
            jLongValue = numberA0j.longValue();
            if (jLongValue == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                throw C3cG.A0Q("FancyPin registration revision overflow");
            }
        } else {
            jLongValue = 0;
        }
        this.registrationRevisions.put(str, Long.valueOf(jLongValue + 1));
    }

    public final FancyPinPresentation typedPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(int i) {
        FancyPinPresentation fancyPinPresentationPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin = presentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(i);
        if (fancyPinPresentationPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin != null) {
            if (fancyPinPresentationPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin.registrationRevision == C60P.A01(BV6.A0j(fancyPinPresentationPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin.blueprint.id, this.registrationRevisions))) {
                return fancyPinPresentationPresentationForSlot$xplat_maps_sdk_packages_fancypins_fancypins_kotlin;
            }
        }
        return null;
    }

    public final void updateActiveVariant$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinSlotResolver fancyPinSlotResolver, String str, String str2) {
        SparseArray<FancyPinPresentation> sparseArray;
        FancyPinPresentation fancyPinPresentation;
        AnonymousClass005.A0x(fancyPinSlotResolver, str, str2);
        checkMainThread("updateActiveVariant");
        int iSlotForPinId = fancyPinSlotResolver.slotForPinId(str);
        if (iSlotForPinId < 0) {
            throw C60Q.A0V("FancyPin '", str, "' has no allocated engine slot");
        }
        FancyPinSlotRows fancyPinSlotRowsRowsForSlot = rowsForSlot(iSlotForPinId);
        if (fancyPinSlotRowsRowsForSlot == null || (sparseArray = fancyPinSlotRowsRowsForSlot.presentations) == null || (fancyPinPresentation = sparseArray.get(iSlotForPinId)) == null) {
            throw C60Q.A0V("FancyPin '", str, "' has no registered presentation");
        }
        if (!str.equals(fancyPinPresentation.pin.id)) {
            throw C60O.A0i(FGI.A0V("FancyPin '", str, "' does not own engine slot ", iSlotForPinId));
        }
        if (!fancyPinPresentation.blueprint.variantIds.contains(str2)) {
            throw FGI.A01("FancyPin '", str, "' requests unknown variant '", str2, "'");
        }
        FancyPinViewRegistryKt.validatePresentationLayout(fancyPinPresentation.blueprint, str2, fancyPinPresentation.layout, new FancyPinViewRegistry$updateActiveVariant$4(this, fancyPinPresentation));
        this.presentationEpoch.advance(new FancyPinViewRegistry$updateActiveVariant$5(fancyPinPresentation, str2, fancyPinSlotRowsRowsForSlot, iSlotForPinId));
    }

    public final void updateRank$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinSlotResolver fancyPinSlotResolver, String str, int i) {
        SparseArray<FancyPinPresentation> sparseArray;
        FancyPinPresentation fancyPinPresentation;
        AnonymousClass003.A0u(fancyPinSlotResolver, str);
        checkMainThread("updateRank");
        int iSlotForPinId = fancyPinSlotResolver.slotForPinId(str);
        if (iSlotForPinId < 0) {
            throw C60Q.A0V("FancyPin '", str, "' has no allocated engine slot");
        }
        FancyPinSlotRows fancyPinSlotRowsRowsForSlot = rowsForSlot(iSlotForPinId);
        if (fancyPinSlotRowsRowsForSlot == null || (sparseArray = fancyPinSlotRowsRowsForSlot.presentations) == null || (fancyPinPresentation = sparseArray.get(iSlotForPinId)) == null) {
            throw C60Q.A0V("FancyPin '", str, "' has no registered presentation");
        }
        if (!str.equals(fancyPinPresentation.pin.id)) {
            throw C60O.A0i(FGI.A0V("FancyPin '", str, "' does not own engine slot ", iSlotForPinId));
        }
        this.presentationEpoch.advance(new FancyPinViewRegistry$updateRank$3(fancyPinSlotRowsRowsForSlot, iSlotForPinId, i));
        FancyPinOrderingObserver fancyPinOrderingObserver = this.orderingObserver;
        if (fancyPinOrderingObserver != null) {
            fancyPinOrderingObserver.onOrderingChanged();
        }
    }

    public final void updateZOrder$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinSlotResolver fancyPinSlotResolver, String str, Float f) {
        SparseArray<FancyPinPresentation> sparseArray;
        FancyPinPresentation fancyPinPresentation;
        AnonymousClass003.A0u(fancyPinSlotResolver, str);
        checkMainThread("updateZOrder");
        if (f != null && Math.abs(f.floatValue()) > Float.MAX_VALUE) {
            throw C60O.A0i("FancyPin z-order must be finite");
        }
        int iSlotForPinId = fancyPinSlotResolver.slotForPinId(str);
        if (iSlotForPinId < 0) {
            throw C60Q.A0V("FancyPin '", str, "' has no allocated engine slot");
        }
        FancyPinSlotRows fancyPinSlotRowsRowsForSlot = rowsForSlot(iSlotForPinId);
        if (fancyPinSlotRowsRowsForSlot == null || (sparseArray = fancyPinSlotRowsRowsForSlot.presentations) == null || (fancyPinPresentation = sparseArray.get(iSlotForPinId)) == null) {
            throw C60Q.A0V("FancyPin '", str, "' has no registered presentation");
        }
        if (!str.equals(fancyPinPresentation.pin.id)) {
            throw C60O.A0i(FGI.A0V("FancyPin '", str, "' does not own engine slot ", iSlotForPinId));
        }
        SparseArray<Float> sparseArray2 = fancyPinSlotRowsRowsForSlot.zOrderOverrides;
        if (f == null) {
            sparseArray2.remove(iSlotForPinId);
        } else {
            sparseArray2.put(iSlotForPinId, f);
        }
        FancyPinOrderingObserver fancyPinOrderingObserver = this.orderingObserver;
        if (fancyPinOrderingObserver != null) {
            fancyPinOrderingObserver.onOrderingChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0250 A[PHI: r1
  0x0250: PHI (r1v33 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>) = 
  (r1v29 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
  (r1v35 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
 binds: [B:128:0x02b0, B:111:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b3 A[PHI: r1
  0x02b3: PHI (r1v30 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>) = 
  (r1v29 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
  (r1v33 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
  (r1v33 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
 binds: [B:128:0x02b0, B:115:0x0268, B:117:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<com.meta.maps.fancypins.FancyPinRetirement> replacePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(com.meta.maps.fancypins.FancyPinSlotResolver r43, java.util.List<com.meta.maps.fancypins.FancyPin> r44, java.util.List<com.meta.maps.fancypins.FancyPinBlueprint> r45, java.util.List<com.meta.maps.fancypins.PinLayout> r46, java.util.List<com.meta.maps.fancypins.FancyPinFrameState> r47, java.util.Map<java.lang.String, java.lang.Long> r48, java.util.List<com.meta.maps.fancypins.FancyPinRetirement> r49, java.util.Set<java.lang.String> r50, java.util.Set<java.lang.String> r51, java.util.Map<java.lang.String, java.lang.Float> r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinViewRegistry.replacePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(com.meta.maps.fancypins.FancyPinSlotResolver, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.List, java.util.Set, java.util.Set, java.util.Map, boolean):java.util.Set");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x026d A[PHI: r3
  0x026d: PHI (r3v11 java.util.Map<java.lang.String, ? extends java.lang.Object>) = 
  (r3v6 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v12 java.util.Map<java.lang.String, ? extends java.lang.Object>)
 binds: [B:106:0x026b, B:104:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028f A[PHI: r2 r3
  0x028f: PHI (r2v15 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>) = 
  (r2v12 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
  (r2v17 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
 binds: [B:133:0x02ea, B:116:0x028d] A[DONT_GENERATE, DONT_INLINE]
  0x028f: PHI (r3v10 java.util.Map<java.lang.String, ? extends java.lang.Object>) = 
  (r3v7 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v11 java.util.Map<java.lang.String, ? extends java.lang.Object>)
 binds: [B:133:0x02ea, B:116:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e6 A[PHI: r3
  0x02e6: PHI (r3v7 java.util.Map<java.lang.String, ? extends java.lang.Object>) = 
  (r3v6 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v11 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v11 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v11 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v11 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v11 java.util.Map<java.lang.String, ? extends java.lang.Object>)
 binds: [B:106:0x026b, B:108:0x0277, B:110:0x027b, B:112:0x0281, B:114:0x0289, B:116:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ed A[PHI: r2 r3
  0x02ed: PHI (r2v13 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>) = 
  (r2v12 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
  (r2v15 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
  (r2v15 X.F0C<java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinErasedPartConfiguration>>>)
 binds: [B:133:0x02ea, B:120:0x02a5, B:122:0x02ab] A[DONT_GENERATE, DONT_INLINE]
  0x02ed: PHI (r3v8 java.util.Map<java.lang.String, ? extends java.lang.Object>) = 
  (r3v7 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v10 java.util.Map<java.lang.String, ? extends java.lang.Object>)
  (r3v10 java.util.Map<java.lang.String, ? extends java.lang.Object>)
 binds: [B:133:0x02ea, B:120:0x02a5, B:122:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void replaceRuntimePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(com.meta.maps.fancypins.FancyPinSlotResolver r36, java.util.List<com.meta.maps.fancypins.FancyPin> r37, java.util.List<com.meta.maps.fancypins.FancyPinBlueprint> r38, java.util.List<com.meta.maps.fancypins.PinLayout> r39, java.util.List<com.meta.maps.fancypins.FancyPinFrameState> r40, java.util.Map<java.lang.String, com.meta.maps.fancypins.FancyPinRuntimeClusterContext> r41, java.util.Map<java.lang.String, java.lang.Long> r42, java.util.Set<java.lang.String> r43) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinViewRegistry.replaceRuntimePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(com.meta.maps.fancypins.FancyPinSlotResolver, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map, java.util.Set):void");
    }
}

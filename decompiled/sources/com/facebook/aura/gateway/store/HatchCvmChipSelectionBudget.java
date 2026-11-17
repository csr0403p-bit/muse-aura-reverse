package com.facebook.aura.gateway.store;

import X.AIW;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BzK;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60Q;
import X.C7384Etj;
import X.C8j3;
import X.C9hr;
import X.C9jH;
import X.C9sU;
import X.CFK;
import X.F0C;
import X.FGI;
import X.G0V;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class HatchCvmChipSelectionBudget {
    public static final int CHIPS_PER_WEEK = 10;
    public static final String COLD_PROVISIONING_BUCKET = "cold_provisioning";
    public static final int DRAW_COUNT = 2;
    public static final String HARD_REPLACEMENT_BUCKET_PREFIX = "hard_replacement:";
    public static final HatchCvmChipSelectionBudget INSTANCE = new HatchCvmChipSelectionBudget();
    public static final String KEY_RECORD = "record_v2";
    public static final String LEGACY_KEY_RECORD = "record";
    public static final String TAG = "HatchCvmChipSelectionBudget";
    public static final long WINDOW_MS = 604800000;

    public final synchronized boolean isSpent(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, String str) {
        AnonymousClass003.A0u(hatchCvmChipPinPurpose, str);
        return spentCount(hatchCvmChipPinPurpose, str) >= 10;
    }

    public final synchronized int spentCount(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, String str) {
        List<HatchCvmDrawnChip> list;
        AnonymousClass003.A0u(hatchCvmChipPinPurpose, str);
        list = read(System.currentTimeMillis()).byBucket.get(bucket(hatchCvmChipPinPurpose, str));
        if (list == null) {
            list = C0881AGi.A00;
        }
        return list.size();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchCvmChipBudgetSpentPolicy.values().length];
            try {
                AnonymousClass005.A0v(HatchCvmChipBudgetSpentPolicy.STOP, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchCvmChipBudgetSpentPolicy.RESEND, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCvmChipBudgetSpentPolicy.DRAW, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchCvmChipPinPurpose.values().length];
            try {
                AnonymousClass005.A0v(HatchCvmChipPinPurpose.PROVISIONING, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchCvmChipPinPurpose.HARD_REPLACEMENT, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final List<String> newestFirst(List<HatchCvmDrawnChip> list) {
        List listA0c = AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.gateway.store.HatchCvmChipSelectionBudget$newestFirst$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((HatchCvmDrawnChip) t2).at).compareTo(Long.valueOf(((HatchCvmDrawnChip) t).at));
            }
        });
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
        Iterator it = listA0c.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((HatchCvmDrawnChip) it.next()).chipId);
        }
        return arrayListA0i;
    }

    private final C4oT prefs() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.CVM_CHIP_SELECTION_BUDGET);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.9jH] */
    private final HatchCvmChipSelectionBudgetRecord read(long j) {
        ?? A0j;
        String string = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.CVM_CHIP_SELECTION_BUDGET).getString(KEY_RECORD, null);
        if (string == null) {
            A0j = C9jH.A00;
        } else {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                F0C<C9hr<Object>>[] f0cArr = HatchCvmChipSelectionBudgetRecord.$childSerializers;
                Map<String, List<HatchCvmDrawnChip>> map = ((HatchCvmChipSelectionBudgetRecord) c9sU.A00(string, HatchCvmChipSelectionBudgetRecord$$serializer.INSTANCE)).byBucket;
                LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    linkedHashMapA0I.put(entryA0l.getKey(), INSTANCE.unexpired((List) entryA0l.getValue(), j));
                }
                A0j = C3cG.A0j();
                Iterator itA0i = C3cG.A0i(linkedHashMapA0I);
                while (itA0i.hasNext()) {
                    Map.Entry entryA0l2 = C3cH.A0l(itA0i);
                    if (!((List) entryA0l2.getValue()).isEmpty()) {
                        AnonymousClass006.A1R(A0j, entryA0l2);
                    }
                }
            } catch (Exception e) {
                CFK.A0K(TAG, e, "Could not read the chip-selection budget; starting fresh");
                return new HatchCvmChipSelectionBudgetRecord(C9jH.A00);
            }
        }
        return new HatchCvmChipSelectionBudgetRecord(A0j);
    }

    private final void write(HatchCvmChipSelectionBudgetRecord hatchCvmChipSelectionBudgetRecord) {
        try {
            BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.CVM_CHIP_SELECTION_BUDGET).A9q();
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = HatchCvmChipSelectionBudgetRecord.$childSerializers;
            bzKA9q.AYr(KEY_RECORD, c9sU.A02(hatchCvmChipSelectionBudgetRecord, HatchCvmChipSelectionBudgetRecord$$serializer.INSTANCE));
            bzKA9q.Aae(LEGACY_KEY_RECORD);
            if (bzKA9q.A0B(0)) {
                return;
            }
            CFK.A06(TAG, "Could not persist the chip-selection budget");
        } catch (Exception e) {
            CFK.A0K(TAG, e, "Could not persist the chip-selection budget");
        }
    }

    public final synchronized HatchCvmChipDraw consume(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, String str, HatchCvmChipBudgetSpentPolicy hatchCvmChipBudgetSpentPolicy, G0V<? super Integer, ? super Set<String>, ? extends List<String>> g0v) {
        int iMin;
        HatchCvmChipDraw hatchCvmChipDraw;
        boolean zA1a = AnonymousClass002.A1a(hatchCvmChipPinPurpose, str);
        AnonymousClass002.A1B(hatchCvmChipBudgetSpentPolicy, 2, g0v);
        long jCurrentTimeMillis = System.currentTimeMillis();
        HatchCvmChipSelectionBudgetRecord hatchCvmChipSelectionBudgetRecord = read(jCurrentTimeMillis);
        String strBucket = bucket(hatchCvmChipPinPurpose, str);
        List<HatchCvmDrawnChip> list = hatchCvmChipSelectionBudgetRecord.byBucket.get(strBucket);
        if (list == null) {
            list = C0881AGi.A00;
        }
        int size = 10 - list.size();
        if (size <= 0) {
            CFK.A0H(TAG, "CVM chip selection budget spent (%s): %d of %d weekly chips drawn (%s, vm=%s)", hatchCvmChipBudgetSpentPolicy, C60Q.A0W(list), 10, hatchCvmChipPinPurpose.getLogValue(), HatcheryVMIdUtilsKt.vmIdForLog(str));
            int iOrdinal = hatchCvmChipBudgetSpentPolicy.ordinal();
            if (iOrdinal == 0) {
                write(hatchCvmChipSelectionBudgetRecord);
                return null;
            }
            if (iOrdinal == zA1a) {
                write(hatchCvmChipSelectionBudgetRecord);
                hatchCvmChipDraw = new HatchCvmChipDraw(newestFirst(list), 0, list.size(), false);
                return hatchCvmChipDraw;
            }
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            iMin = 2;
        } else {
            iMin = Math.min(2, size);
        }
        Integer numValueOf = Integer.valueOf(iMin);
        HashSet hashSet = new HashSet();
        Iterator<HatchCvmDrawnChip> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().chipId);
        }
        List<String> listInvoke = g0v.invoke(numValueOf, hashSet);
        Map<String, List<HatchCvmDrawnChip>> map = hatchCvmChipSelectionBudgetRecord.byBucket;
        ArrayList arrayListA0m = AnonymousClass002.A0m(listInvoke);
        Iterator<String> it2 = listInvoke.iterator();
        while (it2.hasNext()) {
            arrayListA0m.add(new HatchCvmDrawnChip(AnonymousClass005.A0j(it2), jCurrentTimeMillis));
        }
        Map mapA11 = AnonymousClass006.A11(strBucket, AbstractC0878AGe.A0P(arrayListA0m, list), map);
        C7384Etj.A0Y(mapA11, 0);
        write(new HatchCvmChipSelectionBudgetRecord(mapA11));
        CFK.A0G(TAG, "CVM chip selection drew %d chips: %d of %d weekly chips drawn (%s, vm=%s)", C60Q.A0W(listInvoke), Integer.valueOf(C8j3.A0L(listInvoke, list.size())), 10, hatchCvmChipPinPurpose.getLogValue(), HatcheryVMIdUtilsKt.vmIdForLog(str));
        hatchCvmChipDraw = new HatchCvmChipDraw(AbstractC0878AGe.A0P(newestFirst(list), listInvoke), listInvoke.size(), C8j3.A0L(listInvoke, list.size()), size <= 0);
        return hatchCvmChipDraw;
    }

    private final String bucket(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, String str) {
        int iOrdinal = hatchCvmChipPinPurpose.ordinal();
        if (iOrdinal == 0) {
            return COLD_PROVISIONING_BUCKET;
        }
        if (iOrdinal == 1) {
            return FGI.A0M(HARD_REPLACEMENT_BUCKET_PREFIX, str);
        }
        throw C3cG.A0q();
    }

    private final List<HatchCvmDrawnChip> unexpired(List<HatchCvmDrawnChip> list, long j) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchCvmDrawnChip hatchCvmDrawnChip : list) {
            long jMin = Math.min(hatchCvmDrawnChip.at, j);
            String str = hatchCvmDrawnChip.chipId;
            C7384Etj.A0Y(str, 0);
            arrayListA0i.add(new HatchCvmDrawnChip(str, jMin));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : arrayListA0i) {
            if (j - ((HatchCvmDrawnChip) obj).at < WINDOW_MS) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }
}

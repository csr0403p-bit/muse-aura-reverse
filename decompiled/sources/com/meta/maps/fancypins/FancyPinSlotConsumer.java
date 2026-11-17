package com.meta.maps.fancypins;

import X.A3q;
import X.AbstractC7609F5w;
import X.C0881AGi;
import X.C3cG;
import X.C8j3;
import X.C9jH;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public interface FancyPinSlotConsumer {

    /* renamed from: com.meta.maps.fancypins.FancyPinSlotConsumer$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$clearAnimatedAppearances(FancyPinSlotConsumer fancyPinSlotConsumer) {
        }

        public static /* synthetic */ void access$clearAnimatedAppearances$jd(FancyPinSlotConsumer fancyPinSlotConsumer) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.meta.maps.fancypins.FancyPinSlotConsumer] */
        public static /* synthetic */ Set replacePresentation$default(FancyPinSlotConsumer fancyPinSlotConsumer, FancyPinSlotResolver fancyPinSlotResolver, List list, List list2, List list3, List list4, Map map, List list5, Set set, Set set2, Map map2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: replacePresentation");
            }
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
            return fancyPinSlotConsumer.replacePresentation(fancyPinSlotResolver, list, list2, list3, list4, map, list5, set, set2, map2, C3cG.A1K(i & 1024, z));
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static void clearAnimatedAppearances(FancyPinSlotConsumer fancyPinSlotConsumer) {
        }
    }

    void clearAnimatedAppearances();

    void clearRetirements();

    void invalidatePresentation();

    Set<FancyPinRetirement> replacePresentation(FancyPinSlotResolver fancyPinSlotResolver, List<FancyPin> list, List<FancyPinBlueprint> list2, List<PinLayout> list3, List<FancyPinFrameState> list4, Map<String, Long> map, List<FancyPinRetirement> list5, Set<String> set, Set<String> set2, Map<String, Float> map2, boolean z);

    void updateActiveVariant(FancyPinSlotResolver fancyPinSlotResolver, String str, String str2);

    void updateRank(FancyPinSlotResolver fancyPinSlotResolver, String str, int i);

    void updateZOrder(FancyPinSlotResolver fancyPinSlotResolver, String str, Float f);
}

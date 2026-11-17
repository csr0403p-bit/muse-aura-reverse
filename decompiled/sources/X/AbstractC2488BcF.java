package X;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.BcF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2488BcF {
    public static final AbstractC2531BdI<Long> A00 = AbstractC2531BdI.A00(Long.TYPE, "camera2.streamSpec.streamUseCase");
    public static final Map<Long, Set<EnumC2489BcG>> A01;
    public static final Map<Long, Set<EnumC2489BcG>> A02;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/Integer;LX/Bc7;>;Ljava/util/Map<Ljava/lang/Integer;LX/BfN<*>;>;Ljava/util/List<LX/Bb3;>;)Z */
    public static boolean A05(List list, Map map, Map map2) {
        EnumC2489BcG enumC2489BcGADT;
        List<EnumC2489BcG> list2;
        for (int i = 0; i < list.size(); i++) {
            long j = ((C2410BaQ) ((Bb3) list.get(i))).A00;
            Integer numValueOf = Integer.valueOf(i);
            if (map.containsKey(numValueOf)) {
                AbstractC2480Bc7 abstractC2480Bc7 = (AbstractC2480Bc7) map.get(numValueOf);
                enumC2489BcGADT = ((C2487BcE) abstractC2480Bc7).A06.size() == 1 ? ((C2487BcE) abstractC2480Bc7).A06.get(0) : EnumC2489BcG.STREAM_SHARING;
                list2 = ((C2487BcE) abstractC2480Bc7).A06;
            } else {
                if (!map2.containsKey(numValueOf)) {
                    throw BV4.A0N("SurfaceConfig does not map to any use case");
                }
                BfN bfN = (BfN) BV5.A0f(map2, i);
                enumC2489BcGADT = bfN.ADT();
                list2 = bfN.ADT() == EnumC2489BcG.STREAM_SHARING ? (List) ((Bep) bfN).A00.Abk(Bep.A01) : Collections.EMPTY_LIST;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (enumC2489BcGADT == EnumC2489BcG.STREAM_SHARING) {
                    Map<Long, Set<EnumC2489BcG>> map3 = A02;
                    Long lValueOf = Long.valueOf(j);
                    if (map3.containsKey(lValueOf)) {
                        Set setA10 = BV4.A10(lValueOf, map3);
                        if (list2.size() == setA10.size()) {
                            Iterator<EnumC2489BcG> it = list2.iterator();
                            while (it.hasNext()) {
                                if (!setA10.contains(it.next())) {
                                }
                            }
                        }
                    }
                } else {
                    Map<Long, Set<EnumC2489BcG>> map4 = A01;
                    Long lValueOf2 = Long.valueOf(j);
                    if (map4.containsKey(lValueOf2) && BV4.A10(lValueOf2, map4).contains(enumC2489BcGADT)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    static {
        HashMap mapA0u = BV4.A0u();
        A01 = mapA0u;
        HashMap mapA0u2 = BV4.A0u();
        A02 = mapA0u2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSetA13 = C60O.A13();
            EnumC2489BcG enumC2489BcG = EnumC2489BcG.PREVIEW;
            hashSetA13.add(enumC2489BcG);
            EnumC2489BcG enumC2489BcG2 = EnumC2489BcG.METERING_REPEATING;
            hashSetA13.add(enumC2489BcG2);
            mapA0u.put(4L, hashSetA13);
            HashSet hashSetA132 = C60O.A13();
            hashSetA132.add(enumC2489BcG);
            hashSetA132.add(enumC2489BcG2);
            hashSetA132.add(EnumC2489BcG.IMAGE_ANALYSIS);
            mapA0u.put(1L, hashSetA132);
            HashSet hashSetA133 = C60O.A13();
            EnumC2489BcG enumC2489BcG3 = EnumC2489BcG.IMAGE_CAPTURE;
            hashSetA133.add(enumC2489BcG3);
            mapA0u.put(2L, hashSetA133);
            HashSet hashSetA134 = C60O.A13();
            EnumC2489BcG enumC2489BcG4 = EnumC2489BcG.VIDEO_CAPTURE;
            hashSetA134.add(enumC2489BcG4);
            mapA0u.put(3L, hashSetA134);
            HashSet hashSetA135 = C60O.A13();
            hashSetA135.add(enumC2489BcG);
            hashSetA135.add(enumC2489BcG3);
            hashSetA135.add(enumC2489BcG4);
            mapA0u2.put(4L, hashSetA135);
            HashSet hashSetA136 = C60O.A13();
            hashSetA136.add(enumC2489BcG);
            hashSetA136.add(enumC2489BcG4);
            mapA0u2.put(3L, hashSetA136);
        }
    }

    public static BgY A00(InterfaceC2585Beh interfaceC2585Beh, long j) {
        AbstractC2531BdI<Long> abstractC2531BdI = A00;
        if (interfaceC2585Beh.A74(abstractC2531BdI) && C3cG.A05(interfaceC2585Beh.Abk(abstractC2531BdI)) == j) {
            return null;
        }
        C2582Bee c2582BeeA01 = C2582Bee.A01(interfaceC2585Beh);
        c2582BeeA01.ANl(abstractC2531BdI, Long.valueOf(j));
        return new BgY(c2582BeeA01);
    }

    public static boolean A01(C2476Bc3 c2476Bc3) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) c2476Bc3.A02(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static boolean A02(C2476Bc3 c2476Bc3, List<Bb3> list) {
        long[] jArr;
        int length;
        if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) c2476Bc3.A02(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && (length = jArr.length) != 0) {
            HashSet hashSetA13 = C60O.A13();
            int i = 0;
            do {
                BV6.A1R(hashSetA13, jArr[i]);
                i++;
            } while (i < length);
            Iterator<Bb3> it = list.iterator();
            while (it.hasNext()) {
                if (!hashSetA13.contains(Long.valueOf(((C2410BaQ) it.next()).A00))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(X.C2476Bc3 r13, java.util.List<X.AbstractC2480Bc7> r14, java.util.Map<X.BfN<?>, X.AbstractC2481Bc8> r15, java.util.Map<X.AbstractC2480Bc7, X.AbstractC2481Bc8> r16) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2488BcF.A03(X.Bc3, java.util.List, java.util.Map, java.util.Map):boolean");
    }

    public static boolean A04(InterfaceC2585Beh interfaceC2585Beh, EnumC2489BcG enumC2489BcG) {
        if (AnonymousClass001.A1X(interfaceC2585Beh.Abl(BfN.A0A, false))) {
            return false;
        }
        AbstractC2531BdI<Integer> abstractC2531BdI = Bf6.A05;
        if (interfaceC2585Beh.A74(abstractC2531BdI)) {
            return enumC2489BcG.ordinal() == 0 && AnonymousClass001.A0F(interfaceC2585Beh.Abk(abstractC2531BdI)) == 2;
        }
        return false;
    }
}

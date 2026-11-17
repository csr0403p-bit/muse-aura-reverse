package X;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.BcV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2500BcV {
    public final C2476Bc3 A00;
    public final C2503BcZ A01;
    public final boolean A02;

    public static C2507Bcd A00(C2507Bcd c2507Bcd, Collection<C2507Bcd> collection, Set<C2507Bcd> set) {
        if (c2507Bcd.A01 != 1) {
            for (C2507Bcd c2507Bcd2 : collection) {
                BeS.A03(c2507Bcd2, "Fully specified DynamicRange cannot be null.");
                int i = c2507Bcd2.A01;
                BeS.A07(c2507Bcd2.A01(), "Fully specified DynamicRange must have fully defined encoding.");
                if (i != 1) {
                    if (!set.contains(c2507Bcd2)) {
                        AbstractC2875Bni.A01("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c2507Bcd, c2507Bcd2));
                    } else if (A02(c2507Bcd, c2507Bcd2)) {
                        return c2507Bcd2;
                    }
                }
            }
        }
        return null;
    }

    public C2500BcV(C2476Bc3 c2476Bc3) {
        this.A00 = c2476Bc3;
        this.A01 = C2503BcZ.A01(c2476Bc3);
        int[] iArr = (int[]) c2476Bc3.A02(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.A02 = z;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<LX/Bcd;>;LX/Bcd;LX/BcZ;)V */
    public static void A01(C2503BcZ c2503BcZ, C2507Bcd c2507Bcd, Set set) {
        BeS.A07(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<C2507Bcd> setAF0 = c2503BcZ.A00.AF0(c2507Bcd);
        if (setAF0.isEmpty()) {
            return;
        }
        HashSet hashSetA0x = BV4.A0x(set);
        set.retainAll(setAF0);
        if (set.isEmpty()) {
            throw BV5.A0T("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", new Object[]{c2507Bcd, TextUtils.join("\n  ", setAF0), TextUtils.join("\n  ", hashSetA0x)});
        }
    }

    public static boolean A02(C2507Bcd c2507Bcd, C2507Bcd c2507Bcd2) {
        BeS.A07(c2507Bcd2.A01(), "Fully specified range is not actually fully specified.");
        int i = c2507Bcd.A01;
        if ((i == 2 && c2507Bcd2.A01 == 1) || (i != 2 && i != 0 && i != c2507Bcd2.A01)) {
            return false;
        }
        int i2 = c2507Bcd.A00;
        return i2 == 0 || i2 == c2507Bcd2.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<X.BfN<?>, X.C2507Bcd> A03(java.util.List<X.AbstractC2480Bc7> r19, java.util.List<X.BfN<?>> r20, java.util.List<java.lang.Integer> r21) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2500BcV.A03(java.util.List, java.util.List, java.util.List):java.util.HashMap");
    }
}

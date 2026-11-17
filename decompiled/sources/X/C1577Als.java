package X;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.Als, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1577Als {
    public long A00;
    public AWx A01;
    public boolean A02;
    public boolean A03;
    public final SparseLongArray A07 = new SparseLongArray();
    public final SparseBooleanArray A06 = new SparseBooleanArray();
    public final List<C1313Agy> A09 = C3cG.A0h();
    public final C1685AoO<C1595AmN> A08 = new C1685AoO<>(10);
    public int A05 = -1;
    public int A04 = -1;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C1313Agy A00(android.view.MotionEvent r39, X.AWx r40, X.InterfaceC1349Aha r41, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577Als.A00(android.view.MotionEvent, X.AWx, X.Aha, int, boolean):X.Agy");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[PHI: r7 r8
  0x00fa: PHI (r7v0 boolean) = (r7v2 boolean), (r7v3 boolean) binds: [B:19:0x003a, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00fa: PHI (r8v1 boolean) = (r8v3 boolean), (r8v4 boolean) binds: [B:19:0x003a, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1320Ah6 A04(android.view.MotionEvent r18, X.InterfaceC1349Aha r19) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577Als.A04(android.view.MotionEvent, X.Aha):X.Ah6");
    }

    public static final void A01(MotionEvent motionEvent, C1577Als c1577Als) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                SparseLongArray sparseLongArray = c1577Als.A07;
                if (sparseLongArray.indexOfKey(pointerId) < 0) {
                    long j = c1577Als.A00;
                    c1577Als.A00 = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        SparseLongArray sparseLongArray2 = c1577Als.A07;
        if (sparseLongArray2.indexOfKey(pointerId2) < 0) {
            long j2 = c1577Als.A00;
            c1577Als.A00 = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                c1577Als.A06.put(pointerId2, true);
            }
        }
    }

    public static final void A02(MotionEvent motionEvent, C1577Als c1577Als) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType == c1577Als.A05 && source == c1577Als.A04) {
                return;
            }
            c1577Als.A05 = toolType;
            c1577Als.A04 = source;
            c1577Als.A06.clear();
            c1577Als.A07.clear();
        }
    }

    public static final void A03(MotionEvent motionEvent, C1577Als c1577Als) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            SparseBooleanArray sparseBooleanArray = c1577Als.A06;
            if (!sparseBooleanArray.get(pointerId, false)) {
                c1577Als.A07.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        SparseLongArray sparseLongArray = c1577Als.A07;
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        c1577Als.A06.delete(iKeyAt);
                        break;
                    }
                    i = motionEvent.getPointerId(i) != iKeyAt ? i + 1 : 0;
                }
            }
        }
    }
}

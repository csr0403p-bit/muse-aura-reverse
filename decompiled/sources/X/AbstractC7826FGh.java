package X;

import android.view.View;

/* renamed from: X.FGh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7826FGh {
    public static final int A00(long j) {
        int i;
        AbstractC7829FGk abstractC7829FGkA01 = AbstractC7829FGk.A01((int) j);
        int iA04 = abstractC7829FGkA01.A04(j);
        int iA02 = abstractC7829FGkA01.A02(j);
        if (iA04 == iA02) {
            i = 1073741824;
        } else {
            i = Integer.MIN_VALUE;
            if (iA02 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(iA02, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(long r12, long r14, long r16) {
        /*
            r3 = r16
            r17 = 1
            r5 = r14
            r1 = r12
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L97
            r11 = 32
            long r7 = r12 >>> r11
            int r0 = (int) r7
            X.FGk r0 = X.AbstractC7829FGk.A01(r0)
            int r13 = r0.A03(r12)
            int r14 = r0.A05(r1)
            boolean r0 = X.AnonymousClass002.A1Q(r13, r14)
            r16 = 0
            if (r0 == 0) goto L2f
            long r7 = r3 >> r11
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            int r0 = (int) r7
            r15 = 1
            if (r13 == r0) goto L30
        L2f:
            r15 = 0
        L30:
            long r7 = r5 >>> r11
            int r0 = (int) r7
            X.FGk r7 = X.AbstractC7829FGk.A01(r0)
            int r0 = r7.A05(r5)
            if (r0 > r14) goto L44
            int r0 = r7.A03(r5)
            r10 = 1
            if (r0 >= r13) goto L45
        L44:
            r10 = 0
        L45:
            long r8 = r3 >> r11
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r11
            int r7 = (int) r8
            if (r14 > r7) goto L53
            r0 = 1
            if (r7 <= r13) goto L54
        L53:
            r0 = 0
        L54:
            if (r15 != 0) goto L5a
            if (r10 == 0) goto L9a
            if (r0 == 0) goto L9a
        L5a:
            r10 = 1
        L5b:
            int r0 = (int) r1
            X.FGk r0 = X.AbstractC7829FGk.A01(r0)
            int r8 = r0.A02(r1)
            int r9 = r0.A04(r1)
            if (r8 != r9) goto L70
            long r1 = r3 & r11
            int r0 = (int) r1
            r7 = 1
            if (r8 == r0) goto L71
        L70:
            r7 = 0
        L71:
            int r0 = (int) r5
            X.FGk r1 = X.AbstractC7829FGk.A01(r0)
            int r0 = r1.A04(r5)
            if (r0 > r9) goto L83
            int r0 = r1.A02(r5)
            r2 = 1
            if (r0 >= r8) goto L84
        L83:
            r2 = 0
        L84:
            long r3 = r3 & r11
            int r1 = (int) r3
            if (r9 > r1) goto L8b
            r0 = 1
            if (r1 <= r8) goto L8c
        L8b:
            r0 = 0
        L8c:
            if (r7 != 0) goto L92
            if (r2 == 0) goto L98
            if (r0 == 0) goto L98
        L92:
            r0 = 1
        L93:
            if (r10 == 0) goto L9c
            if (r0 == 0) goto L9c
        L97:
            return r17
        L98:
            r0 = 0
            goto L93
        L9a:
            r10 = 0
            goto L5b
        L9c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7826FGh.A02(long, long, long):boolean");
    }

    public static final int A01(long j) {
        int i;
        AbstractC7829FGk abstractC7829FGkA01 = AbstractC7829FGk.A01(BV6.A03(j));
        int iA05 = abstractC7829FGkA01.A05(j);
        int iA03 = abstractC7829FGkA01.A03(j);
        if (iA05 == iA03) {
            i = 1073741824;
        } else {
            i = Integer.MIN_VALUE;
            if (iA03 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(iA03, i);
    }
}

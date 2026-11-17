package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.Dzz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6303Dzz implements E0Q {
    public final ArrayList<E00> A00 = C3cG.A0h();

    @Override // X.E0Q
    public final void A95(long j) {
        ArrayList<E00> arrayList;
        int size = 0;
        while (true) {
            arrayList = this.A00;
            if (size >= arrayList.size()) {
                size = arrayList.size();
                break;
            } else if (j < arrayList.get(size).A02) {
                break;
            } else {
                size++;
            }
        }
        if (size != 0) {
            int i = size - 1;
            long j2 = arrayList.get(i).A01;
            if (j2 == -9223372036854775807L || j2 >= j) {
                size = i;
            }
            arrayList.subList(0, size).clear();
        }
    }

    @Override // X.E0Q
    public final ImmutableList<E0J> AEK(long j) {
        ArrayList<E00> arrayList;
        int size = 0;
        while (true) {
            arrayList = this.A00;
            if (size >= arrayList.size()) {
                size = arrayList.size();
                break;
            }
            if (j < arrayList.get(size).A02) {
                break;
            }
            size++;
        }
        if (size != 0) {
            E00 e00 = arrayList.get(size - 1);
            long j2 = e00.A01;
            if (j2 == -9223372036854775807L || j < j2) {
                return e00.A03;
            }
        }
        return ImmutableList.of();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // X.E0Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A3T(X.E00 r11, long r12) {
        /*
            r10 = this;
            long r3 = r11.A02
            r9 = 1
            r6 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1L(r0)
            X.C1G.A07(r0)
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 > 0) goto L4c
            long r0 = r11.A01
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L20
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L4c
        L20:
            r8 = 1
        L21:
            java.util.ArrayList<X.E00> r5 = r10.A00
            int r7 = r5.size()
            int r7 = r7 - r9
        L28:
            if (r7 < 0) goto L4e
            java.lang.Object r0 = r5.get(r7)
            X.E00 r0 = (X.E00) r0
            long r1 = r0.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L3c
            int r0 = r7 + 1
            r5.add(r0, r11)
            return r8
        L3c:
            java.lang.Object r0 = r5.get(r7)
            X.E00 r0 = (X.E00) r0
            long r1 = r0.A02
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 > 0) goto L49
            r8 = 0
        L49:
            int r7 = r7 + (-1)
            goto L28
        L4c:
            r8 = 0
            goto L21
        L4e:
            r5.add(r6, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6303Dzz.A3T(X.E00, long):boolean");
    }

    @Override // X.E0Q
    public final long AI1(long j) {
        long j2;
        ArrayList<E00> arrayList = this.A00;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < arrayList.get(0).A02) {
            return arrayList.get(0).A02;
        }
        int i = 1;
        while (true) {
            if (i < arrayList.size()) {
                j2 = arrayList.get(i).A02;
                if (j < j2) {
                    long j3 = arrayList.get(i - 1).A01;
                    if (j3 != -9223372036854775807L && j3 > j && j3 < j2) {
                        return j3;
                    }
                } else {
                    i++;
                }
            } else {
                j2 = ((E00) AbstractC7398Eub.A00(arrayList)).A01;
                if (j2 == -9223372036854775807L || j >= j2) {
                    return Long.MIN_VALUE;
                }
            }
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r1 <= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r8 >= r1) goto L17;
     */
    @Override // X.E0Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AIy(long r8) {
        /*
            r7 = this;
            java.util.ArrayList<X.E00> r5 = r7.A00
            boolean r0 = r5.isEmpty()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L59
            java.lang.Object r0 = X.BV6.A0m(r5)
            X.E00 r0 = (X.E00) r0
            long r1 = r0.A02
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L59
            r4 = 1
            r3 = 1
        L1b:
            int r0 = r5.size()
            if (r3 >= r0) goto L46
            java.lang.Object r0 = r5.get(r3)
            X.E00 r0 = (X.E00) r0
            long r1 = r0.A02
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L42
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L43
            int r3 = r3 - r4
            java.lang.Object r3 = r5.get(r3)
            X.E00 r3 = (X.E00) r3
            long r1 = r3.A01
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L56
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L56
        L42:
            return r1
        L43:
            int r3 = r3 + 1
            goto L1b
        L46:
            java.lang.Object r3 = X.AbstractC7398Eub.A00(r5)
            X.E00 r3 = (X.E00) r3
            long r1 = r3.A01
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L56
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L42
        L56:
            long r1 = r3.A02
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6303Dzz.AIy(long):long");
    }

    @Override // X.E0Q
    public final void clear() {
        this.A00.clear();
    }
}

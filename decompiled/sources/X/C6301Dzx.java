package X;

import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.CompoundOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseNaturalOrdering;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dzx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6301Dzx implements E0Q {
    public static final DOM<E00> A01 = new CompoundOrdering(new ByFunctionOrdering(new F5K(6), NaturalOrdering.A00), new ByFunctionOrdering(new F5K(7), ReverseNaturalOrdering.A00));
    public final List<E00> A00 = C3cG.A0h();

    @Override // X.E0Q
    public final void A95(long j) {
        int i = 0;
        while (true) {
            List<E00> list = this.A00;
            if (i >= list.size()) {
                return;
            }
            long j2 = list.get(i).A02;
            if (j > j2 && j > list.get(i).A01) {
                list.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @Override // X.E0Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A3T(X.E00 r11, long r12) {
        /*
            r10 = this;
            long r3 = r11.A02
            r8 = 0
            r9 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1L(r0)
            X.C1G.A07(r0)
            long r0 = r11.A00
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1L(r2)
            X.C1G.A07(r0)
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 > 0) goto L28
            long r0 = r11.A01
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r7 = 1
            if (r2 < 0) goto L29
        L28:
            r7 = 0
        L29:
            java.util.List<X.E00> r6 = r10.A00
            int r5 = r6.size()
            int r5 = r5 - r9
        L30:
            if (r5 < 0) goto L47
            java.lang.Object r0 = r6.get(r5)
            X.E00 r0 = (X.E00) r0
            long r1 = r0.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L44
            int r0 = r5 + 1
            r6.add(r0, r11)
            return r7
        L44:
            int r5 = r5 + (-1)
            goto L30
        L47:
            r6.add(r8, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6301Dzx.A3T(X.E00, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.E0Q
    public final ImmutableList<E0J> AEK(long j) {
        List<E00> list = this.A00;
        if (!list.isEmpty()) {
            if (j >= list.get(0).A02) {
                ArrayList arrayListA0h = C3cG.A0h();
                for (int i = 0; i < list.size(); i++) {
                    E00 e00 = list.get(i);
                    if (j >= e00.A02 && j < e00.A01) {
                        arrayListA0h.add(e00);
                    }
                    if (j < e00.A02) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(A01, arrayListA0h);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
                    builder.addAll(((E00) immutableListSortedCopyOf.get(i2)).A03);
                }
                return builder.build();
            }
        }
        return ImmutableList.of();
    }

    @Override // X.E0Q
    public final long AIy(long j) {
        List<E00> list = this.A00;
        if (!list.isEmpty()) {
            if (j >= list.get(0).A02) {
                long jMax = list.get(0).A02;
                for (int i = 0; i < list.size(); i++) {
                    long j2 = list.get(i).A02;
                    long j3 = list.get(i).A01;
                    if (j3 <= j) {
                        jMax = Math.max(jMax, j3);
                    } else {
                        if (j2 > j) {
                            return jMax;
                        }
                        jMax = Math.max(jMax, j2);
                    }
                }
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // X.E0Q
    public final void clear() {
        this.A00.clear();
    }

    @Override // X.E0Q
    public final long AI1(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            List<E00> list = this.A00;
            if (i >= list.size()) {
                break;
            }
            long j2 = list.get(i).A02;
            long j3 = list.get(i).A01;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}

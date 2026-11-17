package com.google.common.collect;

import X.BV7;
import X.C60O;
import X.C8j3;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class GeneralRange<T> implements Serializable {
    public final Comparator<? super T> comparator;
    public final boolean hasLowerBound;
    public final boolean hasUpperBound;
    public final BoundType lowerBoundType;
    public final T lowerEndpoint;
    public final BoundType upperBoundType;
    public final T upperEndpoint;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.collect.GeneralRange<T> A00(com.google.common.collect.GeneralRange<T> r10) {
        /*
            r9 = this;
            java.util.Comparator<? super T> r1 = r9.comparator
            java.util.Comparator<? super T> r0 = r10.comparator
            boolean r0 = r1.equals(r0)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r7 = r9.hasLowerBound
            T r4 = r9.lowerEndpoint
            com.google.common.collect.BoundType r2 = r9.lowerBoundType
            if (r7 != 0) goto L5f
            boolean r7 = r10.hasLowerBound
        L15:
            T r4 = r10.lowerEndpoint
            com.google.common.collect.BoundType r2 = r10.lowerBoundType
        L19:
            boolean r8 = r9.hasUpperBound
            T r5 = r9.upperEndpoint
            com.google.common.collect.BoundType r3 = r9.upperBoundType
            if (r8 != 0) goto L48
            boolean r8 = r10.hasUpperBound
        L23:
            T r5 = r10.upperEndpoint
            com.google.common.collect.BoundType r3 = r10.upperBoundType
        L27:
            if (r7 == 0) goto L40
            if (r8 == 0) goto L40
            java.util.Comparator<? super T> r0 = r9.comparator
            int r0 = r0.compare(r4, r5)
            if (r0 > 0) goto L3b
            if (r0 != 0) goto L40
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r2 != r0) goto L40
            if (r3 != r0) goto L40
        L3b:
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
            r4 = r5
        L40:
            java.util.Comparator<? super T> r6 = r9.comparator
            com.google.common.collect.GeneralRange r1 = new com.google.common.collect.GeneralRange
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L48:
            boolean r0 = r10.hasUpperBound
            if (r0 == 0) goto L27
            java.util.Comparator<? super T> r1 = r9.comparator
            T r0 = r10.upperEndpoint
            int r0 = r1.compare(r5, r0)
            if (r0 > 0) goto L23
            if (r0 != 0) goto L27
            com.google.common.collect.BoundType r1 = r10.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L27
            goto L23
        L5f:
            boolean r0 = r10.hasLowerBound
            if (r0 == 0) goto L19
            java.util.Comparator<? super T> r1 = r9.comparator
            T r0 = r10.lowerEndpoint
            int r0 = r1.compare(r4, r0)
            if (r0 < 0) goto L15
            if (r0 != 0) goto L19
            com.google.common.collect.BoundType r1 = r10.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L19
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A00(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[PHI: r3
  0x0015: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean) binds: [B:6:0x000f, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(T r6) {
        /*
            r5 = this;
            boolean r0 = r5.hasUpperBound
            r4 = 0
            if (r0 != 0) goto L6
            return r4
        L6:
            T r1 = r5.upperEndpoint
            java.util.Comparator<? super T> r0 = r5.comparator
            int r0 = r0.compare(r6, r1)
            r3 = 1
            if (r0 > 0) goto L15
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L16
        L15:
            r2 = 0
        L16:
            com.google.common.collect.BoundType r1 = r5.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L1d
            r4 = 1
        L1d:
            r2 = r2 & r4
            r2 = r2 | r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A02(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[PHI: r3
  0x0015: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean) binds: [B:6:0x000f, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(T r6) {
        /*
            r5 = this;
            boolean r0 = r5.hasLowerBound
            r4 = 0
            if (r0 != 0) goto L6
            return r4
        L6:
            T r1 = r5.lowerEndpoint
            java.util.Comparator<? super T> r0 = r5.comparator
            int r0 = r0.compare(r6, r1)
            r3 = 1
            if (r0 < 0) goto L15
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L16
        L15:
            r2 = 0
        L16:
            com.google.common.collect.BoundType r1 = r5.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L1d
            r4 = 1
        L1d:
            r2 = r2 & r4
            r2 = r2 | r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A03(java.lang.Object):boolean");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        return this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && this.lowerBoundType.equals(generalRange.lowerBoundType) && this.upperBoundType.equals(generalRange.upperBoundType) && Objects.equal(this.lowerEndpoint, generalRange.lowerEndpoint) && Objects.equal(this.upperEndpoint, generalRange.upperEndpoint);
    }

    public final int hashCode() {
        return BV7.A0F(this.comparator, this.lowerEndpoint, this.lowerBoundType, this.upperEndpoint, this.upperBoundType);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Comparator<-TT;>;ZTT;Lcom/google/common/collect/BoundType;ZTT;Lcom/google/common/collect/BoundType;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public GeneralRange(BoundType comparator, BoundType hasLowerBound, Object lowerEndpoint, Object lowerBoundType, Comparator hasUpperBound, boolean upperEndpoint, boolean upperBoundType) {
        hasUpperBound.getClass();
        this.comparator = hasUpperBound;
        this.hasLowerBound = upperEndpoint;
        this.hasUpperBound = upperBoundType;
        this.lowerEndpoint = lowerEndpoint;
        comparator.getClass();
        this.lowerBoundType = comparator;
        this.upperEndpoint = lowerBoundType;
        hasLowerBound.getClass();
        this.upperBoundType = hasLowerBound;
        if (upperEndpoint) {
            hasUpperBound.compare(lowerEndpoint, lowerEndpoint);
        }
        if (upperBoundType) {
            hasUpperBound.compare(lowerBoundType, lowerBoundType);
        }
        if (upperEndpoint && upperBoundType) {
            int iCompare = hasUpperBound.compare(lowerEndpoint, lowerBoundType);
            boolean z = true;
            Preconditions.checkArgument(BV7.A1R(iCompare), "lowerEndpoint (%s) > upperEndpoint (%s)", lowerEndpoint, lowerBoundType);
            if (iCompare == 0) {
                BoundType boundType = BoundType.OPEN;
                if (comparator == boundType && hasLowerBound == boundType) {
                    z = false;
                }
                Preconditions.checkArgument(z);
            }
        }
    }

    public final boolean A01(T t) {
        return (A03(t) || A02(t)) ? false : true;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.comparator);
        sbA0w.append(":");
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        sbA0w.append(boundType == boundType2 ? '[' : '(');
        sbA0w.append(this.hasLowerBound ? this.lowerEndpoint : "-\u221e");
        sbA0w.append(',');
        sbA0w.append(this.hasUpperBound ? this.upperEndpoint : "\u221e");
        return C8j3.A16(sbA0w, this.upperBoundType == boundType2 ? ']' : ')');
    }
}

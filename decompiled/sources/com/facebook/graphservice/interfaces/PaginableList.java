package com.facebook.graphservice.interfaces;

import X.C5240De3;
import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public class PaginableList<T> extends C5240De3<T> {
    public final String mEndCursor;
    public final boolean mFailedLastLoadNext;
    public final boolean mFailedLastLoadPrevious;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PaginableList(java.lang.String r5, com.google.common.collect.ImmutableList<T> r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r4 = this;
            r3 = r5
            if (r5 != 0) goto L5
            java.lang.String r3 = "MISSING_PAGINATION_KEY"
        L5:
            r1 = r11
            r0 = r12
            if (r11 != 0) goto Lc
            r12 = 0
            if (r0 == 0) goto Ld
        Lc:
            r12 = 1
        Ld:
            r11 = 0
            r2 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r10 = r13
            r9 = r14
            r13 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.mFailedLastLoadPrevious = r1
            r2.mFailedLastLoadNext = r0
            r2.mEndCursor = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphservice.interfaces.PaginableList.<init>(java.lang.String, com.google.common.collect.ImmutableList, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static <E> PaginableList<E> withoutPaging(ImmutableList<E> immutableList) {
        return new PaginableList<>(null, immutableList, false, false, false, false, false, false, null, null, null);
    }

    public static <E> PaginableList<E> withoutPagingWithStatus(ImmutableList<E> immutableList, boolean z) {
        return new PaginableList<>(null, immutableList, false, false, false, z, false, false, null, null, null);
    }

    public static <E> PaginableList<E> withMetadata(ImmutableList<E> immutableList, C5240De3<?> c5240De3) {
        boolean z;
        boolean z2;
        PaginableList paginableList = c5240De3 instanceof PaginableList ? (PaginableList) c5240De3 : null;
        String str = c5240De3.paginationKey;
        boolean z3 = c5240De3.hasPreviousPage;
        boolean z4 = c5240De3.hasNextPage;
        boolean z5 = c5240De3.isLoadingPrevious;
        boolean z6 = c5240De3.isLoadingNext;
        if (paginableList != null) {
            z = paginableList.mFailedLastLoadPrevious;
            z2 = paginableList.mFailedLastLoadNext;
        } else {
            z = c5240De3.paginationLoadHadError;
            z2 = z;
        }
        PaginableList<E> paginableList2 = new PaginableList<>(str, immutableList, z3, z4, z5, z6, z, z2, c5240De3.nextPageUUID, c5240De3.previousPageUUID, paginableList != null ? paginableList.mEndCursor : null);
        if (c5240De3.isPandoBacked) {
            paginableList2.isPandoBacked = true;
        }
        return paginableList2;
    }

    public boolean failedLastLoadNext() {
        return this.mFailedLastLoadNext;
    }

    public boolean failedLastLoadPrevious() {
        return this.mFailedLastLoadPrevious;
    }

    public String getEndCursorDO_NOT_USE() {
        return this.mEndCursor;
    }

    public PaginableList<T> setIsPandoBacked(boolean z) {
        this.isPandoBacked = z;
        return this;
    }
}

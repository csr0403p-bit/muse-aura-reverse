package com.facebook.aura.ui;

import X.AWx;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class StartDrag extends C06G {
    public static final int $stable = 0;
    public final long id;
    public final AWx offset;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StartDrag) {
                StartDrag startDrag = (StartDrag) obj;
                if (this.id != startDrag.id || !C7384Etj.areEqual(this.offset, startDrag.offset)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-VJWsu2E$default, reason: not valid java name */
    public static /* synthetic */ StartDrag m2348copyVJWsu2E$default(StartDrag startDrag, long j, AWx aWx, int i, Object obj) {
        if ((i & 1) != 0) {
            j = startDrag.id;
        }
        if ((i & 2) != 0) {
            aWx = startDrag.offset;
        }
        return new StartDrag(j, aWx);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m2349component1J3iCeTQ() {
        return this.id;
    }

    /* renamed from: component2-_m7T9-E, reason: not valid java name */
    public final AWx m2350component2_m7T9E() {
        return this.offset;
    }

    /* renamed from: copy-VJWsu2E, reason: not valid java name */
    public final StartDrag m2351copyVJWsu2E(long j, AWx aWx) {
        return new StartDrag(j, aWx);
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m2352getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOffset-_m7T9-E, reason: not valid java name */
    public final AWx m2353getOffset_m7T9E() {
        return this.offset;
    }

    public int hashCode() {
        int iA02 = C3cG.A02(this.id) * 31;
        AWx aWx = this.offset;
        return iA02 + (aWx == null ? 0 : C3cG.A02(aWx.A00));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StartDrag(long j, AWx aWx, C06H c06h) {
        this(j, aWx);
    }

    public StartDrag(long j, AWx aWx) {
        this.id = j;
        this.offset = aWx;
    }

    public /* synthetic */ StartDrag(long j, AWx aWx, int i, C06H c06h) {
        this(j, (i & 2) != 0 ? null : aWx);
    }
}

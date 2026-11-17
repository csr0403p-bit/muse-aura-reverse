package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class GenericListSelection extends C06G {
    public static final int $stable = 0;
    public final boolean isPending;
    public final String requestId;
    public final int rowIndex;

    public GenericListSelection(int i, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        this.rowIndex = i;
        this.requestId = str;
        this.isPending = z;
    }

    public final GenericListSelection copy(int i, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        return new GenericListSelection(i, str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenericListSelection) {
                GenericListSelection genericListSelection = (GenericListSelection) obj;
                if (this.rowIndex != genericListSelection.rowIndex || !C7384Etj.areEqual(this.requestId, genericListSelection.requestId) || this.isPending != genericListSelection.isPending) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GenericListSelection copy$default(GenericListSelection genericListSelection, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = genericListSelection.rowIndex;
        }
        if ((i2 & 2) != 0) {
            str = genericListSelection.requestId;
        }
        if ((i2 & 4) != 0) {
            z = genericListSelection.isPending;
        }
        return genericListSelection.copy(i, str, z);
    }

    public final int component1() {
        return this.rowIndex;
    }

    public final String component2() {
        return this.requestId;
    }

    public final boolean component3() {
        return this.isPending;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.requestId, this.rowIndex * 31), this.isPending);
    }

    public final boolean isPending() {
        return this.isPending;
    }

    public String toString() {
        return super.toString();
    }
}

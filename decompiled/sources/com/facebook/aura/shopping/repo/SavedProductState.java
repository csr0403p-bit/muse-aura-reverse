package com.facebook.aura.shopping.repo;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SavedProductState extends C06G {
    public final String itemId;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SavedProductState) && C7384Etj.areEqual(this.itemId, ((SavedProductState) obj).itemId));
    }

    public static /* synthetic */ SavedProductState copy$default(SavedProductState savedProductState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedProductState.itemId;
        }
        return new SavedProductState(str);
    }

    public final String component1() {
        return this.itemId;
    }

    public final SavedProductState copy(String str) {
        return new SavedProductState(str);
    }

    public final String getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.itemId);
    }

    public final boolean isSaved() {
        return AnonymousClass002.A1X(this.itemId);
    }

    public SavedProductState(String str) {
        this.itemId = str;
    }

    public String toString() {
        return super.toString();
    }
}

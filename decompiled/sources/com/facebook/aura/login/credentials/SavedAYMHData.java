package com.facebook.aura.login.credentials;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class SavedAYMHData extends C06G {
    public final String idForAYMH;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SavedAYMHData) && C7384Etj.areEqual(this.idForAYMH, ((SavedAYMHData) obj).idForAYMH));
    }

    public static /* synthetic */ SavedAYMHData copy$default(SavedAYMHData savedAYMHData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedAYMHData.idForAYMH;
        }
        return new SavedAYMHData(str);
    }

    public final String component1() {
        return this.idForAYMH;
    }

    public final SavedAYMHData copy(String str) {
        return new SavedAYMHData(str);
    }

    public final String getIdForAYMH() {
        return this.idForAYMH;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.idForAYMH);
    }

    public SavedAYMHData(String str) {
        this.idForAYMH = str;
    }

    public String toString() {
        return super.toString();
    }
}

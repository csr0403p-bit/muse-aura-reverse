package com.facebook.aura.login.credentials;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class SavedDBLData extends C06G {
    public final String dblData;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SavedDBLData) && C7384Etj.areEqual(this.dblData, ((SavedDBLData) obj).dblData));
    }

    public static /* synthetic */ SavedDBLData copy$default(SavedDBLData savedDBLData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedDBLData.dblData;
        }
        return new SavedDBLData(str);
    }

    public final String component1() {
        return this.dblData;
    }

    public final SavedDBLData copy(String str) {
        return new SavedDBLData(str);
    }

    public final String getDblData() {
        return this.dblData;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.dblData);
    }

    public SavedDBLData(String str) {
        this.dblData = str;
    }

    public String toString() {
        return super.toString();
    }
}

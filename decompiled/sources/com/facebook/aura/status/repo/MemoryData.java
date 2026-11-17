package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class MemoryData extends C06G {
    public final String content;
    public final StatusError error;
    public final boolean isLoading;
    public final boolean isSaving;
    public final Long lastUpdated;

    public MemoryData() {
        this("", false, false, null, null);
    }

    public final MemoryData copy(String str, boolean z, boolean z2, StatusError statusError, Long l) {
        C7384Etj.A0Y(str, 0);
        return new MemoryData(str, z, z2, statusError, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MemoryData) {
                MemoryData memoryData = (MemoryData) obj;
                if (!C7384Etj.areEqual(this.content, memoryData.content) || this.isLoading != memoryData.isLoading || this.isSaving != memoryData.isSaving || !C7384Etj.areEqual(this.error, memoryData.error) || !C7384Etj.areEqual(this.lastUpdated, memoryData.lastUpdated)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MemoryData copy$default(MemoryData memoryData, String str, boolean z, boolean z2, StatusError statusError, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoryData.content;
        }
        if ((i & 2) != 0) {
            z = memoryData.isLoading;
        }
        if ((i & 4) != 0) {
            z2 = memoryData.isSaving;
        }
        if ((i & 8) != 0) {
            statusError = memoryData.error;
        }
        if ((i & 16) != 0) {
            l = memoryData.lastUpdated;
        }
        return memoryData.copy(str, z, z2, statusError, l);
    }

    public final String component1() {
        return this.content;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final boolean component3() {
        return this.isSaving;
    }

    public final StatusError component4() {
        return this.error;
    }

    public final Long component5() {
        return this.lastUpdated;
    }

    public final String getContent() {
        return this.content;
    }

    public final StatusError getError() {
        return this.error;
    }

    public final Long getLastUpdated() {
        return this.lastUpdated;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.content), this.isLoading), this.isSaving) + AnonymousClass006.A0D(this.error)) * 31) + C3cH.A02(this.lastUpdated);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public String toString() {
        return super.toString();
    }

    public MemoryData(String str, boolean z, boolean z2, StatusError statusError, Long l) {
        C7384Etj.A0Y(str, 0);
        this.content = str;
        this.isLoading = z;
        this.isSaving = z2;
        this.error = statusError;
        this.lastUpdated = l;
    }

    public /* synthetic */ MemoryData(String str, boolean z, boolean z2, StatusError statusError, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), (i & 8) != 0 ? null : statusError, (i & 16) != 0 ? null : l);
    }
}

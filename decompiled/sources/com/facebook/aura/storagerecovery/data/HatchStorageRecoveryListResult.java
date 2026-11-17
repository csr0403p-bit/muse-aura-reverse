package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchStorageRecoveryListResult extends C06G {
    public final List<HatchStorageRecoveryEntry> entries;
    public final String nextCursor;

    public HatchStorageRecoveryListResult(List<HatchStorageRecoveryEntry> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.entries = list;
        this.nextCursor = str;
    }

    public final HatchStorageRecoveryListResult copy(List<HatchStorageRecoveryEntry> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new HatchStorageRecoveryListResult(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStorageRecoveryListResult) {
                HatchStorageRecoveryListResult hatchStorageRecoveryListResult = (HatchStorageRecoveryListResult) obj;
                if (!C7384Etj.areEqual(this.entries, hatchStorageRecoveryListResult.entries) || !C7384Etj.areEqual(this.nextCursor, hatchStorageRecoveryListResult.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStorageRecoveryListResult copy$default(HatchStorageRecoveryListResult hatchStorageRecoveryListResult, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchStorageRecoveryListResult.entries;
        }
        if ((i & 2) != 0) {
            str = hatchStorageRecoveryListResult.nextCursor;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchStorageRecoveryListResult(list, str);
    }

    public final List<HatchStorageRecoveryEntry> component1() {
        return this.entries;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final List<HatchStorageRecoveryEntry> getEntries() {
        return this.entries;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.entries) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}

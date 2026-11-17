package com.facebook.aura.conversation.offline;

import X.C06G;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class HatchOfflineKeyEntity extends C06G {
    public final int id;
    public final byte[] wrappedKey;

    public HatchOfflineKeyEntity(int i, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        this.id = i;
        this.wrappedKey = bArr;
    }

    public final HatchOfflineKeyEntity copy(int i, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        return new HatchOfflineKeyEntity(i, bArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchOfflineKeyEntity) {
                HatchOfflineKeyEntity hatchOfflineKeyEntity = (HatchOfflineKeyEntity) obj;
                if (this.id != hatchOfflineKeyEntity.id || !C7384Etj.areEqual(this.wrappedKey, hatchOfflineKeyEntity.wrappedKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchOfflineKeyEntity copy$default(HatchOfflineKeyEntity hatchOfflineKeyEntity, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hatchOfflineKeyEntity.id;
        }
        if ((i2 & 2) != 0) {
            bArr = hatchOfflineKeyEntity.wrappedKey;
        }
        C7384Etj.A0Y(bArr, 1);
        return new HatchOfflineKeyEntity(i, bArr);
    }

    public final int component1() {
        return this.id;
    }

    public final byte[] component2() {
        return this.wrappedKey;
    }

    public final int getId() {
        return this.id;
    }

    public final byte[] getWrappedKey() {
        return this.wrappedKey;
    }

    public int hashCode() {
        return (this.id * 31) + Arrays.hashCode(this.wrappedKey);
    }

    public String toString() {
        return super.toString();
    }
}

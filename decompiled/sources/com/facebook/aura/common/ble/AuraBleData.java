package com.facebook.aura.common.ble;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class AuraBleData extends C06G {
    public final UUID characteristicId;
    public final byte[] data;
    public final UUID serviceId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBleData) {
                AuraBleData auraBleData = (AuraBleData) obj;
                if (!C7384Etj.areEqual(this.serviceId, auraBleData.serviceId) || !C7384Etj.areEqual(this.characteristicId, auraBleData.characteristicId) || !Arrays.equals(this.data, auraBleData.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraBleData copy$default(AuraBleData auraBleData, UUID uuid, UUID uuid2, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = auraBleData.serviceId;
        }
        if ((i & 2) != 0) {
            uuid2 = auraBleData.characteristicId;
        }
        if ((i & 4) != 0) {
            bArr = auraBleData.data;
        }
        return auraBleData.copy(uuid, uuid2, bArr);
    }

    public final UUID component1() {
        return this.serviceId;
    }

    public final UUID component2() {
        return this.characteristicId;
    }

    public final byte[] component3() {
        return this.data;
    }

    public final UUID getCharacteristicId() {
        return this.characteristicId;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final UUID getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.characteristicId, AnonymousClass005.A0E(this.serviceId)) + Arrays.hashCode(this.data);
    }

    public AuraBleData(UUID uuid, UUID uuid2, byte[] bArr) {
        AnonymousClass005.A0x(uuid, uuid2, bArr);
        this.serviceId = uuid;
        this.characteristicId = uuid2;
        this.data = bArr;
    }

    public final AuraBleData copy(UUID uuid, UUID uuid2, byte[] bArr) {
        AnonymousClass005.A0x(uuid, uuid2, bArr);
        return new AuraBleData(uuid, uuid2, bArr);
    }

    public String toString() {
        return super.toString();
    }
}

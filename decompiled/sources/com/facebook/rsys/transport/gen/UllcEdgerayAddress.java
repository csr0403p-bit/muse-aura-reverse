package com.facebook.rsys.transport.gen;

import X.BV8;
import X.C60O;
import X.C60R;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class UllcEdgerayAddress {
    public static G50<UllcEdgerayAddress> CONVERTER = C8922Fte.A00(42);
    public static long sMcfTypeId;
    public final long port;
    public final String vipDomainName;
    public final int vipType;

    public static native UllcEdgerayAddress createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UllcEdgerayAddress) {
                UllcEdgerayAddress ullcEdgerayAddress = (UllcEdgerayAddress) obj;
                if (!this.vipDomainName.equals(ullcEdgerayAddress.vipDomainName) || this.port != ullcEdgerayAddress.port || this.vipType != ullcEdgerayAddress.vipType) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C60R.A00(this.port, BV8.A0B(this.vipDomainName)) + this.vipType;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("UllcEdgerayAddress{vipDomainName=");
        sbA0x.append(this.vipDomainName);
        sbA0x.append(",port=");
        sbA0x.append(this.port);
        sbA0x.append(",vipType=");
        return BV8.A0z(sbA0x, this.vipType);
    }

    public UllcEdgerayAddress(String str, long j, int i) {
        str.getClass();
        this.vipDomainName = str;
        this.port = j;
        this.vipType = i;
    }
}

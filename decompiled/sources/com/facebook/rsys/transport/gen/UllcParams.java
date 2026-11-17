package com.facebook.rsys.transport.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class UllcParams {
    public static G50<UllcParams> CONVERTER = C8922Fte.A00(43);
    public static long sMcfTypeId;
    public final int audioTrackType;
    public final UllcEdgerayAddress edgerayAddress;
    public final int originVipId;
    public final boolean relayOverrideEnabled;
    public final String targetingTier;
    public final int videoTrackType;

    public static native UllcParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UllcParams) {
                UllcParams ullcParams = (UllcParams) obj;
                String str = this.targetingTier;
                String str2 = ullcParams.targetingTier;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (!this.edgerayAddress.equals(ullcParams.edgerayAddress) || this.audioTrackType != ullcParams.audioTrackType || this.videoTrackType != ullcParams.videoTrackType || this.relayOverrideEnabled != ullcParams.relayOverrideEnabled || this.originVipId != ullcParams.originVipId) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.edgerayAddress, AbstractC7608F5v.A02(AnonymousClass006.A0G(this.targetingTier))) + this.audioTrackType) * 31) + this.videoTrackType) * 31) + (this.relayOverrideEnabled ? 1 : 0)) * 31) + this.originVipId;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("UllcParams{targetingTier=");
        sbA0x.append(this.targetingTier);
        sbA0x.append(",edgerayAddress=");
        sbA0x.append(this.edgerayAddress);
        sbA0x.append(",audioTrackType=");
        sbA0x.append(this.audioTrackType);
        sbA0x.append(",videoTrackType=");
        sbA0x.append(this.videoTrackType);
        sbA0x.append(",relayOverrideEnabled=");
        sbA0x.append(this.relayOverrideEnabled);
        sbA0x.append(",originVipId=");
        return BV8.A0z(sbA0x, this.originVipId);
    }

    public UllcParams(String str, UllcEdgerayAddress ullcEdgerayAddress, int i, int i2, boolean z, int i3) {
        ullcEdgerayAddress.getClass();
        this.targetingTier = str;
        this.edgerayAddress = ullcEdgerayAddress;
        this.audioTrackType = i;
        this.videoTrackType = i2;
        this.relayOverrideEnabled = z;
        this.originVipId = i3;
    }
}

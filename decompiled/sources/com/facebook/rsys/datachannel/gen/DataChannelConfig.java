package com.facebook.rsys.datachannel.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass006;
import X.C3cH;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class DataChannelConfig {
    public static G50<DataChannelConfig> CONVERTER = C8926Fti.A00(48);
    public static long sMcfTypeId;
    public final boolean enableCompression;
    public final boolean enableLogging;
    public final byte[] initialStateSyncData;
    public final boolean isE2ee;
    public final Long maxRetransmitTime;
    public final Long maxRetransmits;
    public final boolean ordered;
    public final int priority;
    public final boolean sendDataOnCallStart;
    public final int transportType;

    public static native DataChannelConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DataChannelConfig) {
                DataChannelConfig dataChannelConfig = (DataChannelConfig) obj;
                if (this.ordered == dataChannelConfig.ordered) {
                    Long l = this.maxRetransmitTime;
                    Long l2 = dataChannelConfig.maxRetransmitTime;
                    if (l != null ? l.equals(l2) : l2 == null) {
                        Long l3 = this.maxRetransmits;
                        Long l4 = dataChannelConfig.maxRetransmits;
                        if (l3 == null) {
                            if (l4 != null) {
                                return false;
                            }
                        } else if (l3.equals(l4)) {
                        }
                        if (this.transportType == dataChannelConfig.transportType) {
                            byte[] bArr = this.initialStateSyncData;
                            byte[] bArr2 = dataChannelConfig.initialStateSyncData;
                            if (bArr == null) {
                                if (bArr2 != null) {
                                    return false;
                                }
                            } else if (Arrays.equals(bArr, bArr2)) {
                            }
                            if (this.sendDataOnCallStart != dataChannelConfig.sendDataOnCallStart || this.isE2ee != dataChannelConfig.isE2ee || this.priority != dataChannelConfig.priority || this.enableLogging != dataChannelConfig.enableLogging || this.enableCompression != dataChannelConfig.enableCompression) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + (this.ordered ? 1 : 0)) * 31) + AnonymousClass006.A0D(this.maxRetransmitTime)) * 31) + AnonymousClass006.A0D(this.maxRetransmits)) * 31) + this.transportType) * 31) + C3cH.A02(this.initialStateSyncData)) * 31) + (this.sendDataOnCallStart ? 1 : 0)) * 31) + (this.isE2ee ? 1 : 0)) * 31) + this.priority) * 31) + (this.enableLogging ? 1 : 0)) * 31) + (this.enableCompression ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DataChannelConfig{ordered=");
        sbA0x.append(this.ordered);
        sbA0x.append(",maxRetransmitTime=");
        sbA0x.append(this.maxRetransmitTime);
        sbA0x.append(",maxRetransmits=");
        sbA0x.append(this.maxRetransmits);
        sbA0x.append(",transportType=");
        sbA0x.append(this.transportType);
        sbA0x.append(",initialStateSyncData=");
        sbA0x.append(this.initialStateSyncData);
        sbA0x.append(",sendDataOnCallStart=");
        sbA0x.append(this.sendDataOnCallStart);
        sbA0x.append(",isE2ee=");
        sbA0x.append(this.isE2ee);
        sbA0x.append(",priority=");
        sbA0x.append(this.priority);
        sbA0x.append(",enableLogging=");
        sbA0x.append(this.enableLogging);
        sbA0x.append(",enableCompression=");
        return AbstractC7610F5x.A0y(sbA0x, this.enableCompression);
    }

    public DataChannelConfig(boolean z, Long l, Long l2, int i, byte[] bArr, boolean z2, boolean z3, int i2, boolean z4, boolean z5) {
        this.ordered = z;
        this.maxRetransmitTime = l;
        this.maxRetransmits = l2;
        this.transportType = i;
        this.initialStateSyncData = bArr;
        this.sendDataOnCallStart = z2;
        this.isE2ee = z3;
        this.priority = i2;
        this.enableLogging = z4;
        this.enableCompression = z5;
    }
}

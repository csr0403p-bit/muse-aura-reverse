package com.facebook.rsys.log.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class LogModel {
    public static G50<LogModel> CONVERTER = C8925Fth.A00(43);
    public static long sMcfTypeId;
    public final String callTrigger;
    public final boolean isConnectedEnd;
    public final Long peerId;
    public final String sharedCallId;
    public final Long startingBatteryLevel;
    public final boolean uploadConsoleLogAtEnd;
    public final boolean wasDeviceCharged;

    public static native LogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LogModel) {
                LogModel logModel = (LogModel) obj;
                String str = this.sharedCallId;
                String str2 = logModel.sharedCallId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    Long l = this.peerId;
                    Long l2 = logModel.peerId;
                    if (l == null) {
                        if (l2 != null) {
                            return false;
                        }
                    } else if (l.equals(l2)) {
                    }
                    if (this.callTrigger.equals(logModel.callTrigger)) {
                        Long l3 = this.startingBatteryLevel;
                        Long l4 = logModel.startingBatteryLevel;
                        if (l3 == null) {
                            if (l4 != null) {
                                return false;
                            }
                        } else if (l3.equals(l4)) {
                        }
                        if (this.wasDeviceCharged != logModel.wasDeviceCharged || this.isConnectedEnd != logModel.isConnectedEnd || this.uploadConsoleLogAtEnd != logModel.uploadConsoleLogAtEnd) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.callTrigger, (AbstractC7608F5v.A02(AnonymousClass006.A0G(this.sharedCallId)) + AnonymousClass006.A0D(this.peerId)) * 31) + C3cH.A02(this.startingBatteryLevel)) * 31) + (this.wasDeviceCharged ? 1 : 0)) * 31) + (this.isConnectedEnd ? 1 : 0)) * 31) + (this.uploadConsoleLogAtEnd ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("LogModel{sharedCallId=");
        sbA0x.append(this.sharedCallId);
        sbA0x.append(",peerId=");
        sbA0x.append(this.peerId);
        sbA0x.append(",callTrigger=");
        sbA0x.append(this.callTrigger);
        sbA0x.append(",startingBatteryLevel=");
        sbA0x.append(this.startingBatteryLevel);
        sbA0x.append(",wasDeviceCharged=");
        sbA0x.append(this.wasDeviceCharged);
        sbA0x.append(",isConnectedEnd=");
        sbA0x.append(this.isConnectedEnd);
        sbA0x.append(",uploadConsoleLogAtEnd=");
        return AbstractC7610F5x.A0y(sbA0x, this.uploadConsoleLogAtEnd);
    }

    public LogModel(String str, Long l, String str2, Long l2, boolean z, boolean z2, boolean z3) {
        str2.getClass();
        this.sharedCallId = str;
        this.peerId = l;
        this.callTrigger = str2;
        this.startingBatteryLevel = l2;
        this.wasDeviceCharged = z;
        this.isConnectedEnd = z2;
        this.uploadConsoleLogAtEnd = z3;
    }
}

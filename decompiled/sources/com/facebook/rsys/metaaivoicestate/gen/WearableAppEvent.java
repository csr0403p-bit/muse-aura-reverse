package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV8;
import X.C8922Fte;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class WearableAppEvent {
    public static G50<WearableAppEvent> CONVERTER = C8922Fte.A00(6);
    public static long sMcfTypeId;
    public final String appName;
    public final String device;
    public final String event;

    public static native WearableAppEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WearableAppEvent) {
                WearableAppEvent wearableAppEvent = (WearableAppEvent) obj;
                if (!this.device.equals(wearableAppEvent.device) || !this.appName.equals(wearableAppEvent.appName) || !this.event.equals(wearableAppEvent.event)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.event, AnonymousClass005.A0I(this.appName, BV8.A0B(this.device)));
    }

    public String toString() {
        return FGI.A0k("WearableAppEvent{device=", this.device, ",appName=", this.appName, ",event=", this.event, "}");
    }

    public WearableAppEvent(String str, String str2, String str3) {
        AbstractC7609F5w.A1H(str, str2, str3);
        this.device = str;
        this.appName = str2;
        this.event = str3;
    }
}

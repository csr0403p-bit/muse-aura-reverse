package com.facebook.rsys.call.gen;

import X.BV8;
import X.C8926Fti;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallNotification {
    public static G50<CallNotification> CONVERTER = C8926Fti.A00(12);
    public static long sMcfTypeId;
    public final int notificationType;
    public final String userId;

    public static native CallNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallNotification) {
                CallNotification callNotification = (CallNotification) obj;
                if (!this.userId.equals(callNotification.userId) || this.notificationType != callNotification.notificationType) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A0B(this.userId) + this.notificationType;
    }

    public String toString() {
        return FGI.A0A(this.notificationType, "CallNotification{userId=", this.userId, ",notificationType=", "}");
    }

    public CallNotification(String str, int i) {
        str.getClass();
        this.userId = str;
        this.notificationType = i;
    }
}

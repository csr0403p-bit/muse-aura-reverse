package com.facebook.rsys.callcontext.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallContext {
    public static G50<CallContext> CONVERTER = C8926Fti.A00(16);
    public static long sMcfTypeId;
    public final McfReference appContext;
    public final int roomType;
    public final String selfActorId;
    public final String selfId;

    public static native CallContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallContext) {
                CallContext callContext = (CallContext) obj;
                if (this.selfId.equals(callContext.selfId)) {
                    String str = this.selfActorId;
                    String str2 = callContext.selfActorId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.roomType != callContext.roomType || !this.appContext.equals(callContext.appContext)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.appContext, (((BV8.A0B(this.selfId) + AnonymousClass006.A0G(this.selfActorId)) * 31) + this.roomType) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallContext{selfId=");
        sbA0x.append(this.selfId);
        sbA0x.append(",selfActorId=");
        sbA0x.append(this.selfActorId);
        sbA0x.append(",roomType=");
        sbA0x.append(this.roomType);
        sbA0x.append(",appContext=");
        return BV8.A0v(this.appContext, sbA0x);
    }

    public CallContext(String str, String str2, int i, McfReference mcfReference) {
        str.getClass();
        mcfReference.getClass();
        this.selfId = str;
        this.selfActorId = str2;
        this.roomType = i;
        this.appContext = mcfReference;
    }
}

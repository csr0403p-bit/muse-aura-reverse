package com.facebook.rsys.call.gen;

import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes6.dex */
public class CallStartContext {
    public static G50<CallStartContext> CONVERTER = C8926Fti.A00(14);
    public static long sMcfTypeId;
    public final Map<Long, McfReference> contexts;

    public static native CallStartContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallStartContext) {
            return this.contexts.equals(((CallStartContext) obj).contexts);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.contexts.hashCode();
    }

    public String toString() {
        return BV8.A0v(this.contexts, C60O.A0x("CallStartContext{contexts="));
    }

    public CallStartContext(Map<Long, McfReference> map) {
        map.getClass();
        this.contexts = map;
    }
}

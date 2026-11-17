package com.facebook.rsys.odin.gen;

import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class LiteInferenceEngineHolder {
    public static G50<LiteInferenceEngineHolder> CONVERTER = C8922Fte.A00(7);
    public static long sMcfTypeId;
    public final McfReference engine;

    public static native LiteInferenceEngineHolder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiteInferenceEngineHolder) {
            return this.engine.equals(((LiteInferenceEngineHolder) obj).engine);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.engine.hashCode();
    }

    public String toString() {
        return BV8.A0v(this.engine, C60O.A0x("LiteInferenceEngineHolder{engine="));
    }

    public LiteInferenceEngineHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.engine = mcfReference;
    }
}

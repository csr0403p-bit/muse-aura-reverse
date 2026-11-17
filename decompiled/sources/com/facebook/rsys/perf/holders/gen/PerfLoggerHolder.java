package com.facebook.rsys.perf.holders.gen;

import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class PerfLoggerHolder {
    public static G50<PerfLoggerHolder> CONVERTER = C8922Fte.A00(14);
    public static long sMcfTypeId;
    public final McfReference perfLogger;

    public static native PerfLoggerHolder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerfLoggerHolder) {
            return this.perfLogger.equals(((PerfLoggerHolder) obj).perfLogger);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.perfLogger.hashCode();
    }

    public String toString() {
        return BV8.A0v(this.perfLogger, C60O.A0x("PerfLoggerHolder{perfLogger="));
    }

    public PerfLoggerHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.perfLogger = mcfReference;
    }
}

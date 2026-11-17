package com.meta.maps.fancypins;

import X.C7384Etj;
import android.os.Trace;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class FancyPinTracingKt {
    public static final boolean FANCYPINS_TRACING_ENABLED = false;

    public static final <T> T traceFancyPins(String str, Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 1);
        return function0.invoke();
    }

    public static final void endFancyPinTraceSection(boolean z) {
        if (z) {
            Trace.endSection();
        }
    }

    public static final boolean beginFancyPinTraceSection(String str) {
        return false;
    }
}

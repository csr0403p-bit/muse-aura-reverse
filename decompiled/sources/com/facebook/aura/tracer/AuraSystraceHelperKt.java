package com.facebook.aura.tracer;

import X.AnonymousClass003;
import com.facebook.systrace.Systrace;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class AuraSystraceHelperKt {
    public static final <T> T auraTrace(String str, Function0<? extends T> function0) {
        AnonymousClass003.A0u(str, function0);
        if (Systrace.A09(1L)) {
            Systrace.A04(1L, str);
        }
        try {
            T tInvoke = function0.invoke();
            if (Systrace.A09(1L)) {
                Systrace.A03(1L);
            }
            return tInvoke;
        } catch (Throwable th) {
            if (Systrace.A09(1L)) {
                Systrace.A03(1L);
            }
            throw th;
        }
    }
}

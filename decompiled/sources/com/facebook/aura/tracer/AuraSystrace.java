package com.facebook.aura.tracer;

import X.BV4;
import X.C7384Etj;
import X.ETi;
import android.content.Context;
import com.facebook.systrace.Systrace;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class AuraSystrace {
    public static final AuraSystrace INSTANCE = new AuraSystrace();
    public static boolean initialized;

    public static final void beginSection(String str) {
        C7384Etj.A0Y(str, 0);
        Systrace.A04(1L, str);
    }

    public static final void beginSectionIfTracing(String str) {
        if (!Systrace.A09(1L) || str == null) {
            return;
        }
        Systrace.A04(1L, str);
    }

    public static final void disable() {
        Systrace.A00 = 0L;
    }

    public static final void enable() {
        Systrace.A00 = 1L;
    }

    public static final void endSection() {
        Systrace.A03(1L);
    }

    public static final void endSectionIfTracing() {
        if (Systrace.A09(1L)) {
            Systrace.A03(1L);
        }
    }

    public static final long getTag() {
        return 1L;
    }

    public static final void init(Context context, boolean z) {
        if (!initialized) {
            try {
                ETi.A06(context, z ? 1 : 0);
                Systrace.A00 = 1L;
                Systrace.A04(1L, "SystraceInit");
                Systrace.A03(1L);
                Systrace.A00 = 0L;
            } catch (IOException e) {
                throw BV4.A0e(e);
            }
        }
        initialized = true;
    }

    public static final boolean isTracing() {
        return Systrace.A09(1L);
    }
}

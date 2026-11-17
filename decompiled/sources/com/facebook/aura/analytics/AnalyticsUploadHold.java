package com.facebook.aura.analytics;

import X.AnonymousClass003;
import X.BV4;
import X.C7384Etj;
import X.F0C;
import android.os.Handler;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AnalyticsUploadHold {
    public static final long MAX_HOLD_MS = 30000;
    public static Function0<Unit> pauseUploads;
    public static Function0<Unit> resumeUploads;
    public static final AnalyticsUploadHold INSTANCE = new AnalyticsUploadHold();
    public static final HashMap<Object, Runnable> holds = BV4.A0u();

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void expire(Object obj, Runnable runnable) {
        if (holds.get(obj) == runnable) {
            release(obj);
        }
    }

    public final synchronized void attach(Function0<Unit> function0, Function0<Unit> function02) {
        Function0<Unit> function03;
        AnonymousClass003.A0u(function0, function02);
        HashMap<Object, Runnable> map = holds;
        if (!map.isEmpty() && (function03 = resumeUploads) != null) {
            function03.invoke();
        }
        pauseUploads = function0;
        resumeUploads = function02;
        if (!map.isEmpty()) {
            function0.invoke();
        }
    }

    public final synchronized void hold(final Object obj, long j) {
        Function0<Unit> function0;
        C7384Etj.A0Y(obj, 0);
        HashMap<Object, Runnable> map = holds;
        if (map.isEmpty() && (function0 = pauseUploads) != null) {
            function0.invoke();
        }
        Runnable runnableRemove = map.remove(obj);
        if (runnableRemove != null) {
            F0C.A00().removeCallbacks(runnableRemove);
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.analytics.AnalyticsUploadHold$hold$expiry$1
            @Override // java.lang.Runnable
            public void run() {
                AnalyticsUploadHold.INSTANCE.expire(obj, this);
            }
        };
        map.put(obj, runnable);
        Handler handlerA00 = F0C.A00();
        if (j > 30000) {
            j = 30000;
        }
        handlerA00.postDelayed(runnable, j);
    }

    public final synchronized void release(Object obj) {
        Function0<Unit> function0;
        C7384Etj.A0Y(obj, 0);
        HashMap<Object, Runnable> map = holds;
        Runnable runnableRemove = map.remove(obj);
        if (runnableRemove != null) {
            F0C.A00().removeCallbacks(runnableRemove);
            if (map.isEmpty() && (function0 = resumeUploads) != null) {
                function0.invoke();
            }
        }
    }
}

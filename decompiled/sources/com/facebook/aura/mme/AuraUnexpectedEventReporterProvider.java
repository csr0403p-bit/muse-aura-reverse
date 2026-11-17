package com.facebook.aura.mme;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9O;
import X.C9Q;
import X.C9R;
import X.C9S;
import X.C9T;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class AuraUnexpectedEventReporterProvider {
    public static final int STACK_TRACE_MAX_LENGTH = 2000;
    public static final int STACK_TRACE_SAMPLING_RATE = 1;
    public static volatile C9T unexpectedEventReporter;
    public static final AuraUnexpectedEventReporterProvider INSTANCE = new AuraUnexpectedEventReporterProvider();
    public static final Random random = new Random();

    public final C9T get() {
        QuickPerformanceLogger qPLInstance;
        C9T c9s;
        C9T c9t = unexpectedEventReporter;
        if (c9t != null) {
            return c9t;
        }
        if (!AnonymousClass002.A1X(QuickPerformanceLoggerProvider.A02) || (qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance()) == null) {
            return null;
        }
        synchronized (this) {
            c9s = unexpectedEventReporter;
            if (c9s == null) {
                c9s = new C9S(qPLInstance, random);
                unexpectedEventReporter = c9s;
            }
        }
        return c9s;
    }

    public final void report(int i, String str, Map<String, String> map) {
        AnonymousClass003.A0x(str, map);
        C9T c9t = get();
        if (c9t != null) {
            C9S c9s = (C9S) c9t;
            C9O c9o = new C9O(c9s.A00, str, i, AnonymousClass002.A1L(c9s.A01.nextInt() % 1));
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                String str2 = (String) entryA0l.getValue();
                C7384Etj.A0Y(strA0t, 0);
                c9o.A01.annotate(strA0t, str2);
            }
            if (c9o.A00 == null) {
                c9o.A01.report();
                return;
            }
            Executor executorNewFixedThreadPool = C9R.A00;
            if (executorNewFixedThreadPool == null) {
                executorNewFixedThreadPool = Executors.newFixedThreadPool(3);
                C9R.A00 = executorNewFixedThreadPool;
            }
            C7384Etj.A0X(executorNewFixedThreadPool);
            executorNewFixedThreadPool.execute(new C9Q(c9o));
        }
    }
}

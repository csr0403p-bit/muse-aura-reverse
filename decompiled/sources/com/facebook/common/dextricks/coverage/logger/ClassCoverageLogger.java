package com.facebook.common.dextricks.coverage.logger;

import X.AbstractC3459COf;
import X.CFK;
import X.CFL;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public class ClassCoverageLogger {
    public static volatile String A01;
    public static final Queue<String> A00 = new ConcurrentLinkedQueue();
    public static volatile boolean A02 = "true".equals(AbstractC3459COf.A02("fb.enable_class_coverage"));

    static {
        if (A02 && CFL.A00()) {
            CFK.A02.i(ClassCoverageLogger.class.getSimpleName(), "Class coverage logger is enabled");
        }
        A01 = AbstractC3459COf.A02("fb.throw_on_class_load");
        if (A01.isEmpty()) {
            return;
        }
        String str = A01;
        if (CFK.A02.AOg(4)) {
            String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Load failure enabled for: %s", str);
            if (CFK.A02.AOg(4)) {
                CFK.A02.i(ClassCoverageLogger.class.getSimpleName(), strLocaleSafe);
            }
        }
    }
}

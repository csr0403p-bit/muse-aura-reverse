package com.facebook.common.dextricks.classtracing.logger;

import X.BV4;
import X.BV6;
import X.CC8;
import X.COZ;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.systrace.Systrace;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public class ClassTracingLoggerLite {
    public static final ConcurrentLinkedQueue<Long> A00 = new ConcurrentLinkedQueue<>();
    public static volatile boolean A01;
    public static volatile boolean A02;

    static {
        CC8 cc8 = new CC8();
        String[][] strArr = Systrace.A03;
        COZ.A00(cc8);
    }

    public static void beginClassLoad(String str) {
        if (A01) {
            boolean z = ClassId.sInitialized;
        }
    }

    public static void classLoaded(Class<?> cls) {
        if (A01 && ClassId.sInitialized) {
            BV6.A1R(A00, BV4.A03(ClassId.getDexSignature(cls)) | (ClassId.getClassDef(cls) << 32));
        }
    }

    public static void classNotFound() {
        if (A01 && ClassId.sInitialized) {
            BV6.A1R(A00, -1L);
        }
    }
}

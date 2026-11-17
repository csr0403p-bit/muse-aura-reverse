package com.facebook.systrace;

import X.AbstractC3190C2o;
import X.AbstractC3460COg;
import X.AbstractC3462COk;
import X.BV4;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C08;
import X.C1H;
import X.C3461COj;
import X.C3464COm;
import X.C3467COp;
import X.CCD;
import X.COZ;
import android.os.Build;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class Systrace {
    public static long A00;
    public static final ThreadLocal<C3467COp> A01;
    public static final AtomicInteger A02;
    public static final String[][] A03;

    static {
        String str = COZ.A00;
        if (AbstractC3190C2o.A03) {
            Method method = AbstractC3190C2o.A02;
            C1H.A00(method);
            AbstractC3190C2o.A00(method, BV4.A1Z(true));
        }
        COZ.A01(false);
        CCD ccd = CCD.$redex_init_class;
        A02 = new AtomicInteger();
        A01 = new C3464COm();
        A03 = new String[][]{new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC3460COg.A00();
        }
    }

    public static void A03(long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC3460COg.A00();
        }
        if (A09(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeEndSection();
            } else {
                C08.A00("E");
            }
        }
    }

    public static void A06(String str) {
        A00();
        if (A09(1L)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeTraceCounter(str, 1000);
                return;
            }
            FileOutputStream fileOutputStream = C08.A00;
            C3461COj c3461COjA00 = C3461COj.A00(str, 'C');
            c3461COjA00.A01(1000);
            BV6.A19(c3461COjA00);
        }
    }

    public static void A07(String str, int i, String str2) {
        A00();
        if (A09(64L)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeTraceMetadata(str, str2, i);
                return;
            }
            FileOutputStream fileOutputStream = C08.A00;
            C3461COj c3461COjA00 = C3461COj.A00(str, 'M');
            c3461COjA00.A01(i);
            c3461COjA00.A00.append('|');
            c3461COjA00.A02(str2);
            BV6.A19(c3461COjA00);
        }
    }

    public static boolean A09(long j) {
        return ((j & COZ.A02) == 0 && (A00 & j) == 0) ? false : true;
    }

    public static void A04(long j, String str) {
        A00();
        if (A09(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeBeginSection(str);
            } else {
                FileOutputStream fileOutputStream = C08.A00;
                BV6.A19(C3461COj.A00(str, 'B'));
            }
        }
    }

    public static void A05(long j, String str, String str2, int i, long j2) {
        A00();
        if (A09(j)) {
            long jA00 = AbstractC3462COk.A00(j2);
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceStageBegin(str, i, jA00, str2);
                return;
            }
            FileOutputStream fileOutputStream = C08.A00;
            C3461COj c3461COjA00 = C3461COj.A00(str, 'T');
            BV8.A1I(c3461COjA00, (jA00 > 0L ? 1 : (jA00 == 0L ? 0 : -1)), jA00);
            c3461COjA00.A01(i);
            c3461COjA00.A00.append('|');
            c3461COjA00.A02(str2);
            BV6.A19(c3461COjA00);
        }
    }

    public static void A08(String str, String[] strArr, int i, long j) {
        A00();
        if (A09(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeBeginSectionWithArgs(str, strArr, i);
                return;
            }
            FileOutputStream fileOutputStream = C08.A00;
            C3461COj c3461COjA00 = C3461COj.A00(str, 'B');
            StringBuilder sb = c3461COjA00.A00;
            sb.append('|');
            for (int i2 = 1; i2 < i; i2 += 2) {
                String str2 = strArr[i2 - 1];
                String str3 = strArr[i2];
                BV7.A1I(sb, str2);
                sb.append(str3);
                if (i2 < i - 1) {
                    sb.append(';');
                }
            }
            BV6.A19(c3461COjA00);
        }
    }

    public static void A01() {
        A00();
        if (A09(34359738368L)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceBegin("CLASS_LOAD_TRACE", 0, 0L);
                return;
            }
            FileOutputStream fileOutputStream = C08.A00;
            C3461COj c3461COjA00 = C3461COj.A00("CLASS_LOAD_TRACE", 'S');
            BV8.A1I(c3461COjA00, (0L > 0L ? 1 : (0L == 0L ? 0 : -1)), 0L);
            c3461COjA00.A01(0);
            BV6.A19(c3461COjA00);
        }
    }

    public static void A02() {
        A00();
        if (A09(34359738368L)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceEnd("CLASS_LOAD_TRACE", 0, 0L);
                return;
            }
            FileOutputStream fileOutputStream = C08.A00;
            C3461COj c3461COjA00 = C3461COj.A00("CLASS_LOAD_TRACE", 'F');
            BV8.A1I(c3461COjA00, (0L > 0L ? 1 : (0L == 0L ? 0 : -1)), 0L);
            c3461COjA00.A01(0);
            BV6.A19(c3461COjA00);
        }
    }
}

package com.facebook.debug.tracer;

import X.C7384Etj;
import X.CF5;
import X.CF6;
import X.CFK;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

/* loaded from: classes5.dex */
public abstract class Tracer {
    public static final ThreadLocal<CF6> A00 = new CF5();

    public static final void A00() {
        Systrace.A03(32L);
    }

    public static final void A01(String str) {
        if (Systrace.A09(32L)) {
            try {
                String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str);
                C7384Etj.A0X(strLocaleSafe);
                str = strLocaleSafe;
            } catch (IllegalFormatException e) {
                CFK.A0B("Tracer", "Bad format string", e);
            }
            Systrace.A04(32L, str);
        }
    }

    public static final void A02(String str, Object obj) {
        if (Systrace.A09(32L)) {
            try {
                String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, obj);
                C7384Etj.A0X(strLocaleSafe);
                str = strLocaleSafe;
            } catch (IllegalFormatException e) {
                CFK.A0B("Tracer", "Bad format string", e);
            }
            Systrace.A04(32L, str);
        }
    }
}

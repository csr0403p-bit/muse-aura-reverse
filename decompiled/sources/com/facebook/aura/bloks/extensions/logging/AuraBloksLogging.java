package com.facebook.aura.bloks.extensions.logging;

import X.AnonymousClass002;
import X.BV4;
import X.C3339CFj;
import X.C3341CFl;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.CFJ;
import X.CFK;
import X.CFL;
import X.DFW;
import X.DFX;
import X.F6D;
import X.Hj6;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AuraBloksLogging {
    public static final AuraBloksLogging INSTANCE = new AuraBloksLogging();

    public static final void log(F6D f6d, Hj6 hj6) {
        C7384Etj.A0Y(hj6, 1);
        Object[] objArr = hj6.A01;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Map<Object, ? extends Object> map = (Map) objArr[2];
        AuraBloksLogging auraBloksLogging = INSTANCE;
        C7384Etj.A0X(str);
        auraBloksLogging.logBloksEventAction(str, str2, map, false);
    }

    public static final void logImmediately(F6D f6d, Hj6 hj6) {
        C7384Etj.A0Y(hj6, 1);
        Object[] objArr = hj6.A01;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Map<Object, ? extends Object> map = (Map) objArr[2];
        AuraBloksLogging auraBloksLogging = INSTANCE;
        C7384Etj.A0X(str);
        auraBloksLogging.logBloksEventAction(str, str2, map, true);
    }

    public static /* synthetic */ void logBloksEventAction$default(AuraBloksLogging auraBloksLogging, String str, String str2, Map map, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        auraBloksLogging.logBloksEventAction(str, str2, map, z);
    }

    private final void logBloksEventAction(String str, String str2, Map<Object, ? extends Object> map, boolean z) {
        DFW dfwA01 = DFX.A01(BV4.A0C(), C79.A00, str2, str, z);
        C7384Etj.A0U(dfwA01);
        if (dfwA01.A0A()) {
            if (map != null) {
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    Object key = entryA0l.getKey();
                    Object value = entryA0l.getValue();
                    C3341CFl c3341CFlA04 = dfwA01.A04();
                    C7384Etj.A0U(c3341CFlA04);
                    C7384Etj.A0Y(key, 0);
                    String strA00 = CFJ.A00(key);
                    if (value == null) {
                        value = null;
                    } else if (value instanceof Map) {
                        CFJ.A04(CFJ.A00, C3339CFj.A01(c3341CFlA04, strA00), (Map) value);
                    } else if (!(value instanceof String)) {
                        if (value instanceof List) {
                            CFJ.A03(CFJ.A00, C3339CFj.A00(c3341CFlA04, strA00), (List) value);
                        } else if (value instanceof Number) {
                            value = value.toString();
                        } else if (!(value instanceof Boolean)) {
                            String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Couldn't handle %s %s", value.getClass(), value);
                            if (CFL.A01()) {
                                CFK.A02.e(CFJ.class.getSimpleName(), strLocaleSafe);
                            }
                        }
                    }
                    C3341CFl.A00(c3341CFlA04, value, strA00);
                }
            }
            dfwA01.A05();
        }
    }
}

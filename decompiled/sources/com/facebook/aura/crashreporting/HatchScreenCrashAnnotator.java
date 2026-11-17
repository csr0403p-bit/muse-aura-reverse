package com.facebook.aura.crashreporting;

import X.AbstractC3225C4i;
import X.C3cH;
import X.C5S;
import X.C6B;
import X.C7384Etj;
import X.C98;
import X.EnumC3223C4g;
import com.facebook.errorreporting.field.ReportFieldString;
import java.util.List;

/* loaded from: classes5.dex */
public final class HatchScreenCrashAnnotator {
    public static final int MAX_CHAIN_DEPTH = 16;
    public static final HatchScreenCrashAnnotator INSTANCE = new HatchScreenCrashAnnotator();
    public static final String FIELD_NAV_CHAIN = "hatch_nav_chain";
    public static final ReportFieldString navChainField = new ReportFieldString(-2, FIELD_NAV_CHAIN, true);

    public final void setNavChain(List<String> list) {
        C7384Etj.A0Y(list, 0);
        if (C98.A00 != C98.A03) {
            if (list.size() > 16) {
                list = list.subList(list.size() - 16, list.size());
            }
            C98.A00.A01(navChainField, EnumC3223C4g.CRITICAL_REPORT, C3cH.A0e(" > ", list));
        }
    }

    public final void setCurrentScreen(String str) {
        C5S c5s = C5S.A03;
        if (c5s != null) {
            c5s.A00(str, str);
        }
        AbstractC3225C4i abstractC3225C4i = C98.A00;
        if (abstractC3225C4i != C98.A03) {
            ReportFieldString reportFieldString = C6B.A9D;
            if (str == null) {
                str = "";
            }
            abstractC3225C4i.A00(reportFieldString, EnumC3223C4g.CRITICAL_REPORT, str);
        }
    }
}

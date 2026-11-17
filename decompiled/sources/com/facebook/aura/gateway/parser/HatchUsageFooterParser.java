package com.facebook.aura.gateway.parser;

import X.C06827l3;
import X.C06847l8;
import X.C7384Etj;
import X.C7BY;
import X.EnumC06837l4;

/* loaded from: classes.dex */
public final class HatchUsageFooterParser {
    public static final HatchUsageFooterParser INSTANCE = new HatchUsageFooterParser();
    public static final C06827l3 TRAILING_USAGE_FOOTER_RE = new C06827l3("(?:^|\\n)\\[usage][^\\n]+$", EnumC06837l4.A03);
    public static final String USAGE_FOOTER_MARKER = "[usage]";

    public final String stripTrailingFooter(String str) {
        String string;
        C06847l8 c06847l8A01;
        C7384Etj.A0Y(str, 0);
        return (!C7BY.A0q(str, USAGE_FOOTER_MARKER, true) || (c06847l8A01 = C06827l3.A01((string = C7BY.A0G(str).toString()), TRAILING_USAGE_FOOTER_RE)) == null) ? str : C7BY.A0G(string.substring(0, c06847l8A01.AJM().A00)).toString();
    }
}

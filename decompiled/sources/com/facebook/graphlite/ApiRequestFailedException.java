package com.facebook.graphlite;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.C3cH;
import X.C60O;
import X.FGI;
import com.facebook.aura.gateway.parser.HatchWidgetTokenParser;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ApiRequestFailedException extends Exception {
    public final int mResponseCode;
    public final Map<String, List<String>> mResponseHeaders;
    public final String mResponseMessage;

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[");
        sbA0x.append(FGI.A0H("code=", this.mResponseCode));
        sbA0x.append(FGI.A0U(",message=\"", this.mResponseMessage, "\""));
        sbA0x.append(",responseHeaders=[");
        Iterator itA0n = AnonymousClass002.A0n(this.mResponseHeaders);
        int i = 0;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            StringBuilder sbA0w = C60O.A0w();
            int i2 = i + 1;
            sbA0w.append(i == 0 ? "" : ",");
            sbA0w.append(C60O.A0t(entryA0l));
            sbA0w.append(":");
            sbA0w.append(entryA0l.getValue());
            BV4.A1O(sbA0x, sbA0w);
            i = i2;
        }
        return AnonymousClass001.A0v(HatchWidgetTokenParser.HATCH_WIDGET_TOKEN_SUFFIX, sbA0x);
    }

    public ApiRequestFailedException(int i, String str, Map<String, List<String>> map) {
        this.mResponseCode = i;
        this.mResponseMessage = str == null ? "" : str;
        this.mResponseHeaders = map;
    }
}

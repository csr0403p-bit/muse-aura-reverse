package com.facebook.aura.network.transport;

import X.AnonymousClass002;
import X.C06827l3;
import X.C7384Etj;
import X.C7BY;
import com.facebook.acra.util.HttpRequestMultipart;

/* loaded from: classes5.dex */
public abstract class HatchAttachmentFileNameKt {
    public static final C06827l3 CONTROL_CHARS = C06827l3.A02("[\\x00-\\x1f]");

    public static final String attachmentFileName(HatchHttpResponse hatchHttpResponse) {
        int iA0B;
        C7384Etj.A0Y(hatchHttpResponse, 0);
        String strHeader = hatchHttpResponse.header(HttpRequestMultipart.CONTENT_DISPOSITION);
        if (strHeader != null && !C7BY.A0j(strHeader) && (iA0B = C7BY.A0B(strHeader, "filename=", 0, true)) >= 0) {
            String strSubstring = strHeader.substring(iA0B + 9);
            String strA0l = AnonymousClass002.A0l(C7BY.A0S(strSubstring, strSubstring, ';'));
            C7384Etj.A0Y(strA0l, 0);
            String strA0l2 = AnonymousClass002.A0l(C7BY.A0J("\"", "\"", strA0l));
            String strA0R = C7BY.A0R(strA0l2, strA0l2, '/');
            String strA03 = CONTROL_CHARS.A03(C7BY.A0R(strA0R, strA0R, '\\'), "_");
            if (!C7BY.A0j(strA03) && !".".equals(strA03) && !"..".equals(strA03)) {
                return strA03;
            }
        }
        return null;
    }
}

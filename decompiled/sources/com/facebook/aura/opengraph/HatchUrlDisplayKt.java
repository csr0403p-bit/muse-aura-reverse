package com.facebook.aura.opengraph;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C7BY;
import X.C7Je;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;

/* loaded from: classes.dex */
public abstract class HatchUrlDisplayKt {
    public static final String WWW_PREFIX = "www.";

    public static final String hostOrNull(String str) {
        String strA0l;
        String host;
        String strA0l2;
        String strA0Y;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && !C7BY.A0j(strA0l)) {
            if (!C7BY.A0q(strA0l, "://", false)) {
                strA0l = FGI.A0M("https://", strA0l);
            }
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(strA0l);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null && (host = uriA01.getHost()) != null && (strA0l2 = AnonymousClass002.A0l(host)) != null && (strA0Y = C7BY.A0Y(strA0l2, '.')) != null && strA0Y.length() > 0) {
                return strA0Y;
            }
        }
        return null;
    }

    public static final String displayHost(String str) {
        String strHostOrNull = hostOrNull(str);
        if (strHostOrNull == null) {
            return null;
        }
        return AnonymousClass006.A1b("www.", strHostOrNull) ? strHostOrNull.substring(4) : strHostOrNull;
    }

    public static final String faviconUri(String str) {
        String strHostOrNull = hostOrNull(str);
        if (strHostOrNull != null) {
            return FGI.A0U("https://", strHostOrNull, HatchWidgetWebViewKt.WIDGET_FAVICON_PATH);
        }
        return null;
    }
}

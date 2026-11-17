package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6oc, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6oc {
    public C7mY A00;
    public C6oR A01;
    public final List<C6od> A02;
    public final List<C6oT> A03;

    public final Integer A01(String str) {
        String str2;
        String strA0d;
        C7384Etj.A0Y(str, 0);
        C7mY c7mY = this.A00;
        Uri uriA00 = C7Je.A00(c7mY, str);
        if (uriA00 == null) {
            str2 = "WebViewUriHandler";
            strA0d = "Uri cannot be parsed so we block it.";
        } else {
            Iterator<C6od> it = this.A02.iterator();
            while (it.hasNext()) {
                if (it.next().A01(uriA00)) {
                    return C79.A00;
                }
            }
            String scheme = uriA00.getScheme();
            String authority = uriA00.getAuthority();
            if (scheme == null) {
                scheme = "cannot parse";
            }
            if (authority == null) {
                authority = "cannot parse";
            }
            str2 = "WebViewUriHandler";
            strA0d = FGI.A0d("Uri is blocked, scheme: ", scheme, " , authority: ", authority);
        }
        c7mY.report(str2, strA0d, null);
        return C79.A0C;
    }

    public C6oc(C7mY c7mY, C6oR c6oR, List list, List list2) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A03 = arrayListA0h;
        ArrayList arrayListA0h2 = C3cG.A0h();
        this.A02 = arrayListA0h2;
        arrayListA0h2.addAll(list2);
        arrayListA0h.addAll(list);
        this.A00 = c7mY;
        this.A01 = c6oR;
    }

    public final Integer A00(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        C7mY c7mY = this.A00;
        Uri uriA00 = C7Je.A00(c7mY, str);
        if (uriA00 == null) {
            c7mY.report("WebViewUriHandler", "Uri cannot be parsed so we block it.", null);
            return C79.A0C;
        }
        Iterator<C6oT> it = this.A03.iterator();
        while (it.hasNext()) {
            if (it.next().launch(uriA00, context)) {
                return C79.A01;
            }
        }
        return A01(str);
    }
}

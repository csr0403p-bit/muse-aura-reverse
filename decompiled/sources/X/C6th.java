package X;

import android.net.Uri;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6th, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6th {
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri A00(java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6th.A00(java.lang.String, boolean):android.net.Uri");
    }

    public static final boolean A02(Uri uri) {
        List listA0h;
        String strA0Q;
        if ("frl_login".equalsIgnoreCase(uri.getHost()) && ((uri.getPath() == null || C3cH.A1Q(uri.getPath()) || CustomConnectorRegisterRepositoryKt.ROOT_PATH.equals(uri.getPath())) && uri.getUserInfo() == null && uri.getPort() == -1)) {
            if ("intent".equalsIgnoreCase(uri.getScheme())) {
                String encodedFragment = uri.getEncodedFragment();
                if (encodedFragment != null && (listA0h = C7BY.A0h(encodedFragment, new char[1], ';')) != null && C7384Etj.areEqual(AbstractC0878AGe.A0G(listA0h), "Intent") && C7384Etj.areEqual(AbstractC0878AGe.A0I(listA0h), "end")) {
                    List listSubList = listA0h.subList(1, C60O.A00(listA0h));
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (Object obj : listSubList) {
                        if (AnonymousClass005.A1a((String) obj, "scheme=")) {
                            arrayListA0h.add(obj);
                        }
                    }
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    for (Object obj2 : listSubList) {
                        if (AnonymousClass005.A1a((String) obj2, "package=")) {
                            arrayListA0h2.add(obj2);
                        }
                    }
                    if (arrayListA0h.size() == 1 && arrayListA0h2.size() == 1 && (strA0Q = C7BY.A0Q((String) AbstractC0878AGe.A0J(arrayListA0h), "", '=')) != null && strA0Q.equalsIgnoreCase("aura") && "com.facebook.aura".equals(C7BY.A0Q((String) AbstractC0878AGe.A0J(arrayListA0h2), "", '='))) {
                        return true;
                    }
                }
            } else if ("aura".equalsIgnoreCase(uri.getScheme()) && uri.getFragment() == null) {
                return true;
            }
        }
        return false;
    }

    public static final List<String> A01(Uri uri, String str) {
        List listA0h;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || (listA0h = C7BY.A0h(encodedQuery, new char[1], '&')) == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0h.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            int iA08 = C7BY.A08(strA0j, '=', 0);
            if (C7384Etj.areEqual(iA08 >= 0 ? strA0j.substring(0, iA08) : strA0j, str)) {
                String strDecode = Uri.decode(iA08 >= 0 ? strA0j.substring(iA08 + 1) : "");
                if (strDecode != null) {
                    arrayListA0h.add(strDecode);
                }
            }
        }
        return arrayListA0h;
    }
}

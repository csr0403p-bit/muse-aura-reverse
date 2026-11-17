package com.facebook.aura.file.utils;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C7LE;
import X.InterfaceC7359EnW;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.facebook.aura.file.utils.MC;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HtmlPreviewIsolation {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HtmlPreviewIsolation.class, "isDisabled", "isDisabled()Z");
    public static final HtmlPreviewIsolation INSTANCE = new HtmlPreviewIsolation();
    public static final C31u isDisabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_s722426_mitigation.disable_html_preview_isolation);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
    private final Integer leadingDoctypeEnd(String str) {
        int iA08;
        ?? A0m = C7BY.A0m(str, '\ufeff');
        while (true) {
            if (A0m < str.length() && C7LE.A01(str, A0m)) {
                A0m++;
            } else {
                if (!str.startsWith("<!--", A0m)) {
                    if (!str.regionMatches(true, A0m, "<!doctype", 0, "<!doctype".length()) || (iA08 = C7BY.A08(str, '>', A0m)) == -1) {
                        return null;
                    }
                    return Integer.valueOf(iA08 + 1);
                }
                int iA0B = C7BY.A0B(str, "-->", A0m + 4, false);
                if (iA0B == -1) {
                    return null;
                }
                A0m = iA0B + 3;
            }
        }
    }

    private final List<String> pathSegments(String str) {
        List listA0g = C7BY.A0g(str, new char[]{'/'});
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0g.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        if (AbstractC0878AGe.A0k(HtmlPreviewIsolationKt.ASSET_ROOTS, AbstractC0878AGe.A0G(arrayListA0h))) {
            if (!(arrayListA0h instanceof Collection) || !arrayListA0h.isEmpty()) {
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    String strDecode = Uri.decode(AnonymousClass005.A0j(it2));
                    if (!".".equals(strDecode) && !"..".equals(strDecode)) {
                        C7384Etj.A0X(strDecode);
                        if (C7BY.A0k(strDecode, '/') || C7BY.A0k(strDecode, '\\')) {
                        }
                    }
                }
            }
            return arrayListA0h;
        }
        return null;
    }

    public final boolean isLocalScheme(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        Set<String> set = HtmlPreviewIsolationKt.LOCAL_SCHEMES;
        String scheme = uri.getScheme();
        return AbstractC0878AGe.A0k(set, scheme != null ? AnonymousClass001.A0u(scheme) : null);
    }

    public final String sourceTreeMediaPath(String str, String str2) {
        List<String> listPathSegments;
        List<String> listPathSegments2;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        String strNormalizeWorkspacePath = WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(str2, null);
        if (strNormalizeWorkspacePath != null && (listPathSegments = pathSegments(strNormalizeWorkspacePath)) != null) {
            List listA0d = AbstractC0878AGe.A0d(listPathSegments, zA1a ? 1 : 0);
            if (listA0d == null || (listPathSegments2 = pathSegments(str)) == null) {
                return null;
            }
            boolean z = listA0d.size() >= 2 && listPathSegments2.size() > listA0d.size() && C7384Etj.areEqual(listPathSegments2.subList(0, listA0d.size()), listA0d);
            String strA0u = AnonymousClass001.A0u(C7BY.A0R((String) AbstractC0878AGe.A0H(listPathSegments2), "", '.'));
            String strA0L = AbstractC0878AGe.A0L(CustomConnectorRegisterRepositoryKt.ROOT_PATH, "", "", listPathSegments2, null);
            if (z && HtmlPreviewIsolationKt.MEDIA_EXTENSIONS.contains(strA0u)) {
                return strA0L;
            }
        }
        return null;
    }

    public final String withContentSecurityPolicy(String str) {
        C7384Etj.A0Y(str, 0);
        return insertAfterDoctype(str, HtmlPreviewIsolationKt.PREVIEW_ISOLATION_META);
    }

    public final String withViewerContentSecurityPolicy(String str) {
        C7384Etj.A0Y(str, 0);
        return insertAfterDoctype(str, HtmlPreviewIsolationKt.VIEWER_ISOLATION_META);
    }

    private final boolean isDisabled() {
        return C31u.A01(this, isDisabled$delegate, $$delegatedProperties, 0);
    }

    private final String insertAfterDoctype(String str, String str2) {
        StringBuilder sbA0w;
        Integer numLeadingDoctypeEnd = leadingDoctypeEnd(str);
        if (numLeadingDoctypeEnd != null) {
            int iIntValue = numLeadingDoctypeEnd.intValue();
            String strSubstring = str.substring(0, iIntValue);
            str = str.substring(iIntValue);
            sbA0w = C3cG.A0g(strSubstring);
        } else {
            sbA0w = C60O.A0w();
        }
        return C60P.A1M(str2, str, sbA0w);
    }

    public final WebResourceResponse forbiddenResponse() {
        return new WebResourceResponse("text/plain", "utf-8", 403, "Forbidden", AGH.A0E(), C60Q.A0T());
    }

    public final boolean isEnabled() {
        return !isDisabled();
    }
}

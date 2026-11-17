package com.facebook.aura.network.api;

import X.AnonymousClass005;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class MetaImageCdnHostsKt {
    public static final List<String> META_IMAGE_CDN_HOST_SUFFIXES = C60O.A16(HatchWidgetWebViewKt.META_CDN_HOST_SUFFIX, ".cdninstagram.com");

    public static final boolean isMetaImageCdnHost(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!isAsciiHostChar(str.charAt(i))) {
                return false;
            }
        }
        String strA0g = C60Q.A0g(str);
        List<String> list = META_IMAGE_CDN_HOST_SUFFIXES;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0Y(strA0j, 1);
            if (strA0g.endsWith(strA0j)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isAsciiHostChar(char c) {
        char c2;
        if ('a' <= c) {
            c2 = '{';
        } else if ('A' <= c) {
            c2 = '[';
        } else {
            if ('0' > c) {
                return c == '.' || c == '-';
            }
            c2 = HatchMapSceneKt.ARTIFACT_ID_SEPARATOR;
        }
        return c < c2;
    }
}

package com.facebook.aura.deeplink;

import X.AnonymousClass006;
import X.C7384Etj;
import X.C7BY;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AuraDeeplinkRouteProviderKt {
    public static final List<String> deeplinkRouteSegments(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        List listA0g = C7BY.A0g(C7BY.A0Y(AuraDeeplinkRouteMapperKt.normalizedRoutePath(uri), '/'), new char[]{'/'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0g) {
            AnonymousClass006.A1F((String) obj, obj, arrayList);
        }
        return arrayList;
    }
}

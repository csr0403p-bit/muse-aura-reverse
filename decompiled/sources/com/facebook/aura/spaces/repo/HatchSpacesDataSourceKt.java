package com.facebook.aura.spaces.repo;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt;
import com.facebook.aura.webview.HtmlWebViewPool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class HatchSpacesDataSourceKt {
    public static final String MIME_JSON = "application/json";
    public static final long SPACE_EXPORT_TIMEOUT_MS = 60000;
    public static final long SPACE_EXPORT_TIMEOUT_SECONDS = 60;
    public static final String TAG = "HatchSpacesDataSource";
    public static final String VERSION_QUERY_PARAM = "v";

    public static final void evictSpacesForSlug(HtmlWebViewPool htmlWebViewPool, String str) {
        htmlWebViewPool.evict(FGI.A0M(HtmlSpacesWebViewKt.SPACE_CACHE_KEY_PREFIX, str), null);
        htmlWebViewPool.evict(FGI.A0M(HtmlSpacesWebViewKt.SPACE_MODAL_CACHE_KEY_PREFIX, str), null);
        htmlWebViewPool.invalidate(FGI.A0M("saved-space:space:", str), null);
        htmlWebViewPool.invalidate(FGI.A0M("saved-space:space:modal:", str), null);
    }

    public static final AHD<SpaceCard> distinctById(AHD<SpaceCard> ahd) {
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            AnonymousClass006.A1P(((SpaceCard) obj).id, obj, hashSetA13, arrayListA0h);
        }
        return arrayListA0h.size() != ahd.size() ? AGI.A07(arrayListA0h) : ahd;
    }

    public static final List<SpaceCard> orderSpaceCards(List<SpaceCard> list, List<String> list2) {
        AnonymousClass003.A0u(list, list2);
        if (!list2.isEmpty()) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (String str : list2) {
                Iterator<SpaceCard> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        SpaceCard next = it.next();
                        if (C7384Etj.areEqual(next.id, str)) {
                            if (next != null) {
                                arrayListA0h.add(next);
                            }
                        }
                    }
                }
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (SpaceCard spaceCard : list) {
                if (!list2.contains(spaceCard.id)) {
                    arrayListA0h2.add(spaceCard);
                }
            }
            list = AbstractC0878AGe.A0P(arrayListA0h2, arrayListA0h);
        }
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (SpaceCard spaceCard2 : list) {
            AnonymousClass006.A1P(spaceCard2.id, spaceCard2, hashSetA13, arrayListA0h3);
        }
        return arrayListA0h3;
    }
}

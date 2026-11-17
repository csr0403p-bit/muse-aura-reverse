package com.facebook.aura.deeplink;

import X.AGI;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.F0C;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentViewerDataHolder;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ContentViewerScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$12 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$12 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$12();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$12() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1a = AnonymousClass002.A1a(uri, list);
        C7384Etj.A0Y(abstractC3358CGz, 2);
        Object objA0A = AbstractC0878AGe.A0A(zA1a ? 1 : 0, list);
        if ("artifacts".equals(objA0A)) {
            String str = (String) AbstractC0878AGe.A0A(2, list);
            if (str != null && !C7BY.A0j(str)) {
                return new AuraDeeplinkRoute(new SpacesModalScreenKey(str, uri.getQueryParameter("tab"), false), LaunchFlag.NAVIGATE, null);
            }
        } else {
            if (!"item".equals(objA0A)) {
                return AuraDeeplinkRouteMapper.INSTANCE.libraryRoute(uri);
            }
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter != null && !C7BY.A0j(queryParameter)) {
                AuraDeeplinkRouteMapper auraDeeplinkRouteMapper = AuraDeeplinkRouteMapper.INSTANCE;
                if (auraDeeplinkRouteMapper.isWorkspaceRelativePath(queryParameter)) {
                    ContentItem contentItemContentItemForPath = auraDeeplinkRouteMapper.contentItemForPath(queryParameter);
                    ContentViewerDataHolder.INSTANCE.setItems(AGI.A0E(contentItemContentItemForPath), 0);
                    F0C<C9hr<Object>>[] f0cArr = ContentViewerScreenKey.$childSerializers;
                    return new AuraDeeplinkRoute(new ContentViewerScreenKey(ContentViewerDataHolderKt.toContentViewerTarget(contentItemContentItemForPath), false, zA1a, false, null, false), LaunchFlag.NAVIGATE, null);
                }
            }
        }
        return null;
    }
}

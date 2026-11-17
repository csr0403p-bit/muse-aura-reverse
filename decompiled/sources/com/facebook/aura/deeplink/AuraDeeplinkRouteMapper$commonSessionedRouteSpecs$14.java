package com.facebook.aura.deeplink;

import X.AGI;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
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
import java.util.List;

/* loaded from: classes.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$14 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$14 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$14();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$14() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Z = AnonymousClass005.A1Z(uri, list, abstractC3358CGz);
        String queryParameter = uri.getQueryParameter("path");
        if (queryParameter == null || C7BY.A0j(queryParameter)) {
            queryParameter = "MEMORY.md";
        }
        AuraDeeplinkRouteMapper auraDeeplinkRouteMapper = AuraDeeplinkRouteMapper.INSTANCE;
        if (auraDeeplinkRouteMapper.isWorkspaceRelativePath(queryParameter)) {
            ContentItem contentItemContentItemForPath = auraDeeplinkRouteMapper.contentItemForPath(queryParameter);
            ContentViewerDataHolder.INSTANCE.setItems(AGI.A0E(contentItemContentItemForPath), 0);
            F0C<C9hr<Object>>[] f0cArr = ContentViewerScreenKey.$childSerializers;
            return new AuraDeeplinkRoute(new ContentViewerScreenKey(ContentViewerDataHolderKt.toContentViewerTarget(contentItemContentItemForPath), false, zA1Z, false, null, false), LaunchFlag.NAVIGATE, null);
        }
        return null;
    }
}

package com.facebook.aura.feed.model;

import X.AII;
import X.AIM;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C7384Etj;
import X.HxE;
import android.content.Context;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.common.video.HatchVideoPrefetcher;
import com.facebook.aura.feed.repo.FeedCarouselItem;
import com.facebook.aura.feed.repo.FeedCarouselUnit;
import com.facebook.aura.feed.repo.FeedMediaKind;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedVideo;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class FeedVideoPrefetcher {
    public static final int $stable = 8;
    public final Set<String> prefetchedUrls;
    public final AbstractC3358CGz userSession;

    public FeedVideoPrefetcher(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.prefetchedUrls = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void prefetch(List<? extends FeedUnit> list) {
        boolean zAdd;
        String strResolveUrl;
        String strResolveUrl2;
        C7384Etj.A0Y(list, 0);
        AII aiiA17 = AIM.A17();
        for (FeedUnit feedUnit : list) {
            FeedVideo video = feedUnit.getVideo();
            if (video != null && (strResolveUrl2 = resolveUrl(video.url)) != null) {
                AnonymousClass002.A1J(feedUnit.getId(), strResolveUrl2, aiiA17);
            }
            if (feedUnit instanceof FeedCarouselUnit) {
                for (FeedCarouselItem feedCarouselItem : ((FeedCarouselUnit) feedUnit).attachment.items) {
                    if (feedCarouselItem.kind == FeedMediaKind.VIDEO && (strResolveUrl = resolveUrl(feedCarouselItem.url)) != null) {
                        aiiA17.add(new HxE(strResolveUrl, strResolveUrl));
                    }
                }
            }
        }
        AII aiiA18 = AIM.A18(aiiA17);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = aiiA18.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AnonymousClass006.A1P(((HxE) next).second, next, hashSet, arrayList);
        }
        ArrayList<HxE> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            B b = ((HxE) next2).second;
            synchronized (this.prefetchedUrls) {
                zAdd = this.prefetchedUrls.add(b);
            }
            if (zAdd) {
                arrayList2.add(next2);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Context contextRequireContext = AuraAppContext.INSTANCE.requireContext();
        HatchVideoPrefetcher companion = HatchVideoPrefetcher.Companion.getInstance();
        for (HxE hxE : arrayList2) {
            companion.prefetchVideoByUri(contextRequireContext, (String) hxE.first, (String) hxE.second, null, 1048576, false);
        }
    }

    private final String resolveUrl(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() <= 0) {
            return null;
        }
        if (strA0l.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || strA0l.startsWith("https://")) {
            return strA0l;
        }
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        return workspaceUriResolver.isDaemonApiReference(strA0l) ? workspaceUriResolver.resolveDaemonApiUrl(strA0l, this.userSession) : strA0l;
    }
}

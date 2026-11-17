package com.facebook.aura.audio.podcast;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.HxE;
import com.facebook.aura.audio.podcast.PodcastJarvisPath;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1", f = "PodcastCatalogRepository.kt", l = {118}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends PodcastEpisodesResponseJson>>, Object> {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ PodcastCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1(PodcastCatalogRepository podcastCatalogRepository, HtJ<? super PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1> htJ) {
        super(2, htJ);
        this.this$0 = podcastCatalogRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1(this.this$0, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<PodcastEpisodesResponseJson>> htJ) {
        return new PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 podcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 1;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = C60O.A06(obj).m1595executeBodylessJarvisRequestWithp3iPjrY(podcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, PodcastJarvisPath.PodcastEpisodes.INSTANCE, RequestType.GET, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        return C3cG.A0t(objM1595executeBodylessJarvisRequestWithp3iPjrY);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends PodcastEpisodesResponseJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<PodcastEpisodesResponseJson>>) htJ);
    }
}

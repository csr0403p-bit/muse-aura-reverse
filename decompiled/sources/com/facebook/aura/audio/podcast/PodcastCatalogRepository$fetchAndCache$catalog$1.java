package com.facebook.aura.audio.podcast;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10550Hrx;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C6ys;
import X.C79;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$catalog$1", f = "PodcastCatalogRepository.kt", l = {64, LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PodcastCatalogRepository$fetchAndCache$catalog$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PodcastCatalog>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ PodcastCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PodcastCatalogRepository$fetchAndCache$catalog$1(PodcastCatalogRepository podcastCatalogRepository, HtJ<? super PodcastCatalogRepository$fetchAndCache$catalog$1> htJ) {
        super(2, htJ);
        this.this$0 = podcastCatalogRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        PodcastCatalogRepository$fetchAndCache$catalog$1 podcastCatalogRepository$fetchAndCache$catalog$1 = new PodcastCatalogRepository$fetchAndCache$catalog$1(this.this$0, htJ);
        podcastCatalogRepository$fetchAndCache$catalog$1.L$0 = obj;
        return podcastCatalogRepository$fetchAndCache$catalog$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA01;
        List<PodcastEpisode> domain;
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1 podcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1 = new PodcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1(this.this$0, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            C10550Hrx c10550HrxA01 = GAo.A01(num, c6ys, podcastCatalogRepository$fetchAndCache$catalog$1$episodesDeferred$1, c3ux);
            objA01 = GAo.A01(num, c6ys, new PodcastCatalogRepository$fetchAndCache$catalog$1$feedDeferred$1(this.this$0, null), c3ux);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = objA01;
            this.label = 1;
            obj = c10550HrxA01.A0E(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                domain = (List) this.L$3;
                Hwg.A00(obj);
                Object obj2 = ((HsJ) obj).value;
                Hwg.A00(obj2);
                return new PodcastCatalog(domain, ((PodcastFeedResponseJson) obj2).toDomain());
            }
            objA01 = (C27k) this.L$2;
            Hwg.A00(obj);
        }
        Object obj3 = ((HsJ) obj).value;
        Hwg.A00(obj3);
        domain = ((PodcastEpisodesResponseJson) obj3).toDomain();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = domain;
        this.label = 2;
        obj = C3cG.A0W(objA01, this);
        if (obj == enumC10460Hji) {
            return enumC10460Hji;
        }
        Object obj22 = ((HsJ) obj).value;
        Hwg.A00(obj22);
        return new PodcastCatalog(domain, ((PodcastFeedResponseJson) obj22).toDomain());
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PodcastCatalog> htJ) {
        return ((PodcastCatalogRepository$fetchAndCache$catalog$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

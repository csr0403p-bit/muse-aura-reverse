package com.facebook.aura.conversation.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.audio.podcast.PodcastCatalog;
import com.facebook.aura.audio.podcast.PodcastCatalogRepository;
import com.facebook.aura.audio.podcast.PodcastPresentationResolver;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchFileOperations;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class HatchInlineAudioPlayerViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<InlineAudioPodcastUiState> _uiState;
    public final String audioUrl;
    public final C1BN<InlineAudioPodcastUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchInlineAudioPlayerViewModel$1", f = "HatchInlineAudioPlayerViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchInlineAudioPlayerViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchInlineAudioPlayerViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            InlineAudioPodcastUiState value;
            InlineAudioPodcastUiState inlineAudioPodcastUiState;
            String str;
            String str2;
            String str3;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    PodcastCatalogRepository companion = PodcastCatalogRepository.Companion.getInstance(HatchInlineAudioPlayerViewModel.this.userSession);
                    this.label = 1;
                    obj = companion.getCatalog(false, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                PodcastPresentationResolver.PodcastPresentation podcastPresentationResolve = PodcastPresentationResolver.INSTANCE.resolve(HatchInlineAudioPlayerViewModel.this.audioUrl, (PodcastCatalog) obj);
                HatchInlineAudioPlayerViewModel hatchInlineAudioPlayerViewModel = HatchInlineAudioPlayerViewModel.this;
                BLG<InlineAudioPodcastUiState> blg = hatchInlineAudioPlayerViewModel._uiState;
                do {
                    value = blg.getValue();
                    inlineAudioPodcastUiState = value;
                    str = podcastPresentationResolve.episodeTitle;
                    str2 = podcastPresentationResolve.feedTitle;
                    str3 = podcastPresentationResolve.coverPath;
                } while (!blg.A6e(value, new InlineAudioPodcastUiState(inlineAudioPodcastUiState.isPodcast, str, str2, str3 != null ? HatchFileOperations.INSTANCE.buildFSRawFileUrl(str3, hatchInlineAudioPlayerViewModel.userSession) : null)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(HatchInlineAudioPlayerViewModelKt.TAG, "Failed to resolve podcast presentation", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchInlineAudioPlayerViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchInlineAudioPlayerViewModel> {
        public static final int $stable = 8;
        public final String audioUrl;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchInlineAudioPlayerViewModel create() {
            return new HatchInlineAudioPlayerViewModel(this.userSession, this.audioUrl);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.audioUrl = str;
        }
    }

    public final C1BN<InlineAudioPodcastUiState> getUiState() {
        return this.uiState;
    }

    public HatchInlineAudioPlayerViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        this.userSession = abstractC3358CGz;
        this.audioUrl = str;
        C9286GCn c9286GCn = new C9286GCn(new InlineAudioPodcastUiState(PodcastPresentationResolver.INSTANCE.isPodcastPath(str), null, null, null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        if (((InlineAudioPodcastUiState) c9286GCn.getValue()).isPodcast) {
            AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        }
    }
}

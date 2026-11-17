package com.facebook.aura.conversation.viewmodel;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.conversation.repo.HatchPrimarySessionRepository;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.repo.LoadingState;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchThreadsViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchThreadsViewModel";
    public final C1BN<AHD<HatchSessionItem>> channelThreads;
    public final C1BN<Boolean> hasArchivedThreads;
    public final C1BN<Boolean> hasMore;
    public boolean hasResetInitialScroll;
    public final C1BN<LoadingState> loadingState;
    public final HatchOfflineConversationRepository offlineRepo;
    public final C1BN<String> primarySessionId;
    public final HatchThreadsRepository repository;
    public final C1BN<AHD<HatchSessionItem>> sessions;
    public final C1BN<AHD<HatchSessionItem>> sideChatSessions;
    public final ThreadsView view;

    public final class Factory extends AuraViewModelFactory<HatchThreadsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;
        public final ThreadsView view;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchThreadsViewModel create() {
            return new HatchThreadsViewModel(HatchThreadsRepository.Companion.getInstance(this.userSession), this.view, this.userSession);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, ThreadsView threadsView) {
            AnonymousClass003.A0u(abstractC3358CGz, threadsView);
            this.userSession = abstractC3358CGz;
            this.view = threadsView;
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, ThreadsView threadsView, int i, C06H c06h) {
            this(abstractC3358CGz, (i & 2) != 0 ? ThreadsView.ACTIVE : threadsView);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel", f = "HatchThreadsViewModel.kt", l = {113}, m = "loadCachedThreadsOrEmpty", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$loadCachedThreadsOrEmpty$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchThreadsViewModel.this.loadCachedThreadsOrEmpty(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$loadMore$1", f = "HatchThreadsViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$loadMore$1, reason: invalid class name and case insensitive filesystem */
    public final class C115731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115731(HtJ<? super C115731> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchThreadsViewModel.this.new C115731(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsViewModel hatchThreadsViewModel = HatchThreadsViewModel.this;
                HatchThreadsRepository hatchThreadsRepository = hatchThreadsViewModel.repository;
                ThreadsView threadsView = hatchThreadsViewModel.view;
                this.label = 1;
                if (hatchThreadsRepository.loadMore(threadsView, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchThreadsViewModel.this.new C115731(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$refresh$1", f = "HatchThreadsViewModel.kt", l = {91, 94}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C115741 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115741(HtJ<? super C115741> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchThreadsViewModel.this.new C115741(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsViewModel hatchThreadsViewModel = HatchThreadsViewModel.this;
                HatchThreadsRepository hatchThreadsRepository = hatchThreadsViewModel.repository;
                ThreadsView threadsView = hatchThreadsViewModel.view;
                this.label = 1;
                if (hatchThreadsRepository.refresh(threadsView, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            HatchThreadsViewModel hatchThreadsViewModel2 = HatchThreadsViewModel.this;
            if (hatchThreadsViewModel2.view == ThreadsView.ACTIVE) {
                HatchThreadsRepository hatchThreadsRepository2 = hatchThreadsViewModel2.repository;
                ThreadsView threadsView2 = ThreadsView.ARCHIVED;
                this.label = 2;
                if (hatchThreadsRepository2.refresh(threadsView2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchThreadsViewModel.this.new C115741(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchThreadsViewModel(HatchThreadsRepository hatchThreadsRepository, ThreadsView threadsView, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Z = AnonymousClass005.A1Z(hatchThreadsRepository, threadsView, abstractC3358CGz);
        this.repository = hatchThreadsRepository;
        this.view = threadsView;
        this.offlineRepo = HatchOfflineConversationRepository.Companion.getInstance(abstractC3358CGz);
        C1BN<String> c1bn = HatchPrimarySessionRepository.Companion.getInstance(abstractC3358CGz).primarySessionId;
        this.primarySessionId = c1bn;
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new HatchThreadsViewModel$sessions$1(this, null), hatchThreadsRepository.sessions(threadsView), hatchThreadsRepository.loadingState(threadsView), c1bn);
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        AHI ahi = AHI.A01;
        C3Pi c3PiA00 = AnonymousClass441.A00(ahi, bllA00, anonymousClass603A00, c3Ej);
        this.sessions = c3PiA00;
        this.sideChatSessions = AnonymousClass441.A00(ahi, AEu.A00(this), new HatchThreadsViewModel$special$$inlined$map$1(c3PiA00), c3Ej);
        this.channelThreads = AnonymousClass441.A00(ahi, AEu.A00(this), new HatchThreadsViewModel$special$$inlined$map$2(c3PiA00), c3Ej);
        C1BN<LoadingState> c1bnLoadingState = hatchThreadsRepository.loadingState(threadsView);
        this.loadingState = AnonymousClass441.A00(LoadingState.IDLE, AEu.A00(this), c1bnLoadingState, c3Ej);
        C1BN<Boolean> c1bnHasMore = hatchThreadsRepository.hasMore(threadsView);
        this.hasMore = AnonymousClass441.A00(Boolean.valueOf(zA1Z), AEu.A00(this), c1bnHasMore, c3Ej);
        this.hasArchivedThreads = AnonymousClass441.A00(false, AEu.A00(this), new HatchThreadsViewModel$special$$inlined$map$3(hatchThreadsRepository.sessions(ThreadsView.ARCHIVED)), c3Ej);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadCachedThreadsOrEmpty(X.HtJ<? super X.AHD<com.facebook.aura.gateway.HatchSessionItem>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$loadCachedThreadsOrEmpty$1 r4 = (com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L37
        L1e:
            com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$loadCachedThreadsOrEmpty$1 r4 = new com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel$loadCachedThreadsOrEmpty$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r0 = r5.offlineRepo     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
            r4.label = r1     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
            java.lang.Object r3 = r0.loadCachedThreads(r4)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
            if (r3 != r2) goto L3a
            return r2
        L37:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
        L3a:
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
            java.util.Comparator<com.facebook.aura.gateway.HatchSessionItem> r0 = com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt.HatchSessionListComparator     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
            java.util.List r0 = X.AbstractC0878AGe.A0c(r3, r0)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
            X.AHD r2 = X.AGI.A07(r0)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L52
            return r2
        L47:
            r2 = move-exception
            java.lang.String r1 = "Offline cached threads load failed"
            java.lang.String r0 = "HatchThreadsViewModel"
            X.CFK.A08(r0, r1, r2)
            X.AHI r0 = X.AHI.A01
            return r0
        L52:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel.loadCachedThreadsOrEmpty(X.HtJ):java.lang.Object");
    }

    public final boolean consumeInitialScrollReset() {
        if (this.hasResetInitialScroll) {
            return false;
        }
        this.hasResetInitialScroll = true;
        return true;
    }

    public final C1BN<AHD<HatchSessionItem>> getChannelThreads() {
        return this.channelThreads;
    }

    public final C1BN<Boolean> getHasArchivedThreads() {
        return this.hasArchivedThreads;
    }

    public final C1BN<Boolean> getHasMore() {
        return this.hasMore;
    }

    public final C1BN<LoadingState> getLoadingState() {
        return this.loadingState;
    }

    public final C1BN<AHD<HatchSessionItem>> getSessions() {
        return this.sessions;
    }

    public final C1BN<AHD<HatchSessionItem>> getSideChatSessions() {
        return this.sideChatSessions;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void loadMore() {
        AnonymousClass001.A1J(new C115731(null), AEu.A00(this));
    }

    public final void refresh() {
        AnonymousClass001.A1J(new C115741(null), AEu.A00(this));
    }
}

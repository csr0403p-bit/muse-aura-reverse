package com.facebook.aura.library.repo;

import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C3pU;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C7BY;
import X.C8eO;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import com.facebook.aura.gateway.VmAuthTokenKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.library.repo.WorkspaceBrowseError;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class MediaBrowseDataSource {
    public final BLG<MediaBrowseData> _data;
    public final C1BN<MediaBrowseData> data;
    public final ThingsAndMediaDataSource feed;
    public boolean isObserving;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.library.repo.MediaBrowseDataSource$observeFeed$1", f = "MediaBrowseDataSource.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.MediaBrowseDataSource$observeFeed$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.repo.MediaBrowseDataSource$observeFeed$1$1", f = "MediaBrowseDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.MediaBrowseDataSource$observeFeed$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01961 extends AbstractC07127nr implements G0W<AHD<? extends WorkspaceEntry>, LoadingState, HtJ<? super HxE<? extends AHD<? extends WorkspaceEntry>, ? extends LoadingState>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            public C01961(HtJ<? super C01961> htJ) {
                super(3, htJ);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(AHD<? extends WorkspaceEntry> ahd, LoadingState loadingState, HtJ<? super HxE<? extends AHD<? extends WorkspaceEntry>, ? extends LoadingState>> htJ) {
                return invoke2((AHD<WorkspaceEntry>) ahd, loadingState, (HtJ<? super HxE<? extends AHD<WorkspaceEntry>, ? extends LoadingState>>) htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return new HxE(obj2, obj3);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AHD<WorkspaceEntry> ahd, LoadingState loadingState, HtJ<? super HxE<? extends AHD<WorkspaceEntry>, ? extends LoadingState>> htJ) {
                C01961 c01961 = new C01961(htJ);
                c01961.L$0 = ahd;
                c01961.L$1 = loadingState;
                return c01961.invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.library.repo.MediaBrowseDataSource$observeFeed$1$2", f = "MediaBrowseDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.MediaBrowseDataSource$observeFeed$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HxE<? extends AHD<? extends WorkspaceEntry>, ? extends LoadingState>, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ MediaBrowseDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MediaBrowseDataSource mediaBrowseDataSource, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = mediaBrowseDataSource;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends AHD<? extends WorkspaceEntry>, ? extends LoadingState> hxE, HtJ<? super Unit> htJ) {
                return invoke2((HxE<? extends AHD<WorkspaceEntry>, ? extends LoadingState>) hxE, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r1 = r6.L$0
                    X.HxE r1 = (X.HxE) r1
                    int r0 = r6.label
                    if (r0 != 0) goto L37
                    X.Hwg.A00(r7)
                    A r5 = r1.first
                    X.AHD r5 = (X.AHD) r5
                    B r1 = r1.second
                    com.facebook.aura.library.repo.LoadingState r0 = com.facebook.aura.library.repo.LoadingState.LOADING
                    if (r1 == r0) goto L1a
                    com.facebook.aura.library.repo.LoadingState r0 = com.facebook.aura.library.repo.LoadingState.INITIAL
                    r4 = 0
                    if (r1 != r0) goto L1b
                L1a:
                    r4 = 1
                L1b:
                    com.facebook.aura.library.repo.MediaBrowseDataSource r0 = r6.this$0
                    X.BLG<com.facebook.aura.library.repo.MediaBrowseData> r3 = r0._data
                L1f:
                    java.lang.Object r2 = r3.getValue()
                    r1 = r2
                    com.facebook.aura.library.repo.MediaBrowseData r1 = (com.facebook.aura.library.repo.MediaBrowseData) r1
                    r0 = 0
                    com.facebook.aura.library.repo.MediaBrowseData r0 = r1.copy(r5, r4, r0)
                    boolean r0 = r3.A6e(r2, r0)
                    if (r0 == 0) goto L1f
                    r5.size()
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L37:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.MediaBrowseDataSource.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HxE<? extends AHD<WorkspaceEntry>, ? extends LoadingState> hxE, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MediaBrowseDataSource.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource thingsAndMediaDataSource = MediaBrowseDataSource.this.feed;
                C60I c60iA03 = C3rb.A03(new C01961(null), thingsAndMediaDataSource.media, thingsAndMediaDataSource.loadingState);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(MediaBrowseDataSource.this, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c60iA03) == enumC10460Hji) {
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
            return MediaBrowseDataSource.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public MediaBrowseDataSource(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.scope = Hxb.A02(new C8eO(null));
        this.feed = ThingsAndMediaDataSource.Companion.getInstance(abstractC3358CGz);
        C9286GCn c9286GCn = new C9286GCn(new MediaBrowseData(AHI.A01, false, null));
        this._data = c9286GCn;
        this.data = new C3Pi(null, c9286GCn);
    }

    private final void observeFeed() {
        if (this.isObserving) {
            return;
        }
        this.isObserving = true;
        AnonymousClass001.A1J(new AnonymousClass1(null), this.scope);
    }

    public final void clearData() {
        AnonymousClass001.A1E(this._data, null, new MediaBrowseData(AHI.A01, false, null));
    }

    public final String getAuthToken() {
        return VmAuthTokenKt.vmBoundAuthToken(this.userSession);
    }

    public final C1BN<MediaBrowseData> getData() {
        return this.data;
    }

    public final void loadEntries() {
        MediaBrowseData value;
        MediaBrowseData mediaBrowseData;
        String gatewayUrl = HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getGatewayUrl();
        String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(this.userSession);
        if (!C7BY.A0j(gatewayUrl) && !C7BY.A0j(strVmBoundAuthToken)) {
            this.feed.start();
            observeFeed();
            return;
        }
        CFK.A06(MediaBrowseDataSourceKt.TAG, "Cannot browse media: missing gateway URL or auth token");
        BLG<MediaBrowseData> blg = this._data;
        do {
            value = blg.getValue();
            mediaBrowseData = value;
        } while (!blg.A6e(value, mediaBrowseData.copy(mediaBrowseData.entries, mediaBrowseData.isLoading, WorkspaceBrowseError.MissingCredentials.INSTANCE)));
    }

    public final Object refresh(boolean z, HtJ<? super Unit> htJ) throws Throwable {
        Object objRefresh = this.feed.refresh(z, htJ);
        return objRefresh != EnumC10460Hji.A02 ? Unit.INSTANCE : objRefresh;
    }
}

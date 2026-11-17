package com.facebook.aura.spaces.share;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.toast.api.ToastApi;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class SpaceShareLinkViewModel extends AEs {
    public static final int $stable = 8;
    public SpaceShareLinkAudienceJson audience;
    public final BLG<SpaceShareLinkState> mutableState;
    public HoC poll;
    public final SpaceShareLinkRepository repository;
    public HoC request;
    public final String slug;
    public final C1BN<SpaceShareLinkState> state;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<SpaceShareLinkViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz session;
        public final String slug;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SpaceShareLinkViewModel create() {
            return new SpaceShareLinkViewModel(this.session, this.slug);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.session = abstractC3358CGz;
            this.slug = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkViewModel$load$2", f = "SpaceShareLinkViewModel.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkViewModel$load$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceShareLinkViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceShareLinkViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SpaceShareLinkState value;
            SpaceShareLinkViewModel spaceShareLinkViewModel;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    spaceShareLinkViewModel = SpaceShareLinkViewModel.this;
                    this.L$0 = spaceShareLinkViewModel;
                    this.label = 1;
                    obj = spaceShareLinkViewModel.settingsWithConfirmedAccess(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    spaceShareLinkViewModel = (SpaceShareLinkViewModel) this.L$0;
                    Hwg.A00(obj);
                }
                spaceShareLinkViewModel.apply((SpaceShareLinkSettingsJson) obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                BLG<SpaceShareLinkState> blg = SpaceShareLinkViewModel.this.mutableState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, SpaceShareLinkState.copy$default(value, SpaceShareLinkPhase.LOAD_FAILED, null, false, false, false, false, null, false, null, 510, null)));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkViewModel$pollPublication$1", f = "SpaceShareLinkViewModel.kt", l = {207, 210, 220}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkViewModel$pollPublication$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceShareLinkViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceShareLinkViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[PHI: r1 r2 r4
  0x00ad: PHI (r1v3 int) = (r1v0 int), (r1v5 int) binds: [B:40:0x00ad, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r2v4 int) = (r2v1 int), (r2v6 int) binds: [B:40:0x00ad, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r4v4 com.facebook.aura.spaces.share.SpaceShareLinkViewModel) = 
  (r4v1 com.facebook.aura.spaces.share.SpaceShareLinkViewModel)
  (r4v5 com.facebook.aura.spaces.share.SpaceShareLinkViewModel)
 binds: [B:40:0x00ad, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:20:0x0064). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkViewModel$publish$2", f = "SpaceShareLinkViewModel.kt", l = {99, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 117, 119}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkViewModel$publish$2, reason: invalid class name and case insensitive filesystem */
    public final class C139622 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C139622(HtJ<? super C139622> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceShareLinkViewModel.this.new C139622(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceShareLinkViewModel.this.new C139622(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: Exception -> 0x006d, CancellationException -> 0x00d9, TryCatch #2 {CancellationException -> 0x00d9, Exception -> 0x006d, blocks: (B:29:0x0064, B:30:0x0067, B:18:0x0037, B:19:0x003a, B:20:0x003c, B:22:0x0048, B:23:0x004a, B:25:0x004e, B:26:0x0050, B:13:0x0025, B:15:0x002b), top: B:51:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[Catch: Exception -> 0x006d, CancellationException -> 0x00d9, TryCatch #2 {CancellationException -> 0x00d9, Exception -> 0x006d, blocks: (B:29:0x0064, B:30:0x0067, B:18:0x0037, B:19:0x003a, B:20:0x003c, B:22:0x0048, B:23:0x004a, B:25:0x004e, B:26:0x0050, B:13:0x0025, B:15:0x002b), top: B:51:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkViewModel.C139622.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkViewModel", f = "SpaceShareLinkViewModel.kt", l = {231}, m = "refreshAfterPublishFailure", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshAfterPublishFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C139631 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C139631(HtJ<? super C139631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceShareLinkViewModel.this.refreshAfterPublishFailure(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkViewModel", f = "SpaceShareLinkViewModel.kt", l = {244}, m = "refreshCatalog", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshCatalog$1, reason: invalid class name and case insensitive filesystem */
    public final class C139641 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C139641(HtJ<? super C139641> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceShareLinkViewModel.this.refreshCatalog(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkViewModel", f = "SpaceShareLinkViewModel.kt", l = {195, 198, 199}, m = "settingsWithConfirmedAccess", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkViewModel$settingsWithConfirmedAccess$1, reason: invalid class name and case insensitive filesystem */
    public final class C139651 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C139651(HtJ<? super C139651> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceShareLinkViewModel.this.settingsWithConfirmedAccess(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkViewModel$unpublish$2", f = "SpaceShareLinkViewModel.kt", l = {150, 164}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkViewModel$unpublish$2, reason: invalid class name and case insensitive filesystem */
    public final class C139662 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C139662(HtJ<? super C139662> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceShareLinkViewModel.this.new C139662(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceShareLinkViewModel.this.new C139662(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SpaceShareLinkState value;
            SpaceShareLinkState value2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                BLG<SpaceShareLinkState> blg = SpaceShareLinkViewModel.this.mutableState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, SpaceShareLinkState.copy$default(value, null, null, false, false, false, false, null, false, null, 495, null)));
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120b19);
            }
            if (i == 0) {
                Hwg.A00(obj);
                SpaceShareLinkRepository spaceShareLinkRepository = SpaceShareLinkViewModel.this.repository;
                this.label = 1;
                if (spaceShareLinkRepository.unpublish(this) == enumC10460Hji) {
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
            HoC hoC = SpaceShareLinkViewModel.this.poll;
            if (hoC != null) {
                hoC.A5w(null);
            }
            BLG<SpaceShareLinkState> blg2 = SpaceShareLinkViewModel.this.mutableState;
            do {
                value2 = blg2.getValue();
            } while (!blg2.A6e(value2, new SpaceShareLinkState(SpaceShareLinkPhase.UNPUBLISHED, null, value2.canPublish, false, false, true, null, false, null)));
            SpaceShareLinkViewModel spaceShareLinkViewModel = SpaceShareLinkViewModel.this;
            this.label = 2;
            if (spaceShareLinkViewModel.refreshCatalog(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }
    }

    public SpaceShareLinkViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, str);
        this.userSession = abstractC3358CGz;
        this.slug = str;
        this.repository = new SpaceShareLinkRepository(abstractC3358CGz, str, HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getGatewayUrl());
        C9286GCn c9286GCnA14 = C3cG.A14(new SpaceShareLinkState(SpaceShareLinkPhase.LOADING, null, false, false, false, zA1a, null, false, null));
        this.mutableState = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
        load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(SpaceShareLinkSettingsJson spaceShareLinkSettingsJson) {
        SpaceShareLinkState value;
        SpaceShareLinkState spaceShareLinkState;
        SpaceShareLinkPhase spaceShareLinkPhase;
        String str;
        boolean zEquals;
        boolean z;
        String str2;
        SpaceShareLinkAudienceJson spaceShareLinkAudienceJson = spaceShareLinkSettingsJson.audience;
        if (spaceShareLinkAudienceJson == null || spaceShareLinkAudienceJson.recipient_principals == null) {
            spaceShareLinkAudienceJson = this.audience;
        }
        this.audience = spaceShareLinkAudienceJson;
        Boolean bool = spaceShareLinkSettingsJson.publication_in_progress;
        Boolean boolA0i = AnonymousClass001.A0i();
        boolean zEquals2 = boolA0i.equals(bool);
        BLG<SpaceShareLinkState> blg = this.mutableState;
        do {
            value = blg.getValue();
            spaceShareLinkState = value;
            spaceShareLinkPhase = spaceShareLinkState.phase == SpaceShareLinkPhase.CONFIRM_UNPUBLISH ? spaceShareLinkState.phase : SpaceShareLinkPhase.READY;
            str = spaceShareLinkSettingsJson.url;
            if (str == null || C7BY.A0j(str) || str.equals(HatchCcvLoggingKt.NO_POSTAL_FIELD)) {
                str = null;
            }
            zEquals = boolA0i.equals(spaceShareLinkSettingsJson.can_publish);
            z = !AnonymousClass002.A1b(spaceShareLinkSettingsJson.current_build_published, false);
            str2 = spaceShareLinkSettingsJson.last_synced_at;
        } while (!blg.A6e(value, spaceShareLinkState.copy(spaceShareLinkPhase, str, zEquals, zEquals2, spaceShareLinkState.unpublishing, z, str2 != null ? parseTimestamp(str2) : null, spaceShareLinkState.publishFailed, spaceShareLinkState.publishError)));
        if (zEquals2) {
            pollPublication();
            return;
        }
        HoC hoC = this.poll;
        if (hoC != null) {
            hoC.A5w(null);
        }
    }

    private final void pollPublication() {
        HoC hoC = this.poll;
        if (hoC == null || !hoC.isActive()) {
            BLL bllA00 = AEu.A00(this);
            this.poll = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass1(null), bllA00);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshAfterPublishFailure(X.HtJ<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.facebook.aura.spaces.share.SpaceShareLinkViewModel.C139631
            if (r0 == 0) goto L1e
            r3 = r13
            com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshAfterPublishFailure$1 r3 = (com.facebook.aura.spaces.share.SpaceShareLinkViewModel.C139631) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L3c
        L1e:
            com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshAfterPublishFailure$1 r3 = new com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshAfterPublishFailure$1
            r3.<init>(r13)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r4)
            com.facebook.aura.spaces.share.SpaceShareLinkRepository r0 = r12.repository     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            r3.label = r1     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            java.lang.Object r4 = r0.settings(r3)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            if (r4 != r2) goto L3f
            return r2
        L37:
            if (r0 == 0) goto L4e
        L39:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3c:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
        L3f:
            com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson r4 = (com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson) r4     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            X.BLG<com.facebook.aura.spaces.share.SpaceShareLinkState> r0 = r12.mutableState     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            com.facebook.aura.spaces.share.SpaceShareLinkState r3 = (com.facebook.aura.spaces.share.SpaceShareLinkState) r3     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            r12.apply(r4)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            X.BLG<com.facebook.aura.spaces.share.SpaceShareLinkState> r2 = r12.mutableState     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
        L4e:
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            r4 = r1
            com.facebook.aura.spaces.share.SpaceShareLinkState r4 = (com.facebook.aura.spaces.share.SpaceShareLinkState) r4     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            boolean r12 = r3.publishFailed     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            java.lang.String r13 = r3.publishError     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            com.facebook.aura.spaces.share.SpaceShareLinkPhase r5 = r4.phase     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            java.lang.String r6 = r4.url     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            boolean r7 = r4.canPublish     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            boolean r8 = r4.publishing     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            boolean r9 = r4.unpublishing     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            boolean r10 = r4.currentBuildPublished     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            java.lang.Long r11 = r4.lastSyncedAtMs     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            com.facebook.aura.spaces.share.SpaceShareLinkState r0 = r4.copy(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            boolean r0 = r2.A6e(r1, r0)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L70
            goto L37
        L70:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkViewModel.refreshAfterPublishFailure(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshCatalog(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.spaces.share.SpaceShareLinkViewModel.C139641
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshCatalog$1 r4 = (com.facebook.aura.spaces.share.SpaceShareLinkViewModel.C139641) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            goto L24
        L1e:
            com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshCatalog$1 r4 = new com.facebook.aura.spaces.share.SpaceShareLinkViewModel$refreshCatalog$1
            r4.<init>(r6)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L41 java.util.concurrent.CancellationException -> L44
            goto L41
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$Companion r1 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.Companion     // Catch: java.lang.Exception -> L41 java.util.concurrent.CancellationException -> L44
            X.CGz r0 = r5.userSession     // Catch: java.lang.Exception -> L41 java.util.concurrent.CancellationException -> L44
            com.facebook.aura.library.repo.UnifiedArtifactsRepository r0 = r1.getInstance(r0)     // Catch: java.lang.Exception -> L41 java.util.concurrent.CancellationException -> L44
            r4.label = r2     // Catch: java.lang.Exception -> L41 java.util.concurrent.CancellationException -> L44
            java.lang.Object r0 = r0.refresh(r2, r4)     // Catch: java.lang.Exception -> L41 java.util.concurrent.CancellationException -> L44
            if (r0 != r3) goto L41
            return r3
        L41:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L44:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkViewModel.refreshCatalog(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String refusalMessage(Exception exc) {
        NetworkException networkException;
        String message;
        String strA0l;
        if (!(exc instanceof NetworkException) || (networkException = (NetworkException) exc) == null || networkException.httpResponseCode != 400 || (message = networkException.getMessage()) == null || (strA0l = AnonymousClass002.A0l(message)) == null || strA0l.length() <= 0 || strA0l.endsWith("HTTP 400")) {
            return null;
        }
        return strA0l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[PHI: r0
  0x0026: PHI (r0v10 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:25:0x0067, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settingsWithConfirmedAccess(X.HtJ<? super com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.spaces.share.SpaceShareLinkViewModel.C139651
            if (r0 == 0) goto L6a
            r5 = r8
            com.facebook.aura.spaces.share.SpaceShareLinkViewModel$settingsWithConfirmedAccess$1 r5 = (com.facebook.aura.spaces.share.SpaceShareLinkViewModel.C139651) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r4 = 3
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L2b
            if (r2 == r1) goto L27
            if (r2 == r3) goto L4f
            if (r2 != r4) goto L71
            X.Hwg.A00(r0)
        L26:
            return r0
        L27:
            X.Hwg.A00(r0)     // Catch: com.facebook.aura.json.NetworkException -> L37
            goto L70
        L2b:
            X.Hwg.A00(r0)
            com.facebook.aura.spaces.share.SpaceShareLinkRepository r0 = r7.repository     // Catch: com.facebook.aura.json.NetworkException -> L37
            r5.label = r1     // Catch: com.facebook.aura.json.NetworkException -> L37
            java.lang.Object r0 = r0.settings(r5)     // Catch: com.facebook.aura.json.NetworkException -> L37
            goto L67
        L37:
            r2 = move-exception
            int r1 = r2.httpResponseCode
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L75
            com.facebook.aura.spaces.share.SpaceShareLinkRepository r1 = r7.repository
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r7
            r5.label = r3
            java.lang.Object r0 = r1.currentAudience(r5)
            if (r0 == r6) goto L69
            r1 = r7
            goto L56
        L4f:
            java.lang.Object r1 = r5.L$1
            com.facebook.aura.spaces.share.SpaceShareLinkViewModel r1 = (com.facebook.aura.spaces.share.SpaceShareLinkViewModel) r1
            X.Hwg.A00(r0)
        L56:
            com.facebook.aura.spaces.share.SpaceShareLinkAudienceJson r0 = (com.facebook.aura.spaces.share.SpaceShareLinkAudienceJson) r0
            r1.audience = r0
            com.facebook.aura.spaces.share.SpaceShareLinkRepository r1 = r7.repository
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r4
            java.lang.Object r0 = r1.settings(r5)
        L67:
            if (r0 != r6) goto L26
        L69:
            return r6
        L6a:
            com.facebook.aura.spaces.share.SpaceShareLinkViewModel$settingsWithConfirmedAccess$1 r5 = new com.facebook.aura.spaces.share.SpaceShareLinkViewModel$settingsWithConfirmedAccess$1
            r5.<init>(r8)
            goto L12
        L70:
            return r0
        L71:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        L75:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkViewModel.settingsWithConfirmedAccess(X.HtJ):java.lang.Object");
    }

    public final void cancelUnpublish() {
        SpaceShareLinkState value;
        SpaceShareLinkState spaceShareLinkStateCopy$default;
        BLG<SpaceShareLinkState> blg = this.mutableState;
        do {
            value = blg.getValue();
            spaceShareLinkStateCopy$default = value;
            if (spaceShareLinkStateCopy$default.phase == SpaceShareLinkPhase.CONFIRM_UNPUBLISH && !spaceShareLinkStateCopy$default.unpublishing) {
                spaceShareLinkStateCopy$default = SpaceShareLinkState.copy$default(spaceShareLinkStateCopy$default, SpaceShareLinkPhase.READY, null, false, false, false, false, null, false, null, 510, null);
            }
        } while (!blg.A6e(value, spaceShareLinkStateCopy$default));
    }

    public final void confirmUnpublish() {
        SpaceShareLinkState value;
        SpaceShareLinkState spaceShareLinkStateCopy$default;
        BLG<SpaceShareLinkState> blg = this.mutableState;
        do {
            value = blg.getValue();
            spaceShareLinkStateCopy$default = value;
            if (spaceShareLinkStateCopy$default.phase == SpaceShareLinkPhase.READY && spaceShareLinkStateCopy$default.isPublished && !spaceShareLinkStateCopy$default.publishing) {
                spaceShareLinkStateCopy$default = SpaceShareLinkState.copy$default(spaceShareLinkStateCopy$default, SpaceShareLinkPhase.CONFIRM_UNPUBLISH, null, false, false, false, false, null, false, null, 510, null);
            }
        } while (!blg.A6e(value, spaceShareLinkStateCopy$default));
    }

    public final C1BN<SpaceShareLinkState> getState() {
        return this.state;
    }

    public final void load() {
        SpaceShareLinkState value;
        HoC hoC = this.request;
        if (hoC == null || !hoC.isActive()) {
            BLG<SpaceShareLinkState> blg = this.mutableState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, SpaceShareLinkState.copy$default(value, SpaceShareLinkPhase.LOADING, null, false, false, false, false, null, false, null, 510, null)));
            BLL bllA00 = AEu.A00(this);
            this.request = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass2(null), bllA00);
        }
    }

    public final void publish() {
        SpaceShareLinkState value;
        SpaceShareLinkState spaceShareLinkState;
        SpaceShareLinkState value2 = this.mutableState.getValue();
        if (value2.phase == SpaceShareLinkPhase.READY && !value2.publishing && value2.canPublish) {
            HoC hoC = this.request;
            if (hoC == null || !hoC.isActive()) {
                BLG<SpaceShareLinkState> blg = this.mutableState;
                do {
                    value = blg.getValue();
                    spaceShareLinkState = value;
                } while (!blg.A6e(value, spaceShareLinkState.copy(spaceShareLinkState.phase, spaceShareLinkState.url, spaceShareLinkState.canPublish, true, spaceShareLinkState.unpublishing, spaceShareLinkState.currentBuildPublished, spaceShareLinkState.lastSyncedAtMs, false, null)));
                BLL bllA00 = AEu.A00(this);
                this.request = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C139622(null), bllA00);
            }
        }
    }

    public final void publishAgain() {
        SpaceShareLinkState value;
        SpaceShareLinkState spaceShareLinkStateCopy$default;
        BLG<SpaceShareLinkState> blg = this.mutableState;
        do {
            value = blg.getValue();
            spaceShareLinkStateCopy$default = value;
            if (spaceShareLinkStateCopy$default.phase == SpaceShareLinkPhase.UNPUBLISHED) {
                spaceShareLinkStateCopy$default = SpaceShareLinkState.copy$default(spaceShareLinkStateCopy$default, SpaceShareLinkPhase.READY, null, false, false, false, false, null, false, null, 510, null);
            }
        } while (!blg.A6e(value, spaceShareLinkStateCopy$default));
    }

    public final void unpublish() {
        SpaceShareLinkState value;
        if (this.mutableState.getValue().phase == SpaceShareLinkPhase.CONFIRM_UNPUBLISH) {
            HoC hoC = this.request;
            if (hoC == null || !hoC.isActive()) {
                BLG<SpaceShareLinkState> blg = this.mutableState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, SpaceShareLinkState.copy$default(value, null, null, false, false, true, false, null, false, null, 495, null)));
                BLL bllA00 = AEu.A00(this);
                this.request = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C139662(null), bllA00);
            }
        }
    }

    private final Long parseTimestamp(String str) {
        try {
            return Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
        } catch (Exception unused) {
            return null;
        }
    }
}

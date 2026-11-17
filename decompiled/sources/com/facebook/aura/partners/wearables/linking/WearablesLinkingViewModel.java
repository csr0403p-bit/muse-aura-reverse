package com.facebook.aura.partners.wearables.linking;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingViewEffect;
import com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferWork;
import com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WearablesLinkingViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "WearablesLinkingViewModel";
    public final BLG<WearablesLinkingUiState> _uiState;
    public final C3Em<WearablesLinkingViewEffect> _viewEffects;
    public final String assistantName;
    public final WearablesCommsConsentStore commsConsentStore;
    public final WearablesComplimentaryOfferWork offerWork;
    public final WearablesLinkingOrigin origin;
    public final boolean phoneProviderLinked;
    public final WearablesLinkingRepository repository;
    public final String setupSessionId;
    public final C1BN<WearablesLinkingUiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C22I<WearablesLinkingViewEffect> viewEffects;
    public final AuraViewerDataProvider viewerDataProvider;

    public final class Factory extends AuraViewModelFactory<WearablesLinkingViewModel> {
        public static final int $stable = 8;
        public final String assistantName;
        public final WearablesLinkingOrigin origin;
        public final boolean phoneProviderLinked;
        public final String setupSessionId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public WearablesLinkingViewModel create() {
            WearablesLinkingRepository wearablesLinkingRepository = new WearablesLinkingRepository();
            WearablesComplimentaryOfferWork companion = WearablesComplimentaryOfferWork.Companion.getInstance(this.userSession);
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new WearablesLinkingViewModel(wearablesLinkingRepository, companion, abstractC3358CGz, this.assistantName, AuraViewerDataProvider.Companion.getInstance(abstractC3358CGz), new WearablesCommsConsentStore(this.userSession), this.origin, this.phoneProviderLinked, this.setupSessionId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, WearablesLinkingOrigin wearablesLinkingOrigin, boolean z, String str2) {
            AnonymousClass003.A0v(abstractC3358CGz, wearablesLinkingOrigin);
            this.userSession = abstractC3358CGz;
            this.assistantName = str;
            this.origin = wearablesLinkingOrigin;
            this.phoneProviderLinked = z;
            this.setupSessionId = str2;
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, String str, WearablesLinkingOrigin wearablesLinkingOrigin, boolean z, String str2, int i, C06H c06h) {
            this(abstractC3358CGz, str, wearablesLinkingOrigin, C3cG.A1K(i & 8, z), str2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$enableHatch$1", f = "WearablesLinkingViewModel.kt", l = {87, 91}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$enableHatch$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public boolean Z$0;
        public int label;

        /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$enableHatch$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C03331 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
            public static final C03331 INSTANCE = new C03331();

            public C03331() {
                super(1);
            }

            @Override // X.G0U
            public final AuraUserData invoke(AuraUserData auraUserData) {
                C7384Etj.A0Y(auraUserData, 0);
                return AuraUserData.copy$default(auraUserData, null, null, null, null, null, null, false, false, null, null, false, true, false, null, false, null, null, null, null, null, null, null, null, null, 16775167, null);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return WearablesLinkingViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return WearablesLinkingViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: Exception -> 0x009c, CancellationException -> 0x00b5, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00b5, Exception -> 0x009c, blocks: (B:20:0x0061, B:21:0x0064, B:25:0x006f, B:27:0x008f, B:28:0x0098, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:26:0x0085, B:10:0x0016), top: B:35:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: Exception -> 0x009c, CancellationException -> 0x00b5, TryCatch #2 {CancellationException -> 0x00b5, Exception -> 0x009c, blocks: (B:20:0x0061, B:21:0x0064, B:25:0x006f, B:27:0x008f, B:28:0x0098, B:13:0x002f, B:14:0x0032, B:17:0x003a, B:26:0x0085, B:10:0x0016), top: B:35:0x0007 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r8 = 2
                r6 = 1
                r3 = 0
                if (r0 == 0) goto L13
                if (r0 == r6) goto L2f
                if (r0 != r8) goto Le
                goto L61
            Le:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L13:
                X.Hwg.A00(r10)
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r5 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository r4 = r5.repository     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin r0 = r5.origin     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.analytics.hatch.HatchSurface r2 = r0.getSurface()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.analytics.hatch.HatchSubsurface r1 = r0.getSubsurface()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                java.lang.String r0 = r5.setupSessionId     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r9.label = r6     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r10 = r4.linkWearables(r2, r1, r0, r9)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                if (r10 != r7) goto L32
                return r7
            L2f:
                X.Hwg.A00(r10)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
            L32:
                boolean r6 = X.AnonymousClass001.A1X(r10)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this
                if (r6 == 0) goto L85
                com.facebook.aura.user.provider.AuraViewerDataProvider r1 = r0.viewerDataProvider     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$enableHatch$1$1 r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.AnonymousClass1.C03331.INSTANCE     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r1.atomicUpdate(r0)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r5 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferWork r4 = r5.offerWork     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin r0 = r5.origin     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.analytics.hatch.HatchSurface r2 = r0.getSurface()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.analytics.hatch.HatchSubsurface r1 = r0.getSubsurface()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                java.lang.String r0 = r5.setupSessionId     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r4.prepare(r2, r1, r0)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r9.Z$0 = r6     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r9.label = r8     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.access$renameAssistant(r0, r9)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                if (r0 != r7) goto L64
                return r7
            L61:
                X.Hwg.A00(r10)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
            L64:
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                boolean r1 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.access$isCommsConsentNeeded(r0)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this
                if (r1 == 0) goto L6f
                goto L8f
            L6f:
                X.BLG<com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState> r2 = r0._uiState     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingState r1 = com.facebook.aura.partners.wearables.linking.WearablesLinkingState.CONSENT     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState r0 = new com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                X.AnonymousClass002.A1I(r2, r0)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                X.3Em<com.facebook.aura.partners.wearables.linking.WearablesLinkingViewEffect> r1 = r0._viewEffects     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewEffect$Linked r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewEffect.Linked.INSTANCE     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r1.AhV(r0)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                goto Lb2
            L85:
                X.BLG<com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState> r2 = r0._uiState     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingState r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingState.FAILURE     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState r1 = new com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r1.<init>(r0, r3)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                goto L98
            L8f:
                X.BLG<com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState> r2 = r0._uiState     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingState r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingState.COMMS_CONSENT     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState r1 = new com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                r1.<init>(r0, r3)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
            L98:
                X.AnonymousClass002.A1I(r2, r1)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> Lb5
                goto Lb2
            L9c:
                r2 = move-exception
                java.lang.String r1 = "Failed to link wearables"
                java.lang.String r0 = "WearablesLinkingViewModel"
                X.CFK.A08(r0, r1, r2)
                com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r0 = com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.this
                X.BLG<com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState> r2 = r0._uiState
                com.facebook.aura.partners.wearables.linking.WearablesLinkingState r1 = com.facebook.aura.partners.wearables.linking.WearablesLinkingState.FAILURE
                com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState r0 = new com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState
                r0.<init>(r1, r3)
                X.AnonymousClass002.A1I(r2, r0)
            Lb2:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            Lb5:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$onCommsConsentDecision$1", f = "WearablesLinkingViewModel.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$onCommsConsentDecision$1, reason: invalid class name and case insensitive filesystem */
    public final class C133901 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $granted;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133901(boolean z, HtJ<? super C133901> htJ) {
            super(2, htJ);
            this.$granted = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return WearablesLinkingViewModel.this.new C133901(this.$granted, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    WearablesLinkingViewModel.this.commsConsentStore.set(this.$granted ? WearablesCommsConsent.GRANTED : WearablesCommsConsent.DECLINED);
                    WearablesLinkingRepository wearablesLinkingRepository = WearablesLinkingViewModel.this.repository;
                    boolean z = this.$granted;
                    this.label = 1;
                    obj = wearablesLinkingRepository.setCommsConsent(z, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                if (!AnonymousClass001.A1X(obj)) {
                    CFK.A06(WearablesLinkingViewModel.TAG, "Failed to record comms consent: server returned failure");
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(WearablesLinkingViewModel.TAG, "Failed to record comms consent", e2);
            }
            AnonymousClass002.A1I(WearablesLinkingViewModel.this._uiState, new WearablesLinkingUiState(WearablesLinkingState.COMMS_CONSENT, false));
            WearablesLinkingViewModel.this._viewEffects.AhV(WearablesLinkingViewEffect.Linked.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133901) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel", f = "WearablesLinkingViewModel.kt", l = {171}, m = "renameAssistant", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$renameAssistant$1, reason: invalid class name and case insensitive filesystem */
    public final class C133911 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C133911(HtJ<? super C133911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WearablesLinkingViewModel.this.renameAssistant(this);
        }
    }

    public WearablesLinkingViewModel(WearablesLinkingRepository wearablesLinkingRepository, WearablesComplimentaryOfferWork wearablesComplimentaryOfferWork, AbstractC3358CGz abstractC3358CGz, String str, AuraViewerDataProvider auraViewerDataProvider, WearablesCommsConsentStore wearablesCommsConsentStore, WearablesLinkingOrigin wearablesLinkingOrigin, boolean z, String str2) {
        boolean zA1Z = AnonymousClass005.A1Z(wearablesLinkingRepository, wearablesComplimentaryOfferWork, abstractC3358CGz);
        C7384Etj.A0Y(auraViewerDataProvider, 4);
        AnonymousClass003.A0z(wearablesCommsConsentStore, wearablesLinkingOrigin);
        this.repository = wearablesLinkingRepository;
        this.offerWork = wearablesComplimentaryOfferWork;
        this.userSession = abstractC3358CGz;
        this.assistantName = str;
        this.viewerDataProvider = auraViewerDataProvider;
        this.commsConsentStore = wearablesCommsConsentStore;
        this.origin = wearablesLinkingOrigin;
        this.phoneProviderLinked = z;
        this.setupSessionId = str2;
        AuraUserData value = auraViewerDataProvider.userData.getValue();
        C9286GCn c9286GCnA14 = C3cG.A14(new WearablesLinkingUiState((value != null && value.hasLinkedWearables == zA1Z && isCommsConsentNeeded()) ? WearablesLinkingState.COMMS_CONSENT : WearablesLinkingState.CONSENT, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3Pi.A00(c9286GCnA14);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A01, 0, zA1Z ? 1 : 0);
        this._viewEffects = c9290GCrA12;
        this.viewEffects = C3pd.A00(c9290GCrA12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCommsConsentNeeded() {
        return WearablesCommsConsentStoreKt.isCommsConsentPending(this.userSession, this.phoneProviderLinked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renameAssistant(X.HtJ<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.C133911
            if (r0 == 0) goto L20
            r7 = r10
            com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$renameAssistant$1 r7 = (com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.C133911) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            java.lang.String r4 = "WearablesLinkingViewModel"
            r6 = 1
            if (r0 == 0) goto L2b
            if (r0 != r6) goto L26
            goto L61
        L20:
            com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$renameAssistant$1 r7 = new com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel$renameAssistant$1
            r7.<init>(r10)
            goto L12
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r1)
            java.lang.String r5 = r9.assistantName
            if (r5 == 0) goto L78
            boolean r0 = X.C7BY.A0j(r5)
            r3 = 0
            if (r0 != 0) goto L78
            java.lang.String r2 = X.AnonymousClass002.A0l(r5)
            com.facebook.aura.gateway.JarvisUtils r1 = com.facebook.aura.gateway.JarvisUtils.INSTANCE
            X.CGz r0 = r9.userSession
            java.lang.String r0 = r1.getSelectedAssistantNameOrNull(r0)
            if (r0 == 0) goto L4b
            java.lang.String r3 = X.AnonymousClass002.A0l(r0)
        L4b:
            boolean r0 = X.C7384Etj.areEqual(r2, r3)
            if (r0 != 0) goto L78
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository r2 = r9.repository     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
            X.CGz r1 = r9.userSession     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
            r0 = 0
            r7.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
            r7.label = r6     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
            java.lang.Object r1 = r2.setAssistantName(r5, r1, r7)     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
            if (r1 != r8) goto L64
            return r8
        L61:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
        L64:
            boolean r0 = X.AnonymousClass001.A1X(r1)     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
            if (r0 != 0) goto L78
            java.lang.String r0 = "Failed to rename assistant: server returned failure"
            X.CFK.A06(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L70 java.lang.Exception -> L72
            goto L78
        L70:
            r0 = move-exception
            throw r0
        L72:
            r1 = move-exception
            java.lang.String r0 = "Failed to rename assistant"
            X.CFK.A08(r4, r0, r1)
        L78:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel.renameAssistant(X.HtJ):java.lang.Object");
    }

    public final void enableHatch() {
        WearablesLinkingUiState value;
        WearablesLinkingUiState wearablesLinkingUiState;
        WearablesLinkingUiState wearablesLinkingUiState2;
        BLG<WearablesLinkingUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            wearablesLinkingUiState = value;
            if (wearablesLinkingUiState.isLoading) {
                wearablesLinkingUiState2 = wearablesLinkingUiState;
            } else {
                WearablesLinkingState wearablesLinkingState = wearablesLinkingUiState.sheetState;
                C7384Etj.A0Y(wearablesLinkingState, 0);
                wearablesLinkingUiState2 = new WearablesLinkingUiState(wearablesLinkingState, true);
            }
        } while (!blg.A6e(value, wearablesLinkingUiState2));
        if (wearablesLinkingUiState.isLoading) {
            return;
        }
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final C1BN<WearablesLinkingUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<WearablesLinkingViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final void onCommsConsentDecision(boolean z) {
        WearablesLinkingUiState value;
        WearablesLinkingUiState wearablesLinkingUiState;
        WearablesLinkingUiState wearablesLinkingUiState2;
        BLG<WearablesLinkingUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            wearablesLinkingUiState = value;
            if (wearablesLinkingUiState.isLoading) {
                wearablesLinkingUiState2 = wearablesLinkingUiState;
            } else {
                WearablesLinkingState wearablesLinkingState = wearablesLinkingUiState.sheetState;
                C7384Etj.A0Y(wearablesLinkingState, 0);
                wearablesLinkingUiState2 = new WearablesLinkingUiState(wearablesLinkingState, true);
            }
        } while (!blg.A6e(value, wearablesLinkingUiState2));
        if (wearablesLinkingUiState.isLoading) {
            return;
        }
        AnonymousClass001.A1J(new C133901(z, null), AEu.A00(this));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void retryEnableHatch() {
        enableHatch();
    }

    public /* synthetic */ WearablesLinkingViewModel(WearablesLinkingRepository wearablesLinkingRepository, WearablesComplimentaryOfferWork wearablesComplimentaryOfferWork, AbstractC3358CGz abstractC3358CGz, String str, AuraViewerDataProvider auraViewerDataProvider, WearablesCommsConsentStore wearablesCommsConsentStore, WearablesLinkingOrigin wearablesLinkingOrigin, boolean z, String str2, int i, C06H c06h) {
        this(wearablesLinkingRepository, wearablesComplimentaryOfferWork, abstractC3358CGz, str, auraViewerDataProvider, wearablesCommsConsentStore, wearablesLinkingOrigin, C3cH.A1N(i, z), str2);
    }
}

package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.pairs.PairsGuidanceLoad;
import com.facebook.aura.pairs.PairsGuidanceSaveState;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PairsGuidanceViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<PairsGuidanceEffect> _effects;
    public final BLG<PairsGuidanceUiState> _uiState;
    public final String chatSessionId;
    public final C22I<PairsGuidanceEffect> effects;
    public HoC loadJob;
    public final PairsRepository repository;
    public HoC saveJob;
    public final C1BN<PairsGuidanceUiState> uiState;

    public final class Factory extends AuraViewModelFactory<PairsGuidanceViewModel> {
        public static final int $stable = 8;
        public final String chatSessionId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PairsGuidanceViewModel create() {
            return new PairsGuidanceViewModel(PairsRepository.Companion.getInstance(this.userSession), this.chatSessionId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.chatSessionId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsGuidanceViewModel$follow$2", f = "PairsGuidanceViewModel.kt", l = {131, 134, VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsGuidanceViewModel$follow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $announcesFailure;
        public final /* synthetic */ PairsGuidanceSave $save;
        public Object L$0;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public final /* synthetic */ PairsGuidanceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PairsGuidanceSave pairsGuidanceSave, PairsGuidanceViewModel pairsGuidanceViewModel, boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$save = pairsGuidanceSave;
            this.this$0 = pairsGuidanceViewModel;
            this.$announcesFailure = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$save, this.this$0, this.$announcesFailure, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r6 = 3
                r2 = 2
                r1 = 1
                r4 = 0
                if (r0 == 0) goto L19
                if (r0 == r1) goto L29
                if (r0 == r2) goto L16
                if (r0 != r6) goto L7e
                X.Hwg.A00(r8)
            L13:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L16:
                boolean r3 = r7.Z$0
                goto L42
            L19:
                X.Hwg.A00(r8)
                com.facebook.aura.pairs.PairsGuidanceSave r0 = r7.$save
                r7.label = r1
                X.27k<java.lang.Boolean> r0 = r0.result
                java.lang.Object r8 = X.C3cG.A0W(r0, r7)
                if (r8 != r5) goto L2c
                return r5
            L29:
                X.Hwg.A00(r8)
            L2c:
                boolean r3 = X.AnonymousClass001.A1X(r8)
                com.facebook.aura.pairs.PairsGuidanceViewModel r1 = r7.this$0     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
                com.facebook.aura.pairs.PairsGuidanceViewModel$follow$2$reread$1 r0 = new com.facebook.aura.pairs.PairsGuidanceViewModel$follow$2$reread$1     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
                r0.<init>(r1, r4)     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
                r7.Z$0 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
                r7.label = r2     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
                java.lang.Object r8 = com.facebook.aura.pairs.PairsGuidanceViewModelKt.io(r0, r7)     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
                if (r8 != r5) goto L45
                goto L83
            L42:
                X.Hwg.A00(r8)     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
            L45:
                com.facebook.aura.pairs.PairsDiscretionDocument r8 = (com.facebook.aura.pairs.PairsDiscretionDocument) r8     // Catch: com.facebook.aura.pairs.PairsException -> L48 java.util.concurrent.CancellationException -> L84
                goto L49
            L48:
                r8 = r4
            L49:
                com.facebook.aura.pairs.PairsGuidanceViewModel r0 = r7.this$0
                r0.saveJob = r4
                com.facebook.aura.pairs.PairsRepository r1 = r0.repository
                com.facebook.aura.pairs.PairsGuidanceSave r0 = r7.$save
                r1.finishGuidanceSave(r0)
                com.facebook.aura.pairs.PairsGuidanceViewModel r1 = r7.this$0
                com.facebook.aura.pairs.PairsGuidanceSave r0 = r7.$save
                java.lang.String r0 = r0.text
                boolean r2 = com.facebook.aura.pairs.PairsGuidanceViewModel.access$finishSave(r1, r0, r3, r8)
                if (r2 != 0) goto L64
                boolean r0 = r7.$announcesFailure
                if (r0 == 0) goto L13
            L64:
                com.facebook.aura.pairs.PairsGuidanceViewModel r0 = r7.this$0
                X.3Em<com.facebook.aura.pairs.PairsGuidanceEffect> r1 = r0._effects
                if (r2 == 0) goto L7b
                com.facebook.aura.pairs.PairsGuidanceEffect$Saved r0 = com.facebook.aura.pairs.PairsGuidanceEffect.Saved.INSTANCE
            L6c:
                r7.L$0 = r4
                r7.Z$0 = r3
                r7.Z$1 = r2
                r7.label = r6
                java.lang.Object r0 = r1.emit(r0, r7)
                if (r0 != r5) goto L13
                return r5
            L7b:
                com.facebook.aura.pairs.PairsGuidanceEffect$NotSaved r0 = com.facebook.aura.pairs.PairsGuidanceEffect.NotSaved.INSTANCE
                goto L6c
            L7e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L83:
                return r5
            L84:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsGuidanceViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsGuidanceViewModel$reload$3", f = "PairsGuidanceViewModel.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsGuidanceViewModel$reload$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsGuidanceViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsGuidanceViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            PairsGuidanceUiState value;
            PairsGuidanceUiState pairsGuidanceUiState;
            PairsGuidanceUiState value2;
            PairsGuidanceUiState pairsGuidanceUiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    PairsGuidanceViewModel$reload$3$document$1 pairsGuidanceViewModel$reload$3$document$1 = new PairsGuidanceViewModel$reload$3$document$1(PairsGuidanceViewModel.this, null);
                    this.label = 1;
                    obj = PairsGuidanceViewModelKt.io(pairsGuidanceViewModel$reload$3$document$1, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                PairsDiscretionDocument pairsDiscretionDocument = (PairsDiscretionDocument) obj;
                BLG<PairsGuidanceUiState> blg = PairsGuidanceViewModel.this._uiState;
                do {
                    value2 = blg.getValue();
                    pairsGuidanceUiState2 = value2;
                } while (!blg.A6e(value2, new PairsGuidanceUiState(new PairsGuidanceLoad.Loaded(pairsDiscretionDocument), pairsGuidanceUiState2.draft, pairsGuidanceUiState2.save)));
            } catch (PairsException unused) {
                BLG<PairsGuidanceUiState> blg2 = PairsGuidanceViewModel.this._uiState;
                do {
                    value = blg2.getValue();
                    pairsGuidanceUiState = value;
                    if (!(pairsGuidanceUiState.load instanceof PairsGuidanceLoad.Loaded)) {
                        pairsGuidanceUiState = new PairsGuidanceUiState(PairsGuidanceLoad.Failed.INSTANCE, pairsGuidanceUiState.draft, pairsGuidanceUiState.save);
                    }
                } while (!blg2.A6e(value, pairsGuidanceUiState));
            }
            return Unit.INSTANCE;
        }
    }

    public PairsGuidanceViewModel(PairsRepository pairsRepository, String str) {
        boolean zA1a = AnonymousClass002.A1a(pairsRepository, str);
        this.repository = pairsRepository;
        this.chatSessionId = str;
        C9286GCn c9286GCnA14 = C3cG.A14(new PairsGuidanceUiState(PairsGuidanceLoad.Loading.INSTANCE, null, PairsGuidanceSaveState.Idle.INSTANCE));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A01, 0, zA1a ? 1 : 0);
        this._effects = c9290GCrA12;
        this.effects = C3pd.A00(c9290GCrA12);
        reload();
    }

    public final void onDraftChange(String str) {
        PairsGuidanceUiState value;
        PairsGuidanceUiState pairsGuidanceUiState;
        C7384Etj.A0Y(str, 0);
        BLG<PairsGuidanceUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            pairsGuidanceUiState = value;
        } while (!blg.A6e(value, new PairsGuidanceUiState(pairsGuidanceUiState.load, str, C7384Etj.areEqual(pairsGuidanceUiState.save, PairsGuidanceSaveState.NotSaved.INSTANCE) ? PairsGuidanceSaveState.Idle.INSTANCE : pairsGuidanceUiState.save)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean finishSave(java.lang.String r5, boolean r6, com.facebook.aura.pairs.PairsDiscretionDocument r7) {
        /*
            r4 = this;
            X.BLG<com.facebook.aura.pairs.PairsGuidanceUiState> r0 = r4._uiState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.pairs.PairsGuidanceUiState r0 = (com.facebook.aura.pairs.PairsGuidanceUiState) r0
            com.facebook.aura.pairs.PairsGuidanceLoad r3 = r0.load
            if (r7 == 0) goto L32
            if (r6 != 0) goto L15
            boolean r0 = r7.isSaved(r5)
            r6 = 0
            if (r0 == 0) goto L16
        L15:
            r6 = 1
        L16:
            com.facebook.aura.pairs.PairsGuidanceLoad$Loaded r3 = new com.facebook.aura.pairs.PairsGuidanceLoad$Loaded
            r3.<init>(r7)
        L1b:
            com.facebook.aura.pairs.PairsGuidanceLoad r3 = (com.facebook.aura.pairs.PairsGuidanceLoad) r3
            X.BLG<com.facebook.aura.pairs.PairsGuidanceUiState> r2 = r4._uiState
            if (r6 == 0) goto L2f
            r5 = 0
            com.facebook.aura.pairs.PairsGuidanceSaveState$Idle r1 = com.facebook.aura.pairs.PairsGuidanceSaveState.Idle.INSTANCE
        L24:
            com.facebook.aura.pairs.PairsGuidanceSaveState r1 = (com.facebook.aura.pairs.PairsGuidanceSaveState) r1
            com.facebook.aura.pairs.PairsGuidanceUiState r0 = new com.facebook.aura.pairs.PairsGuidanceUiState
            r0.<init>(r3, r5, r1)
            X.AnonymousClass002.A1I(r2, r0)
            return r6
        L2f:
            com.facebook.aura.pairs.PairsGuidanceSaveState$NotSaved r1 = com.facebook.aura.pairs.PairsGuidanceSaveState.NotSaved.INSTANCE
            goto L24
        L32:
            boolean r0 = r3 instanceof com.facebook.aura.pairs.PairsGuidanceLoad.Loaded
            if (r0 == 0) goto L4b
            com.facebook.aura.pairs.PairsGuidanceLoad$Loaded r3 = (com.facebook.aura.pairs.PairsGuidanceLoad.Loaded) r3
            if (r6 == 0) goto L1b
            com.facebook.aura.pairs.PairsDiscretionDocument r0 = r3.document
            java.lang.String r1 = r0.replacingOwnerText(r5)
            com.facebook.aura.pairs.PairsDiscretionDocument r0 = new com.facebook.aura.pairs.PairsDiscretionDocument
            r0.<init>(r1)
            com.facebook.aura.pairs.PairsGuidanceLoad$Loaded r3 = new com.facebook.aura.pairs.PairsGuidanceLoad$Loaded
            r3.<init>(r0)
            goto L1b
        L4b:
            com.facebook.aura.pairs.PairsGuidanceLoad$Failed r3 = com.facebook.aura.pairs.PairsGuidanceLoad.Failed.INSTANCE
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsGuidanceViewModel.finishSave(java.lang.String, boolean, com.facebook.aura.pairs.PairsDiscretionDocument):boolean");
    }

    private final void follow(PairsGuidanceSave pairsGuidanceSave, boolean z) {
        PairsGuidanceUiState value;
        PairsGuidanceUiState pairsGuidanceUiState;
        HtJ htJA13 = AnonymousClass006.A13(this.loadJob);
        BLG<PairsGuidanceUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            pairsGuidanceUiState = value;
        } while (!blg.A6e(value, new PairsGuidanceUiState(pairsGuidanceUiState.load, pairsGuidanceUiState.draft, new PairsGuidanceSaveState.Waiting(pairsGuidanceSave.text))));
        this.saveJob = AnonymousClass001.A11(new AnonymousClass2(pairsGuidanceSave, this, z, htJA13), AEu.A00(this));
    }

    public final C22I<PairsGuidanceEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<PairsGuidanceUiState> getUiState() {
        return this.uiState;
    }

    public final void reload() {
        PairsGuidanceUiState value;
        PairsGuidanceUiState pairsGuidanceUiState;
        if (this.saveJob == null) {
            PairsGuidanceSave pairsGuidanceSavePendingGuidanceSave = this.repository.pendingGuidanceSave(this.chatSessionId);
            if (pairsGuidanceSavePendingGuidanceSave != null) {
                follow(pairsGuidanceSavePendingGuidanceSave, true);
                return;
            }
            HtJ htJA13 = AnonymousClass006.A13(this.loadJob);
            BLG<PairsGuidanceUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                pairsGuidanceUiState = value;
            } while (!blg.A6e(value, new PairsGuidanceUiState(pairsGuidanceUiState.load instanceof PairsGuidanceLoad.Failed ? PairsGuidanceLoad.Loading.INSTANCE : pairsGuidanceUiState.load, pairsGuidanceUiState.draft, pairsGuidanceUiState.save instanceof PairsGuidanceSaveState.Waiting ? PairsGuidanceSaveState.Idle.INSTANCE : pairsGuidanceUiState.save)));
            this.loadJob = AnonymousClass001.A11(new AnonymousClass3(htJA13), AEu.A00(this));
        }
    }

    public final void save() {
        PairsGuidanceLoad.Loaded loaded;
        PairsDiscretionDocument pairsDiscretionDocument;
        String str;
        PairsGuidanceUiState value = this._uiState.getValue();
        PairsGuidanceLoad pairsGuidanceLoad = value.load;
        if (!(pairsGuidanceLoad instanceof PairsGuidanceLoad.Loaded) || (loaded = (PairsGuidanceLoad.Loaded) pairsGuidanceLoad) == null || (pairsDiscretionDocument = loaded.document) == null || (str = value.draft) == null || (value.save instanceof PairsGuidanceSaveState.Waiting) || !PairsGuidanceViewModelKt.canSaveGuidance(pairsDiscretionDocument, str)) {
            return;
        }
        follow(this.repository.saveGuidance(this.chatSessionId, pairsDiscretionDocument, str), false);
    }
}

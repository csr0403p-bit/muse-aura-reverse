package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
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
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.pairs.PairsAcceptPreferencesEffect;
import com.facebook.aura.pairs.PairsAcceptPreferencesUiState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<PairsAcceptPreferencesEffect> _effects;
    public final BLG<PairsAcceptPreferencesUiState> _uiState;
    public final C22I<PairsAcceptPreferencesEffect> effects;
    public final PairsRepository repository;
    public final String token;
    public final C1BN<PairsAcceptPreferencesUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$1", f = "PairsAcceptPreferencesViewModel.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsAcceptPreferencesViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsAcceptPreferencesViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            BLG blg;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel = PairsAcceptPreferencesViewModel.this;
                blg = pairsAcceptPreferencesViewModel._uiState;
                this.L$0 = blg;
                this.label = 1;
                obj = pairsAcceptPreferencesViewModel.loadState(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                blg = (BLG) this.L$0;
                Hwg.A00(obj);
            }
            blg.Af8(obj);
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<PairsAcceptPreferencesViewModel> {
        public static final int $stable = 8;
        public final String token;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PairsAcceptPreferencesViewModel create() {
            return new PairsAcceptPreferencesViewModel(PairsRepository.Companion.getInstance(this.userSession), this.token);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.token = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$accept$2", f = "PairsAcceptPreferencesViewModel.kt", l = {75, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 84, 88, 90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$accept$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsAcceptPreferencesUiState.Ready $ready;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PairsAcceptPreferencesUiState.Ready ready, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$ready = ready;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsAcceptPreferencesViewModel.this.new AnonymousClass2(this.$ready, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsAcceptPreferencesViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsAcceptPreferencesViewModel", f = "PairsAcceptPreferencesViewModel.kt", l = {117}, m = "loadState", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$loadState$1, reason: invalid class name and case insensitive filesystem */
    public final class C128981 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C128981(HtJ<? super C128981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsAcceptPreferencesViewModel.this.loadState(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$removeEarlierRequest$1", f = "PairsAcceptPreferencesViewModel.kt", l = {102, MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$removeEarlierRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C128991 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsContact $contact;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128991(PairsContact pairsContact, HtJ<? super C128991> htJ) {
            super(2, htJ);
            this.$contact = pairsContact;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsAcceptPreferencesViewModel.this.new C128991(this.$contact, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            try {
            } catch (PairsException e) {
                PairsError pairsError = e.error;
                PairsError pairsError2 = PairsError.NOT_FOUND;
                i = R.string._name_removed__res_0x7f120d86;
                if (pairsError == pairsError2) {
                }
            }
            if (i2 == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = PairsAcceptPreferencesViewModel.this.repository;
                PairsContact pairsContact = this.$contact;
                this.label = 1;
                if (pairsRepository.removeContact(pairsContact, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            i = R.string._name_removed__res_0x7f120d7c;
            C3Em<PairsAcceptPreferencesEffect> c3Em = PairsAcceptPreferencesViewModel.this._effects;
            PairsAcceptPreferencesEffect.Message message = new PairsAcceptPreferencesEffect.Message(i);
            this.I$0 = i;
            this.label = 2;
            if (c3Em.emit(message, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C128991) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public PairsAcceptPreferencesViewModel(PairsRepository pairsRepository, String str) {
        boolean zA1a = AnonymousClass002.A1a(pairsRepository, str);
        this.repository = pairsRepository;
        this.token = str;
        C9286GCn c9286GCnA01 = HnJ.A01(PairsAcceptPreferencesUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A01, 0, zA1a ? 1 : 0);
        this._effects = c9290GCrA12;
        this.effects = C3pd.A00(c9290GCrA12);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    public final void onLevelSelected(PairsLevel pairsLevel) {
        PairsAcceptPreferencesUiState value;
        PairsAcceptPreferencesUiState pairsAcceptPreferencesUiStateCopy;
        C7384Etj.A0Y(pairsLevel, 0);
        BLG<PairsAcceptPreferencesUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            pairsAcceptPreferencesUiStateCopy = value;
            if (pairsAcceptPreferencesUiStateCopy instanceof PairsAcceptPreferencesUiState.Ready) {
                PairsAcceptPreferencesUiState.Ready ready = (PairsAcceptPreferencesUiState.Ready) pairsAcceptPreferencesUiStateCopy;
                pairsAcceptPreferencesUiStateCopy = PairsAcceptPreferencesViewModelKt.copy(ready, pairsLevel, ready.isAccepting);
            }
        } while (!blg.A6e(value, pairsAcceptPreferencesUiStateCopy));
    }

    public final void removeEarlierRequest(PairsContact pairsContact) {
        C7384Etj.A0Y(pairsContact, 0);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128991(pairsContact, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadState(X.HtJ<? super com.facebook.aura.pairs.PairsAcceptPreferencesUiState> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsAcceptPreferencesViewModel.C128981
            if (r0 == 0) goto L22
            r5 = r7
            com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$loadState$1 r5 = (com.facebook.aura.pairs.PairsAcceptPreferencesViewModel.C128981) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L28
            java.lang.Object r3 = r5.L$0
            com.facebook.aura.pairs.PairsHeldInvite r3 = (com.facebook.aura.pairs.PairsHeldInvite) r3
            goto L50
        L22:
            com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$loadState$1 r5 = new com.facebook.aura.pairs.PairsAcceptPreferencesViewModel$loadState$1
            r5.<init>(r7)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r0)
            com.facebook.aura.pairs.PairsRepository r1 = r6.repository
            java.lang.String r0 = r6.token
            com.facebook.aura.pairs.PairsHeldInvite r3 = r1.heldInvite(r0)
            if (r3 != 0) goto L43
            r2 = 2131889519(0x7f120d6f, float:1.9413704E38)
        L3d:
            com.facebook.aura.pairs.PairsAcceptPreferencesUiState$Message r0 = new com.facebook.aura.pairs.PairsAcceptPreferencesUiState$Message
            r0.<init>(r2)
            return r0
        L43:
            com.facebook.aura.pairs.PairsRepository r0 = r6.repository     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            r5.L$0 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            r5.label = r2     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            java.lang.Object r0 = r0.access(r5)     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            if (r0 != r4) goto L53
            goto L85
        L50:
            X.Hwg.A00(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
        L53:
            com.facebook.aura.pairs.PairsAccess r0 = (com.facebook.aura.pairs.PairsAccess) r0     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            boolean r0 = r0.canAcceptInvites     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            if (r0 != 0) goto L62
            r0 = 2131889489(0x7f120d51, float:1.9413643E38)
            com.facebook.aura.pairs.PairsAcceptPreferencesUiState$Message r4 = new com.facebook.aura.pairs.PairsAcceptPreferencesUiState$Message     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            r4.<init>(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            goto L86
        L62:
            X.Ey9 r0 = com.facebook.aura.pairs.PairsLevel.getEntries()     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            X.AHD r2 = X.AGI.A07(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            com.facebook.aura.pairs.PairsLevel r1 = com.facebook.aura.pairs.PairsLevel.ASK_FIRST     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            r0 = 0
            com.facebook.aura.pairs.PairsAcceptPreferencesUiState$Ready r4 = new com.facebook.aura.pairs.PairsAcceptPreferencesUiState$Ready     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            r4.<init>(r3, r2, r1, r0)     // Catch: com.facebook.aura.pairs.PairsException -> L73 java.util.concurrent.CancellationException -> L88
            goto L87
        L73:
            r0 = move-exception
            com.facebook.aura.pairs.PairsError r1 = r0.error
            com.facebook.aura.pairs.PairsError r0 = com.facebook.aura.pairs.PairsError.UNAVAILABLE
            if (r1 == r0) goto L81
            com.facebook.aura.pairs.PairsError r0 = com.facebook.aura.pairs.PairsError.NOT_FOUND
            r2 = 2131889525(0x7f120d75, float:1.9413716E38)
            if (r1 != r0) goto L3d
        L81:
            r2 = 2131889489(0x7f120d51, float:1.9413643E38)
            goto L3d
        L85:
            return r4
        L86:
            return r4
        L87:
            return r4
        L88:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsAcceptPreferencesViewModel.loadState(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    private final void updateReady(G0U<? super PairsAcceptPreferencesUiState.Ready, PairsAcceptPreferencesUiState.Ready> g0u) {
        ?? value;
        PairsAcceptPreferencesUiState.Ready readyInvoke;
        BLG blg = this._uiState;
        do {
            value = blg.getValue();
            readyInvoke = value;
            if (value instanceof PairsAcceptPreferencesUiState.Ready) {
                readyInvoke = g0u.invoke(value);
            }
        } while (!blg.A6e(value, readyInvoke));
    }

    public final void accept() {
        PairsAcceptPreferencesUiState.Ready ready;
        PairsAcceptPreferencesUiState value;
        PairsAcceptPreferencesUiState pairsAcceptPreferencesUiStateCopy;
        PairsAcceptPreferencesUiState value2 = this._uiState.getValue();
        if (!(value2 instanceof PairsAcceptPreferencesUiState.Ready) || (ready = (PairsAcceptPreferencesUiState.Ready) value2) == null || ready.isAccepting) {
            return;
        }
        BLG<PairsAcceptPreferencesUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            pairsAcceptPreferencesUiStateCopy = value;
            if (pairsAcceptPreferencesUiStateCopy instanceof PairsAcceptPreferencesUiState.Ready) {
                PairsAcceptPreferencesUiState.Ready ready2 = (PairsAcceptPreferencesUiState.Ready) pairsAcceptPreferencesUiStateCopy;
                pairsAcceptPreferencesUiStateCopy = PairsAcceptPreferencesViewModelKt.copy(ready2, ready2.selectedLevel, true);
            }
        } while (!blg.A6e(value, pairsAcceptPreferencesUiStateCopy));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(ready, null), AEu.A00(this));
    }

    public final C22I<PairsAcceptPreferencesEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<PairsAcceptPreferencesUiState> getUiState() {
        return this.uiState;
    }
}

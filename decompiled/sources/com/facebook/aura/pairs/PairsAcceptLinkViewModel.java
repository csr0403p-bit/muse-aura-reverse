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
import X.C3Pi;
import X.C3UX;
import X.C9286GCn;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.pairs.PairsAcceptLinkUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PairsAcceptLinkViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<PairsAcceptLinkUiState> _uiState;
    public boolean opensInChat;
    public final PairsRepository repository;
    public final String token;
    public final C1BN<PairsAcceptLinkUiState> uiState;

    public final class Factory extends AuraViewModelFactory<PairsAcceptLinkViewModel> {
        public static final int $stable = 8;
        public final boolean opensInChat;
        public final String token;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PairsAcceptLinkViewModel create() {
            return new PairsAcceptLinkViewModel(PairsRepository.Companion.getInstance(this.userSession), this.token, this.opensInChat);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, boolean z) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.token = str;
            this.opensInChat = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsAcceptLinkViewModel$load$1", f = "PairsAcceptLinkViewModel.kt", l = {66, 78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkViewModel$load$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsAcceptLinkViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsAcceptLinkViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r3 = 2
                r5 = 1
                if (r0 == 0) goto L19
                if (r0 == r5) goto L3c
                if (r0 != r3) goto L81
                java.lang.Object r1 = r6.L$0
                X.BLG r1 = (X.BLG) r1
                X.Hwg.A00(r7)
            L13:
                r1.Af8(r7)
            L16:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L19:
                X.Hwg.A00(r7)
                com.facebook.aura.pairs.PairsAcceptLinkViewModel r0 = com.facebook.aura.pairs.PairsAcceptLinkViewModel.this
                boolean r0 = r0.opensInChat
                if (r0 == 0) goto L72
                com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
                boolean r0 = r0.isConnectionsTabEnabled()
                if (r0 == 0) goto L72
                com.facebook.aura.pairs.PairsAcceptLinkViewModel r2 = com.facebook.aura.pairs.PairsAcceptLinkViewModel.this
                r0 = 0
                r2.opensInChat = r0
                com.facebook.aura.pairs.PairsRepository r1 = r2.repository
                java.lang.String r0 = r2.token
                r6.label = r5
                java.lang.Object r7 = r1.openInChat(r0, r6)
                if (r7 != r4) goto L3f
                return r4
            L3c:
                X.Hwg.A00(r7)
            L3f:
                com.facebook.aura.pairs.PairsInviteOpenOutcome r7 = (com.facebook.aura.pairs.PairsInviteOpenOutcome) r7
                com.facebook.aura.pairs.PairsInviteOpenOutcome$PostedToChat r0 = com.facebook.aura.pairs.PairsInviteOpenOutcome.PostedToChat.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r7, r0)
                if (r0 == 0) goto L53
                com.facebook.aura.pairs.PairsAcceptLinkViewModel r0 = com.facebook.aura.pairs.PairsAcceptLinkViewModel.this
                X.BLG<com.facebook.aura.pairs.PairsAcceptLinkUiState> r2 = r0._uiState
                com.facebook.aura.pairs.PairsAcceptLinkUiState$PostedToChat r1 = com.facebook.aura.pairs.PairsAcceptLinkUiState.PostedToChat.INSTANCE
            L4f:
                r2.Af8(r1)
                goto L16
            L53:
                boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsInviteOpenOutcome.AlreadyPaired
                if (r0 == 0) goto L65
                com.facebook.aura.pairs.PairsAcceptLinkViewModel r0 = com.facebook.aura.pairs.PairsAcceptLinkViewModel.this
                X.BLG<com.facebook.aura.pairs.PairsAcceptLinkUiState> r2 = r0._uiState
                com.facebook.aura.pairs.PairsInviteOpenOutcome$AlreadyPaired r7 = (com.facebook.aura.pairs.PairsInviteOpenOutcome.AlreadyPaired) r7
                java.lang.String r0 = r7.museId
                com.facebook.aura.pairs.PairsAcceptLinkUiState$AlreadyPaired r1 = new com.facebook.aura.pairs.PairsAcceptLinkUiState$AlreadyPaired
                r1.<init>(r0)
                goto L4f
            L65:
                com.facebook.aura.pairs.PairsInviteOpenOutcome$ReviewInSheet r0 = com.facebook.aura.pairs.PairsInviteOpenOutcome.ReviewInSheet.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r7, r0)
                if (r0 != 0) goto L72
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L72:
                com.facebook.aura.pairs.PairsAcceptLinkViewModel r0 = com.facebook.aura.pairs.PairsAcceptLinkViewModel.this
                X.BLG<com.facebook.aura.pairs.PairsAcceptLinkUiState> r1 = r0._uiState
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = com.facebook.aura.pairs.PairsAcceptLinkViewModel.access$loadState(r0, r6)
                if (r7 != r4) goto L13
                return r4
            L81:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsAcceptLinkViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsAcceptLinkViewModel", f = "PairsAcceptLinkViewModel.kt", l = {96}, m = "loadState", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkViewModel$loadState$1, reason: invalid class name and case insensitive filesystem */
    public final class C128961 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C128961(HtJ<? super C128961> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsAcceptLinkViewModel.this.loadState(this);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsError.values().length];
            try {
                AnonymousClass002.A13(PairsError.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsError.NOT_FOUND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadState(X.HtJ<? super com.facebook.aura.pairs.PairsAcceptLinkUiState> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsAcceptLinkViewModel.loadState(X.HtJ):java.lang.Object");
    }

    private final PairsAcceptLinkUiState message(PairsAcceptLinkFailure pairsAcceptLinkFailure) {
        return new PairsAcceptLinkUiState.Message(pairsAcceptLinkFailure);
    }

    public final C1BN<PairsAcceptLinkUiState> getUiState() {
        return this.uiState;
    }

    public final void retry() {
        this._uiState.Af8(PairsAcceptLinkUiState.Loading.INSTANCE);
        load();
    }

    public PairsAcceptLinkViewModel(PairsRepository pairsRepository, String str, boolean z) {
        AnonymousClass003.A0u(pairsRepository, str);
        this.repository = pairsRepository;
        this.token = str;
        this.opensInChat = z;
        C9286GCn c9286GCnA01 = HnJ.A01(PairsAcceptLinkUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3Pi.A00(c9286GCnA01);
        load();
    }

    private final void load() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}

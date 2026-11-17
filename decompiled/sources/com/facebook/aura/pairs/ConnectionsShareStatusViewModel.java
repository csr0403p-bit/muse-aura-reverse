package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C9286GCn;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.pairs.ConnectionsShareStatusUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class ConnectionsShareStatusViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConnectionsShareStatusUiState> _uiState;
    public final String messageId;
    public final PairsRepository repository;
    public final C1BN<ConnectionsShareStatusUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareStatusViewModel$1", f = "ConnectionsShareStatusViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft, R.styleable.maplibre_MapView_maplibre_uiLogoGravity, 44}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareStatusViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsShareStatusViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsShareStatusViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0063 -> B:8:0x001a). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r4 = 3
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L66
                if (r0 == r2) goto L74
                if (r0 == r3) goto L38
                if (r0 != r4) goto L9b
                java.lang.Object r8 = r9.L$1
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r7 = r9.L$0
                com.facebook.aura.pairs.ConnectionsShareStatus r7 = (com.facebook.aura.pairs.ConnectionsShareStatus) r7
                X.Hwg.A00(r10)
            L1a:
                com.facebook.aura.pairs.ConnectionsShareStatus r10 = (com.facebook.aura.pairs.ConnectionsShareStatus) r10
                if (r10 != 0) goto L1f
                r10 = r7
            L1f:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L35
                java.lang.Object r0 = r8.next()
                long r0 = X.C3cG.A05(r0)
                if (r10 == 0) goto L46
                boolean r6 = r10.isFinal()
                if (r6 != r2) goto L46
            L35:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
            L37:
                return r5
            L38:
                long r0 = r9.J$0
                java.lang.Object r8 = r9.L$1
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r7 = r9.L$0
                com.facebook.aura.pairs.ConnectionsShareStatus r7 = (com.facebook.aura.pairs.ConnectionsShareStatus) r7
                X.Hwg.A00(r10)
                goto L55
            L46:
                r9.L$0 = r10
                r9.L$1 = r8
                r9.J$0 = r0
                r9.label = r3
                java.lang.Object r6 = X.C7Bq.A01(r0, r9)
                if (r6 == r5) goto L37
                r7 = r10
            L55:
                com.facebook.aura.pairs.ConnectionsShareStatusViewModel r6 = com.facebook.aura.pairs.ConnectionsShareStatusViewModel.this
                r9.L$0 = r7
                r9.L$1 = r8
                r9.J$0 = r0
                r9.label = r4
                java.lang.Object r10 = com.facebook.aura.pairs.ConnectionsShareStatusViewModel.access$read(r6, r9)
                if (r10 != r5) goto L1a
                return r5
            L66:
                X.Hwg.A00(r10)
                com.facebook.aura.pairs.ConnectionsShareStatusViewModel r0 = com.facebook.aura.pairs.ConnectionsShareStatusViewModel.this
                r9.label = r2
                java.lang.Object r10 = com.facebook.aura.pairs.ConnectionsShareStatusViewModel.access$read(r0, r9)
                if (r10 != r5) goto L77
                return r5
            L74:
                X.Hwg.A00(r10)
            L77:
                com.facebook.aura.pairs.ConnectionsShareStatus r10 = (com.facebook.aura.pairs.ConnectionsShareStatus) r10
                if (r10 != 0) goto L94
                com.facebook.aura.pairs.ConnectionsShareStatusViewModel r0 = com.facebook.aura.pairs.ConnectionsShareStatusViewModel.this
                X.BLG<com.facebook.aura.pairs.ConnectionsShareStatusUiState> r0 = r0._uiState
                java.lang.Object r1 = r0.getValue()
                com.facebook.aura.pairs.ConnectionsShareStatusUiState$Loading r0 = com.facebook.aura.pairs.ConnectionsShareStatusUiState.Loading.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L94
                com.facebook.aura.pairs.ConnectionsShareStatusViewModel r0 = com.facebook.aura.pairs.ConnectionsShareStatusViewModel.this
                X.BLG<com.facebook.aura.pairs.ConnectionsShareStatusUiState> r1 = r0._uiState
                com.facebook.aura.pairs.ConnectionsShareStatusUiState$Unavailable r0 = com.facebook.aura.pairs.ConnectionsShareStatusUiState.Unavailable.INSTANCE
                r1.Af8(r0)
            L94:
                java.util.List<java.lang.Long> r0 = com.facebook.aura.pairs.ConnectionsShareStatusViewModelKt.SHARE_STATUS_POLL_DELAYS_MS
                java.util.Iterator r8 = r0.iterator()
                goto L1f
            L9b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsShareStatusViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final class Factory extends AuraViewModelFactory<ConnectionsShareStatusViewModel> {
        public static final int $stable = 8;
        public final String messageId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsShareStatusViewModel create() {
            return new ConnectionsShareStatusViewModel(PairsRepository.Companion.getInstance(this.userSession), this.messageId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.messageId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareStatusViewModel", f = "ConnectionsShareStatusViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = BrowserOperationCatalogKt.READ, v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareStatusViewModel$read$1, reason: invalid class name and case insensitive filesystem */
    public final class C128381 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C128381(HtJ<? super C128381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsShareStatusViewModel.this.read(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object read(X.HtJ<? super com.facebook.aura.pairs.ConnectionsShareStatus> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.ConnectionsShareStatusViewModel.C128381
            if (r0 == 0) goto L1f
            r6 = r8
            com.facebook.aura.pairs.ConnectionsShareStatusViewModel$read$1 r6 = (com.facebook.aura.pairs.ConnectionsShareStatusViewModel.C128381) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L25
            goto L3a
        L1f:
            com.facebook.aura.pairs.ConnectionsShareStatusViewModel$read$1 r6 = new com.facebook.aura.pairs.ConnectionsShareStatusViewModel$read$1
            r6.<init>(r8)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r5)
            com.facebook.aura.pairs.PairsRepository r1 = r7.repository     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            java.lang.String r0 = r7.messageId     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            r6.label = r2     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            java.lang.Object r5 = r1.savedMessageStatus(r0, r6)     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            if (r5 != r4) goto L3d
            return r4
        L3a:
            X.Hwg.A00(r5)     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
        L3d:
            com.facebook.aura.pairs.ConnectionsShareStatus r5 = (com.facebook.aura.pairs.ConnectionsShareStatus) r5     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            if (r5 == 0) goto L6d
            X.BLG<com.facebook.aura.pairs.ConnectionsShareStatusUiState> r1 = r7._uiState     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            com.facebook.aura.pairs.ConnectionsShareStatusUiState$Known r0 = new com.facebook.aura.pairs.ConnectionsShareStatusUiState$Known     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            r0.<init>(r5)     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            X.AnonymousClass001.A1E(r1, r3, r0)     // Catch: com.facebook.aura.pairs.PairsException -> L4c java.util.concurrent.CancellationException -> L6e
            return r5
        L4c:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsShareStatusViewModel"
            java.lang.String r0 = "saved message read failed: %s"
            X.CFK.A0H(r1, r0, r2)
            X.BLG<com.facebook.aura.pairs.ConnectionsShareStatusUiState> r0 = r7._uiState
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.pairs.ConnectionsShareStatusUiState$Loading r0 = com.facebook.aura.pairs.ConnectionsShareStatusUiState.Loading.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L6d
            X.BLG<com.facebook.aura.pairs.ConnectionsShareStatusUiState> r1 = r7._uiState
            com.facebook.aura.pairs.ConnectionsShareStatusUiState$Unavailable r0 = com.facebook.aura.pairs.ConnectionsShareStatusUiState.Unavailable.INSTANCE
            r1.Af8(r0)
        L6d:
            return r3
        L6e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsShareStatusViewModel.read(X.HtJ):java.lang.Object");
    }

    public final C1BN<ConnectionsShareStatusUiState> getUiState() {
        return this.uiState;
    }

    public ConnectionsShareStatusViewModel(PairsRepository pairsRepository, String str) {
        AnonymousClass003.A0u(pairsRepository, str);
        this.repository = pairsRepository;
        this.messageId = str;
        C9286GCn c9286GCnA01 = HnJ.A01(ConnectionsShareStatusUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}

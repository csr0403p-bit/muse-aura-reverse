package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BGK;
import X.BLG;
import X.BQI;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ConnectionsShareViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConnectionsShareUiState> _uiState;
    public final String itemId;
    public final String kind;
    public volatile Map<String, PairsImageRef> photos;
    public final PairsRepository repository;
    public final C1BN<ConnectionsShareUiState> uiState;

    public final class Factory extends AuraViewModelFactory<ConnectionsShareViewModel> {
        public static final int $stable = 8;
        public final String itemId;
        public final String kind;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsShareViewModel create() {
            return new ConnectionsShareViewModel(PairsRepository.Companion.getInstance(this.userSession), this.kind, this.itemId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.kind = str;
            this.itemId = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareViewModel", f = "ConnectionsShareViewModel.kt", l = {161}, m = "canChangeConnections", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareViewModel$canChangeConnections$1, reason: invalid class name */
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
            return ConnectionsShareViewModel.this.canChangeConnections(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareViewModel$load$1", f = "ConnectionsShareViewModel.kt", l = {172, 176, 177}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareViewModel$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C128391 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C128391(HtJ<? super C128391> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsShareViewModel.this.new C128391(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsShareViewModel.this.new C128391(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[Catch: PairsException -> 0x00ab, CancellationException -> 0x00dd, TryCatch #2 {PairsException -> 0x00ab, CancellationException -> 0x00dd, blocks: (B:31:0x0075, B:32:0x0078, B:33:0x007e, B:35:0x008d, B:36:0x008f, B:39:0x00a8, B:27:0x0060, B:28:0x0063, B:15:0x0028, B:16:0x002b, B:19:0x0033, B:20:0x0035, B:22:0x0052, B:24:0x0055, B:12:0x001d), top: B:54:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[Catch: PairsException -> 0x00ab, CancellationException -> 0x00dd, TRY_LEAVE, TryCatch #2 {PairsException -> 0x00ab, CancellationException -> 0x00dd, blocks: (B:31:0x0075, B:32:0x0078, B:33:0x007e, B:35:0x008d, B:36:0x008f, B:39:0x00a8, B:27:0x0060, B:28:0x0063, B:15:0x0028, B:16:0x002b, B:19:0x0033, B:20:0x0035, B:22:0x0052, B:24:0x0055, B:12:0x001d), top: B:54:0x0007 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsShareViewModel.C128391.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareViewModel$loadMore$2", f = "ConnectionsShareViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareViewModel$loadMore$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $next;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$next = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsShareViewModel.this.new AnonymousClass2(this.$next, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectionsShareUiState value;
            ConnectionsShareUiState connectionsShareUiState;
            ConnectionsShareUiState value2;
            ConnectionsShareUiState connectionsShareUiState2;
            ConnectionsShareUiState value3;
            ConnectionsShareUiState connectionsShareUiState3;
            ArrayList arrayListA0h;
            ConnectionsShareUiState value4;
            ConnectionsShareUiState connectionsShareUiState4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        ConnectionsShareViewModel connectionsShareViewModel = ConnectionsShareViewModel.this;
                        String str = this.$next;
                        this.label = 1;
                        obj = connectionsShareViewModel.nonEmptyPage(str, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    ConnectionsShareTargetPage connectionsShareTargetPage = (ConnectionsShareTargetPage) obj;
                    BLG<ConnectionsShareUiState> blg = ConnectionsShareViewModel.this._uiState;
                    do {
                        value3 = blg.getValue();
                        connectionsShareUiState3 = value3;
                        ArrayList arrayListA0P = AbstractC0878AGe.A0P(connectionsShareTargetPage.targets, connectionsShareUiState3.targets);
                        HashSet hashSetA13 = C60O.A13();
                        arrayListA0h = C3cG.A0h();
                        Iterator it = arrayListA0P.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            AnonymousClass006.A1P(((ConnectionsShareTarget) next).connectionId, next, hashSetA13, arrayListA0h);
                        }
                    } while (!blg.A6e(value3, connectionsShareUiState3.copy(connectionsShareUiState3.phase, AGI.A07(arrayListA0h), connectionsShareUiState3.selected, connectionsShareUiState3.statuses, connectionsShareTargetPage.next, connectionsShareUiState3.isLoadingMore)));
                    BLG<ConnectionsShareUiState> blg2 = ConnectionsShareViewModel.this._uiState;
                    do {
                        value4 = blg2.getValue();
                        connectionsShareUiState4 = value4;
                    } while (!blg2.A6e(value4, connectionsShareUiState4.copy(connectionsShareUiState4.phase, connectionsShareUiState4.targets, connectionsShareUiState4.selected, connectionsShareUiState4.statuses, connectionsShareUiState4.next, false)));
                } catch (PairsException e) {
                    CFK.A0H(ConnectionsShareViewModelKt.TAG, "share targets page failed: %s", e.error);
                    BLG<ConnectionsShareUiState> blg3 = ConnectionsShareViewModel.this._uiState;
                    do {
                        value = blg3.getValue();
                        connectionsShareUiState = value;
                    } while (!blg3.A6e(value, connectionsShareUiState.copy(connectionsShareUiState.phase, connectionsShareUiState.targets, connectionsShareUiState.selected, connectionsShareUiState.statuses, connectionsShareUiState.next, false)));
                } catch (CancellationException e2) {
                    throw e2;
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<ConnectionsShareUiState> blg4 = ConnectionsShareViewModel.this._uiState;
                do {
                    value2 = blg4.getValue();
                    connectionsShareUiState2 = value2;
                } while (!blg4.A6e(value2, connectionsShareUiState2.copy(connectionsShareUiState2.phase, connectionsShareUiState2.targets, connectionsShareUiState2.selected, connectionsShareUiState2.statuses, connectionsShareUiState2.next, false)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareViewModel", f = "ConnectionsShareViewModel.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "loadPhotos", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareViewModel$loadPhotos$1, reason: invalid class name and case insensitive filesystem */
    public final class C128401 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C128401(HtJ<? super C128401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsShareViewModel.this.loadPhotos(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareViewModel", f = "ConnectionsShareViewModel.kt", l = {148, 154}, m = "nonEmptyPage", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareViewModel$nonEmptyPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C128411 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C128411(HtJ<? super C128411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsShareViewModel.this.nonEmptyPage(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareViewModel", f = "ConnectionsShareViewModel.kt", l = {93, 106, 109}, m = "send", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsShareViewModel$send$1, reason: invalid class name and case insensitive filesystem */
    public final class C128421 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C128421(HtJ<? super C128421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsShareViewModel.this.send(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsShareViewModel(PairsRepository pairsRepository, String str, String str2) {
        AnonymousClass005.A10(pairsRepository, str, str2);
        this.repository = pairsRepository;
        this.kind = str;
        this.itemId = str2;
        C9286GCn c9286GCnA14 = C3cG.A14(new ConnectionsShareUiState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 63, 0 == true ? 1 : 0));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        load();
        this.photos = AGH.A0E();
    }

    public final void toggle(String str) {
        ConnectionsShareUiState value;
        ConnectionsShareUiState connectionsShareUiState;
        boolean zContains;
        BQI<String> bqi;
        C7384Etj.A0Y(str, 0);
        if (!this._uiState.getValue().statuses.isEmpty()) {
            return;
        }
        BLG<ConnectionsShareUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            connectionsShareUiState = value;
            zContains = connectionsShareUiState.selected.contains(str);
            bqi = connectionsShareUiState.selected;
        } while (!blg.A6e(value, connectionsShareUiState.copy(connectionsShareUiState.phase, connectionsShareUiState.targets, AGI.A09(zContains ? BGK.A04(str, bqi) : BGK.A02(str, bqi)), connectionsShareUiState.statuses, connectionsShareUiState.next, connectionsShareUiState.isLoadingMore)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object canChangeConnections(X.HtJ<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsShareViewModel.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.pairs.ConnectionsShareViewModel$canChangeConnections$1 r4 = (com.facebook.aura.pairs.ConnectionsShareViewModel.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L24
            goto L37
        L1e:
            com.facebook.aura.pairs.ConnectionsShareViewModel$canChangeConnections$1 r4 = new com.facebook.aura.pairs.ConnectionsShareViewModel$canChangeConnections$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r2)
            com.facebook.aura.pairs.PairsRepository r0 = r5.repository     // Catch: com.facebook.aura.pairs.PairsException -> L41 java.util.concurrent.CancellationException -> L52
            r4.label = r3     // Catch: com.facebook.aura.pairs.PairsException -> L41 java.util.concurrent.CancellationException -> L52
            java.lang.Object r2 = r0.access(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L41 java.util.concurrent.CancellationException -> L52
            if (r2 != r1) goto L3a
            return r1
        L37:
            X.Hwg.A00(r2)     // Catch: com.facebook.aura.pairs.PairsException -> L41 java.util.concurrent.CancellationException -> L52
        L3a:
            com.facebook.aura.pairs.PairsAccess r2 = (com.facebook.aura.pairs.PairsAccess) r2     // Catch: com.facebook.aura.pairs.PairsException -> L41 java.util.concurrent.CancellationException -> L52
            boolean r3 = r2.getCanChangeConnections()     // Catch: com.facebook.aura.pairs.PairsException -> L41 java.util.concurrent.CancellationException -> L52
            goto L4d
        L41:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsShareViewModel"
            java.lang.String r0 = "access read failed: %s"
            X.CFK.A0H(r1, r0, r2)
        L4d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            return r1
        L52:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsShareViewModel.canChangeConnections(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadPhotos(X.HtJ<? super java.util.Map<java.lang.String, com.facebook.aura.pairs.PairsImageRef>> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsShareViewModel.C128401
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.pairs.ConnectionsShareViewModel$loadPhotos$1 r4 = (com.facebook.aura.pairs.ConnectionsShareViewModel.C128401) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L37
        L1e:
            com.facebook.aura.pairs.ConnectionsShareViewModel$loadPhotos$1 r4 = new com.facebook.aura.pairs.ConnectionsShareViewModel$loadPhotos$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r2)
            com.facebook.aura.pairs.PairsRepository r0 = r5.repository     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            r4.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            java.lang.Object r2 = r0.contacts(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            if (r2 != r3) goto L3a
            return r3
        L37:
            X.Hwg.A00(r2)     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
        L3a:
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            r0 = 10
            int r1 = X.C3cG.A03(r2, r0)     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            r0 = 16
            if (r1 >= r0) goto L48
            r1 = 16
        L48:
            java.util.LinkedHashMap r3 = X.C60O.A15(r1)     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            java.util.Iterator r2 = r2.iterator()     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
        L50:
            boolean r0 = r2.hasNext()     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            if (r0 == 0) goto L64
            java.lang.Object r0 = r2.next()     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            com.facebook.aura.pairs.PairsContact r0 = (com.facebook.aura.pairs.PairsContact) r0     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            java.lang.String r1 = r0.museId     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            com.facebook.aura.pairs.PairsImageRef r0 = r0.photo     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            r3.put(r1, r0)     // Catch: com.facebook.aura.pairs.PairsException -> L65 java.util.concurrent.CancellationException -> L76
            goto L50
        L64:
            return r3
        L65:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsShareViewModel"
            java.lang.String r0 = "contacts for share photos failed: %s"
            X.CFK.A0H(r1, r0, r2)
            X.9jH r0 = X.AGH.A0E()
            return r0
        L76:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsShareViewModel.loadPhotos(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:12:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nonEmptyPage(java.lang.String r9, X.HtJ<? super com.facebook.aura.pairs.ConnectionsShareTargetPage> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.pairs.ConnectionsShareViewModel.C128411
            if (r0 == 0) goto L74
            r6 = r10
            com.facebook.aura.pairs.ConnectionsShareViewModel$nonEmptyPage$1 r6 = (com.facebook.aura.pairs.ConnectionsShareViewModel.C128411) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L51
            if (r0 == r2) goto L63
            if (r0 != r5) goto L7b
            java.lang.Object r4 = r6.L$2
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            X.Hwg.A00(r1)
        L27:
            com.facebook.aura.pairs.ConnectionsShareTargetPage r1 = (com.facebook.aura.pairs.ConnectionsShareTargetPage) r1
        L29:
            java.util.List<com.facebook.aura.pairs.ConnectionsShareTarget> r0 = r1.targets
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7a
            java.lang.String r3 = r1.next
            if (r3 == 0) goto L7a
            boolean r0 = r4.add(r3)
            if (r0 == 0) goto L7a
            com.facebook.aura.pairs.PairsRepository r2 = r8.repository
            java.util.Map<java.lang.String, com.facebook.aura.pairs.PairsImageRef> r1 = r8.photos
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r4
            r6.L$3 = r0
            r6.label = r5
            java.lang.Object r1 = r2.shareTargetsPage(r3, r1, r6)
            if (r1 != r7) goto L27
            return r7
        L51:
            X.Hwg.A00(r1)
            com.facebook.aura.pairs.PairsRepository r1 = r8.repository
            java.util.Map<java.lang.String, com.facebook.aura.pairs.PairsImageRef> r0 = r8.photos
            r6.L$0 = r9
            r6.label = r2
            java.lang.Object r1 = r1.shareTargetsPage(r9, r0, r6)
            if (r1 != r7) goto L68
            return r7
        L63:
            java.lang.Object r9 = r6.L$0
            X.Hwg.A00(r1)
        L68:
            com.facebook.aura.pairs.ConnectionsShareTargetPage r1 = (com.facebook.aura.pairs.ConnectionsShareTargetPage) r1
            java.util.HashSet r4 = X.C60O.A13()
            if (r9 == 0) goto L29
            r4.add(r9)
            goto L29
        L74:
            com.facebook.aura.pairs.ConnectionsShareViewModel$nonEmptyPage$1 r6 = new com.facebook.aura.pairs.ConnectionsShareViewModel$nonEmptyPage$1
            r6.<init>(r10)
            goto L12
        L7a:
            return r1
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsShareViewModel.nonEmptyPage(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c5 -> B:38:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(java.lang.String r13, X.HtJ<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsShareViewModel.send(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void setStatus(String str, ConnectionsShareStatus connectionsShareStatus) {
        ConnectionsShareUiState value;
        ConnectionsShareUiState connectionsShareUiState;
        BLG<ConnectionsShareUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            connectionsShareUiState = value;
        } while (!blg.A6e(value, connectionsShareUiState.copy(connectionsShareUiState.phase, connectionsShareUiState.targets, connectionsShareUiState.selected, AGI.A08(AnonymousClass006.A11(str, connectionsShareStatus, connectionsShareUiState.statuses)), connectionsShareUiState.next, connectionsShareUiState.isLoadingMore)));
    }

    public final C1BN<ConnectionsShareUiState> getUiState() {
        return this.uiState;
    }

    public final void loadMore() {
        ConnectionsShareUiState value;
        ConnectionsShareUiState connectionsShareUiState;
        ConnectionsShareUiState value2 = this._uiState.getValue();
        String str = value2.next;
        if (str == null || value2.isLoadingMore || value2.phase != ConnectionsSharePhase.READY) {
            return;
        }
        BLG<ConnectionsShareUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            connectionsShareUiState = value;
        } while (!blg.A6e(value, connectionsShareUiState.copy(connectionsShareUiState.phase, connectionsShareUiState.targets, connectionsShareUiState.selected, connectionsShareUiState.statuses, connectionsShareUiState.next, true)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(str, null), AEu.A00(this));
    }

    public final void retryLoad() {
        ConnectionsShareUiState value;
        ConnectionsShareUiState connectionsShareUiState;
        BLG<ConnectionsShareUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            connectionsShareUiState = value;
        } while (!blg.A6e(value, connectionsShareUiState.copy(ConnectionsSharePhase.LOADING, connectionsShareUiState.targets, connectionsShareUiState.selected, connectionsShareUiState.statuses, connectionsShareUiState.next, connectionsShareUiState.isLoadingMore)));
        load();
    }

    public final void share() {
        ConnectionsShareUiState value = this._uiState.getValue();
        Iterator<T> it = (value.statuses.isEmpty() ^ true ? value.getRetryable() : value.selected).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            setStatus(strA0j, ConnectionsShareStatus.SENDING);
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new ConnectionsShareViewModel$share$1$1(this, strA0j, null), AEu.A00(this));
        }
    }

    private final void load() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128391(null), AEu.A00(this));
    }
}

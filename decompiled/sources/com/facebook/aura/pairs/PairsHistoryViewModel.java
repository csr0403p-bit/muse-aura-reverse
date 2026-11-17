package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C0881AGi;
import X.C10550Hrx;
import X.C1BN;
import X.C27k;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.pairs.ConnectionsTabSnapshot;
import com.facebook.aura.pairs.PairsHistoryUiState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PairsHistoryViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<PairsHistoryUiState> _uiState;
    public final String chatSessionId;
    public final String connectionId;
    public final String museId;
    public final PairsRepository repository;
    public final ConcurrentHashMap<String, ConnectionsSharedLinkTarget> sharedTargets;
    public final ConnectionsTabStore tabStore;
    public final C1BN<PairsHistoryUiState> uiState;

    public final class Factory extends AuraViewModelFactory<PairsHistoryViewModel> {
        public static final int $stable = 8;
        public final String chatSessionId;
        public final String connectionId;
        public final String museId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PairsHistoryViewModel create() {
            return new PairsHistoryViewModel(PairsRepository.Companion.getInstance(this.userSession), ConnectionsTabStore.Companion.getInstance(this.userSession), this.museId, this.chatSessionId, this.connectionId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.museId = str;
            this.chatSessionId = str2;
            this.connectionId = str3;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel", f = "PairsHistoryViewModel.kt", l = {145, 147}, m = "fetchContact", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsHistoryViewModel$fetchContact$1, reason: invalid class name */
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
            return PairsHistoryViewModel.this.fetchContact(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel$fetchOlder$1", f = "PairsHistoryViewModel.kt", l = {84, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsHistoryViewModel$fetchOlder$1, reason: invalid class name and case insensitive filesystem */
    public final class C129111 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $oldestSeq;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129111(long j, HtJ<? super C129111> htJ) {
            super(2, htJ);
            this.$oldestSeq = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsHistoryViewModel.this.new C129111(this.$oldestSeq, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[LOOP:0: B:8:0x0036->B:10:0x003c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Collection] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r13.label
                r5 = 0
                r3 = 2
                r12 = 1
                if (r0 == 0) goto L49
                if (r0 == r12) goto L5d
                if (r0 != r3) goto L9b
                java.lang.Object r8 = r13.L$5
                com.facebook.aura.pairs.PairsHistoryUiState$Ready r8 = (com.facebook.aura.pairs.PairsHistoryUiState.Ready) r8
                java.lang.Object r1 = r13.L$4
                X.BLG r1 = (X.BLG) r1
                java.lang.Object r6 = r13.L$2
                java.util.Collection r6 = (java.util.Collection) r6
                java.lang.Object r7 = r13.L$1
                com.facebook.aura.pairs.PairsHistoryUiState$Ready r7 = (com.facebook.aura.pairs.PairsHistoryUiState.Ready) r7
                java.lang.Object r2 = r13.L$0
                com.facebook.aura.pairs.PairsHistoryPage r2 = (com.facebook.aura.pairs.PairsHistoryPage) r2
                X.Hwg.A00(r14)
            L24:
                X.AHD<com.facebook.aura.pairs.PairsHistoryMessage> r0 = r7.messages
                java.util.ArrayList r0 = X.AbstractC0878AGe.A0P(r0, r6)
                java.util.HashSet r6 = X.C60O.A13()
                java.util.ArrayList r5 = X.C3cG.A0h()
                java.util.Iterator r4 = r0.iterator()
            L36:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto La1
                java.lang.Object r3 = r4.next()
                r0 = r3
                com.facebook.aura.pairs.PairsHistoryMessage r0 = (com.facebook.aura.pairs.PairsHistoryMessage) r0
                java.lang.String r0 = r0.id
                X.AnonymousClass006.A1P(r0, r3, r6, r5)
                goto L36
            L49:
                X.Hwg.A00(r14)
                com.facebook.aura.pairs.PairsHistoryViewModel r2 = com.facebook.aura.pairs.PairsHistoryViewModel.this     // Catch: com.facebook.aura.pairs.PairsException -> L64
                long r0 = r13.$oldestSeq     // Catch: com.facebook.aura.pairs.PairsException -> L64
                java.lang.Long r0 = X.C3cG.A0S(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L64
                r13.label = r12     // Catch: com.facebook.aura.pairs.PairsException -> L64
                java.lang.Object r14 = com.facebook.aura.pairs.PairsHistoryViewModel.access$visiblePage(r2, r0, r13)     // Catch: com.facebook.aura.pairs.PairsException -> L64
                if (r14 != r4) goto L60
                goto La0
            L5d:
                X.Hwg.A00(r14)     // Catch: com.facebook.aura.pairs.PairsException -> L64
            L60:
                com.facebook.aura.pairs.PairsHistoryPage r14 = (com.facebook.aura.pairs.PairsHistoryPage) r14     // Catch: com.facebook.aura.pairs.PairsException -> L64
                r2 = r14
                goto L65
            L64:
                r2 = r5
            L65:
                com.facebook.aura.pairs.PairsHistoryViewModel r0 = com.facebook.aura.pairs.PairsHistoryViewModel.this
                X.BLG<com.facebook.aura.pairs.PairsHistoryUiState> r0 = r0._uiState
                java.lang.Object r8 = r0.getValue()
                boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsHistoryUiState.Ready
                if (r0 == 0) goto Lb7
                com.facebook.aura.pairs.PairsHistoryUiState$Ready r8 = (com.facebook.aura.pairs.PairsHistoryUiState.Ready) r8
                if (r8 == 0) goto Lb7
                com.facebook.aura.pairs.PairsHistoryViewModel r0 = com.facebook.aura.pairs.PairsHistoryViewModel.this
                X.BLG<com.facebook.aura.pairs.PairsHistoryUiState> r1 = r0._uiState
                if (r2 != 0) goto L83
                r11 = 0
                X.AHD<com.facebook.aura.pairs.PairsHistoryMessage> r9 = r8.messages
                boolean r10 = r8.hasMore
                java.lang.Long r13 = r8.oldestSeq
                goto Lb0
            L83:
                java.util.List<com.facebook.aura.pairs.PairsHistoryMessage> r6 = r2.messages
                r13.L$0 = r2
                r13.L$1 = r8
                r13.L$2 = r6
                r13.L$3 = r5
                r13.L$4 = r1
                r13.L$5 = r8
                r13.label = r3
                java.lang.Object r0 = com.facebook.aura.pairs.PairsHistoryViewModel.access$prefetchSharedLinkTargets(r0, r6, r13)
                if (r0 == r4) goto Lb9
                r7 = r8
                goto L24
            L9b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            La0:
                return r4
            La1:
                X.AHD r9 = X.AGI.A07(r5)
                boolean r10 = r2.hasMore
                java.lang.Long r13 = r2.oldestSeq
                if (r13 != 0) goto Lad
                java.lang.Long r13 = r7.oldestSeq
            Lad:
                r11 = 0
                boolean r12 = r8.olderFailed
            Lb0:
                com.facebook.aura.pairs.PairsHistoryUiState$Ready r0 = com.facebook.aura.pairs.PairsHistoryViewModelKt.copy(r8, r9, r10, r11, r12, r13)
                r1.Af8(r0)
            Lb7:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
            Lb9:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsHistoryViewModel.C129111.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C129111) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel$historyReady$1", f = "PairsHistoryViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsHistoryViewModel$historyReady$1, reason: invalid class name and case insensitive filesystem */
    public final class C129121 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsHistoryPage $page;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129121(PairsHistoryPage pairsHistoryPage, HtJ<? super C129121> htJ) {
            super(2, htJ);
            this.$page = pairsHistoryPage;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsHistoryViewModel.this.new C129121(this.$page, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PairsHistoryViewModel pairsHistoryViewModel = PairsHistoryViewModel.this;
                List<PairsHistoryMessage> list = this.$page.messages;
                this.label = 1;
                if (pairsHistoryViewModel.prefetchSharedLinkTargets(list, this) == enumC10460Hji) {
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
            return ((C129121) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel$load$1", f = "PairsHistoryViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsHistoryViewModel$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C129131 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel$load$1$1", f = "PairsHistoryViewModel.kt", l = {117, 122}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pairs.PairsHistoryViewModel$load$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PairsHistoryUiState>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public int label;
            public final /* synthetic */ PairsHistoryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02731(PairsHistoryViewModel pairsHistoryViewModel, HtJ<? super C02731> htJ) {
                super(2, htJ);
                this.this$0 = pairsHistoryViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02731 c02731 = new C02731(this.this$0, htJ);
                c02731.L$0 = obj;
                return c02731;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HoC hoCA01;
                PairsHistoryViewModel pairsHistoryViewModel;
                PairsContact pairsContact;
                C3UX c3ux = (C3UX) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    PairsHistoryViewModel$load$1$1$contact$1 pairsHistoryViewModel$load$1$1$contact$1 = new PairsHistoryViewModel$load$1$1$contact$1(this.this$0, null);
                    C6ys c6ys = C6ys.A00;
                    Integer num = C79.A00;
                    C10550Hrx c10550HrxA01 = GAo.A01(num, c6ys, pairsHistoryViewModel$load$1$1$contact$1, c3ux);
                    hoCA01 = GAo.A01(num, c6ys, new PairsHistoryViewModel$load$1$1$page$1(this.this$0, null), c3ux);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = hoCA01;
                    this.label = 1;
                    obj = c10550HrxA01.A0E(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        pairsHistoryViewModel = (PairsHistoryViewModel) this.L$4;
                        pairsContact = (PairsContact) this.L$3;
                        Hwg.A00(obj);
                        return pairsHistoryViewModel.historyReady((PairsHistoryPage) obj, pairsContact);
                    }
                    hoCA01 = (C27k) this.L$2;
                    Hwg.A00(obj);
                }
                PairsContact pairsContact2 = (PairsContact) obj;
                if (pairsContact2 == null || !C7384Etj.areEqual(pairsContact2.chatSessionId, this.this$0.chatSessionId)) {
                    hoCA01.A5w(null);
                    return PairsHistoryUiState.Missing.INSTANCE;
                }
                pairsHistoryViewModel = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = pairsContact2;
                this.L$4 = pairsHistoryViewModel;
                this.label = 2;
                Object objA0W = C3cG.A0W(hoCA01, this);
                if (objA0W == enumC10460Hji) {
                    return enumC10460Hji;
                }
                pairsContact = pairsContact2;
                obj = objA0W;
                return pairsHistoryViewModel.historyReady((PairsHistoryPage) obj, pairsContact);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super PairsHistoryUiState> htJ) {
                return ((C02731) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C129131(HtJ<? super C129131> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsHistoryViewModel.this.new C129131(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsHistoryViewModel.this.new C129131(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L1c
                if (r0 != r4) goto L17
                java.lang.Object r3 = r6.L$1
                X.BLG r3 = (X.BLG) r3
                java.lang.Object r2 = r6.L$0
                X.BLG r2 = (X.BLG) r2
                X.Hwg.A00(r7)     // Catch: com.facebook.aura.pairs.PairsException -> L15 java.util.concurrent.CancellationException -> L4a
                goto L41
            L15:
                r0 = move-exception
                goto L38
            L17:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1c:
                X.Hwg.A00(r7)
                com.facebook.aura.pairs.PairsHistoryViewModel r2 = com.facebook.aura.pairs.PairsHistoryViewModel.this
                X.BLG<com.facebook.aura.pairs.PairsHistoryUiState> r3 = r2._uiState
                r1 = 0
                com.facebook.aura.pairs.PairsHistoryViewModel$load$1$1 r0 = new com.facebook.aura.pairs.PairsHistoryViewModel$load$1$1     // Catch: com.facebook.aura.pairs.PairsException -> L36 java.util.concurrent.CancellationException -> L4a
                r0.<init>(r2, r1)     // Catch: com.facebook.aura.pairs.PairsException -> L36 java.util.concurrent.CancellationException -> L4a
                r6.L$0 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L36 java.util.concurrent.CancellationException -> L4a
                r6.L$1 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L36 java.util.concurrent.CancellationException -> L4a
                r6.label = r4     // Catch: com.facebook.aura.pairs.PairsException -> L36 java.util.concurrent.CancellationException -> L4a
                java.lang.Object r7 = X.Hxb.A00(r0, r6)     // Catch: com.facebook.aura.pairs.PairsException -> L36 java.util.concurrent.CancellationException -> L4a
                if (r7 != r5) goto L41
                return r5
            L36:
                r0 = move-exception
                r2 = r3
            L38:
                com.facebook.aura.pairs.PairsError r1 = r0.error
                com.facebook.aura.pairs.PairsError r0 = com.facebook.aura.pairs.PairsError.NOT_FOUND
                if (r1 != r0) goto L47
                com.facebook.aura.pairs.PairsHistoryUiState$Missing r7 = com.facebook.aura.pairs.PairsHistoryUiState.Missing.INSTANCE
            L40:
                r3 = r2
            L41:
                r3.Af8(r7)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L47:
                com.facebook.aura.pairs.PairsHistoryUiState$Failed r7 = com.facebook.aura.pairs.PairsHistoryUiState.Failed.INSTANCE
                goto L40
            L4a:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsHistoryViewModel.C129131.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel", f = "PairsHistoryViewModel.kt", l = {181}, m = "prefetchSharedLinkTargets", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsHistoryViewModel$prefetchSharedLinkTargets$1, reason: invalid class name and case insensitive filesystem */
    public final class C129141 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C129141(HtJ<? super C129141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsHistoryViewModel.this.prefetchSharedLinkTargets(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel", f = "PairsHistoryViewModel.kt", l = {163, 168}, m = "visiblePage", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsHistoryViewModel$visiblePage$1, reason: invalid class name and case insensitive filesystem */
    public final class C129151 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C129151(HtJ<? super C129151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsHistoryViewModel.this.visiblePage(null, this);
        }
    }

    private final void fetchOlder(PairsHistoryUiState.Ready ready) {
        Long l;
        boolean z = ready.hasMore;
        if (!z || ready.isLoadingOlder || (l = ready.oldestSeq) == null) {
            return;
        }
        long jLongValue = l.longValue();
        this._uiState.Af8(PairsHistoryViewModelKt.copy(ready, ready.messages, z, true, false, l));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C129111(jLongValue, null), AEu.A00(this));
    }

    public final ConnectionsSharedLinkTarget sharedLinkTarget(String str) {
        C7384Etj.A0Y(str, 0);
        String strSharedLinkId = PairsHistoryViewModelKt.sharedLinkId(str);
        if (strSharedLinkId != null) {
            return this.sharedTargets.get(strSharedLinkId);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PairsContact cachedContact() {
        ConnectionsTabSnapshot.Loaded loaded;
        ConnectionsTabSnapshot value = this.tabStore.snapshot.getValue();
        Object obj = null;
        if (!(value instanceof ConnectionsTabSnapshot.Loaded) || (loaded = (ConnectionsTabSnapshot.Loaded) value) == null) {
            return null;
        }
        List<PairsContact> list = loaded.hub.contacts;
        Iterable iterable = loaded.people;
        if (iterable == null) {
            iterable = C0881AGi.A00;
        }
        Iterator it = AbstractC0878AGe.A0P(iterable, list).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (isConversation((PairsContact) next)) {
                obj = next;
                break;
            }
        }
        return (PairsContact) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchContact(X.HtJ<? super com.facebook.aura.pairs.PairsContact> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsHistoryViewModel.AnonymousClass1
            if (r0 == 0) goto L5b
            r6 = r8
            com.facebook.aura.pairs.PairsHistoryViewModel$fetchContact$1 r6 = (com.facebook.aura.pairs.PairsHistoryViewModel.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L40
            if (r0 == r2) goto L66
            if (r0 != r4) goto L61
            X.Hwg.A00(r1)
        L24:
            com.facebook.aura.pairs.ConnectionsDirectory r1 = (com.facebook.aura.pairs.ConnectionsDirectory) r1
            java.util.List<com.facebook.aura.pairs.PairsContact> r0 = r1.people
            java.util.Iterator r2 = r0.iterator()
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.pairs.PairsContact r0 = (com.facebook.aura.pairs.PairsContact) r0
            boolean r0 = r7.isConversation(r0)
            if (r0 == 0) goto L2c
            return r1
        L40:
            X.Hwg.A00(r1)
            java.lang.String r1 = r7.connectionId
            com.facebook.aura.pairs.PairsRepository r0 = r7.repository
            if (r1 == 0) goto L52
            r6.label = r2
            java.lang.Object r1 = r0.connectionContact(r1, r6)
            if (r1 != r5) goto L69
            return r5
        L52:
            r6.label = r4
            java.lang.Object r1 = r0.directory(r6)
            if (r1 != r5) goto L24
            return r5
        L5b:
            com.facebook.aura.pairs.PairsHistoryViewModel$fetchContact$1 r6 = new com.facebook.aura.pairs.PairsHistoryViewModel$fetchContact$1
            r6.<init>(r8)
            goto L12
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L66:
            X.Hwg.A00(r1)
        L69:
            com.facebook.aura.pairs.PairsContact r1 = (com.facebook.aura.pairs.PairsContact) r1
            if (r1 == 0) goto L74
            boolean r0 = r7.isConversation(r1)
            if (r0 == 0) goto L74
            return r1
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsHistoryViewModel.fetchContact(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConversation(PairsContact pairsContact) {
        return C7384Etj.areEqual(pairsContact.museId, this.museId) && C7384Etj.areEqual(pairsContact.chatSessionId, this.chatSessionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetchSharedLinkTargets(java.util.List<com.facebook.aura.pairs.PairsHistoryMessage> r9, X.HtJ<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.pairs.PairsHistoryViewModel.C129141
            if (r0 == 0) goto L23
            r5 = r10
            com.facebook.aura.pairs.PairsHistoryViewModel$prefetchSharedLinkTargets$1 r5 = (com.facebook.aura.pairs.PairsHistoryViewModel.C129141) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L29
            java.lang.Object r2 = r5.L$3
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            goto La5
        L23:
            com.facebook.aura.pairs.PairsHistoryViewModel$prefetchSharedLinkTargets$1 r5 = new com.facebook.aura.pairs.PairsHistoryViewModel$prefetchSharedLinkTargets$1
            r5.<init>(r10)
            goto L12
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            java.util.ArrayList r7 = X.C60O.A12(r1)
            java.util.Iterator r3 = r9.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r3.next()
            com.facebook.aura.pairs.PairsHistoryMessage r0 = (com.facebook.aura.pairs.PairsHistoryMessage) r0
            X.7l3 r1 = com.facebook.aura.pairs.PairsHistoryViewModelKt.SHARED_LINK
            java.lang.String r0 = r0.text
            X.79x r2 = X.C06827l3.A00(r0, r1)
            com.facebook.aura.pairs.PairsHistoryViewModel$prefetchSharedLinkTargets$ids$1$1 r1 = com.facebook.aura.pairs.PairsHistoryViewModel$prefetchSharedLinkTargets$ids$1$1.INSTANCE
            X.AnonymousClass003.A0u(r2, r1)
            X.7AG r0 = new X.7AG
            r0.<init>(r1, r2)
            X.7AH r1 = new X.7AH
            r1.<init>(r0)
        L59:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r1.next()
            r7.add(r0)
            goto L59
        L67:
            java.util.Set r0 = X.AbstractC0878AGe.A0g(r7)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        L73:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.pairs.ConnectionsSharedLinkTarget> r0 = r8.sharedTargets
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L73
            r3.add(r1)
            goto L73
        L89:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.pairs.ConnectionsSharedLinkTarget> r2 = r8.sharedTargets     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            com.facebook.aura.pairs.PairsRepository r1 = r8.repository     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            r0 = 0
            r5.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            r5.L$1 = r0     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            r5.L$2 = r0     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            r5.L$3 = r2     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            r5.label = r4     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            java.lang.Object r1 = r1.sharedLinkTargets(r3, r5)     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            if (r1 != r6) goto La8
            return r6
        La5:
            X.Hwg.A00(r1)     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
        La8:
            java.util.Map r1 = (java.util.Map) r1     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            r2.putAll(r1)     // Catch: com.facebook.aura.pairs.PairsException -> Lae java.util.concurrent.CancellationException -> Lb1
            goto Lb3
        Lae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lb1:
            r0 = move-exception
            throw r0
        Lb3:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsHistoryViewModel.prefetchSharedLinkTargets(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object visiblePage(java.lang.Long r12, X.HtJ<? super com.facebook.aura.pairs.PairsHistoryPage> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.pairs.PairsHistoryViewModel.C129151
            if (r0 == 0) goto L84
            r7 = r13
            com.facebook.aura.pairs.PairsHistoryViewModel$visiblePage$1 r7 = (com.facebook.aura.pairs.PairsHistoryViewModel.C129151) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L64
            if (r0 == r4) goto L77
            if (r0 != r6) goto L94
            int r10 = r7.I$0
            java.lang.Object r9 = r7.L$2
            java.util.List r9 = (java.util.List) r9
            X.Hwg.A00(r3)
        L29:
            com.facebook.aura.pairs.PairsHistoryPage r3 = (com.facebook.aura.pairs.PairsHistoryPage) r3
            java.util.List<com.facebook.aura.pairs.PairsHistoryMessage> r1 = r3.messages
            r0 = 0
            r9.addAll(r0, r1)
            int r10 = r10 + 1
        L33:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8a
            boolean r0 = r3.hasMore
            if (r0 == 0) goto L8a
            r0 = 5
            if (r10 >= r0) goto L8a
            java.lang.Long r0 = r3.oldestSeq
            if (r0 == 0) goto L8a
            long r4 = r0.longValue()
            com.facebook.aura.pairs.PairsRepository r3 = r11.repository
            java.lang.String r2 = r11.chatSessionId
            java.lang.Long r1 = X.C3cG.A0S(r4)
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r9
            r7.I$0 = r10
            r7.J$0 = r4
            r7.label = r6
            java.lang.Object r3 = r3.history(r2, r1, r7)
            if (r3 != r8) goto L29
            return r8
        L64:
            X.Hwg.A00(r3)
            com.facebook.aura.pairs.PairsRepository r2 = r11.repository
            java.lang.String r1 = r11.chatSessionId
            r0 = 0
            r7.L$0 = r0
            r7.label = r4
            java.lang.Object r3 = r2.history(r1, r12, r7)
            if (r3 != r8) goto L7a
            return r8
        L77:
            X.Hwg.A00(r3)
        L7a:
            com.facebook.aura.pairs.PairsHistoryPage r3 = (com.facebook.aura.pairs.PairsHistoryPage) r3
            java.util.List<com.facebook.aura.pairs.PairsHistoryMessage> r0 = r3.messages
            java.util.ArrayList r9 = X.AbstractC0878AGe.A0R(r0)
            r10 = 1
            goto L33
        L84:
            com.facebook.aura.pairs.PairsHistoryViewModel$visiblePage$1 r7 = new com.facebook.aura.pairs.PairsHistoryViewModel$visiblePage$1
            r7.<init>(r13)
            goto L12
        L8a:
            boolean r2 = r3.hasMore
            java.lang.Long r1 = r3.oldestSeq
            com.facebook.aura.pairs.PairsHistoryPage r0 = new com.facebook.aura.pairs.PairsHistoryPage
            r0.<init>(r9, r2, r1)
            return r0
        L94:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsHistoryViewModel.visiblePage(java.lang.Long, X.HtJ):java.lang.Object");
    }

    public final C1BN<PairsHistoryUiState> getUiState() {
        return this.uiState;
    }

    public final void loadOlder() {
        PairsHistoryUiState.Ready ready;
        PairsHistoryUiState value = this._uiState.getValue();
        if (!(value instanceof PairsHistoryUiState.Ready) || (ready = (PairsHistoryUiState.Ready) value) == null || ready.olderFailed) {
            return;
        }
        fetchOlder(ready);
    }

    public final void retry() {
        this._uiState.Af8(PairsHistoryUiState.Loading.INSTANCE);
        load();
    }

    public final void retryOlder() {
        PairsHistoryUiState.Ready ready;
        PairsHistoryUiState value = this._uiState.getValue();
        if (!(value instanceof PairsHistoryUiState.Ready) || (ready = (PairsHistoryUiState.Ready) value) == null) {
            return;
        }
        fetchOlder(ready);
    }

    public PairsHistoryViewModel(PairsRepository pairsRepository, ConnectionsTabStore connectionsTabStore, String str, String str2, String str3) {
        AnonymousClass005.A14(pairsRepository, connectionsTabStore, str, str2);
        this.repository = pairsRepository;
        this.tabStore = connectionsTabStore;
        this.museId = str;
        this.chatSessionId = str2;
        this.connectionId = str3;
        C9286GCn c9286GCnA01 = HnJ.A01(PairsHistoryUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3Pi.A00(c9286GCnA01);
        this.sharedTargets = C60O.A1C();
        load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PairsHistoryUiState historyReady(PairsHistoryPage pairsHistoryPage, PairsContact pairsContact) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C129121(pairsHistoryPage, null), AEu.A00(this));
        List<PairsHistoryMessage> list = pairsHistoryPage.messages;
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h = C3cG.A0h();
        for (PairsHistoryMessage pairsHistoryMessage : list) {
            AnonymousClass006.A1P(pairsHistoryMessage.id, pairsHistoryMessage, hashSetA13, arrayListA0h);
        }
        return new PairsHistoryUiState.Ready(AGI.A07(arrayListA0h), pairsHistoryPage.hasMore, false, false, pairsContact, pairsHistoryPage.oldestSeq);
    }

    private final void load() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C129131(null), AEu.A00(this));
    }
}

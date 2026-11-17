package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.components.reactions.AuraRedlineKt;
import com.facebook.aura.navigation.key.PairsRole;
import com.facebook.aura.pairs.PairsCodeProgress;
import com.facebook.aura.pairs.PairsStatusEffect;
import com.facebook.aura.pairs.PairsStatusUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PairsStatusViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<PairsStatusEffect> _effects;
    public final BLG<PairsStatusUiState> _uiState;
    public HoC codeJob;
    public HoC completionJob;
    public final C22I<PairsStatusEffect> effects;
    public final boolean fromHub;
    public final String generationId;
    public HoC graceJob;
    public boolean isRemoving;
    public PairsCodeProgress progress;
    public final PairsRepository repository;
    public final PairsRole role;
    public Long serverWaitStartMs;
    public PairsStatusSnapshot snapshot;
    public final C1BN<PairsStatusUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$1", f = "PairsStatusViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsStatusViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final PairsStatusViewModel pairsStatusViewModel = PairsStatusViewModel.this;
                C20Q<Unit> c20q = pairsStatusViewModel.repository.changes;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.pairs.PairsStatusViewModel.1.1
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        return C3cG.A0U(pairsStatusViewModel.load(htJ));
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$2", f = "PairsStatusViewModel.kt", l = {145, 147}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsStatusViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002f -> B:9:0x0015). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0033 -> B:9:0x0015). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003b -> B:9:0x0015). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0047 -> B:9:0x0015). Please report as a decompilation issue!!! */
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
                r4 = 0
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L12
                if (r0 == r2) goto L22
                if (r0 == r3) goto L12
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L12:
                X.Hwg.A00(r7)
            L15:
                r6.L$0 = r4
                r6.label = r2
                r0 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r0 = X.C7Bq.A01(r0, r6)
                if (r0 != r5) goto L25
                return r5
            L22:
                X.Hwg.A00(r7)
            L25:
                com.facebook.aura.pairs.PairsStatusViewModel r0 = com.facebook.aura.pairs.PairsStatusViewModel.this
                X.BLG<com.facebook.aura.pairs.PairsStatusUiState> r0 = r0._uiState
                java.lang.Object r1 = r0.getValue()
                boolean r0 = r1 instanceof com.facebook.aura.pairs.PairsStatusUiState.Loaded
                if (r0 == 0) goto L15
                com.facebook.aura.pairs.PairsStatusUiState$Loaded r1 = (com.facebook.aura.pairs.PairsStatusUiState.Loaded) r1
                if (r1 == 0) goto L15
                com.facebook.aura.pairs.PairsStatusKind r0 = r1.kind
                boolean r0 = r0.isTerminal()
                if (r0 != 0) goto L15
                com.facebook.aura.pairs.PairsStatusViewModel r0 = com.facebook.aura.pairs.PairsStatusViewModel.this
                r6.L$0 = r4
                r6.label = r3
                java.lang.Object r0 = com.facebook.aura.pairs.PairsStatusViewModel.access$load(r0, r6)
                if (r0 != r5) goto L15
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final class Factory extends AuraViewModelFactory<PairsStatusViewModel> {
        public static final int $stable = 8;
        public final boolean fromHub;
        public final String generationId;
        public final PairsRole role;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PairsStatusViewModel create() {
            return new PairsStatusViewModel(PairsRepository.Companion.getInstance(this.userSession), this.generationId, this.role, this.fromHub);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, PairsRole pairsRole, boolean z) {
            AnonymousClass005.A0x(abstractC3358CGz, str, pairsRole);
            this.userSession = abstractC3358CGz;
            this.generationId = str;
            this.role = pairsRole;
            this.fromHub = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$advance$1", f = "PairsStatusViewModel.kt", l = {305, MC.mwa_time_spent_killswitch.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$advance$1, reason: invalid class name and case insensitive filesystem */
    public final class C129951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $name;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129951(String str, HtJ<? super C129951> htJ) {
            super(2, htJ);
            this.$name = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new C129951(this.$name, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Integer numA0R;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(1500L, this) == enumC10460Hji) {
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
            PairsStatusViewModel pairsStatusViewModel = PairsStatusViewModel.this;
            C3Em<PairsStatusEffect> c3Em = pairsStatusViewModel._effects;
            if (pairsStatusViewModel.fromHub) {
                numA0R = null;
            } else {
                int length = this.$name.length();
                int i2 = R.string._name_removed__res_0x7f120d94;
                if (length == 0) {
                    i2 = R.string._name_removed__res_0x7f120d95;
                }
                numA0R = C3cG.A0R(i2);
            }
            PairsStatusEffect.Leave leave = new PairsStatusEffect.Leave(numA0R, this.$name);
            this.label = 2;
            if (c3Em.emit(leave, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C129951) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$connect$1", f = "PairsStatusViewModel.kt", l = {188, 191, 193}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$connect$1, reason: invalid class name and case insensitive filesystem */
    public final class C129961 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsCodeProgress.CodeReady $ready;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129961(PairsCodeProgress.CodeReady codeReady, HtJ<? super C129961> htJ) {
            super(2, htJ);
            this.$ready = codeReady;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new C129961(this.$ready, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r5 = 0
                r3 = 3
                r6 = 2
                r7 = 1
                if (r0 == 0) goto L16
                if (r0 == r7) goto L2b
                if (r0 == r6) goto L52
                if (r0 != r3) goto L6a
                X.Hwg.A00(r9)
            L13:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L16:
                X.Hwg.A00(r9)
                com.facebook.aura.pairs.PairsStatusViewModel r2 = com.facebook.aura.pairs.PairsStatusViewModel.this
                com.facebook.aura.pairs.PairsCodeProgress$CodeReady r1 = r8.$ready
                com.facebook.aura.pairs.PairsStatusViewModel$connect$1$outcome$1 r0 = new com.facebook.aura.pairs.PairsStatusViewModel$connect$1$outcome$1
                r0.<init>(r2, r1, r5)
                r8.label = r7
                java.lang.Object r9 = com.facebook.aura.pairs.PairsStatusViewModelKt.io(r0, r8)
                if (r9 != r4) goto L2e
                return r4
            L2b:
                X.Hwg.A00(r9)
            L2e:
                r2 = r9
                com.facebook.aura.pairs.PairsCodeOutcome r2 = (com.facebook.aura.pairs.PairsCodeOutcome) r2
                com.facebook.aura.pairs.PairsStatusViewModel r0 = com.facebook.aura.pairs.PairsStatusViewModel.this
                r0.codeJob = r5
                com.facebook.aura.pairs.PairsCodeOutcome$Confirmed r0 = com.facebook.aura.pairs.PairsCodeOutcome.Confirmed.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r2, r0)
                if (r0 != 0) goto L45
                com.facebook.aura.pairs.PairsCodeOutcome$AlreadyConfirmed r0 = com.facebook.aura.pairs.PairsCodeOutcome.AlreadyConfirmed.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r2, r0)
                if (r0 == 0) goto L59
            L45:
                com.facebook.aura.pairs.PairsStatusViewModel r0 = com.facebook.aura.pairs.PairsStatusViewModel.this
                r8.L$0 = r2
                r8.label = r6
                java.lang.Object r0 = com.facebook.aura.pairs.PairsStatusViewModel.access$load(r0, r8)
                if (r0 != r4) goto L59
                return r4
            L52:
                java.lang.Object r2 = r8.L$0
                com.facebook.aura.pairs.PairsCodeOutcome r2 = (com.facebook.aura.pairs.PairsCodeOutcome) r2
                X.Hwg.A00(r9)
            L59:
                com.facebook.aura.pairs.PairsStatusViewModel r1 = com.facebook.aura.pairs.PairsStatusViewModel.this
                com.facebook.aura.pairs.PairsCodeProgress$CodeReady r0 = r8.$ready
                com.facebook.aura.pairs.PairsPairingCode r0 = r0.code
                r8.L$0 = r5
                r8.label = r3
                java.lang.Object r0 = com.facebook.aura.pairs.PairsStatusViewModel.access$handleConfirm(r1, r2, r0, r8)
                if (r0 != r4) goto L13
                return r4
            L6a:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusViewModel.C129961.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C129961) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel", f = "PairsStatusViewModel.kt", l = {354, 356, 371}, m = "handleConfirm", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$handleConfirm$1, reason: invalid class name and case insensitive filesystem */
    public final class C129971 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C129971(HtJ<? super C129971> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsStatusViewModel.this.handleConfirm(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel", f = "PairsStatusViewModel.kt", l = {AuraRedlineKt.REDLINE_GLYPH_DURATION_MS, 342}, m = "handleRead", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$handleRead$1, reason: invalid class name and case insensitive filesystem */
    public final class C129981 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129981(HtJ<? super C129981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsStatusViewModel.this.handleRead(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel", f = "PairsStatusViewModel.kt", l = {230}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C129991 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C129991(HtJ<? super C129991> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsStatusViewModel.this.load(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$readCode$2", f = "PairsStatusViewModel.kt", l = {326, 328, 329}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$readCode$2, reason: invalid class name and case insensitive filesystem */
    public final class C130002 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsPairingCode $previous;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130002(PairsPairingCode pairsPairingCode, HtJ<? super C130002> htJ) {
            super(2, htJ);
            this.$previous = pairsPairingCode;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new C130002(this.$previous, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r6 = 0
                r4 = 3
                r7 = 2
                r3 = 1
                if (r0 == 0) goto L16
                if (r0 == r3) goto L2b
                if (r0 == r7) goto L4a
                if (r0 != r4) goto L5e
                X.Hwg.A00(r9)
            L13:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L16:
                X.Hwg.A00(r9)
                com.facebook.aura.pairs.PairsStatusViewModel r2 = com.facebook.aura.pairs.PairsStatusViewModel.this
                com.facebook.aura.pairs.PairsPairingCode r1 = r8.$previous
                com.facebook.aura.pairs.PairsStatusViewModel$readCode$2$outcome$1 r0 = new com.facebook.aura.pairs.PairsStatusViewModel$readCode$2$outcome$1
                r0.<init>(r2, r1, r6)
                r8.label = r3
                java.lang.Object r9 = com.facebook.aura.pairs.PairsStatusViewModelKt.io(r0, r8)
                if (r9 != r5) goto L2e
                return r5
            L2b:
                X.Hwg.A00(r9)
            L2e:
                r1 = r9
                com.facebook.aura.pairs.PairsCodeOutcome r1 = (com.facebook.aura.pairs.PairsCodeOutcome) r1
                com.facebook.aura.pairs.PairsStatusViewModel r0 = com.facebook.aura.pairs.PairsStatusViewModel.this
                r0.codeJob = r6
                com.facebook.aura.pairs.PairsCodeOutcome$AlreadyConfirmed r0 = com.facebook.aura.pairs.PairsCodeOutcome.AlreadyConfirmed.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L51
                com.facebook.aura.pairs.PairsStatusViewModel r0 = com.facebook.aura.pairs.PairsStatusViewModel.this
                r8.L$0 = r1
                r8.label = r7
                java.lang.Object r0 = com.facebook.aura.pairs.PairsStatusViewModel.access$load(r0, r8)
                if (r0 != r5) goto L51
                return r5
            L4a:
                java.lang.Object r1 = r8.L$0
                com.facebook.aura.pairs.PairsCodeOutcome r1 = (com.facebook.aura.pairs.PairsCodeOutcome) r1
                X.Hwg.A00(r9)
            L51:
                com.facebook.aura.pairs.PairsStatusViewModel r0 = com.facebook.aura.pairs.PairsStatusViewModel.this
                r8.L$0 = r6
                r8.label = r4
                java.lang.Object r0 = com.facebook.aura.pairs.PairsStatusViewModel.access$handleRead(r0, r1, r8)
                if (r0 != r5) goto L13
                return r5
            L5e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusViewModel.C130002.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130002) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$remove$1", f = "PairsStatusViewModel.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 207, 210, 212, 219}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$remove$1, reason: invalid class name and case insensitive filesystem */
    public final class C130011 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsContact $contact;
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$remove$1$1", f = "PairsStatusViewModel.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$remove$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02761 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ PairsContact $contact;
            public int label;
            public final /* synthetic */ PairsStatusViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02761(PairsStatusViewModel pairsStatusViewModel, PairsContact pairsContact, HtJ<? super C02761> htJ) {
                super(1, htJ);
                this.this$0 = pairsStatusViewModel;
                this.$contact = pairsContact;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02761(this.this$0, this.$contact, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    PairsRepository pairsRepository = this.this$0.repository;
                    PairsContact pairsContact = this.$contact;
                    this.label = 1;
                    if (pairsRepository.removeContact(pairsContact, this) == enumC10460Hji) {
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

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C02761) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130011(PairsContact pairsContact, HtJ<? super C130011> htJ) {
            super(2, htJ);
            this.$contact = pairsContact;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new C130011(this.$contact, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                } catch (PairsException e) {
                    PairsError pairsError = e.error;
                    PairsError pairsError2 = PairsError.NOT_FOUND;
                    PairsStatusViewModel pairsStatusViewModel = PairsStatusViewModel.this;
                    if (pairsError == pairsError2) {
                        C3Em<PairsStatusEffect> c3Em = pairsStatusViewModel._effects;
                        PairsStatusEffect.Leave leave = new PairsStatusEffect.Leave(C3cG.A0R(R.string._name_removed__res_0x7f120d7c), "");
                        this.L$0 = null;
                        this.label = 3;
                        if (c3Em.emit(leave, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        C3Em<PairsStatusEffect> c3Em2 = pairsStatusViewModel._effects;
                        PairsError pairsError3 = PairsError.CONFLICT;
                        int i2 = R.string._name_removed__res_0x7f120d86;
                        if (pairsError == pairsError3) {
                            i2 = R.string._name_removed__res_0x7f120d7b;
                        }
                        PairsStatusEffect.Message message = new PairsStatusEffect.Message(i2);
                        this.L$0 = null;
                        this.label = 4;
                        if (c3Em2.emit(message, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                }
                if (i == 0) {
                    Hwg.A00(obj);
                    C02761 c02761 = new C02761(PairsStatusViewModel.this, this.$contact, null);
                    this.label = 1;
                    if (PairsStatusViewModelKt.io(c02761, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i == 4) {
                                Hwg.A00(obj);
                                PairsStatusViewModel pairsStatusViewModel2 = PairsStatusViewModel.this;
                                pairsStatusViewModel2.progress = PairsCodeProgress.Idle.INSTANCE;
                                this.L$0 = null;
                                this.label = 5;
                                if (pairsStatusViewModel2.load(this) == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                                PairsStatusViewModel pairsStatusViewModel3 = PairsStatusViewModel.this;
                                pairsStatusViewModel3.isRemoving = false;
                                pairsStatusViewModel3.publish();
                                return Unit.INSTANCE;
                            }
                            if (i != 5) {
                                throw AnonymousClass001.A0n();
                            }
                        }
                        Hwg.A00(obj);
                        PairsStatusViewModel pairsStatusViewModel32 = PairsStatusViewModel.this;
                        pairsStatusViewModel32.isRemoving = false;
                        pairsStatusViewModel32.publish();
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                C3Em<PairsStatusEffect> c3Em3 = PairsStatusViewModel.this._effects;
                PairsStatusEffect.Leave leave2 = new PairsStatusEffect.Leave(C3cG.A0R(R.string._name_removed__res_0x7f120d7c), "");
                this.label = 2;
                if (c3Em3.emit(leave2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                PairsStatusViewModel pairsStatusViewModel322 = PairsStatusViewModel.this;
                pairsStatusViewModel322.isRemoving = false;
                pairsStatusViewModel322.publish();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                PairsStatusViewModel pairsStatusViewModel4 = PairsStatusViewModel.this;
                pairsStatusViewModel4.isRemoving = false;
                pairsStatusViewModel4.publish();
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130011) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$retry$1", f = "PairsStatusViewModel.kt", l = {155}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$retry$1, reason: invalid class name and case insensitive filesystem */
    public final class C130021 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C130021(HtJ<? super C130021> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new C130021(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsStatusViewModel.this.new C130021(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PairsStatusViewModel pairsStatusViewModel = PairsStatusViewModel.this;
                this.label = 1;
                if (pairsStatusViewModel.load(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$retry$2", f = "PairsStatusViewModel.kt", l = {172, 177}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$retry$2, reason: invalid class name and case insensitive filesystem */
    public final class C130032 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsHeldInvite $held;
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$retry$2$1", f = "PairsStatusViewModel.kt", l = {172}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$retry$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super String>, Object> {
            public final /* synthetic */ PairsHeldInvite $held;
            public int label;
            public final /* synthetic */ PairsStatusViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PairsStatusViewModel pairsStatusViewModel, PairsHeldInvite pairsHeldInvite, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = pairsStatusViewModel;
                this.$held = pairsHeldInvite;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$held, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    PairsRepository pairsRepository = this.this$0.repository;
                    PairsHeldInvite pairsHeldInvite = this.$held;
                    this.label = 1;
                    obj = pairsRepository.acceptLink(pairsHeldInvite, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super String> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130032(PairsHeldInvite pairsHeldInvite, HtJ<? super C130032> htJ) {
            super(2, htJ);
            this.$held = pairsHeldInvite;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new C130032(this.$held, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (PairsException unused) {
                PairsStatusViewModel pairsStatusViewModel = PairsStatusViewModel.this;
                pairsStatusViewModel.codeJob = null;
                C3Em<PairsStatusEffect> c3Em = pairsStatusViewModel._effects;
                PairsStatusEffect.Message message = new PairsStatusEffect.Message(R.string._name_removed__res_0x7f120d6d);
                this.L$0 = null;
                this.label = 2;
                if (c3Em.emit(message, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PairsStatusViewModel.this, this.$held, null);
                this.label = 1;
                if (PairsStatusViewModelKt.io(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    PairsStatusViewModel.this.setProgress(PairsCodeProgress.Unreachable.INSTANCE);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            PairsStatusViewModel pairsStatusViewModel2 = PairsStatusViewModel.this;
            pairsStatusViewModel2.codeJob = null;
            pairsStatusViewModel2.readCode(null);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130032) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusViewModel$trackServerWait$1", f = "PairsStatusViewModel.kt", l = {273}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsStatusViewModel$trackServerWait$1, reason: invalid class name and case insensitive filesystem */
    public final class C130041 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C130041(HtJ<? super C130041> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsStatusViewModel.this.new C130041(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PairsStatusViewModel.this.new C130041(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(10000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            PairsStatusViewModel.this.publish();
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PairsRole.values().length];
            try {
                AnonymousClass005.A0v(PairsRole.INVITER, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(PairsRole.RECEIVER, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PairsRelationshipState.values().length];
            try {
                AnonymousClass005.A0v(PairsRelationshipState.VERIFIED, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(PairsRelationshipState.IDENTITY_CHANGED, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final boolean confirmsAutomatically(PairsStatusSnapshot pairsStatusSnapshot) {
        PairsCodeProgress pairsCodeProgress = this.progress;
        if (C7384Etj.areEqual(pairsCodeProgress, PairsCodeProgress.Idle.INSTANCE) || C7384Etj.areEqual(pairsCodeProgress, PairsCodeProgress.ReadingCode.INSTANCE) || (pairsCodeProgress instanceof PairsCodeProgress.CodeReady) || (pairsCodeProgress instanceof PairsCodeProgress.Confirming)) {
            return pairsStatusSnapshot.getConfirmsAutomatically();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleConfirm(com.facebook.aura.pairs.PairsCodeOutcome r10, com.facebook.aura.pairs.PairsPairingCode r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusViewModel.handleConfirm(com.facebook.aura.pairs.PairsCodeOutcome, com.facebook.aura.pairs.PairsPairingCode, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleRead(com.facebook.aura.pairs.PairsCodeOutcome r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pairs.PairsStatusViewModel.C129981
            if (r0 == 0) goto Laf
            r4 = r9
            com.facebook.aura.pairs.PairsStatusViewModel$handleRead$1 r4 = (com.facebook.aura.pairs.PairsStatusViewModel.C129981) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 == r6) goto L9b
            if (r0 != r5) goto Lb6
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L26:
            X.Hwg.A00(r1)
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsCodeOutcome.Ready
            if (r0 == 0) goto L3a
            com.facebook.aura.pairs.PairsCodeOutcome$Ready r8 = (com.facebook.aura.pairs.PairsCodeOutcome.Ready) r8
            com.facebook.aura.pairs.PairsPairingCode r1 = r8.code
            com.facebook.aura.pairs.PairsCodeProgress$CodeReady r0 = new com.facebook.aura.pairs.PairsCodeProgress$CodeReady
            r0.<init>(r1)
        L36:
            r7.setProgress(r0)
            goto L23
        L3a:
            com.facebook.aura.pairs.PairsCodeOutcome$NotReady r0 = com.facebook.aura.pairs.PairsCodeOutcome.NotReady.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 == 0) goto L47
            com.facebook.aura.pairs.PairsCodeProgress$Unreachable r0 = com.facebook.aura.pairs.PairsCodeProgress.Unreachable.INSTANCE
        L44:
            com.facebook.aura.pairs.PairsCodeProgress r0 = (com.facebook.aura.pairs.PairsCodeProgress) r0
            goto L36
        L47:
            com.facebook.aura.pairs.PairsCodeOutcome$Gone r0 = com.facebook.aura.pairs.PairsCodeOutcome.Gone.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 == 0) goto L52
            com.facebook.aura.pairs.PairsCodeProgress$Gone r0 = com.facebook.aura.pairs.PairsCodeProgress.Gone.INSTANCE
            goto L44
        L52:
            com.facebook.aura.pairs.PairsCodeOutcome$Expired r0 = com.facebook.aura.pairs.PairsCodeOutcome.Expired.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 == 0) goto L5d
            com.facebook.aura.pairs.PairsCodeProgress$Expired r0 = com.facebook.aura.pairs.PairsCodeProgress.Expired.INSTANCE
            goto L44
        L5d:
            com.facebook.aura.pairs.PairsCodeOutcome$Unavailable r0 = com.facebook.aura.pairs.PairsCodeOutcome.Unavailable.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 == 0) goto L7b
            X.3Em<com.facebook.aura.pairs.PairsStatusEffect> r2 = r7._effects
            r0 = 2131889567(0x7f120d9f, float:1.9413801E38)
            com.facebook.aura.pairs.PairsStatusEffect$Message r1 = new com.facebook.aura.pairs.PairsStatusEffect$Message
            r1.<init>(r0)
            r0 = 0
            r4.L$0 = r0
            r4.label = r6
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L9e
            return r3
        L7b:
            com.facebook.aura.pairs.PairsCodeOutcome$Failed r0 = com.facebook.aura.pairs.PairsCodeOutcome.Failed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 != 0) goto L98
            com.facebook.aura.pairs.PairsCodeOutcome$AlreadyConfirmed r0 = com.facebook.aura.pairs.PairsCodeOutcome.AlreadyConfirmed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 != 0) goto L98
            com.facebook.aura.pairs.PairsCodeOutcome$Confirmed r0 = com.facebook.aura.pairs.PairsCodeOutcome.Confirmed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r8, r0)
            if (r0 != 0) goto L98
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L98:
            com.facebook.aura.pairs.PairsCodeProgress$ReadFailed r0 = com.facebook.aura.pairs.PairsCodeProgress.ReadFailed.INSTANCE
            goto L44
        L9b:
            X.Hwg.A00(r1)
        L9e:
            com.facebook.aura.pairs.PairsCodeProgress$ReadFailed r0 = com.facebook.aura.pairs.PairsCodeProgress.ReadFailed.INSTANCE
            r7.setProgress(r0)
            r0 = 0
            r4.L$0 = r0
            r4.label = r5
            java.lang.Object r0 = r7.load(r4)
            if (r0 != r3) goto L23
            return r3
        Laf:
            com.facebook.aura.pairs.PairsStatusViewModel$handleRead$1 r4 = new com.facebook.aura.pairs.PairsStatusViewModel$handleRead$1
            r4.<init>(r9)
            goto L12
        Lb6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusViewModel.handleRead(com.facebook.aura.pairs.PairsCodeOutcome, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r8.access.canConfirmSafetyCode != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.pairs.PairsStatusKind kind(com.facebook.aura.pairs.PairsStatusSnapshot r8) {
        /*
            r7 = this;
            com.facebook.aura.pairs.PairsContact r5 = r8.contact
            if (r5 == 0) goto L9f
            com.facebook.aura.pairs.PairsCodeProgress r1 = r7.progress
            com.facebook.aura.pairs.PairsCodeProgress$Gone r0 = com.facebook.aura.pairs.PairsCodeProgress.Gone.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L9f
            com.facebook.aura.pairs.PairsRelationshipState r1 = r5.relationshipState
            int[] r0 = com.facebook.aura.pairs.PairsStatusViewModel.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r6 = 1
            r0 = 3
            if (r1 == r0) goto L9c
            r0 = 4
            if (r1 == r0) goto L99
            com.facebook.aura.pairs.PairsCodeProgress r1 = r7.progress
            com.facebook.aura.pairs.PairsCodeProgress$Expired r0 = com.facebook.aura.pairs.PairsCodeProgress.Expired.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L37
            java.lang.Long r0 = r5.requestExpiresAtMs
            if (r0 == 0) goto L3a
            long r3 = r0.longValue()
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3a
        L37:
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.EXPIRED
            return r0
        L3a:
            boolean r0 = r5.getHasConfirmedLocally()
            if (r0 != 0) goto L7c
            com.facebook.aura.pairs.PairsCodeProgress r1 = r7.progress
            com.facebook.aura.pairs.PairsCodeProgress$Unreachable r0 = com.facebook.aura.pairs.PairsCodeProgress.Unreachable.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L4d
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.UNREACHABLE
            return r0
        L4d:
            java.lang.Long r0 = r7.serverWaitStartMs
            if (r0 == 0) goto L67
            long r0 = r0.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L67
            boolean r0 = r8.getAwaitsServerConfirmation()
            r1 = 1
            if (r0 != 0) goto L68
        L67:
            r1 = 0
        L68:
            boolean r0 = r8.getPredictsServerConfirmation()
            if (r0 == 0) goto L94
            if (r1 != 0) goto L94
        L70:
            com.facebook.aura.pairs.PairsRelationshipState r1 = r5.relationshipState
            com.facebook.aura.pairs.PairsRelationshipState r0 = com.facebook.aura.pairs.PairsRelationshipState.PENDING
            if (r1 != r0) goto L7f
            com.facebook.aura.pairs.PairsAccess r0 = r8.access
            boolean r0 = r0.canConfirmSafetyCode
            if (r0 == 0) goto L96
        L7c:
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.WAITING
            return r0
        L7f:
            com.facebook.aura.pairs.PairsRelationshipState r0 = com.facebook.aura.pairs.PairsRelationshipState.AWAITING_SAS
            if (r1 != r0) goto L7c
            if (r6 != 0) goto L7c
            boolean r0 = r7.confirmsAutomatically(r8)
            if (r0 != 0) goto L7c
            com.facebook.aura.pairs.PairsAccess r0 = r8.access
            boolean r0 = r0.canConfirmSafetyCode
            if (r0 == 0) goto L96
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.PROMPT
            return r0
        L94:
            r6 = 0
            goto L70
        L96:
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.UNAVAILABLE
            return r0
        L99:
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.IDENTITY_CHANGED
            return r0
        L9c:
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.VERIFIED
            return r0
        L9f:
            com.facebook.aura.pairs.PairsStatusKind r0 = com.facebook.aura.pairs.PairsStatusKind.GONE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusViewModel.kind(com.facebook.aura.pairs.PairsStatusSnapshot):com.facebook.aura.pairs.PairsStatusKind");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.HtJ<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusViewModel.load(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publish() {
        PairsStatusSnapshot pairsStatusSnapshot = this.snapshot;
        if (pairsStatusSnapshot != null) {
            PairsStatusKind pairsStatusKindKind = kind(pairsStatusSnapshot);
            AnonymousClass002.A1I(this._uiState, new PairsStatusUiState.Loaded(pairsStatusSnapshot, this.progress, pairsStatusKindKind, this.isRemoving));
            advance(pairsStatusSnapshot, pairsStatusKindKind);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readCode(PairsPairingCode pairsPairingCode) {
        PairsStatusUiState.Loaded loaded;
        if (this.codeJob != null || this.snapshot == null) {
            return;
        }
        this.progress = PairsCodeProgress.ReadingCode.INSTANCE;
        BLG<PairsStatusUiState> blg = this._uiState;
        PairsStatusUiState value = blg.getValue();
        blg.Af8((!(value instanceof PairsStatusUiState.Loaded) || (loaded = (PairsStatusUiState.Loaded) value) == null) ? this._uiState.getValue() : new PairsStatusUiState.Loaded(loaded.snapshot, this.progress, loaded.kind, this.isRemoving));
        this.codeJob = AnonymousClass001.A11(new C130002(pairsPairingCode, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgress(PairsCodeProgress pairsCodeProgress) {
        this.progress = pairsCodeProgress;
        publish();
    }

    public final void connect() {
        PairsCodeProgress.CodeReady codeReady;
        PairsCodeProgress pairsCodeProgress = this.progress;
        if ((pairsCodeProgress instanceof PairsCodeProgress.CodeReady) && (codeReady = (PairsCodeProgress.CodeReady) pairsCodeProgress) != null && this.codeJob == null) {
            setProgress(new PairsCodeProgress.Confirming(codeReady.code));
            this.codeJob = AnonymousClass001.A11(new C129961(codeReady, null), AEu.A00(this));
        }
    }

    public final C22I<PairsStatusEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<PairsStatusUiState> getUiState() {
        return this.uiState;
    }

    public final void remove() {
        PairsContact pairsContact;
        PairsStatusSnapshot pairsStatusSnapshot = this.snapshot;
        if (pairsStatusSnapshot == null || (pairsContact = pairsStatusSnapshot.contact) == null || this.isRemoving || (this.progress instanceof PairsCodeProgress.Confirming)) {
            return;
        }
        HoC hoC = this.codeJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.codeJob = null;
        this.isRemoving = true;
        publish();
        AnonymousClass001.A1J(new C130011(pairsContact, null), AEu.A00(this));
    }

    public final void retry() {
        if (!(this._uiState.getValue() instanceof PairsStatusUiState.Loaded)) {
            this._uiState.Af8(PairsStatusUiState.Loading.INSTANCE);
            AnonymousClass001.A1J(new C130021(null), AEu.A00(this));
            return;
        }
        PairsStatusSnapshot pairsStatusSnapshot = this.snapshot;
        if (pairsStatusSnapshot != null) {
            PairsHeldInvite pairsHeldInvite = pairsStatusSnapshot.heldInvite;
            if (this.codeJob != null || !pairsStatusSnapshot.getCanRetryAccept() || !C7384Etj.areEqual(this.progress, PairsCodeProgress.Unreachable.INSTANCE) || pairsHeldInvite == null) {
                readCode(null);
                return;
            }
            setProgress(PairsCodeProgress.ReadingCode.INSTANCE);
            this.codeJob = AnonymousClass001.A11(new C130032(pairsHeldInvite, null), AEu.A00(this));
        }
    }

    public PairsStatusViewModel(PairsRepository pairsRepository, String str, PairsRole pairsRole, boolean z) {
        boolean zA1b = AnonymousClass004.A1b(pairsRepository, str);
        C7384Etj.A0Y(pairsRole, 2);
        this.repository = pairsRepository;
        this.generationId = str;
        this.role = pairsRole;
        this.fromHub = z;
        C9286GCn c9286GCnA01 = HnJ.A01(PairsStatusUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A01, zA1b ? 1 : 0, 2);
        this._effects = c9290GCrA12;
        this.effects = C3pd.A00(c9290GCrA12);
        this.progress = PairsCodeProgress.Idle.INSTANCE;
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
    }

    private final void advance(PairsStatusSnapshot pairsStatusSnapshot, PairsStatusKind pairsStatusKind) {
        String str;
        boolean zConfirmsAutomatically = confirmsAutomatically(pairsStatusSnapshot);
        if (zConfirmsAutomatically && (this.progress instanceof PairsCodeProgress.CodeReady)) {
            connect();
            return;
        }
        PairsStatusKind pairsStatusKind2 = PairsStatusKind.PROMPT;
        if (pairsStatusKind != pairsStatusKind2 && (this.progress instanceof PairsCodeProgress.CodeReady)) {
            this.progress = PairsCodeProgress.Idle.INSTANCE;
        }
        if ((pairsStatusKind == pairsStatusKind2 || zConfirmsAutomatically) && C7384Etj.areEqual(this.progress, PairsCodeProgress.Idle.INSTANCE)) {
            readCode(null);
        }
        if (pairsStatusKind == PairsStatusKind.VERIFIED && this.completionJob == null) {
            PairsContact pairsContact = pairsStatusSnapshot.contact;
            if (pairsContact == null || (str = pairsContact.displayName) == null) {
                str = "";
            }
            this.completionJob = AnonymousClass001.A11(new C129951(str, null), AEu.A00(this));
        }
    }

    private final void trackServerWait(PairsStatusSnapshot pairsStatusSnapshot) {
        if (pairsStatusSnapshot.getAwaitsServerConfirmation()) {
            if (this.serverWaitStartMs == null) {
                this.serverWaitStartMs = C60O.A0k();
                this.graceJob = AnonymousClass001.A11(new C130041(null), AEu.A00(this));
                return;
            }
            return;
        }
        this.serverWaitStartMs = null;
        HoC hoC = this.graceJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.graceJob = null;
    }
}

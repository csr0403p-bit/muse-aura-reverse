package com.facebook.aura.nudge;

import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C4JM;
import X.C6ys;
import X.C78T;
import X.C79;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.G2j;
import X.GAo;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HyO;
import X.HzP;
import com.facebook.aura.conversation.api.ConversationCardRequests;
import com.facebook.aura.conversation.api.ConversationInputBlocks;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.nudge.NudgeState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConversationNudges {
    public static final int $stable = 0;
    public static final ConversationNudges INSTANCE = new ConversationNudges();

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges", f = "ConversationNudges.kt", l = {98}, m = "awaitOnDemand", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationNudges$awaitOnDemand$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationNudges.this.awaitOnDemand(null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$observeOffered$1", f = "ConversationNudges.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationNudges$observeOffered$1, reason: invalid class name and case insensitive filesystem */
    public final class C127901 extends AbstractC07127nr implements G0V<HyO<? super ConversationNudge>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<Boolean> $hasPendingApproval;
        public final /* synthetic */ C20Q<Boolean> $isBlocked;
        public final /* synthetic */ C20Q<Boolean> $isConversationIdle;
        public final /* synthetic */ C20Q<Boolean> $isInputBlocked;
        public final /* synthetic */ ConversationCardRequests $requests;
        public final /* synthetic */ NudgeSurface $surface;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$observeOffered$1$1", f = "ConversationNudges.kt", l = {55}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationNudges$observeOffered$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02601 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Q<Boolean> $isBlocked;
            public final /* synthetic */ C20Q<Boolean> $isConversationIdle;
            public final /* synthetic */ NudgeSurface $surface;
            public final /* synthetic */ AbstractC3358CGz $userSession;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$observeOffered$1$1$1", f = "ConversationNudges.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.nudge.ConversationNudges$observeOffered$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public final class C02611 extends AbstractC07127nr implements G2j<Boolean, Boolean, Long, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public /* synthetic */ boolean Z$1;
                public int label;

                public C02611(HtJ<? super C02611> htJ) {
                    super(4, htJ);
                }

                @Override // X.G2j
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Long l, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), l.longValue(), htJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    /*
                        r3 = this;
                        boolean r2 = r3.Z$0
                        boolean r1 = r3.Z$1
                        int r0 = r3.label
                        if (r0 != 0) goto L16
                        X.Hwg.A00(r4)
                        if (r2 == 0) goto L10
                        r0 = 1
                        if (r1 == 0) goto L11
                    L10:
                        r0 = 0
                    L11:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L16:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationNudges.C127901.C02601.C02611.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                public final Object invoke(boolean z, boolean z2, long j, HtJ<? super Boolean> htJ) {
                    C02611 c02611 = new C02611(htJ);
                    c02611.Z$0 = z;
                    c02611.Z$1 = z2;
                    return c02611.invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02601(C20Q<Boolean> c20q, C20Q<Boolean> c20q2, AbstractC3358CGz abstractC3358CGz, NudgeSurface nudgeSurface, HtJ<? super C02601> htJ) {
                super(2, htJ);
                this.$isConversationIdle = c20q;
                this.$isBlocked = c20q2;
                this.$userSession = abstractC3358CGz;
                this.$surface = nudgeSurface;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02601(this.$isConversationIdle, this.$isBlocked, this.$userSession, this.$surface, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    ConversationNudges$observeOffered$1$1$invokeSuspend$$inlined$filter$1 conversationNudges$observeOffered$1$1$invokeSuspend$$inlined$filter$1 = new ConversationNudges$observeOffered$1$1$invokeSuspend$$inlined$filter$1(C3rb.A00(new C02611(null), this.$isConversationIdle, this.$isBlocked, ConversationNudgeCoordinator.evaluationRequests));
                    final AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    final NudgeSurface nudgeSurface = this.$surface;
                    C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.nudge.ConversationNudges.observeOffered.1.1.3
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            return C3cG.A0U(ConversationNudgeCoordinator.INSTANCE.evaluate(C4JM.A00(), abstractC3358CGz, nudgeSurface, htJ));
                        }
                    };
                    this.label = 1;
                    if (conversationNudges$observeOffered$1$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
                return ((C02601) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$observeOffered$1$2", f = "ConversationNudges.kt", l = {66}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationNudges$observeOffered$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Q<Boolean> $hasPendingApproval;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C20Q<Boolean> c20q, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$hasPendingApproval = c20q;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$hasPendingApproval, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    ConversationNudges$observeOffered$1$2$invokeSuspend$$inlined$filter$1 conversationNudges$observeOffered$1$2$invokeSuspend$$inlined$filter$1 = new ConversationNudges$observeOffered$1$2$invokeSuspend$$inlined$filter$1(this.$hasPendingApproval);
                    C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.nudge.ConversationNudges.observeOffered.1.2.2
                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            ConversationNudgeCoordinator.INSTANCE.onAgentApprovalPending();
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            ConversationNudgeCoordinator.INSTANCE.onAgentApprovalPending();
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (conversationNudges$observeOffered$1$2$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
                return new AnonymousClass2(this.$hasPendingApproval, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$observeOffered$1$3", f = "ConversationNudges.kt", l = {71}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationNudges$observeOffered$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ ConversationCardRequests $requests;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ConversationCardRequests conversationCardRequests, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.$requests = conversationCardRequests;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass3(this.$requests, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    ConversationNudges$observeOffered$1$3$invokeSuspend$$inlined$filter$1 conversationNudges$observeOffered$1$3$invokeSuspend$$inlined$filter$1 = new ConversationNudges$observeOffered$1$3$invokeSuspend$$inlined$filter$1(this.$requests.hasPendingCards);
                    C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.nudge.ConversationNudges.observeOffered.1.3.2
                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            ConversationNudgeCoordinator.INSTANCE.onCardRequestPending();
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            ConversationNudgeCoordinator.INSTANCE.onCardRequestPending();
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (conversationNudges$observeOffered$1$3$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
                return new AnonymousClass3(this.$requests, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$observeOffered$1$4", f = "ConversationNudges.kt", l = {74}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationNudges$observeOffered$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Q<Boolean> $isInputBlocked;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(C20Q<Boolean> c20q, HtJ<? super AnonymousClass4> htJ) {
                super(2, htJ);
                this.$isInputBlocked = c20q;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass4(this.$isInputBlocked, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    ConversationNudges$observeOffered$1$4$invokeSuspend$$inlined$filter$1 conversationNudges$observeOffered$1$4$invokeSuspend$$inlined$filter$1 = new ConversationNudges$observeOffered$1$4$invokeSuspend$$inlined$filter$1(this.$isInputBlocked);
                    C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.nudge.ConversationNudges.observeOffered.1.4.2
                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            ConversationNudgeCoordinator.INSTANCE.onInputBlocked();
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            ConversationNudgeCoordinator.INSTANCE.onInputBlocked();
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (conversationNudges$observeOffered$1$4$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
                return new AnonymousClass4(this.$isInputBlocked, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$observeOffered$1$5", f = "ConversationNudges.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationNudges$observeOffered$1$5, reason: invalid class name */
        public final class AnonymousClass5 extends AbstractC07127nr implements G0W<NudgeState, Boolean, HtJ<? super ConversationNudge>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
                super(3, htJ);
            }

            public final Object invoke(NudgeState nudgeState, boolean z, HtJ<? super ConversationNudge> htJ) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(htJ);
                anonymousClass5.L$0 = nudgeState;
                anonymousClass5.Z$0 = z;
                return anonymousClass5.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                NudgeState nudgeState = (NudgeState) this.L$0;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                ConversationNudge activeNudge = ConversationNudgeCoordinatorKt.getActiveNudge(nudgeState);
                if (activeNudge == null || (z && !(nudgeState instanceof NudgeState.AwaitingOutcome))) {
                    return null;
                }
                return activeNudge;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(NudgeState nudgeState, Boolean bool, HtJ<? super ConversationNudge> htJ) {
                return invoke(nudgeState, AnonymousClass001.A1X(bool), htJ);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127901(C20Q<Boolean> c20q, C20Q<Boolean> c20q2, AbstractC3358CGz abstractC3358CGz, NudgeSurface nudgeSurface, C20Q<Boolean> c20q3, ConversationCardRequests conversationCardRequests, C20Q<Boolean> c20q4, HtJ<? super C127901> htJ) {
            super(2, htJ);
            this.$isBlocked = c20q;
            this.$isConversationIdle = c20q2;
            this.$userSession = abstractC3358CGz;
            this.$surface = nudgeSurface;
            this.$hasPendingApproval = c20q3;
            this.$requests = conversationCardRequests;
            this.$isInputBlocked = c20q4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C127901 c127901 = new C127901(this.$isBlocked, this.$isConversationIdle, this.$userSession, this.$surface, this.$hasPendingApproval, this.$requests, this.$isInputBlocked, htJ);
            c127901.L$0 = obj;
            return c127901;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(obj);
                C02601 c02601 = new C02601(this.$isConversationIdle, this.$isBlocked, this.$userSession, this.$surface, null);
                Integer num = C79.A00;
                GAo.A02(num, c78tA0s, c02601, hyO);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$hasPendingApproval, null);
                C6ys c6ys = C6ys.A00;
                GAo.A02(num, c6ys, anonymousClass2, hyO);
                GAo.A02(num, c6ys, new AnonymousClass3(this.$requests, null), hyO);
                GAo.A02(num, c6ys, new AnonymousClass4(this.$isInputBlocked, null), hyO);
                C20Q c20qA04 = C3rb.A04(new AnonymousClass5(null), ConversationNudgeCoordinator.state, this.$isBlocked);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.nudge.ConversationNudges.observeOffered.1.6
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ConversationNudge) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(ConversationNudge conversationNudge, HtJ<? super Unit> htJ) {
                        return C3cG.A0U(hyO.AcU(conversationNudge, htJ));
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c20qA04.collect(c20z, this) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super ConversationNudge> hyO, HtJ<? super Unit> htJ) {
            return ((C127901) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C20Q<ConversationNudge> observeOffered(AbstractC3358CGz abstractC3358CGz, C20Q<Boolean> c20q, NudgeSurface nudgeSurface) {
        AnonymousClass005.A0x(abstractC3358CGz, c20q, nudgeSurface);
        ConversationCardRequests companion = ConversationCardRequests.Companion.getInstance(abstractC3358CGz);
        C20Q c20qA01 = GDB.A01(new ConversationNudges$observeOffered$$inlined$map$1(HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz).pendingApprovals));
        C20Q<Boolean> c20qObserve = ConversationInputBlocks.INSTANCE.observe(abstractC3358CGz);
        return AbstractC05643uj.A01(new C127901(GDB.A01(C3rb.A00(new ConversationNudges$observeOffered$isBlocked$1(null), c20qA01, companion.hasPendingCards, c20qObserve)), c20q, abstractC3358CGz, nudgeSurface, c20qA01, companion, c20qObserve, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitOnDemand(X.AbstractC3358CGz r7, java.lang.String r8, long r9, X.HtJ<? super com.facebook.aura.conversation.api.ConversationCardOutcome> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.facebook.aura.nudge.ConversationNudges.AnonymousClass1
            if (r0 == 0) goto L6a
            r4 = r11
            com.facebook.aura.nudge.ConversationNudges$awaitOnDemand$1 r4 = (com.facebook.aura.nudge.ConversationNudges.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L71
            java.lang.Object r5 = r4.L$2
            com.facebook.aura.nudge.NudgeActionCardRequest r5 = (com.facebook.aura.nudge.NudgeActionCardRequest) r5
            X.Hwg.A00(r0)
        L24:
            com.facebook.aura.nudge.NudgeOutcome r4 = r5.reportedOutcome
            if (r4 == 0) goto L35
            com.facebook.aura.nudge.ConversationNudgeLogging r3 = com.facebook.aura.nudge.ConversationNudgeLogging.INSTANCE
            java.lang.String r2 = r5.getTypeId()
            X.9jH r1 = X.AGH.A0E()
            r3.logOutcome(r2, r4, r1)
        L35:
            com.facebook.aura.nudge.NudgeOutcome r1 = com.facebook.aura.nudge.NudgeOutcome.FAILED
            if (r4 != r1) goto L70
            com.facebook.aura.conversation.api.ConversationCardOutcome r6 = com.facebook.aura.conversation.api.ConversationCardOutcome.FAILED
            return r6
        L3c:
            X.Hwg.A00(r0)
            com.facebook.aura.nudge.ConversationNudge r0 = com.facebook.aura.nudge.ConversationNudgesKt.findNudge(r8)
            if (r0 != 0) goto L48
            com.facebook.aura.conversation.api.ConversationCardOutcome r6 = com.facebook.aura.conversation.api.ConversationCardOutcome.UNAVAILABLE
            return r6
        L48:
            com.facebook.aura.nudge.NudgeActionCardRequest r5 = new com.facebook.aura.nudge.NudgeActionCardRequest
            r5.<init>(r8, r9)
            com.facebook.aura.conversation.api.ConversationCardRequests$Companion r0 = com.facebook.aura.conversation.api.ConversationCardRequests.Companion
            com.facebook.aura.conversation.api.ConversationCardRequests r2 = r0.getInstance(r7)
            r1 = 0
            com.facebook.aura.nudge.ConversationNudges$awaitOnDemand$cardOutcome$1 r0 = new com.facebook.aura.nudge.ConversationNudges$awaitOnDemand$cardOutcome$1
            r0.<init>(r5, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.L$2 = r5
            r4.J$0 = r9
            r4.label = r3
            java.lang.Object r0 = r2.await(r5, r0, r4)
            if (r0 != r6) goto L24
            return r6
        L6a:
            com.facebook.aura.nudge.ConversationNudges$awaitOnDemand$1 r4 = new com.facebook.aura.nudge.ConversationNudges$awaitOnDemand$1
            r4.<init>(r11)
            goto L12
        L70:
            return r0
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationNudges.awaitOnDemand(X.CGz, java.lang.String, long, X.HtJ):java.lang.Object");
    }

    public final void requestEvaluation() {
        ConversationNudgeCoordinator.INSTANCE.requestEvaluation();
    }

    public final void reset() {
        ConversationNudgeCoordinator.INSTANCE.reset();
    }
}

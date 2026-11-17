package com.facebook.aura.nudge;

import X.AbstractC05633ui;
import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBb;
import X.BFM;
import X.BLG;
import X.BRg;
import X.C05663ul;
import X.C0881AGi;
import X.C10543Hqv;
import X.C1D3;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3pS;
import X.C3pU;
import X.C6ys;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HnJ;
import X.Hr7;
import X.HtJ;
import X.Hwg;
import X.HyO;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.conversation.api.PendingConversationCard;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContext;
import com.facebook.aura.conversation.widget.api.ConversationTimelineSurface;
import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class ConversationCardTimelineKt {

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimelineKt$observeNudge$1", f = "ConversationCardTimeline.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationCardTimelineKt$observeNudge$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C20Z<? super List<? extends ConversationTimelineContent>>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConversationTimelineContext $context;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimelineKt$observeNudge$1$1", f = "ConversationCardTimeline.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY, 88, 89, AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationCardTimelineKt$observeNudge$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02571 extends AbstractC07127nr implements G0W<C20Z<? super List<? extends ConversationTimelineContent>>, ConversationNudge, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C10543Hqv<ConversationNudge> $leavingNudge;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public Object L$2;
            public Object L$3;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02571(C10543Hqv<ConversationNudge> c10543Hqv, HtJ<? super C02571> htJ) {
                super(3, htJ);
                this.$leavingNudge = c10543Hqv;
            }

            @Override // X.G0W
            public final Object invoke(C20Z<? super List<? extends ConversationTimelineContent>> c20z, ConversationNudge conversationNudge, HtJ<? super Unit> htJ) {
                C02571 c02571 = new C02571(this.$leavingNudge, htJ);
                c02571.L$0 = c20z;
                c02571.L$1 = conversationNudge;
                return c02571.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[RETURN] */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, com.facebook.aura.nudge.ConversationNudge] */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r6 = r10.L$0
                    X.20Z r6 = (X.C20Z) r6
                    java.lang.Object r2 = r10.L$1
                    com.facebook.aura.nudge.ConversationNudge r2 = (com.facebook.aura.nudge.ConversationNudge) r2
                    X.Hji r5 = X.EnumC10460Hji.A02
                    int r0 = r10.label
                    r7 = 4
                    r9 = 3
                    r8 = 2
                    r4 = 0
                    r1 = 1
                    if (r0 == 0) goto L29
                    if (r0 == r1) goto L92
                    if (r0 == r8) goto L20
                    if (r0 == r9) goto L7c
                    if (r0 == r7) goto L92
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L20:
                    java.lang.Object r3 = r10.L$2
                    X.Hqv r3 = (X.C10543Hqv) r3
                    X.Hwg.A00(r11)
                    r0 = r3
                    goto L69
                L29:
                    X.Hwg.A00(r11)
                    X.Hqv<com.facebook.aura.nudge.ConversationNudge> r3 = r10.$leavingNudge
                    if (r2 == 0) goto L48
                    r3.element = r2
                    com.facebook.aura.nudge.ConversationNudgeTimelineContent r0 = new com.facebook.aura.nudge.ConversationNudgeTimelineContent
                    r0.<init>(r2, r1)
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    r10.L$0 = r4
                    r10.L$1 = r4
                    r10.label = r1
                L41:
                    java.lang.Object r0 = r6.emit(r0, r10)
                    if (r0 != r5) goto L95
                    return r5
                L48:
                    T r2 = r3.element
                    com.facebook.aura.nudge.ConversationNudge r2 = (com.facebook.aura.nudge.ConversationNudge) r2
                    if (r2 == 0) goto L85
                    r1 = 0
                    com.facebook.aura.nudge.ConversationNudgeTimelineContent r0 = new com.facebook.aura.nudge.ConversationNudgeTimelineContent
                    r0.<init>(r2, r1)
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    r10.L$0 = r6
                    r10.L$1 = r4
                    r10.L$2 = r3
                    r10.L$3 = r4
                    r10.label = r8
                    java.lang.Object r0 = r6.emit(r0, r10)
                    if (r0 == r5) goto L97
                    r0 = r3
                L69:
                    r10.L$0 = r6
                    r10.L$1 = r4
                    r10.L$2 = r3
                    r10.L$3 = r4
                    r10.label = r9
                    r1 = 280(0x118, double:1.383E-321)
                    java.lang.Object r1 = X.C7Bq.A01(r1, r10)
                    if (r1 != r5) goto L83
                    return r5
                L7c:
                    java.lang.Object r0 = r10.L$2
                    X.Hqv r0 = (X.C10543Hqv) r0
                    X.Hwg.A00(r11)
                L83:
                    r0.element = r4
                L85:
                    X.AGi r0 = X.C0881AGi.A00
                    r10.L$0 = r4
                    r10.L$1 = r4
                    r10.L$2 = r4
                    r10.L$3 = r4
                    r10.label = r7
                    goto L41
                L92:
                    X.Hwg.A00(r11)
                L95:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                L97:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationCardTimelineKt.AnonymousClass1.C02571.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationTimelineContext conversationTimelineContext, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = conversationTimelineContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C10543Hqv c10543HqvA10 = C3cG.A10(obj);
                ConversationNudges conversationNudges = ConversationNudges.INSTANCE;
                ConversationTimelineContext conversationTimelineContext = this.$context;
                C3pS c3pSA00 = AbstractC05633ui.A00(new C02571(c10543HqvA10, null), conversationNudges.observeOffered(conversationTimelineContext.userSession, conversationTimelineContext.isConversationIdle, NudgeSurface.PHONE));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A01(this, c3pSA00, c20z) == enumC10460Hji) {
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
        public final Object invoke(C20Z<? super List<? extends ConversationTimelineContent>> c20z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimelineKt$withExitTransitions$1", f = "ConversationCardTimeline.kt", l = {104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationCardTimelineKt$withExitTransitions$1, reason: invalid class name and case insensitive filesystem */
    public final class C127881 extends AbstractC07127nr implements G0V<HyO<? super List<? extends RequestedCardRow>>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<List<PendingConversationCard>> $this_withExitTransitions;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimelineKt$withExitTransitions$1$1", f = "ConversationCardTimeline.kt", l = {103}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationCardTimelineKt$withExitTransitions$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02581 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HyO<List<RequestedCardRow>> $$this$channelFlow;
            public final /* synthetic */ BLG<List<RequestedCardRow>> $rows;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02581(BLG<List<RequestedCardRow>> blg, HyO<? super List<RequestedCardRow>> hyO, HtJ<? super C02581> htJ) {
                super(2, htJ);
                this.$rows = blg;
                this.$$this$channelFlow = hyO;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02581(this.$rows, this.$$this$channelFlow, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<List<RequestedCardRow>> blg = this.$rows;
                    final HyO<List<RequestedCardRow>> hyO = this.$$this$channelFlow;
                    C20Z<? super List<RequestedCardRow>> c20z = new C20Z() { // from class: com.facebook.aura.nudge.ConversationCardTimelineKt.withExitTransitions.1.1.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((List<RequestedCardRow>) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(List<RequestedCardRow> list, HtJ<? super Unit> htJ) {
                            return C3cG.A0U(hyO.AcU(list, htJ));
                        }
                    };
                    this.label = 1;
                    if (blg.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw C3cG.A0p();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C02581) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C127881(C20Q<? extends List<PendingConversationCard>> c20q, HtJ<? super C127881> htJ) {
            super(2, htJ);
            this.$this_withExitTransitions = c20q;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C127881 c127881 = new C127881(this.$this_withExitTransitions, htJ);
            c127881.L$0 = obj;
            return c127881;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HyO<? super List<? extends RequestedCardRow>> hyO, HtJ<? super Unit> htJ) {
            return invoke2((HyO<? super List<RequestedCardRow>>) hyO, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final C9286GCn c9286GCnA01 = HnJ.A01(C0881AGi.A00);
                AnonymousClass001.A1J(new C02581(c9286GCnA01, hyO, null), hyO);
                C20Q<List<PendingConversationCard>> c20q = this.$this_withExitTransitions;
                C20Z<? super List<PendingConversationCard>> c20z = new C20Z() { // from class: com.facebook.aura.nudge.ConversationCardTimelineKt.withExitTransitions.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((List<PendingConversationCard>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(List<PendingConversationCard> list, HtJ<? super Unit> htJ) {
                        List<RequestedCardRow> value;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(list));
                        for (PendingConversationCard pendingConversationCard : list) {
                            linkedHashMap.put(new Long(pendingConversationCard.sequenceId), pendingConversationCard);
                        }
                        ArrayList arrayListA0h = C3cG.A0h();
                        BLG<List<RequestedCardRow>> blg = c9286GCnA01;
                        do {
                            value = blg.getValue();
                            List<RequestedCardRow> list2 = value;
                            arrayListA0h.clear();
                            arrayList = new ArrayList(Hr7.A1D(list2, 10));
                            for (RequestedCardRow requestedCardRow : list2) {
                                PendingConversationCard pendingConversationCard2 = (PendingConversationCard) linkedHashMap.get(new Long(requestedCardRow.card.sequenceId));
                                if (pendingConversationCard2 != null) {
                                    requestedCardRow = new RequestedCardRow(pendingConversationCard2, true);
                                } else if (requestedCardRow.isVisible) {
                                    PendingConversationCard pendingConversationCard3 = requestedCardRow.card;
                                    arrayListA0h.add(new Long(pendingConversationCard3.sequenceId));
                                    requestedCardRow = new RequestedCardRow(pendingConversationCard3, false);
                                }
                                arrayList.add(requestedCardRow);
                            }
                            HashSet hashSet = new HashSet();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                hashSet.add(new Long(((RequestedCardRow) it.next()).card.sequenceId));
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (PendingConversationCard pendingConversationCard4 : list) {
                                if (!hashSet.contains(new Long(pendingConversationCard4.sequenceId))) {
                                    arrayList3.add(pendingConversationCard4);
                                }
                            }
                            arrayList2 = new ArrayList(Hr7.A1D(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new RequestedCardRow((PendingConversationCard) it2.next(), true));
                            }
                        } while (!blg.A6e(value, AbstractC0878AGe.A0P(arrayList2, arrayList)));
                        HyO<List<RequestedCardRow>> hyO2 = hyO;
                        BLG<List<RequestedCardRow>> blg2 = c9286GCnA01;
                        Iterator it3 = arrayListA0h.iterator();
                        while (it3.hasNext()) {
                            ConversationCardTimelineKt$withExitTransitions$1$2$2$1 conversationCardTimelineKt$withExitTransitions$1$2$2$1 = new ConversationCardTimelineKt$withExitTransitions$1$2$2$1(blg2, ((Number) it3.next()).longValue(), null);
                            GAo.A02(C79.A00, C6ys.A00, conversationCardTimelineKt$withExitTransitions$1$2$2$1, hyO2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HyO<? super List<RequestedCardRow>> hyO, HtJ<? super Unit> htJ) {
            return ((C127881) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final C20Q<List<ConversationTimelineContent>> observeNudge(ConversationTimelineContext conversationTimelineContext) {
        return new C05663ul(new AnonymousClass1(conversationTimelineContext, null));
    }

    public static final C20Q<List<RequestedCardRow>> withExitTransitions(C20Q<? extends List<PendingConversationCard>> c20q) {
        return AbstractC05643uj.A01(new C127881(c20q, null));
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationTimelineSurface.values().length];
            try {
                AnonymousClass002.A13(ConversationTimelineSurface.MAIN_CHAT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConversationTimelineSurface.ASSIST, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: ConversationNudgeItem-T042LqI, reason: not valid java name */
    public static final void m1610ConversationNudgeItemT042LqI(ConversationNudge conversationNudge, boolean z, long j, C1D3 c1d3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1436428943);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationNudge, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c1d3);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            NudgeControls nudgeControlsRememberNudgeControls = ConversationNudgeHostKt.rememberNudgeControls(conversationNudge, z, bfm, iA05 & 126);
            ConversationNudge.ComposeDefaultImpls.Card$default(new ConversationCardControls(nudgeControlsRememberNudgeControls.isEnabled, j, c1d3, nudgeControlsRememberNudgeControls.onAccept, nudgeControlsRememberNudgeControls.onDecline), ConversationCardKt.nudgeRowTransition(bRg2, ConversationCardKt.rememberNudgeRowProgress(conversationNudge.getId(), z, bfm, i4)), conversationNudge, bfm, ((iA05 << 6) & 896) | ConversationCardControls.$stable, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConversationCardTimelineKt$ConversationNudgeItem$1(conversationNudge, z, j, c1d3, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* renamed from: RequestedCardItem-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1611RequestedCardItemfWhpE4E(com.facebook.aura.conversation.api.PendingConversationCard r20, boolean r21, java.lang.String r22, long r23, X.C1D3 r25, X.BRg r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationCardTimelineKt.m1611RequestedCardItemfWhpE4E(com.facebook.aura.conversation.api.PendingConversationCard, boolean, java.lang.String, long, X.1D3, X.BRg, X.BFM, int, int):void");
    }

    public static final String getAnalyticsValue(ConversationTimelineSurface conversationTimelineSurface) {
        int iOrdinal = conversationTimelineSurface.ordinal();
        if (iOrdinal == 0) {
            return HatchSurface.CHAT.getValue();
        }
        if (iOrdinal == 1) {
            return "assist";
        }
        throw C3cG.A0q();
    }
}

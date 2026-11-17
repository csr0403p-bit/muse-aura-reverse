package com.facebook.aura.activation.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00r;
import X.C0dx;
import X.C1003AOr;
import X.C2HU;
import X.C3UX;
import X.C6ys;
import X.C79;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1", f = "AuraWaitlistConfetti.kt", l = {177, 178, 183}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $animationsEnabled;
    public final /* synthetic */ int $celebrationId;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ boolean $isAlreadyJoined;
    public final /* synthetic */ C00r $lastCelebrationId$delegate;
    public final /* synthetic */ AuraWaitlistCelebrationState $state;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1", f = "AuraWaitlistConfetti.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraWaitlistCelebrationState $state;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1$1", f = "AuraWaitlistConfetti.kt", l = {185, 186}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00111 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ AuraWaitlistCelebrationState $state;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00111(AuraWaitlistCelebrationState auraWaitlistCelebrationState, HtJ<? super C00111> htJ) {
                super(2, htJ);
                this.$state = auraWaitlistCelebrationState;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00111(this.$state, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    AT5<Float, AOW> at5 = this.$state.confettiElapsedMs;
                    Float fA0l = AnonymousClass001.A0l();
                    this.label = 1;
                    if (at5.A04(fA0l, this) == enumC10460Hji) {
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
                AT5<Float, AOW> at52 = this.$state.confettiElapsedMs;
                Float f = new Float(AuraWaitlistConfettiKt.getBurst(r0.density).durationMs);
                ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, AuraWaitlistConfettiKt.getBurst(this.$state.density).durationMs);
                this.label = 2;
                if (AnonymousClass002.A0i(at52, aSjA0J, f, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C00111(this.$state, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1$2", f = "AuraWaitlistConfetti.kt", l = {202, HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ AuraWaitlistCelebrationState $state;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AuraWaitlistCelebrationState auraWaitlistCelebrationState, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$state = auraWaitlistCelebrationState;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HoC hoCA11;
                C3UX c3ux = (C3UX) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    hoCA11 = AnonymousClass001.A11(new AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1$2$punch$1(this.$state, null), c3ux);
                    this.L$0 = null;
                    this.L$1 = hoCA11;
                    this.label = 1;
                    if (C7Bq.A01(180L, this) == enumC10460Hji) {
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
                    hoCA11 = (HoC) this.L$1;
                    Hwg.A00(obj);
                }
                hoCA11.A5w(null);
                AT5<Float, AOW> at5 = this.$state.ctaScale;
                Float fA0m = AnonymousClass001.A0m();
                C1003AOr c1003AOr = new C1003AOr(null, 0.72f, 1500.0f);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (AnonymousClass002.A0i(at5, c1003AOr, fA0m, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraWaitlistCelebrationState auraWaitlistCelebrationState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$state = auraWaitlistCelebrationState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            C00111 c00111 = new C00111(this.$state, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, c00111, c3ux);
            GAo.A02(num, c6ys, new AnonymousClass2(this.$state, null), c3ux);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1(boolean z, int i, C0dx c0dx, AuraWaitlistCelebrationState auraWaitlistCelebrationState, boolean z2, C00r c00r, HtJ<? super AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1> htJ) {
        super(2, htJ);
        this.$isAlreadyJoined = z;
        this.$celebrationId = i;
        this.$haptics = c0dx;
        this.$state = auraWaitlistCelebrationState;
        this.$animationsEnabled = z2;
        this.$lastCelebrationId$delegate = c00r;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1(this.$isAlreadyJoined, this.$celebrationId, this.$haptics, this.$state, this.$animationsEnabled, this.$lastCelebrationId$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L15
            if (r0 == r6) goto L47
            if (r0 == r5) goto L65
            if (r0 != r4) goto L7d
            X.Hwg.A00(r8)
        L12:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L15:
            X.Hwg.A00(r8)
            boolean r0 = r7.$isAlreadyJoined
            if (r0 == 0) goto L12
            int r2 = r7.$celebrationId
            X.00r r1 = r7.$lastCelebrationId$delegate
            float r0 = com.facebook.aura.activation.view.AuraWaitlistConfettiKt.CtaPunchScale
            int r0 = r1.AGd()
            if (r2 <= r0) goto L12
            X.00r r1 = r7.$lastCelebrationId$delegate
            int r0 = r7.$celebrationId
            r1.AdX(r0)
            X.0dx r1 = r7.$haptics
            int r0 = com.facebook.aura.vds.compose.accessibility.AuraHaptics.SUCCESS
            r1.AXr(r0)
            com.facebook.aura.activation.view.AuraWaitlistCelebrationState r0 = r7.$state
            X.AT5<java.lang.Float, X.AOW> r1 = r0.ctaScale
            java.lang.Float r0 = X.AnonymousClass001.A0m()
            r7.label = r6
            java.lang.Object r0 = r1.A04(r0, r7)
            if (r0 != r3) goto L4a
            return r3
        L47:
            X.Hwg.A00(r8)
        L4a:
            com.facebook.aura.activation.view.AuraWaitlistCelebrationState r0 = r7.$state
            X.AT5<java.lang.Float, X.AOW> r2 = r0.confettiElapsedMs
            com.facebook.aura.activation.view.AuraConfettiDensity r0 = r0.density
            com.facebook.aura.activation.view.ConfettiBurst r0 = com.facebook.aura.activation.view.AuraWaitlistConfettiKt.getBurst(r0)
            int r0 = r0.durationMs
            float r1 = (float) r0
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.label = r5
            java.lang.Object r0 = r2.A04(r0, r7)
            if (r0 != r3) goto L68
            return r3
        L65:
            X.Hwg.A00(r8)
        L68:
            boolean r0 = r7.$animationsEnabled
            if (r0 == 0) goto L12
            com.facebook.aura.activation.view.AuraWaitlistCelebrationState r2 = r7.$state
            r1 = 0
            com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1 r0 = new com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1$1
            r0.<init>(r2, r1)
            r7.label = r4
            java.lang.Object r0 = X.Hxb.A00(r0, r7)
            if (r0 != r3) goto L12
            return r3
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

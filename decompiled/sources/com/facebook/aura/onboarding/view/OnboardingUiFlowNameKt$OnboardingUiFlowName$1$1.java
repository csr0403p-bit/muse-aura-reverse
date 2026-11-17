package com.facebook.aura.onboarding.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00r;
import X.C05663ul;
import X.C1BO;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1", f = "OnboardingUiFlowName.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX, 146, 155}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isRevealed;
    public final /* synthetic */ C1BO<String> $latestFirstName$delegate;
    public final /* synthetic */ C1BO<String> $latestTitle$delegate;
    public final /* synthetic */ C00r $questionLines$delegate;
    public final /* synthetic */ OnboardingNameReveal $reveal;
    public final /* synthetic */ C00r $titleLines$delegate;
    public float F$0;
    public float F$1;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$1", f = "OnboardingUiFlowName.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ C1BO<String> $latestFirstName$delegate;
        public int label;

        /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02661 extends AbstractC7559F3s implements Function0<String> {
            public final /* synthetic */ C1BO<String> $latestFirstName$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02661(C1BO<String> c1bo) {
                super(0);
                this.$latestFirstName$delegate = c1bo;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ String invoke() {
                return this.$latestFirstName$delegate.getValue();
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return C1BO.A08(this.$latestFirstName$delegate);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$1$2", f = "OnboardingUiFlowName.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(AnonymousClass002.A1X(obj2));
            }

            @Override // X.G0V
            public final Object invoke(String str, HtJ<? super Boolean> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = str;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1BO<String> c1bo, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$latestFirstName$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$latestFirstName$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new C02661(this.$latestFirstName$delegate));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass2, c05663ulA01);
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return new AnonymousClass1(this.$latestFirstName$delegate, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$2", f = "OnboardingUiFlowName.kt", l = {147}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C00r $questionLines$delegate;
        public final /* synthetic */ C00r $titleLines$delegate;
        public int label;

        /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ C00r $questionLines$delegate;
            public final /* synthetic */ C00r $titleLines$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C00r c00r, C00r c00r2) {
                super(0);
                this.$titleLines$delegate = c00r;
                this.$questionLines$delegate = c00r2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke() {
                /*
                    r1 = this;
                    X.00r r0 = r1.$titleLines$delegate
                    int r0 = r0.AGd()
                    if (r0 < 0) goto L11
                    X.00r r0 = r1.$questionLines$delegate
                    int r1 = r0.AGd()
                    r0 = 1
                    if (r1 >= 0) goto L12
                L11:
                    r0 = 0
                L12:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1.AnonymousClass2.AnonymousClass1.invoke():java.lang.Boolean");
            }
        }

        @DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$2$2", f = "OnboardingUiFlowName.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$2$2, reason: invalid class name and collision with other inner class name */
        public final class C02672 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public C02672(HtJ<? super C02672> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02672 c02672 = new C02672(htJ);
                c02672.Z$0 = AnonymousClass001.A1X(obj);
                return c02672;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return AnonymousClass001.A0k(obj, z);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((C02672) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C00r c00r, C00r c00r2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$titleLines$delegate = c00r;
            this.$questionLines$delegate = c00r2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$titleLines$delegate, this.$questionLines$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$titleLines$delegate, this.$questionLines$delegate));
                C02672 c02672 = new C02672(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, c02672, c05663ulA01);
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1(boolean z, OnboardingNameReveal onboardingNameReveal, C1BO<String> c1bo, C1BO<String> c1bo2, C00r c00r, C00r c00r2, HtJ<? super OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1> htJ) {
        super(2, htJ);
        this.$isRevealed = z;
        this.$reveal = onboardingNameReveal;
        this.$latestFirstName$delegate = c1bo;
        this.$latestTitle$delegate = c1bo2;
        this.$titleLines$delegate = c00r;
        this.$questionLines$delegate = c00r2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1(this.$isRevealed, this.$reveal, this.$latestFirstName$delegate, this.$latestTitle$delegate, this.$titleLines$delegate, this.$questionLines$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r10 = 3
            r1 = 1
            r8 = 0
            r3 = 2
            if (r0 == 0) goto L16
            if (r0 == r1) goto L39
            if (r0 == r3) goto L5b
            if (r0 != r10) goto Lbd
            X.Hwg.A00(r12)
        L13:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L16:
            X.Hwg.A00(r12)
            boolean r0 = r11.$isRevealed
            if (r0 == 0) goto L13
            com.facebook.aura.onboarding.view.OnboardingNameReveal r0 = r11.$reveal
            androidx.compose.runtime.MutableState r0 = r0.title$delegate
            java.lang.String r0 = androidx.compose.runtime.MutableState.A05(r0)
            if (r0 != 0) goto L13
            X.1BO<java.lang.String> r0 = r11.$latestFirstName$delegate
            com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$1 r2 = new com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$1
            r2.<init>(r0, r8)
            r11.label = r1
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.GAX.A01(r11, r2, r0)
            if (r0 != r9) goto L3c
            return r9
        L39:
            X.Hwg.A00(r12)
        L3c:
            com.facebook.aura.onboarding.view.OnboardingNameReveal r1 = r11.$reveal
            X.1BO<java.lang.String> r0 = r11.$latestTitle$delegate
            java.lang.String r0 = X.C1BO.A08(r0)
            r1.setTitle(r0)
            X.00r r1 = r11.$titleLines$delegate
            X.00r r0 = r11.$questionLines$delegate
            com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$2 r2 = new com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1$2
            r2.<init>(r1, r0, r8)
            r11.label = r3
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.GAX.A01(r11, r2, r0)
            if (r0 != r9) goto L5e
            return r9
        L5b:
            X.Hwg.A00(r12)
        L5e:
            com.facebook.aura.onboarding.view.TextRevealTiming r1 = com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt.GreetingTitleTiming
            X.00r r0 = r11.$titleLines$delegate
            int r0 = r0.AGd()
            float r7 = r1.endMs(r0)
            r0 = 1128792064(0x43480000, float:200.0)
            float r7 = r7 + r0
            com.facebook.aura.onboarding.view.OnboardingNameReveal r0 = r11.$reveal
            r0.setQuestionStartMs(r7)
            com.facebook.aura.onboarding.view.TextRevealTiming r0 = com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt.QuestionTiming
            float r2 = r0.lineDurationMs
            float r0 = r0.lineOffsetMs
            com.facebook.aura.onboarding.view.TextRevealTiming r1 = new com.facebook.aura.onboarding.view.TextRevealTiming
            r1.<init>(r7, r2, r0)
            X.00r r0 = r11.$questionLines$delegate
            int r0 = r0.AGd()
            float r2 = r1.endMs(r0)
            r1 = 1142292480(0x44160000, float:600.0)
            float r1 = r1 + r7
            r0 = 1135542272(0x43af0000, float:350.0)
            float r1 = r1 + r0
            float r6 = java.lang.Math.max(r2, r1)
            com.facebook.aura.onboarding.view.OnboardingNameReveal r0 = r11.$reveal
            X.AT5<java.lang.Float, X.AOW> r5 = r0.clock
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            com.facebook.aura.onboarding.view.OnboardingNameReveal r0 = r11.$reveal
            X.AT5<java.lang.Float, X.AOW> r0 = r0.clock
            float r0 = X.C3cH.A00(r0)
            float r0 = r6 - r0
            int r3 = (int) r0
            r2 = 0
            if (r3 >= r2) goto La9
            r3 = 0
        La9:
            X.28s r1 = X.C2HU.A02
            X.ASj r0 = new X.ASj
            r0.<init>(r1, r3, r2)
            r11.F$0 = r7
            r11.F$1 = r6
            r11.label = r10
            java.lang.Object r0 = X.AnonymousClass002.A0i(r5, r0, r4, r11, r8)
            if (r0 != r9) goto L13
            return r9
        Lbd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((OnboardingUiFlowNameKt$OnboardingUiFlowName$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

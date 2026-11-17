package com.facebook.aura.onboarding.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00r;
import X.C05663ul;
import X.C2HU;
import X.C3UX;
import X.C3cH;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1", f = "OnboardingUiFlowName.kt", l = {250, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $clock;
    public final /* synthetic */ C00r $subtitleLines$delegate;
    public final /* synthetic */ TextRevealTiming $subtitleTiming;
    public final /* synthetic */ C00r $titleLines$delegate;
    public final /* synthetic */ TextRevealTiming $titleTiming;
    public float F$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1$1", f = "OnboardingUiFlowName.kt", l = {251}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C00r $subtitleLines$delegate;
        public final /* synthetic */ C00r $titleLines$delegate;
        public int label;

        /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02651 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ C00r $subtitleLines$delegate;
            public final /* synthetic */ C00r $titleLines$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02651(C00r c00r, C00r c00r2) {
                super(0);
                this.$titleLines$delegate = c00r;
                this.$subtitleLines$delegate = c00r2;
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
                    X.00r r0 = r1.$subtitleLines$delegate
                    int r1 = r0.AGd()
                    r0 = 1
                    if (r1 >= 0) goto L12
                L11:
                    r0 = 0
                L12:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1.AnonymousClass1.C02651.invoke():java.lang.Boolean");
            }
        }

        @DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1$1$2", f = "OnboardingUiFlowName.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass2;
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
                return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C00r c00r, C00r c00r2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$titleLines$delegate = c00r;
            this.$subtitleLines$delegate = c00r2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$titleLines$delegate, this.$subtitleLines$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new C02651(this.$titleLines$delegate, this.$subtitleLines$delegate));
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
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1(TextRevealTiming textRevealTiming, TextRevealTiming textRevealTiming2, AT5<Float, AOW> at5, C00r c00r, C00r c00r2, HtJ<? super OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1> htJ) {
        super(2, htJ);
        this.$titleTiming = textRevealTiming;
        this.$subtitleTiming = textRevealTiming2;
        this.$clock = at5;
        this.$titleLines$delegate = c00r;
        this.$subtitleLines$delegate = c00r2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1(this.$titleTiming, this.$subtitleTiming, this.$clock, this.$titleLines$delegate, this.$subtitleLines$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$titleLines$delegate, this.$subtitleLines$delegate, null);
            this.label = 1;
            if (GAX.A01(this, anonymousClass1, 500L) == enumC10460Hji) {
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
        float fMax = Math.max(this.$titleTiming.endMs(this.$titleLines$delegate.AGd()), this.$subtitleTiming.endMs(this.$subtitleLines$delegate.AGd()));
        AT5<Float, AOW> at5 = this.$clock;
        Float f = new Float(fMax);
        int iA00 = (int) (fMax - C3cH.A00(this.$clock));
        if (iA00 < 0) {
            iA00 = 0;
        }
        ASj aSj = new ASj(C2HU.A02, iA00, 0);
        this.F$0 = fMax;
        this.label = 2;
        if (AnonymousClass002.A0i(at5, aSj, f, this, null) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((OnboardingUiFlowNameKt$OnboardingUiFlowHeader$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

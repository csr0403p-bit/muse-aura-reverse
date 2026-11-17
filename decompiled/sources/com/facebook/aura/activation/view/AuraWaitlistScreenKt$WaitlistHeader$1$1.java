package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1003AOr;
import X.C3UX;
import X.C6ys;
import X.C79;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$1$1", f = "AuraWaitlistScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$WaitlistHeader$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Float> $alpha$delegate;
    public final /* synthetic */ MutableState<Float> $offsetY$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$1$1$1", f = "AuraWaitlistScreen.kt", l = {342}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Float> $alpha$delegate;
        public int label;

        /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00121 extends AbstractC7559F3s implements G0V<Float, Float, Unit> {
            public final /* synthetic */ MutableState<Float> $alpha$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00121(MutableState<Float> mutableState) {
                super(2);
                this.$alpha$delegate = mutableState;
            }

            public final void invoke(float f, float f2) {
                AuraWaitlistScreenKt.WaitlistHeader$lambda$2(this.$alpha$delegate, f);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                float fA02 = AnonymousClass001.A02(f);
                f2.floatValue();
                AuraWaitlistScreenKt.WaitlistHeader$lambda$2(this.$alpha$delegate, fA02);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Float> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$alpha$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$alpha$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1003AOr<Float> c1003AOr = AuraWaitlistScreenKt.animationSpec;
                C00121 c00121 = new C00121(this.$alpha$delegate);
                this.label = 1;
                if (SuspendAnimationKt.A03(c1003AOr, this, c00121, 0.0f, 1.0f, 0.0f) == enumC10460Hji) {
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
            return new AnonymousClass1(this.$alpha$delegate, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$1$1$2", f = "AuraWaitlistScreen.kt", l = {347}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Float> $offsetY$delegate;
        public int label;

        /* renamed from: com.facebook.aura.activation.view.AuraWaitlistScreenKt$WaitlistHeader$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Float, Float, Unit> {
            public final /* synthetic */ MutableState<Float> $offsetY$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableState<Float> mutableState) {
                super(2);
                this.$offsetY$delegate = mutableState;
            }

            public final void invoke(float f, float f2) {
                AuraWaitlistScreenKt.WaitlistHeader$lambda$5(this.$offsetY$delegate, f);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                float fA02 = AnonymousClass001.A02(f);
                f2.floatValue();
                AuraWaitlistScreenKt.WaitlistHeader$lambda$5(this.$offsetY$delegate, fA02);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState<Float> mutableState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$offsetY$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$offsetY$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1003AOr<Float> c1003AOr = AuraWaitlistScreenKt.animationSpec;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$offsetY$delegate);
                this.label = 1;
                if (SuspendAnimationKt.A03(c1003AOr, this, anonymousClass1, 36.0f, 0.0f, 0.0f) == enumC10460Hji) {
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
            return new AnonymousClass2(this.$offsetY$delegate, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$WaitlistHeader$1$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, HtJ<? super AuraWaitlistScreenKt$WaitlistHeader$1$1> htJ) {
        super(2, htJ);
        this.$alpha$delegate = mutableState;
        this.$offsetY$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AuraWaitlistScreenKt$WaitlistHeader$1$1 auraWaitlistScreenKt$WaitlistHeader$1$1 = new AuraWaitlistScreenKt$WaitlistHeader$1$1(this.$alpha$delegate, this.$offsetY$delegate, htJ);
        auraWaitlistScreenKt$WaitlistHeader$1$1.L$0 = obj;
        return auraWaitlistScreenKt$WaitlistHeader$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$alpha$delegate, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, c3ux);
        GAo.A02(num, c6ys, new AnonymousClass2(this.$offsetY$delegate, null), c3ux);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraWaitlistScreenKt$WaitlistHeader$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

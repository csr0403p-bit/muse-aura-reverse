package com.facebook.aura.ui;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1", f = "HatchSetupAnimationHost.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 217, 221}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Float> $alpha;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnPlaybackStarted$delegate;
    public final /* synthetic */ MutableState<Boolean> $isLottiePlaying$delegate;
    public final /* synthetic */ boolean $isVisible;
    public int label;

    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Float> {
        public final /* synthetic */ C1BO<Float> $alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1BO<Float> c1bo) {
            super(0);
            this.$alpha = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return this.$alpha.getValue();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$2", f = "HatchSetupAnimationHost.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Float, HtJ<? super Boolean>, Object> {
        public /* synthetic */ float F$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.F$0 = AnonymousClass001.A02(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(f >= 1.0f);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Float f, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A02(f), htJ);
        }

        public final Object invoke(float f, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(Float.valueOf(f), htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Float> {
        public final /* synthetic */ C1BO<Float> $alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C1BO<Float> c1bo) {
            super(0);
            this.$alpha = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return this.$alpha.getValue();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$4", f = "HatchSetupAnimationHost.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<Float, HtJ<? super Boolean>, Object> {
        public /* synthetic */ float F$0;
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(htJ);
            anonymousClass4.F$0 = AnonymousClass001.A02(obj);
            return anonymousClass4;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(f <= 0.0f);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Float f, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A02(f), htJ);
        }

        public final Object invoke(float f, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass4) create(Float.valueOf(f), htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1(boolean z, MutableState<Boolean> mutableState, C1BO<Float> c1bo, C1BO<? extends Function0<Unit>> c1bo2, HtJ<? super HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1> htJ) {
        super(2, htJ);
        this.$isVisible = z;
        this.$isLottiePlaying$delegate = mutableState;
        this.$alpha = c1bo;
        this.$currentOnPlaybackStarted$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1(this.$isVisible, this.$isLottiePlaying$delegate, this.$alpha, this.$currentOnPlaybackStarted$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L1b
            if (r0 == r4) goto L42
            if (r0 == r5) goto L50
            if (r0 != r6) goto L77
            X.Hwg.A00(r8)
        L12:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r7.$isLottiePlaying$delegate
            r0 = 0
            androidx.compose.runtime.MutableState.A09(r0, r1)
        L18:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L1b:
            X.Hwg.A00(r8)
            boolean r0 = r7.$isVisible
            r3 = 0
            if (r0 == 0) goto L5e
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r7.$isLottiePlaying$delegate
            r0 = 0
            androidx.compose.runtime.MutableState.A09(r0, r1)
            X.1BO<java.lang.Float> r1 = r7.$alpha
            com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$1 r0 = new com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$1
            r0.<init>(r1)
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$2 r0 = new com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$2
            r0.<init>(r3)
            r7.label = r4
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r2) goto L45
            return r2
        L42:
            X.Hwg.A00(r8)
        L45:
            r7.label = r5
            r0 = 250(0xfa, double:1.235E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r2) goto L53
            return r2
        L50:
            X.Hwg.A00(r8)
        L53:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$isLottiePlaying$delegate
            androidx.compose.runtime.MutableState.A09(r4, r0)
            X.1BO<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r7.$currentOnPlaybackStarted$delegate
            X.C1BO.A0D(r0)
            goto L18
        L5e:
            X.1BO<java.lang.Float> r1 = r7.$alpha
            com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$3 r0 = new com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$3
            r0.<init>(r1)
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$4 r0 = new com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1$4
            r0.<init>(r3)
            r7.label = r6
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r2) goto L12
            return r2
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSetupAnimationHostKt$HatchSetupAnimationHost$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

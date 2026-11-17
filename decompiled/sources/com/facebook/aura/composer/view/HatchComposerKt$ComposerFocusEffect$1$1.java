package com.facebook.aura.composer.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.Awn;
import X.C1518AkS;
import X.C1C3;
import X.C3UX;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1", f = "HatchComposer.kt", l = {2085}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerFocusEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ boolean $isDictating;
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ Function0<Unit> $onFocusRequested;
    public final /* synthetic */ boolean $requested;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1$1", f = "HatchComposer.kt", l = {2086, 2088}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ C1C3 $keyboardController;
        public final /* synthetic */ Function0<Unit> $onFocusRequested;
        public int label;

        /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00741 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final C00741 INSTANCE = new C00741();

            public C00741() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1518AkS c1518AkS, C1C3 c1c3, Function0<Unit> function0, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$focusRequester = c1518AkS;
            this.$keyboardController = c1c3;
            this.$onFocusRequested = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$focusRequester, this.$keyboardController, this.$onFocusRequested, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 2
                r1 = 1
                if (r0 == 0) goto L1e
                if (r0 == r1) goto L2c
                if (r0 != r2) goto L3f
                X.Hwg.A00(r5)
            Lf:
                X.1C3 r0 = r4.$keyboardController
                if (r0 == 0) goto L16
                r0.Afd()
            L16:
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r4.$onFocusRequested
                r0.invoke()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L1e:
                X.Hwg.A00(r5)
                com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1$1$1 r0 = com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1.AnonymousClass1.C00741.INSTANCE
                r4.label = r1
                java.lang.Object r0 = X.AvW.A01(r0, r4)
                if (r0 != r3) goto L2f
                return r3
            L2c:
                X.Hwg.A00(r5)
            L2f:
                X.AkS r0 = r4.$focusRequester
                X.C1518AkS.A00(r0)
                com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1$1$2 r0 = com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1.AnonymousClass1.AnonymousClass2.INSTANCE
                r4.label = r2
                java.lang.Object r0 = X.AvW.A01(r0, r4)
                if (r0 != r3) goto Lf
                return r3
            L3f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt$ComposerFocusEffect$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerFocusEffect$1$1(boolean z, boolean z2, F2N f2n, C1518AkS c1518AkS, C1C3 c1c3, Function0<Unit> function0, HtJ<? super HatchComposerKt$ComposerFocusEffect$1$1> htJ) {
        super(2, htJ);
        this.$requested = z;
        this.$isDictating = z2;
        this.$lifecycle = f2n;
        this.$focusRequester = c1518AkS;
        this.$keyboardController = c1c3;
        this.$onFocusRequested = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchComposerKt$ComposerFocusEffect$1$1(this.$requested, this.$isDictating, this.$lifecycle, this.$focusRequester, this.$keyboardController, this.$onFocusRequested, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$requested && !this.$isDictating) {
                F2N f2n = this.$lifecycle;
                EnumC10573Huf enumC10573Huf = EnumC10573Huf.A05;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$focusRequester, this.$keyboardController, this.$onFocusRequested, null);
                this.label = 1;
                if (Awn.A00(enumC10573Huf, f2n, this, anonymousClass1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((HatchComposerKt$ComposerFocusEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

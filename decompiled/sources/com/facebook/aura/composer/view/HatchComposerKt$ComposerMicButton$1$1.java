package com.facebook.aura.composer.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C0Hi;
import X.C1518AkS;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1", f = "HatchComposer.kt", l = {1506, 1507}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerMicButton$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ C20Q<Unit> $micFocusRequests;
    public int label;

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ C1518AkS $focusRequester;

        /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                l.longValue();
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
            }
        }

        public AnonymousClass2(C1518AkS c1518AkS, C0Hi c0Hi) {
            this.$focusRequester = c1518AkS;
            this.$focusManager = c0Hi;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(kotlin.Unit r7, X.HtJ<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2$emit$1
                if (r0 == 0) goto L3f
                r5 = r8
                com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2$emit$1 r5 = (com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2$emit$1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3f
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r4 = r5.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r2 = 0
                r1 = 1
                if (r0 == 0) goto L2a
                if (r0 != r1) goto L45
                X.Hwg.A00(r4)
            L21:
                X.0Hi r1 = r6.$focusManager
                r0 = 0
                r1.A6G(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L2a:
                X.Hwg.A00(r4)
                X.AkS r0 = r6.$focusRequester
                X.C1518AkS.A00(r0)
                com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2$1 r0 = com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1.AnonymousClass2.AnonymousClass1.INSTANCE
                r5.L$0 = r2
                r5.label = r1
                java.lang.Object r0 = X.AvW.A01(r0, r5)
                if (r0 != r3) goto L21
                return r3
            L3f:
                com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2$emit$1 r5 = new com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2$emit$1
                r5.<init>(r6, r8)
                goto L12
            L45:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1.AnonymousClass2.emit(kotlin.Unit, X.HtJ):java.lang.Object");
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((Unit) obj, (HtJ<? super Unit>) htJ);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
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
    public HatchComposerKt$ComposerMicButton$1$1(C20Q<Unit> c20q, C1518AkS c1518AkS, C0Hi c0Hi, HtJ<? super HatchComposerKt$ComposerMicButton$1$1> htJ) {
        super(2, htJ);
        this.$micFocusRequests = c20q;
        this.$focusRequester = c1518AkS;
        this.$focusManager = c0Hi;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchComposerKt$ComposerMicButton$1$1(this.$micFocusRequests, this.$focusRequester, this.$focusManager, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            this.label = 1;
            if (AvW.A01(anonymousClass1, this) == enumC10460Hji) {
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
        C20Q<Unit> c20q = this.$micFocusRequests;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$focusRequester, this.$focusManager);
        this.label = 2;
        if (c20q.collect(anonymousClass2, this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchComposerKt$ComposerMicButton$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

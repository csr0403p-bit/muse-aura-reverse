package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass602;
import X.C05663ul;
import X.C0dx;
import X.C3UX;
import X.C3pU;
import X.C6v3;
import X.C6ys;
import X.C79;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1", f = "AuraSwipeableCard.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraSwipeableCardKt$AuraSwipeableCard$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ G0U<Boolean, Unit> $onSwipeStateChanged;
    public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$1", f = "AuraSwipeableCard.kt", l = {151}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C0dx $haptic;
        public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;
        public int label;

        /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04291 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04291(AuraSwipeableMenuState auraSwipeableMenuState) {
                super(0);
                this.$swipeableMenuState = auraSwipeableMenuState;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.$swipeableMenuState.isPastThreshold());
            }
        }

        @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$1$2", f = "AuraSwipeableCard.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C0dx $haptic;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C0dx c0dx, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$haptic = c0dx;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$haptic, htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
                return new AnonymousClass2(this.$haptic, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.$haptic.AXr(AuraSwipeableCardKt.SWIPE_HAPTIC);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSwipeableMenuState auraSwipeableMenuState, C0dx c0dx, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$swipeableMenuState = auraSwipeableMenuState;
            this.$haptic = c0dx;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$swipeableMenuState, this.$haptic, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(C6v3.A01(new C04291(this.$swipeableMenuState)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$haptic, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, anonymousClass602A00) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$2", f = "AuraSwipeableCard.kt", l = {157}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<Boolean, Unit> $onSwipeStateChanged;
        public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;
        public int label;

        /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AuraSwipeableMenuState auraSwipeableMenuState) {
                super(0);
                this.$swipeableMenuState = auraSwipeableMenuState;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.$swipeableMenuState.isActive());
            }
        }

        @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$2$2", f = "AuraSwipeableCard.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$3$1$2$2, reason: invalid class name and collision with other inner class name */
        public final class C04302 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
            public final /* synthetic */ G0U<Boolean, Unit> $onSwipeStateChanged;
            public /* synthetic */ boolean Z$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04302(G0U<? super Boolean, Unit> g0u, HtJ<? super C04302> htJ) {
                super(2, htJ);
                this.$onSwipeStateChanged = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C04302 c04302 = new C04302(this.$onSwipeStateChanged, htJ);
                c04302.Z$0 = AnonymousClass001.A1X(obj);
                return c04302;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                AnonymousClass001.A1K(z, this.$onSwipeStateChanged);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
                return ((C04302) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraSwipeableMenuState auraSwipeableMenuState, G0U<? super Boolean, Unit> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$swipeableMenuState = auraSwipeableMenuState;
            this.$onSwipeStateChanged = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$swipeableMenuState, this.$onSwipeStateChanged, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$swipeableMenuState));
                C04302 c04302 = new C04302(this.$onSwipeStateChanged, null);
                this.label = 1;
                if (C3pU.A00(this, c04302, c05663ulA01) == enumC10460Hji) {
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSwipeableCardKt$AuraSwipeableCard$3$1(G0U<? super Boolean, Unit> g0u, AuraSwipeableMenuState auraSwipeableMenuState, C0dx c0dx, HtJ<? super AuraSwipeableCardKt$AuraSwipeableCard$3$1> htJ) {
        super(2, htJ);
        this.$onSwipeStateChanged = g0u;
        this.$swipeableMenuState = auraSwipeableMenuState;
        this.$haptic = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AuraSwipeableCardKt$AuraSwipeableCard$3$1 auraSwipeableCardKt$AuraSwipeableCard$3$1 = new AuraSwipeableCardKt$AuraSwipeableCard$3$1(this.$onSwipeStateChanged, this.$swipeableMenuState, this.$haptic, htJ);
        auraSwipeableCardKt$AuraSwipeableCard$3$1.L$0 = obj;
        return auraSwipeableCardKt$AuraSwipeableCard$3$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$swipeableMenuState, this.$haptic, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, c3ux);
        G0U<Boolean, Unit> g0u = this.$onSwipeStateChanged;
        if (g0u != null) {
            GAo.A02(num, c6ys, new AnonymousClass2(this.$swipeableMenuState, g0u, null), c3ux);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraSwipeableCardKt$AuraSwipeableCard$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

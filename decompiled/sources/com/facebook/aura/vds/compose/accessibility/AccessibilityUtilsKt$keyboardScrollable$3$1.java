package com.facebook.aura.vds.compose.accessibility;

import X.AFs;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C10384HaO;
import X.C2AA;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class AccessibilityUtilsKt$keyboardScrollable$3$1 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
    public final /* synthetic */ Integer $lastItemIndex;
    public final /* synthetic */ float $linePx;
    public final /* synthetic */ float $pageFraction;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ LazyListState $state;

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$1", f = "AccessibilityUtils.kt", l = {148}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $page;
        public final /* synthetic */ LazyListState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, float f, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$state = lazyListState;
            this.$page = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$state, this.$page, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LazyListState lazyListState = this.$state;
                float f = this.$page;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), lazyListState, this, f) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$2", f = "AccessibilityUtils.kt", l = {152}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $page;
        public final /* synthetic */ LazyListState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LazyListState lazyListState, float f, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$state = lazyListState;
            this.$page = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$state, this.$page, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LazyListState lazyListState = this.$state;
                float f = -this.$page;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), lazyListState, this, f) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$3", f = "AccessibilityUtils.kt", l = {156}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $linePx;
        public final /* synthetic */ LazyListState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LazyListState lazyListState, float f, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$state = lazyListState;
            this.$linePx = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$state, this.$linePx, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LazyListState lazyListState = this.$state;
                float f = this.$linePx;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), lazyListState, this, f) == enumC10460Hji) {
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
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$4", f = "AccessibilityUtils.kt", l = {160}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $linePx;
        public final /* synthetic */ LazyListState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LazyListState lazyListState, float f, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$state = lazyListState;
            this.$linePx = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$state, this.$linePx, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LazyListState lazyListState = this.$state;
                float f = -this.$linePx;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), lazyListState, this, f) == enumC10460Hji) {
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
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$5", f = "AccessibilityUtils.kt", l = {164}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LazyListState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(LazyListState lazyListState, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$state = lazyListState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass5(this.$state, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LazyListState lazyListState = this.$state;
                this.label = 1;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                if (lazyListState.A05(0, 0, this) == enumC10460Hji) {
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
            return new AnonymousClass5(this.$state, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m2379invokeZmokQxo(KeyEvent keyEvent) {
        Integer num;
        C3UX c3ux;
        G0V accessibilityUtilsKt$keyboardScrollable$3$1$6$1;
        C7384Etj.A0Y(keyEvent, 0);
        float fA09 = AnonymousClass002.A09(this.$state.A04().AMh()) * this.$pageFraction;
        if (fA09 < 1.0f) {
            fA09 = 1.0f;
        }
        long keyCode = keyEvent.getKeyCode() << 32;
        boolean z = true;
        if (AnonymousClass002.A1M((keyCode > C10384HaO.A0X ? 1 : (keyCode == C10384HaO.A0X ? 0 : -1)))) {
            c3ux = this.$scope;
            accessibilityUtilsKt$keyboardScrollable$3$1$6$1 = new AnonymousClass1(this.$state, fA09, null);
        } else if (keyCode == C10384HaO.A0Y) {
            c3ux = this.$scope;
            accessibilityUtilsKt$keyboardScrollable$3$1$6$1 = new AnonymousClass2(this.$state, fA09, null);
        } else if (keyCode == C10384HaO.A0B) {
            c3ux = this.$scope;
            accessibilityUtilsKt$keyboardScrollable$3$1$6$1 = new AnonymousClass3(this.$state, this.$linePx, null);
        } else if (keyCode == C10384HaO.A0E) {
            c3ux = this.$scope;
            accessibilityUtilsKt$keyboardScrollable$3$1$6$1 = new AnonymousClass4(this.$state, this.$linePx, null);
        } else if (keyCode == C10384HaO.A0K) {
            c3ux = this.$scope;
            accessibilityUtilsKt$keyboardScrollable$3$1$6$1 = new AnonymousClass5(this.$state, null);
        } else {
            if (keyCode != C10384HaO.A0J || (num = this.$lastItemIndex) == null) {
                z = false;
                return Boolean.valueOf(z);
            }
            c3ux = this.$scope;
            accessibilityUtilsKt$keyboardScrollable$3$1$6$1 = new AccessibilityUtilsKt$keyboardScrollable$3$1$6$1(this.$state, num.intValue(), null);
        }
        AnonymousClass001.A1J(accessibilityUtilsKt$keyboardScrollable$3$1$6$1, c3ux);
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityUtilsKt$keyboardScrollable$3$1(LazyListState lazyListState, float f, C3UX c3ux, Integer num, float f2) {
        super(1);
        this.$state = lazyListState;
        this.$pageFraction = f;
        this.$scope = c3ux;
        this.$lastItemIndex = num;
        this.$linePx = f2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
        return m2379invokeZmokQxo(c2aa.A00);
    }
}

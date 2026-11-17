package com.facebook.aura.vds.compose.accessibility;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C00r;
import X.C1003AOr;
import X.C10384HaO;
import X.C1110AYw;
import X.C2AA;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class AccessibilityUtilsKt$keyboardScrollable$2$1 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
    public final /* synthetic */ float $linePx;
    public final /* synthetic */ float $pageFraction;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ C00r $viewportH$delegate;

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$1", f = "AccessibilityUtils.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $pageFraction;
        public final /* synthetic */ C1110AYw $scrollState;
        public final /* synthetic */ C00r $viewportH$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1110AYw c1110AYw, float f, C00r c00r, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$scrollState = c1110AYw;
            this.$pageFraction = f;
            this.$viewportH$delegate = c00r;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$scrollState, this.$pageFraction, this.$viewportH$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1110AYw c1110AYw = this.$scrollState;
                float fAGd = this.$viewportH$delegate.AGd() * this.$pageFraction;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), c1110AYw, this, fAGd) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$2", f = "AccessibilityUtils.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $pageFraction;
        public final /* synthetic */ C1110AYw $scrollState;
        public final /* synthetic */ C00r $viewportH$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C1110AYw c1110AYw, float f, C00r c00r, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$scrollState = c1110AYw;
            this.$pageFraction = f;
            this.$viewportH$delegate = c00r;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$scrollState, this.$pageFraction, this.$viewportH$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1110AYw c1110AYw = this.$scrollState;
                float f = (-this.$viewportH$delegate.AGd()) * this.$pageFraction;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), c1110AYw, this, f) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$3", f = "AccessibilityUtils.kt", l = {78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $linePx;
        public final /* synthetic */ C1110AYw $scrollState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C1110AYw c1110AYw, float f, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$scrollState = c1110AYw;
            this.$linePx = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$scrollState, this.$linePx, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1110AYw c1110AYw = this.$scrollState;
                float f = this.$linePx;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), c1110AYw, this, f) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$4", f = "AccessibilityUtils.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $linePx;
        public final /* synthetic */ C1110AYw $scrollState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C1110AYw c1110AYw, float f, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$scrollState = c1110AYw;
            this.$linePx = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$scrollState, this.$linePx, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1110AYw c1110AYw = this.$scrollState;
                float f = -this.$linePx;
                this.label = 1;
                if (ScrollExtensionsKt.A00(new C1003AOr(null, 1.0f, 1500.0f), c1110AYw, this, f) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$5", f = "AccessibilityUtils.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C1110AYw $scrollState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C1110AYw c1110AYw, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$scrollState = c1110AYw;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass5(this.$scrollState, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1110AYw c1110AYw = this.$scrollState;
                this.label = 1;
                if (C3cG.A0U(ScrollExtensionsKt.A00(AnonymousClass003.A0Q(null), c1110AYw, this, 0 - c1110AYw.A04.AGd())) == enumC10460Hji) {
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
            return new AnonymousClass5(this.$scrollState, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$6", f = "AccessibilityUtils.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$2$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C1110AYw $scrollState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(C1110AYw c1110AYw, HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
            this.$scrollState = c1110AYw;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass6(this.$scrollState, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1110AYw c1110AYw = this.$scrollState;
                int iAGd = c1110AYw.A01.AGd();
                this.label = 1;
                if (C3cG.A0U(ScrollExtensionsKt.A00(AnonymousClass003.A0Q(null), c1110AYw, this, iAGd - c1110AYw.A04.AGd())) == enumC10460Hji) {
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
            return new AnonymousClass6(this.$scrollState, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m2378invokeZmokQxo(KeyEvent keyEvent) {
        C3UX c3ux;
        G0V anonymousClass6;
        C7384Etj.A0Y(keyEvent, 0);
        long keyCode = keyEvent.getKeyCode() << 32;
        boolean z = true;
        if (AnonymousClass002.A1M((keyCode > C10384HaO.A0X ? 1 : (keyCode == C10384HaO.A0X ? 0 : -1)))) {
            c3ux = this.$scope;
            anonymousClass6 = new AnonymousClass1(this.$scrollState, this.$pageFraction, this.$viewportH$delegate, null);
        } else if (keyCode == C10384HaO.A0Y) {
            c3ux = this.$scope;
            anonymousClass6 = new AnonymousClass2(this.$scrollState, this.$pageFraction, this.$viewportH$delegate, null);
        } else if (keyCode == C10384HaO.A0B) {
            c3ux = this.$scope;
            anonymousClass6 = new AnonymousClass3(this.$scrollState, this.$linePx, null);
        } else if (keyCode == C10384HaO.A0E) {
            c3ux = this.$scope;
            anonymousClass6 = new AnonymousClass4(this.$scrollState, this.$linePx, null);
        } else if (keyCode == C10384HaO.A0K) {
            c3ux = this.$scope;
            anonymousClass6 = new AnonymousClass5(this.$scrollState, null);
        } else {
            if (keyCode != C10384HaO.A0J) {
                z = false;
                return Boolean.valueOf(z);
            }
            c3ux = this.$scope;
            anonymousClass6 = new AnonymousClass6(this.$scrollState, null);
        }
        AnonymousClass001.A1J(anonymousClass6, c3ux);
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityUtilsKt$keyboardScrollable$2$1(C3UX c3ux, C1110AYw c1110AYw, float f, C00r c00r, float f2) {
        super(1);
        this.$scope = c3ux;
        this.$scrollState = c1110AYw;
        this.$pageFraction = f;
        this.$viewportH$delegate = c00r;
        this.$linePx = f2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
        return m2378invokeZmokQxo(c2aa.A00);
    }
}

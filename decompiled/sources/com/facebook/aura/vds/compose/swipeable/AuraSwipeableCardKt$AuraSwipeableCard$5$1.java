package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC07127nr;
import X.AbstractC1712Aov;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0dx;
import X.C10384HaO;
import X.C2AA;
import X.C3UX;
import X.C7384Etj;
import X.C8j4;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$AuraSwipeableCard$5$1 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
    public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ MutableState<Boolean> $keyboardSwipeInProgress;
    public final /* synthetic */ Function0<Unit> $localEndToStartSwipeAction;
    public final /* synthetic */ Function0<Unit> $localStartToEndSwipeAction;

    @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$5$1$1", f = "AuraSwipeableCard.kt", l = {189}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$anchoredDraggableState = anchoredDraggableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$anchoredDraggableState, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$anchoredDraggableState, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState = this.$anchoredDraggableState;
                AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors = AuraSwipeableMenuStateDragAnchors.END_DISMISS;
                this.label = 1;
                if (AnchoredDraggableKt.A02(anchoredDraggableState, auraSwipeableMenuStateDragAnchors, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$5$1$2", f = "AuraSwipeableCard.kt", l = {201}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$5$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$anchoredDraggableState = anchoredDraggableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$anchoredDraggableState, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(this.$anchoredDraggableState, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState = this.$anchoredDraggableState;
                AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors = AuraSwipeableMenuStateDragAnchors.START_ACTION;
                this.label = 1;
                if (AnchoredDraggableKt.A02(anchoredDraggableState, auraSwipeableMenuStateDragAnchors, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$5$1$3", f = "AuraSwipeableCard.kt", l = {224}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$5$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$anchoredDraggableState = anchoredDraggableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$anchoredDraggableState, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass3(this.$anchoredDraggableState, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState = this.$anchoredDraggableState;
                AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors = AuraSwipeableMenuStateDragAnchors.IDLE;
                this.label = 1;
                if (AnchoredDraggableKt.A02(anchoredDraggableState, auraSwipeableMenuStateDragAnchors, this) == enumC10460Hji) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m2635invokeZmokQxo(KeyEvent keyEvent) {
        C3UX c3ux;
        G0V anonymousClass3;
        C7384Etj.A0Y(keyEvent, 0);
        int iA00 = AbstractC1712Aov.A00(keyEvent);
        boolean z = true;
        if (AnonymousClass002.A1Q(iA00, 2)) {
            long jA0N = C8j4.A0N(keyEvent);
            if (jA0N == C10384HaO.A0D) {
                if (this.$localEndToStartSwipeAction != null && !MutableState.A0A((MutableState) this.$keyboardSwipeInProgress)) {
                    this.$keyboardSwipeInProgress.Af8(true);
                    this.$haptic.AXr(AuraSwipeableCardKt.SWIPE_HAPTIC);
                    c3ux = this.$coroutineScope;
                    anonymousClass3 = new AnonymousClass1(this.$anchoredDraggableState, null);
                    AnonymousClass001.A1J(anonymousClass3, c3ux);
                }
                z = false;
            } else {
                if (jA0N == C10384HaO.A0C && this.$localStartToEndSwipeAction != null && !MutableState.A0A((MutableState) this.$keyboardSwipeInProgress)) {
                    this.$keyboardSwipeInProgress.Af8(true);
                    this.$haptic.AXr(AuraSwipeableCardKt.SWIPE_HAPTIC);
                    c3ux = this.$coroutineScope;
                    anonymousClass3 = new AnonymousClass2(this.$anchoredDraggableState, null);
                    AnonymousClass001.A1J(anonymousClass3, c3ux);
                }
                z = false;
            }
        } else if (iA00 == 1 && MutableState.A0A((MutableState) this.$keyboardSwipeInProgress) && ((keyEvent.getKeyCode() << 32) == C10384HaO.A0D || (keyEvent.getKeyCode() << 32) == C10384HaO.A0C)) {
            MutableState.A09(false, this.$keyboardSwipeInProgress);
            AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState = this.$anchoredDraggableState;
            if (anchoredDraggableState.A03(anchoredDraggableState.A0C.getValue(), this.$anchoredDraggableState.A0E.getValue()) < 1.0f) {
                c3ux = this.$coroutineScope;
                anonymousClass3 = new AnonymousClass3(this.$anchoredDraggableState, null);
                AnonymousClass001.A1J(anonymousClass3, c3ux);
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableCardKt$AuraSwipeableCard$5$1(Function0<Unit> function0, MutableState<Boolean> mutableState, C0dx c0dx, C3UX c3ux, Function0<Unit> function02, AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState) {
        super(1);
        this.$localEndToStartSwipeAction = function0;
        this.$keyboardSwipeInProgress = mutableState;
        this.$haptic = c0dx;
        this.$coroutineScope = c3ux;
        this.$localStartToEndSwipeAction = function02;
        this.$anchoredDraggableState = anchoredDraggableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
        return m2635invokeZmokQxo(c2aa.A00);
    }
}

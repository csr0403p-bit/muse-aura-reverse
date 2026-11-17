package com.facebook.aura.vds.compose.picker;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.F1F;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$1$1", f = "AuraWheelDatePicker.kt", l = {246}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$WheelColumn$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<Integer, Unit>> $currentOnSelected;
    public final /* synthetic */ AHD<Integer> $items;
    public final /* synthetic */ LazyListState $listState;
    public Object L$0;
    public int label;

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$listState.AOz());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraWheelDatePickerKt$WheelColumn$1$1(LazyListState lazyListState, AHD<Integer> ahd, C1BO<? extends G0U<? super Integer, Unit>> c1bo, HtJ<? super AuraWheelDatePickerKt$WheelColumn$1$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$items = ahd;
        this.$currentOnSelected = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraWheelDatePickerKt$WheelColumn$1$1(this.$listState, this.$items, this.$currentOnSelected, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final F1F f1f = new F1F();
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$listState));
            final AHD<Integer> ahd = this.$items;
            final LazyListState lazyListState = this.$listState;
            final C1BO<G0U<Integer, Unit>> c1bo = this.$currentOnSelected;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$1$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    F1F f1f2 = f1f;
                    if (z) {
                        f1f2.element = true;
                    } else if (f1f2.element) {
                        Number number = (Number) AbstractC0878AGe.A0A(AuraWheelDatePickerKt.centeredItemIndex(lazyListState), ahd);
                        if (number != null) {
                            C1BO.A0B(c1bo).invoke(new Integer(number.intValue()));
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
        return ((AuraWheelDatePickerKt$WheelColumn$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

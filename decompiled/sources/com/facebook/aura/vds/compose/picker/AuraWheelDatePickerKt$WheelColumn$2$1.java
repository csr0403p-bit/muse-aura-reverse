package com.facebook.aura.vds.compose.picker;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$2$1", f = "AuraWheelDatePicker.kt", l = {257}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$WheelColumn$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ int $selectedIndex;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWheelDatePickerKt$WheelColumn$2$1(LazyListState lazyListState, int i, HtJ<? super AuraWheelDatePickerKt$WheelColumn$2$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$selectedIndex = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraWheelDatePickerKt$WheelColumn$2$1(this.$listState, this.$selectedIndex, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$listState.AOz()) {
                int iCenteredItemIndex = AuraWheelDatePickerKt.centeredItemIndex(this.$listState);
                int i2 = this.$selectedIndex;
                if (iCenteredItemIndex != i2) {
                    LazyListState lazyListState = this.$listState;
                    this.label = 1;
                    if (lazyListState.A06(i2, 0, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
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
        return ((AuraWheelDatePickerKt$WheelColumn$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

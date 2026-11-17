package com.facebook.aura.vds.compose.picker;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$AuraWheelDatePicker$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Integer, String> {
    public final /* synthetic */ List<String> $monthNames;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWheelDatePickerKt$AuraWheelDatePicker$1$1$1$1$1(List<String> list) {
        super(1);
        this.$monthNames = list;
    }

    public final String invoke(int i) {
        return this.$monthNames.get(i - 1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}

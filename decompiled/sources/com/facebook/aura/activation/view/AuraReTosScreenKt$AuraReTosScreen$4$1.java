package com.facebook.aura.activation.view;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.activation.model.HatchReTosViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class AuraReTosScreenKt$AuraReTosScreen$4$1 extends C7438Evz implements G0V<Integer, Boolean, Unit> {
    public AuraReTosScreenKt$AuraReTosScreen$4$1(Object obj) {
        super(2, obj, HatchReTosViewModel.class, "onItemToggled", "onItemToggled(IZ)V", 0);
    }

    public final void invoke(int i, boolean z) {
        ((HatchReTosViewModel) this.receiver).onItemToggled(i, z);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}

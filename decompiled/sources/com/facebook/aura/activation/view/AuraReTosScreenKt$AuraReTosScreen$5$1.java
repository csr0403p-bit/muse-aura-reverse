package com.facebook.aura.activation.view;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.activation.model.HatchReTosViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class AuraReTosScreenKt$AuraReTosScreen$5$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public AuraReTosScreenKt$AuraReTosScreen$5$1(Object obj) {
        super(1, obj, HatchReTosViewModel.class, "onAgreeToAllToggled", "onAgreeToAllToggled(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((HatchReTosViewModel) this.receiver).onAgreeToAllToggled(z);
    }
}

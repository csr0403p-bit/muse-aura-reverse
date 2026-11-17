package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C2Um;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchCcvCardEntryScreenKt$CcvField$1$3$1 extends AbstractC7559F3s implements G0U<C2Um, Unit> {
    public final /* synthetic */ Function0<Unit> $onBlur;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2Um c2Um) {
        C7384Etj.A0Y(c2Um, 0);
        if (c2Um.AOS()) {
            return;
        }
        this.$onBlur.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$CcvField$1$3$1(Function0<Unit> function0) {
        super(1);
        this.$onBlur = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2Um c2Um) {
        invoke2(c2Um);
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.header.view;

import X.ART;
import X.AT3;
import X.AbstractC7559F3s;
import X.C16a;
import X.C1EQ;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchHeaderScrimKt$HatchHeaderScrim$4$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ float $alphaScale;
    public final /* synthetic */ C1EQ $brush;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        at3.A9f(this.$brush, null, C16a.A00, this.$alphaScale, 3, 0L, ART.A00(at3.AKb(), 0L));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHeaderScrimKt$HatchHeaderScrim$4$1(C1EQ c1eq, float f) {
        super(1);
        this.$brush = c1eq;
        this.$alphaScale = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}

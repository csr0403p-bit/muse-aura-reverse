package com.facebook.aura.conversation.view;

import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1D8;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewImage$3$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ Function0<Float> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Ad2(true);
        float f = HatchImageOptionsWidgetKt.TileCornerRadius;
        float fA03 = ATD.A03(AnonymousClass003.A04(this.$progress), 0.0f, 1.0f);
        c2av.Aeg(C1D8.A00(((1.0f - fA03) * f) + (fA03 * 16.0f)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewImage$3$1(Function0<Float> function0) {
        super(1);
        this.$progress = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}

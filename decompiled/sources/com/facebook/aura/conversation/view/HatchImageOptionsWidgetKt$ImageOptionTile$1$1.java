package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$ImageOptionTile$1$1 extends AbstractC7559F3s implements G0V<AaC, Float, Unit> {
    public final /* synthetic */ C1BO<Float> $animatedAlpha$delegate;
    public final /* synthetic */ G0W<AaC, Float, Float, Unit> $onPreview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionsWidgetKt$ImageOptionTile$1$1(G0W<? super AaC, ? super Float, ? super Float, Unit> g0w, C1BO<Float> c1bo) {
        super(2);
        this.$onPreview = g0w;
        this.$animatedAlpha$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC, Float f) {
        invoke(aaC, AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }

    public final void invoke(AaC aaC, float f) {
        C7384Etj.A0Y(aaC, 0);
        this.$onPreview.invoke(aaC, Float.valueOf(f), Float.valueOf(1.0f - C1BO.A01(this.$animatedAlpha$delegate)));
    }
}

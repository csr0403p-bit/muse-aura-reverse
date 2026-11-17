package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$SingleSelectImageOptions$2$1$2$1 extends AbstractC7559F3s implements G0W<AaC, Float, Float, Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0U<ImageOptionPreviewRequest, Unit> $onPreview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionsWidgetKt$SingleSelectImageOptions$2$1$2$1(G0U<? super ImageOptionPreviewRequest, Unit> g0u, int i) {
        super(3);
        this.$onPreview = g0u;
        this.$index = i;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC, Float f, Float f2) {
        invoke(aaC, AnonymousClass001.A02(f), AnonymousClass001.A02(f2));
        return Unit.INSTANCE;
    }

    public final void invoke(AaC aaC, float f, float f2) {
        C7384Etj.A0Y(aaC, 0);
        this.$onPreview.invoke(new ImageOptionPreviewRequest(this.$index, aaC, f, f2));
    }
}

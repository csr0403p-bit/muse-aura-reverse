package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.C1BO;
import X.C60P;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ C1BO<G0U<B6A, Unit>> $currentOnTopColorDetected$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1(C1BO<? extends G0U<? super B6A, Unit>> c1bo) {
        super(1);
        this.$currentOnTopColorDetected$delegate = c1bo;
    }

    public final void invoke(int i) {
        G0U g0uA0B = C1BO.A0B(this.$currentOnTopColorDetected$delegate);
        if (g0uA0B != null) {
            g0uA0B.invoke(C60P.A04(i << 32));
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.widget.FrameLayout;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchWidgetWebViewKt$HatchWidgetWebView$6$1 extends AbstractC7559F3s implements G0U<FrameLayout, Unit> {
    public static final HatchWidgetWebViewKt$HatchWidgetWebView$6$1 INSTANCE = new HatchWidgetWebViewKt$HatchWidgetWebView$6$1();

    public HatchWidgetWebViewKt$HatchWidgetWebView$6$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(FrameLayout frameLayout) {
        invoke2(frameLayout);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FrameLayout frameLayout) {
        C7384Etj.A0Y(frameLayout, 0);
        HatchWidgetWebViewKt.destroyContainer(frameLayout);
    }
}

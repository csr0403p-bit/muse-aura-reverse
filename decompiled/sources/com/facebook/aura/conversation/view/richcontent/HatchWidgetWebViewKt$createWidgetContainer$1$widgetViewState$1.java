package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchWidgetWebViewKt$createWidgetContainer$1$widgetViewState$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ FrameLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWidgetWebViewKt$createWidgetContainer$1$widgetViewState$1(FrameLayout frameLayout) {
        super(0);
        this.$this_apply = frameLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$this_apply.getResources().getDisplayMetrics().density);
    }
}

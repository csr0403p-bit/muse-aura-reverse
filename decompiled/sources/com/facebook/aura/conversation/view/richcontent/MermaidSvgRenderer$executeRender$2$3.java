package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class MermaidSvgRenderer$executeRender$2$3 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ Runnable $timeoutRunnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MermaidSvgRenderer$executeRender$2$3(Runnable runnable) {
        super(1);
        this.$timeoutRunnable = runnable;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        MermaidSvgRenderer.pendingCallback.set(null);
        MermaidSvgRenderer.uiHandler.removeCallbacks(this.$timeoutRunnable);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}

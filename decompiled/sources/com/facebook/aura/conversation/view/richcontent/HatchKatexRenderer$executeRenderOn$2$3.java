package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HatchKatexRenderer$executeRenderOn$2$3 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ HatchKatexRenderer.PooledWebView $pooled;
    public final /* synthetic */ Runnable $timeoutRunnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchKatexRenderer$executeRenderOn$2$3(HatchKatexRenderer.PooledWebView pooledWebView, Runnable runnable) {
        super(1);
        this.$pooled = pooledWebView;
        this.$timeoutRunnable = runnable;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$pooled.pendingCallback.set(null);
        HatchKatexRenderer.uiHandler.removeCallbacks(this.$timeoutRunnable);
        this.$pooled.timedOut = true;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}

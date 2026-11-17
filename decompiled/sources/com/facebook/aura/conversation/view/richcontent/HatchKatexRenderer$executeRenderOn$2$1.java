package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.Hm1;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HatchKatexRenderer$executeRenderOn$2$1 extends AbstractC7559F3s implements G0U<HatchKatexRenderer.RenderResult, Unit> {
    public final /* synthetic */ Hm1<HatchKatexRenderer.RenderResult> $cont;
    public final /* synthetic */ Runnable $timeoutRunnable;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchKatexRenderer.RenderResult renderResult) {
        C7384Etj.A0Y(renderResult, 0);
        HatchKatexRenderer.uiHandler.removeCallbacks(this.$timeoutRunnable);
        if (this.$cont.isActive()) {
            this.$cont.resumeWith(renderResult);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchKatexRenderer$executeRenderOn$2$1(Runnable runnable, Hm1<? super HatchKatexRenderer.RenderResult> hm1) {
        super(1);
        this.$timeoutRunnable = runnable;
        this.$cont = hm1;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchKatexRenderer.RenderResult renderResult) {
        invoke2(renderResult);
        return Unit.INSTANCE;
    }
}

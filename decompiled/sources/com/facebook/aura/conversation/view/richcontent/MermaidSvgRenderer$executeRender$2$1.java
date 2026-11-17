package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.Hm1;
import com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class MermaidSvgRenderer$executeRender$2$1 extends AbstractC7559F3s implements G0U<MermaidSvgRenderer.RawRenderResult, Unit> {
    public final /* synthetic */ Hm1<MermaidSvgRenderer.RawRenderResult> $cont;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MermaidSvgRenderer.RawRenderResult rawRenderResult) {
        C7384Etj.A0Y(rawRenderResult, 0);
        if (this.$cont.isActive()) {
            this.$cont.resumeWith(rawRenderResult);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MermaidSvgRenderer$executeRender$2$1(Hm1<? super MermaidSvgRenderer.RawRenderResult> hm1) {
        super(1);
        this.$cont = hm1;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(MermaidSvgRenderer.RawRenderResult rawRenderResult) {
        invoke2(rawRenderResult);
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.markdown.parser.custom.extensions.MermaidPayload;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ MermaidPayload $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$1$1$1(G0U<? super HatchContentViewModelData, Unit> g0u, MermaidPayload mermaidPayload) {
        super(0);
        this.$onRichFormatOpenCTAClick = g0u;
        this.$payload = mermaidPayload;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
        if (g0u != null) {
            MermaidPayload mermaidPayload = this.$payload;
            g0u.invoke(new HatchContentViewModelData.MermaidDiagram(mermaidPayload.source, null, mermaidPayload.isStreaming));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

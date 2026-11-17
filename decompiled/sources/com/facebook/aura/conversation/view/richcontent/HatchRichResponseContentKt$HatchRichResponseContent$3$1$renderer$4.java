package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$4(HatchContentViewModelData hatchContentViewModelData, G0U<? super HatchContentViewModelData, Unit> g0u) {
        super(2);
        this.$contentViewModel = hatchContentViewModelData;
        this.$onRichFormatOpenCTAClick = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchContentViewModelData.MermaidDiagram mermaidDiagram = (HatchContentViewModelData.MermaidDiagram) this.$contentViewModel;
            String str = mermaidDiagram.mermaidSource;
            boolean z = mermaidDiagram.isStreaming;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$contentViewModel, bfm.A65(this.$onRichFormatOpenCTAClick));
            G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
            HatchContentViewModelData hatchContentViewModelData = this.$contentViewModel;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$4$1$1(g0u, hatchContentViewModelData);
                bfm.Ai0(objAaT);
            }
            HatchMermaidContentKt.m683HatchMermaidContentFJfuzF0(str, (Function0) objAaT, null, z, 0.0f, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 4);
            return;
        }
        bfm.Afo();
    }
}

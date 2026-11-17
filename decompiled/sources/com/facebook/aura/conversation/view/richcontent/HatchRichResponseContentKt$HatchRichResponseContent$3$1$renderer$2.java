package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ boolean $fillTableScreenWidth;
    public final /* synthetic */ AuraMarkdownTheme $markdownTheme;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$2(HatchContentViewModelData hatchContentViewModelData, AuraMarkdownTheme auraMarkdownTheme, boolean z, G0U<? super HatchContentViewModelData, Unit> g0u) {
        super(2);
        this.$contentViewModel = hatchContentViewModelData;
        this.$markdownTheme = auraMarkdownTheme;
        this.$fillTableScreenWidth = z;
        this.$onRichFormatOpenCTAClick = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zA65 = bfm.A65(((HatchContentViewModelData.Table) this.$contentViewModel).tableParams);
            HatchContentViewModelData hatchContentViewModelData = this.$contentViewModel;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchMarkdownTableCardKt.toAuraBlockTable(((HatchContentViewModelData.Table) hatchContentViewModelData).tableParams);
                bfm.Ai0(objAaT);
            }
            AuraBlock.Table table = (AuraBlock.Table) objAaT;
            boolean z = ((HatchContentViewModelData.Table) this.$contentViewModel).isStreaming;
            AuraMarkdownTheme auraMarkdownTheme = this.$markdownTheme;
            boolean z2 = this.$fillTableScreenWidth;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$contentViewModel, bfm.A65(this.$onRichFormatOpenCTAClick));
            G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
            HatchContentViewModelData hatchContentViewModelData2 = this.$contentViewModel;
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$2$1$1(g0u, hatchContentViewModelData2);
                bfm.Ai0(objAaT2);
            }
            HatchMarkdownTableCardKt.m681HatchMarkdownTableCardb7W0Lw(table, auraMarkdownTheme, null, 0.0f, z2, z, (Function0) objAaT2, bfm, 3072, 4);
            return;
        }
        bfm.Afo();
    }
}

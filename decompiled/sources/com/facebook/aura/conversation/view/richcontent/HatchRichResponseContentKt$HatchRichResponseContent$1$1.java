package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.markdown.render.spacing.BlockSpacingKt;
import com.facebook.aura.markdown.render.spacing.BlockSpacingSpec;
import com.facebook.aura.model.HatchContentViewModelData;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$1$1 extends AbstractC7559F3s implements G0U<Integer, BlockSpacingSpec> {
    public final /* synthetic */ AHD<HatchContentViewModelData> $contentViewModelData;
    public final /* synthetic */ AuraMarkdownTheme $markdownTheme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$1$1(AuraMarkdownTheme auraMarkdownTheme, AHD<? extends HatchContentViewModelData> ahd) {
        super(1);
        this.$markdownTheme = auraMarkdownTheme;
        this.$contentViewModelData = ahd;
    }

    public final BlockSpacingSpec invoke(int i) {
        return BlockSpacingKt.spacingFor(this.$markdownTheme, HatchRichResponseContentKt.spacingCategory((HatchContentViewModelData) this.$contentViewModelData.get(i)));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ BlockSpacingSpec invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}

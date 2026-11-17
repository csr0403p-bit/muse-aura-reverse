package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMarkdownTableCardKt$HatchMarkdownTableCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraBlock.Table $block;
    public final /* synthetic */ boolean $fillScreenWidth;
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onSeeMoreClick;
    public final /* synthetic */ float $outerVerticalPadding;
    public final /* synthetic */ AuraMarkdownTheme $theme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarkdownTableCardKt$HatchMarkdownTableCard$2(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, BRg bRg, float f, boolean z, boolean z2, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$block = table;
        this.$theme = auraMarkdownTheme;
        this.$modifier = bRg;
        this.$outerVerticalPadding = f;
        this.$fillScreenWidth = z;
        this.$isStreaming = z2;
        this.$onSeeMoreClick = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchMarkdownTableCardKt.m681HatchMarkdownTableCardb7W0Lw(this.$block, this.$theme, this.$modifier, this.$outerVerticalPadding, this.$fillScreenWidth, this.$isStreaming, this.$onSeeMoreClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchMermaidContentKt$HatchMermaidContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ String $mermaidSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onExpandClick;
    public final /* synthetic */ float $outerVerticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMermaidContentKt$HatchMermaidContent$2(String str, Function0<Unit> function0, BRg bRg, boolean z, float f, int i, int i2) {
        super(2);
        this.$mermaidSource = str;
        this.$onExpandClick = function0;
        this.$modifier = bRg;
        this.$isStreaming = z;
        this.$outerVerticalPadding = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchMermaidContentKt.m683HatchMermaidContentFJfuzF0(this.$mermaidSource, this.$onExpandClick, this.$modifier, this.$isStreaming, this.$outerVerticalPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

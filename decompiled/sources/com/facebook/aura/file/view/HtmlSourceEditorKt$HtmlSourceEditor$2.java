package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSourceEditorKt$HtmlSourceEditor$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $content;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onContentChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSourceEditorKt$HtmlSourceEditor$2(String str, G0U<? super String, Unit> g0u, BRg bRg, float f, int i, int i2) {
        super(2);
        this.$content = str;
        this.$onContentChange = g0u;
        this.$modifier = bRg;
        this.$bottomPadding = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HtmlSourceEditorKt.m901HtmlSourceEditorjt2gSs(this.$content, this.$onContentChange, this.$modifier, this.$bottomPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

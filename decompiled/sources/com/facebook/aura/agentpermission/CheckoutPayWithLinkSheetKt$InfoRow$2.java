package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutPayWithLinkSheetKt$InfoRow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Integer $iconRes;
    public final /* synthetic */ String $label;
    public final /* synthetic */ int $labelMaxLines;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingContent;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C07C $this_InfoRow;
    public final /* synthetic */ String $value;
    public final /* synthetic */ long $valueColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutPayWithLinkSheetKt$InfoRow$2(C07C c07c, Integer num, G0V<? super BFM, ? super Integer, Unit> g0v, String str, String str2, BRg bRg, int i, long j, int i2, int i3) {
        super(2);
        this.$this_InfoRow = c07c;
        this.$iconRes = num;
        this.$leadingContent = g0v;
        this.$label = str;
        this.$value = str2;
        this.$modifier = bRg;
        this.$labelMaxLines = i;
        this.$valueColor = j;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        CheckoutPayWithLinkSheetKt.m187InfoRow88mDfTA(this.$this_InfoRow, this.$iconRes, this.$leadingContent, this.$label, this.$value, this.$modifier, this.$labelMaxLines, this.$valueColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

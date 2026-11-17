package com.facebook.aura.linktext;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1736ApY;
import X.C1822Arm;
import X.C1YL;
import X.G0V;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLinkTextKt$HatchLinkText$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1736ApY $linkFontWeight;
    public final /* synthetic */ List<HatchTextLink> $links;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $onLoggedOutHost;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ C1YL $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkTextKt$HatchLinkText$1(String str, List<HatchTextLink> list, BRg bRg, C1822Arm c1822Arm, long j, C1YL c1yl, C1736ApY c1736ApY, boolean z, int i, int i2) {
        super(2);
        this.$text = str;
        this.$links = list;
        this.$modifier = bRg;
        this.$style = c1822Arm;
        this.$color = j;
        this.$textAlign = c1yl;
        this.$linkFontWeight = c1736ApY;
        this.$onLoggedOutHost = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchLinkTextKt.m1188HatchLinkText10k_G_c(this.$text, this.$links, this.$modifier, this.$style, this.$color, this.$textAlign, this.$linkFontWeight, this.$onLoggedOutHost, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

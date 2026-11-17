package com.facebook.aura.activation.view;

import X.AbstractC1727ApL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.ApQ;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraDisclosureScreenKt$ScrollableLinkText$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedString;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $sixLineHeight;
    public final /* synthetic */ C1822Arm $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDisclosureScreenKt$ScrollableLinkText$1(ApQ apQ, BRg bRg, float f, C1822Arm c1822Arm) {
        super(2);
        this.$annotatedString = apQ;
        this.$modifier = bRg;
        this.$sixLineHeight = f;
        this.$textStyle = c1822Arm;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AbstractC1727ApL.A04(bfm, AnonymousClass005.A0T(bfm, C10G.A0A(this.$modifier, Float.NaN, this.$sixLineHeight)), null, this.$annotatedString, this.$textStyle, null, null, 0, 0, 0, 0, 0, 2040, false);
        } else {
            bfm.Afo();
        }
    }
}

package com.facebook.aura.linktext;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.ApQ;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1YL;
import X.G0V;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLinkTextKt$HatchLinkText$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedString;
    public final /* synthetic */ long $color;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ C1YL $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkTextKt$HatchLinkText$2(ApQ apQ, BRg bRg, long j, C1822Arm c1822Arm, C1YL c1yl) {
        super(2);
        this.$annotatedString = apQ;
        this.$modifier = bRg;
        this.$color = j;
        this.$style = c1822Arm;
        this.$textAlign = c1yl;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraTextKt.m2640AuraTextVmYn7U0(this.$annotatedString, this.$modifier, this.$color, this.$style, null, null, this.$textAlign, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32688);
        } else {
            bfm.Afo();
        }
    }
}

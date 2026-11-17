package com.facebook.aura.vds.compose.button;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraButtonDefaults$LeadingIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AVy $icon;
    public final /* synthetic */ IconContext $iconContext;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ B6A $tint;
    public final /* synthetic */ AuraButtonDefaults $tmp1_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraButtonDefaults$LeadingIcon$1(AuraButtonDefaults auraButtonDefaults, IconContext iconContext, AVy aVy, BRg bRg, B6A b6a, int i, int i2) {
        super(2);
        this.$tmp1_rcvr = auraButtonDefaults;
        this.$iconContext = iconContext;
        this.$icon = aVy;
        this.$modifier = bRg;
        this.$tint = b6a;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp1_rcvr.m2407LeadingIconxqIIw2o(this.$iconContext, this.$icon, this.$modifier, this.$tint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

package com.facebook.aura.vds.toast;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraToastDefaults$LeadingIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AVy $painter;
    public final /* synthetic */ long $tint;
    public final /* synthetic */ AuraToastDefaults $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToastDefaults$LeadingIcon$1(AuraToastDefaults auraToastDefaults, BRg bRg, AVy aVy, long j, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = auraToastDefaults;
        this.$modifier = bRg;
        this.$painter = aVy;
        this.$tint = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.m3119LeadingIconFNF3uiM(this.$modifier, this.$painter, this.$tint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

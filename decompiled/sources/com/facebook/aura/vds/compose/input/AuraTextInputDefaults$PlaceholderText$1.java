package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraTextInputDefaults$PlaceholderText$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $text;
    public final /* synthetic */ int $textAlign;
    public final /* synthetic */ C1822Arm $textStyle;
    public final /* synthetic */ AuraTextInputDefaults $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTextInputDefaults$PlaceholderText$1(AuraTextInputDefaults auraTextInputDefaults, String str, int i, C1822Arm c1822Arm, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = auraTextInputDefaults;
        this.$text = str;
        this.$textAlign = i;
        this.$textStyle = c1822Arm;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.m2587PlaceholderTextqdpcsU(this.$text, this.$textAlign, this.$textStyle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

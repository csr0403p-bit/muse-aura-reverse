package com.facebook.aura.vds.compose.card;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraCardDefaults$LeadingIconButton$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ AVy $painter;
    public final /* synthetic */ long $tint;
    public final /* synthetic */ AuraCardDefaults $tmp1_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCardDefaults$LeadingIconButton$3(AuraCardDefaults auraCardDefaults, BRg bRg, AVy aVy, Function0<Unit> function0, String str, long j, boolean z, InterfaceC1072AWd interfaceC1072AWd, int i, int i2) {
        super(2);
        this.$tmp1_rcvr = auraCardDefaults;
        this.$modifier = bRg;
        this.$painter = aVy;
        this.$onClick = function0;
        this.$onClickLabel = str;
        this.$tint = j;
        this.$enabled = z;
        this.$interactionSource = interfaceC1072AWd;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp1_rcvr.m2479LeadingIconButton3f6hBDE(this.$modifier, this.$painter, this.$onClick, this.$onClickLabel, this.$tint, this.$enabled, this.$interactionSource, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

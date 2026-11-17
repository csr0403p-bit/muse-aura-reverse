package com.facebook.aura.vds.compose.controls;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCheckboxKt$AuraCheckbox$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ B6A $checkedTint;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Boolean, Unit> $onValueChange;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCheckboxKt$AuraCheckbox$2(BRg bRg, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, InterfaceC1072AWd interfaceC1072AWd, long j, B6A b6a, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$enabled = z;
        this.$checked = z2;
        this.$onValueChange = g0u;
        this.$interactionSource = interfaceC1072AWd;
        this.$tint = j;
        this.$checkedTint = b6a;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraCheckboxKt.m2528AuraCheckboxO7ixnI(this.$modifier, this.$enabled, this.$checked, this.$onValueChange, this.$interactionSource, this.$tint, this.$checkedTint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchFormSheetKt$HatchFormFooter$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ B6A $background;
    public final /* synthetic */ ApQ $footnote;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onPrimary;
    public final /* synthetic */ String $primaryButtonTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$HatchFormFooter$3(String str, boolean z, Function0<Unit> function0, BRg bRg, ApQ apQ, B6A b6a, boolean z2, int i, int i2) {
        super(2);
        this.$primaryButtonTitle = str;
        this.$isEnabled = z;
        this.$onPrimary = function0;
        this.$modifier = bRg;
        this.$footnote = apQ;
        this.$background = b6a;
        this.$isLoading = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchFormSheetKt.m347HatchFormFooteryZUFuyM(this.$primaryButtonTitle, this.$isEnabled, this.$onPrimary, this.$modifier, this.$footnote, this.$background, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1110AYw;
import X.C1822Arm;
import X.C1DG;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmPinEntryContentKt$ConfidentialVmPinEntryContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $belowInput;
    public final /* synthetic */ String $buttonText;
    public final /* synthetic */ String $description;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1DG $headerTopPadding;
    public final /* synthetic */ boolean $inputEnabled;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ boolean $loading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onPinChange;
    public final /* synthetic */ Function0<Unit> $onPrimaryClick;
    public final /* synthetic */ String $pin;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ boolean $showLogo;
    public final /* synthetic */ String $title;
    public final /* synthetic */ C1822Arm $titleStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmPinEntryContentKt$ConfidentialVmPinEntryContent$2(String str, String str2, String str3, String str4, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z, BRg bRg, boolean z2, boolean z3, boolean z4, boolean z5, C1822Arm c1822Arm, C1110AYw c1110AYw, C1DG c1dg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2, int i3) {
        super(2);
        this.$pin = str;
        this.$title = str2;
        this.$description = str3;
        this.$buttonText = str4;
        this.$onPinChange = g0u;
        this.$onPrimaryClick = function0;
        this.$enabled = z;
        this.$modifier = bRg;
        this.$showLogo = z2;
        this.$loading = z3;
        this.$isError = z4;
        this.$inputEnabled = z5;
        this.$titleStyle = c1822Arm;
        this.$scrollState = c1110AYw;
        this.$headerTopPadding = c1dg;
        this.$belowInput = g0v;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ConfidentialVmPinEntryContentKt.m468ConfidentialVmPinEntryContentn87flQE(this.$pin, this.$title, this.$description, this.$buttonText, this.$onPinChange, this.$onPrimaryClick, this.$enabled, this.$modifier, this.$showLogo, this.$loading, this.$isError, this.$inputEnabled, this.$titleStyle, this.$scrollState, this.$headerTopPadding, this.$belowInput, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

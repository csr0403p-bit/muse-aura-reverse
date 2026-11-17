package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $autoFocus;
    public final /* synthetic */ float $cellSpacing;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $hideKeyboardOnComplete;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ int $keyboardCapitalization;
    public final /* synthetic */ int $keyboardType;
    public final /* synthetic */ int $length;
    public final /* synthetic */ boolean $masked;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onValueChange;
    public final /* synthetic */ String $stateDescription;
    public final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCodeInputKt$AuraCodeInput$5(String str, G0U<? super String, Unit> g0u, int i, BRg bRg, float f, boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, String str2, String str3, int i4, int i5, int i6) {
        super(2);
        this.$value = str;
        this.$onValueChange = g0u;
        this.$length = i;
        this.$modifier = bRg;
        this.$cellSpacing = f;
        this.$masked = z;
        this.$isError = z2;
        this.$keyboardType = i2;
        this.$keyboardCapitalization = i3;
        this.$hideKeyboardOnComplete = z3;
        this.$autoFocus = z4;
        this.$enabled = z5;
        this.$contentDescription = str2;
        this.$stateDescription = str3;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraCodeInputKt.m2586AuraCodeInputOOXMnFM(this.$value, this.$onValueChange, this.$length, this.$modifier, this.$cellSpacing, this.$masked, this.$isError, this.$keyboardType, this.$keyboardCapitalization, this.$hideKeyboardOnComplete, this.$autoFocus, this.$enabled, this.$contentDescription, this.$stateDescription, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

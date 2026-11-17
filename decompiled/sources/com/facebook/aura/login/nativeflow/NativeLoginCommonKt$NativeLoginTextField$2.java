package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.AuJ;
import X.BFM;
import X.BRg;
import X.C19h;
import X.C1DM;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginTextField$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $clearButtonContentDescription;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ String $header;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ AuJ $keyboardOptions;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onChange;
    public final /* synthetic */ long $placeholderColor;
    public final /* synthetic */ String $placeholderText;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ int $textAlign;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
    public final /* synthetic */ String $value;
    public final /* synthetic */ C19h $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCommonKt$NativeLoginTextField$2(String str, G0U<? super String, Unit> g0u, String str2, BRg bRg, boolean z, boolean z2, AuJ auJ, C19h c19h, boolean z3, String str3, G0V<? super BFM, ? super Integer, Unit> g0v, int i, InterfaceC1072AWd interfaceC1072AWd, String str4, long j, C1DM c1dm, int i2, int i3, int i4) {
        super(2);
        this.$value = str;
        this.$onChange = g0u;
        this.$placeholderText = str2;
        this.$modifier = bRg;
        this.$enabled = z;
        this.$isError = z2;
        this.$keyboardOptions = auJ;
        this.$visualTransformation = c19h;
        this.$readOnly = z3;
        this.$clearButtonContentDescription = str3;
        this.$trailingIcon = g0v;
        this.$textAlign = i;
        this.$interactionSource = interfaceC1072AWd;
        this.$header = str4;
        this.$placeholderColor = j;
        this.$shape = c1dm;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        NativeLoginCommonKt.m1282NativeLoginTextFieldWHTdp1U(this.$value, this.$onChange, this.$placeholderText, this.$modifier, this.$enabled, this.$isError, this.$keyboardOptions, this.$visualTransformation, this.$readOnly, this.$clearButtonContentDescription, this.$trailingIcon, this.$textAlign, this.$interactionSource, this.$header, this.$placeholderColor, this.$shape, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

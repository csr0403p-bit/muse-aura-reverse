package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C19h;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class CustomConnectorAuthScreenKt$CustomConnectorTextField$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $keyboardType;
    public final /* synthetic */ G0U<String, Unit> $onChange;
    public final /* synthetic */ String $placeholder;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ String $value;
    public final /* synthetic */ C19h $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomConnectorAuthScreenKt$CustomConnectorTextField$2(String str, String str2, G0U<? super String, Unit> g0u, boolean z, C19h c19h, int i, int i2, int i3) {
        super(2);
        this.$value = str;
        this.$placeholder = str2;
        this.$onChange = g0u;
        this.$readOnly = z;
        this.$visualTransformation = c19h;
        this.$keyboardType = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        CustomConnectorAuthScreenKt.m2093CustomConnectorTextFieldKznfkUg(this.$value, this.$placeholder, this.$onChange, this.$readOnly, this.$visualTransformation, this.$keyboardType, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

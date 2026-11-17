package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.Hw8;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraConfirmNameScreenKt$ConfirmNameField$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Hw8 $contentType;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ int $imeAction;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onChange;
    public final /* synthetic */ String $placeholderText;
    public final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraConfirmNameScreenKt$ConfirmNameField$2(String str, G0U<? super String, Unit> g0u, String str2, Hw8 hw8, int i, boolean z, BRg bRg, int i2, int i3) {
        super(2);
        this.$value = str;
        this.$onChange = g0u;
        this.$placeholderText = str2;
        this.$contentType = hw8;
        this.$imeAction = i;
        this.$enabled = z;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraConfirmNameScreenKt.m113ConfirmNameFieldX0zcS7w(this.$value, this.$onChange, this.$placeholderText, this.$contentType, this.$imeAction, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

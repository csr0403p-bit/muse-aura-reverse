package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.Hw8;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$NameField$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Hw8 $contentType;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ int $imeAction;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onChange;
    public final /* synthetic */ String $placeholder;
    public final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionConfirmNameSheetKt$NameField$3(String str, String str2, int i, Hw8 hw8, boolean z, G0U<? super String, Unit> g0u, BRg bRg, int i2, int i3) {
        super(2);
        this.$value = str;
        this.$placeholder = str2;
        this.$imeAction = i;
        this.$contentType = hw8;
        this.$enabled = z;
        this.$onChange = g0u;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        SubscriptionConfirmNameSheetKt.m2281NameFieldvbMXUkU(this.$value, this.$placeholder, this.$imeAction, this.$contentType, this.$enabled, this.$onChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

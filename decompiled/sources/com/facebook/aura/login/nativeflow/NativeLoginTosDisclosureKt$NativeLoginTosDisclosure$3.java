package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
    public final /* synthetic */ HatchTosDisclosure $disclosure;
    public final /* synthetic */ boolean $insetText;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onTokenTap;
    public final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$3(HatchTosDisclosure hatchTosDisclosure, BRg bRg, int i, boolean z, G0U<? super String, Unit> g0u, AHD<NativeLoginAccountUiModel> ahd, int i2, int i3) {
        super(2);
        this.$disclosure = hatchTosDisclosure;
        this.$modifier = bRg;
        this.$textAlign = i;
        this.$insetText = z;
        this.$onTokenTap = g0u;
        this.$accounts = ahd;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        NativeLoginTosDisclosureKt.m1307NativeLoginTosDisclosuregm0gx_Q(this.$disclosure, this.$modifier, this.$textAlign, this.$insetText, this.$onTokenTap, this.$accounts, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WearablesLinkingSharedKt$WearablesConsentDisclosures$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $appName;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingSharedKt$WearablesConsentDisclosures$2(String str, long j, BRg bRg, float f, int i, int i2) {
        super(2);
        this.$appName = str;
        this.$iconTint = j;
        this.$modifier = bRg;
        this.$spacing = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        WearablesLinkingSharedKt.m1833WearablesConsentDisclosuresN8B1yIo(this.$appName, this.$iconTint, this.$modifier, this.$spacing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$FullScreenCommsConsentContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Boolean, Unit> $onDecision;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearablesLinkingFullScreenKt$FullScreenCommsConsentContent$2(boolean z, float f, float f2, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$isLoading = z;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onDecision = g0u;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        WearablesLinkingFullScreenKt.m1824FullScreenCommsConsentContento3XDK20(this.$isLoading, this.$topPadding, this.$bottomPadding, this.$onDecision, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

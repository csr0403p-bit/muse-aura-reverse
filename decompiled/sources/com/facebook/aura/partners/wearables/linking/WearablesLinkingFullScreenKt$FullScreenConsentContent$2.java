package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$FullScreenConsentContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onEnable;
    public final /* synthetic */ Function0<Unit> $onNotNow;
    public final /* synthetic */ WearablesLinkingOrigin $origin;
    public final /* synthetic */ String $setupSessionId;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ String $utmMedium;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$FullScreenConsentContent$2(WearablesLinkingOrigin wearablesLinkingOrigin, boolean z, float f, float f2, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, String str, String str2, int i, int i2) {
        super(2);
        this.$origin = wearablesLinkingOrigin;
        this.$isLoading = z;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onEnable = function0;
        this.$modifier = bRg;
        this.$onNotNow = function02;
        this.$utmMedium = str;
        this.$setupSessionId = str2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        WearablesLinkingFullScreenKt.m1825FullScreenConsentContentKlbNRUg(this.$origin, this.$isLoading, this.$topPadding, this.$bottomPadding, this.$onEnable, this.$modifier, this.$onNotNow, this.$utmMedium, this.$setupSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

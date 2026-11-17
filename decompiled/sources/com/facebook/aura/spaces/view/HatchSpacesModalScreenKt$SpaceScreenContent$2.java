package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.spaces.repo.SpaceCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ boolean $impressionReady;
    public final /* synthetic */ SpacePageLogging $logging;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onPeerAccessEnded;
    public final /* synthetic */ G0U<B6A, Unit> $onTopColorDetected;
    public final /* synthetic */ G0V<Boolean, Function0<Unit>, Unit> $onWebViewBackStateChanged;
    public final /* synthetic */ SpaceRenderState $renderState;
    public final /* synthetic */ SpaceCard $spaceCard;
    public final /* synthetic */ String $spaceId;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpacesModalScreenKt$SpaceScreenContent$2(SpaceRenderState spaceRenderState, SpaceCard spaceCard, String str, String str2, float f, BRg bRg, boolean z, G0V<? super Boolean, ? super Function0<Unit>, Unit> g0v, G0U<? super B6A, Unit> g0u, Function0<Unit> function0, SpacePageLogging spacePageLogging, int i, int i2, int i3) {
        super(2);
        this.$renderState = spaceRenderState;
        this.$spaceCard = spaceCard;
        this.$spaceId = str;
        this.$cacheKey = str2;
        this.$topPadding = f;
        this.$modifier = bRg;
        this.$impressionReady = z;
        this.$onWebViewBackStateChanged = g0v;
        this.$onTopColorDetected = g0u;
        this.$onPeerAccessEnded = function0;
        this.$logging = spacePageLogging;
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
        HatchSpacesModalScreenKt.m2193SpaceScreenContent7SJwSw(this.$renderState, this.$spaceCard, this.$spaceId, this.$cacheKey, this.$topPadding, this.$modifier, this.$impressionReady, this.$onWebViewBackStateChanged, this.$onTopColorDetected, this.$onPeerAccessEnded, this.$logging, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

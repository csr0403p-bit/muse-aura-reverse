package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.spaces.repo.SpaceCard;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ SpaceCard $card;
    public final /* synthetic */ boolean $enablePullToRefresh;
    public final /* synthetic */ Map<String, String> $extraRequestHeaders;
    public final /* synthetic */ float $headerHeight;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onOpenInNewWindowUrl;
    public final /* synthetic */ G0W<String, String, String, Unit> $onOpenLocalContent;
    public final /* synthetic */ G0U<String, Unit> $onOpenUrl;
    public final /* synthetic */ Function0<Unit> $onPeerAccessEnded;
    public final /* synthetic */ G0U<B6A, Unit> $onTopColorDetected;
    public final /* synthetic */ G0V<Boolean, Function0<Unit>, Unit> $onWebViewBackStateChanged;
    public final /* synthetic */ HatchScreen $retryScreen;
    public final /* synthetic */ HatchSubsurface $retrySubsurface;
    public final /* synthetic */ HatchSurface $retrySurface;
    public final /* synthetic */ float $safeAreaInsetAppBottomDp;
    public final /* synthetic */ float $safeAreaInsetBottomDp;
    public final /* synthetic */ float $safeAreaInsetTopDp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$1(String str, SpaceCard spaceCard, BRg bRg, float f, float f2, boolean z, float f3, float f4, float f5, Map<String, String> map, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, G0V<? super Boolean, ? super Function0<Unit>, Unit> g0v, G0U<? super B6A, Unit> g0u3, Function0<Unit> function0, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, int i, int i2, int i3) {
        super(2);
        this.$cacheKey = str;
        this.$card = spaceCard;
        this.$modifier = bRg;
        this.$headerHeight = f;
        this.$bottomPadding = f2;
        this.$enablePullToRefresh = z;
        this.$safeAreaInsetTopDp = f3;
        this.$safeAreaInsetBottomDp = f4;
        this.$safeAreaInsetAppBottomDp = f5;
        this.$extraRequestHeaders = map;
        this.$onOpenInNewWindowUrl = g0u;
        this.$onOpenUrl = g0u2;
        this.$onOpenLocalContent = g0w;
        this.$onWebViewBackStateChanged = g0v;
        this.$onTopColorDetected = g0u3;
        this.$onPeerAccessEnded = function0;
        this.$retrySurface = hatchSurface;
        this.$retrySubsurface = hatchSubsurface;
        this.$retryScreen = hatchScreen;
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
        HtmlSpacesWebViewKt.m2202HtmlSpacesWebViewKAcDUPU(this.$cacheKey, this.$card, this.$modifier, this.$headerHeight, this.$bottomPadding, this.$enablePullToRefresh, this.$safeAreaInsetTopDp, this.$safeAreaInsetBottomDp, this.$safeAreaInsetAppBottomDp, this.$extraRequestHeaders, this.$onOpenInNewWindowUrl, this.$onOpenUrl, this.$onOpenLocalContent, this.$onWebViewBackStateChanged, this.$onTopColorDetected, this.$onPeerAccessEnded, this.$retrySurface, this.$retrySubsurface, this.$retryScreen, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

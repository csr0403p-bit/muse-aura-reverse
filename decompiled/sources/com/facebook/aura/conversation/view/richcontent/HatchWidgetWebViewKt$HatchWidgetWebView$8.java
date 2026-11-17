package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.JSONState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchWidgetWebViewKt$HatchWidgetWebView$8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $assetAuthToken;
    public final /* synthetic */ String $assetBaseUrl;
    public final /* synthetic */ int $cachedHeightPx;
    public final /* synthetic */ B6A $containerBackgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $html;
    public final /* synthetic */ String $kind;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Integer, Unit> $onHeightMeasured;
    public final /* synthetic */ G0U<String, Unit> $onWidgetSetState;
    public final /* synthetic */ String $sourcePath;
    public final /* synthetic */ JSONState $state;
    public final /* synthetic */ String $widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchWidgetWebViewKt$HatchWidgetWebView$8(String str, String str2, String str3, JSONState jSONState, G0U<? super String, Unit> g0u, String str4, String str5, String str6, int i, G0U<? super Integer, Unit> g0u2, C1D3 c1d3, B6A b6a, BRg bRg, int i2, int i3, int i4) {
        super(2);
        this.$widgetId = str;
        this.$kind = str2;
        this.$html = str3;
        this.$state = jSONState;
        this.$onWidgetSetState = g0u;
        this.$sourcePath = str4;
        this.$assetBaseUrl = str5;
        this.$assetAuthToken = str6;
        this.$cachedHeightPx = i;
        this.$onHeightMeasured = g0u2;
        this.$containerShape = c1d3;
        this.$containerBackgroundColor = b6a;
        this.$modifier = bRg;
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
        HatchWidgetWebViewKt.m689HatchWidgetWebView0jEhg8(this.$widgetId, this.$kind, this.$html, this.$state, this.$onWidgetSetState, this.$sourcePath, this.$assetBaseUrl, this.$assetAuthToken, this.$cachedHeightPx, this.$onHeightMeasured, this.$containerShape, this.$containerBackgroundColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}

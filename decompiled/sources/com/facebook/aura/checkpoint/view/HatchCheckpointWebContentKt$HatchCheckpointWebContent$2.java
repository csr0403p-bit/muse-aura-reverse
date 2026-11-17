package com.facebook.aura.checkpoint.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C6t6;
import X.G0U;
import X.G0V;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCheckpointWebContentKt$HatchCheckpointWebContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<WebView, Unit> $onRelease;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCheckpointWebContentKt$HatchCheckpointWebContent$2(C6t6 c6t6, boolean z, float f, float f2, G0U<? super WebView, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$webView = c6t6;
        this.$isLoading = z;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onRelease = g0u;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchCheckpointWebContentKt.m349HatchCheckpointWebContent1yyLQnY(this.$webView, this.$isLoading, this.$topPadding, this.$bottomPadding, this.$onRelease, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

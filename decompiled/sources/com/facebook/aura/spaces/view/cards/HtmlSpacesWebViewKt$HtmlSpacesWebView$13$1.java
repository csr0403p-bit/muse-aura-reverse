package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C0Yr;
import X.C1BO;
import X.C3cJ;
import X.C6t6;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.webview.HtmlWebViewPool;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$13$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HtmlWebViewPool $pool;
    public final /* synthetic */ String $poolCacheKey;
    public final /* synthetic */ MutableState<Integer> $recoveryAttempts$delegate;
    public final /* synthetic */ MutableState<Integer> $recoveryNonce$delegate;
    public final /* synthetic */ C1BO<Boolean> $rendererGone$delegate;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$13$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, HtmlWebViewPool htmlWebViewPool, String str, C6t6 c6t6, C1BO<Boolean> c1bo, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(1);
        this.$session = htmlSpacesWebViewSession;
        this.$pool = htmlWebViewPool;
        this.$poolCacheKey = str;
        this.$webView = c6t6;
        this.$rendererGone$delegate = c1bo;
        this.$recoveryAttempts$delegate = mutableState;
        this.$recoveryNonce$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C1BO.A0F(this.$rendererGone$delegate)) {
            C3cJ.A0C(this.$session.rendererGone, false);
            if (MutableState.A02((MutableState) this.$recoveryAttempts$delegate) >= 1) {
                AnonymousClass003.A14(this.$session.showError, true);
            } else {
                MutableState.A07(MutableState.A02((MutableState) this.$recoveryAttempts$delegate) + 1, this.$recoveryAttempts$delegate);
                this.$pool.invalidate(this.$poolCacheKey, this.$webView);
                MutableState.A07(MutableState.A02((MutableState) this.$recoveryNonce$delegate) + 1, this.$recoveryNonce$delegate);
            }
        }
        return new C78g() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$13$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.C6t6;
import X.C9286GCn;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.webview.HtmlWebViewPool;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$24$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HtmlWebViewPool $pool;
    public final /* synthetic */ String $poolCacheKey;
    public final /* synthetic */ MutableState<Integer> $recoveryAttempts$delegate;
    public final /* synthetic */ MutableState<Integer> $recoveryNonce$delegate;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$24$4$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, HtmlWebViewPool htmlWebViewPool, String str, C6t6 c6t6, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(0);
        this.$session = htmlSpacesWebViewSession;
        this.$pool = htmlWebViewPool;
        this.$poolCacheKey = str;
        this.$webView = c6t6;
        this.$recoveryAttempts$delegate = mutableState;
        this.$recoveryNonce$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C9286GCn.A00(null, false, (C9286GCn) this.$session.showError);
        this.$session.loadedContent = null;
        MutableState.A07(0, this.$recoveryAttempts$delegate);
        this.$pool.invalidate(this.$poolCacheKey, this.$webView);
        MutableState.A07(MutableState.A02((MutableState) this.$recoveryNonce$delegate) + 1, this.$recoveryNonce$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

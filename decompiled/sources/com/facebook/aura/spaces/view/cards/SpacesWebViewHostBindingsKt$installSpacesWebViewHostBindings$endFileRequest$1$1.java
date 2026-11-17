package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.webview.HtmlWebViewPool;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$endFileRequest$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ HtmlWebViewPool $pool;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$endFileRequest$1$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, HtmlWebViewPool htmlWebViewPool, String str) {
        super(0);
        this.$session = htmlSpacesWebViewSession;
        this.$pool = htmlWebViewPool;
        this.$cacheKey = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$session.pendingFileCallback = null;
        this.$session.pendingCaptureUri = null;
        this.$session.pendingCameraIntent = null;
        this.$pool.setEvictionGuard(this.$cacheKey, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

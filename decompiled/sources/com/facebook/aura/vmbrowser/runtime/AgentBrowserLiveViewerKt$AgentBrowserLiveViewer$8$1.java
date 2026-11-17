package com.facebook.aura.vmbrowser.runtime;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$8$1 extends C7438Evz implements Function0<Unit> {
    public AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$8$1(Object obj) {
        super(0, obj, BrowserSessionController.class, "dismissClipboardMenu", "dismissClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BrowserSessionController) this.receiver).dismissClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

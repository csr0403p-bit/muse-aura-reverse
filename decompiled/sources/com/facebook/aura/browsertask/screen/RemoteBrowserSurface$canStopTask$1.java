package com.facebook.aura.browsertask.screen;

import X.C7438Evz;
import X.G0U;
import com.facebook.aura.browsertask.data.BrowserTaskStateKt;
import com.facebook.aura.model.BrowserTaskPresentation;

/* loaded from: classes2.dex */
public final /* synthetic */ class RemoteBrowserSurface$canStopTask$1 extends C7438Evz implements G0U<BrowserTaskPresentation, Boolean> {
    public static final RemoteBrowserSurface$canStopTask$1 INSTANCE = new RemoteBrowserSurface$canStopTask$1();

    public RemoteBrowserSurface$canStopTask$1() {
        super(1, BrowserTaskStateKt.class, "canStopBrowserTask", "canStopBrowserTask(Lcom/facebook/aura/model/BrowserTaskPresentation;)Z", 1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(BrowserTaskPresentation browserTaskPresentation) {
        return Boolean.valueOf(BrowserTaskStateKt.canStopBrowserTask(browserTaskPresentation));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(BrowserTaskPresentation browserTaskPresentation) {
        return Boolean.valueOf(BrowserTaskStateKt.canStopBrowserTask(browserTaskPresentation));
    }
}

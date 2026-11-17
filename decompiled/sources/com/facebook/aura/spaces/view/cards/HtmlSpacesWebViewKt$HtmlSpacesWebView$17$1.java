package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.G0W;
import com.facebook.aura.spaces.preload.SpacesBlobViewerBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$17$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpacesBlobViewerBridge $blobViewerBridge;
    public final /* synthetic */ G0W<String, String, String, Unit> $onOpenLocalContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$17$1(SpacesBlobViewerBridge spacesBlobViewerBridge, G0W<? super String, ? super String, ? super String, Unit> g0w) {
        super(0);
        this.$blobViewerBridge = spacesBlobViewerBridge;
        this.$onOpenLocalContent = g0w;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$blobViewerBridge.onLocalContentReady = this.$onOpenLocalContent;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

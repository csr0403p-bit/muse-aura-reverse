package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FileViewerContentKt$EditableTextContent$routeMarkdownLink$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $routeLink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileViewerContentKt$EditableTextContent$routeMarkdownLink$1$1(G0U<? super String, Unit> g0u) {
        super(1);
        this.$routeLink = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        AnonymousClass006.A0b(str).logClick(HatchSurface.LIBRARY, null, HatchScreen.FILE_EDITOR, HatchComponent.EXTERNAL_LINK, null, null, null);
        this.$routeLink.invoke(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

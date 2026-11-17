package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageShareLauncherKt$rememberHatchMessageImageCopyAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<ContentItem, Unit> $copyImage;
    public final /* synthetic */ ContentItem $image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageShareLauncherKt$rememberHatchMessageImageCopyAction$1$1(G0U<? super ContentItem, Unit> g0u, ContentItem contentItem) {
        super(0);
        this.$copyImage = g0u;
        this.$image = contentItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$copyImage.invoke(this.$image);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

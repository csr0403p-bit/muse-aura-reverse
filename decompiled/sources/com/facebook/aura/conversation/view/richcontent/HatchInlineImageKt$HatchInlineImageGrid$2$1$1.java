package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImageGrid$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AHD<HatchInlineImageData> $images;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineImageGrid$2$1$1(G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v, AHD<HatchInlineImageData> ahd) {
        super(0);
        this.$it = g0v;
        this.$images = ahd;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1H(this.$images, this.$it, 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

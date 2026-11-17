package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$6$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$6$1$1(G0V<? super String, ? super String, Unit> g0v, HatchContentViewModelData hatchContentViewModelData) {
        super(0);
        this.$onInlineImageClick = g0v;
        this.$contentViewModel = hatchContentViewModelData;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0V<String, String, Unit> g0v = this.$onInlineImageClick;
        HatchContentViewModelData.InlineImage inlineImage = (HatchContentViewModelData.InlineImage) this.$contentViewModel;
        g0v.invoke(inlineImage.url, inlineImage.alt);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

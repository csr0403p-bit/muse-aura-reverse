package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$2$1$1(G0U<? super HatchContentViewModelData, Unit> g0u, HatchContentViewModelData hatchContentViewModelData) {
        super(0);
        this.$onRichFormatOpenCTAClick = g0u;
        this.$contentViewModel = hatchContentViewModelData;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
        if (g0u != null) {
            g0u.invoke(this.$contentViewModel);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

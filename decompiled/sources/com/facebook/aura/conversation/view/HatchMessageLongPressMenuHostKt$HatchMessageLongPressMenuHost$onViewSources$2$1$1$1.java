package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchSearchResultData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$onViewSources$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<HatchSearchResultData, HatchCitationAnalytics, Unit> $handler;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ HatchSearchResultData $sources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$onViewSources$2$1$1$1(G0V<? super HatchSearchResultData, ? super HatchCitationAnalytics, Unit> g0v, HatchSearchResultData hatchSearchResultData, HatchMessageUiModel hatchMessageUiModel) {
        super(0);
        this.$handler = g0v;
        this.$sources = hatchSearchResultData;
        this.$message = hatchMessageUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$handler.invoke(this.$sources, this.$message.citationAnalytics);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

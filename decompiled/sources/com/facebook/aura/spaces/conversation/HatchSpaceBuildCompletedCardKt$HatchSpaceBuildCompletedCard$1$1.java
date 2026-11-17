package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.model.SpaceBuildCompletedPresentation;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpaceBuildCompletedCardKt$HatchSpaceBuildCompletedCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceBuildCompletedPresentation $card;
    public final /* synthetic */ G0U<String, Unit> $openSpace;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpaceBuildCompletedCardKt$HatchSpaceBuildCompletedCard$1$1(HatchScreen hatchScreen, String str, Map<String, String> map, G0U<? super String, Unit> g0u, SpaceBuildCompletedPresentation spaceBuildCompletedPresentation) {
        super(0);
        this.$screen = hatchScreen;
        this.$presentationId = str;
        this.$threadLogMetadata = map;
        this.$openSpace = g0u;
        this.$card = spaceBuildCompletedPresentation;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceCardAnalytics.INSTANCE.logOpenSpaceClick(this.$screen, this.$presentationId, this.$threadLogMetadata);
        this.$openSpace.invoke(this.$card.slug);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

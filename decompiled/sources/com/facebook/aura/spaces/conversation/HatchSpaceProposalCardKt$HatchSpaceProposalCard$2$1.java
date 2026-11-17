package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpaceProposalCardKt$HatchSpaceProposalCard$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpaceProposalCardKt$HatchSpaceProposalCard$2$1(HatchScreen hatchScreen, String str, Map<String, String> map) {
        super(0);
        this.$screen = hatchScreen;
        this.$presentationId = str;
        this.$threadLogMetadata = map;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceCardAnalytics.INSTANCE.logOpenSpaceClick(this.$screen, this.$presentationId, this.$threadLogMetadata);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

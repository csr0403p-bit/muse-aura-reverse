package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$TopicCard$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onTopicSelected;
    public final /* synthetic */ HatchSupportTopicOption $topic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportScreenKt$TopicCard$1$1$1$1$1$1(G0U<? super String, Unit> g0u, HatchSupportTopicOption hatchSupportTopicOption) {
        super(0);
        this.$onTopicSelected = g0u;
        this.$topic = hatchSupportTopicOption;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onTopicSelected.invoke(this.$topic.slug);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

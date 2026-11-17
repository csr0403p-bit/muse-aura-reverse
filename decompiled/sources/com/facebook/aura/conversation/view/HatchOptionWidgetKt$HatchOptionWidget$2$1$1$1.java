package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchOptionWidgetKt$HatchOptionWidget$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<Integer, String, Unit> $onSelectOption;
    public final /* synthetic */ String $option;
    public final /* synthetic */ int $optionIndex;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchOptionWidgetKt$HatchOptionWidget$2$1$1$1(HatchScreen hatchScreen, Map<String, String> map, int i, G0V<? super Integer, ? super String, Unit> g0v, String str) {
        super(0);
        this.$screen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$optionIndex = i;
        this.$onSelectOption = g0v;
        this.$option = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchOptionWidgetKt.logOptionChipClick(this.$screen, this.$threadLogMetadata, this.$optionIndex);
        this.$onSelectOption.invoke(Integer.valueOf(this.$optionIndex), this.$option);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.model.LetterBriefingWidgetData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLetterWidgetKt$HatchLetterWidget$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ LetterBriefingWidgetData $briefing;
    public final /* synthetic */ G0U<String, Boolean> $onOpenBriefing;
    public final /* synthetic */ Function0<Unit> $onSetOpened;
    public final /* synthetic */ boolean $opened;
    public final /* synthetic */ MutableState<Boolean> $pendingOpened$delegate;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLetterWidgetKt$HatchLetterWidget$5$1(HatchScreen hatchScreen, Map<String, String> map, G0U<? super String, Boolean> g0u, LetterBriefingWidgetData letterBriefingWidgetData, boolean z, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$screen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$onOpenBriefing = g0u;
        this.$briefing = letterBriefingWidgetData;
        this.$opened = z;
        this.$onSetOpened = function0;
        this.$pendingOpened$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchLetterWidgetKt.logLetterCardClick(this.$screen, this.$threadLogMetadata);
        if (!AnonymousClass003.A1X(this.$briefing.path, this.$onOpenBriefing) || this.$opened) {
            return;
        }
        MutableState.A09(true, this.$pendingOpened$delegate);
        this.$onSetOpened.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

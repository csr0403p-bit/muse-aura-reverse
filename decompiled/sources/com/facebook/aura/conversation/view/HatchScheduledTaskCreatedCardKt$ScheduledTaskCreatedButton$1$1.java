package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import com.facebook.aura.navigation.key.HatchStatusTab;
import com.facebook.aura.status.viewmodel.HatchPendingScheduledTask;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchScheduledTaskCreatedCardKt$ScheduledTaskCreatedButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ String $taskId;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchScheduledTaskCreatedCardKt$ScheduledTaskCreatedButton$1$1(HatchScreen hatchScreen, String str, Map<String, String> map, AuraNavigator auraNavigator) {
        super(0);
        this.$screen = hatchScreen;
        this.$taskId = str;
        this.$threadLogMetadata = map;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchScheduledTaskCreatedCardKt.logViewTaskClick(this.$screen, this.$taskId, this.$threadLogMetadata);
        HatchPendingScheduledTask.INSTANCE.publish(this.$taskId);
        this.$navigator.navigate((AuraNavKey) new HatchStatusScreenKey(HatchStatusTab.TASKS, null, null, null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

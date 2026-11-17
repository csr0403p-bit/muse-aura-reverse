package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onDeleteThread;
    public final /* synthetic */ MutableState<Boolean> $showDeleteDialog$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ HatchScreen $threadScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ConversationScreenDecoration$11$1(HatchScreen hatchScreen, Map<String, String> map, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$threadScreen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$onDeleteThread = function0;
        this.$showDeleteDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$threadScreen, HatchComponent.DELETE_CONFIRM_BUTTON, null, this.$threadLogMetadata, null);
        MutableState.A09(false, this.$showDeleteDialog$delegate);
        Function0<Unit> function0 = this.$onDeleteThread;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

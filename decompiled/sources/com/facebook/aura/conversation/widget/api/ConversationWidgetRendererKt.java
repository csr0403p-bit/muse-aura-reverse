package com.facebook.aura.conversation.widget.api;

import X.AGO;
import X.AKH;
import X.AnonymousClass002;
import com.facebook.aura.model.WidgetStateMutationHost;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ConversationWidgetRendererKt {
    public static final AKH<WidgetStateMutationHost> LocalWidgetStateMutationHost = new AGO(ConversationWidgetRendererKt$LocalWidgetStateMutationHost$1.INSTANCE);
    public static final AKH<Map<String, String>> LocalLatestWidgetIdsByKind = AnonymousClass002.A0L(ConversationWidgetRendererKt$LocalLatestWidgetIdsByKind$1.INSTANCE);

    public static final AKH<Map<String, String>> getLocalLatestWidgetIdsByKind() {
        return LocalLatestWidgetIdsByKind;
    }

    public static final AKH<WidgetStateMutationHost> getLocalWidgetStateMutationHost() {
        return LocalWidgetStateMutationHost;
    }
}

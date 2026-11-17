package com.facebook.aura.modellock.view;

import X.AbstractC7559F3s;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ModelLockSupportSheetKey;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchModelLockCardKt$HatchModelLockCard$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $clickMetadata;
    public final /* synthetic */ ConversationComposerStatusContext $context;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchModelLockCardKt$HatchModelLockCard$2$2$1(ConversationComposerStatusContext conversationComposerStatusContext, Map<String, String> map, AuraNavigator auraNavigator) {
        super(0);
        this.$context = conversationComposerStatusContext;
        this.$clickMetadata = map;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchModelLockCardKt.logGetSupportClick(this.$context, this.$clickMetadata);
        this.$navigator.navigate((AuraNavKey) ModelLockSupportSheetKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

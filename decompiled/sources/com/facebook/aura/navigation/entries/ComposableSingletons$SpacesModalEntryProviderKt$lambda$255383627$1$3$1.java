package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceTabScreenKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$3$1(AuraNavigator auraNavigator, SpaceTabScreenKey spaceTabScreenKey) {
        super(0);
        this.$navigator = auraNavigator;
        this.$key = spaceTabScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        SpaceTabScreenKey spaceTabScreenKey = this.$key;
        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
        auraNavigator.popTabSubstack(spaceTabScreenKey, conversationTabScreenKey);
        this.$navigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$-1654571512$1$2$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1$2$1 extends AbstractC7559F3s implements G0U<HatchSessionItem, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSessionItem hatchSessionItem) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        AuraNavigator auraNavigator = this.$navigator;
        String str = hatchSessionItem.sessionId;
        String str2 = hatchSessionItem.title;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        auraNavigator.navigate((AuraNavKey) new ConversationScreenKey(str, str2, false, null, null, true), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1$2$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSessionItem hatchSessionItem) {
        invoke2(hatchSessionItem);
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ExploreIdeaCardDetailSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ExploreEntryProviderKt$lambda$-320741767$1$1$onCardClick$1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ExploreEntryProviderKt$lambda$320741767$1$1$onCardClick$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$navigator.navigate((AuraNavKey) new ExploreIdeaCardDetailSheetKey(str), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ExploreEntryProviderKt$lambda$320741767$1$1$onCardClick$1$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

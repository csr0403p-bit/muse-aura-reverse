package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.SpaceMenuSheetKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceMenuSheetKt$SpaceMenuSheet$onDeleted$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceMenuSheetKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuSheetKt$SpaceMenuSheet$onDeleted$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public final /* synthetic */ SpaceMenuSheetKey $key;

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(((auraNavKey instanceof SpaceMenuSheetKey) && C7384Etj.areEqual(((SpaceMenuSheetKey) auraNavKey).slug, this.$key.slug)) || ((auraNavKey instanceof SpacesModalScreenKey) && C7384Etj.areEqual(((SpacesModalScreenKey) auraNavKey).slug, this.$key.slug)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpaceMenuSheetKey spaceMenuSheetKey) {
            super(1);
            this.$key = spaceMenuSheetKey;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMenuSheetKt$SpaceMenuSheet$onDeleted$1$1(SpaceMenuSheetKey spaceMenuSheetKey, AuraNavigator auraNavigator) {
        super(0);
        this.$key = spaceMenuSheetKey;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceMenuSheetKey spaceMenuSheetKey = this.$key;
        boolean z = spaceMenuSheetKey.isTab;
        AuraNavigator auraNavigator = this.$navigator;
        if (!z) {
            auraNavigator.popAll(new AnonymousClass1(spaceMenuSheetKey));
            return;
        }
        SpaceTabScreenKey spaceTabScreenKey = new SpaceTabScreenKey(spaceMenuSheetKey.slug);
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

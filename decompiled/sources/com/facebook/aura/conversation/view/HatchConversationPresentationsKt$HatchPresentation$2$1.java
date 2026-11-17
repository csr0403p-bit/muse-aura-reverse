package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$HatchPresentation$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationPresentationsKt$HatchPresentation$2$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = HatchShareSheetKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new HatchShareSheetKey(ShareType.AVATAR, null, null, null, null, null, null, null, null, null, null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

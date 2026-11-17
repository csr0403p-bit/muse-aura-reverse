package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.DemotedTabScreenKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.utils.HatchUtil;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$isOnStatusPillHost$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<AuraNavKey> $topNonOverlay$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$isOnStatusPillHost$2$1(AuraNavigator auraNavigator, C1BO<? extends AuraNavKey> c1bo) {
        super(0);
        this.$navigator = auraNavigator;
        this.$topNonOverlay$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zIsSideChatBotStatusEnabled = false;
        if (!(this.$navigator.currentKey(true) instanceof AuraOverlayNavKey)) {
            AuraNavKey value = this.$topNonOverlay$delegate.getValue();
            if (value instanceof SpacesModalScreenKey) {
                zIsSideChatBotStatusEnabled = ((SpacesModalScreenKey) value).fromNavigation;
            } else if (value instanceof PeerSpaceScreenKey) {
                zIsSideChatBotStatusEnabled = ((PeerSpaceScreenKey) value).fromNavigation;
            } else if ((value instanceof DemotedTabScreenKey) || (value instanceof AuraTabRootNavKey)) {
                zIsSideChatBotStatusEnabled = true;
            } else if (value instanceof ConversationScreenKey) {
                zIsSideChatBotStatusEnabled = HatchUtil.INSTANCE.isSideChatBotStatusEnabled();
            }
        }
        return Boolean.valueOf(zIsSideChatBotStatusEnabled);
    }
}

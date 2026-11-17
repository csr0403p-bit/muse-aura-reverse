package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.C9hr;
import X.F0C;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConnectionsModalScreenKey;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.ConnectionsSheetSubject;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.pairs.PairsAcceptLinkUiState;

/* loaded from: classes3.dex */
public final class PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<PairsAcceptLinkUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$1$1(AuraNavigator auraNavigator, C1BO<? extends PairsAcceptLinkUiState> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AuraNavKey connectionsSheetKey;
        PairsAcceptLinkUiState value = this.$uiState$delegate.getValue();
        if (C7384Etj.areEqual(value, PairsAcceptLinkUiState.PostedToChat.INSTANCE)) {
            this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
            AuraNavigator auraNavigator = this.$navigator;
            ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
            auraNavigator.popToTabRoot(conversationTabScreenKey);
            this.$navigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
        } else if (value instanceof PairsAcceptLinkUiState.AlreadyPaired) {
            this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
            AuraNavigator auraNavigator2 = this.$navigator;
            String str = ((PairsAcceptLinkUiState.AlreadyPaired) value).museId;
            if (str != null) {
                F0C<C9hr<Object>>[] f0cArr = ConnectionsSheetKey.$childSerializers;
                connectionsSheetKey = new ConnectionsSheetKey(new ConnectionsSheetSubject.Person(str));
            } else {
                connectionsSheetKey = ConnectionsModalScreenKey.INSTANCE;
            }
            auraNavigator2.navigate(connectionsSheetKey, false);
        }
        return new C78g() { // from class: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.deeplink.HatchDeferredDeeplinks;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchIntentViewModelKt {

    /* renamed from: com.facebook.aura.deeplink.HatchIntentViewModelKt$DeeplinkNavigation$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<AuraNavKey, Unit> $onBeforeNavigate;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ HatchIntentViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchIntentViewModel hatchIntentViewModel, AuraNavigator auraNavigator, NavBackStack<AuraNavKey> navBackStack, AbstractC3358CGz abstractC3358CGz, G0U<? super AuraNavKey, Unit> g0u, int i, int i2) {
            super(2);
            this.$viewModel = hatchIntentViewModel;
            this.$navigator = auraNavigator;
            this.$backStack = navBackStack;
            this.$userSession = abstractC3358CGz;
            this.$onBeforeNavigate = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchIntentViewModelKt.DeeplinkNavigation(this.$viewModel, this.$navigator, this.$backStack, this.$userSession, this.$onBeforeNavigate, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DeeplinkNavigation(com.facebook.aura.deeplink.HatchIntentViewModel r31, com.facebook.aura.navigation.AuraNavigator r32, androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r33, X.AbstractC3358CGz r34, X.G0U<? super com.facebook.aura.navigation.AuraNavKey, kotlin.Unit> r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.HatchIntentViewModelKt.DeeplinkNavigation(com.facebook.aura.deeplink.HatchIntentViewModel, com.facebook.aura.navigation.AuraNavigator, androidx.navigation3.runtime.NavBackStack, X.CGz, X.G0U, X.BFM, int, int):void");
    }

    public static final boolean isSameChatAs(AuraNavKey auraNavKey, AuraNavKey auraNavKey2) {
        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
        if (C7384Etj.areEqual(auraNavKey2, conversationTabScreenKey)) {
            return C7384Etj.areEqual(auraNavKey, conversationTabScreenKey);
        }
        if (auraNavKey2 instanceof ConversationScreenKey) {
            ConversationScreenKey conversationScreenKey = (ConversationScreenKey) auraNavKey2;
            if (!conversationScreenKey.isCreatingNewThread && (auraNavKey instanceof ConversationScreenKey)) {
                ConversationScreenKey conversationScreenKey2 = (ConversationScreenKey) auraNavKey;
                if (C7384Etj.areEqual(conversationScreenKey2.sessionId, conversationScreenKey.sessionId) && conversationScreenKey2.highlightMessageId == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void navigateToDeeplink(AuraNavigator auraNavigator, HatchIntentViewModel.PendingDeeplink.Navigation navigation, List<? extends AuraNavKey> list) {
        AuraNavKey auraNavKey;
        if ((navigation.launchFlag != LaunchFlag.BRING_TO_FRONT || !list.contains(navigation.key)) && (auraNavKey = navigation.baseKey) != null) {
            auraNavigator.navigate(auraNavKey, LaunchFlag.REPLACE_BACKSTACK);
        }
        auraNavigator.navigate(navigation.key, navigation.launchFlag);
    }

    public static final /* synthetic */ HatchIntentViewModel.PendingDeeplink access$DeeplinkNavigation$lambda$0(C1BO c1bo) {
        return (HatchIntentViewModel.PendingDeeplink) c1bo.getValue();
    }

    public static final /* synthetic */ HatchDeferredDeeplinks.Link access$DeeplinkNavigation$lambda$6(C1BO c1bo) {
        return (HatchDeferredDeeplinks.Link) c1bo.getValue();
    }
}

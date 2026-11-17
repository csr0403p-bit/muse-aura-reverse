package com.facebook.aura.navigation.entries;

import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C0861A6i;
import X.C10G;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.conversation.view.HatchConversationScreenKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConversationEntryProviderKt$lambda$-2146003176$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConversationEntryProviderKt$lambda$2146003176$1 extends AbstractC7559F3s implements G0W<ConversationScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConversationEntryProviderKt$lambda$2146003176$1 INSTANCE = new ComposableSingletons$ConversationEntryProviderKt$lambda$2146003176$1();

    public ComposableSingletons$ConversationEntryProviderKt$lambda$2146003176$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConversationScreenKey conversationScreenKey, BFM bfm, Integer num) {
        invoke(conversationScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConversationScreenKey conversationScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(conversationScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        HatchConversationViewModel.Factory factory = new HatchConversationViewModel.Factory(AnonymousClass001.A0I(AnonymousClass002.A0H(bfm)), AnonymousClass002.A0g(bfm), conversationScreenKey.sessionId, false, conversationScreenKey.isCreatingNewThread);
        String str = conversationScreenKey.sessionId;
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            HatchConversationViewModel hatchConversationViewModel = (HatchConversationViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), str, new C0861A6i(HatchConversationViewModel.class));
            boolean z = conversationScreenKey.isOpenedFromArchive;
            String str2 = conversationScreenKey.title;
            boolean z2 = conversationScreenKey.isCreatingNewThread;
            String str3 = conversationScreenKey.highlightMessageId;
            Long l = conversationScreenKey.highlightMessageSeq;
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "hatch-side-chat-view");
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ConversationEntryProviderKt$lambda$2146003176$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchConversationScreenKt.HatchConversationScreen(false, (G0U) objAaT, bRgA00, z, str2, z2, str3, l, hatchConversationViewModel, bfm, (HatchConversationViewModel.$stable << 24) | 390, 0);
            return;
        }
        throw AnonymousClass001.A0o();
    }
}

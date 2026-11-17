package com.facebook.aura.navigation.entries;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.conversation.view.HatchConversationScreenKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConversationEntryProviderKt$lambda$638731560$1 extends AbstractC7559F3s implements G0W<ConversationTabScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConversationEntryProviderKt$lambda$638731560$1 INSTANCE = new ComposableSingletons$ConversationEntryProviderKt$lambda$638731560$1();

    public ComposableSingletons$ConversationEntryProviderKt$lambda$638731560$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConversationTabScreenKey conversationTabScreenKey, BFM bfm, Integer num) {
        invoke(conversationTabScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConversationTabScreenKey conversationTabScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, conversationTabScreenKey), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            HatchConversationViewModel.Factory factory = new HatchConversationViewModel.Factory(AnonymousClass001.A0I(AnonymousClass002.A0H(bfm)), AnonymousClass002.A0g(bfm), "primary_session_id", false, false);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchConversationViewModel hatchConversationViewModel = (HatchConversationViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), HatchConversationViewModel.class, "primary_session_id");
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "hatch-chat-view");
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ConversationEntryProviderKt$lambda$638731560$1$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchConversationScreenKt.HatchConversationScreen(true, (G0U) objAaT, null, false, null, false, null, null, hatchConversationViewModel, bfm, (HatchConversationViewModel.$stable << 24) | 6, 252);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}

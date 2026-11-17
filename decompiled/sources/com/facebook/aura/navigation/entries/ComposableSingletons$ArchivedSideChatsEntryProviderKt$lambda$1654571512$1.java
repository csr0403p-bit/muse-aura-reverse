package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.activity.ComponentActivity;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.conversation.view.HatchArchivedSideChatsScreenKt;
import com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ArchivedSideChatsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$-1654571512$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1 extends AbstractC7559F3s implements G0W<ArchivedSideChatsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1 INSTANCE = new ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1();

    public ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ArchivedSideChatsScreenKey archivedSideChatsScreenKey, BFM bfm, Integer num) {
        invoke(archivedSideChatsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ArchivedSideChatsScreenKey archivedSideChatsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$ArchivedSideChatsEntryProviderKt$lambda$1654571512$1$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchThreadsViewModel.Factory(abstractC3358CGzA0h, ThreadsView.ARCHIVED);
                bfm.Ai0(objAaT3);
            }
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchArchivedSideChatsScreenKt.HatchArchivedSideChatsScreen(function0, g0u, (HatchThreadsViewModel) BQN.A00((AuraViewModelFactory) objAaT3, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), "archived_side_chats", new C0861A6i(HatchThreadsViewModel.class)), null, bfm, HatchThreadsViewModel.$stable << 6, 8);
            return;
        }
        bfm.Afo();
    }
}

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
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.view.FeedTabScreenKt;
import com.facebook.aura.navigation.key.FeedModalScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$FeedEntryProviderKt$lambda$-958823580$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$FeedEntryProviderKt$lambda$958823580$1 extends AbstractC7559F3s implements G0W<FeedModalScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$FeedEntryProviderKt$lambda$958823580$1 INSTANCE = new ComposableSingletons$FeedEntryProviderKt$lambda$958823580$1();

    public ComposableSingletons$FeedEntryProviderKt$lambda$958823580$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FeedModalScreenKey feedModalScreenKey, BFM bfm, Integer num) {
        invoke(feedModalScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FeedModalScreenKey feedModalScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "hatch-feed-view");
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
            FeedViewModel.Factory factory = new FeedViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            FeedTabScreenKt.FeedTabScreen((FeedViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), FeedViewModel.class, null), null, bfm, FeedViewModel.$stable, 2);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}

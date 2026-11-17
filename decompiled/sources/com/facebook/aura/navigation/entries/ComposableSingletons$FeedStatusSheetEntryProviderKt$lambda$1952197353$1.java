package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.G0W;
import androidx.activity.ComponentActivity;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.view.FeedStatusSheetKt;
import com.facebook.aura.navigation.key.FeedStatusSheetKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$FeedStatusSheetEntryProviderKt$lambda$1952197353$1 extends AbstractC7559F3s implements G0W<FeedStatusSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$FeedStatusSheetEntryProviderKt$lambda$1952197353$1 INSTANCE = new ComposableSingletons$FeedStatusSheetEntryProviderKt$lambda$1952197353$1();

    public ComposableSingletons$FeedStatusSheetEntryProviderKt$lambda$1952197353$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FeedStatusSheetKey feedStatusSheetKey, BFM bfm, Integer num) {
        invoke(feedStatusSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FeedStatusSheetKey feedStatusSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            FeedViewModel.Factory factory = new FeedViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            FeedStatusSheetKt.FeedStatusSheet((FeedViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(FeedViewModel.class)), null, bfm, FeedViewModel.$stable, 2);
            return;
        }
        bfm.Afo();
    }
}

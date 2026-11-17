package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C0861A6i;
import X.C5wL;
import X.C7384Etj;
import X.G0W;
import androidx.activity.ComponentActivity;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.model.IdeaCardDetailViewModel;
import com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt;
import com.facebook.aura.navigation.key.ExploreIdeaCardDetailSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ExploreIdeaCardDetailEntryProviderKt$lambda$-186921404$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ExploreIdeaCardDetailEntryProviderKt$lambda$186921404$1 extends AbstractC7559F3s implements G0W<ExploreIdeaCardDetailSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ExploreIdeaCardDetailEntryProviderKt$lambda$186921404$1 INSTANCE = new ComposableSingletons$ExploreIdeaCardDetailEntryProviderKt$lambda$186921404$1();

    public ComposableSingletons$ExploreIdeaCardDetailEntryProviderKt$lambda$186921404$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ExploreIdeaCardDetailSheetKey exploreIdeaCardDetailSheetKey, BFM bfm, Integer num) {
        invoke(exploreIdeaCardDetailSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ExploreIdeaCardDetailSheetKey exploreIdeaCardDetailSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(exploreIdeaCardDetailSheetKey, 0);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        HatchExploreViewModel.Factory factory = new HatchExploreViewModel.Factory(abstractC3358CGzA0h);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        HatchExploreViewModel hatchExploreViewModel = (HatchExploreViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchExploreViewModel.class));
        IdeaCardDetailViewModel.Factory factory2 = new IdeaCardDetailViewModel.Factory(abstractC3358CGzA0h);
        String str = exploreIdeaCardDetailSheetKey.ideaCardId;
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            ExploreIdeaCardDetailSheetKt.ExploreIdeaCardDetailSheet(exploreIdeaCardDetailSheetKey.ideaCardId, hatchExploreViewModel, (IdeaCardDetailViewModel) AnonymousClass003.A0Y(factory2, bodA00, AnonymousClass005.A0Y(bodA00), IdeaCardDetailViewModel.class, str), null, null, null, false, bfm, 0, 120);
            return;
        }
        throw AnonymousClass001.A0o();
    }
}

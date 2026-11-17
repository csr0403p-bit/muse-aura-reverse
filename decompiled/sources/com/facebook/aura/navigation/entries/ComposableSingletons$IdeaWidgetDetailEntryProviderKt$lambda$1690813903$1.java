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
import X.C78N;
import X.G0W;
import androidx.activity.ComponentActivity;
import com.facebook.aura.conversation.view.IdeaWidgetDetailDataHolder;
import com.facebook.aura.conversation.view.IdeaWidgetSeedKt;
import com.facebook.aura.conversation.view.SeededIdeaDetail;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.model.IdeaCardDetailViewModel;
import com.facebook.aura.explore.repo.IdeaCardDetail;
import com.facebook.aura.explore.repo.IdeaCardDetailOrigin;
import com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.navigation.key.IdeaWidgetDetailSheetKey;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$IdeaWidgetDetailEntryProviderKt$lambda$1690813903$1 extends AbstractC7559F3s implements G0W<IdeaWidgetDetailSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$IdeaWidgetDetailEntryProviderKt$lambda$1690813903$1 INSTANCE = new ComposableSingletons$IdeaWidgetDetailEntryProviderKt$lambda$1690813903$1();

    public ComposableSingletons$IdeaWidgetDetailEntryProviderKt$lambda$1690813903$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IdeaWidgetDetailSheetKey ideaWidgetDetailSheetKey, BFM bfm, Integer num) {
        invoke(ideaWidgetDetailSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IdeaWidgetDetailSheetKey ideaWidgetDetailSheetKey, BFM bfm, int i) {
        boolean z;
        C7384Etj.A0Y(ideaWidgetDetailSheetKey, 0);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        HatchExploreViewModel.Factory factory = new HatchExploreViewModel.Factory(abstractC3358CGzA0h);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        HatchExploreViewModel hatchExploreViewModel = (HatchExploreViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchExploreViewModel.class));
        IdeaCardDetailViewModel.Factory factory2 = new IdeaCardDetailViewModel.Factory(abstractC3358CGzA0h);
        String str = ideaWidgetDetailSheetKey.ideaId;
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            IdeaCardDetailViewModel ideaCardDetailViewModel = (IdeaCardDetailViewModel) AnonymousClass003.A0Y(factory2, bodA00, AnonymousClass005.A0Y(bodA00), IdeaCardDetailViewModel.class, str);
            boolean zA1K = AnonymousClass003.A1K(bfm, ideaWidgetDetailSheetKey.ideaId, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            IdeaCardDetail ideaCardDetail = null;
            if (zA1K || objAaT == C78N.A00) {
                IdeaWidgetData ideaWidgetData = IdeaWidgetDetailDataHolder.INSTANCE.get(ideaWidgetDetailSheetKey.ideaId);
                if (ideaWidgetData != null) {
                    objAaT = IdeaWidgetSeedKt.seededIdeaDetailFromWidget(ideaWidgetData, abstractC3358CGzA0h);
                } else {
                    objAaT = null;
                }
                bfm.Ai0(objAaT);
            }
            SeededIdeaDetail seededIdeaDetail = (SeededIdeaDetail) objAaT;
            String str2 = ideaWidgetDetailSheetKey.ideaId;
            IdeaCardDetailOrigin ideaCardDetailOrigin = IdeaCardDetailOrigin.CHAT;
            if (seededIdeaDetail != null) {
                ideaCardDetail = seededIdeaDetail.detail;
                z = seededIdeaDetail.isExecutable;
            } else {
                z = true;
            }
            ExploreIdeaCardDetailSheetKt.ExploreIdeaCardDetailSheet(str2, hatchExploreViewModel, ideaCardDetailViewModel, null, ideaCardDetailOrigin, ideaCardDetail, z, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 8);
            return;
        }
        throw AnonymousClass001.A0o();
    }
}

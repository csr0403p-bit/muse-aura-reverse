package com.facebook.aura.conversation.view;

import X.AGH;
import X.AGI;
import X.AHI;
import X.AIW;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BBb;
import X.BFM;
import X.BQN;
import X.BRg;
import X.C0861A6i;
import X.C0924AIa;
import X.C1BO;
import X.C1DM;
import X.C20Q;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.GDB;
import android.content.Context;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import com.facebook.aura.explore.view.cards.IdeaCardsKt;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchIdeaShareAction;
import com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchIdeaWidgetCardKt {
    public static final String ideaWidgetItemCountBadgeLabel(Context context, int i) {
        return (i < 1 || i == 1) ? context.getString(R.string._name_removed__res_0x7f12085f) : context.getString(R.string._name_removed__res_0x7f120860, Integer.valueOf(i));
    }

    /* renamed from: HatchIdeaWidgetCard-sW7UJKQ, reason: not valid java name */
    public static final void m608HatchIdeaWidgetCardsW7UJKQ(IdeaWidgetData ideaWidgetData, long j, C1DM c1dm, BRg bRg, BFM bfm, int i, int i2) {
        G0U g0u;
        boolean z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(ideaWidgetData, 0);
        bfm.AgG(248536868);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ideaWidgetData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1dm);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchExploreViewModel.Factory factory = new HatchExploreViewModel.Factory(abstractC3358CGzA0h);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchExploreViewModel hatchExploreViewModel = (HatchExploreViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchExploreViewModel.class));
            int i4 = iA05 & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, contextA0H, i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(ideaWidgetData)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = toIdeaCard(ideaWidgetData, contextA0H);
                bfm.Ai0(objAaT);
            }
            IdeaCard ideaCard = (IdeaCard) objAaT;
            boolean zA1L = AnonymousClass003.A1L(bfm, hatchExploreViewModel, ideaWidgetData.ideaId);
            Object objAaT2 = bfm.AaT();
            if (zA1L || objAaT2 == C78N.A00) {
                objAaT2 = GDB.A01(new HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1(hatchExploreViewModel.ideasUiState, ideaWidgetData));
                bfm.Ai0(objAaT2);
            }
            C1BO c1boA01 = C2CK.A01(bfm, null, IdeaCardExecutionState.IDLE, (C20Q) objAaT2, 48, 14);
            boolean zA1L2 = AnonymousClass003.A1L(bfm, ideaCard, ideaWidgetData.previewImageUrl);
            Object objAaT3 = bfm.AaT();
            if (zA1L2 || objAaT3 == C78N.A00) {
                objAaT3 = IdeaCard.copy$default(ideaCard, null, null, null, null, null, null, null, ideaWidgetData.previewImageUrl, null, null, null, null, null, null, null, null, null, 130943, null);
                bfm.Ai0(objAaT3);
            }
            HatchIdeaShareAction hatchIdeaShareActionRememberHatchIdeaShareAction = HatchIdeaShareLauncherKt.rememberHatchIdeaShareAction((IdeaCard) objAaT3, bfm, 0);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A67(mapCurrentChatThreadLogMetadata), i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(ideaWidgetData)));
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == C78N.A00) {
                objAaT4 = new HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$1$1(ideaWidgetData, mapCurrentChatThreadLogMetadata, auraNavigatorA0b);
                bfm.Ai0(objAaT4);
            }
            Function0 function0 = (Function0) objAaT4;
            boolean zA1V2 = AnonymousClass002.A1V(bfm, hatchExploreViewModel, bfm.A67(mapCurrentChatThreadLogMetadata), i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(ideaWidgetData)));
            Object objAaT5 = bfm.AaT();
            if (zA1V2 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$2$1(ideaWidgetData, mapCurrentChatThreadLogMetadata, hatchExploreViewModel);
                bfm.Ai0(objAaT5);
            }
            Function0 function02 = (Function0) objAaT5;
            IdeaCardExecutionState ideaCardExecutionState = (IdeaCardExecutionState) c1boA01.getValue();
            if (hatchIdeaShareActionRememberHatchIdeaShareAction == null) {
                AnonymousClass003.A0l(bfm, -359706002);
                g0u = null;
            } else {
                bfm.AgE(-359706001);
                boolean zA1V3 = AnonymousClass002.A1V(bfm, hatchIdeaShareActionRememberHatchIdeaShareAction, bfm.A67(mapCurrentChatThreadLogMetadata), i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(ideaWidgetData)));
                Object objAaT6 = bfm.AaT();
                if (zA1V3 || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$3$1$1(ideaWidgetData, mapCurrentChatThreadLogMetadata, hatchIdeaShareActionRememberHatchIdeaShareAction);
                    bfm.Ai0(objAaT6);
                }
                g0u = (G0U) objAaT6;
                AnonymousClass001.A1D(bfm);
                z = true;
                if (!hatchIdeaShareActionRememberHatchIdeaShareAction.isPreparing) {
                }
                BRg bRg3 = bRg2;
                IdeaCardsKt.m796IdeaCardCompactmxsUjTo(ideaCard, function0, function02, bRg3, j, c1dm, ideaCardExecutionState, g0u, z, bfm, AnonymousClass004.A03(iA05 << 9, iA05 & 7168), 0);
            }
            z = false;
            BRg bRg32 = bRg2;
            IdeaCardsKt.m796IdeaCardCompactmxsUjTo(ideaCard, function0, function02, bRg32, j, c1dm, ideaCardExecutionState, g0u, z, bfm, AnonymousClass004.A03(iA05 << 9, iA05 & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$4(ideaWidgetData, j, c1dm, bRg2, i, i2);
        }
    }

    public static final void logIdeaExecuteClick(String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.IDEA_CARD_EXECUTE, null, AGH.A02(map, AnonymousClass007.A0c(HatchMetadataKey.IDEA_CARD_ID, str)), null);
    }

    public static final void logIdeaWidgetClick(HatchComponent hatchComponent, String str, Map<String, String> map, Integer num) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        HatchScreen hatchScreen = HatchScreen.MAIN_CHAT;
        C0924AIa c0924AIa = new C0924AIa();
        AnonymousClass001.A1C(HatchMetadataKey.IDEA_CARD_ID, str, c0924AIa);
        if (num != null) {
            AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIa, num.intValue());
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AGH.A02(map, AIW.A0K(c0924AIa)), null);
    }

    public static /* synthetic */ void logIdeaWidgetClick$default(HatchComponent hatchComponent, String str, Map map, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        logIdeaWidgetClick(hatchComponent, str, map, num);
    }

    public static final IdeaCard toIdeaCard(IdeaWidgetData ideaWidgetData, Context context) {
        String str = ideaWidgetData.ideaId;
        IdeaSharing ideaSharing = ideaWidgetData.sharing;
        String str2 = ideaWidgetData.title;
        String str3 = ideaWidgetData.summary;
        String str4 = ideaWidgetData.iconUrl;
        String str5 = ideaWidgetData.iconMimeType;
        String str6 = ideaWidgetData.categoryLabel;
        String str7 = ideaWidgetData.dateLabel;
        if (str7 == null) {
            str7 = str6;
        }
        return new IdeaCard(str, ideaSharing, str2, str3, null, null, null, null, str4, str5, str6, str7, null, AGI.A0E(ideaWidgetItemCountBadgeLabel(context, ideaWidgetData.items.size())), ideaWidgetData.showDoItButton ? context.getString(R.string._name_removed__res_0x7f12085e) : "", "", AHI.A01);
    }
}

package com.facebook.aura.conversation.viewmodel;

import X.AHD;
import X.AII;
import X.AIM;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.C0881AGi;
import X.C31u;
import X.C7384Etj;
import X.C7462Ewq;
import X.C7BY;
import X.FGI;
import X.G0U;
import X.InterfaceC7359EnW;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import com.facebook.aura.conversation.viewmodel.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskPresentationData;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.HtmlWidgetData;
import com.facebook.aura.model.IdeaGroupWidgetData;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.IdeaWidgetItemData;
import com.facebook.aura.model.ImageOptionsWidgetData;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.model.LetterWidgetData;
import com.facebook.aura.model.LocalMapWidgetData;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import com.facebook.aura.model.NavigationWidgetData;
import com.facebook.aura.model.NodeCardWidgetData;
import com.facebook.aura.model.OpaqueWidgetData;
import com.facebook.aura.model.OptionWidgetData;
import com.facebook.aura.model.SpaceBuildCompletedPresentation;
import com.facebook.aura.model.SpaceBuildCompletedWidgetData;
import com.facebook.aura.model.UnrenderablePresentationData;
import com.facebook.aura.model.UnrenderableWidgetData;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import com.facebook.aura.model.WidgetPresentationData;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchConversationUiStateKt {
    public static final String MIME_TYPE_HTML = "text/html";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchConversationUiStateKt.class, "showTombstonedCards", "getShowTombstonedCards()Z", 1)};
    public static final C31u showTombstonedCards$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.should_show_tombstoned_cards);

    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationUiStateKt$copyText$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<VoiceOptionData, CharSequence> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(VoiceOptionData voiceOptionData) {
            VoiceOptionData voiceOptionData2 = voiceOptionData;
            C7384Etj.A0Y(voiceOptionData2, 0);
            return voiceOptionData2.name;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(VoiceOptionData voiceOptionData) {
            C7384Etj.A0Y(voiceOptionData, 0);
            return voiceOptionData.name;
        }
    }

    public static final String buildCopyContent(HatchMessageUiModel hatchMessageUiModel) {
        WidgetPresentationData widgetPresentationData;
        HatchWidget hatchWidget;
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        ArrayList arrayList = new ArrayList();
        Collection collection = hatchMessageUiModel.widgets;
        if (collection == null) {
            collection = C0881AGi.A00;
        }
        Iterable iterable = hatchMessageUiModel.presentations;
        if (iterable == null) {
            iterable = C0881AGi.A00;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            HatchPresentationData hatchPresentationData = ((HatchWidgetPresentation) it.next()).data;
            if ((hatchPresentationData instanceof WidgetPresentationData) && (widgetPresentationData = (WidgetPresentationData) hatchPresentationData) != null && (hatchWidget = widgetPresentationData.widget) != null) {
                arrayList2.add(hatchWidget);
            }
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayList2, collection);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(arrayListA0P));
        Iterator it2 = arrayListA0P.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((HatchWidget) next).widgetId, next);
        }
        AHD<HatchRenderSegment> ahd = hatchMessageUiModel.renderSegments;
        if (ahd == null || ahd.isEmpty()) {
            addNonBlank(arrayList, hatchMessageUiModel.content);
            Iterator it3 = hatchMessageUiModel.widgetTokenIds.iterator();
            while (it3.hasNext()) {
                HatchWidget hatchWidget2 = (HatchWidget) linkedHashMap.get(it3.next());
                addNonBlank(arrayList, hatchWidget2 != null ? copyText(hatchWidget2) : null);
            }
        } else {
            for (HatchRenderSegment hatchRenderSegment : ahd) {
                if (hatchRenderSegment instanceof HatchRenderSegment.TextSegment) {
                    HatchRenderSegment.TextSegment textSegment = (HatchRenderSegment.TextSegment) hatchRenderSegment;
                    addNonBlank(arrayList, textSegment.block.text);
                    Iterator it4 = textSegment.widgetTokenIds.iterator();
                    while (it4.hasNext()) {
                        HatchWidget hatchWidget3 = (HatchWidget) linkedHashMap.get(it4.next());
                        addNonBlank(arrayList, hatchWidget3 != null ? copyText(hatchWidget3) : null);
                    }
                } else if (hatchRenderSegment instanceof HatchRenderSegment.WidgetTokenSegment) {
                    Iterator it5 = ((HatchRenderSegment.WidgetTokenSegment) hatchRenderSegment).widgetTokenIds.iterator();
                    while (it5.hasNext()) {
                        HatchWidget hatchWidget4 = (HatchWidget) linkedHashMap.get(it5.next());
                        addNonBlank(arrayList, hatchWidget4 != null ? copyText(hatchWidget4) : null);
                    }
                } else if (!(hatchRenderSegment instanceof HatchRenderSegment.ActivitySegment)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        String strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.OWNER_SEPARATOR, "", "", arrayList, null);
        return C7BY.A0j(strA0L) ? hatchMessageUiModel.content : strA0L;
    }

    public static final boolean getHasVisiblePresentations(HatchMessageUiModel hatchMessageUiModel) {
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        AHD<HatchWidgetPresentation> ahd = hatchMessageUiModel.presentations;
        if (ahd != null && (!(ahd instanceof Collection) || !ahd.isEmpty())) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                if (isVisible((HatchWidgetPresentation) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConversationIdle(HatchConversationUiState hatchConversationUiState) {
        C7384Etj.A0Y(hatchConversationUiState, 0);
        return (hatchConversationUiState.isAwaitingResponse || hatchConversationUiState.isAwaitingFirstResponse || hatchConversationUiState.isCancelableActivity) ? false : true;
    }

    public static final String replyContextResultKey(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("composer_reply:", str);
    }

    public static final String replyPromptResultKey(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("composer_reply_prompt:", str);
    }

    public static final List<HatchWidgetPresentation> standalonePresentations(HatchMessageUiModel hatchMessageUiModel) {
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        AHD<HatchWidgetPresentation> ahd = hatchMessageUiModel.presentations;
        if (ahd == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : ahd) {
            if (isVisible((HatchWidgetPresentation) obj)) {
                arrayList.add(obj);
            }
        }
        if (hatchMessageUiModel.widgetTokenIds.isEmpty()) {
            return arrayList;
        }
        Set setA0g = AbstractC0878AGe.A0g(hatchMessageUiModel.widgetTokenIds);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            HatchWidgetPresentation hatchWidgetPresentation = (HatchWidgetPresentation) obj2;
            if (!setA0g.contains(hatchWidgetPresentation.presentationId) || !(hatchWidgetPresentation.data instanceof WidgetPresentationData)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final void addNonBlank(List<String> list, String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() == 0) {
            return;
        }
        list.add(strA0l);
    }

    public static final String buildSpaceBuildCompletedCopyText(SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData) {
        SpaceBuildCompletedPresentation spaceBuildCompletedPresentation = spaceBuildCompletedWidgetData.card;
        String strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", BFI.A0F(new String[]{spaceBuildCompletedPresentation.name, spaceBuildCompletedPresentation.summary, spaceBuildCompletedPresentation.spacePath}), null);
        if (C7BY.A0j(strA0L)) {
            return null;
        }
        return strA0L;
    }

    public static final String copyText(HatchWidgetData hatchWidgetData, JSONState jSONState) {
        String strA0L;
        if ((hatchWidgetData instanceof HtmlWidgetData) || (hatchWidgetData instanceof LocalMapWidgetData) || (hatchWidgetData instanceof MarketplaceMapWidgetData)) {
            return null;
        }
        if (hatchWidgetData instanceof OptionWidgetData) {
            OptionWidgetData optionWidgetData = (OptionWidgetData) hatchWidgetData;
            strA0L = HatchWidgetPresentationKt.optionWidgetSelectedText(jSONState, optionWidgetData.options);
            if (strA0L == null || C7BY.A0j(strA0L)) {
                strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", optionWidgetData.options, null);
                if (C7BY.A0j(strA0L)) {
                    return null;
                }
            }
        } else {
            if (hatchWidgetData instanceof ImageOptionsWidgetData) {
                return null;
            }
            if (hatchWidgetData instanceof VoiceOptionsWidgetData) {
                strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", ((VoiceOptionsWidgetData) hatchWidgetData).options, AnonymousClass6.INSTANCE);
                if (C7BY.A0j(strA0L)) {
                    return null;
                }
            } else if (hatchWidgetData instanceof LetterWidgetData) {
                LetterWidgetData letterWidgetData = (LetterWidgetData) hatchWidgetData;
                strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", BFI.A0F(new String[]{letterWidgetData.emoji, letterWidgetData.title, letterWidgetData.byline}), null);
                if (C7BY.A0j(strA0L)) {
                    return null;
                }
            } else {
                if (hatchWidgetData instanceof IdeaWidgetData) {
                    return buildIdeaCopyText((IdeaWidgetData) hatchWidgetData);
                }
                if (hatchWidgetData instanceof IdeaGroupWidgetData) {
                    IdeaGroupWidgetData ideaGroupWidgetData = (IdeaGroupWidgetData) hatchWidgetData;
                    List<IdeaWidgetData> list = ideaGroupWidgetData.ideas;
                    ArrayList arrayList = new ArrayList();
                    Iterator<IdeaWidgetData> it = list.iterator();
                    while (it.hasNext()) {
                        String strBuildIdeaCopyText = buildIdeaCopyText(it.next());
                        if (strBuildIdeaCopyText != null) {
                            arrayList.add(strBuildIdeaCopyText);
                        }
                    }
                    NavigationWidgetData navigationWidgetData = ideaGroupWidgetData.navigation;
                    strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.OWNER_SEPARATOR, "", "", AbstractC0878AGe.A0P(AbstractC0885AGm.A0z(navigationWidgetData != null ? AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", Arrays.asList(navigationWidgetData.title, navigationWidgetData.summary), null) : null), arrayList), null);
                    if (C7BY.A0j(strA0L)) {
                        return null;
                    }
                } else {
                    if (!(hatchWidgetData instanceof NavigationWidgetData)) {
                        if (hatchWidgetData instanceof SpaceBuildCompletedWidgetData) {
                            return buildSpaceBuildCompletedCopyText((SpaceBuildCompletedWidgetData) hatchWidgetData);
                        }
                        if ((hatchWidgetData instanceof NodeCardWidgetData) || (hatchWidgetData instanceof OpaqueWidgetData) || (hatchWidgetData instanceof UnrenderableWidgetData)) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    NavigationWidgetData navigationWidgetData2 = (NavigationWidgetData) hatchWidgetData;
                    strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", Arrays.asList(navigationWidgetData2.title, navigationWidgetData2.summary), null);
                    if (C7BY.A0j(strA0L)) {
                        return null;
                    }
                }
            }
        }
        return strA0L;
    }

    public static final boolean getShowTombstonedCards() {
        return AnonymousClass001.A1X(C31u.A00(showTombstonedCards$delegate, $$delegatedProperties));
    }

    public static final boolean isHiddenTombstone(HatchWidgetPresentation hatchWidgetPresentation) {
        BrowserTaskPresentation browserTaskPresentation;
        HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
        BrowserTaskPresentationData browserTaskPresentationData = hatchPresentationData instanceof BrowserTaskPresentationData ? (BrowserTaskPresentationData) hatchPresentationData : null;
        return (browserTaskPresentationData == null || (browserTaskPresentation = browserTaskPresentationData.browserTask) == null || !browserTaskPresentation.isTombstone() || getShowTombstonedCards()) ? false : true;
    }

    public static final String buildIdeaCopyText(IdeaWidgetData ideaWidgetData) {
        String strA0L;
        AII aiiA17 = AIM.A17();
        aiiA17.add(ideaWidgetData.title);
        aiiA17.add(ideaWidgetData.summary);
        String str = ideaWidgetData.rationale;
        if (str != null) {
            aiiA17.add(str);
        }
        String str2 = ideaWidgetData.categoryLabel;
        if (str2 != null) {
            aiiA17.add(str2);
        }
        String str3 = ideaWidgetData.dateLabel;
        if (str3 != null) {
            aiiA17.add(str3);
        }
        List<String> list = ideaWidgetData.tags;
        if (!list.isEmpty() && (strA0L = AbstractC0878AGe.A0L(", ", "", "", list, null)) != null) {
            aiiA17.add(strA0L);
        }
        for (IdeaWidgetItemData ideaWidgetItemData : ideaWidgetData.items) {
            aiiA17.add(ideaWidgetItemData.title);
            String str4 = ideaWidgetItemData.summary;
            if (str4 != null) {
                aiiA17.add(str4);
            }
            String str5 = ideaWidgetItemData.detailDescription;
            if (str5 != null) {
                aiiA17.add(str5);
            }
        }
        String strA0L2 = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", AIM.A18(aiiA17), null);
        if (C7BY.A0j(strA0L2)) {
            return null;
        }
        return strA0L2;
    }

    public static final boolean isVisible(HatchWidgetPresentation hatchWidgetPresentation) {
        if (isHiddenTombstone(hatchWidgetPresentation)) {
            return false;
        }
        return ((hatchWidgetPresentation.data instanceof UnrenderablePresentationData) && HatchWidgetPresentationKt.fallbackTextOrNull(hatchWidgetPresentation) == null) ? false : true;
    }

    public static final String copyText(HatchWidget hatchWidget) {
        String strA0l;
        String strA0l2;
        String str = hatchWidget.replyToText;
        if (str != null && (strA0l2 = AnonymousClass002.A0l(str)) != null && strA0l2.length() > 0) {
            return strA0l2;
        }
        String str2 = hatchWidget.displayText;
        if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
            return strA0l;
        }
        String strFallbackTextOrNull = HatchWidgetPresentationKt.fallbackTextOrNull(hatchWidget);
        if (strFallbackTextOrNull != null && HatchWidgetPresentationKt.rendersAsFallbackText(hatchWidget)) {
            return strFallbackTextOrNull;
        }
        return copyText(hatchWidget.data, hatchWidget.state);
    }
}

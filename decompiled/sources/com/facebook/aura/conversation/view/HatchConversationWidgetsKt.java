package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1BO;
import X.C1D3;
import X.C1b8;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C2nw;
import X.C3U4;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C7qW;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.conversation.view.FlightOfferBookingRequest;
import com.facebook.aura.conversation.view.HatchIdeaCardRow;
import com.facebook.aura.conversation.view.InlineWidgetRenderItem;
import com.facebook.aura.conversation.view.richcontent.LocalConversationSessionIdKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.widget.api.ConversationPresentationAction;
import com.facebook.aura.conversation.widget.api.PresentationLinkSource;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.markdown.render.AuraMarkdownKt;
import com.facebook.aura.model.HatchMessageOrigin;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.ImageOptionsWidgetData;
import com.facebook.aura.model.NavigationUiControl;
import com.facebook.aura.model.NavigationWidgetData;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.BuyCreditsEntrySurface;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public abstract class HatchConversationWidgetsKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationWidgetsKt$FlightOfferBookingForwarder$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super HatchSendMessage, Unit> g0u, int i) {
            super(2);
            this.$onWidgetSendMessage = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationWidgetsKt.FlightOfferBookingForwarder(this.$onWidgetSendMessage, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationWidgetsKt$routePresentationAction$2", f = "HatchConversationWidgets.kt", l = {834}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationWidgetsKt$routePresentationAction$2, reason: invalid class name and case insensitive filesystem */
    public final class C114612 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $command;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $params;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114612(AbstractC3358CGz abstractC3358CGz, Context context, String str, String str2, HtJ<? super C114612> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$command = str;
            this.$params = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C114612(this.$userSession, this.$context, this.$command, this.$params, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeClient companion = HatchNodeClient.Companion.getInstance(this.$userSession, this.$context);
                String str = this.$command;
                String str2 = this.$params;
                this.label = 1;
                if (companion.executeCommand(str, str2, null, null, companion.resultSender, null, HatchNodeClient.C127452.INSTANCE, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C114612) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final HatchIdeaCardRow asIdeaCardRow(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        if (!HatchWidgetPresentationKt.isSupportedOnThisClient(hatchWidget)) {
            return null;
        }
        HatchWidgetData hatchWidgetData = hatchWidget.data;
        if (hatchWidgetData instanceof IdeaWidgetData) {
            return new HatchIdeaCardRow.Idea((IdeaWidgetData) hatchWidgetData);
        }
        if (!(hatchWidgetData instanceof NavigationWidgetData)) {
            return null;
        }
        if (HatchNavigationUiControlKt.isHiddenOnThisClient((NavigationWidgetData) hatchWidgetData)) {
            hatchWidgetData = null;
        }
        NavigationWidgetData navigationWidgetData = (NavigationWidgetData) hatchWidgetData;
        if (navigationWidgetData != null) {
            return new HatchIdeaCardRow.Navigation(navigationWidgetData);
        }
        return null;
    }

    public static final List<InlineWidgetRenderItem> coalesceInlineWidgets(List<HatchWidget> list) {
        C06G single;
        HatchIdeaCardRow hatchIdeaCardRowAsIdeaCardRow;
        C7384Etj.A0Y(list, 0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = i;
            while (i2 < list.size() && (hatchIdeaCardRowAsIdeaCardRow = asIdeaCardRow(list.get(i2))) != null) {
                arrayList2.add(hatchIdeaCardRowAsIdeaCardRow);
                i2++;
            }
            int size = arrayList2.size();
            if (size != 0) {
                if (size != 1) {
                    single = new InlineWidgetRenderItem.IdeaGroup(AGI.A07(arrayList2));
                } else {
                    int i3 = InlineWidgetRenderItem.Single.$stable;
                    single = new InlineWidgetRenderItem.Single(list.get(i));
                }
                arrayList.add(single);
                i = i2;
            } else {
                int i4 = InlineWidgetRenderItem.Single.$stable;
                arrayList.add(new InlineWidgetRenderItem.Single(list.get(i2)));
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    public static final boolean openLetterBriefing(String str, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, String str2) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(abstractC3358CGz, auraNavigator, str2, 1);
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        String strNormalizeWorkspacePath = workspaceUriResolver.normalizeWorkspacePath(str, null);
        if (strNormalizeWorkspacePath == null) {
            return false;
        }
        AnonymousClass006.A1C(new ContentItem(HatchFileUIUtils.INSTANCE.displayNameForPath(strNormalizeWorkspacePath), ContentTypeDetector.INSTANCE.fromFileName(strNormalizeWorkspacePath), strNormalizeWorkspacePath, workspaceUriResolver.resolveRawAssetUrl(strNormalizeWorkspacePath, abstractC3358CGz), null, null, str2, null, null, true, null, null, null, null, null), auraNavigator);
        return true;
    }

    public static final HxE<String, String> parseDeviceInvokeUrl(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.startsWith("hatch://devices/invoke/")) {
            Uri uri = Uri.parse(str);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() >= 2 && C7384Etj.areEqual(pathSegments.get(0), "invoke")) {
                String str2 = pathSegments.get(1);
                String str3 = str2;
                C7384Etj.A0X(str3);
                if (str3.length() > 0 && str2 != null) {
                    C2nw c2nw = new C2nw();
                    Iterator<String> it = uri.getQueryParameterNames().iterator();
                    while (it.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it);
                        C7384Etj.A0X(strA0j);
                        String queryParameter = uri.getQueryParameter(strA0j);
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        C7qW.A06(strA0j, queryParameter, c2nw);
                    }
                    return new HxE<>(str2, new JsonObject(c2nw.A00).toString());
                }
            }
        }
        return null;
    }

    public static final void routePresentationAction(String str, String str2, G0U<? super HatchSendMessage, Unit> g0u, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, C3UX c3ux, List<? extends ConversationPresentationAction> list, String str3, HatchMessageOrigin hatchMessageOrigin, String str4) {
        AnonymousClass005.A16(str, abstractC3358CGz, context, auraNavigator, 0);
        AnonymousClass003.A10(c3ux, list);
        if (!str.startsWith("hatch://")) {
            if (g0u != null) {
                g0u.invoke(new HatchSendMessage(str, null, null, null, null, null, null, null, str2, false, null, null, hatchMessageOrigin, 3838, null));
                return;
            }
            return;
        }
        PresentationLinkSource.TranscriptButton transcriptButton = new PresentationLinkSource.TranscriptButton(str4);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<? extends ConversationPresentationAction> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().handle(str, transcriptButton)) {
                    return;
                }
            }
        }
        HxE<String, String> deviceInvokeUrl = parseDeviceInvokeUrl(str);
        if (deviceInvokeUrl == null) {
            HatchUrlClickHandlerKt.handleUrlClick(abstractC3358CGz, str, context, auraNavigator, null, str3);
            return;
        }
        String str5 = deviceInvokeUrl.first;
        String str6 = deviceInvokeUrl.second;
        AuraSubscriptionPage auraSubscriptionPageSubscriptionPageForCommand = AuraSubscriptionUsageViewModelKt.subscriptionPageForCommand(str5, BuyCreditsEntrySurface.CHAT_OUT_OF_CREDITS);
        if (auraSubscriptionPageSubscriptionPageForCommand == null) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C114612(abstractC3358CGz, context, str5, str6, null), c3ux);
        } else if (HatchUtil.INSTANCE.isSubscriptionEnabled()) {
            auraNavigator.navigate((AuraNavKey) new AuraSubscriptionSheetKey(auraSubscriptionPageSubscriptionPageForCommand, SubscriptionPaywallEntryPoint.CHAT, null), false);
        }
    }

    /* renamed from: InlineWidgets-Ic2awPA, reason: not valid java name */
    public static final void m576InlineWidgetsIc2awPA(HatchMessageUiModel hatchMessageUiModel, AHD<HatchWidget> ahd, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, long j, C1D3 c1d3, boolean z, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchConversationWidgetsKt$InlineWidgets$4;
        boolean z2 = z;
        boolean zA1a = AnonymousClass002.A1a(hatchMessageUiModel, ahd);
        AnonymousClass003.A0y(function0, g0u2);
        C7384Etj.A0Y(g0v, 6);
        C7384Etj.A0Y(c1d3, 8);
        bfm.AgG(-2146403817);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMessageUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(ahd, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0w);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0v);
        }
        if ((12582912 & i) == 0) {
            iA05 |= AnonymousClass004.A0S(bfm, j);
        }
        if ((100663296 & i) == 0) {
            iA05 |= AnonymousClass004.A0l(bfm, c1d3);
        }
        int i3 = i2 & 512;
        int iA0w = 805306368;
        if (i3 != 0) {
            iA05 |= iA0w;
        } else if ((805306368 & i) == 0) {
            iA0w = AnonymousClass004.A0w(bfm, z2);
            iA05 |= iA0w;
        }
        boolean z3 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 306783379, 306783378), bfm, iA05)) {
            if (i3 != 0) {
                z2 = false;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchConversationWidgetsKt$InlineWidgets$4 = new HatchConversationWidgetsKt$InlineWidgets$1(hatchMessageUiModel, ahd, g0u, g0w, function0, g0u2, g0v, j, c1d3, z2, i, i2);
                    bBbAAc.A06 = hatchConversationWidgetsKt$InlineWidgets$4;
                }
                return;
            }
            Alignment alignment = hatchMessageUiModel.role == HatchMessageRole.USER ? C2VU.A0A : C2VU.A0B;
            BRg bRgM636bubbleMaxWidthrAjV9yQ = HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(BRg.A00, 0.0f, bfm, 6, zA1a ? 1 : 0);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A65(ahd))) {
                z3 = true;
            }
            Object objAaT = bfm.AaT();
            if (z3 || objAaT == C78N.A00) {
                objAaT = coalesceInlineWidgets(ahd);
                bfm.Ai0(objAaT);
            }
            List list = (List) objAaT;
            int size = list.size();
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchConversationWidgetsKt$InlineWidgets$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraMarkdownKt.CollapsingSpacedColumn(size, (G0U) objAaT2, C10G.A02, null, null, null, B1V.A00(bfm, new HatchConversationWidgetsKt$InlineWidgets$3(alignment, list, auraNavigatorA0b, j, c1d3, hatchMessageUiModel, bRgM636bubbleMaxWidthrAjV9yQ, g0u, g0w, function0, g0u2, g0v, z2), 1213675263), bfm, 1573296, 56);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchConversationWidgetsKt$InlineWidgets$4 = new HatchConversationWidgetsKt$InlineWidgets$4(hatchMessageUiModel, ahd, g0u, g0w, function0, g0u2, g0v, j, c1d3, z2, i, i2);
            bBbAAc.A06 = hatchConversationWidgetsKt$InlineWidgets$4;
        }
    }

    /* renamed from: PresentationFallback-OadGlvw, reason: not valid java name */
    public static final void m577PresentationFallbackOadGlvw(HatchWidgetPresentation hatchWidgetPresentation, long j, C1D3 c1d3, InlineContentCallbacks inlineContentCallbacks, String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchConversationWidgetsKt$PresentationFallback$1;
        BRg bRg2 = bRg;
        AnonymousClass005.A11(hatchWidgetPresentation, c1d3, inlineContentCallbacks, 0);
        C7384Etj.A0Y(str, 4);
        bfm.AgG(-2060848840);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWidgetPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1d3);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(inlineContentCallbacks, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strFallbackTextOrNull = HatchWidgetPresentationKt.fallbackTextOrNull(hatchWidgetPresentation);
            if (strFallbackTextOrNull == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchConversationWidgetsKt$PresentationFallback$1 = new HatchConversationWidgetsKt$PresentationFallback$text$1(hatchWidgetPresentation, j, c1d3, inlineContentCallbacks, str, bRg2, i, i2);
                    bBbAAc.A06 = hatchConversationWidgetsKt$PresentationFallback$1;
                }
                return;
            }
            HatchWidgetFallbackTextKt.HatchWidgetFallbackText(strFallbackTextOrNull, hatchWidgetPresentation.presentationId, str, C3U4.A0D(C1b8.A03(AnonymousClass001.A0U(bRg2, HatchMessageBubbleKt.BubbleMinHeight), c1d3, j), HatchMessageBubbleKt.BubbleInnerPadding), inlineContentCallbacks, bfm, AnonymousClass001.A0B(iA05 << 3, ((iA05 >> 6) & 896) | (InlineContentCallbacks.$stable << 12)), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchConversationWidgetsKt$PresentationFallback$1 = new HatchConversationWidgetsKt$PresentationFallback$1(hatchWidgetPresentation, j, c1d3, inlineContentCallbacks, str, bRg2, i, i2);
            bBbAAc.A06 = hatchConversationWidgetsKt$PresentationFallback$1;
        }
    }

    /* renamed from: WidgetFallback-TgFrcIs, reason: not valid java name */
    public static final void m578WidgetFallbackTgFrcIs(HatchWidget hatchWidget, boolean z, long j, C1D3 c1d3, InlineContentCallbacks inlineContentCallbacks, String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchConversationWidgetsKt$WidgetFallback$1;
        BRg bRg2 = bRg;
        AnonymousClass005.A16(hatchWidget, c1d3, inlineContentCallbacks, str, 0);
        bfm.AgG(-1588479740);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c1d3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, inlineContentCallbacks, 32768, i) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, str);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strFallbackTextOrNull = HatchWidgetPresentationKt.fallbackTextOrNull(hatchWidget);
            if (strFallbackTextOrNull == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchConversationWidgetsKt$WidgetFallback$1 = new HatchConversationWidgetsKt$WidgetFallback$text$1(hatchWidget, z, j, c1d3, inlineContentCallbacks, str, bRg2, i, i2);
                    bBbAAc.A06 = hatchConversationWidgetsKt$WidgetFallback$1;
                }
                return;
            }
            HatchWidgetFallbackTextKt.HatchWidgetFallbackText(strFallbackTextOrNull, hatchWidget.widgetId, str, z ? C3U4.A06(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXsmall) : C3U4.A0D(C1b8.A03(AnonymousClass001.A0U(bRg2, HatchMessageBubbleKt.BubbleMinHeight), c1d3, j), HatchMessageBubbleKt.BubbleInnerPadding), inlineContentCallbacks, bfm, AnonymousClass001.A0A(iA05, ((iA05 >> 9) & 896) | (InlineContentCallbacks.$stable << 12)), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchConversationWidgetsKt$WidgetFallback$1 = new HatchConversationWidgetsKt$WidgetFallback$1(hatchWidget, z, j, c1d3, inlineContentCallbacks, str, bRg2, i, i2);
            bBbAAc.A06 = hatchConversationWidgetsKt$WidgetFallback$1;
        }
    }

    /* renamed from: WidgetTokenWidgets-VRxQTpk, reason: not valid java name */
    public static final void m579WidgetTokenWidgetsVRxQTpk(HatchMessageUiModel hatchMessageUiModel, AHD<String> ahd, boolean z, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, long j, C1D3 c1d3, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchConversationWidgetsKt$WidgetTokenWidgets$3;
        boolean zA1b = AnonymousClass004.A1b(hatchMessageUiModel, ahd);
        AnonymousClass005.A0z(function0, g0u2, g0v);
        C7384Etj.A0Y(c1d3, 9);
        bfm.AgG(-947811649);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMessageUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0w);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if ((12582912 & i) == 0) {
            iA05 |= AnonymousClass004.A0a(bfm, g0v);
        }
        if ((100663296 & i) == 0) {
            iA05 |= AnonymousClass002.A03(bfm.A64(j) ? 1 : 0);
        }
        if ((i & 805306368) == 0) {
            iA05 |= AnonymousClass004.A0m(bfm, c1d3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 306783379, 306783378), bfm, iA05)) {
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    hatchConversationWidgetsKt$WidgetTokenWidgets$3 = new HatchConversationWidgetsKt$WidgetTokenWidgets$1(hatchMessageUiModel, ahd, z, g0u, g0w, function0, g0u2, g0v, j, c1d3, i);
                }
            } else {
                boolean zA1P = AnonymousClass003.A1P(bfm, hatchMessageUiModel.widgets, hatchMessageUiModel.presentations, AnonymousClass006.A1V(iA05));
                Object objAaT = bfm.AaT();
                if (zA1P || objAaT == C78N.A00) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ahd.iterator();
                    while (it.hasNext()) {
                        HatchWidget hatchWidgetWidgetForToken = widgetForToken(hatchMessageUiModel, AnonymousClass005.A0j(it));
                        if (hatchWidgetWidgetForToken != null) {
                            arrayList.add(hatchWidgetWidgetForToken);
                        }
                    }
                    objAaT = AnonymousClass001.A0z(bfm, arrayList);
                }
                AHD ahd2 = (AHD) objAaT;
                if (ahd2.isEmpty()) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        hatchConversationWidgetsKt$WidgetTokenWidgets$3 = new HatchConversationWidgetsKt$WidgetTokenWidgets$2(hatchMessageUiModel, ahd, z, g0u, g0w, function0, g0u2, g0v, j, c1d3, i);
                    }
                } else {
                    int i2 = iA05 >> 3;
                    m576InlineWidgetsIc2awPA(hatchMessageUiModel, ahd2, g0u, g0w, function0, g0u2, g0v, j, c1d3, z, bfm, AnonymousClass001.A06(iA05 << 21, AnonymousClass001.A09(i2, AnonymousClass005.A06(i2, HatchMessageUiModel.$stable | (iA05 & 14) | (HatchWidget.$stable << 3)))), zA1b ? 1 : 0);
                }
            }
            bBbAAc.A06 = hatchConversationWidgetsKt$WidgetTokenWidgets$3;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchConversationWidgetsKt$WidgetTokenWidgets$3 = new HatchConversationWidgetsKt$WidgetTokenWidgets$3(hatchMessageUiModel, ahd, z, g0u, g0w, function0, g0u2, g0v, j, c1d3, i);
            bBbAAc.A06 = hatchConversationWidgetsKt$WidgetTokenWidgets$3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /* renamed from: conversationWidgetContext-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.widget.api.ConversationWidgetContext m580conversationWidgetContextFU0evQE(java.lang.String r18, java.lang.String r19, long r20, X.C1D3 r22, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r23, boolean r24, X.BFM r25, int r26, int r27) {
        /*
            r10 = r18
            r14 = r22
            X.AnonymousClass003.A0w(r10, r14)
            r6 = 32
            r1 = r24
            r0 = r27
            boolean r18 = X.AnonymousClass002.A1R(r0, r1)
            r5 = r25
            android.content.Context r4 = X.AnonymousClass002.A0H(r5)
            X.CGz r3 = X.AnonymousClass002.A0h(r5)
            com.facebook.aura.navigation.AuraNavigator r2 = X.AnonymousClass002.A0b(r5)
            X.AKH<com.facebook.aura.model.WidgetStateMutationHost> r0 = com.facebook.aura.conversation.widget.api.ConversationWidgetRendererKt.LocalWidgetStateMutationHost
            java.lang.Object r17 = r5.A6v(r0)
            com.facebook.aura.model.WidgetStateMutationHost r17 = (com.facebook.aura.model.WidgetStateMutationHost) r17
            r0 = 57344(0xe000, float:8.0356E-41)
            r1 = r26
            r0 = r0 & r26
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            r8 = r23
            if (r0 <= r9) goto L3c
            boolean r0 = r5.A65(r8)
            if (r0 != 0) goto L41
        L3c:
            r7 = r1 & 24576(0x6000, float:3.4438E-41)
            r0 = 0
            if (r7 != r9) goto L42
        L41:
            r0 = 1
        L42:
            java.lang.Object r15 = r5.AaT()
            if (r0 != 0) goto L4c
            java.lang.Object r0 = X.C78N.A00
            if (r15 != r0) goto L54
        L4c:
            com.facebook.aura.conversation.view.HatchConversationWidgetsKt$conversationWidgetContext$1$1 r15 = new com.facebook.aura.conversation.view.HatchConversationWidgetsKt$conversationWidgetContext$1$1
            r15.<init>(r8)
            r5.Ai0(r15)
        L54:
            X.G0U r15 = (X.G0U) r15
            boolean r7 = X.AnonymousClass005.A1S(r5, r3, r4, r2)
            r0 = r26 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r11 = r19
            if (r0 <= r6) goto L68
            boolean r0 = r5.A65(r11)
            if (r0 != 0) goto L6d
        L68:
            r1 = r26 & 48
            r0 = 0
            if (r1 != r6) goto L6e
        L6d:
            r0 = 1
        L6e:
            r7 = r7 | r0
            java.lang.Object r0 = r5.AaT()
            if (r7 != 0) goto L79
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L81
        L79:
            com.facebook.aura.conversation.view.HatchConversationWidgetsKt$conversationWidgetContext$2$1 r0 = new com.facebook.aura.conversation.view.HatchConversationWidgetsKt$conversationWidgetContext$2$1
            r0.<init>(r3, r4, r2, r11)
            r5.Ai0(r0)
        L81:
            X.G0U r0 = (X.G0U) r0
            com.facebook.aura.conversation.widget.api.ConversationWidgetContext r9 = new com.facebook.aura.conversation.widget.api.ConversationWidgetContext
            r12 = r20
            r16 = r0
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationWidgetsKt.m580conversationWidgetContextFU0evQE(java.lang.String, java.lang.String, long, X.1D3, X.G0U, boolean, X.BFM, int, int):com.facebook.aura.conversation.widget.api.ConversationWidgetContext");
    }

    public static final String letterOpenedStateJson() {
        C2nw c2nw = new C2nw();
        C7qW.A04(AnonymousClass001.A0i(), "opened", c2nw);
        return new JsonObject(c2nw.A00).toString();
    }

    public static /* synthetic */ void routePresentationAction$default(String str, String str2, G0U g0u, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, C3UX c3ux, List list, String str3, HatchMessageOrigin hatchMessageOrigin, String str4, int i, Object obj) {
        if ((i & 256) != 0) {
            str3 = null;
        }
        if ((i & 512) != 0) {
            hatchMessageOrigin = null;
        }
        if ((i & 1024) != 0) {
            str4 = null;
        }
        routePresentationAction(str, str2, g0u, abstractC3358CGz, context, auraNavigator, c3ux, list, str3, hatchMessageOrigin, str4);
    }

    public static final void FlightOfferBookingForwarder(G0U<? super HatchSendMessage, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-1882078732);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            String str = (String) bfm.A6v(LocalConversationSessionIdKt.LocalConversationSessionId);
            C1BO c1boA02 = C2CK.A02(bfm, FlightOfferBookingRequest.pending);
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            Object value = c1boA02.getValue();
            boolean zA1R = AnonymousClass005.A1R(bfm, c1boA02, str, mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchConversationWidgetsKt$FlightOfferBookingForwarder$1$1(str, c1boA02, mutableStateA00);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, value, str);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(g0u, i);
        }
    }

    public static final /* synthetic */ FlightOfferBookingRequest.Booking access$FlightOfferBookingForwarder$lambda$0(C1BO c1bo) {
        return (FlightOfferBookingRequest.Booking) c1bo.getValue();
    }

    public static final String heightCacheKey(HatchWidget hatchWidget, String str, int i) {
        AnonymousClass003.A0u(hatchWidget, str);
        StringBuilder sb = new StringBuilder();
        sb.append(hatchWidget.widgetId);
        sb.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        sb.append(hatchWidget.kind);
        sb.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        sb.append(str.length());
        sb.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        sb.append(str.hashCode());
        sb.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        sb.append(i);
        return sb.toString();
    }

    public static final JsonObject multiImageSelectionReplyTarget(ImageOptionsWidgetData imageOptionsWidgetData, List<Integer> list) {
        AnonymousClass003.A0u(imageOptionsWidgetData, list);
        C2nw c2nw = new C2nw();
        C7qW.A06("type", "images", c2nw);
        C7qW.A07("images", new HatchConversationWidgetsKt$multiImageSelectionReplyTarget$1$1(list, imageOptionsWidgetData), c2nw);
        return new JsonObject(c2nw.A00);
    }

    public static final void performNavigationUiControl(NavigationUiControl navigationUiControl, AuraNavigator auraNavigator) {
        AnonymousClass003.A0u(navigationUiControl, auraNavigator);
        UiAction uiAction = HatchNavigationUiControlKt.toUiAction(navigationUiControl);
        if (uiAction == null || !HatchNavigationUiControlKt.performUiActionNavigation(uiAction, auraNavigator)) {
            CFK.A06(HatchConversationScreenKt.TAG, FGI.A0d("Unhandled navigation widget ui_control: ", navigationUiControl.action, ".", navigationUiControl.target));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.HatchWidget widgetForToken(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r4, java.lang.String r5) {
        /*
            X.AnonymousClass003.A0u(r4, r5)
            X.AHD<com.facebook.aura.model.HatchWidget> r0 = r4.widgets
            r3 = 0
            if (r0 == 0) goto L28
            java.util.Iterator r2 = r0.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.model.HatchWidget r0 = (com.facebook.aura.model.HatchWidget) r0
            java.lang.String r0 = r0.widgetId
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lc
        L21:
            com.facebook.aura.model.HatchWidget r1 = (com.facebook.aura.model.HatchWidget) r1
            if (r1 == 0) goto L28
            return r1
        L26:
            r1 = r3
            goto L21
        L28:
            X.AHD<com.facebook.aura.model.HatchWidgetPresentation> r0 = r4.presentations
            if (r0 == 0) goto L58
            java.util.Iterator r2 = r0.iterator()
        L30:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.model.HatchWidgetPresentation r0 = (com.facebook.aura.model.HatchWidgetPresentation) r0
            java.lang.String r0 = r0.presentationId
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L30
        L45:
            com.facebook.aura.model.HatchWidgetPresentation r1 = (com.facebook.aura.model.HatchWidgetPresentation) r1
            if (r1 == 0) goto L58
            com.facebook.aura.model.HatchPresentationData r1 = r1.data
        L4b:
            boolean r0 = r1 instanceof com.facebook.aura.model.WidgetPresentationData
            if (r0 == 0) goto L55
            com.facebook.aura.model.WidgetPresentationData r1 = (com.facebook.aura.model.WidgetPresentationData) r1
            if (r1 == 0) goto L55
            com.facebook.aura.model.HatchWidget r3 = r1.widget
        L55:
            return r3
        L56:
            r1 = r3
            goto L45
        L58:
            r1 = r3
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationWidgetsKt.widgetForToken(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, java.lang.String):com.facebook.aura.model.HatchWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* renamed from: HatchWidget-NjCylvU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m575HatchWidgetNjCylvU(com.facebook.aura.model.HatchWidget r52, X.BRg r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r58, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, X.G0U<? super java.lang.String, java.lang.Integer> r61, X.G0V<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r62, long r63, X.C1D3 r65, boolean r66, boolean r67, com.facebook.aura.conversation.view.InlineContentCallbacks r68, X.BFM r69, int r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 2490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationWidgetsKt.m575HatchWidgetNjCylvU(com.facebook.aura.model.HatchWidget, X.BRg, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.G0U, X.G0W, kotlin.jvm.functions.Function0, X.G0U, X.G0V, long, X.1D3, boolean, boolean, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int, int):void");
    }
}

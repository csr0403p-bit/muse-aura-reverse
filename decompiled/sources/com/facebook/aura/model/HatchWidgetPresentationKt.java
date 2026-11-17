package com.facebook.aura.model;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BGK;
import X.C06827l3;
import X.C0881AGi;
import X.C10571Hud;
import X.C2nw;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C7qW;
import X.C9oY;
import X.C9tI;
import X.HxE;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.shopping.model.ShoppingCartItem;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.utils.HatchStringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class HatchWidgetPresentationKt {
    public static final String HATCH_PRESENTATION_KIND_AUDIO = "audio";
    public static final String HATCH_PRESENTATION_KIND_AVATAR_SHARE = "avatar_share";
    public static final String HATCH_PRESENTATION_KIND_BROWSER_TASK = "browser_task";
    public static final String HATCH_PRESENTATION_KIND_COMPLIMENTARY_SUBSCRIPTION = "complimentary_subscription";
    public static final String HATCH_PRESENTATION_KIND_EXTERNAL_LINK = "external_link";
    public static final String HATCH_PRESENTATION_KIND_FILE = "file";
    public static final String HATCH_PRESENTATION_KIND_GENERIC_LIST = "generic_list";
    public static final String HATCH_PRESENTATION_KIND_IMAGE = "image";
    public static final String HATCH_PRESENTATION_KIND_INTERNAL_LINK_ACTION_CARD = "internal_link_action_card";
    public static final String HATCH_PRESENTATION_KIND_NAVIGATION_SCHEDULED_TASK = "navigation.scheduled_task";
    public static final String HATCH_PRESENTATION_KIND_PAIRING_LAUNCHER = "pairing_launcher";
    public static final String HATCH_PRESENTATION_KIND_SCHEDULED_TASK_CREATED_ACTIVITY = "scheduled_task_created_activity";
    public static final String HATCH_PRESENTATION_KIND_SHOPPING_CART = "shopping_cart";
    public static final String HATCH_PRESENTATION_KIND_SHOPPING_RESULTS = "shopping_results";
    public static final String HATCH_PRESENTATION_KIND_SHOPPING_RESULTS_V2 = "shopping_results_v2";
    public static final String HATCH_PRESENTATION_KIND_SLIDES = "slides";
    public static final String HATCH_PRESENTATION_KIND_SPACE_BUILD_COMPLETED = "space_build_completed";
    public static final String HATCH_PRESENTATION_KIND_SPACE_PROPOSAL = "space_proposal";
    public static final String HATCH_PRESENTATION_KIND_TEXT_WITH_BUTTON = "text_with_button";
    public static final String HATCH_PRESENTATION_KIND_UNRENDERABLE = "unrenderable";
    public static final String HATCH_PRESENTATION_KIND_VIDEO = "video";
    public static final String HATCH_PRESENTATION_KIND_WIDGET = "widget";
    public static final String HATCH_WIDGET_CLIENT_ANDROID = "android";
    public static final String HATCH_WIDGET_KIND_HTML = "html";
    public static final String HATCH_WIDGET_KIND_IDEA = "idea";
    public static final String HATCH_WIDGET_KIND_IDEA_GROUP = "idea_group";
    public static final String HATCH_WIDGET_KIND_IMAGE_OPTIONS = "image_options";
    public static final String HATCH_WIDGET_KIND_LETTER = "letter";
    public static final String HATCH_WIDGET_KIND_LOCAL_MAP = "local_map";
    public static final String HATCH_WIDGET_KIND_MARKETPLACE_MAP = "marketplace_map";
    public static final String HATCH_WIDGET_KIND_NAVIGATION = "navigation";
    public static final String HATCH_WIDGET_KIND_NODE_CARD = "node_card";
    public static final String HATCH_WIDGET_KIND_OPAQUE = "opaque";
    public static final String HATCH_WIDGET_KIND_OPTION = "option";
    public static final String HATCH_WIDGET_KIND_SPACE_BUILD_COMPLETED = "space_build_completed";
    public static final String HATCH_WIDGET_KIND_UNRENDERABLE = "unrenderable";
    public static final String HATCH_WIDGET_KIND_VOICE_OPTIONS = "voice_options";
    public static final String LETTER_BODY_PREVIEW_KIND_IMAGE = "image";
    public static final int MAX_CHAT_WIDGET_STATE_BYTES = 16384;
    public static final int MAX_INLINE_WIDGET_HTML_CHARS = 524288;
    public static final C06827l3 OPTION_LABEL_WHITESPACE = C06827l3.A02("\\s+");

    public static final Long conversationSeq(HatchWidgetPresentation hatchWidgetPresentation) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        Long l = hatchWidgetPresentation.chatEventSeq;
        return l == null ? hatchWidgetPresentation.seq : l;
    }

    public static final String fallbackTextOrNull(HatchWidget hatchWidget) {
        String strA0l;
        C7384Etj.A0Y(hatchWidget, 0);
        String str = hatchWidget.fallbackText;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final String htmlBackedPresentationHtml(HatchWidgetPresentation hatchWidgetPresentation) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        HatchWidget widget = hatchWidgetPresentation.getWidget();
        if (widget != null) {
            return htmlBackedWidgetHtml(widget);
        }
        return null;
    }

    public static final String htmlBackedWidgetHtml(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        HatchWidgetData hatchWidgetData = hatchWidget.data;
        if (hatchWidgetData instanceof HtmlWidgetData) {
            return ((HtmlWidgetData) hatchWidgetData).html;
        }
        if (!(hatchWidgetData instanceof IdeaWidgetData) && !(hatchWidgetData instanceof IdeaGroupWidgetData) && !(hatchWidgetData instanceof ImageOptionsWidgetData) && !(hatchWidgetData instanceof VoiceOptionsWidgetData) && !(hatchWidgetData instanceof LetterWidgetData)) {
            if (hatchWidgetData instanceof LocalMapWidgetData) {
                return ((LocalMapWidgetData) hatchWidgetData).html;
            }
            if (!(hatchWidgetData instanceof MarketplaceMapWidgetData) && !(hatchWidgetData instanceof NavigationWidgetData) && !(hatchWidgetData instanceof OptionWidgetData) && !(hatchWidgetData instanceof SpaceBuildCompletedWidgetData) && !(hatchWidgetData instanceof NodeCardWidgetData) && !(hatchWidgetData instanceof OpaqueWidgetData) && !(hatchWidgetData instanceof UnrenderableWidgetData)) {
                throw C3cG.A0q();
            }
        }
        return null;
    }

    public static final HatchSendMessage imageOptionsReplyMessage(String str, String str2, JsonObject jsonObject) {
        return new HatchSendMessage(str, null, null, null, null, new ReplyAttribution.Message(str2, null, null), null, AnonymousClass006.A10("reply_to_target", jsonObject), null, AnonymousClass005.A1Z(str, str2, jsonObject), null, null, null, 7518, null);
    }

    public static final List<Integer> imageOptionsSelectedIndices(JSONState jSONState, int i) {
        JsonArray jsonArray;
        JsonPrimitive jsonPrimitive;
        Integer numA02;
        C7384Etj.A0Y(jSONState, 0);
        Object obj = jSONState.data.get("selectedIndices");
        if (!(obj instanceof JsonArray) || (jsonArray = (JsonArray) obj) == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement jsonElementA11 = C60Q.A11(it);
            if ((jsonElementA11 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElementA11) != null && (numA02 = C9oY.A02(jsonPrimitive)) != null) {
                arrayListA0h.add(numA02);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj2 : arrayListA0h) {
            int iA0F = AnonymousClass001.A0F(obj2);
            if (iA0F >= 0 && iA0F < i) {
                arrayListA0h2.add(obj2);
            }
        }
        return C3cG.A0m(arrayListA0h2);
    }

    public static final boolean isSupportedOnThisClient(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        return supportedClientsIncludeThisClient(hatchWidget.supportedClients);
    }

    public static final boolean letterWidgetOpened(JSONState jSONState) {
        JsonPrimitive jsonPrimitive;
        C7384Etj.A0Y(jSONState, 0);
        Object obj = jSONState.data.get("opened");
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null) {
            return false;
        }
        return "true".equals(C9oY.A04(jsonPrimitive));
    }

    public static final boolean matchesWidgetId(HatchWidgetPresentation hatchWidgetPresentation, String str) {
        boolean zA1a = AnonymousClass002.A1a(hatchWidgetPresentation, str);
        HatchWidget widget = hatchWidgetPresentation.getWidget();
        if (str.equals(widget != null ? widget.widgetId : null) || str.equals(hatchWidgetPresentation.presentationId)) {
            return zA1a;
        }
        return false;
    }

    public static final boolean rendersAsFallbackText(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        return (!supportedClientsIncludeThisClient(hatchWidget.supportedClients) || (hatchWidget.data instanceof UnrenderableWidgetData)) && fallbackTextOrNull(hatchWidget) != null;
    }

    public static final String replyPreviewImageReference(HatchWidgetPresentation hatchWidgetPresentation) {
        List<HatchAttachmentFile> list;
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
        if (hatchPresentationData instanceof AvatarSharePresentationData) {
            return null;
        }
        if (hatchPresentationData instanceof WidgetPresentationData) {
            return replyPreviewImageReference(((WidgetPresentationData) hatchPresentationData).widget.data);
        }
        if (hatchPresentationData instanceof SpaceProposalPresentationData) {
            return ((SpaceProposalPresentationData) hatchPresentationData).proposal.imageUrl;
        }
        if (hatchPresentationData instanceof SpaceBuildCompletedPresentationData) {
            return replyPreviewImageUrl(((SpaceBuildCompletedPresentationData) hatchPresentationData).card);
        }
        if (hatchPresentationData instanceof ShoppingResultsPresentationData) {
            Iterator<ShoppingResultProduct> it = ((ShoppingResultsPresentationData) hatchPresentationData).shoppingResults.products.iterator();
            while (it.hasNext()) {
                String str = it.next().imageUrl;
                if (str != null) {
                    return str;
                }
            }
            return null;
        }
        if (hatchPresentationData instanceof ShoppingCartPresentationData) {
            Iterator<ShoppingCartItem> it2 = ((ShoppingCartPresentationData) hatchPresentationData).shoppingCart.cart.items.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().imageUrl;
                if (str2 != null) {
                    return str2;
                }
            }
            return null;
        }
        if (hatchPresentationData instanceof BrowserTaskPresentationData) {
            BrowserTaskScreenshot browserTaskScreenshot = ((BrowserTaskPresentationData) hatchPresentationData).browserTask.latestScreenshot;
            if (browserTaskScreenshot != null) {
                return browserTaskScreenshot.url;
            }
            return null;
        }
        if ((hatchPresentationData instanceof TextWithButtonPresentationData) || (hatchPresentationData instanceof ScheduledTaskCreatedPresentationData) || (hatchPresentationData instanceof ExternalLinkPresentationData)) {
            return null;
        }
        if (hatchPresentationData instanceof InternalLinkActionCardPresentationData) {
            return ((InternalLinkActionCardPresentationData) hatchPresentationData).card.imageUrl;
        }
        if (hatchPresentationData instanceof GenericListPresentationData) {
            Iterator<GenericListRow> it3 = ((GenericListPresentationData) hatchPresentationData).list.items.iterator();
            while (it3.hasNext()) {
                String str3 = it3.next().imageUrl;
                if (str3 != null) {
                    return str3;
                }
            }
            return null;
        }
        if (hatchPresentationData instanceof FilePresentationData) {
            return null;
        }
        if (hatchPresentationData instanceof ImageGalleryPresentationData) {
            list = ((ImageGalleryPresentationData) hatchPresentationData).images;
        } else {
            if (!(hatchPresentationData instanceof VideoPresentationData)) {
                if (hatchPresentationData instanceof AudioPresentationData) {
                    return null;
                }
                if (hatchPresentationData instanceof SlidesPresentationData) {
                    return ((SlidesPresentationData) hatchPresentationData).deck.path;
                }
                if (hatchPresentationData instanceof UnrenderablePresentationData) {
                    return null;
                }
                throw C3cG.A0q();
            }
            list = ((VideoPresentationData) hatchPresentationData).videos;
        }
        HatchAttachmentFile hatchAttachmentFile = (HatchAttachmentFile) AbstractC0878AGe.A0G(list);
        if (hatchAttachmentFile != null) {
            return hatchAttachmentFile.path;
        }
        return null;
    }

    public static final boolean supportedClientsIncludeThisClient(List<String> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strA0b = C7BY.A0b(it);
                if (strA0b != null && strA0b.equalsIgnoreCase("android")) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextWithButtonTextFormat.values().length];
            try {
                AnonymousClass002.A13(TextWithButtonTextFormat.PLAIN, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(TextWithButtonTextFormat.MARKDOWN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final JsonObject imageSelectionReplyTarget(String str, String str2) {
        C2nw c2nwA0s = C60R.A0s(str);
        C7qW.A06("type", "image", c2nwA0s);
        C7qW.A06("path", str, c2nwA0s);
        if (str2 != null) {
            C7qW.A06("image_id", str2, c2nwA0s);
        }
        return c2nwA0s.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.Hud] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.JSONState normalizeJSONState(kotlinx.serialization.json.JsonElement r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L27
            r1 = r4
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            boolean r0 = r1.A01()
            if (r0 == 0) goto L27
            java.lang.String r1 = X.C9oY.A04(r1)
            r4 = 0
            if (r1 == 0) goto L27
            X.9sU r0 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L1b
            kotlinx.serialization.json.JsonElement r1 = r0.A04(r1)     // Catch: java.lang.Throwable -> L1b
            goto L20
        L1b:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L20:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 != 0) goto L25
            r4 = r1
        L25:
            kotlinx.serialization.json.JsonElement r4 = (kotlinx.serialization.json.JsonElement) r4
        L27:
            boolean r0 = r4 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L50
            r1 = r4
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            java.lang.String r0 = "data"
            kotlinx.serialization.json.JsonElement r0 = X.C60O.A1F(r0, r1)
            kotlinx.serialization.json.JsonObject r3 = normalizeJSONStateData(r0)
            java.lang.String r0 = "version"
            kotlinx.serialization.json.JsonElement r0 = X.C60O.A1F(r0, r1)
            java.lang.Long r0 = normalizeJSONStateVersion(r0)
            if (r3 == 0) goto L50
            if (r0 == 0) goto L50
            long r1 = r0.longValue()
        L4a:
            com.facebook.aura.model.JSONState r0 = new com.facebook.aura.model.JSONState
            r0.<init>(r1, r3)
            return r0
        L50:
            kotlinx.serialization.json.JsonObject r3 = normalizeJSONStateData(r4)
            if (r3 != 0) goto L5a
            kotlinx.serialization.json.JsonObject r3 = X.C60O.A1G()
        L5a:
            r1 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchWidgetPresentationKt.normalizeJSONState(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.JSONState");
    }

    public static final JsonObject normalizeJSONStateData(JsonElement jsonElement) {
        JsonObject jsonObject;
        Object objA0s;
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.A01()) {
                String strA04 = C9oY.A04(jsonPrimitive);
                if (strA04 != null) {
                    try {
                        objA0s = HatchJsonKt.HatchJson.A04(strA04);
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    if (objA0s instanceof C10571Hud) {
                        objA0s = null;
                    }
                    jsonElement = (JsonElement) objA0s;
                } else {
                    jsonElement = null;
                }
            }
        }
        if (!(jsonElement instanceof JsonObject) || (jsonObject = (JsonObject) jsonElement) == null || jsonObject.toString().length() > 16384) {
            return null;
        }
        return jsonObject;
    }

    public static final Long normalizeJSONStateVersion(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Long lA0s;
        if (!(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || (lA0s = C9tI.A0s(strA04)) == null || lA0s.longValue() < 0) {
            return null;
        }
        return lA0s;
    }

    public static final List<String> normalizeOptionWidgetOptions(JsonElement jsonElement) {
        JsonArray jsonArray;
        JsonPrimitive jsonPrimitive;
        String strA04;
        if ((jsonElement instanceof JsonArray) && (jsonArray = (JsonArray) jsonElement) != null) {
            ArrayList arrayListA0h = C3cG.A0h();
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            Iterator<JsonElement> it = jsonArray.iterator();
            while (true) {
                if (it.hasNext()) {
                    JsonElement next = it.next();
                    if (!(next instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) next) == null || !jsonPrimitive.A01() || (strA04 = C9oY.A04(jsonPrimitive)) == null) {
                        break;
                    }
                    String strNormalizeOptionLabel = normalizeOptionLabel(strA04);
                    if (strNormalizeOptionLabel.length() == 0 || !linkedHashSetA0k.add(strNormalizeOptionLabel)) {
                        break;
                    }
                    arrayListA0h.add(strNormalizeOptionLabel);
                } else if (!arrayListA0h.isEmpty()) {
                    return arrayListA0h;
                }
            }
        }
        return null;
    }

    public static final String replyPreviewImageUrl(SpaceBuildCompletedPresentation spaceBuildCompletedPresentation) {
        String str = spaceBuildCompletedPresentation.previewCardImageUrl;
        if (str != null) {
            return str;
        }
        String str2 = spaceBuildCompletedPresentation.thumbnailImageUrl;
        return str2 == null ? spaceBuildCompletedPresentation.imageUrl : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000f A[PHI: r2
  0x000f: PHI (r2v19 java.lang.String) = 
  (r2v9 java.lang.String)
  (r2v13 java.lang.String)
  (r2v17 java.lang.String)
  (r2v16 java.lang.String)
  (r2v20 java.lang.String)
  (r2v21 java.lang.String)
 binds: [B:47:0x008d, B:37:0x0069, B:23:0x0039, B:18:0x002c, B:7:0x000d, B:5:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String replyPreviewText(com.facebook.aura.model.HatchPresentationData r4) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchWidgetPresentationKt.replyPreviewText(com.facebook.aura.model.HatchPresentationData):java.lang.String");
    }

    public static final List<HxE<String, JsonElement>> changedJSONStateFields(JsonObject jsonObject, JsonObject jsonObject2) {
        AnonymousClass003.A0u(jsonObject, jsonObject2);
        LinkedHashSet linkedHashSetA01 = BGK.A01(jsonObject2.keySet(), jsonObject.keySet());
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = linkedHashSetA01.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jsonObject.get(next);
            Object obj2 = jsonObject2.get(next);
            if (obj2 == null) {
                obj2 = JsonNull.A00;
            }
            if (!C7384Etj.areEqual(obj, obj2)) {
                AnonymousClass002.A1J(next, obj2, arrayListA0h);
            }
        }
        return arrayListA0h;
    }

    public static final String imageOptionsMultiSelectionStateJson(List<Integer> list) {
        C2nw c2nwA0s = C60R.A0s(list);
        C7qW.A07("selectedIndices", new HatchWidgetPresentationKt$imageOptionsMultiSelectionStateJson$1$1(list), c2nwA0s);
        return C60O.A0v(c2nwA0s);
    }

    public static final String imageOptionsSelectedPath(JSONState jSONState, List<String> list) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        AnonymousClass003.A0u(jSONState, list);
        Object obj = jSONState.data.get("selectedPath");
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || !list.contains(strA04)) {
            return null;
        }
        return strA04;
    }

    public static final String imageOptionsSelectionStateJson(String str) {
        return C7qW.A01("selectedPath", str, C60R.A0s(str)).toString();
    }

    public static final String localMapSelectedArtifactId(JSONState jSONState, List<String> list) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        AnonymousClass003.A0u(jSONState, list);
        Object obj = jSONState.data.get("selectedArtifactId");
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01() && (strA04 = C9oY.A04(jsonPrimitive)) != null && list.contains(strA04)) {
            return strA04;
        }
        return null;
    }

    public static final String localMapSelectionStateJson(String str) {
        return C7qW.A01("selectedArtifactId", str, C60R.A0s(str)).toString();
    }

    public static final String normalizeOptionLabel(String str) {
        return OPTION_LABEL_WHITESPACE.A03(AnonymousClass002.A0l(str), InviteCodeScratcherKt.CODE_SEPARATOR);
    }

    public static final String optionSelectionStateJson(String str) {
        return C7qW.A01("selectedText", str, C60R.A0s(str)).toString();
    }

    public static final String optionWidgetResolvedSelection(JSONState jSONState, OptionWidgetData optionWidgetData) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        AnonymousClass003.A0u(jSONState, optionWidgetData);
        String strOptionWidgetSelectedText = optionWidgetSelectedText(jSONState, optionWidgetData.options);
        if (strOptionWidgetSelectedText == null) {
            strOptionWidgetSelectedText = null;
            if (optionWidgetData.customInputPlaceholder != null) {
                Object obj = jSONState.data.get("selectedText");
                if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01() && (strA04 = C9oY.A04(jsonPrimitive)) != null) {
                    String strNormalizeOptionLabel = normalizeOptionLabel(strA04);
                    if (strNormalizeOptionLabel.length() > 0) {
                        return strNormalizeOptionLabel;
                    }
                }
            }
        }
        return strOptionWidgetSelectedText;
    }

    public static final String optionWidgetSelectedText(JSONState jSONState, List<String> list) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        AnonymousClass003.A0u(jSONState, list);
        Object obj = jSONState.data.get("selectedText");
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01() && (strA04 = C9oY.A04(jsonPrimitive)) != null) {
            String strNormalizeOptionLabel = normalizeOptionLabel(strA04);
            if (list.contains(strNormalizeOptionLabel)) {
                return strNormalizeOptionLabel;
            }
        }
        return null;
    }

    public static final HatchWidgetPresentation preserveWidgetPresentationState(HatchWidgetPresentation hatchWidgetPresentation, HatchWidgetPresentation hatchWidgetPresentation2) {
        AnonymousClass003.A0u(hatchWidgetPresentation, hatchWidgetPresentation2);
        return (!C7384Etj.areEqual(hatchWidgetPresentation2.getState(), new JSONState(0L, C60O.A1G())) || C7384Etj.areEqual(hatchWidgetPresentation.getState(), new JSONState(0L, C60O.A1G()))) ? hatchWidgetPresentation2 : hatchWidgetPresentation2.withState(hatchWidgetPresentation.getState());
    }

    public static final HatchWidget preserveWidgetState(HatchWidget hatchWidget, HatchWidget hatchWidget2) {
        AnonymousClass003.A0u(hatchWidget, hatchWidget2);
        return (!C7384Etj.areEqual(hatchWidget2.state, new JSONState(0L, C60O.A1G())) || C7384Etj.areEqual(hatchWidget.state, new JSONState(0L, C60O.A1G()))) ? hatchWidget2 : hatchWidget2.withState(hatchWidget.state);
    }

    public static final JsonObject replyTargetJson(ReplyAttribution.Product product) {
        C2nw c2nwA0s = C60R.A0s(product);
        C7qW.A06("type", "product", c2nwA0s);
        String str = product.presentationEventId;
        if (str != null) {
            C7qW.A06("presentation_event_id", str, c2nwA0s);
        }
        String str2 = product.productId;
        if (str2 != null) {
            C7qW.A06("product_id", str2, c2nwA0s);
        }
        String str3 = product.url;
        if (str3 != null) {
            C7qW.A06("url", str3, c2nwA0s);
        }
        String str4 = product.name;
        if (str4 != null) {
            C7qW.A06("name", str4, c2nwA0s);
        }
        Integer num = product.index;
        if (num != null) {
            C7qW.A05(num, "index", c2nwA0s);
        }
        return c2nwA0s.A00();
    }

    public static final Long conversationSeq(HatchWidgetPresentation hatchWidgetPresentation, Long l) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        Long l2 = hatchWidgetPresentation.chatEventSeq;
        if (l2 == null && (l2 = hatchWidgetPresentation.seq) == null) {
            return l;
        }
        long jLongValue = l2.longValue();
        if (l != null) {
            jLongValue = Math.min(l.longValue(), jLongValue);
        }
        return Long.valueOf(jLongValue);
    }

    public static final String fallbackTextOrNull(HatchWidgetPresentation hatchWidgetPresentation) {
        String strA0l;
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        String str = hatchWidgetPresentation.fallbackText;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final boolean isSupportedOnThisClient(HatchWidgetPresentation hatchWidgetPresentation) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        return supportedClientsIncludeThisClient(hatchWidgetPresentation.supportedClients);
    }

    public static final boolean rendersAsFallbackText(HatchWidgetPresentation hatchWidgetPresentation) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        if ((supportedClientsIncludeThisClient(hatchWidgetPresentation.supportedClients) && !(hatchWidgetPresentation.data instanceof UnrenderablePresentationData)) || fallbackTextOrNull(hatchWidgetPresentation) == null) {
            return false;
        }
        return true;
    }

    public static final String replyPreviewText(HatchWidgetPresentation hatchWidgetPresentation) {
        String strFallbackTextOrNull;
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        String str = hatchWidgetPresentation.displayText;
        if ((str != null && !C7BY.A0j(str) && (strFallbackTextOrNull = AnonymousClass002.A0l(str)) != null) || (((strFallbackTextOrNull = fallbackTextOrNull(hatchWidgetPresentation)) != null && rendersAsFallbackText(hatchWidgetPresentation)) || (strFallbackTextOrNull = replyPreviewText(hatchWidgetPresentation.data)) != null)) {
            return strFallbackTextOrNull;
        }
        String str2 = hatchWidgetPresentation.kind;
        C7384Etj.A0Y(str2, 0);
        return str2.replace('_', ' ');
    }

    public static final JsonObject replyTargetJson(ReplyAttribution.Presentation presentation) {
        C2nw c2nwA0s = C60R.A0s(presentation);
        C7qW.A06("type", ReplyAttributionSerializer.TYPE_PRESENTATION, c2nwA0s);
        C7qW.A06("presentation_event_id", presentation.presentationEventId, c2nwA0s);
        String str = presentation.replyToText;
        if (str != null) {
            C7qW.A06("reply_to_text", str, c2nwA0s);
        }
        return c2nwA0s.A00();
    }

    public static final String replyPreviewImageReference(HatchWidgetData hatchWidgetData) {
        LetterBodyPreviewImage letterBodyPreviewImage;
        LetterBodyPreviewImageData letterBodyPreviewImageData;
        if ((hatchWidgetData instanceof HtmlWidgetData) || (hatchWidgetData instanceof LocalMapWidgetData) || (hatchWidgetData instanceof MarketplaceMapWidgetData) || (hatchWidgetData instanceof OptionWidgetData)) {
            return null;
        }
        if (hatchWidgetData instanceof ImageOptionsWidgetData) {
            return (String) AbstractC0878AGe.A0G(((ImageOptionsWidgetData) hatchWidgetData).images);
        }
        if (hatchWidgetData instanceof VoiceOptionsWidgetData) {
            return null;
        }
        if (hatchWidgetData instanceof LetterWidgetData) {
            LetterBodyPreview letterBodyPreview = ((LetterWidgetData) hatchWidgetData).bodyPreview;
            if (!(letterBodyPreview instanceof LetterBodyPreviewImage) || (letterBodyPreviewImage = (LetterBodyPreviewImage) letterBodyPreview) == null || (letterBodyPreviewImageData = letterBodyPreviewImage.data) == null) {
                return null;
            }
            return letterBodyPreviewImageData.path;
        }
        if (hatchWidgetData instanceof IdeaWidgetData) {
            return ((IdeaWidgetData) hatchWidgetData).previewImageUrl;
        }
        if (hatchWidgetData instanceof IdeaGroupWidgetData) {
            IdeaWidgetData ideaWidgetData = (IdeaWidgetData) AbstractC0878AGe.A0G(((IdeaGroupWidgetData) hatchWidgetData).ideas);
            if (ideaWidgetData != null) {
                return ideaWidgetData.previewImageUrl;
            }
            return null;
        }
        if (hatchWidgetData instanceof NavigationWidgetData) {
            return ((NavigationWidgetData) hatchWidgetData).imagePath;
        }
        if (hatchWidgetData instanceof SpaceBuildCompletedWidgetData) {
            return replyPreviewImageUrl(((SpaceBuildCompletedWidgetData) hatchWidgetData).card);
        }
        if ((hatchWidgetData instanceof NodeCardWidgetData) || (hatchWidgetData instanceof OpaqueWidgetData) || (hatchWidgetData instanceof UnrenderableWidgetData)) {
            return null;
        }
        throw C3cG.A0q();
    }

    public static final long conversationSeq(HatchWidgetPresentation hatchWidgetPresentation, long j) {
        C7384Etj.A0Y(hatchWidgetPresentation, 0);
        Long l = hatchWidgetPresentation.chatEventSeq;
        if (l == null && (l = hatchWidgetPresentation.seq) == null) {
            return j;
        }
        return Math.min(j, l.longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[PHI: r0
  0x001d: PHI (r0v33 java.lang.String) = (r0v23 java.lang.String), (r0v35 java.lang.String) binds: [B:35:0x0071, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String replyPreviewText(com.facebook.aura.model.HatchWidgetData r4) {
        /*
            boolean r0 = r4 instanceof com.facebook.aura.model.HtmlWidgetData
            r2 = 0
            if (r0 != 0) goto La5
            boolean r0 = r4 instanceof com.facebook.aura.model.LocalMapWidgetData
            if (r0 != 0) goto La5
            boolean r0 = r4 instanceof com.facebook.aura.model.MarketplaceMapWidgetData
            if (r0 != 0) goto La5
            boolean r0 = r4 instanceof com.facebook.aura.model.OptionWidgetData
            if (r0 == 0) goto L2a
            com.facebook.aura.model.OptionWidgetData r4 = (com.facebook.aura.model.OptionWidgetData) r4
            java.util.List<java.lang.String> r0 = r4.options
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r0)
            java.lang.String r0 = (java.lang.String) r0
        L1b:
            if (r0 == 0) goto La5
        L1d:
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto La5
            int r0 = r1.length()
            if (r0 <= 0) goto La5
            return r1
        L2a:
            boolean r0 = r4 instanceof com.facebook.aura.model.ImageOptionsWidgetData
            if (r0 != 0) goto La5
            boolean r0 = r4 instanceof com.facebook.aura.model.VoiceOptionsWidgetData
            if (r0 == 0) goto L41
            com.facebook.aura.model.VoiceOptionsWidgetData r4 = (com.facebook.aura.model.VoiceOptionsWidgetData) r4
            java.util.List<com.facebook.aura.model.VoiceOptionData> r0 = r4.options
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r0)
            com.facebook.aura.model.VoiceOptionData r0 = (com.facebook.aura.model.VoiceOptionData) r0
            if (r0 == 0) goto La5
            java.lang.String r0 = r0.name
            goto L1b
        L41:
            boolean r0 = r4 instanceof com.facebook.aura.model.LetterWidgetData
            if (r0 == 0) goto L5c
            com.facebook.aura.model.LetterWidgetData r4 = (com.facebook.aura.model.LetterWidgetData) r4
            java.lang.String r3 = r4.emoji
            java.lang.String r1 = r4.title
            java.lang.String r0 = r4.byline
            java.lang.String[] r0 = new java.lang.String[]{r3, r1, r0}
            java.util.List r1 = X.BFI.A0F(r0)
            java.lang.String r0 = " "
            java.lang.String r0 = X.AbstractC06907md.A01(r0, r1, r2)
            goto L1b
        L5c:
            boolean r0 = r4 instanceof com.facebook.aura.model.IdeaWidgetData
            if (r0 == 0) goto L65
            com.facebook.aura.model.IdeaWidgetData r4 = (com.facebook.aura.model.IdeaWidgetData) r4
            java.lang.String r0 = r4.title
            goto L1b
        L65:
            boolean r0 = r4 instanceof com.facebook.aura.model.IdeaGroupWidgetData
            if (r0 == 0) goto L80
            com.facebook.aura.model.IdeaGroupWidgetData r4 = (com.facebook.aura.model.IdeaGroupWidgetData) r4
            com.facebook.aura.model.NavigationWidgetData r0 = r4.navigation
            if (r0 == 0) goto L73
            java.lang.String r0 = r0.title
            if (r0 != 0) goto L1d
        L73:
            java.util.List<com.facebook.aura.model.IdeaWidgetData> r0 = r4.ideas
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r0)
            com.facebook.aura.model.IdeaWidgetData r0 = (com.facebook.aura.model.IdeaWidgetData) r0
            if (r0 == 0) goto La5
            java.lang.String r0 = r0.title
            goto L1b
        L80:
            boolean r0 = r4 instanceof com.facebook.aura.model.NavigationWidgetData
            if (r0 == 0) goto L89
            com.facebook.aura.model.NavigationWidgetData r4 = (com.facebook.aura.model.NavigationWidgetData) r4
            java.lang.String r0 = r4.title
            goto L1b
        L89:
            boolean r0 = r4 instanceof com.facebook.aura.model.SpaceBuildCompletedWidgetData
            if (r0 == 0) goto L94
            com.facebook.aura.model.SpaceBuildCompletedWidgetData r4 = (com.facebook.aura.model.SpaceBuildCompletedWidgetData) r4
            com.facebook.aura.model.SpaceBuildCompletedPresentation r0 = r4.card
            java.lang.String r0 = r0.name
            goto L1b
        L94:
            boolean r0 = r4 instanceof com.facebook.aura.model.NodeCardWidgetData
            if (r0 != 0) goto La5
            boolean r0 = r4 instanceof com.facebook.aura.model.OpaqueWidgetData
            if (r0 != 0) goto La5
            boolean r0 = r4 instanceof com.facebook.aura.model.UnrenderableWidgetData
            if (r0 != 0) goto La5
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchWidgetPresentationKt.replyPreviewText(com.facebook.aura.model.HatchWidgetData):java.lang.String");
    }

    public static final String replyPreviewText(TextWithButtonPresentation textWithButtonPresentation) {
        TextWithButtonTextFormat textWithButtonTextFormat = textWithButtonPresentation.textFormat;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = textWithButtonTextFormat.ordinal();
        if (iOrdinal == 0) {
            return textWithButtonPresentation.text;
        }
        if (iOrdinal == 1) {
            return HatchStringUtils.INSTANCE.stripMarkdown(textWithButtonPresentation.text);
        }
        throw C3cG.A0q();
    }
}

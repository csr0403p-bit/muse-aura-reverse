package com.facebook.aura.conversation.viewmodel;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.F60;
import android.content.Context;
import android.text.format.DateFormat;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.gateway.parser.HatchUsageFooterParser;
import com.facebook.aura.gateway.parser.HatchWidgetTokenParser;
import com.facebook.aura.markdown.render.block.CustomBlockRenderersKt;
import com.facebook.aura.model.HatchBlockStatus;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchPlaceholderEntry;
import com.facebook.aura.model.HatchSearchResultData;
import com.facebook.aura.model.HatchSourceReference;
import com.facebook.aura.model.HatchToolCallResult;
import com.facebook.aura.model.HatchTranscriptJsonKt;
import com.facebook.aura.model.HatchTranscriptMessage;
import com.facebook.aura.model.ToolCallCitationJson;
import com.facebook.aura.model.ToolCallMetadataJson;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class HatchConversationListMapper {
    public static final int $stable = 8;
    public final boolean allowTypingCursorWhenDisconnected;
    public final Context context;
    public final boolean isNewThread;
    public final HatchConversationListMapper$markdownMediaMemo$1 markdownMediaMemo;
    public final String normalizedSessionId;
    public final HatchConversationListMapper$pillValidationMemo$1 pillValidationMemo;
    public final ConcurrentHashMap<String, String> renderedIdByServerId;
    public final HatchConversationListMapper$rendersNothingMemo$1 rendersNothingMemo;
    public final HatchConversationRepository repository;
    public final String sessionId;
    public final AbstractC3358CGz userSession;

    private final List<HatchContentViewModelData> parseVoiceNoteTranscript(String str) {
        String strA0l = AnonymousClass002.A0l(AbstractC2159Azp.A0z(str, "[Voice note]", ""));
        int iA0B = C7BY.A0B(strA0l, "[Auto-transcript]", 0, false);
        if (iA0B < 0) {
            if (!C7BY.A0j(strA0l)) {
            }
            return C0881AGi.A00;
        }
        strA0l = AnonymousClass002.A0l(strA0l.substring(iA0B + 17));
        if (strA0l != null && !C7BY.A0j(strA0l)) {
            return Collections.singletonList(new HatchContentViewModelData.Markdown(strA0l, null));
        }
        return C0881AGi.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel buildAttributionUiModel(com.facebook.aura.model.HatchMessage r11) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationListMapper.buildAttributionUiModel(com.facebook.aura.model.HatchMessage):com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel");
    }

    private final HatchSearchResultData buildSearchResultDataFromPlaceholders(HatchMessage hatchMessage) {
        Map<String, HatchPlaceholderEntry> map;
        Collection<HatchPlaceholderEntry> collectionValues;
        HatchDeltaTranscript hatchDeltaTranscript = hatchMessage.transcript;
        if (hatchDeltaTranscript == null || (map = hatchDeltaTranscript.placeholders) == null || (collectionValues = map.values()) == null) {
            return null;
        }
        ArrayList<HatchPlaceholderEntry> arrayListA0h = C3cG.A0h();
        for (HatchPlaceholderEntry hatchPlaceholderEntry : collectionValues) {
            C3cI.A1J(hatchPlaceholderEntry.kind, hatchPlaceholderEntry, "citation", arrayListA0h);
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchPlaceholderEntry hatchPlaceholderEntry2 : arrayListA0h) {
            String strA0p = C60O.A0p("permalink", hatchPlaceholderEntry2.data);
            if (strA0p != null && strA0p.length() > 0) {
                String strA0p2 = C60O.A0p("domain", hatchPlaceholderEntry2.data);
                if (strA0p2 == null || strA0p2.length() <= 0) {
                    String strA0h = C60Q.A0h(strA0p);
                    strA0p2 = strA0h != null ? C7BY.A0K("www.", strA0h) : strA0p;
                }
                String strA0p3 = C60O.A0p("favicon_url", hatchPlaceholderEntry2.data);
                if (strA0p3 == null || strA0p3.length() <= 0) {
                    strA0p3 = null;
                }
                String strA0p4 = C60O.A0p("title", hatchPlaceholderEntry2.data);
                if (strA0p4 == null || strA0p4.length() <= 0) {
                    strA0p4 = null;
                }
                arrayListA0h2.add(new HatchSourceReference(strA0p2, strA0p, strA0p3, strA0p4));
            }
        }
        if (arrayListA0h2.isEmpty()) {
            return null;
        }
        return new HatchSearchResultData(AGI.A0C(arrayListA0h2), null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarkdownMedia cachedMarkdownMedia(String str) {
        MarkdownMedia markdownMedia;
        synchronized (this.markdownMediaMemo) {
            HatchConversationListMapper$markdownMediaMemo$1 hatchConversationListMapper$markdownMediaMemo$1 = this.markdownMediaMemo;
            MarkdownMedia markdownMedia2 = hatchConversationListMapper$markdownMediaMemo$1.get((Object) str);
            if (markdownMedia2 == null) {
                markdownMedia2 = HatchInlineMediaPreComputeKt.parseMarkdownMedia(str);
                hatchConversationListMapper$markdownMediaMemo$1.put(str, markdownMedia2);
            }
            markdownMedia = markdownMedia2;
        }
        return markdownMedia;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean cachedMarkdownRendersNothing(String str) {
        boolean zA1X;
        synchronized (this.rendersNothingMemo) {
            HatchConversationListMapper$rendersNothingMemo$1 hatchConversationListMapper$rendersNothingMemo$1 = this.rendersNothingMemo;
            Boolean boolValueOf = hatchConversationListMapper$rendersNothingMemo$1.get((Object) str);
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(CustomBlockRenderersKt.markdownRendersNothing(str));
                hatchConversationListMapper$rendersNothingMemo$1.put(str, boolValueOf);
            }
            zA1X = AnonymousClass001.A1X(boolValueOf);
        }
        return zA1X;
    }

    private final List<String> citationResourceUris(HatchMessage hatchMessage) {
        Map<String, HatchPlaceholderEntry> map;
        Collection<HatchPlaceholderEntry> collectionValues;
        HatchDeltaTranscript hatchDeltaTranscript = hatchMessage.transcript;
        if (hatchDeltaTranscript == null || (map = hatchDeltaTranscript.placeholders) == null || (collectionValues = map.values()) == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchPlaceholderEntry hatchPlaceholderEntry : collectionValues) {
            HatchPlaceholderEntry hatchPlaceholderEntry2 = hatchPlaceholderEntry;
            if ("citation".equals(hatchPlaceholderEntry2.kind) && C7384Etj.areEqual(hatchPlaceholderEntry2.id, hatchPlaceholderEntry2.data.get("permalink"))) {
                arrayListA0h.add(hatchPlaceholderEntry);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((HatchPlaceholderEntry) it.next()).id);
        }
        return arrayListA0i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchMessageUiModel mapMessage$default(HatchConversationListMapper hatchConversationListMapper, HatchMessage hatchMessage, Set set, HatchConversationState hatchConversationState, Map map, HatchRenderSegment.ActivitySegment activitySegment, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            activitySegment = null;
        }
        return hatchConversationListMapper.mapMessage(hatchMessage, set, hatchConversationState, map, activitySegment, list);
    }

    private final List<HatchRenderSegment> pairPillSegments(List<? extends HatchRenderSegment> list, SegmentRender segmentRender) {
        List<HatchRenderSegment> listWidgetTextSegmentsFromText = widgetTextSegmentsFromText(segmentRender.markdown);
        if (listWidgetTextSegmentsFromText.size() == list.size()) {
            ArrayList arrayListA0t = C60Q.A0t(list);
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < size) {
                    HatchRenderSegment hatchRenderSegment = list.get(i);
                    HatchRenderSegment hatchRenderSegment2 = listWidgetTextSegmentsFromText.get(i);
                    if ((hatchRenderSegment instanceof HatchRenderSegment.TextSegment) && (hatchRenderSegment2 instanceof HatchRenderSegment.TextSegment)) {
                        HatchRenderSegment.TextSegment textSegment = (HatchRenderSegment.TextSegment) hatchRenderSegment2;
                        int iInlineEntitySentinelCount = HatchSegmentRendererKt.inlineEntitySentinelCount(textSegment.block.text);
                        if (iInlineEntitySentinelCount > 0 && !pillMarkdownRendersCleanly(textSegment.block.text)) {
                            break;
                        }
                        i2 += iInlineEntitySentinelCount;
                        HatchRenderSegment.TextSegment textSegment2 = (HatchRenderSegment.TextSegment) hatchRenderSegment;
                        AHD<HatchContentViewModelData> ahd = textSegment.richContent;
                        HatchContentBlock.TextBlock textBlock = textSegment2.block;
                        boolean z = textSegment2.isLast;
                        AHD<String> ahd2 = textSegment2.widgetTokenIds;
                        AnonymousClass003.A0w(textBlock, ahd2);
                        arrayListA0t.add(new HatchRenderSegment.TextSegment(textBlock, z, ahd, ahd2));
                        i++;
                    } else {
                        if (!(hatchRenderSegment instanceof HatchRenderSegment.WidgetTokenSegment) || !(hatchRenderSegment2 instanceof HatchRenderSegment.WidgetTokenSegment) || !C7384Etj.areEqual(((HatchRenderSegment.WidgetTokenSegment) hatchRenderSegment).widgetTokenIds, ((HatchRenderSegment.WidgetTokenSegment) hatchRenderSegment2).widgetTokenIds)) {
                            break;
                        }
                        arrayListA0t.add(hatchRenderSegment);
                        i++;
                    }
                } else if (i2 == segmentRender.inlineEntityCount) {
                    return arrayListA0t;
                }
            }
        }
        return null;
    }

    private final boolean pillMarkdownRendersCleanly(String str) {
        boolean zA1X;
        synchronized (this.pillValidationMemo) {
            HatchConversationListMapper$pillValidationMemo$1 hatchConversationListMapper$pillValidationMemo$1 = this.pillValidationMemo;
            Boolean boolValueOf = hatchConversationListMapper$pillValidationMemo$1.get((Object) str);
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(HatchSegmentRendererKt.rendersPillsCleanly(str));
                hatchConversationListMapper$pillValidationMemo$1.put(str, boolValueOf);
            }
            zA1X = AnonymousClass001.A1X(boolValueOf);
        }
        return zA1X;
    }

    private final List<String> reactionsFor(HatchMessage hatchMessage, HatchConversationState hatchConversationState) {
        List<String> list;
        List<String> list2;
        List<String> list3 = hatchConversationState.reactions.get(hatchMessage.id);
        if (list3 != null) {
            return list3;
        }
        String str = hatchMessage.serverMessageId;
        if (str != null && (list2 = hatchConversationState.reactions.get(str)) != null) {
            return list2;
        }
        String reactionTargetId = hatchMessage.getReactionTargetId();
        return (reactionTargetId == null || !hatchMessage.isSyntheticPresentationCarrier || (list = hatchConversationState.reactions.get(reactionTargetId)) == null) ? C0881AGi.A00 : list;
    }

    private final String resolveInlineImageUrl(String str) {
        return WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(str, this.userSession);
    }

    private final List<HatchRenderSegment> widgetTextSegmentsFromText(String str) {
        int i = HatchContentBlock.TextBlock.$stable;
        return widgetTextSegmentsFromTextBlock(new HatchContentBlock.TextBlock(null, str, HatchBlockStatus.DONE), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HatchRenderSegment> widgetTextSegmentsFromTextBlock(HatchContentBlock.TextBlock textBlock, boolean z) {
        int iNextIndex;
        HatchRenderSegment widgetTokenSegment;
        List<HatchWidgetTokenParser.ContentPart> listSplitTextAtTokens = HatchWidgetTokenParser.INSTANCE.splitTextAtTokens(textBlock.text, z);
        ListIterator listIteratorA0n = C3cG.A0n(listSplitTextAtTokens);
        while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIteratorA0n.previous() instanceof HatchWidgetTokenParser.TextPart) {
                iNextIndex = listIteratorA0n.nextIndex();
                break;
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(listSplitTextAtTokens);
        int i = 0;
        for (HatchWidgetTokenParser.ContentPart contentPart : listSplitTextAtTokens) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            HatchWidgetTokenParser.ContentPart contentPart2 = contentPart;
            if (contentPart2 instanceof HatchWidgetTokenParser.TextPart) {
                String strStripTrailingFooter = i == iNextIndex ? HatchUsageFooterParser.INSTANCE.stripTrailingFooter(((HatchWidgetTokenParser.TextPart) contentPart2).text) : ((HatchWidgetTokenParser.TextPart) contentPart2).text;
                AHD ahdA0E = strStripTrailingFooter.length() > 0 ? AGI.A0E(new HatchContentViewModelData.Markdown(strStripTrailingFooter, null)) : AHI.A01;
                int i3 = HatchRenderSegment.TextSegment.$stable;
                widgetTokenSegment = new HatchRenderSegment.TextSegment(textBlock.copy(textBlock.id, strStripTrailingFooter, textBlock.status), AnonymousClass002.A1Q(i, iNextIndex), ahdA0E, AHI.A01);
            } else {
                if (!(contentPart2 instanceof HatchWidgetTokenParser.WidgetTokenPart)) {
                    throw C3cG.A0q();
                }
                widgetTokenSegment = new HatchRenderSegment.WidgetTokenSegment(AGI.A0C(((HatchWidgetTokenParser.WidgetTokenPart) contentPart2).widgetTokenIds));
            }
            arrayListA0i.add(widgetTokenSegment);
            i = i2;
        }
        if (iNextIndex >= 0) {
            return arrayListA0i;
        }
        int i4 = HatchRenderSegment.TextSegment.$stable;
        HatchContentBlock.TextBlock textBlockCopy = textBlock.copy(textBlock.id, "", textBlock.status);
        AHI ahi = AHI.A01;
        return AbstractC0878AGe.A0Q(new HatchRenderSegment.TextSegment(textBlockCopy, true, ahi, ahi), arrayListA0i);
    }

    public final void clearRenderedIds() {
        this.renderedIdByServerId.clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.aura.conversation.viewmodel.HatchConversationListMapper$pillValidationMemo$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.aura.conversation.viewmodel.HatchConversationListMapper$rendersNothingMemo$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.aura.conversation.viewmodel.HatchConversationListMapper$markdownMediaMemo$1] */
    public HatchConversationListMapper(Context context, AbstractC3358CGz abstractC3358CGz, String str, String str2, HatchConversationRepository hatchConversationRepository, boolean z, boolean z2) {
        AnonymousClass005.A0x(context, abstractC3358CGz, str);
        C7384Etj.A0Y(hatchConversationRepository, 4);
        this.context = context;
        this.userSession = abstractC3358CGz;
        this.sessionId = str;
        this.normalizedSessionId = str2;
        this.repository = hatchConversationRepository;
        this.allowTypingCursorWhenDisconnected = z;
        this.isNewThread = z2;
        this.renderedIdByServerId = C60O.A1C();
        this.pillValidationMemo = new LinkedHashMap<String, Boolean>() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationListMapper$pillValidationMemo$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof Boolean) {
                    return super.containsValue(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean get(Object obj) {
                if (obj instanceof String) {
                    return (Boolean) super.get(obj);
                }
                return null;
            }

            public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
                return !(obj instanceof String) ? bool : (Boolean) super.getOrDefault(obj, (Object) bool);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean remove(Object obj) {
                if (obj instanceof String) {
                    return (Boolean) super.remove(obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Boolean>> entrySet() {
                return super.entrySet();
            }

            public /* bridge */ Set<Map.Entry<String, Boolean>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Boolean> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                return C8j4.A1V(size(), 64);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return super.size();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Boolean> values() {
                return super.values();
            }

            public /* bridge */ boolean containsKey(String str3) {
                return super.containsKey((Object) str3);
            }

            public /* bridge */ boolean containsValue(Boolean bool) {
                return super.containsValue((Object) bool);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.get(obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return super.getOrDefault(obj, obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                    return false;
                }
                return super.remove(obj, obj2);
            }

            public /* bridge */ Boolean get(String str3) {
                return (Boolean) super.get((Object) str3);
            }

            public /* bridge */ Boolean getOrDefault(String str3, Boolean bool) {
                return (Boolean) super.getOrDefault((Object) str3, (String) bool);
            }

            public /* bridge */ boolean remove(String str3, Boolean bool) {
                return super.remove((Object) str3, (Object) bool);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.remove(obj);
            }

            public /* bridge */ Boolean remove(String str3) {
                return (Boolean) super.remove((Object) str3);
            }
        };
        this.rendersNothingMemo = new LinkedHashMap<String, Boolean>() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationListMapper$rendersNothingMemo$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof Boolean) {
                    return super.containsValue(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean get(Object obj) {
                if (obj instanceof String) {
                    return (Boolean) super.get(obj);
                }
                return null;
            }

            public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
                return !(obj instanceof String) ? bool : (Boolean) super.getOrDefault(obj, (Object) bool);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean remove(Object obj) {
                if (obj instanceof String) {
                    return (Boolean) super.remove(obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Boolean>> entrySet() {
                return super.entrySet();
            }

            public /* bridge */ Set<Map.Entry<String, Boolean>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Boolean> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                return C8j4.A1V(size(), 512);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return super.size();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Boolean> values() {
                return super.values();
            }

            public /* bridge */ boolean containsKey(String str3) {
                return super.containsKey((Object) str3);
            }

            public /* bridge */ boolean containsValue(Boolean bool) {
                return super.containsValue((Object) bool);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.get(obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return super.getOrDefault(obj, obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                    return false;
                }
                return super.remove(obj, obj2);
            }

            public /* bridge */ Boolean get(String str3) {
                return (Boolean) super.get((Object) str3);
            }

            public /* bridge */ Boolean getOrDefault(String str3, Boolean bool) {
                return (Boolean) super.getOrDefault((Object) str3, (String) bool);
            }

            public /* bridge */ boolean remove(String str3, Boolean bool) {
                return super.remove((Object) str3, (Object) bool);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.remove(obj);
            }

            public /* bridge */ Boolean remove(String str3) {
                return (Boolean) super.remove((Object) str3);
            }
        };
        this.markdownMediaMemo = new LinkedHashMap<String, MarkdownMedia>() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationListMapper$markdownMediaMemo$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof MarkdownMedia) {
                    return super.containsValue(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ MarkdownMedia get(Object obj) {
                if (obj instanceof String) {
                    return (MarkdownMedia) super.get(obj);
                }
                return null;
            }

            public final /* bridge */ MarkdownMedia getOrDefault(Object obj, MarkdownMedia markdownMedia) {
                return !(obj instanceof String) ? markdownMedia : (MarkdownMedia) super.getOrDefault(obj, (Object) markdownMedia);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ MarkdownMedia remove(Object obj) {
                if (obj instanceof String) {
                    return (MarkdownMedia) super.remove(obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, MarkdownMedia>> entrySet() {
                return super.entrySet();
            }

            public /* bridge */ Set<Map.Entry<String, MarkdownMedia>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<MarkdownMedia> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, MarkdownMedia> entry) {
                return C8j4.A1V(size(), 512);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return super.size();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<MarkdownMedia> values() {
                return super.values();
            }

            public /* bridge */ boolean containsKey(String str3) {
                return super.containsKey((Object) str3);
            }

            public /* bridge */ boolean containsValue(MarkdownMedia markdownMedia) {
                return super.containsValue((Object) markdownMedia);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.get(obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return super.getOrDefault(obj, obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof MarkdownMedia)) {
                    return false;
                }
                return super.remove(obj, obj2);
            }

            public /* bridge */ MarkdownMedia get(String str3) {
                return (MarkdownMedia) super.get((Object) str3);
            }

            public /* bridge */ MarkdownMedia getOrDefault(String str3, MarkdownMedia markdownMedia) {
                return (MarkdownMedia) super.getOrDefault((Object) str3, (String) markdownMedia);
            }

            public /* bridge */ boolean remove(String str3, MarkdownMedia markdownMedia) {
                return super.remove((Object) str3, (Object) markdownMedia);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.remove(obj);
            }

            public /* bridge */ MarkdownMedia remove(String str3) {
                return (MarkdownMedia) super.remove((Object) str3);
            }
        };
    }

    private final Map<String, Map<String, String>> buildCitationMapByCorrelation(List<HatchMessage> list) {
        String str;
        HatchToolCallResult hatchToolCallResult;
        JsonElement jsonElement;
        ToolCallMetadataJson toolCallMetadata;
        String str2;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator<HatchMessage> it = list.iterator();
        while (it.hasNext()) {
            HatchDeltaTranscript hatchDeltaTranscript = C60Q.A0K(it).transcript;
            if (hatchDeltaTranscript != null && (str = hatchDeltaTranscript.replyToMessageId) != null) {
                Iterator<HatchTranscriptMessage> it2 = hatchDeltaTranscript.messages.iterator();
                while (it2.hasNext()) {
                    for (HatchContentBlock hatchContentBlock : it2.next().content) {
                        if ((hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) && (hatchToolCallResult = ((HatchContentBlock.ToolCallBlock) hatchContentBlock).result) != null && (jsonElement = hatchToolCallResult.metadata) != null && (toolCallMetadata = HatchTranscriptJsonKt.toToolCallMetadata(jsonElement)) != null) {
                            for (ToolCallCitationJson toolCallCitationJson : toolCallMetadata.results) {
                                String str3 = toolCallCitationJson.citation_id;
                                if (str3 != null && str3.length() > 0 && (str2 = toolCallCitationJson.url) != null && str2.length() > 0) {
                                    Object objA0j = linkedHashMapA0j.get(str);
                                    if (objA0j == null) {
                                        objA0j = C3cG.A0j();
                                        linkedHashMapA0j.put(str, objA0j);
                                    }
                                    ((Map) objA0j).put(str3, str2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMapA0j;
    }

    private final String formatTimestamp(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        boolean z = calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
        Locale locale = Locale.getDefault();
        String str = DateFormat.is24HourFormat(this.context) ? "Hm" : "hm";
        if (z) {
            String str2 = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale).format(new Date(j));
            C7384Etj.A0X(str2);
            return str2;
        }
        String str3 = android.icu.text.DateFormat.getInstanceForSkeleton("MMMd".concat(str), locale).format(new Date(j));
        C7384Etj.A0U(str3);
        C7384Etj.A0X(locale);
        return str3.toUpperCase(locale);
    }

    private final List<HatchContentViewModelData> groupConsecutiveImages(List<? extends HatchContentViewModelData> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchContentViewModelData hatchContentViewModelData : list) {
            if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImage) {
                arrayListA0h2.add(hatchContentViewModelData);
            } else {
                groupConsecutiveImages$flushImages(arrayListA0h2, arrayListA0h);
                arrayListA0h.add(hatchContentViewModelData);
            }
        }
        groupConsecutiveImages$flushImages(arrayListA0h2, arrayListA0h);
        return arrayListA0h;
    }

    public static final void groupConsecutiveImages$flushImages(List<HatchContentViewModelData.InlineImage> list, List<HatchContentViewModelData> list2) {
        HatchContentViewModelData inlineImageGroup;
        if (list.size() < 2) {
            if (list.size() == 1) {
                inlineImageGroup = list.get(0);
            }
            list.clear();
        }
        inlineImageGroup = new HatchContentViewModelData.InlineImageGroup(AGI.A0C(list));
        list2.add(inlineImageGroup);
        list.clear();
    }

    private final void rememberRenderedIds(List<HatchMessage> list, List<? extends HatchConversationListItem> list2) {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        String str;
        Iterator<HatchMessage> it = list.iterator();
        while (it.hasNext()) {
            HatchMessage hatchMessageA0K = C60Q.A0K(it);
            String str2 = hatchMessageA0K.serverMessageId;
            if (str2 != null) {
                this.renderedIdByServerId.putIfAbsent(str2, hatchMessageA0K.id);
            }
        }
        for (HatchConversationListItem hatchConversationListItem : list2) {
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem) != null && (str = (hatchMessageUiModel = message.message).serverMessageId) != null) {
                ConcurrentHashMap<String, String> concurrentHashMap = this.renderedIdByServerId;
                String str3 = message.renderedIdOverride;
                if (str3 == null) {
                    str3 = hatchMessageUiModel.id;
                }
                concurrentHashMap.putIfAbsent(str, str3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.conversation.viewmodel.HatchRenderSegment> widgetTextSegmentsFromTranscript(java.util.List<? extends com.facebook.aura.model.HatchContentBlock> r13, boolean r14) {
        /*
            r12 = this;
            java.util.List r0 = com.facebook.aura.conversation.viewmodel.HatchTranscriptUtilsKt.segmentContent(r13)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.facebook.aura.conversation.viewmodel.HatchRenderSegment.TextSegment
            if (r0 == 0) goto Lc
            r3.add(r1)
            goto Lc
        L1e:
            java.util.ArrayList r9 = X.C3cG.A0h()
            java.util.Iterator r11 = r3.iterator()
        L26:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r8 = r11.next()
            com.facebook.aura.conversation.viewmodel.HatchRenderSegment$TextSegment r8 = (com.facebook.aura.conversation.viewmodel.HatchRenderSegment.TextSegment) r8
            com.facebook.aura.model.HatchContentBlock$TextBlock r0 = r8.block
            java.util.List r2 = r12.widgetTextSegmentsFromTextBlock(r0, r14)
            java.util.ListIterator r1 = X.C3cG.A0n(r2)
        L3c:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r1.previous()
            boolean r0 = r0 instanceof com.facebook.aura.conversation.viewmodel.HatchRenderSegment.TextSegment
            if (r0 == 0) goto L3c
            int r7 = r1.nextIndex()
        L4e:
            java.util.ArrayList r6 = X.AnonymousClass003.A0i(r2)
            java.util.Iterator r10 = r2.iterator()
            r1 = 0
        L57:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r5 = r10.next()
            int r4 = r1 + 1
            if (r1 >= 0) goto L6d
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L6d:
            com.facebook.aura.conversation.viewmodel.HatchRenderSegment r5 = (com.facebook.aura.conversation.viewmodel.HatchRenderSegment) r5
            boolean r0 = r5 instanceof com.facebook.aura.conversation.viewmodel.HatchRenderSegment.TextSegment
            if (r0 == 0) goto L8b
            com.facebook.aura.conversation.viewmodel.HatchRenderSegment$TextSegment r5 = (com.facebook.aura.conversation.viewmodel.HatchRenderSegment.TextSegment) r5
            boolean r0 = r8.isLast
            if (r0 == 0) goto L7c
            r3 = 1
            if (r1 == r7) goto L7d
        L7c:
            r3 = 0
        L7d:
            com.facebook.aura.model.HatchContentBlock$TextBlock r2 = r5.block
            X.AHD<com.facebook.aura.model.HatchContentViewModelData> r1 = r5.richContent
            X.AHD<java.lang.String> r0 = r5.widgetTokenIds
            X.AnonymousClass003.A0w(r2, r0)
            com.facebook.aura.conversation.viewmodel.HatchRenderSegment$TextSegment r5 = new com.facebook.aura.conversation.viewmodel.HatchRenderSegment$TextSegment
            r5.<init>(r2, r3, r1, r0)
        L8b:
            r6.add(r5)
            r1 = r4
            goto L57
        L90:
            X.AbstractC0882AGj.A0r(r6, r9)
            goto L26
        L94:
            r7 = -1
            goto L4e
        L96:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationListMapper.widgetTextSegmentsFromTranscript(java.util.List, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.aura.conversation.viewmodel.HatchConversationListItem> buildListItems(com.facebook.aura.conversation.repo.HatchConversationState r27, com.facebook.aura.status.repo.AgentActivityInfo r28, boolean r29, java.util.List<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r30) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationListMapper.buildListItems(com.facebook.aura.conversation.repo.HatchConversationState, com.facebook.aura.status.repo.AgentActivityInfo, boolean, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f8 A[LOOP:8: B:174:0x02f2->B:176:0x02f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0353 A[PHI: r2
  0x0353: PHI (r2v13 java.util.List<com.facebook.aura.conversation.viewmodel.HatchRenderSegment>) = 
  (r2v12 java.util.List<com.facebook.aura.conversation.viewmodel.HatchRenderSegment>)
  (r2v35 java.util.List<com.facebook.aura.conversation.viewmodel.HatchRenderSegment>)
  (r2v35 java.util.List<com.facebook.aura.conversation.viewmodel.HatchRenderSegment>)
 binds: [B:200:0x0350, B:184:0x0319, B:186:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.conversation.viewmodel.HatchMessageUiModel mapMessage(com.facebook.aura.model.HatchMessage r52, java.util.Set<java.lang.String> r53, com.facebook.aura.conversation.repo.HatchConversationState r54, java.util.Map<java.lang.String, java.lang.String> r55, com.facebook.aura.conversation.viewmodel.HatchRenderSegment.ActivitySegment r56, java.util.List<com.facebook.aura.model.HatchMessage> r57) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationListMapper.mapMessage(com.facebook.aura.model.HatchMessage, java.util.Set, com.facebook.aura.conversation.repo.HatchConversationState, java.util.Map, com.facebook.aura.conversation.viewmodel.HatchRenderSegment$ActivitySegment, java.util.List):com.facebook.aura.conversation.viewmodel.HatchMessageUiModel");
    }
}

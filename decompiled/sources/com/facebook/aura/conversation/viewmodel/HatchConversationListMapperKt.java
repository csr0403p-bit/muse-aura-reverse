package com.facebook.aura.conversation.viewmodel;

import X.AGI;
import X.AbstractC0885AGm;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06827l3;
import X.C1Lu;
import X.C7384Etj;
import X.C7BY;
import X.EnumC06837l4;
import X.F60;
import android.net.Uri;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.model.HatchSearchResultData;
import com.facebook.aura.model.HatchSourceReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class HatchConversationListMapperKt {
    public static final int MARKDOWN_MEMO_CAPACITY = 512;
    public static final int PILL_MEMO_CAPACITY = 64;
    public static final C06827l3 SOURCE_LINE_REGEX = new C06827l3("^\\s*-\\s*\\[([^]]+)]\\(([^)]+)\\)\\s*\\[([a-zA-Z0-9]{3,6})]", EnumC06837l4.A04);
    public static final String TAG = "HatchConversationVM";

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void addMessageItem(java.util.List<com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r56, com.facebook.aura.conversation.viewmodel.MessageGroupTracker r57, com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r58, java.lang.String r59, java.lang.String r60) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationListMapperKt.addMessageItem(java.util.List, com.facebook.aura.conversation.viewmodel.MessageGroupTracker, com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ void addMessageItem$default(List list, MessageGroupTracker messageGroupTracker, HatchMessageUiModel hatchMessageUiModel, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        addMessageItem(list, messageGroupTracker, hatchMessageUiModel, str, str2);
    }

    public static final HatchSearchResultData extractSearchResultData(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = C06827l3.A00(str, SOURCE_LINE_REGEX).iterator();
        while (it.hasNext()) {
            String str2 = ((C1Lu) it.next()).AG1().get(2);
            String host = Uri.parse(str2).getHost();
            if (host == null) {
                host = str2;
            }
            if (AnonymousClass005.A1a(host, "www.")) {
                host = C7BY.A0K("www.", host);
            }
            arrayList.add(new HatchSourceReference(host, str2, null, null));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new HatchSearchResultData(AGI.A0C(arrayList), null, null, null, null);
    }

    public static final void promoteGroupPosition(List<HatchConversationListItem> list, int i) {
        HatchConversationListItem hatchConversationListItem = list.get(i);
        C7384Etj.A0Z(hatchConversationListItem, "null cannot be cast to non-null type com.facebook.aura.conversation.viewmodel.HatchConversationListItem.Message");
        HatchConversationListItem.Message message = (HatchConversationListItem.Message) hatchConversationListItem;
        HatchMessageUiModel hatchMessageUiModel = message.message;
        BubbleGroupPosition bubbleGroupPosition = hatchMessageUiModel.groupPosition;
        BubbleGroupPosition bubbleGroupPositionPromoteToGroupInterior = bubbleGroupPosition.promoteToGroupInterior();
        if (bubbleGroupPositionPromoteToGroupInterior != bubbleGroupPosition) {
            list.set(i, message.copy(HatchMessageUiModel.copy$default(hatchMessageUiModel, null, null, null, null, null, 0L, false, false, null, false, null, bubbleGroupPositionPromoteToGroupInterior, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 127, null), message.renderedIdOverride, message.replacedTypingCursor));
        }
    }

    public static final HatchSearchResultData buildSearchResultData(Map<String, String> map) {
        Collection<String> collectionValues = map.values();
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionValues);
        for (String str : collectionValues) {
            String host = Uri.parse(str).getHost();
            if (host == null) {
                host = str;
            }
            if (AnonymousClass005.A1a(host, "www.")) {
                host = C7BY.A0K("www.", host);
            }
            arrayListA0i.add(new HatchSourceReference(host, str, null, null));
        }
        if (arrayListA0i.isEmpty()) {
            return null;
        }
        return new HatchSearchResultData(AGI.A0C(arrayListA0i), null, null, null, null);
    }

    public static final List<HatchConversationListItem> keepingLastOfEachKey(List<? extends HatchConversationListItem> list) {
        HashMap map = new HashMap(list.size());
        Iterator<? extends HatchConversationListItem> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                for (HatchConversationListItem hatchConversationListItem : list) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        Number number = (Number) map.get(hatchConversationListItem.getKey());
                        if (number != null && number.intValue() == i) {
                            arrayList.add(hatchConversationListItem);
                        }
                        i = i3;
                    }
                }
                return arrayList;
            }
            HatchConversationListItem next = it.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                break;
            }
            map.put(next.getKey(), Integer.valueOf(i2));
            i2 = i4;
        }
        AbstractC0885AGm.A14();
        throw F60.createAndThrow();
    }
}

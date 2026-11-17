package com.facebook.aura.identity.provider;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C7BY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class HatchChatThemeHelperKt {
    public static final String HATCH_AVATAR_THEME_ID = "avatar";
    public static final String HATCH_DEFAULT_THEME_ID = "default";

    public static final String normalizedChatThemeId(String str) {
        String string;
        if (str == null || (string = C7BY.A0F(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string.toLowerCase(Locale.ROOT);
    }

    public static final HatchConversationTheme resolveConversationTheme(String str, List<HatchChatThemeOption> list) {
        HatchChatThemeOption next;
        HatchConversationTheme hatchConversationTheme;
        AnonymousClass003.A0u(str, list);
        Iterator<HatchChatThemeOption> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.id)) {
                break;
            }
        }
        HatchChatThemeOption hatchChatThemeOption = next;
        return (hatchChatThemeOption == null || (hatchConversationTheme = hatchChatThemeOption.conversationTheme) == null) ? HatchConversationTheme.DEFAULT : hatchConversationTheme;
    }

    public static final List<String> sortedChatThemeIds(Iterable<String> iterable, List<String> list) {
        AnonymousClass003.A0u(iterable, list);
        Set setA0g = AbstractC0878AGe.A0g(iterable);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (setA0g.contains(HATCH_AVATAR_THEME_ID)) {
            arrayList.add(HATCH_AVATAR_THEME_ID);
            linkedHashSet.add(HATCH_AVATAR_THEME_ID);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strNormalizedChatThemeId = normalizedChatThemeId(it.next());
            if (strNormalizedChatThemeId != null) {
                arrayList2.add(strNormalizedChatThemeId);
            }
        }
        for (Object obj : arrayList2) {
            if (setA0g.contains(obj) && !linkedHashSet.contains(obj)) {
                arrayList.add(obj);
                linkedHashSet.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : setA0g) {
            if (!linkedHashSet.contains(obj2)) {
                arrayList3.add(obj2);
            }
        }
        arrayList.addAll(AbstractC0878AGe.A0W(arrayList3));
        return arrayList;
    }
}

package com.facebook.aura.conversation.repo;

import X.AbstractC0878AGe;
import X.AbstractC2258BHp;
import X.AbstractC7536F0j;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.model.HatchMessage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class HatchConversationMessageOrderingKt {
    public static final List<HatchMessage> orderedMessages(HatchConversationState hatchConversationState) {
        long jLongValue;
        long jLongValue2;
        double dLongValue;
        C7384Etj.A0Y(hatchConversationState, 0);
        Set<String> activeStreamingMessageIds = hatchConversationState.getActiveStreamingMessageIds();
        List<HatchMessage> listCollapseDuplicateMessages = collapseDuplicateMessages(AbstractC0878AGe.A0P(hatchConversationState.messages, withoutLiveDuplicates(hatchConversationState.history, hatchConversationState.messages)), activeStreamingMessageIds);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchMessage> it = listCollapseDuplicateMessages.iterator();
        while (it.hasNext()) {
            HatchMessage hatchMessageA0K = C60Q.A0K(it);
            Long l = hatchMessageA0K.seq;
            if (l != null) {
                AnonymousClass002.A1J(Long.valueOf(hatchMessageA0K.timestamp), l, arrayListA0h);
            }
        }
        Iterator it2 = arrayListA0h.iterator();
        if (it2.hasNext()) {
            Long lA0Y = C60R.A0Y(it2);
            while (it2.hasNext()) {
                Long lA0Y2 = C60R.A0Y(it2);
                if (lA0Y.compareTo(lA0Y2) > 0) {
                    lA0Y = lA0Y2;
                }
            }
            jLongValue = lA0Y.longValue();
        } else {
            jLongValue = 0;
        }
        final LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(listCollapseDuplicateMessages));
        Iterator<HatchMessage> it3 = listCollapseDuplicateMessages.iterator();
        while (it3.hasNext()) {
            HatchMessage hatchMessageA0K2 = C60Q.A0K(it3);
            Long l2 = hatchMessageA0K2.seq;
            String str = hatchMessageA0K2.id;
            if (l2 != null) {
                dLongValue = l2.longValue();
            } else if (activeStreamingMessageIds.contains(str)) {
                dLongValue = Double.MAX_VALUE;
            } else {
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (Object obj : arrayListA0h) {
                    if (C3cG.A05(((HxE) obj).first) <= hatchMessageA0K2.timestamp) {
                        arrayListA0h2.add(obj);
                    }
                }
                Iterator it4 = arrayListA0h2.iterator();
                if (it4.hasNext()) {
                    Long lA0Y3 = C60R.A0Y(it4);
                    while (it4.hasNext()) {
                        Long lA0Y4 = C60R.A0Y(it4);
                        if (lA0Y3.compareTo(lA0Y4) < 0) {
                            lA0Y3 = lA0Y4;
                        }
                    }
                    jLongValue2 = lA0Y3.longValue();
                } else {
                    jLongValue2 = jLongValue - 1;
                }
                dLongValue = jLongValue2 + 0.5d;
            }
            linkedHashMapA15.put(str, Double.valueOf(dLongValue));
        }
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchConversationMessageOrderingKt$orderedMessages$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Map map = linkedHashMapA15;
                String str2 = ((HatchMessage) t).id;
                C7384Etj.A0Y(map, 0);
                Comparable comparable = (Comparable) AbstractC2258BHp.A0L(str2, map);
                Map map2 = linkedHashMapA15;
                String str3 = ((HatchMessage) t2).id;
                C7384Etj.A0Y(map2, 0);
                return AbstractC7536F0j.A00(comparable, (Comparable) AbstractC2258BHp.A0L(str3, map2));
            }
        };
        return AbstractC0878AGe.A0c(listCollapseDuplicateMessages, new Comparator() { // from class: com.facebook.aura.conversation.repo.HatchConversationMessageOrderingKt$orderedMessages$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? C60Q.A01(Long.valueOf(((HatchMessage) t).timestamp), ((HatchMessage) t2).timestamp) : iCompare;
            }
        });
    }

    public static final List<HatchMessage> collapseDuplicateMessages(List<HatchMessage> list, Set<String> set) {
        String str;
        ArrayList arrayListA0t = C60Q.A0t(list);
        HashSet hashSetA13 = C60O.A13();
        HashSet hashSetA132 = C60O.A13();
        Iterator<HatchMessage> it = list.iterator();
        while (it.hasNext()) {
            HatchMessage hatchMessageA0K = C60Q.A0K(it);
            if (!set.contains(hatchMessageA0K.id)) {
                if (!hashSetA13.contains(hatchMessageA0K.id) && ((str = hatchMessageA0K.serverMessageId) == null || !hashSetA13.contains(str))) {
                    Long l = hatchMessageA0K.seq;
                    if (l == null || !hashSetA132.contains(l)) {
                    }
                }
            }
            arrayListA0t.add(hatchMessageA0K);
            hashSetA13.add(hatchMessageA0K.id);
            String str2 = hatchMessageA0K.serverMessageId;
            if (str2 != null) {
                hashSetA13.add(str2);
            }
            Long l2 = hatchMessageA0K.seq;
            if (l2 != null) {
                hashSetA132.add(l2);
            }
        }
        return arrayListA0t;
    }

    public static final List<HatchMessage> withoutLiveDuplicates(List<HatchMessage> list, List<HatchMessage> list2) {
        AnonymousClass003.A0u(list, list2);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<HatchMessage> it = list2.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(C60Q.A0l(it));
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0i);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchMessage> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = C60Q.A0K(it2).serverMessageId;
            if (str != null) {
                arrayListA0h.add(str);
            }
        }
        Set setA0g2 = AbstractC0878AGe.A0g(arrayListA0h);
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchMessage hatchMessage : list) {
            HatchMessage hatchMessage2 = hatchMessage;
            if (!setA0g.contains(hatchMessage2.id)) {
                C60Q.A1H(hatchMessage2.id, hatchMessage, arrayListA0h2, setA0g2);
            }
        }
        return arrayListA0h2;
    }
}

package com.facebook.aura.conversation.reactions;

import X.A3W;
import X.A6B;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbK;
import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass604;
import X.B3i;
import X.C2273BRq;
import X.C8d6;
import X.C8iN;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class HatchReactionOrderingKt {
    public static /* synthetic */ AHD orderedReactionEmojis$default(Map map, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return orderedReactionEmojis(map, list, i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    public static final AHD<String> orderedReactionEmojis(Map<String, Integer> map, List<String> list, int i, int i2) {
        ?? A1b = AnonymousClass004.A1b(map, list);
        if (i <= 0) {
            return AHI.A01;
        }
        if (i2 < A1b) {
            i2 = 0;
        } else if (i2 > i) {
            i2 = i;
        }
        List listA0a = AbstractC0878AGe.A0a(list, i2);
        AbK abKA0h = AbstractC0878AGe.A0h(list);
        final LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(abKA0h));
        Iterator it = abKA0h.iterator();
        while (it.hasNext()) {
            C2273BRq c2273BRq = (C2273BRq) it.next();
            linkedHashMap.put(c2273BRq.A01, Integer.valueOf(c2273BRq.A00));
        }
        B3i b3iA03 = A6B.A03(new HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$1(listA0a), AbstractC0878AGe.A06(map.entrySet()));
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.conversation.reactions.HatchReactionOrderingKt$orderedReactionEmojis$$inlined$compareByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00((Comparable) ((Map.Entry) t2).getValue(), (Comparable) ((Map.Entry) t).getValue());
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.conversation.reactions.HatchReactionOrderingKt$orderedReactionEmojis$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Integer num = (Integer) linkedHashMap.get(((Map.Entry) t).getKey());
                Integer num2 = num;
                if (num == null) {
                    num2 = Integer.MAX_VALUE;
                }
                Object obj = linkedHashMap.get(((Map.Entry) t2).getKey());
                if (obj == null) {
                    obj = Integer.MAX_VALUE;
                }
                return num2.compareTo((Integer) obj);
            }
        };
        return AGI.A0D(A6B.A07(new A3W(new AnonymousClass604(3), A6B.A06(A6B.A06(AbstractC0878AGe.A06(listA0a), A6B.A08(HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$5.INSTANCE, new C8d6(new Comparator() { // from class: com.facebook.aura.conversation.reactions.HatchReactionOrderingKt$orderedReactionEmojis$$inlined$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00((Comparable) ((Map.Entry) t).getKey(), (Comparable) ((Map.Entry) t2).getKey()) : iCompare;
            }
        }, b3iA03))), new C8iN(list, 0))), i));
    }
}

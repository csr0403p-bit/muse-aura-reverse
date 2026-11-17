package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHD;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HatchCustomReactionKt {
    public static final String HATCH_CUSTOM_REACTION_PREFIX = "hatch:";

    public static final boolean isRenderableReactionToken(String str) {
        C7384Etj.A0Y(str, 0);
        return str.startsWith(HATCH_CUSTOM_REACTION_PREFIX) ? HatchCustomReaction.Companion.fromWireValue(str) != null : HatchReactionDataKt.RENDERABLE_REACTION_EMOJIS.contains(str);
    }

    public static final String reactionAnalyticsValue(String str) {
        C7384Etj.A0Y(str, 0);
        if (HatchCustomReaction.Companion.fromWireValue(str) != null) {
            return str;
        }
        int[] array = str.codePoints().toArray();
        C7384Etj.A0U(array);
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (int i2 : array) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "-");
            }
            sb.append((CharSequence) (anonymousClass1 != null ? anonymousClass1.invoke(Integer.valueOf(i2)) : String.valueOf(i2)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final AHD<String> withCustomReactionsAt(List<String> list, int i, int i2) {
        C7384Etj.A0Y(list, 0);
        List list2 = HatchCustomReaction.userOffered;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((HatchCustomReaction) it.next()).getWireValue());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListA0i) {
            if (!list.contains(obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int iA04 = ATD.A04(i, 0, list.size());
            list = AbstractC0878AGe.A0P(AbstractC0878AGe.A0Z(list, iA04), AbstractC0878AGe.A0P(arrayList, AbstractC0878AGe.A0a(list, iA04)));
        }
        return AGI.A07(AbstractC0878AGe.A0a(list, i2));
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCustomReactionKt$reactionAnalyticsValue$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            String string = Integer.toString(AnonymousClass001.A0F(num), 16);
            C7384Etj.A0U(string);
            return string;
        }

        public final CharSequence invoke(int i) {
            String string = Integer.toString(i, 16);
            C7384Etj.A0U(string);
            return string;
        }
    }
}

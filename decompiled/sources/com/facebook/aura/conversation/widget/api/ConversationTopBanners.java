package com.facebook.aura.conversation.widget.api;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.confidentialvm.view.RecoveryPinPromptBannerProvider;
import com.facebook.aura.graduation.GraduationTopBannerProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class ConversationTopBanners {
    public static final int $stable = 0;
    public static final ConversationTopBanners INSTANCE = new ConversationTopBanners();

    public final List<ConversationTopBanner> banners() {
        ConversationTopBanner conversationTopBannerBanner;
        int[] iArrA1a = AnonymousClass003.A1a();
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        do {
            int i2 = iArrA1a[i];
            if (i2 == 0) {
                conversationTopBannerBanner = RecoveryPinPromptBannerProvider.INSTANCE.banner();
            } else {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                conversationTopBannerBanner = GraduationTopBannerProvider.INSTANCE.banner();
            }
            arrayList.add(conversationTopBannerBanner);
            i++;
        } while (i < 2);
        return AbstractC0878AGe.A0c(arrayList, new Comparator() { // from class: com.facebook.aura.conversation.widget.api.ConversationTopBanners$banners$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((ConversationTopBanner) t2).getRank()).compareTo(Integer.valueOf(((ConversationTopBanner) t).getRank()));
            }
        });
    }
}

package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$17$1$followBottom$2 extends AbstractC7559F3s implements G0U<String, Integer> {
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;

    @Override // X.G0U
    public final Integer invoke(String str) {
        C7384Etj.A0Y(str, 0);
        Iterator itA09 = C1BO.A09(this.$currentItems$delegate);
        int i = 0;
        while (true) {
            if (!itA09.hasNext()) {
                i = -1;
                break;
            }
            if (AnonymousClass007.A1P(str, itA09)) {
                break;
            }
            i++;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$17$1$followBottom$2(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
        super(1);
        this.$currentItems$delegate = c1bo;
    }
}

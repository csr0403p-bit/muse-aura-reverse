package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cG;
import android.icu.text.ListFormatter;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$ShopifyCheckoutApproval$itemNames$2 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$ShopifyCheckoutApproval$itemNames$2(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval) {
        super(0);
        this.this$0 = shopifyCheckoutApproval;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strA0l;
        List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> list = this.this$0.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchAgentPermissionsRepository.ShopifyCheckoutItem> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().name;
            if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
                arrayListA0h.add(strA0l);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return ListFormatter.getInstance(Locale.getDefault()).format(arrayListA0h);
    }
}

package com.facebook.aura.payments.intf;

import X.AbstractC3358CGz;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.List;

/* loaded from: classes.dex */
public interface PaymentIntegration {
    List<PaymentDebugEntry> getDebugEntries();

    PaymentUi getUi();

    boolean handleUrl(String str, Context context, AbstractC3358CGz abstractC3358CGz, String str2, AuraNavigator auraNavigator);
}

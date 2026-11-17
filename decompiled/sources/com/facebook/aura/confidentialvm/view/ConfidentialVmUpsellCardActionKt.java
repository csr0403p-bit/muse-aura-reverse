package com.facebook.aura.confidentialvm.view;

import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.C7384Etj;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ConfidentialVmUpsellCardActionKt {
    public static final String DEVICE_INVOKE_URL_PREFIX = "hatch://devices/invoke/";
    public static final String LEARN_MORE_COMMAND = "confidential_vm.learn_more";
    public static final String UPSELL_CARD_DEDUPE_PREFIX = "chat_cvm_upsell_card:";

    public static final boolean isLearnMoreUrl(String str) {
        if (AnonymousClass005.A1a(str, "hatch://devices/invoke/")) {
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            C7384Etj.A0U(pathSegments);
            if (C7384Etj.areEqual(AbstractC0878AGe.A0A(1, pathSegments), LEARN_MORE_COMMAND)) {
                return true;
            }
        }
        return false;
    }
}

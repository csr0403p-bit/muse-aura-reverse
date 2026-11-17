package com.facebook.aura.devices.intf;

import X.AbstractC3358CGz;
import X.HtJ;

/* loaded from: classes4.dex */
public interface LinkTokenOnlySetup {
    Object holdsSetup(AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super Boolean> htJ);

    boolean isEnabled();

    LinkSetupHandoff prepareHandoff(String str, String str2);
}

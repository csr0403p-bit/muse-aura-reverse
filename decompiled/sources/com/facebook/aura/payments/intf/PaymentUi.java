package com.facebook.aura.payments.intf;

import X.BFM;
import X.BRg;

/* loaded from: classes.dex */
public interface PaymentUi {
    void WalletEntry(BRg bRg, BFM bfm, int i);

    PaymentTerms checkoutTerms(BFM bfm, int i);

    boolean isWalletEntryEnabled();
}

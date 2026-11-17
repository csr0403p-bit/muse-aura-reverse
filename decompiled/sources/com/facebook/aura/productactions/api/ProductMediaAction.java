package com.facebook.aura.productactions.api;

import X.BFM;
import X.BRg;
import X.C20Q;

/* loaded from: classes4.dex */
public interface ProductMediaAction {
    void Content(ProductMediaActionContext productMediaActionContext, BRg bRg, BFM bfm, int i);

    C20Q<Boolean> availability(C20Q<ProductMediaActionInput> c20q);

    String getId();
}

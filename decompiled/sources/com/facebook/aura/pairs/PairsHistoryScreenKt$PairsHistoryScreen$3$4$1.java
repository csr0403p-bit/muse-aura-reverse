package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes3.dex */
public final /* synthetic */ class PairsHistoryScreenKt$PairsHistoryScreen$3$4$1 extends C7438Evz implements G0U<String, ConnectionsSharedLinkTarget> {
    public PairsHistoryScreenKt$PairsHistoryScreen$3$4$1(Object obj) {
        super(1, obj, PairsHistoryViewModel.class, "sharedLinkTarget", "sharedLinkTarget(Ljava/lang/String;)Lcom/facebook/aura/pairs/ConnectionsSharedLinkTarget;", 0);
    }

    @Override // X.G0U
    public final ConnectionsSharedLinkTarget invoke(String str) {
        return ((PairsHistoryViewModel) AnonymousClass006.A0o(str, this)).sharedLinkTarget(str);
    }
}

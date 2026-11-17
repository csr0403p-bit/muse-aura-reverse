package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class ConnectionsTabScreenKt$connectionsSuggestions$3$2$1 extends C7438Evz implements G0U<PairsSuggestion, Unit> {
    public ConnectionsTabScreenKt$connectionsSuggestions$3$2$1(Object obj) {
        super(1, obj, ConnectionsViewModel.class, "shareLink", "shareLink(Lcom/facebook/aura/pairs/PairsSuggestion;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PairsSuggestion pairsSuggestion) {
        ((ConnectionsViewModel) AnonymousClass006.A0o(pairsSuggestion, this)).shareLink(pairsSuggestion);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PairsSuggestion pairsSuggestion) {
        invoke2(pairsSuggestion);
        return Unit.INSTANCE;
    }
}

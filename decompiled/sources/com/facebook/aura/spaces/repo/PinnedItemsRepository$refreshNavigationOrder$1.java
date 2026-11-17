package com.facebook.aura.spaces.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository", f = "PinnedItemsRepository.kt", l = {288}, m = "refreshNavigationOrder-IoAF18A", v = 2)
/* loaded from: classes3.dex */
public final class PinnedItemsRepository$refreshNavigationOrder$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PinnedItemsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedItemsRepository$refreshNavigationOrder$1(PinnedItemsRepository pinnedItemsRepository, HtJ<? super PinnedItemsRepository$refreshNavigationOrder$1> htJ) {
        super(htJ);
        this.this$0 = pinnedItemsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2183refreshNavigationOrderIoAF18A(this));
    }
}

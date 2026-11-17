package com.facebook.aura.spaces.repo;

import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.repo.PinnedItemsRepository$1$1", f = "PinnedItemsRepository.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class PinnedItemsRepository$1$1$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PinnedItemsRepository.AnonymousClass1.C03821<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PinnedItemsRepository$1$1$emit$1(PinnedItemsRepository.AnonymousClass1.C03821<? super T> c03821, HtJ<? super PinnedItemsRepository$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = c03821;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Unit) null, (HtJ<? super Unit>) this);
    }
}

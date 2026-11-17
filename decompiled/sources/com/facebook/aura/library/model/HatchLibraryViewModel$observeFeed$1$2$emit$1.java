package com.facebook.aura.library.model;

import X.HtJ;
import X.HzP;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1$2", f = "HatchLibraryViewModel.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "emit", v = 2)
/* loaded from: classes.dex */
public final class HatchLibraryViewModel$observeFeed$1$2$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchLibraryViewModel.C122641.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryViewModel$observeFeed$1$2$emit$1(HatchLibraryViewModel.C122641.AnonymousClass2<? super T> anonymousClass2, HtJ<? super HatchLibraryViewModel$observeFeed$1$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((FeedSnapshot) null, (HtJ<? super Unit>) this);
    }
}

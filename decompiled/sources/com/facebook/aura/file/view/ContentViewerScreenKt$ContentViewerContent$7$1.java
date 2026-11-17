package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$7$1", f = "ContentViewerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$7$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $requestBack;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$7$1(Function0<Unit> function0, HtJ<? super ContentViewerScreenKt$ContentViewerContent$7$1> htJ) {
        super(2, htJ);
        this.$requestBack = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ContentViewerScreenKt$ContentViewerContent$7$1(this.$requestBack, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        ContentViewerScreenKt.reportViewerNoData("null workspacePath");
        this.$requestBack.invoke();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new ContentViewerScreenKt$ContentViewerContent$7$1(this.$requestBack, htJ).invokeSuspend(Unit.INSTANCE);
    }
}

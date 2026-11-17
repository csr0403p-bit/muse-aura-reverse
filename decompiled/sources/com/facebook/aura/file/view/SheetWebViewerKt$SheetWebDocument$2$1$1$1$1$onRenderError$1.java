package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.SheetWebRenderState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.SheetWebViewerKt$SheetWebDocument$2$1$1$1$1$onRenderError$1", f = "SheetWebViewer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SheetWebViewerKt$SheetWebDocument$2$1$1$1$1$onRenderError$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $message;
    public final /* synthetic */ MutableState<SheetWebRenderState> $renderState$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetWebViewerKt$SheetWebDocument$2$1$1$1$1$onRenderError$1(String str, MutableState<SheetWebRenderState> mutableState, HtJ<? super SheetWebViewerKt$SheetWebDocument$2$1$1$1$1$onRenderError$1> htJ) {
        super(2, htJ);
        this.$message = str;
        this.$renderState$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SheetWebViewerKt$SheetWebDocument$2$1$1$1$1$onRenderError$1(this.$message, this.$renderState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$renderState$delegate.Af8(new SheetWebRenderState.Error(this.$message));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SheetWebViewerKt$SheetWebDocument$2$1$1$1$1$onRenderError$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

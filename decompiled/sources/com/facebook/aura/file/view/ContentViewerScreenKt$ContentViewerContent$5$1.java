package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$5$1", f = "ContentViewerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ ContentViewerViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$5$1(ContentViewerViewModel contentViewerViewModel, String str, HtJ<? super ContentViewerScreenKt$ContentViewerContent$5$1> htJ) {
        super(2, htJ);
        this.$viewModel = contentViewerViewModel;
        this.$relativePath = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ContentViewerScreenKt$ContentViewerContent$5$1(this.$viewModel, this.$relativePath, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$viewModel.onArtifactOpened(this.$relativePath);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ContentViewerScreenKt$ContentViewerContent$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

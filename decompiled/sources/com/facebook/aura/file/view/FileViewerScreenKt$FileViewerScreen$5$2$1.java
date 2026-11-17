package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$5$2$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ MutableState<B6A> $htmlTopColor$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$5$2$1(MutableState<B6A> mutableState) {
        super(1);
        this.$htmlTopColor$delegate = mutableState;
    }

    public final void invoke(int i) {
        this.$htmlTopColor$delegate.Af8(new B6A(i << 32));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

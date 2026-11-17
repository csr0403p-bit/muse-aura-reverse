package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$2", f = "ShoppingProductShare.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ShoppingProductShareKt$prepareProductShare$thumbnailUri$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C10543Hqv<File> $thumbnailFile;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductShareKt$prepareProductShare$thumbnailUri$2(C10543Hqv<File> c10543Hqv, HtJ<? super ShoppingProductShareKt$prepareProductShare$thumbnailUri$2> htJ) {
        super(2, htJ);
        this.$thumbnailFile = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductShareKt$prepareProductShare$thumbnailUri$2(this.$thumbnailFile, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        File file = this.$thumbnailFile.element;
        if (file != null) {
            return Boolean.valueOf(file.delete());
        }
        return null;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new ShoppingProductShareKt$prepareProductShare$thumbnailUri$2(this.$thumbnailFile, htJ).invokeSuspend(Unit.INSTANCE);
    }
}

package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import java.io.File;

/* loaded from: classes3.dex */
public final class PDFContentViewKt$PDFContent$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ File $file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFContentViewKt$PDFContent$1$1(File file) {
        super(1);
        this.$file = file;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new PDFContentViewKt$PDFContent$1$1$invoke$$inlined$onDispose$1(this.$file);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new PDFContentViewKt$PDFContent$1$1$invoke$$inlined$onDispose$1(this.$file);
    }
}

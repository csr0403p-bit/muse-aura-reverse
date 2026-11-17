package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class FileViewerContentKt$EditableTextContent$1$1$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $routeInlineFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileViewerContentKt$EditableTextContent$1$1$1$1(G0U<? super String, Unit> g0u) {
        super(2);
        this.$routeInlineFile = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.$routeInlineFile.invoke(str);
    }
}

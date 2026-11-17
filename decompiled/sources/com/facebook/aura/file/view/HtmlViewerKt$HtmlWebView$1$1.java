package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ MutableState<Boolean> $pageLoaded$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlViewerKt$HtmlWebView$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$pageLoaded$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(MutableState.A0A((MutableState) this.$pageLoaded$delegate));
    }
}

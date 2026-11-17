package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$GridImageCell$imageContent$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasError$delegate;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$GridImageCell$imageContent$1$1$1$1(G0U<? super String, Unit> g0u, String str, MutableState<Boolean> mutableState) {
        super(0);
        this.$onImageError = g0u;
        this.$url = str;
        this.$hasError$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$hasError$delegate;
        float f = HatchInlineImageKt.DefaultInlineImageSize;
        MutableState.A09(true, mutableState);
        G0U<String, Unit> g0u = this.$onImageError;
        if (g0u != null) {
            g0u.invoke(this.$url);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

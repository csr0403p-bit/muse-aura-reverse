package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineVideoThumbnail$content$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Integer> $thumbnailIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineImageKt$HatchInlineVideoThumbnail$content$1$2$2$1(MutableState<Integer> mutableState) {
        super(0);
        this.$thumbnailIndex$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Integer> mutableState = this.$thumbnailIndex$delegate;
        float f = HatchInlineImageKt.DefaultInlineImageSize;
        MutableState.A07(MutableState.A02((MutableState) mutableState) + 1, this.$thumbnailIndex$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

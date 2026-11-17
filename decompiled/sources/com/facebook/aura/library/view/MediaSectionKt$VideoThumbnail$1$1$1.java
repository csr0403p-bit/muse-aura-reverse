package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7197Ei9;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaSectionKt$VideoThumbnail$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Integer> $uriIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSectionKt$VideoThumbnail$1$1$1(MutableState<Integer> mutableState) {
        super(0);
        this.$uriIndex$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Integer> mutableState = this.$uriIndex$delegate;
        C7197Ei9 c7197Ei9 = MediaSectionKt.FIT_CENTER_IMAGE_OPTIONS;
        MutableState.A07(MutableState.A02((MutableState) mutableState) + 1, this.$uriIndex$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

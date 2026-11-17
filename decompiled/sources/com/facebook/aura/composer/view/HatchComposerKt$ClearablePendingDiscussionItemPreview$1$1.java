package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.HuJ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ClearablePendingDiscussionItemPreview$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $focusAttachButtonAfterPreview$delegate;
    public final /* synthetic */ Function0<Unit> $onClearClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ClearablePendingDiscussionItemPreview$1$1(Function0<Unit> function0, Context context, MutableState<Boolean> mutableState) {
        super(0);
        this.$onClearClick = function0;
        this.$context = context;
        this.$focusAttachButtonAfterPreview$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onClearClick.invoke();
        MutableState.A09(HuJ.A00(this.$context), this.$focusAttachButtonAfterPreview$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

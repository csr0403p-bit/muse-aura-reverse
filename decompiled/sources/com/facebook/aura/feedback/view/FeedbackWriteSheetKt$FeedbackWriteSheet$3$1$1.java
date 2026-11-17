package com.facebook.aura.feedback.view;

import X.AbstractC7559F3s;
import X.BQG;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedbackWriteSheetKt$FeedbackWriteSheet$3$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $reason$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$reason$delegate.Af8(BQG.A17(str, 600));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackWriteSheetKt$FeedbackWriteSheet$3$1$1(MutableState<String> mutableState) {
        super(1);
        this.$reason$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

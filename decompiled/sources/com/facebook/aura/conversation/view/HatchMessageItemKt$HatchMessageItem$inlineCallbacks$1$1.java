package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$inlineCallbacks$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ MutableState<String> $inlineMediaViewerUrl$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.$inlineMediaViewerUrl$delegate.Af8(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$inlineCallbacks$1$1(MutableState<String> mutableState) {
        super(2);
        this.$inlineMediaViewerUrl$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}

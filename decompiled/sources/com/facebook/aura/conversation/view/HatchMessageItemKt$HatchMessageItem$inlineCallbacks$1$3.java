package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$inlineCallbacks$1$3 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ MutableState<String> $inlineFileViewerName$delegate;
    public final /* synthetic */ MutableState<String> $inlineFileViewerUrl$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageItemKt$HatchMessageItem$inlineCallbacks$1$3(MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(2);
        this.$inlineFileViewerUrl$delegate = mutableState;
        this.$inlineFileViewerName$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.$inlineFileViewerUrl$delegate.Af8(str);
        this.$inlineFileViewerName$delegate.Af8(str2);
    }
}

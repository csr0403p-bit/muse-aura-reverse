package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$2$1$1 extends C7438Evz implements G0U<String, Unit> {
    public SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$2$1$1(Object obj) {
        super(1, obj, SpaceCollaboratorPickerViewModel.class, "onQueryChange", "onQueryChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((SpaceCollaboratorPickerViewModel) AnonymousClass006.A0o(str, this)).onQueryChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

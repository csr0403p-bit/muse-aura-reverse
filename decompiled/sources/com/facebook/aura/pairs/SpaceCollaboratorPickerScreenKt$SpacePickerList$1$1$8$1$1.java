package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$8$1$1 extends C7438Evz implements G0U<SpacePickerPerson, Unit> {
    public SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$8$1$1(Object obj) {
        super(1, obj, SpaceCollaboratorPickerViewModel.class, "toggle", "toggle(Lcom/facebook/aura/pairs/SpacePickerPerson;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SpacePickerPerson spacePickerPerson) {
        ((SpaceCollaboratorPickerViewModel) AnonymousClass006.A0o(spacePickerPerson, this)).toggle(spacePickerPerson);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SpacePickerPerson spacePickerPerson) {
        invoke2(spacePickerPerson);
        return Unit.INSTANCE;
    }
}

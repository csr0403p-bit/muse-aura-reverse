package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorPickerScreenKt$SpacePickerRow$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<SpacePickerPerson, Unit> $onToggle;
    public final /* synthetic */ SpacePickerPerson $person;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceCollaboratorPickerScreenKt$SpacePickerRow$1$2$1(G0U<? super SpacePickerPerson, Unit> g0u, SpacePickerPerson spacePickerPerson) {
        super(0);
        this.$onToggle = g0u;
        this.$person = spacePickerPerson;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onToggle.invoke(this.$person);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorPickerScreenKt$SpacePickerPhoto$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ SpacePickerPerson $person;
    public final /* synthetic */ boolean $showBadge;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorPickerScreenKt$SpacePickerPhoto$2(SpacePickerPerson spacePickerPerson, float f, boolean z, BRg bRg, int i, int i2) {
        super(2);
        this.$person = spacePickerPerson;
        this.$size = f;
        this.$showBadge = z;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        SpaceCollaboratorPickerScreenKt.m1681SpacePickerPhotoDzVHIIc(this.$person, this.$size, this.$showBadge, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

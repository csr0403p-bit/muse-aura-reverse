package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import com.facebook.aura.library.repo.GoalAssociation;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalAssociationUiKt$GoalAssociationLeadingIcon$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ GoalAssociation $association;
    public final /* synthetic */ C1DM $frameShape;
    public final /* synthetic */ float $frameSize;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalAssociationUiKt$GoalAssociationLeadingIcon$2(GoalAssociation goalAssociation, BRg bRg, float f, C1DM c1dm, int i, int i2) {
        super(2);
        this.$association = goalAssociation;
        this.$modifier = bRg;
        this.$frameSize = f;
        this.$frameShape = c1dm;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        GoalAssociationUiKt.m1149GoalAssociationLeadingIcon942rkJo(this.$association, this.$modifier, this.$frameSize, this.$frameShape, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

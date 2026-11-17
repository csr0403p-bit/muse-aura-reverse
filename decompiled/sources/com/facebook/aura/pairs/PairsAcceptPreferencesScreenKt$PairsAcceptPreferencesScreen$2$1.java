package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$2$1 extends AbstractC7559F3s implements G0U<PairsContact, Unit> {
    public final /* synthetic */ MutableState<PairsContact> $alreadyPaired$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PairsContact pairsContact) {
        C7384Etj.A0Y(pairsContact, 0);
        this.$alreadyPaired$delegate.Af8(pairsContact);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$2$1(MutableState<PairsContact> mutableState) {
        super(1);
        this.$alreadyPaired$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PairsContact pairsContact) {
        invoke2(pairsContact);
        return Unit.INSTANCE;
    }
}

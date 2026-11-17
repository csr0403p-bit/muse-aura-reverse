package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvField$1$5$1 extends AbstractC7559F3s implements G0U<C1805ArO, Unit> {
    public final /* synthetic */ C1805ArO $fieldValue;
    public final /* synthetic */ MutableState<C1805ArO> $lastEdit$delegate;
    public final /* synthetic */ G0U<String, Unit> $onChange;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1805ArO c1805ArO) {
        C7384Etj.A0Y(c1805ArO, 0);
        C1805ArO c1805ArORetargetingSeparatorBackspace = HatchCardCaretKt.retargetingSeparatorBackspace(c1805ArO, this.$fieldValue);
        this.$lastEdit$delegate.Af8(c1805ArORetargetingSeparatorBackspace);
        this.$onChange.invoke(c1805ArORetargetingSeparatorBackspace.A01.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryScreenKt$CcvField$1$5$1(C1805ArO c1805ArO, G0U<? super String, Unit> g0u, MutableState<C1805ArO> mutableState) {
        super(1);
        this.$fieldValue = c1805ArO;
        this.$onChange = g0u;
        this.$lastEdit$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1805ArO c1805ArO) {
        invoke2(c1805ArO);
        return Unit.INSTANCE;
    }
}

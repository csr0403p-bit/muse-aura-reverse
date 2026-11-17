package com.facebook.aura.email.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.C1DG;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailLoadedThread$1$1$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ MutableState<C1DG> $actionsHeight$delegate;
    public final /* synthetic */ AXN $density;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailLoadedThread$1$1$1$1(AXN axn, MutableState<C1DG> mutableState) {
        super(1);
        this.$density = axn;
        this.$actionsHeight$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m762invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m762invokeozmzZPI(long j) {
        C1DG.A06(this.$density.Agy(AnonymousClass002.A09(j)), this.$actionsHeight$delegate);
    }
}

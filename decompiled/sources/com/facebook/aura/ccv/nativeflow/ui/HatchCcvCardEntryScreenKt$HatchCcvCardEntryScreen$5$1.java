package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.C78N;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$5$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $dismissLabel;
    public final /* synthetic */ Function0<Unit> $onSubmitErrorDismissClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$5$1(String str, Function0<Unit> function0) {
        super(2);
        this.$dismissLabel = str;
        this.$onSubmitErrorDismissClick = function0;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$onSubmitErrorDismissClick, bfm.A65(this.$dismissLabel));
        String str = this.$dismissLabel;
        Function0<Unit> function0 = this.$onSubmitErrorDismissClick;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$5$1$1$1(str, function0);
            bfm.Ai0(objAaT);
        }
        AnonymousClass007.A14(bfm, objAaT);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

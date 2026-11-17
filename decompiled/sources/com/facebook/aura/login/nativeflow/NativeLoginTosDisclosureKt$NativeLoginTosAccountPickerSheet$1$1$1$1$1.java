package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C10G;
import X.C78N;
import X.G0U;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ NativeLoginAccountUiModel $account;
    public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1$1$1$1$1(NativeLoginAccountUiModel nativeLoginAccountUiModel, G0U<? super NativeLoginAccountUiModel, Unit> g0u) {
        super(3);
        this.$account = nativeLoginAccountUiModel;
        this.$onSelect = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$account;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$account, bfm.A65(this.$onSelect));
            G0U<NativeLoginAccountUiModel, Unit> g0u = this.$onSelect;
            NativeLoginAccountUiModel nativeLoginAccountUiModel2 = this.$account;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1$1$1$1$1$1$1(g0u, nativeLoginAccountUiModel2);
                bfm.Ai0(objAaT);
            }
            NativeLoginAccountRowKt.NativeLoginAccountRow(nativeLoginAccountUiModel, (Function0) objAaT, C10G.A02, false, false, null, null, false, bfm, NativeLoginAccountUiModel.$stable | 384, 248);
            return;
        }
        bfm.Afo();
    }
}

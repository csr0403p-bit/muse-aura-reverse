package com.facebook.aura.settings;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C10G;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActivationSettingsScreenKt$ActivationLogOutSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onClick;

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationLogOutSection$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702);
                BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "hatch-log-out-button");
                boolean zA65 = bfm.A65(this.$onClick);
                Function0<Unit> function0 = this.$onClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchActivationSettingsScreenKt$ActivationLogOutSection$1$1$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsCardsKt.HatchSettingsActionCard(strA01, (Function0) objAaT, bRgA00, true, bfm, 3456, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$onClick), -1570099961);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivationSettingsScreenKt$ActivationLogOutSection$1$1(Function0<Unit> function0) {
        super(1);
        this.$onClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

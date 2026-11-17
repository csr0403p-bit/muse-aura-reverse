package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C1062ATq;
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
public final class HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
    public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
    public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onHelpSupportSettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120701);
                C1062ATq c1062ATq = C10G.A02;
                Integer numValueOf = Integer.valueOf(R.drawable.circle_question_wght400_outline_24);
                boolean zA65 = bfm.A65(this.$onHelpSupportSettingsClick);
                Function0<Unit> function0 = this.$onHelpSupportSettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, numValueOf, (Function0) objAaT, c1062ATq, null, bfm, 3072, 16);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(3);
            this.$onDataPrivacySettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee7);
                C1062ATq c1062ATq = C10G.A02;
                Integer numValueOf = Integer.valueOf(R.drawable.circle_info_wght400_outline_24);
                boolean zA65 = bfm.A65(this.$onDataPrivacySettingsClick);
                Function0<Unit> function0 = this.$onDataPrivacySettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$2$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, numValueOf, (Function0) objAaT, c1062ATq, null, bfm, 3072, 16);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0) {
            super(3);
            this.$onLegalSafetySettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f13);
                C1062ATq c1062ATq = C10G.A02;
                Integer numValueOf = Integer.valueOf(R.drawable.shield_check_wght400_outline_24);
                boolean zA65 = bfm.A65(this.$onLegalSafetySettingsClick);
                Function0<Unit> function0 = this.$onLegalSafetySettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1$3$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, numValueOf, (Function0) objAaT, c1062ATq, null, bfm, 3072, 16);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$onHelpSupportSettingsClick), -1334673713);
        Function0<Unit> function0 = this.$onDataPrivacySettingsClick;
        if (function0 != null) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(function0), -96452140);
        }
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass3(this.$onLegalSafetySettingsClick), 1179858296);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$onDataPrivacySettingsClick = function0;
        this.$onHelpSupportSettingsClick = function02;
        this.$onLegalSafetySettingsClick = function03;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

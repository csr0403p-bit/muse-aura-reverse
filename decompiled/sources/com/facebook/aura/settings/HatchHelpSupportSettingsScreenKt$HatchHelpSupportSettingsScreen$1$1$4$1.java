package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$4$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onSubmitReport;
    public final /* synthetic */ int $shakeTitleRes;

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onSubmitReport;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onSubmitReport = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchHelpSupportSettingsScreenKt.ReportAnIssueCard(this.$onSubmitReport, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ int $shakeTitleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(3);
            this.$shakeTitleRes = i;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchHelpSupportSettingsScreenKt.ShakeToReportCard(this.$shakeTitleRes, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Function0<Unit> function0 = this.$onSubmitReport;
        if (function0 != null) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(function0), 1434634440);
        }
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$shakeTitleRes), 1137691373);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$4$1(Function0<Unit> function0, int i) {
        super(1);
        this.$onSubmitReport = function0;
        this.$shakeTitleRes = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

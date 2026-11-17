package com.facebook.aura.bugreport;

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
public final class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsSection$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $includeLogs;
    public final /* synthetic */ G0U<Boolean, Unit> $onIncludeLogsChange;
    public final /* synthetic */ Function0<Unit> $onViewLogs;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsSection$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $includeLogs;
        public final /* synthetic */ G0U<Boolean, Unit> $onIncludeLogsChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, G0U<? super Boolean, Unit> g0u) {
            super(3);
            this.$includeLogs = z;
            this.$onIncludeLogsChange = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraBugReportDiagnosticLogsKt.IncludeLogsToggleRow(this.$includeLogs, this.$onIncludeLogsChange, null, bfm, 0, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsSection$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onViewLogs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(3);
            this.$onViewLogs = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraBugReportDiagnosticLogsKt.ViewLogsRow(this.$onViewLogs, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$includeLogs, this.$onIncludeLogsChange), -39833723);
        Function0<Unit> function0 = this.$onViewLogs;
        if (function0 != null) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(function0), 596559690);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsSection$1$1$1(Function0<Unit> function0, boolean z, G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$onViewLogs = function0;
        this.$includeLogs = z;
        this.$onIncludeLogsChange = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

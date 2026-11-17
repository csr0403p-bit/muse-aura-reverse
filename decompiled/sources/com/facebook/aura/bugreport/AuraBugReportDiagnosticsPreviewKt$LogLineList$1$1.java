package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C0CD;
import X.C10G;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.G2j;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ float $gutterWidth;
    public final /* synthetic */ C1822Arm $lineStyle;
    public final /* synthetic */ SnapshotStateList<LogLine> $lines;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$topPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$topPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<LogLine, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(LogLine logLine) {
            C7384Etj.A0Y(logLine, 0);
            return Integer.valueOf(logLine.id);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(float f) {
            super(3);
            this.$bottomPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$bottomPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("top_inset", "inset", B1V.A01(new AnonymousClass1(this.$topPadding), 1614269866, true));
        final SnapshotStateList<LogLine> snapshotStateList = this.$lines;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        final float f = this.$gutterWidth;
        final C1822Arm c1822Arm = this.$lineStyle;
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1$invoke$$inlined$items$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(snapshotStateList, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1$invoke$$inlined$items$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(snapshotStateList, anonymousClass3, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1$invoke$$inlined$items$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                LogLine logLine = (LogLine) snapshotStateList.get(i);
                bfm.AgE(1081018383);
                AuraTextKt.m2639AuraTextUY9GdpU(logLine.text, C3U4.A0B(C10G.A02, f, AuraBugReportDiagnosticsPreviewKt.LOG_LINE_SPACING), 0L, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), snapshotStateList.size());
        c0cd.APJ("bottom_inset", "inset", B1V.A01(new AnonymousClass5(this.$bottomPadding), -1132533791, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1(SnapshotStateList<LogLine> snapshotStateList, float f, float f2, C1822Arm c1822Arm, float f3) {
        super(1);
        this.$lines = snapshotStateList;
        this.$topPadding = f;
        this.$gutterWidth = f2;
        this.$lineStyle = c1822Arm;
        this.$bottomPadding = f3;
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<LogLine, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LogLine logLine) {
            return "log_line";
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(LogLine logLine) {
            return "log_line";
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}

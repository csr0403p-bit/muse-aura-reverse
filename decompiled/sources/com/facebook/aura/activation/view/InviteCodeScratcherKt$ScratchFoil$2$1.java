package com.facebook.aura.activation.view;

import X.ART;
import X.ASR;
import X.AST;
import X.AWx;
import X.AbstractC7559F3s;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C1EQ;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class InviteCodeScratcherKt$ScratchFoil$2$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ long $plate;
    public final /* synthetic */ SnapshotStateList<AWx> $scratchPoints;
    public final /* synthetic */ long $sheen;

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$ScratchFoil$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
        public final /* synthetic */ C1EQ $brush;
        public final /* synthetic */ float $radiusPx;
        public final /* synthetic */ SnapshotStateList<AWx> $scratchPoints;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C16Z c16z) {
            C7384Etj.A0Y(c16z, 0);
            C1EQ c1eq = this.$brush;
            long jA00 = ART.A00(c16z.AKb(), 0L);
            C16a c16a = C16a.A00;
            c16z.A9f(c1eq, null, c16a, 1.0f, 3, 0L, jA00);
            c16z.A9O();
            SnapshotStateList<AWx> snapshotStateList = this.$scratchPoints;
            float f = this.$radiusPx;
            Iterator it = snapshotStateList.iterator();
            while (it.hasNext()) {
                c16z.A9N(null, c16a, f, 1.0f, 0, B6A.A06, ((AWx) it.next()).A00);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1EQ c1eq, SnapshotStateList<AWx> snapshotStateList, float f) {
            super(1);
            this.$brush = c1eq;
            this.$scratchPoints = snapshotStateList;
            this.$radiusPx = f;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
            invoke2(c16z);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        C7384Etj.A0Y(ast, 0);
        long j = this.$plate;
        return ast.A01(new AnonymousClass1(C1EQ.A00(Arrays.asList(new B6A(j), new B6A(this.$sheen), new B6A(j)), 0.0f, Float.POSITIVE_INFINITY), this.$scratchPoints, InviteCodeScratcherKt.ScratchRadius * ast.AEm()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratcherKt$ScratchFoil$2$1(long j, long j2, SnapshotStateList<AWx> snapshotStateList) {
        super(1);
        this.$plate = j;
        this.$sheen = j2;
        this.$scratchPoints = snapshotStateList;
    }
}

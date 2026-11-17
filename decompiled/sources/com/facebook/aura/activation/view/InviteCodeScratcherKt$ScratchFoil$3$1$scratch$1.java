package com.facebook.aura.activation.view;

import X.AWx;
import X.AaN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.BRr;
import X.F1F;
import X.G0U;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class InviteCodeScratcherKt$ScratchFoil$3$1$scratch$1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
    public final /* synthetic */ float $coverageRadiusPx;
    public final /* synthetic */ InviteCodeScratchDebrisState $debrisState;
    public final /* synthetic */ Function0<Unit> $onReveal;
    public final /* synthetic */ boolean $reduceMotion;
    public final /* synthetic */ float $revealAt;
    public final /* synthetic */ F1F $revealTriggered;
    public final /* synthetic */ SnapshotStateList<AWx> $scratchPoints;
    public final /* synthetic */ Set<Integer> $scratchedCells;
    public final /* synthetic */ BRr $this_pointerInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratcherKt$ScratchFoil$3$1$scratch$1(F1F f1f, SnapshotStateList<AWx> snapshotStateList, InviteCodeScratchDebrisState inviteCodeScratchDebrisState, boolean z, Set<Integer> set, BRr bRr, float f, float f2, Function0<Unit> function0) {
        super(1);
        this.$revealTriggered = f1f;
        this.$scratchPoints = snapshotStateList;
        this.$debrisState = inviteCodeScratchDebrisState;
        this.$reduceMotion = z;
        this.$scratchedCells = set;
        this.$this_pointerInput = bRr;
        this.$coverageRadiusPx = f;
        this.$revealAt = f2;
        this.$onReveal = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
        m156invokek4lQ0M(aWx.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m156invokek4lQ0M(long j) {
        if (this.$revealTriggered.element) {
            return;
        }
        this.$scratchPoints.add(new AWx(j));
        this.$debrisState.m148emitScratch3MmeM6k(j, this.$reduceMotion);
        InviteCodeScratcherKt.m152addCellsAroundOXOWCTw(this.$scratchedCells, j, ((AaN) this.$this_pointerInput).A00, this.$coverageRadiusPx);
        if (this.$scratchedCells.size() >= this.$revealAt) {
            this.$revealTriggered.element = true;
            this.$debrisState.m147emitRevealXnVDows(AnonymousClass005.A0M((int) (r1 >> 32), (int) (r1 & 4294967295L)), InviteCodeScratcherKt.m155uncoveredCellCentersO0kMr_c(this.$scratchedCells, ((AaN) this.$this_pointerInput).A00), InviteCodeScratcherKt.m153coverageCellSizeozmzZPI(((AaN) this.$this_pointerInput).A00), this.$reduceMotion);
            this.$onReveal.invoke();
        }
    }
}

package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BLU;
import X.C0981AMm;
import X.C2LD;
import X.C2ae;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometryKt$trackFloatingChromeObstacle$tracked$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ C0981AMm<Object, BLU> $bounds;
    public final /* synthetic */ Function0<C2ae> $obstacleOffset;
    public final /* synthetic */ Object $owner;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        C0981AMm<Object, BLU> c0981AMm = this.$bounds;
        Object obj = this.$owner;
        BLU windowRect = HatchFloatingChromeGeometryKt.getWindowRect(c2ld);
        long j = this.$obstacleOffset.invoke().A00;
        int i = (int) (j >> 32);
        int i2 = windowRect.A01 + i;
        int i3 = windowRect.A03;
        int iA09 = AnonymousClass002.A09(j);
        c0981AMm.put(obj, new BLU(i2, i3 + iA09, windowRect.A02 + i, windowRect.A00 + iA09));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFloatingChromeGeometryKt$trackFloatingChromeObstacle$tracked$1$1(C0981AMm<Object, BLU> c0981AMm, Object obj, Function0<C2ae> function0) {
        super(1);
        this.$bounds = c0981AMm;
        this.$owner = obj;
        this.$obstacleOffset = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}

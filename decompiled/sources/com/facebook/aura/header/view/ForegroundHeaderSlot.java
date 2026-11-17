package com.facebook.aura.header.view;

import X.AGE;
import X.AGF;
import X.AYL;
import X.AnonymousClass005;
import X.BFM;
import X.BL4;
import X.BLU;
import X.C1HY;
import X.C3TH;
import X.C5303Dfm;
import X.C7384Etj;
import X.EnumC10573Huf;
import X.G0W;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ForegroundHeaderSlot {
    public static final int $stable = 0;
    public final MutableState bounds$delegate;
    public final MutableState constraints$delegate;
    public final G0W<Boolean, BFM, Integer, Unit> content;
    public final C3TH horizontalAlignment;
    public final MutableState lifecycleState$delegate;
    public final C1HY owner;
    public final MutableState size$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public ForegroundHeaderSlot(C1HY c1hy, C3TH c3th, G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w) {
        AnonymousClass005.A10(c1hy, c3th, g0w);
        this.owner = c1hy;
        this.horizontalAlignment = c3th;
        this.content = g0w;
        EnumC10573Huf enumC10573Huf = ((C5303Dfm) c1hy.getLifecycle()).A01;
        AGE ageA01 = AGF.A01();
        this.lifecycleState$delegate = new ParcelableSnapshotMutableState(ageA01, enumC10573Huf);
        this.constraints$delegate = new ParcelableSnapshotMutableState(ageA01, new Constraints(AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE)));
        this.size$delegate = new ParcelableSnapshotMutableState(ageA01, new BL4(0L));
        this.bounds$delegate = new ParcelableSnapshotMutableState(ageA01, BLU.A04);
    }

    public final void setBounds(BLU blu) {
        C7384Etj.A0Y(blu, 0);
        this.bounds$delegate.Af8(blu);
    }

    public final void setLifecycleState(EnumC10573Huf enumC10573Huf) {
        C7384Etj.A0Y(enumC10573Huf, 0);
        this.lifecycleState$delegate.Af8(enumC10573Huf);
    }

    public final BLU getBounds() {
        return (BLU) this.bounds$delegate.getValue();
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m981getConstraintsmsEJaDk() {
        return ((Constraints) this.constraints$delegate.getValue()).A00;
    }

    public final G0W<Boolean, BFM, Integer, Unit> getContent() {
        return this.content;
    }

    public final C3TH getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final EnumC10573Huf getLifecycleState() {
        return (EnumC10573Huf) this.lifecycleState$delegate.getValue();
    }

    public final C1HY getOwner() {
        return this.owner;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m982getSizeYbymL2g() {
        return ((BL4) this.size$delegate.getValue()).A00;
    }

    /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
    public final void m983setConstraintsBRTryo0(long j) {
        this.constraints$delegate.Af8(new Constraints(j));
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    public final void m984setSizeozmzZPI(long j) {
        this.size$delegate.Af8(new BL4(j));
    }
}

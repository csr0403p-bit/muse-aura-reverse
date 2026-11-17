package com.facebook.aura.ui;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes2.dex */
public final class DragSettlement extends C06G {
    public static final int $stable = 8;
    public final float destinationTop;
    public final Object draggedKey;
    public final DragSettlementPhase phase;
    public final float releaseTop;
    public final long session;
    public final Set<Object> settlingKeys;
    public final Object sourceHostKey;
    public final Float sourceTopInHost;

    public DragSettlement(long j, Object obj, float f, float f2, Object obj2, Float f3, Set<? extends Object> set, DragSettlementPhase dragSettlementPhase) {
        C7384Etj.A0Y(obj, 1);
        AnonymousClass003.A10(set, dragSettlementPhase);
        this.session = j;
        this.draggedKey = obj;
        this.releaseTop = f;
        this.destinationTop = f2;
        this.sourceHostKey = obj2;
        this.sourceTopInHost = f3;
        this.settlingKeys = set;
        this.phase = dragSettlementPhase;
    }

    public final DragSettlement copy(long j, Object obj, float f, float f2, Object obj2, Float f3, Set<? extends Object> set, DragSettlementPhase dragSettlementPhase) {
        C7384Etj.A0Y(obj, 1);
        AnonymousClass003.A10(set, dragSettlementPhase);
        return new DragSettlement(j, obj, f, f2, obj2, f3, set, dragSettlementPhase);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DragSettlement) {
                DragSettlement dragSettlement = (DragSettlement) obj;
                if (this.session != dragSettlement.session || !C7384Etj.areEqual(this.draggedKey, dragSettlement.draggedKey) || Float.compare(this.releaseTop, dragSettlement.releaseTop) != 0 || Float.compare(this.destinationTop, dragSettlement.destinationTop) != 0 || !C7384Etj.areEqual(this.sourceHostKey, dragSettlement.sourceHostKey) || !C7384Etj.areEqual(this.sourceTopInHost, dragSettlement.sourceTopInHost) || !C7384Etj.areEqual(this.settlingKeys, dragSettlement.settlingKeys) || this.phase != dragSettlement.phase) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DragSettlement copy$default(DragSettlement dragSettlement, long j, Object obj, float f, float f2, Object obj2, Float f3, Set set, DragSettlementPhase dragSettlementPhase, int i, Object obj3) {
        if ((i & 1) != 0) {
            j = dragSettlement.session;
        }
        if ((i & 2) != 0) {
            obj = dragSettlement.draggedKey;
        }
        if ((i & 4) != 0) {
            f = dragSettlement.releaseTop;
        }
        if ((i & 8) != 0) {
            f2 = dragSettlement.destinationTop;
        }
        if ((i & 16) != 0) {
            obj2 = dragSettlement.sourceHostKey;
        }
        if ((i & 32) != 0) {
            f3 = dragSettlement.sourceTopInHost;
        }
        if ((i & 64) != 0) {
            set = dragSettlement.settlingKeys;
        }
        if ((i & 128) != 0) {
            dragSettlementPhase = dragSettlement.phase;
        }
        return dragSettlement.copy(j, obj, f, f2, obj2, f3, set, dragSettlementPhase);
    }

    public final long component1() {
        return this.session;
    }

    public final Object component2() {
        return this.draggedKey;
    }

    public final float component3() {
        return this.releaseTop;
    }

    public final float component4() {
        return this.destinationTop;
    }

    public final Object component5() {
        return this.sourceHostKey;
    }

    public final Float component6() {
        return this.sourceTopInHost;
    }

    public final Set<Object> component7() {
        return this.settlingKeys;
    }

    public final DragSettlementPhase component8() {
        return this.phase;
    }

    public final float getDestinationTop() {
        return this.destinationTop;
    }

    public final Object getDraggedKey() {
        return this.draggedKey;
    }

    public final DragSettlementPhase getPhase() {
        return this.phase;
    }

    public final float getReleaseTop() {
        return this.releaseTop;
    }

    public final long getSession() {
        return this.session;
    }

    public final Set<Object> getSettlingKeys() {
        return this.settlingKeys;
    }

    public final Object getSourceHostKey() {
        return this.sourceHostKey;
    }

    public final Float getSourceTopInHost() {
        return this.sourceTopInHost;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.phase, AnonymousClass005.A0F(this.settlingKeys, (((AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.draggedKey, C3cI.A01(this.session)), this.releaseTop), this.destinationTop) + AnonymousClass006.A0D(this.sourceHostKey)) * 31) + C3cH.A02(this.sourceTopInHost)) * 31));
    }

    public String toString() {
        return super.toString();
    }
}

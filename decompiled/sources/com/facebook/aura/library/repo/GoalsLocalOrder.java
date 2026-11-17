package com.facebook.aura.library.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C7384Etj;
import X.InterfaceC0962AJp;

/* loaded from: classes2.dex */
public final class GoalsLocalOrder extends C06G {
    public final InterfaceC0962AJp<String, String> nested;
    public final InterfaceC0962AJp<String, GoalListSection> promoted;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsLocalOrder) {
                GoalsLocalOrder goalsLocalOrder = (GoalsLocalOrder) obj;
                if (!C7384Etj.areEqual(this.promoted, goalsLocalOrder.promoted) || !C7384Etj.areEqual(this.nested, goalsLocalOrder.nested)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalsLocalOrder copy$default(GoalsLocalOrder goalsLocalOrder, InterfaceC0962AJp interfaceC0962AJp, InterfaceC0962AJp interfaceC0962AJp2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC0962AJp = goalsLocalOrder.promoted;
        }
        if ((i & 2) != 0) {
            interfaceC0962AJp2 = goalsLocalOrder.nested;
        }
        AnonymousClass003.A0u(interfaceC0962AJp, interfaceC0962AJp2);
        return new GoalsLocalOrder(interfaceC0962AJp, interfaceC0962AJp2);
    }

    public final InterfaceC0962AJp<String, GoalListSection> component1() {
        return this.promoted;
    }

    public final InterfaceC0962AJp<String, String> component2() {
        return this.nested;
    }

    public final InterfaceC0962AJp<String, String> getNested() {
        return this.nested;
    }

    public final InterfaceC0962AJp<String, GoalListSection> getPromoted() {
        return this.promoted;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.nested, AnonymousClass005.A0E(this.promoted));
    }

    public final boolean isEmpty() {
        return this.promoted.isEmpty() && this.nested.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoalsLocalOrder(InterfaceC0962AJp<String, ? extends GoalListSection> interfaceC0962AJp, InterfaceC0962AJp<String, String> interfaceC0962AJp2) {
        AnonymousClass003.A0u(interfaceC0962AJp, interfaceC0962AJp2);
        this.promoted = interfaceC0962AJp;
        this.nested = interfaceC0962AJp2;
    }

    public final GoalsLocalOrder copy(InterfaceC0962AJp<String, ? extends GoalListSection> interfaceC0962AJp, InterfaceC0962AJp<String, String> interfaceC0962AJp2) {
        AnonymousClass003.A0u(interfaceC0962AJp, interfaceC0962AJp2);
        return new GoalsLocalOrder(interfaceC0962AJp, interfaceC0962AJp2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalsLocalOrder(InterfaceC0962AJp interfaceC0962AJp, InterfaceC0962AJp interfaceC0962AJp2, int i, C06H c06h) {
        this((i & 1) != 0 ? C0953AJg.A00() : interfaceC0962AJp, (i & 2) != 0 ? C0953AJg.A00() : interfaceC0962AJp2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GoalsLocalOrder() {
        C0953AJg c0953AJgA00 = C0953AJg.A00();
        this(c0953AJgA00, c0953AJgA00);
    }
}

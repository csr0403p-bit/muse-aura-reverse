package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class RedactedItems {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int items;
    public RedactedValueKind kind;

    public RedactedItems(RedactedValueKind redactedValueKind, int i) {
        C7384Etj.A0Y(redactedValueKind, 0);
        this.kind = redactedValueKind;
        this.items = i;
    }

    /* renamed from: copy-Qn1smSk, reason: not valid java name */
    public final RedactedItems m3705copyQn1smSk(RedactedValueKind redactedValueKind, int i) {
        C7384Etj.A0Y(redactedValueKind, 0);
        return new RedactedItems(redactedValueKind, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RedactedItems) {
                RedactedItems redactedItems = (RedactedItems) obj;
                if (this.kind != redactedItems.kind || this.items != redactedItems.items) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setKind(RedactedValueKind redactedValueKind) {
        C7384Etj.A0Y(redactedValueKind, 0);
        this.kind = redactedValueKind;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-Qn1smSk$default, reason: not valid java name */
    public static /* synthetic */ RedactedItems m3703copyQn1smSk$default(RedactedItems redactedItems, RedactedValueKind redactedValueKind, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            redactedValueKind = redactedItems.kind;
        }
        if ((i2 & 2) != 0) {
            i = redactedItems.items;
        }
        C7384Etj.A0Y(redactedValueKind, 0);
        return new RedactedItems(redactedValueKind, i);
    }

    public final RedactedValueKind component1() {
        return this.kind;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3704component2pVg5ArA() {
        return this.items;
    }

    /* renamed from: getItems-pVg5ArA, reason: not valid java name */
    public final int m3706getItemspVg5ArA() {
        return this.items;
    }

    public final RedactedValueKind getKind() {
        return this.kind;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.kind) + this.items;
    }

    /* renamed from: setItems-WZ4Q5Ns, reason: not valid java name */
    public final void m3707setItemsWZ4Q5Ns(int i) {
        this.items = i;
    }

    public String toString() {
        return C3cJ.A0N(", items=", String.valueOf(BV4.A03(this.items)), C3cG.A0f(this.kind, "RedactedItems(kind="));
    }

    public /* synthetic */ RedactedItems(RedactedValueKind redactedValueKind, int i, C06H c06h) {
        this(redactedValueKind, i);
    }
}

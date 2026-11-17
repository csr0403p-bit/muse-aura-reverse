package com.facebook.aura.agentpermission;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutAmountPresentation extends C06G {
    public static final int $stable = 8;
    public final String amount;
    public final List<CheckoutAmountPresentation> children;
    public final String currency;
    public final boolean dueAtPropertyNote;
    public final boolean emphasized;
    public final CheckoutAmountLabel label;
    public final CheckoutAmountLayout layout;
    public final String providedLabel;
    public final boolean subdued;

    public final CheckoutAmountPresentation copy(CheckoutAmountLabel checkoutAmountLabel, String str, String str2, String str3, boolean z, CheckoutAmountLayout checkoutAmountLayout, boolean z2, boolean z3, List<CheckoutAmountPresentation> list) {
        AnonymousClass002.A1D(checkoutAmountLabel, 0, checkoutAmountLayout);
        C7384Etj.A0Y(list, 8);
        return new CheckoutAmountPresentation(checkoutAmountLabel, str, str2, str3, z, checkoutAmountLayout, z2, z3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutAmountPresentation) {
                CheckoutAmountPresentation checkoutAmountPresentation = (CheckoutAmountPresentation) obj;
                if (this.label != checkoutAmountPresentation.label || !C7384Etj.areEqual(this.providedLabel, checkoutAmountPresentation.providedLabel) || !C7384Etj.areEqual(this.amount, checkoutAmountPresentation.amount) || !C7384Etj.areEqual(this.currency, checkoutAmountPresentation.currency) || this.emphasized != checkoutAmountPresentation.emphasized || this.layout != checkoutAmountPresentation.layout || this.subdued != checkoutAmountPresentation.subdued || this.dueAtPropertyNote != checkoutAmountPresentation.dueAtPropertyNote || !C7384Etj.areEqual(this.children, checkoutAmountPresentation.children)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutAmountPresentation copy$default(CheckoutAmountPresentation checkoutAmountPresentation, CheckoutAmountLabel checkoutAmountLabel, String str, String str2, String str3, boolean z, CheckoutAmountLayout checkoutAmountLayout, boolean z2, boolean z3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutAmountLabel = checkoutAmountPresentation.label;
        }
        if ((i & 2) != 0) {
            str = checkoutAmountPresentation.providedLabel;
        }
        if ((i & 4) != 0) {
            str2 = checkoutAmountPresentation.amount;
        }
        if ((i & 8) != 0) {
            str3 = checkoutAmountPresentation.currency;
        }
        if ((i & 16) != 0) {
            z = checkoutAmountPresentation.emphasized;
        }
        if ((i & 32) != 0) {
            checkoutAmountLayout = checkoutAmountPresentation.layout;
        }
        if ((i & 64) != 0) {
            z2 = checkoutAmountPresentation.subdued;
        }
        if ((i & 128) != 0) {
            z3 = checkoutAmountPresentation.dueAtPropertyNote;
        }
        if ((i & 256) != 0) {
            list = checkoutAmountPresentation.children;
        }
        return checkoutAmountPresentation.copy(checkoutAmountLabel, str, str2, str3, z, checkoutAmountLayout, z2, z3, list);
    }

    public final CheckoutAmountLabel component1() {
        return this.label;
    }

    public final String component2() {
        return this.providedLabel;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final boolean component5() {
        return this.emphasized;
    }

    public final CheckoutAmountLayout component6() {
        return this.layout;
    }

    public final boolean component7() {
        return this.subdued;
    }

    public final boolean component8() {
        return this.dueAtPropertyNote;
    }

    public final List<CheckoutAmountPresentation> component9() {
        return this.children;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final List<CheckoutAmountPresentation> getChildren() {
        return this.children;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getDueAtPropertyNote() {
        return this.dueAtPropertyNote;
    }

    public final boolean getEmphasized() {
        return this.emphasized;
    }

    public final CheckoutAmountLabel getLabel() {
        return this.label;
    }

    public final CheckoutAmountLayout getLayout() {
        return this.layout;
    }

    public final String getProvidedLabel() {
        return this.providedLabel;
    }

    public final boolean getSubdued() {
        return this.subdued;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.children, C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.layout, C0KA.A01((((((AnonymousClass005.A0E(this.label) + AnonymousClass006.A0G(this.providedLabel)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass005.A0H(this.currency)) * 31, this.emphasized)), this.subdued), this.dueAtPropertyNote));
    }

    public /* synthetic */ CheckoutAmountPresentation(CheckoutAmountLabel checkoutAmountLabel, String str, String str2, String str3, boolean z, CheckoutAmountLayout checkoutAmountLayout, boolean z2, boolean z3, List list, int i, C06H c06h) {
        this(checkoutAmountLabel, str, str2, str3, z, checkoutAmountLayout, z2, C3cH.A1N(i, z3), (i & 256) != 0 ? C0881AGi.A00 : list);
    }

    public String toString() {
        return super.toString();
    }

    public CheckoutAmountPresentation(CheckoutAmountLabel checkoutAmountLabel, String str, String str2, String str3, boolean z, CheckoutAmountLayout checkoutAmountLayout, boolean z2, boolean z3, List<CheckoutAmountPresentation> list) {
        AnonymousClass002.A1D(checkoutAmountLabel, 0, checkoutAmountLayout);
        C7384Etj.A0Y(list, 8);
        this.label = checkoutAmountLabel;
        this.providedLabel = str;
        this.amount = str2;
        this.currency = str3;
        this.emphasized = z;
        this.layout = checkoutAmountLayout;
        this.subdued = z2;
        this.dueAtPropertyNote = z3;
        this.children = list;
    }
}

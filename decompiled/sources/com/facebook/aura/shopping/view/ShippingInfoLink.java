package com.facebook.aura.shopping.view;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShippingInfoLink extends C06G {
    public final Function0<Unit> onClick;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShippingInfoLink) {
                ShippingInfoLink shippingInfoLink = (ShippingInfoLink) obj;
                if (!C7384Etj.areEqual(this.title, shippingInfoLink.title) || !C7384Etj.areEqual(this.onClick, shippingInfoLink.onClick)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShippingInfoLink copy$default(ShippingInfoLink shippingInfoLink, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingInfoLink.title;
        }
        if ((i & 2) != 0) {
            function0 = shippingInfoLink.onClick;
        }
        AnonymousClass003.A0u(str, function0);
        return new ShippingInfoLink(str, function0);
    }

    public final String component1() {
        return this.title;
    }

    public final Function0<Unit> component2() {
        return this.onClick;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.onClick, AnonymousClass001.A0G(this.title));
    }

    public ShippingInfoLink(String str, Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        this.title = str;
        this.onClick = function0;
    }

    public final ShippingInfoLink copy(String str, Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        return new ShippingInfoLink(str, function0);
    }

    public String toString() {
        return super.toString();
    }
}

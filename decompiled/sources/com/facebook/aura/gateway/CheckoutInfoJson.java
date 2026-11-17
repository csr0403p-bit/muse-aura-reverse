package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutInfoJson extends C06G {
    public static final int $stable = 8;
    public final String payment_method;
    public final List<CheckoutInfoSectionJson> sections;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, CheckoutInfoJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CheckoutInfoJson> serializer() {
            return CheckoutInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutInfoJson) {
                CheckoutInfoJson checkoutInfoJson = (CheckoutInfoJson) obj;
                if (!C7384Etj.areEqual(this.payment_method, checkoutInfoJson.payment_method) || !C7384Etj.areEqual(this.title, checkoutInfoJson.title) || !C7384Etj.areEqual(this.sections, checkoutInfoJson.sections)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutInfoJson copy$default(CheckoutInfoJson checkoutInfoJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutInfoJson.payment_method;
        }
        if ((i & 2) != 0) {
            str2 = checkoutInfoJson.title;
        }
        if ((i & 4) != 0) {
            list = checkoutInfoJson.sections;
        }
        return checkoutInfoJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutInfoJson checkoutInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(checkoutInfoJson.payment_method, c9iZ, 0);
        c9j5.AAV(checkoutInfoJson.title, c9iZ, 1);
        c9j5.AAQ(checkoutInfoJson.sections, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final String component1() {
        return this.payment_method;
    }

    public final String component2() {
        return this.title;
    }

    public final List<CheckoutInfoSectionJson> component3() {
        return this.sections;
    }

    public final String getPayment_method() {
        return this.payment_method;
    }

    public final List<CheckoutInfoSectionJson> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.sections, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.payment_method)));
    }

    public final CheckoutInfo toDomain() {
        String str = this.title;
        List<CheckoutInfoSectionJson> list = this.sections;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<CheckoutInfoSectionJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new CheckoutInfo(str, arrayListA0i);
    }

    public CheckoutInfoJson(String str, String str2, List<CheckoutInfoSectionJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.payment_method = str;
        this.title = str2;
        this.sections = list;
    }

    public final CheckoutInfoJson copy(String str, String str2, List<CheckoutInfoSectionJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new CheckoutInfoJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutInfoJson(int i, String str, String str2, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(CheckoutInfoJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.payment_method = str;
        this.title = str2;
        this.sections = list;
    }
}

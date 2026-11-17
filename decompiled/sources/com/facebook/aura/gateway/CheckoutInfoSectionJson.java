package com.facebook.aura.gateway;

import X.AnonymousClass001;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutInfoSectionJson extends C06G {
    public static final int $stable = 8;
    public final String kind;
    public final List<String> paragraphs;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, CheckoutInfoSectionJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CheckoutInfoSectionJson> serializer() {
            return CheckoutInfoSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutInfoSectionJson) {
                CheckoutInfoSectionJson checkoutInfoSectionJson = (CheckoutInfoSectionJson) obj;
                if (!C7384Etj.areEqual(this.kind, checkoutInfoSectionJson.kind) || !C7384Etj.areEqual(this.title, checkoutInfoSectionJson.title) || !C7384Etj.areEqual(this.paragraphs, checkoutInfoSectionJson.paragraphs)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutInfoSectionJson copy$default(CheckoutInfoSectionJson checkoutInfoSectionJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutInfoSectionJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = checkoutInfoSectionJson.title;
        }
        if ((i & 4) != 0) {
            list = checkoutInfoSectionJson.paragraphs;
        }
        return checkoutInfoSectionJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutInfoSectionJson checkoutInfoSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(checkoutInfoSectionJson.kind, c9iZ, 0);
        c9j5.AAV(checkoutInfoSectionJson.title, c9iZ, 1);
        c9j5.AAQ(checkoutInfoSectionJson.paragraphs, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.title;
    }

    public final List<String> component3() {
        return this.paragraphs;
    }

    public final String getKind() {
        return this.kind;
    }

    public final List<String> getParagraphs() {
        return this.paragraphs;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.paragraphs, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.kind)));
    }

    public final CheckoutInfoSection toDomain() {
        return new CheckoutInfoSection(this.kind, this.title, this.paragraphs);
    }

    public CheckoutInfoSectionJson(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.kind = str;
        this.title = str2;
        this.paragraphs = list;
    }

    public final CheckoutInfoSectionJson copy(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new CheckoutInfoSectionJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutInfoSectionJson(int i, String str, String str2, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(CheckoutInfoSectionJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.kind = str;
        this.title = str2;
        this.paragraphs = list;
    }
}

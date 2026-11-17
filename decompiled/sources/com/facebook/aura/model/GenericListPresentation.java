package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
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
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes.dex */
public final class GenericListPresentation extends C06G {
    public static final int $stable = 0;
    public final List<GenericListRow> items;
    public final String subtitle;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, GenericListPresentation$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<GenericListPresentation> serializer() {
            return GenericListPresentation$$serializer.INSTANCE;
        }

        public final GenericListPresentation fromJson(JsonElement jsonElement) {
            return GenericListPresentationJsonKt.parseGenericListPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GenericListPresentation(String str, String str2, List<GenericListRow> list) {
        C7384Etj.A0Y(list, 2);
        this.title = str;
        this.subtitle = str2;
        this.items = list;
    }

    public final GenericListPresentation copy(String str, String str2, List<GenericListRow> list) {
        C7384Etj.A0Y(list, 2);
        return new GenericListPresentation(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenericListPresentation) {
                GenericListPresentation genericListPresentation = (GenericListPresentation) obj;
                if (!C7384Etj.areEqual(this.title, genericListPresentation.title) || !C7384Etj.areEqual(this.subtitle, genericListPresentation.subtitle) || !C7384Etj.areEqual(this.items, genericListPresentation.items)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericListPresentation copy$default(GenericListPresentation genericListPresentation, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericListPresentation.title;
        }
        if ((i & 2) != 0) {
            str2 = genericListPresentation.subtitle;
        }
        if ((i & 4) != 0) {
            list = genericListPresentation.items;
        }
        return genericListPresentation.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(GenericListPresentation genericListPresentation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || genericListPresentation.title != null) {
            c9j5.AAP(genericListPresentation.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || genericListPresentation.subtitle != null) {
            c9j5.AAP(genericListPresentation.subtitle, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAQ(genericListPresentation.items, C06G.A0e(f0cArr, 2), c9iZ, 2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final List<GenericListRow> component3() {
        return this.items;
    }

    public final List<GenericListRow> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, ((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.subtitle)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GenericListPresentation(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, list);
    }

    public /* synthetic */ GenericListPresentation(int i, String str, String str2, List list, C2hx c2hx) {
        if (4 != (i & 4)) {
            C9iI.A00(GenericListPresentation$$serializer.descriptor, i, 4);
            throw F60.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.items = list;
    }
}

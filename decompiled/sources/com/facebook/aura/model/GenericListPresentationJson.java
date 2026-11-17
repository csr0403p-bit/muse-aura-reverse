package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GenericListPresentationJson extends C06G {
    public static final int $stable = 8;
    public final List<GenericListRowJson> items;
    public final String subtitle;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, GenericListPresentationJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<GenericListPresentationJson> serializer() {
            return GenericListPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenericListPresentationJson) {
                GenericListPresentationJson genericListPresentationJson = (GenericListPresentationJson) obj;
                if (!C7384Etj.areEqual(this.title, genericListPresentationJson.title) || !C7384Etj.areEqual(this.subtitle, genericListPresentationJson.subtitle) || !C7384Etj.areEqual(this.items, genericListPresentationJson.items)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericListPresentationJson copy$default(GenericListPresentationJson genericListPresentationJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericListPresentationJson.title;
        }
        if ((i & 2) != 0) {
            str2 = genericListPresentationJson.subtitle;
        }
        if ((i & 4) != 0) {
            list = genericListPresentationJson.items;
        }
        return genericListPresentationJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(GenericListPresentationJson genericListPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(genericListPresentationJson.title)) {
            c9j5.AAV(genericListPresentationJson.title, c9iZ, 0);
        }
        if (zAfR || genericListPresentationJson.subtitle != null) {
            c9j5.AAP(genericListPresentationJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(genericListPresentationJson.items)) {
            c9j5.AAQ(genericListPresentationJson.items, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final List<GenericListRowJson> component3() {
        return this.items;
    }

    public final List<GenericListRowJson> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31);
    }

    public final GenericListPresentation toDomain() {
        String strA0l;
        String strA0l2 = AnonymousClass002.A0l(this.title);
        String str = null;
        if (strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        List<GenericListRowJson> list = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<GenericListRowJson> it = list.iterator();
        while (it.hasNext()) {
            GenericListRow domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        String str2 = this.subtitle;
        if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
            str = strA0l;
        }
        return new GenericListPresentation(strA0l2, str, arrayListA0h);
    }

    public GenericListPresentationJson(String str, String str2, List<GenericListRowJson> list) {
        AnonymousClass003.A0v(str, list);
        this.title = str;
        this.subtitle = str2;
        this.items = list;
    }

    public final GenericListPresentationJson copy(String str, String str2, List<GenericListRowJson> list) {
        AnonymousClass003.A0v(str, list);
        return new GenericListPresentationJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GenericListPresentationJson(int i, String str, String str2, List list, C2hx c2hx) {
        this.title = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
    }

    public /* synthetic */ GenericListPresentationJson(String str, String str2, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2), C3cI.A12(list, i));
    }

    public GenericListPresentationJson() {
        this("", null, C0881AGi.A00);
    }
}

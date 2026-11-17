package com.facebook.aura.skills.repo;

import X.AGI;
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
public final class RecipientPermissionsPageJson extends C06G {
    public final List<RecipientPermissionJson> items;
    public final String next_cursor;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, RecipientPermissionsPageJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<RecipientPermissionsPageJson> serializer() {
            return RecipientPermissionsPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public RecipientPermissionsPageJson(List<RecipientPermissionJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
        this.next_cursor = str;
    }

    public final RecipientPermissionsPageJson copy(List<RecipientPermissionJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new RecipientPermissionsPageJson(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionsPageJson) {
                RecipientPermissionsPageJson recipientPermissionsPageJson = (RecipientPermissionsPageJson) obj;
                if (!C7384Etj.areEqual(this.items, recipientPermissionsPageJson.items) || !C7384Etj.areEqual(this.next_cursor, recipientPermissionsPageJson.next_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public final RecipientPermissionsPage toDomain(String str) {
        C7384Etj.A0Y(str, 0);
        List<RecipientPermissionJson> list = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<RecipientPermissionJson> it = list.iterator();
        while (it.hasNext()) {
            RecipientPermission domain = it.next().toDomain(str);
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        return new RecipientPermissionsPage(AGI.A0C(arrayListA0h), RecipientPermissionsRepositoryJsonKt.nonBlank(this.next_cursor));
    }

    public static /* synthetic */ RecipientPermissionsPageJson copy$default(RecipientPermissionsPageJson recipientPermissionsPageJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recipientPermissionsPageJson.items;
        }
        if ((i & 2) != 0) {
            str = recipientPermissionsPageJson.next_cursor;
        }
        C7384Etj.A0Y(list, 0);
        return new RecipientPermissionsPageJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RecipientPermissionsPageJson recipientPermissionsPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(recipientPermissionsPageJson.items)) {
            c9j5.AAQ(recipientPermissionsPageJson.items, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || recipientPermissionsPageJson.next_cursor != null) {
            c9j5.AAP(recipientPermissionsPageJson.next_cursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<RecipientPermissionJson> component1() {
        return this.items;
    }

    public final String component2() {
        return this.next_cursor;
    }

    public final List<RecipientPermissionJson> getItems() {
        return this.items;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.next_cursor);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientPermissionsPageJson(int i, List list, String str, C2hx c2hx) {
        this.items = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    public /* synthetic */ RecipientPermissionsPageJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public RecipientPermissionsPageJson() {
        this(C0881AGi.A00, null);
    }
}

package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsLibraryPayloadJson extends C06G {
    public static final int $stable = 8;
    public final List<FsLibraryEntryJson> entries;
    public final boolean has_more;
    public final Long total;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, FsLibraryPayloadJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<FsLibraryPayloadJson> serializer() {
            return FsLibraryPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FsLibraryPayloadJson(List<FsLibraryEntryJson> list, Long l, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.entries = list;
        this.total = l;
        this.has_more = z;
    }

    public final FsLibraryPayloadJson copy(List<FsLibraryEntryJson> list, Long l, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new FsLibraryPayloadJson(list, l, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsLibraryPayloadJson) {
                FsLibraryPayloadJson fsLibraryPayloadJson = (FsLibraryPayloadJson) obj;
                if (!C7384Etj.areEqual(this.entries, fsLibraryPayloadJson.entries) || !C7384Etj.areEqual(this.total, fsLibraryPayloadJson.total) || this.has_more != fsLibraryPayloadJson.has_more) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FsLibraryPayloadJson copy$default(FsLibraryPayloadJson fsLibraryPayloadJson, List list, Long l, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fsLibraryPayloadJson.entries;
        }
        if ((i & 2) != 0) {
            l = fsLibraryPayloadJson.total;
        }
        if ((i & 4) != 0) {
            z = fsLibraryPayloadJson.has_more;
        }
        return fsLibraryPayloadJson.copy(list, l, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsLibraryPayloadJson fsLibraryPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(fsLibraryPayloadJson.entries)) {
            c9j5.AAQ(fsLibraryPayloadJson.entries, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || fsLibraryPayloadJson.total != null) {
            c9j5.AAP(fsLibraryPayloadJson.total, C9j1.A00, c9iZ, 1);
        }
        if (zAfR || fsLibraryPayloadJson.has_more) {
            c9j5.AA7(c9iZ, 2, fsLibraryPayloadJson.has_more);
        }
    }

    public final List<FsLibraryEntryJson> component1() {
        return this.entries;
    }

    public final Long component2() {
        return this.total;
    }

    public final boolean component3() {
        return this.has_more;
    }

    public final List<FsLibraryEntryJson> getEntries() {
        return this.entries;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final Long getTotal() {
        return this.total;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0E(this.entries) + AnonymousClass006.A0D(this.total)) * 31, this.has_more);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsLibraryPayloadJson(int i, List list, Long l, boolean z, C2hx c2hx) {
        this.entries = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.total = null;
        } else {
            this.total = l;
        }
        if ((i & 4) == 0) {
            this.has_more = false;
        } else {
            this.has_more = z;
        }
    }

    public /* synthetic */ FsLibraryPayloadJson(List list, Long l, boolean z, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : l, AnonymousClass005.A1O(i, z));
    }

    public FsLibraryPayloadJson() {
        this(C0881AGi.A00, null, false);
    }
}

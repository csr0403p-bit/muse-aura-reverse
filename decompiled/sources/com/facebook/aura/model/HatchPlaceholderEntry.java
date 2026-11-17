package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
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
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchPlaceholderEntry extends C06G {
    public static final int $stable = 8;
    public final Map<String, String> data;
    public final String id;
    public final String kind;
    public final boolean resolved;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1U(C79.A01, null, null, null, HatchPlaceholderEntry$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchPlaceholderEntry> serializer() {
            return HatchPlaceholderEntry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPlaceholderEntry) {
                HatchPlaceholderEntry hatchPlaceholderEntry = (HatchPlaceholderEntry) obj;
                if (!C7384Etj.areEqual(this.id, hatchPlaceholderEntry.id) || !C7384Etj.areEqual(this.kind, hatchPlaceholderEntry.kind) || this.resolved != hatchPlaceholderEntry.resolved || !C7384Etj.areEqual(this.data, hatchPlaceholderEntry.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchPlaceholderEntry(int i, String str, String str2, boolean z, Map map, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(HatchPlaceholderEntry$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.kind = str2;
        this.resolved = z;
        this.data = map;
    }

    public static /* synthetic */ HatchPlaceholderEntry copy$default(HatchPlaceholderEntry hatchPlaceholderEntry, String str, String str2, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPlaceholderEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchPlaceholderEntry.kind;
        }
        if ((i & 4) != 0) {
            z = hatchPlaceholderEntry.resolved;
        }
        if ((i & 8) != 0) {
            map = hatchPlaceholderEntry.data;
        }
        AnonymousClass005.A0y(str, str2, map);
        return new HatchPlaceholderEntry(str, str2, z, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchPlaceholderEntry hatchPlaceholderEntry, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(hatchPlaceholderEntry.id, c9iZ, 0);
        c9j5.AAV(hatchPlaceholderEntry.kind, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, hatchPlaceholderEntry.resolved);
        c9j5.AAQ(hatchPlaceholderEntry.data, C3cH.A15(f0cArr, 3), c9iZ, 3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.kind;
    }

    public final boolean component3() {
        return this.resolved;
    }

    public final Map<String, String> component4() {
        return this.data;
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final boolean getResolved() {
        return this.resolved;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.data, C0KA.A01(AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.id)), this.resolved));
    }

    public final HatchPlaceholderEntry copy(String str, String str2, boolean z, Map<String, String> map) {
        AnonymousClass005.A0y(str, str2, map);
        return new HatchPlaceholderEntry(str, str2, z, map);
    }

    public String toString() {
        return super.toString();
    }

    public HatchPlaceholderEntry(String str, String str2, boolean z, Map<String, String> map) {
        AnonymousClass005.A0y(str, str2, map);
        this.id = str;
        this.kind = str2;
        this.resolved = z;
        this.data = map;
    }
}

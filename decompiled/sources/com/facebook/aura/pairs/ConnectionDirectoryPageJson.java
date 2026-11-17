package com.facebook.aura.pairs;

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
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class ConnectionDirectoryPageJson extends C06G {
    public static final int $stable = 8;
    public final List<JsonElement> items;
    public final String next;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, ConnectionDirectoryPageJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConnectionDirectoryPageJson> serializer() {
            return ConnectionDirectoryPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionDirectoryPageJson(List<? extends JsonElement> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
        this.next = str;
    }

    public final ConnectionDirectoryPageJson copy(List<? extends JsonElement> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new ConnectionDirectoryPageJson(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionDirectoryPageJson) {
                ConnectionDirectoryPageJson connectionDirectoryPageJson = (ConnectionDirectoryPageJson) obj;
                if (!C7384Etj.areEqual(this.items, connectionDirectoryPageJson.items) || !C7384Etj.areEqual(this.next, connectionDirectoryPageJson.next)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionDirectoryPageJson copy$default(ConnectionDirectoryPageJson connectionDirectoryPageJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = connectionDirectoryPageJson.items;
        }
        if ((i & 2) != 0) {
            str = connectionDirectoryPageJson.next;
        }
        C7384Etj.A0Y(list, 0);
        return new ConnectionDirectoryPageJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionDirectoryPageJson connectionDirectoryPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(connectionDirectoryPageJson.items)) {
            c9j5.AAQ(connectionDirectoryPageJson.items, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || connectionDirectoryPageJson.next != null) {
            c9j5.AAP(connectionDirectoryPageJson.next, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<JsonElement> component1() {
        return this.items;
    }

    public final String component2() {
        return this.next;
    }

    public final List<JsonElement> getItems() {
        return this.items;
    }

    public final String getNext() {
        return this.next;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.next);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionDirectoryPageJson(int i, List list, String str, C2hx c2hx) {
        this.items = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.next = null;
        } else {
            this.next = str;
        }
    }

    public /* synthetic */ ConnectionDirectoryPageJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public ConnectionDirectoryPageJson() {
        this(C0881AGi.A00, null);
    }
}

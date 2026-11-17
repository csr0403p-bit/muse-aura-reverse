package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cF;
import X.C3cI;
import X.C60R;
import X.C7384Etj;
import X.C8j2;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ManagedBrowserControlReceiptJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean binding_alive;
    public final String control;
    public final String input_owner;
    public final boolean presented;
    public final long state_revision;
    public final boolean target_alive;
    public final String target_id;

    public final class Companion {
        public final C9hr<ManagedBrowserControlReceiptJson> serializer() {
            return ManagedBrowserControlReceiptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ManagedBrowserControlReceiptJson copy$default(ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson, String str, long j, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        String str4 = str;
        long j2 = j;
        String str5 = str2;
        String str6 = str3;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            str4 = managedBrowserControlReceiptJson.control;
        }
        if ((i & 2) != 0) {
            j2 = managedBrowserControlReceiptJson.state_revision;
        }
        if ((i & 4) != 0) {
            str5 = managedBrowserControlReceiptJson.input_owner;
        }
        if ((i & 8) != 0) {
            str6 = managedBrowserControlReceiptJson.target_id;
        }
        if ((i & 16) != 0) {
            z4 = managedBrowserControlReceiptJson.presented;
        }
        if ((i & 32) != 0) {
            z5 = managedBrowserControlReceiptJson.target_alive;
        }
        if ((i & 64) != 0) {
            z6 = managedBrowserControlReceiptJson.binding_alive;
        }
        AnonymousClass003.A0v(str4, str5);
        return new ManagedBrowserControlReceiptJson(str4, j2, str5, str6, z4, z5, z6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(managedBrowserControlReceiptJson.control, c9iZ, 0);
        c9j5.AAN(c9iZ, 1, managedBrowserControlReceiptJson.state_revision);
        c9j5.AAV(managedBrowserControlReceiptJson.input_owner, c9iZ, 2);
        if (c9j5.AfR() || managedBrowserControlReceiptJson.target_id != null) {
            c9j5.AAP(managedBrowserControlReceiptJson.target_id, C07779iq.A01, c9iZ, 3);
        }
        c9j5.AA7(c9iZ, 4, managedBrowserControlReceiptJson.presented);
        c9j5.AA7(c9iZ, 5, managedBrowserControlReceiptJson.target_alive);
        c9j5.AA7(c9iZ, 6, managedBrowserControlReceiptJson.binding_alive);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserControlReceiptJson) {
                ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson = (ManagedBrowserControlReceiptJson) obj;
                if (!C7384Etj.areEqual(this.control, managedBrowserControlReceiptJson.control) || this.state_revision != managedBrowserControlReceiptJson.state_revision || !C7384Etj.areEqual(this.input_owner, managedBrowserControlReceiptJson.input_owner) || !C7384Etj.areEqual(this.target_id, managedBrowserControlReceiptJson.target_id) || this.presented != managedBrowserControlReceiptJson.presented || this.target_alive != managedBrowserControlReceiptJson.target_alive || this.binding_alive != managedBrowserControlReceiptJson.binding_alive) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserControlReceiptJson(int i, String str, long j, String str2, String str3, boolean z, boolean z2, boolean z3, C2hx c2hx) {
        if (119 != (i & 119)) {
            C9iI.A00(ManagedBrowserControlReceiptJson$$serializer.descriptor, i, 119);
            throw F60.createAndThrow();
        }
        this.control = str;
        this.state_revision = j;
        this.input_owner = str2;
        if ((i & 8) == 0) {
            this.target_id = null;
        } else {
            this.target_id = str3;
        }
        this.presented = z;
        this.target_alive = z2;
        this.binding_alive = z3;
    }

    public final String component1() {
        return this.control;
    }

    public final long component2() {
        return this.state_revision;
    }

    public final String component3() {
        return this.input_owner;
    }

    public final String component4() {
        return this.target_id;
    }

    public final boolean component5() {
        return this.presented;
    }

    public final boolean component6() {
        return this.target_alive;
    }

    public final boolean component7() {
        return this.binding_alive;
    }

    public final boolean getBinding_alive() {
        return this.binding_alive;
    }

    public final String getControl() {
        return this.control;
    }

    public final String getInput_owner() {
        return this.input_owner;
    }

    public final boolean getPresented() {
        return this.presented;
    }

    public final long getState_revision() {
        return this.state_revision;
    }

    public final boolean getTarget_alive() {
        return this.target_alive;
    }

    public final String getTarget_id() {
        return this.target_id;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.input_owner, C60R.A00(this.state_revision, AnonymousClass001.A0G(this.control))) + AnonymousClass006.A0G(this.target_id)) * 31, this.presented), this.target_alive), this.binding_alive);
    }

    public String toString() {
        String str = this.control;
        long j = this.state_revision;
        String str2 = this.input_owner;
        String str3 = this.target_id;
        boolean z = this.presented;
        boolean z2 = this.target_alive;
        boolean z3 = this.binding_alive;
        StringBuilder sbA0x = C3cI.A0x("ManagedBrowserControlReceiptJson(control=", str);
        sbA0x.append(C8j2.A00(42));
        sbA0x.append(j);
        sbA0x.append(", input_owner=");
        sbA0x.append(str2);
        sbA0x.append(C3cF.A00(10));
        sbA0x.append(str3);
        sbA0x.append(", presented=");
        sbA0x.append(z);
        sbA0x.append(", target_alive=");
        sbA0x.append(z2);
        sbA0x.append(", binding_alive=");
        sbA0x.append(z3);
        return AnonymousClass001.A0v(")", sbA0x);
    }

    public final ManagedBrowserControlReceiptJson copy(String str, long j, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0v(str, str2);
        return new ManagedBrowserControlReceiptJson(str, j, str2, str3, z, z2, z3);
    }

    public /* synthetic */ ManagedBrowserControlReceiptJson(String str, long j, String str2, String str3, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(str, j, str2, AnonymousClass006.A0u(i, str3), z, z2, z3);
    }

    public ManagedBrowserControlReceiptJson(String str, long j, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0v(str, str2);
        this.control = str;
        this.state_revision = j;
        this.input_owner = str2;
        this.target_id = str3;
        this.presented = z;
        this.target_alive = z2;
        this.binding_alive = z3;
    }
}

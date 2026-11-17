package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class CredentialCaptureFieldJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String name;

    /* renamed from: protected, reason: not valid java name */
    public final boolean f258protected;
    public final String value;

    public final class Companion {
        public final C9hr<CredentialCaptureFieldJson> serializer() {
            return CredentialCaptureFieldJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCaptureFieldJson credentialCaptureFieldJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(credentialCaptureFieldJson.name, c9iZ, 0);
        c9j5.AAV(credentialCaptureFieldJson.value, c9iZ, 1);
        if (c9j5.AfR() || !credentialCaptureFieldJson.f258protected) {
            c9j5.AA7(c9iZ, 2, credentialCaptureFieldJson.f258protected);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCaptureFieldJson) {
                CredentialCaptureFieldJson credentialCaptureFieldJson = (CredentialCaptureFieldJson) obj;
                if (!C7384Etj.areEqual(this.name, credentialCaptureFieldJson.name) || !C7384Etj.areEqual(this.value, credentialCaptureFieldJson.value) || this.f258protected != credentialCaptureFieldJson.f258protected) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CredentialCaptureFieldJson copy$default(CredentialCaptureFieldJson credentialCaptureFieldJson, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCaptureFieldJson.name;
        }
        if ((i & 2) != 0) {
            str2 = credentialCaptureFieldJson.value;
        }
        if ((i & 4) != 0) {
            z = credentialCaptureFieldJson.f258protected;
        }
        return credentialCaptureFieldJson.copy(str, str2, z);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.f258protected;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getProtected() {
        return this.f258protected;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.value, AnonymousClass001.A0G(this.name)), this.f258protected);
    }

    public CredentialCaptureFieldJson(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.value = str2;
        this.f258protected = z;
    }

    public final CredentialCaptureFieldJson copy(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new CredentialCaptureFieldJson(str, str2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialCaptureFieldJson(String str, String str2, boolean z, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? true : z);
    }

    public /* synthetic */ CredentialCaptureFieldJson(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CredentialCaptureFieldJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.value = str2;
        this.f258protected = (i & 4) == 0 ? true : z;
    }
}

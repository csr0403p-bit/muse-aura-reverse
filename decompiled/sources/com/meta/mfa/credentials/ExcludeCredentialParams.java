package com.meta.mfa.credentials;

import X.AnonymousClass003;
import X.C06H;
import X.C07348in;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C79;
import X.C8ME;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9jL;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ExcludeCredentialParams {
    public final byte[] id;
    public final List<String> transports;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, new C07348in(4));

    public final class Companion {
        public final C9hr<ExcludeCredentialParams> serializer() {
            return C8ME.A00;
        }
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getTransports$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(ExcludeCredentialParams excludeCredentialParams, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(excludeCredentialParams.id, C9jL.A00, c9iZ, 0);
        c9j5.AAV(excludeCredentialParams.type, c9iZ, 1);
        if (c9j5.AfR() || excludeCredentialParams.transports != null) {
            c9j5.AAP(excludeCredentialParams.transports, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final byte[] getId() {
        return this.id;
    }

    public final List<String> getTransports() {
        return this.transports;
    }

    public final String getType() {
        return this.type;
    }

    public ExcludeCredentialParams(byte[] bArr, String str, List<String> list) {
        AnonymousClass003.A0u(bArr, str);
        this.id = bArr;
        this.type = str;
        this.transports = list;
    }

    public /* synthetic */ ExcludeCredentialParams(int i, byte[] bArr, String str, List list, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(C8ME.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.id = bArr;
        this.type = str;
        if ((i & 4) == 0) {
            this.transports = null;
        } else {
            this.transports = list;
        }
    }

    public /* synthetic */ ExcludeCredentialParams(byte[] bArr, String str, List list, int i, C06H c06h) {
        this(bArr, str, (i & 4) != 0 ? null : list);
    }
}

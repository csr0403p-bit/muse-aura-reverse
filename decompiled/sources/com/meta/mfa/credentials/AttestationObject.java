package com.meta.mfa.credentials;

import X.AnonymousClass005;
import X.C08409ub;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9jL;
import X.C9uU;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AttestationObject {
    public static final Companion Companion = new Companion();
    public final AttestationStatement attStmt;
    public final byte[] authData;
    public final String fmt;

    public final class Companion {
        public final C9hr<AttestationObject> serializer() {
            return C08409ub.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(AttestationObject attestationObject, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(attestationObject.fmt, c9iZ, 0);
        c9j5.AAQ(attestationObject.attStmt, C9uU.A00, c9iZ, 1);
        c9j5.AAQ(attestationObject.authData, C9jL.A00, c9iZ, 2);
    }

    public static /* synthetic */ void getAttStmt$annotations() {
    }

    public static /* synthetic */ void getAuthData$annotations() {
    }

    public static /* synthetic */ void getFmt$annotations() {
    }

    public final AttestationStatement getAttStmt() {
        return this.attStmt;
    }

    public final byte[] getAuthData() {
        return this.authData;
    }

    public final String getFmt() {
        return this.fmt;
    }

    public AttestationObject(String str, AttestationStatement attestationStatement, byte[] bArr) {
        AnonymousClass005.A0x(str, attestationStatement, bArr);
        this.fmt = str;
        this.attStmt = attestationStatement;
        this.authData = bArr;
    }

    public /* synthetic */ AttestationObject(int i, String str, AttestationStatement attestationStatement, byte[] bArr, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C08409ub.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.fmt = str;
        this.attStmt = attestationStatement;
        this.authData = bArr;
    }
}

package com.meta.mfa.credentials;

import X.AnonymousClass005;
import X.C2hx;
import X.C9gs;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9jL;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class User {
    public static final Companion Companion = new Companion();
    public final String displayName;
    public final byte[] id;
    public final String name;

    public final class Companion {
        public final C9hr<User> serializer() {
            return C9gs.A00;
        }
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(User user, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(user.id, C9jL.A00, c9iZ, 0);
        c9j5.AAV(user.name, c9iZ, 1);
        c9j5.AAV(user.displayName, c9iZ, 2);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final byte[] getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public User(byte[] bArr, String str, String str2) {
        AnonymousClass005.A0x(bArr, str, str2);
        this.id = bArr;
        this.name = str;
        this.displayName = str2;
    }

    public /* synthetic */ User(int i, byte[] bArr, String str, String str2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C9gs.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.id = bArr;
        this.name = str;
        this.displayName = str2;
    }
}

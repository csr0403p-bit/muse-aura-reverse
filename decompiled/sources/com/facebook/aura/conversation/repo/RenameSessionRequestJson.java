package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RenameSessionRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String method;
    public final String session_id;
    public final String title;

    public final class Companion {
        public final C9hr<RenameSessionRequestJson> serializer() {
            return RenameSessionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(RenameSessionRequestJson renameSessionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(renameSessionRequestJson.method, c9iZ, 0);
        c9j5.AAV(renameSessionRequestJson.session_id, c9iZ, 1);
        c9j5.AAV(renameSessionRequestJson.title, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RenameSessionRequestJson) {
                RenameSessionRequestJson renameSessionRequestJson = (RenameSessionRequestJson) obj;
                if (!C7384Etj.areEqual(this.method, renameSessionRequestJson.method) || !C7384Etj.areEqual(this.session_id, renameSessionRequestJson.session_id) || !C7384Etj.areEqual(this.title, renameSessionRequestJson.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RenameSessionRequestJson copy$default(RenameSessionRequestJson renameSessionRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renameSessionRequestJson.method;
        }
        if ((i & 2) != 0) {
            str2 = renameSessionRequestJson.session_id;
        }
        if ((i & 4) != 0) {
            str3 = renameSessionRequestJson.title;
        }
        return renameSessionRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.method;
    }

    public final String component2() {
        return this.session_id;
    }

    public final String component3() {
        return this.title;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass005.A0I(this.session_id, AnonymousClass001.A0G(this.method)));
    }

    public RenameSessionRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.method = str;
        this.session_id = str2;
        this.title = str3;
    }

    public final RenameSessionRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new RenameSessionRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RenameSessionRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(RenameSessionRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.method = str;
        this.session_id = str2;
        this.title = str3;
    }
}

package com.facebook.aura.sharesheet;

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
/* loaded from: classes4.dex */
public final class MessageShareAttemptRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String content_id;
    public final String content_type;
    public final String share_operation_id;

    public final class Companion {
        public final C9hr<MessageShareAttemptRequestJson> serializer() {
            return MessageShareAttemptRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(MessageShareAttemptRequestJson messageShareAttemptRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(messageShareAttemptRequestJson.content_type, c9iZ, 0);
        c9j5.AAV(messageShareAttemptRequestJson.content_id, c9iZ, 1);
        c9j5.AAV(messageShareAttemptRequestJson.share_operation_id, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageShareAttemptRequestJson) {
                MessageShareAttemptRequestJson messageShareAttemptRequestJson = (MessageShareAttemptRequestJson) obj;
                if (!C7384Etj.areEqual(this.content_type, messageShareAttemptRequestJson.content_type) || !C7384Etj.areEqual(this.content_id, messageShareAttemptRequestJson.content_id) || !C7384Etj.areEqual(this.share_operation_id, messageShareAttemptRequestJson.share_operation_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessageShareAttemptRequestJson copy$default(MessageShareAttemptRequestJson messageShareAttemptRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageShareAttemptRequestJson.content_type;
        }
        if ((i & 2) != 0) {
            str2 = messageShareAttemptRequestJson.content_id;
        }
        if ((i & 4) != 0) {
            str3 = messageShareAttemptRequestJson.share_operation_id;
        }
        return messageShareAttemptRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.content_type;
    }

    public final String component2() {
        return this.content_id;
    }

    public final String component3() {
        return this.share_operation_id;
    }

    public final String getContent_id() {
        return this.content_id;
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final String getShare_operation_id() {
        return this.share_operation_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.share_operation_id, AnonymousClass005.A0I(this.content_id, AnonymousClass001.A0G(this.content_type)));
    }

    public MessageShareAttemptRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.content_type = str;
        this.content_id = str2;
        this.share_operation_id = str3;
    }

    public final MessageShareAttemptRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new MessageShareAttemptRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessageShareAttemptRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(MessageShareAttemptRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.content_type = str;
        this.content_id = str2;
        this.share_operation_id = str3;
    }
}

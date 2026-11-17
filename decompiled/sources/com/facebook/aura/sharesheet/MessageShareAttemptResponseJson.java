package com.facebook.aura.sharesheet;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class MessageShareAttemptResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean can_broadcast_share;
    public final String disposition;
    public final String status;

    public final class Companion {
        public final C9hr<MessageShareAttemptResponseJson> serializer() {
            return MessageShareAttemptResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MessageShareAttemptResponseJson(boolean z, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        this.can_broadcast_share = z;
        this.status = str;
        this.disposition = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(MessageShareAttemptResponseJson messageShareAttemptResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, messageShareAttemptResponseJson.can_broadcast_share);
        c9j5.AAV(messageShareAttemptResponseJson.status, c9iZ, 1);
        if (c9j5.AfR() || messageShareAttemptResponseJson.disposition != null) {
            c9j5.AAP(messageShareAttemptResponseJson.disposition, C07779iq.A01, c9iZ, 2);
        }
    }

    public final MessageShareAttemptResponseJson copy(boolean z, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        return new MessageShareAttemptResponseJson(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageShareAttemptResponseJson) {
                MessageShareAttemptResponseJson messageShareAttemptResponseJson = (MessageShareAttemptResponseJson) obj;
                if (this.can_broadcast_share != messageShareAttemptResponseJson.can_broadcast_share || !C7384Etj.areEqual(this.status, messageShareAttemptResponseJson.status) || !C7384Etj.areEqual(this.disposition, messageShareAttemptResponseJson.disposition)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessageShareAttemptResponseJson copy$default(MessageShareAttemptResponseJson messageShareAttemptResponseJson, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messageShareAttemptResponseJson.can_broadcast_share;
        }
        if ((i & 2) != 0) {
            str = messageShareAttemptResponseJson.status;
        }
        if ((i & 4) != 0) {
            str2 = messageShareAttemptResponseJson.disposition;
        }
        return messageShareAttemptResponseJson.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.can_broadcast_share;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.disposition;
    }

    public final boolean getCan_broadcast_share() {
        return this.can_broadcast_share;
    }

    public final String getDisposition() {
        return this.disposition;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.status, C0KA.A02(this.can_broadcast_share)) + AnonymousClass006.A0G(this.disposition);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.sharesheet.HatchMessageShareAttemptResult toDomain() {
        /*
            r6 = this;
            java.lang.String r5 = r6.disposition
            java.lang.String r4 = "allow"
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L27
            java.lang.String r0 = "allow_with_friction"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L39
            com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r0 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.ALLOWED_WITH_FRICTION
            return r0
        L15:
            java.lang.String r0 = "review_error"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L46
        L1d:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L2a
            boolean r0 = r6.can_broadcast_share
            if (r0 == 0) goto L2a
        L27:
            com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r0 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.ALLOWED
            return r0
        L2a:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L36
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L46
        L36:
            com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r0 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.BLOCKED
            return r0
        L39:
            java.lang.String r3 = r6.status
            int r0 = r3.hashCode()
            java.lang.String r2 = "friction"
            java.lang.String r1 = "block"
            switch(r0) {
                case -1857738670: goto L49;
                case -1424718086: goto L4c;
                case -805352863: goto L15;
                case -682587753: goto L51;
                case 92906313: goto L62;
                case 93832333: goto L54;
                case 1698449279: goto L59;
                case 2092707723: goto L5c;
                default: goto L46;
            }
        L46:
            com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r0 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.UNAVAILABLE
            return r0
        L49:
            java.lang.String r4 = "review_not_applicable"
            goto L62
        L4c:
            boolean r0 = r3.equals(r2)
            goto L66
        L51:
            java.lang.String r4 = "pending"
            goto L62
        L54:
            boolean r0 = r3.equals(r1)
            goto L66
        L59:
            java.lang.String r4 = "review_missing"
            goto L62
        L5c:
            r0 = 93
            java.lang.String r4 = X.C60N.A00(r0)
        L62:
            boolean r0 = r3.equals(r4)
        L66:
            if (r0 != 0) goto L1d
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.MessageShareAttemptResponseJson.toDomain():com.facebook.aura.sharesheet.HatchMessageShareAttemptResult");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessageShareAttemptResponseJson(int i, boolean z, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(MessageShareAttemptResponseJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.can_broadcast_share = z;
        this.status = str;
        this.disposition = C3cI.A0W(i, str2);
    }

    public /* synthetic */ MessageShareAttemptResponseJson(boolean z, String str, String str2, int i, C06H c06h) {
        this(z, str, AnonymousClass006.A0t(i, str2));
    }
}

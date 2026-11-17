package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SessionUpdatedSessionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String account_username;
    public final boolean archived;
    public final boolean can_send_messages;
    public final String channel;
    public final Long createdAt;
    public final Long created_at;
    public final Long created_at_ms;
    public final boolean is_pinned;
    public final boolean is_thread;
    public final boolean pinned;
    public final String session_id;
    public final String snippet;
    public final String status;
    public final String title;
    public final int unread_count;
    public final Long updatedAt;
    public final Long updated_at;
    public final Long updated_at_ms;

    public final class Companion {
        public final C9hr<SessionUpdatedSessionJson> serializer() {
            return SessionUpdatedSessionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(SessionUpdatedSessionJson sessionUpdatedSessionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(sessionUpdatedSessionJson.session_id)) {
            c9j5.AAV(sessionUpdatedSessionJson.session_id, c9iZ, 0);
        }
        if (zAfR || sessionUpdatedSessionJson.created_at_ms != null) {
            c9j5.AAP(sessionUpdatedSessionJson.created_at_ms, C9j1.A00, c9iZ, 1);
        }
        if (zAfR || sessionUpdatedSessionJson.created_at != null) {
            c9j5.AAP(sessionUpdatedSessionJson.created_at, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || sessionUpdatedSessionJson.createdAt != null) {
            c9j5.AAP(sessionUpdatedSessionJson.createdAt, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || sessionUpdatedSessionJson.updated_at_ms != null) {
            c9j5.AAP(sessionUpdatedSessionJson.updated_at_ms, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || sessionUpdatedSessionJson.updated_at != null) {
            c9j5.AAP(sessionUpdatedSessionJson.updated_at, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || sessionUpdatedSessionJson.updatedAt != null) {
            c9j5.AAP(sessionUpdatedSessionJson.updatedAt, C9j1.A00, c9iZ, 6);
        }
        if (zAfR || !"".equals(sessionUpdatedSessionJson.status)) {
            c9j5.AAV(sessionUpdatedSessionJson.status, c9iZ, 7);
        }
        if (zAfR || sessionUpdatedSessionJson.archived) {
            c9j5.AA7(c9iZ, 8, sessionUpdatedSessionJson.archived);
        }
        if (zAfR || sessionUpdatedSessionJson.pinned) {
            c9j5.AA7(c9iZ, 9, sessionUpdatedSessionJson.pinned);
        }
        if (zAfR || sessionUpdatedSessionJson.is_pinned) {
            c9j5.AA7(c9iZ, 10, sessionUpdatedSessionJson.is_pinned);
        }
        if (zAfR || sessionUpdatedSessionJson.unread_count != 0) {
            c9j5.AAK(c9iZ, 11, sessionUpdatedSessionJson.unread_count);
        }
        if (zAfR || sessionUpdatedSessionJson.snippet != null) {
            c9j5.AAP(sessionUpdatedSessionJson.snippet, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || sessionUpdatedSessionJson.is_thread) {
            c9j5.AA7(c9iZ, 13, sessionUpdatedSessionJson.is_thread);
        }
        if (zAfR || sessionUpdatedSessionJson.title != null) {
            c9j5.AAP(sessionUpdatedSessionJson.title, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || sessionUpdatedSessionJson.channel != null) {
            c9j5.AAP(sessionUpdatedSessionJson.channel, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || sessionUpdatedSessionJson.account_username != null) {
            c9j5.AAP(sessionUpdatedSessionJson.account_username, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || !sessionUpdatedSessionJson.can_send_messages) {
            c9j5.AA7(c9iZ, 17, sessionUpdatedSessionJson.can_send_messages);
        }
    }

    public final SessionUpdatedSessionJson copy(String str, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, String str4, String str5, String str6, boolean z5) {
        C60O.A1M(str, 0, str2);
        return new SessionUpdatedSessionJson(str, l, l2, l3, l4, l5, l6, str2, z, z2, z3, i, str3, z4, str4, str5, str6, z5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionUpdatedSessionJson) {
                SessionUpdatedSessionJson sessionUpdatedSessionJson = (SessionUpdatedSessionJson) obj;
                if (!C7384Etj.areEqual(this.session_id, sessionUpdatedSessionJson.session_id) || !C7384Etj.areEqual(this.created_at_ms, sessionUpdatedSessionJson.created_at_ms) || !C7384Etj.areEqual(this.created_at, sessionUpdatedSessionJson.created_at) || !C7384Etj.areEqual(this.createdAt, sessionUpdatedSessionJson.createdAt) || !C7384Etj.areEqual(this.updated_at_ms, sessionUpdatedSessionJson.updated_at_ms) || !C7384Etj.areEqual(this.updated_at, sessionUpdatedSessionJson.updated_at) || !C7384Etj.areEqual(this.updatedAt, sessionUpdatedSessionJson.updatedAt) || !C7384Etj.areEqual(this.status, sessionUpdatedSessionJson.status) || this.archived != sessionUpdatedSessionJson.archived || this.pinned != sessionUpdatedSessionJson.pinned || this.is_pinned != sessionUpdatedSessionJson.is_pinned || this.unread_count != sessionUpdatedSessionJson.unread_count || !C7384Etj.areEqual(this.snippet, sessionUpdatedSessionJson.snippet) || this.is_thread != sessionUpdatedSessionJson.is_thread || !C7384Etj.areEqual(this.title, sessionUpdatedSessionJson.title) || !C7384Etj.areEqual(this.channel, sessionUpdatedSessionJson.channel) || !C7384Etj.areEqual(this.account_username, sessionUpdatedSessionJson.account_username) || this.can_send_messages != sessionUpdatedSessionJson.can_send_messages) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SessionUpdatedSessionJson(String str, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, String str4, String str5, String str6, boolean z5, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : l3, (i2 & 16) != 0 ? null : l4, (i2 & 32) != 0 ? null : l5, (i2 & 64) != 0 ? null : l6, (i2 & 128) == 0 ? str2 : "", C3cG.A1K(i2 & 256, z), C3cG.A1K(i2 & 512, z2), C3cG.A1K(i2 & 1024, z3), (i2 & 2048) != 0 ? 0 : i, C3cG.A0e(str3, i2 & 4096), (i2 & 8192) == 0 ? z4 : false, C3cG.A0e(str4, i2 & 16384), C3cI.A0V(i2, 32768, str5), C3cI.A0V(i2, 65536, str6), C60Q.A1Q(i2 & 131072, z5));
    }

    public final String component1() {
        return this.session_id;
    }

    public final boolean component10() {
        return this.pinned;
    }

    public final boolean component11() {
        return this.is_pinned;
    }

    public final int component12() {
        return this.unread_count;
    }

    public final String component13() {
        return this.snippet;
    }

    public final boolean component14() {
        return this.is_thread;
    }

    public final String component15() {
        return this.title;
    }

    public final String component16() {
        return this.channel;
    }

    public final String component17() {
        return this.account_username;
    }

    public final boolean component18() {
        return this.can_send_messages;
    }

    public final Long component2() {
        return this.created_at_ms;
    }

    public final Long component3() {
        return this.created_at;
    }

    public final Long component4() {
        return this.createdAt;
    }

    public final Long component5() {
        return this.updated_at_ms;
    }

    public final Long component6() {
        return this.updated_at;
    }

    public final Long component7() {
        return this.updatedAt;
    }

    public final String component8() {
        return this.status;
    }

    public final boolean component9() {
        return this.archived;
    }

    public final String getAccount_username() {
        return this.account_username;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final boolean getCan_send_messages() {
        return this.can_send_messages;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final Long getCreated_at() {
        return this.created_at;
    }

    public final Long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getSnippet() {
        return this.snippet;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUnread_count() {
        return this.unread_count;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final Long getUpdated_at() {
        return this.updated_at;
    }

    public final Long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public int hashCode() {
        return C0KA.A00((((((C0KA.A01((((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.status, (((((((((((AnonymousClass001.A0G(this.session_id) + AnonymousClass006.A0D(this.created_at_ms)) * 31) + AnonymousClass006.A0D(this.created_at)) * 31) + AnonymousClass006.A0D(this.createdAt)) * 31) + AnonymousClass006.A0D(this.updated_at_ms)) * 31) + AnonymousClass006.A0D(this.updated_at)) * 31) + AnonymousClass006.A0D(this.updatedAt)) * 31), this.archived), this.pinned), this.is_pinned) + this.unread_count) * 31) + AnonymousClass006.A0G(this.snippet)) * 31, this.is_thread) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.channel)) * 31) + AnonymousClass005.A0H(this.account_username)) * 31, this.can_send_messages);
    }

    public final boolean is_pinned() {
        return this.is_pinned;
    }

    public final boolean is_thread() {
        return this.is_thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.HatchSessionUpdate toSessionUpdate() {
        /*
            r19 = this;
            r2 = r19
            java.lang.Long r3 = r2.created_at_ms
            java.lang.Long r1 = r2.created_at
            java.lang.Long r0 = r2.createdAt
            r16 = 0
            java.lang.Long[] r0 = new java.lang.Long[]{r3, r1, r0}
            long r6 = com.facebook.aura.gateway.HatchSessionUpdatedEventJsonKt.firstTimestamp(r0)
            java.lang.Long r3 = r2.updated_at_ms
            java.lang.Long r1 = r2.updated_at
            java.lang.Long r0 = r2.updatedAt
            java.lang.Long[] r0 = new java.lang.Long[]{r3, r1, r0}
            long r8 = com.facebook.aura.gateway.HatchSessionUpdatedEventJsonKt.firstTimestamp(r0)
            r3 = 0
            r1 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L28
            r8 = r6
        L28:
            java.lang.String r5 = r2.session_id
            java.lang.String r10 = r2.status
            java.lang.String r11 = r2.snippet
            if (r11 == 0) goto L36
            boolean r0 = X.C7BY.A0j(r11)
            if (r0 == 0) goto L37
        L36:
            r11 = r1
        L37:
            boolean r12 = r2.is_thread
            java.lang.String r13 = r2.title
            if (r13 == 0) goto L43
            boolean r0 = X.C7BY.A0j(r13)
            if (r0 == 0) goto L44
        L43:
            r13 = r1
        L44:
            int r14 = r2.unread_count
            boolean r0 = r2.pinned
            if (r0 != 0) goto L4f
            boolean r0 = r2.is_pinned
            r15 = 0
            if (r0 == 0) goto L50
        L4f:
            r15 = 1
        L50:
            java.lang.String r3 = r2.channel
            java.lang.String r1 = r2.account_username
            boolean r0 = r2.can_send_messages
            com.facebook.aura.gateway.HatchSessionItem r4 = new com.facebook.aura.gateway.HatchSessionItem
            r18 = r1
            r19 = r0
            r17 = r3
            r4.<init>(r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r2.archived
            com.facebook.aura.gateway.HatchSessionUpdate r0 = new com.facebook.aura.gateway.HatchSessionUpdate
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.SessionUpdatedSessionJson.toSessionUpdate():com.facebook.aura.gateway.HatchSessionUpdate");
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ SessionUpdatedSessionJson copy$default(SessionUpdatedSessionJson sessionUpdatedSessionJson, String str, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, String str4, String str5, String str6, boolean z5, int i2, Object obj) {
        String str7 = str;
        Long l7 = l;
        Long l8 = l2;
        Long l9 = l3;
        Long l10 = l4;
        Long l11 = l5;
        Long l12 = l6;
        String str8 = str2;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        int i3 = i;
        String str9 = str3;
        boolean z9 = z4;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        boolean z10 = z5;
        if ((i2 & 1) != 0) {
            str7 = sessionUpdatedSessionJson.session_id;
        }
        if ((i2 & 2) != 0) {
            l7 = sessionUpdatedSessionJson.created_at_ms;
        }
        if ((i2 & 4) != 0) {
            l8 = sessionUpdatedSessionJson.created_at;
        }
        if ((i2 & 8) != 0) {
            l9 = sessionUpdatedSessionJson.createdAt;
        }
        if ((i2 & 16) != 0) {
            l10 = sessionUpdatedSessionJson.updated_at_ms;
        }
        if ((i2 & 32) != 0) {
            l11 = sessionUpdatedSessionJson.updated_at;
        }
        if ((i2 & 64) != 0) {
            l12 = sessionUpdatedSessionJson.updatedAt;
        }
        if ((i2 & 128) != 0) {
            str8 = sessionUpdatedSessionJson.status;
        }
        if ((i2 & 256) != 0) {
            z6 = sessionUpdatedSessionJson.archived;
        }
        if ((i2 & 512) != 0) {
            z7 = sessionUpdatedSessionJson.pinned;
        }
        if ((i2 & 1024) != 0) {
            z8 = sessionUpdatedSessionJson.is_pinned;
        }
        if ((i2 & 2048) != 0) {
            i3 = sessionUpdatedSessionJson.unread_count;
        }
        if ((i2 & 4096) != 0) {
            str9 = sessionUpdatedSessionJson.snippet;
        }
        if ((i2 & 8192) != 0) {
            z9 = sessionUpdatedSessionJson.is_thread;
        }
        if ((i2 & 16384) != 0) {
            str10 = sessionUpdatedSessionJson.title;
        }
        if ((i2 & 32768) != 0) {
            str11 = sessionUpdatedSessionJson.channel;
        }
        if ((i2 & 65536) != 0) {
            str12 = sessionUpdatedSessionJson.account_username;
        }
        if ((i2 & 131072) != 0) {
            z10 = sessionUpdatedSessionJson.can_send_messages;
        }
        Long l13 = l11;
        Long l14 = l12;
        String str13 = str8;
        return sessionUpdatedSessionJson.copy(str7, l7, l8, l9, l10, l13, l14, str13, z6, z7, z8, i3, str9, z9, str10, str11, str12, z10);
    }

    public SessionUpdatedSessionJson(String str, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, String str4, String str5, String str6, boolean z5) {
        C60O.A1M(str, 0, str2);
        this.session_id = str;
        this.created_at_ms = l;
        this.created_at = l2;
        this.createdAt = l3;
        this.updated_at_ms = l4;
        this.updated_at = l5;
        this.updatedAt = l6;
        this.status = str2;
        this.archived = z;
        this.pinned = z2;
        this.is_pinned = z3;
        this.unread_count = i;
        this.snippet = str3;
        this.is_thread = z4;
        this.title = str4;
        this.channel = str5;
        this.account_username = str6;
        this.can_send_messages = z5;
    }

    public /* synthetic */ SessionUpdatedSessionJson(int i, String str, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str2, boolean z, boolean z2, boolean z3, int i2, String str3, boolean z4, String str4, String str5, String str6, boolean z5, C2hx c2hx) {
        boolean z6 = z5;
        if ((i & 1) == 0) {
            this.session_id = "";
        } else {
            this.session_id = str;
        }
        if ((i & 2) == 0) {
            this.created_at_ms = null;
        } else {
            this.created_at_ms = l;
        }
        if ((i & 4) == 0) {
            this.created_at = null;
        } else {
            this.created_at = l2;
        }
        if ((i & 8) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = l3;
        }
        if ((i & 16) == 0) {
            this.updated_at_ms = null;
        } else {
            this.updated_at_ms = l4;
        }
        if ((i & 32) == 0) {
            this.updated_at = null;
        } else {
            this.updated_at = l5;
        }
        if ((i & 64) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = l6;
        }
        if ((i & 128) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
        if ((i & 256) == 0) {
            this.archived = false;
        } else {
            this.archived = z;
        }
        if ((i & 512) == 0) {
            this.pinned = false;
        } else {
            this.pinned = z2;
        }
        if ((i & 1024) == 0) {
            this.is_pinned = false;
        } else {
            this.is_pinned = z3;
        }
        if ((i & 2048) == 0) {
            this.unread_count = 0;
        } else {
            this.unread_count = i2;
        }
        if ((i & 4096) == 0) {
            this.snippet = null;
        } else {
            this.snippet = str3;
        }
        if ((i & 8192) == 0) {
            this.is_thread = false;
        } else {
            this.is_thread = z4;
        }
        if ((i & 16384) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((32768 & i) == 0) {
            this.channel = null;
        } else {
            this.channel = str5;
        }
        if ((65536 & i) == 0) {
            this.account_username = null;
        } else {
            this.account_username = str6;
        }
        this.can_send_messages = (i & 131072) == 0 ? true : z6;
    }

    public SessionUpdatedSessionJson() {
        this("", null, null, null, null, null, null, "", false, false, false, 0, null, false, null, null, null, true);
    }
}

package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SessionItemJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String account_username;
    public final boolean archived;
    public final boolean can_send_messages;
    public final String channel;
    public final long created_at_ms;
    public final boolean is_pinned;
    public final boolean is_primary;
    public final boolean is_thread;
    public final boolean pinned;
    public final String session_id;
    public final String snippet;
    public final String status;
    public final String title;
    public final int unread_count;
    public final long updated_at_ms;

    public final class Companion {
        public final C9hr<SessionItemJson> serializer() {
            return SessionItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(SessionItemJson sessionItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(sessionItemJson.session_id)) {
            c9j5.AAV(sessionItemJson.session_id, c9iZ, 0);
        }
        if (zAfR || sessionItemJson.created_at_ms != 0) {
            c9j5.AAN(c9iZ, 1, sessionItemJson.created_at_ms);
        }
        if (zAfR || sessionItemJson.updated_at_ms != 0) {
            c9j5.AAN(c9iZ, 2, sessionItemJson.updated_at_ms);
        }
        if (zAfR || !"".equals(sessionItemJson.status)) {
            c9j5.AAV(sessionItemJson.status, c9iZ, 3);
        }
        if (zAfR || sessionItemJson.snippet != null) {
            c9j5.AAP(sessionItemJson.snippet, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || sessionItemJson.is_thread) {
            c9j5.AA7(c9iZ, 5, sessionItemJson.is_thread);
        }
        if (zAfR || sessionItemJson.title != null) {
            c9j5.AAP(sessionItemJson.title, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || sessionItemJson.unread_count != 0) {
            c9j5.AAK(c9iZ, 7, sessionItemJson.unread_count);
        }
        if (zAfR || sessionItemJson.archived) {
            c9j5.AA7(c9iZ, 8, sessionItemJson.archived);
        }
        if (zAfR || sessionItemJson.pinned) {
            c9j5.AA7(c9iZ, 9, sessionItemJson.pinned);
        }
        if (zAfR || sessionItemJson.is_pinned) {
            c9j5.AA7(c9iZ, 10, sessionItemJson.is_pinned);
        }
        if (zAfR || sessionItemJson.is_primary) {
            c9j5.AA7(c9iZ, 11, sessionItemJson.is_primary);
        }
        if (zAfR || sessionItemJson.channel != null) {
            c9j5.AAP(sessionItemJson.channel, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || sessionItemJson.account_username != null) {
            c9j5.AAP(sessionItemJson.account_username, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || !sessionItemJson.can_send_messages) {
            c9j5.AA7(c9iZ, 14, sessionItemJson.can_send_messages);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionItemJson) {
                SessionItemJson sessionItemJson = (SessionItemJson) obj;
                if (!C7384Etj.areEqual(this.session_id, sessionItemJson.session_id) || this.created_at_ms != sessionItemJson.created_at_ms || this.updated_at_ms != sessionItemJson.updated_at_ms || !C7384Etj.areEqual(this.status, sessionItemJson.status) || !C7384Etj.areEqual(this.snippet, sessionItemJson.snippet) || this.is_thread != sessionItemJson.is_thread || !C7384Etj.areEqual(this.title, sessionItemJson.title) || this.unread_count != sessionItemJson.unread_count || this.archived != sessionItemJson.archived || this.pinned != sessionItemJson.pinned || this.is_pinned != sessionItemJson.is_pinned || this.is_primary != sessionItemJson.is_primary || !C7384Etj.areEqual(this.channel, sessionItemJson.channel) || !C7384Etj.areEqual(this.account_username, sessionItemJson.account_username) || this.can_send_messages != sessionItemJson.can_send_messages) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SessionItemJson(String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, boolean z6, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, C3cH.A03(i2 & 2, j), (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) == 0 ? str2 : "", C3cG.A0e(str3, i2 & 16), C3cG.A1K(i2 & 32, z), C3cG.A0e(str4, i2 & 64), (i2 & 128) != 0 ? 0 : i, C3cG.A1K(i2 & 256, z2), C3cG.A1K(i2 & 512, z3), C3cG.A1K(i2 & 1024, z4), (i2 & 2048) == 0 ? z5 : false, C3cG.A0e(str5, i2 & 4096), C3cG.A0e(str6, i2 & 8192), C60Q.A1Q(i2 & 16384, z6));
    }

    public static /* synthetic */ SessionItemJson copy$default(SessionItemJson sessionItemJson, String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, boolean z6, int i2, Object obj) {
        String str7 = str;
        long j3 = j;
        long j4 = j2;
        String str8 = str2;
        String str9 = str3;
        boolean z7 = z;
        String str10 = str4;
        int i3 = i;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        String str11 = str5;
        String str12 = str6;
        boolean z12 = z6;
        if ((i2 & 1) != 0) {
            str7 = sessionItemJson.session_id;
        }
        if ((i2 & 2) != 0) {
            j3 = sessionItemJson.created_at_ms;
        }
        if ((i2 & 4) != 0) {
            j4 = sessionItemJson.updated_at_ms;
        }
        if ((i2 & 8) != 0) {
            str8 = sessionItemJson.status;
        }
        if ((i2 & 16) != 0) {
            str9 = sessionItemJson.snippet;
        }
        if ((i2 & 32) != 0) {
            z7 = sessionItemJson.is_thread;
        }
        if ((i2 & 64) != 0) {
            str10 = sessionItemJson.title;
        }
        if ((i2 & 128) != 0) {
            i3 = sessionItemJson.unread_count;
        }
        if ((i2 & 256) != 0) {
            z8 = sessionItemJson.archived;
        }
        if ((i2 & 512) != 0) {
            z9 = sessionItemJson.pinned;
        }
        if ((i2 & 1024) != 0) {
            z10 = sessionItemJson.is_pinned;
        }
        if ((i2 & 2048) != 0) {
            z11 = sessionItemJson.is_primary;
        }
        if ((i2 & 4096) != 0) {
            str11 = sessionItemJson.channel;
        }
        if ((i2 & 8192) != 0) {
            str12 = sessionItemJson.account_username;
        }
        if ((i2 & 16384) != 0) {
            z12 = sessionItemJson.can_send_messages;
        }
        AnonymousClass003.A0w(str7, str8);
        String str13 = str9;
        String str14 = str10;
        int i4 = i3;
        return new SessionItemJson(str7, j3, j4, str8, str13, z7, str14, i4, z8, z9, z10, z11, str11, str12, z12);
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

    public final boolean component12() {
        return this.is_primary;
    }

    public final String component13() {
        return this.channel;
    }

    public final String component14() {
        return this.account_username;
    }

    public final boolean component15() {
        return this.can_send_messages;
    }

    public final long component2() {
        return this.created_at_ms;
    }

    public final long component3() {
        return this.updated_at_ms;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.snippet;
    }

    public final boolean component6() {
        return this.is_thread;
    }

    public final String component7() {
        return this.title;
    }

    public final int component8() {
        return this.unread_count;
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

    public final long getCreated_at_ms() {
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

    public final long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((((C0KA.A01((AnonymousClass005.A0I(this.status, AnonymousClass006.A06(this.updated_at_ms, AnonymousClass006.A06(this.created_at_ms, AnonymousClass001.A0G(this.session_id)))) + AnonymousClass006.A0G(this.snippet)) * 31, this.is_thread) + AnonymousClass006.A0G(this.title)) * 31) + this.unread_count) * 31, this.archived), this.pinned), this.is_pinned), this.is_primary) + AnonymousClass006.A0G(this.channel)) * 31) + AnonymousClass005.A0H(this.account_username)) * 31, this.can_send_messages);
    }

    public final boolean is_pinned() {
        return this.is_pinned;
    }

    public final boolean is_primary() {
        return this.is_primary;
    }

    public final boolean is_thread() {
        return this.is_thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.HatchSessionItem toDomain() {
        /*
            r17 = this;
            r2 = r17
            long r6 = r2.updated_at_ms
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto Lc
            long r6 = r2.created_at_ms
        Lc:
            java.lang.String r3 = r2.session_id
            long r4 = r2.created_at_ms
            java.lang.String r8 = r2.status
            java.lang.String r9 = r2.snippet
            r1 = 0
            if (r9 == 0) goto L1d
            boolean r0 = X.C7BY.A0j(r9)
            if (r0 == 0) goto L1e
        L1d:
            r9 = r1
        L1e:
            boolean r10 = r2.is_thread
            java.lang.String r11 = r2.title
            if (r11 == 0) goto L2a
            boolean r0 = X.C7BY.A0j(r11)
            if (r0 == 0) goto L2b
        L2a:
            r11 = r1
        L2b:
            int r12 = r2.unread_count
            boolean r0 = r2.pinned
            if (r0 != 0) goto L36
            boolean r0 = r2.is_pinned
            r13 = 0
            if (r0 == 0) goto L37
        L36:
            r13 = 1
        L37:
            boolean r14 = r2.is_primary
            java.lang.String r15 = r2.channel
            java.lang.String r1 = r2.account_username
            boolean r0 = r2.can_send_messages
            com.facebook.aura.gateway.HatchSessionItem r2 = new com.facebook.aura.gateway.HatchSessionItem
            r17 = r0
            r16 = r1
            r2.<init>(r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.SessionItemJson.toDomain():com.facebook.aura.gateway.HatchSessionItem");
    }

    public final SessionItemJson copy(String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, boolean z6) {
        AnonymousClass003.A0w(str, str2);
        return new SessionItemJson(str, j, j2, str2, str3, z, str4, i, z2, z3, z4, z5, str5, str6, z6);
    }

    public final SessionDetails toDetails(boolean z) {
        String str;
        HatchSessionItem domain = toDomain();
        boolean z2 = true;
        if (!z && !this.archived && ((str = this.status) == null || !str.equalsIgnoreCase("archived"))) {
            z2 = false;
        }
        return new SessionDetails(domain, z2);
    }

    public String toString() {
        return super.toString();
    }

    public SessionItemJson(String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, boolean z6) {
        AnonymousClass003.A0w(str, str2);
        this.session_id = str;
        this.created_at_ms = j;
        this.updated_at_ms = j2;
        this.status = str2;
        this.snippet = str3;
        this.is_thread = z;
        this.title = str4;
        this.unread_count = i;
        this.archived = z2;
        this.pinned = z3;
        this.is_pinned = z4;
        this.is_primary = z5;
        this.channel = str5;
        this.account_username = str6;
        this.can_send_messages = z6;
    }

    public /* synthetic */ SessionItemJson(int i, String str, long j, long j2, String str2, String str3, boolean z, String str4, int i2, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, boolean z6, C2hx c2hx) {
        boolean z7 = z6;
        if ((i & 1) == 0) {
            this.session_id = "";
        } else {
            this.session_id = str;
        }
        if ((i & 2) == 0) {
            this.created_at_ms = 0L;
        } else {
            this.created_at_ms = j;
        }
        if ((i & 4) == 0) {
            this.updated_at_ms = 0L;
        } else {
            this.updated_at_ms = j2;
        }
        if ((i & 8) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
        if ((i & 16) == 0) {
            this.snippet = null;
        } else {
            this.snippet = str3;
        }
        if ((i & 32) == 0) {
            this.is_thread = false;
        } else {
            this.is_thread = z;
        }
        if ((i & 64) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 128) == 0) {
            this.unread_count = 0;
        } else {
            this.unread_count = i2;
        }
        if ((i & 256) == 0) {
            this.archived = false;
        } else {
            this.archived = z2;
        }
        if ((i & 512) == 0) {
            this.pinned = false;
        } else {
            this.pinned = z3;
        }
        if ((i & 1024) == 0) {
            this.is_pinned = false;
        } else {
            this.is_pinned = z4;
        }
        if ((i & 2048) == 0) {
            this.is_primary = false;
        } else {
            this.is_primary = z5;
        }
        if ((i & 4096) == 0) {
            this.channel = null;
        } else {
            this.channel = str5;
        }
        if ((i & 8192) == 0) {
            this.account_username = null;
        } else {
            this.account_username = str6;
        }
        this.can_send_messages = (i & 16384) == 0 ? true : z7;
    }

    public SessionItemJson() {
        this("", 0L, 0L, "", null, false, null, 0, false, false, false, false, null, null, true);
    }
}

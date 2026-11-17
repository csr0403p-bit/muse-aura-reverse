package com.facebook.aura.notifications.push;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class AuraPushWireJson extends C06G {
    public final String collapse_key;
    public final boolean is_logged_out_push;
    public final String message;
    public final String ndid;
    public final String notification_type;
    public final Map<String, String> params;
    public final String subtitle;
    public final Long target_uid;
    public final long time;
    public final String title;
    public final String type;
    public final Integer unread_count;
    public final String vm_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, AuraPushWireJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null};

    public final class Companion {
        public final C9hr<AuraPushWireJson> serializer() {
            return AuraPushWireJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraPushWireJson() {
        this("", 0L, null, null, null, null, AGH.A0E(), false, null, null, null, null, null);
    }

    public final AuraPushWireJson copy(String str, long j, String str2, String str3, String str4, Long l, Map<String, String> map, boolean z, String str5, String str6, String str7, Integer num, String str8) {
        AnonymousClass002.A1E(str, 0, map);
        return new AuraPushWireJson(str, j, str2, str3, str4, l, map, z, str5, str6, str7, num, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraPushWireJson) {
                AuraPushWireJson auraPushWireJson = (AuraPushWireJson) obj;
                if (!C7384Etj.areEqual(this.type, auraPushWireJson.type) || this.time != auraPushWireJson.time || !C7384Etj.areEqual(this.title, auraPushWireJson.title) || !C7384Etj.areEqual(this.subtitle, auraPushWireJson.subtitle) || !C7384Etj.areEqual(this.message, auraPushWireJson.message) || !C7384Etj.areEqual(this.target_uid, auraPushWireJson.target_uid) || !C7384Etj.areEqual(this.params, auraPushWireJson.params) || this.is_logged_out_push != auraPushWireJson.is_logged_out_push || !C7384Etj.areEqual(this.ndid, auraPushWireJson.ndid) || !C7384Etj.areEqual(this.collapse_key, auraPushWireJson.collapse_key) || !C7384Etj.areEqual(this.notification_type, auraPushWireJson.notification_type) || !C7384Etj.areEqual(this.unread_count, auraPushWireJson.unread_count) || !C7384Etj.areEqual(this.vm_id, auraPushWireJson.vm_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(AuraPushWireJson auraPushWireJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(auraPushWireJson.type)) {
            c9j5.AAV(auraPushWireJson.type, c9iZ, 0);
        }
        if (zAfR || auraPushWireJson.time != 0) {
            c9j5.AAN(c9iZ, 1, auraPushWireJson.time);
        }
        if (zAfR || auraPushWireJson.title != null) {
            c9j5.AAP(auraPushWireJson.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || auraPushWireJson.subtitle != null) {
            c9j5.AAP(auraPushWireJson.subtitle, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || auraPushWireJson.message != null) {
            c9j5.AAP(auraPushWireJson.message, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || auraPushWireJson.target_uid != null) {
            c9j5.AAP(auraPushWireJson.target_uid, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || !C7384Etj.areEqual(auraPushWireJson.params, AGH.A0E())) {
            c9j5.AAQ(auraPushWireJson.params, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || auraPushWireJson.is_logged_out_push) {
            c9j5.AA7(c9iZ, 7, auraPushWireJson.is_logged_out_push);
        }
        if (zAfR || auraPushWireJson.ndid != null) {
            c9j5.AAP(auraPushWireJson.ndid, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || auraPushWireJson.collapse_key != null) {
            c9j5.AAP(auraPushWireJson.collapse_key, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || auraPushWireJson.notification_type != null) {
            c9j5.AAP(auraPushWireJson.notification_type, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || auraPushWireJson.unread_count != null) {
            c9j5.AAP(auraPushWireJson.unread_count, C07729ii.A00, c9iZ, 11);
        }
        if (zAfR || auraPushWireJson.vm_id != null) {
            c9j5.AAP(auraPushWireJson.vm_id, C07779iq.A01, c9iZ, 12);
        }
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.collapse_key;
    }

    public final String component11() {
        return this.notification_type;
    }

    public final Integer component12() {
        return this.unread_count;
    }

    public final String component13() {
        return this.vm_id;
    }

    public final long component2() {
        return this.time;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.message;
    }

    public final Long component6() {
        return this.target_uid;
    }

    public final Map<String, String> component7() {
        return this.params;
    }

    public final boolean component8() {
        return this.is_logged_out_push;
    }

    public final String component9() {
        return this.ndid;
    }

    public final String getCollapse_key() {
        return this.collapse_key;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNdid() {
        return this.ndid;
    }

    public final String getNotification_type() {
        return this.notification_type;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Long getTarget_uid() {
        return this.target_uid;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getUnread_count() {
        return this.unread_count;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return ((((((((C0KA.A01(AnonymousClass005.A0F(this.params, (((((((C60R.A00(this.time, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass006.A0D(this.target_uid)) * 31), this.is_logged_out_push) + AnonymousClass006.A0G(this.ndid)) * 31) + AnonymousClass006.A0G(this.collapse_key)) * 31) + AnonymousClass006.A0G(this.notification_type)) * 31) + AnonymousClass006.A0D(this.unread_count)) * 31) + AnonymousClass005.A0H(this.vm_id);
    }

    public final boolean is_logged_out_push() {
        return this.is_logged_out_push;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ AuraPushWireJson copy$default(AuraPushWireJson auraPushWireJson, String str, long j, String str2, String str3, String str4, Long l, Map map, boolean z, String str5, String str6, String str7, Integer num, String str8, int i, Object obj) {
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        Long l2 = l;
        Map map2 = map;
        boolean z2 = z;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        Integer num2 = num;
        String str15 = str8;
        if ((i & 1) != 0) {
            str = auraPushWireJson.type;
        }
        if ((i & 2) != 0) {
            j = auraPushWireJson.time;
        }
        if ((i & 4) != 0) {
            str9 = auraPushWireJson.title;
        }
        if ((i & 8) != 0) {
            str10 = auraPushWireJson.subtitle;
        }
        if ((i & 16) != 0) {
            str11 = auraPushWireJson.message;
        }
        if ((i & 32) != 0) {
            l2 = auraPushWireJson.target_uid;
        }
        if ((i & 64) != 0) {
            map2 = auraPushWireJson.params;
        }
        if ((i & 128) != 0) {
            z2 = auraPushWireJson.is_logged_out_push;
        }
        if ((i & 256) != 0) {
            str12 = auraPushWireJson.ndid;
        }
        if ((i & 512) != 0) {
            str13 = auraPushWireJson.collapse_key;
        }
        if ((i & 1024) != 0) {
            str14 = auraPushWireJson.notification_type;
        }
        if ((i & 2048) != 0) {
            num2 = auraPushWireJson.unread_count;
        }
        if ((i & 4096) != 0) {
            str15 = auraPushWireJson.vm_id;
        }
        return auraPushWireJson.copy(str, j, str9, str10, str11, l2, map2, z2, str12, str13, str14, num2, str15);
    }

    public /* synthetic */ AuraPushWireJson(String str, long j, String str2, String str3, String str4, Long l, Map map, boolean z, String str5, String str6, String str7, Integer num, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, C3cH.A03(i & 2, j), (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? AGH.A0E() : map, C3cH.A1N(i, z), (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : str8);
    }

    public AuraPushWireJson(String str, long j, String str2, String str3, String str4, Long l, Map<String, String> map, boolean z, String str5, String str6, String str7, Integer num, String str8) {
        AnonymousClass002.A1E(str, 0, map);
        this.type = str;
        this.time = j;
        this.title = str2;
        this.subtitle = str3;
        this.message = str4;
        this.target_uid = l;
        this.params = map;
        this.is_logged_out_push = z;
        this.ndid = str5;
        this.collapse_key = str6;
        this.notification_type = str7;
        this.unread_count = num;
        this.vm_id = str8;
    }

    public /* synthetic */ AuraPushWireJson(int i, String str, long j, String str2, String str3, String str4, Long l, Map map, boolean z, String str5, String str6, String str7, Integer num, String str8, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.time = 0L;
        } else {
            this.time = j;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 16) == 0) {
            this.message = null;
        } else {
            this.message = str4;
        }
        if ((i & 32) == 0) {
            this.target_uid = null;
        } else {
            this.target_uid = l;
        }
        if ((i & 64) == 0) {
            this.params = AGH.A0E();
        } else {
            this.params = map;
        }
        if ((i & 128) == 0) {
            this.is_logged_out_push = false;
        } else {
            this.is_logged_out_push = z;
        }
        if ((i & 256) == 0) {
            this.ndid = null;
        } else {
            this.ndid = str5;
        }
        if ((i & 512) == 0) {
            this.collapse_key = null;
        } else {
            this.collapse_key = str6;
        }
        if ((i & 1024) == 0) {
            this.notification_type = null;
        } else {
            this.notification_type = str7;
        }
        if ((i & 2048) == 0) {
            this.unread_count = null;
        } else {
            this.unread_count = num;
        }
        if ((i & 4096) == 0) {
            this.vm_id = null;
        } else {
            this.vm_id = str8;
        }
    }
}

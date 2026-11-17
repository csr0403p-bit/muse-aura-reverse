package com.facebook.aura.widgets;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ListWidgetItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String emoji;
    public final String icon_file;
    public final String id;
    public final boolean is_color_icon;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<ListWidgetItemJson> serializer() {
            return ListWidgetItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ListWidgetItemJson copy$default(ListWidgetItemJson listWidgetItemJson, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str6 = listWidgetItemJson.id;
        }
        if ((i & 2) != 0) {
            str7 = listWidgetItemJson.title;
        }
        if ((i & 4) != 0) {
            str8 = listWidgetItemJson.subtitle;
        }
        if ((i & 8) != 0) {
            str9 = listWidgetItemJson.emoji;
        }
        if ((i & 16) != 0) {
            str10 = listWidgetItemJson.icon_file;
        }
        if ((i & 32) != 0) {
            z2 = listWidgetItemJson.is_color_icon;
        }
        AnonymousClass005.A0x(str6, str7, str8);
        return new ListWidgetItemJson(str6, str7, str8, str9, str10, z2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(ListWidgetItemJson listWidgetItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(listWidgetItemJson.id)) {
            c9j5.AAV(listWidgetItemJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(listWidgetItemJson.title)) {
            c9j5.AAV(listWidgetItemJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(listWidgetItemJson.subtitle)) {
            c9j5.AAV(listWidgetItemJson.subtitle, c9iZ, 2);
        }
        if (zAfR || listWidgetItemJson.emoji != null) {
            c9j5.AAP(listWidgetItemJson.emoji, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || listWidgetItemJson.icon_file != null) {
            c9j5.AAP(listWidgetItemJson.icon_file, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || listWidgetItemJson.is_color_icon) {
            c9j5.AA7(c9iZ, 5, listWidgetItemJson.is_color_icon);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ListWidgetItemJson) {
                ListWidgetItemJson listWidgetItemJson = (ListWidgetItemJson) obj;
                if (!C7384Etj.areEqual(this.id, listWidgetItemJson.id) || !C7384Etj.areEqual(this.title, listWidgetItemJson.title) || !C7384Etj.areEqual(this.subtitle, listWidgetItemJson.subtitle) || !C7384Etj.areEqual(this.emoji, listWidgetItemJson.emoji) || !C7384Etj.areEqual(this.icon_file, listWidgetItemJson.icon_file) || this.is_color_icon != listWidgetItemJson.is_color_icon) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.emoji;
    }

    public final String component5() {
        return this.icon_file;
    }

    public final boolean component6() {
        return this.is_color_icon;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIcon_file() {
        return this.icon_file;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0I(this.subtitle, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass005.A0H(this.icon_file)) * 31, this.is_color_icon);
    }

    public final boolean is_color_icon() {
        return this.is_color_icon;
    }

    public ListWidgetItemJson(String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.emoji = str4;
        this.icon_file = str5;
        this.is_color_icon = z;
    }

    public final ListWidgetItemJson copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ListWidgetItemJson(str, str2, str3, str4, str5, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ListWidgetItemJson(String str, String str2, String str3, String str4, String str5, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, AnonymousClass002.A1R(i, z));
    }

    public /* synthetic */ ListWidgetItemJson(int i, String str, String str2, String str3, String str4, String str5, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str4;
        }
        if ((i & 16) == 0) {
            this.icon_file = null;
        } else {
            this.icon_file = str5;
        }
        if ((i & 32) == 0) {
            this.is_color_icon = false;
        } else {
            this.is_color_icon = z;
        }
    }

    public ListWidgetItemJson() {
        this("", "", "", null, null, false);
    }
}

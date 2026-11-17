package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C8j5;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserActionJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action;
    public final String attribute;
    public final String direction;

    /* renamed from: double, reason: not valid java name */
    public final boolean f76double;
    public final String key;
    public final String locator;
    public final Long pixels;
    public final Long poll_ms;
    public final boolean right;
    public final boolean submit;
    public final String target;
    public final String text;
    public final String text_gone;
    public final Long time_ms;
    public final Long timeout_ms;
    public final String url;
    public final String value;

    public final class Companion {
        public final C9hr<ManagedBrowserActionJson> serializer() {
            return ManagedBrowserActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserActionJson managedBrowserActionJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(managedBrowserActionJson.action, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || managedBrowserActionJson.locator != null) {
            c9j5.AAP(managedBrowserActionJson.locator, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || managedBrowserActionJson.url != null) {
            c9j5.AAP(managedBrowserActionJson.url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || managedBrowserActionJson.text != null) {
            c9j5.AAP(managedBrowserActionJson.text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || managedBrowserActionJson.text_gone != null) {
            c9j5.AAP(managedBrowserActionJson.text_gone, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || managedBrowserActionJson.value != null) {
            c9j5.AAP(managedBrowserActionJson.value, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || managedBrowserActionJson.key != null) {
            c9j5.AAP(managedBrowserActionJson.key, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || managedBrowserActionJson.attribute != null) {
            c9j5.AAP(managedBrowserActionJson.attribute, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || managedBrowserActionJson.target != null) {
            c9j5.AAP(managedBrowserActionJson.target, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || managedBrowserActionJson.direction != null) {
            c9j5.AAP(managedBrowserActionJson.direction, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || managedBrowserActionJson.pixels != null) {
            c9j5.AAP(managedBrowserActionJson.pixels, C9j1.A00, c9iZ, 10);
        }
        if (zAfR || managedBrowserActionJson.time_ms != null) {
            c9j5.AAP(managedBrowserActionJson.time_ms, C9j1.A00, c9iZ, 11);
        }
        if (zAfR || managedBrowserActionJson.timeout_ms != null) {
            c9j5.AAP(managedBrowserActionJson.timeout_ms, C9j1.A00, c9iZ, 12);
        }
        if (zAfR || managedBrowserActionJson.poll_ms != null) {
            c9j5.AAP(managedBrowserActionJson.poll_ms, C9j1.A00, c9iZ, 13);
        }
        if (zAfR || managedBrowserActionJson.right) {
            c9j5.AA7(c9iZ, 14, managedBrowserActionJson.right);
        }
        if (zAfR || managedBrowserActionJson.f76double) {
            c9j5.AA7(c9iZ, 15, managedBrowserActionJson.f76double);
        }
        if (zAfR || managedBrowserActionJson.submit) {
            c9j5.AA7(c9iZ, 16, managedBrowserActionJson.submit);
        }
    }

    public final ManagedBrowserActionJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(str, 0);
        return new ManagedBrowserActionJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, l, l2, l3, l4, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserActionJson) {
                ManagedBrowserActionJson managedBrowserActionJson = (ManagedBrowserActionJson) obj;
                if (!C7384Etj.areEqual(this.action, managedBrowserActionJson.action) || !C7384Etj.areEqual(this.locator, managedBrowserActionJson.locator) || !C7384Etj.areEqual(this.url, managedBrowserActionJson.url) || !C7384Etj.areEqual(this.text, managedBrowserActionJson.text) || !C7384Etj.areEqual(this.text_gone, managedBrowserActionJson.text_gone) || !C7384Etj.areEqual(this.value, managedBrowserActionJson.value) || !C7384Etj.areEqual(this.key, managedBrowserActionJson.key) || !C7384Etj.areEqual(this.attribute, managedBrowserActionJson.attribute) || !C7384Etj.areEqual(this.target, managedBrowserActionJson.target) || !C7384Etj.areEqual(this.direction, managedBrowserActionJson.direction) || !C7384Etj.areEqual(this.pixels, managedBrowserActionJson.pixels) || !C7384Etj.areEqual(this.time_ms, managedBrowserActionJson.time_ms) || !C7384Etj.areEqual(this.timeout_ms, managedBrowserActionJson.timeout_ms) || !C7384Etj.areEqual(this.poll_ms, managedBrowserActionJson.poll_ms) || this.right != managedBrowserActionJson.right || this.f76double != managedBrowserActionJson.f76double || this.submit != managedBrowserActionJson.submit) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserActionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : l3, (i & 8192) == 0 ? l4 : null, C3cG.A1K(i & 16384, z), C3cH.A1L(i, 32768, z2), C3cH.A1L(i, 65536, z3));
    }

    public static /* synthetic */ ManagedBrowserActionJson copy$default(ManagedBrowserActionJson managedBrowserActionJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3, int i, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        Long l5 = l;
        Long l6 = l2;
        Long l7 = l3;
        Long l8 = l4;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            str11 = managedBrowserActionJson.action;
        }
        if ((i & 2) != 0) {
            str12 = managedBrowserActionJson.locator;
        }
        if ((i & 4) != 0) {
            str13 = managedBrowserActionJson.url;
        }
        if ((i & 8) != 0) {
            str14 = managedBrowserActionJson.text;
        }
        if ((i & 16) != 0) {
            str15 = managedBrowserActionJson.text_gone;
        }
        if ((i & 32) != 0) {
            str16 = managedBrowserActionJson.value;
        }
        if ((i & 64) != 0) {
            str17 = managedBrowserActionJson.key;
        }
        if ((i & 128) != 0) {
            str18 = managedBrowserActionJson.attribute;
        }
        if ((i & 256) != 0) {
            str19 = managedBrowserActionJson.target;
        }
        if ((i & 512) != 0) {
            str20 = managedBrowserActionJson.direction;
        }
        if ((i & 1024) != 0) {
            l5 = managedBrowserActionJson.pixels;
        }
        if ((i & 2048) != 0) {
            l6 = managedBrowserActionJson.time_ms;
        }
        if ((i & 4096) != 0) {
            l7 = managedBrowserActionJson.timeout_ms;
        }
        if ((i & 8192) != 0) {
            l8 = managedBrowserActionJson.poll_ms;
        }
        if ((i & 16384) != 0) {
            z4 = managedBrowserActionJson.right;
        }
        if ((i & 32768) != 0) {
            z5 = managedBrowserActionJson.f76double;
        }
        if ((i & 65536) != 0) {
            z6 = managedBrowserActionJson.submit;
        }
        String str21 = str15;
        return managedBrowserActionJson.copy(str11, str12, str13, str14, str21, str16, str17, str18, str19, str20, l5, l6, l7, l8, z4, z5, z6);
    }

    public final String component1() {
        return this.action;
    }

    public final String component10() {
        return this.direction;
    }

    public final Long component11() {
        return this.pixels;
    }

    public final Long component12() {
        return this.time_ms;
    }

    public final Long component13() {
        return this.timeout_ms;
    }

    public final Long component14() {
        return this.poll_ms;
    }

    public final boolean component15() {
        return this.right;
    }

    public final boolean component16() {
        return this.f76double;
    }

    public final boolean component17() {
        return this.submit;
    }

    public final String component2() {
        return this.locator;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.text;
    }

    public final String component5() {
        return this.text_gone;
    }

    public final String component6() {
        return this.value;
    }

    public final String component7() {
        return this.key;
    }

    public final String component8() {
        return this.attribute;
    }

    public final String component9() {
        return this.target;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAttribute() {
        return this.attribute;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final boolean getDouble() {
        return this.f76double;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLocator() {
        return this.locator;
    }

    public final Long getPixels() {
        return this.pixels;
    }

    public final Long getPoll_ms() {
        return this.poll_ms;
    }

    public final boolean getRight() {
        return this.right;
    }

    public final boolean getSubmit() {
        return this.submit;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getText() {
        return this.text;
    }

    public final String getText_gone() {
        return this.text_gone;
    }

    public final Long getTime_ms() {
        return this.time_ms;
    }

    public final Long getTimeout_ms() {
        return this.timeout_ms;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((((((((((((((((((((((((((AnonymousClass001.A0G(this.action) + AnonymousClass006.A0G(this.locator)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.text)) * 31) + AnonymousClass006.A0G(this.text_gone)) * 31) + AnonymousClass006.A0G(this.value)) * 31) + AnonymousClass006.A0G(this.key)) * 31) + AnonymousClass006.A0G(this.attribute)) * 31) + AnonymousClass006.A0G(this.target)) * 31) + AnonymousClass006.A0G(this.direction)) * 31) + AnonymousClass006.A0D(this.pixels)) * 31) + AnonymousClass006.A0D(this.time_ms)) * 31) + AnonymousClass006.A0D(this.timeout_ms)) * 31) + C3cH.A02(this.poll_ms)) * 31, this.right), this.f76double), this.submit);
    }

    public String toString() {
        String str = this.action;
        String str2 = this.locator;
        String str3 = this.url;
        String str4 = this.text;
        String str5 = this.text_gone;
        String str6 = this.value;
        String str7 = this.key;
        String str8 = this.attribute;
        String str9 = this.target;
        String str10 = this.direction;
        Long l = this.pixels;
        Long l2 = this.time_ms;
        Long l3 = this.timeout_ms;
        Long l4 = this.poll_ms;
        boolean z = this.right;
        boolean z2 = this.f76double;
        boolean z3 = this.submit;
        StringBuilder sbA0x = C3cI.A0x("ManagedBrowserActionJson(action=", str);
        sbA0x.append(", locator=");
        sbA0x.append(str2);
        sbA0x.append(", url=");
        sbA0x.append(str3);
        sbA0x.append(", text=");
        sbA0x.append(str4);
        sbA0x.append(", text_gone=");
        sbA0x.append(str5);
        sbA0x.append(", value=");
        sbA0x.append(str6);
        sbA0x.append(", key=");
        sbA0x.append(str7);
        sbA0x.append(", attribute=");
        sbA0x.append(str8);
        sbA0x.append(", target=");
        sbA0x.append(str9);
        sbA0x.append(", direction=");
        sbA0x.append(str10);
        sbA0x.append(", pixels=");
        sbA0x.append(l);
        sbA0x.append(", time_ms=");
        sbA0x.append(l2);
        sbA0x.append(", timeout_ms=");
        sbA0x.append(l3);
        sbA0x.append(", poll_ms=");
        sbA0x.append(l4);
        sbA0x.append(", right=");
        sbA0x.append(z);
        sbA0x.append(", double=");
        sbA0x.append(z2);
        return C8j5.A0W(", submit=", sbA0x, z3);
    }

    public /* synthetic */ ManagedBrowserActionJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ManagedBrowserActionJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.action = str;
        if ((i & 2) == 0) {
            this.locator = null;
        } else {
            this.locator = str2;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.text = null;
        } else {
            this.text = str4;
        }
        if ((i & 16) == 0) {
            this.text_gone = null;
        } else {
            this.text_gone = str5;
        }
        if ((i & 32) == 0) {
            this.value = null;
        } else {
            this.value = str6;
        }
        if ((i & 64) == 0) {
            this.key = null;
        } else {
            this.key = str7;
        }
        if ((i & 128) == 0) {
            this.attribute = null;
        } else {
            this.attribute = str8;
        }
        if ((i & 256) == 0) {
            this.target = null;
        } else {
            this.target = str9;
        }
        if ((i & 512) == 0) {
            this.direction = null;
        } else {
            this.direction = str10;
        }
        if ((i & 1024) == 0) {
            this.pixels = null;
        } else {
            this.pixels = l;
        }
        if ((i & 2048) == 0) {
            this.time_ms = null;
        } else {
            this.time_ms = l2;
        }
        if ((i & 4096) == 0) {
            this.timeout_ms = null;
        } else {
            this.timeout_ms = l3;
        }
        if ((i & 8192) == 0) {
            this.poll_ms = null;
        } else {
            this.poll_ms = l4;
        }
        if ((i & 16384) == 0) {
            this.right = false;
        } else {
            this.right = z;
        }
        if ((32768 & i) == 0) {
            this.f76double = false;
        } else {
            this.f76double = z2;
        }
        if ((i & 65536) == 0) {
            this.submit = false;
        } else {
            this.submit = z3;
        }
    }

    public ManagedBrowserActionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(str, 0);
        this.action = str;
        this.locator = str2;
        this.url = str3;
        this.text = str4;
        this.text_gone = str5;
        this.value = str6;
        this.key = str7;
        this.attribute = str8;
        this.target = str9;
        this.direction = str10;
        this.pixels = l;
        this.time_ms = l2;
        this.timeout_ms = l3;
        this.poll_ms = l4;
        this.right = z;
        this.f76double = z2;
        this.submit = z3;
    }
}

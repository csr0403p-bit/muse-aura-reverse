package com.facebook.aura.model;

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
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import android.net.Uri;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskPresentationJson extends C06G {
    public final BrowserTaskTabJson active_tab;
    public final String activity_title;
    public final String browser_task_id;
    public final boolean capacity_blocked;
    public final String control_owner;
    public final BrowserTaskSiteJson current_site;
    public final String display_status;
    public final BrowserTaskExecutionJson execution;
    public final BrowserTaskScreenshotJson latest_screenshot;
    public final BrowserTaskTabJson latest_tab;
    public final Long next_parked_expires_at_ms;
    public final String node_id;
    public final String node_name;
    public final int occupied_slots;
    public final Long parked_expires_at_ms;
    public final boolean preview_available;
    public final Integer queue_position;
    public final String status;
    public final String terminal_reason;
    public final String title;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final int $stable = BrowserTaskExecutionJson.$stable;

    public final class Companion {
        public final C9hr<BrowserTaskPresentationJson> serializer() {
            return BrowserTaskPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskPresentationJson browserTaskPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(browserTaskPresentationJson.browser_task_id)) {
            c9j5.AAV(browserTaskPresentationJson.browser_task_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(browserTaskPresentationJson.title)) {
            c9j5.AAV(browserTaskPresentationJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(browserTaskPresentationJson.activity_title)) {
            c9j5.AAV(browserTaskPresentationJson.activity_title, c9iZ, 2);
        }
        if (zAfR || !"".equals(browserTaskPresentationJson.status)) {
            c9j5.AAV(browserTaskPresentationJson.status, c9iZ, 3);
        }
        if (zAfR || !"".equals(browserTaskPresentationJson.display_status)) {
            c9j5.AAV(browserTaskPresentationJson.display_status, c9iZ, 4);
        }
        if (zAfR || browserTaskPresentationJson.version != 0) {
            c9j5.AAK(c9iZ, 5, browserTaskPresentationJson.version);
        }
        if (zAfR || browserTaskPresentationJson.queue_position != null) {
            c9j5.AAP(browserTaskPresentationJson.queue_position, C07729ii.A00, c9iZ, 6);
        }
        if (zAfR || browserTaskPresentationJson.capacity_blocked) {
            c9j5.AA7(c9iZ, 7, browserTaskPresentationJson.capacity_blocked);
        }
        if (zAfR || browserTaskPresentationJson.occupied_slots != 0) {
            c9j5.AAK(c9iZ, 8, browserTaskPresentationJson.occupied_slots);
        }
        if (zAfR || browserTaskPresentationJson.parked_expires_at_ms != null) {
            c9j5.AAP(browserTaskPresentationJson.parked_expires_at_ms, C9j1.A00, c9iZ, 9);
        }
        if (zAfR || browserTaskPresentationJson.next_parked_expires_at_ms != null) {
            c9j5.AAP(browserTaskPresentationJson.next_parked_expires_at_ms, C9j1.A00, c9iZ, 10);
        }
        if (zAfR || !"".equals(browserTaskPresentationJson.terminal_reason)) {
            c9j5.AAV(browserTaskPresentationJson.terminal_reason, c9iZ, 11);
        }
        if (zAfR || browserTaskPresentationJson.latest_screenshot != null) {
            c9j5.AAP(browserTaskPresentationJson.latest_screenshot, BrowserTaskScreenshotJson$$serializer.INSTANCE, c9iZ, 12);
        }
        if (zAfR || browserTaskPresentationJson.current_site != null) {
            c9j5.AAP(browserTaskPresentationJson.current_site, BrowserTaskSiteJson$$serializer.INSTANCE, c9iZ, 13);
        }
        if (zAfR || browserTaskPresentationJson.active_tab != null) {
            c9j5.AAP(browserTaskPresentationJson.active_tab, BrowserTaskTabJson$$serializer.INSTANCE, c9iZ, 14);
        }
        if (zAfR || browserTaskPresentationJson.latest_tab != null) {
            c9j5.AAP(browserTaskPresentationJson.latest_tab, BrowserTaskTabJson$$serializer.INSTANCE, c9iZ, 15);
        }
        if (zAfR || browserTaskPresentationJson.preview_available) {
            c9j5.AA7(c9iZ, 16, browserTaskPresentationJson.preview_available);
        }
        if (zAfR || !"".equals(browserTaskPresentationJson.control_owner)) {
            c9j5.AAV(browserTaskPresentationJson.control_owner, c9iZ, 17);
        }
        if (zAfR || browserTaskPresentationJson.node_id != null) {
            c9j5.AAP(browserTaskPresentationJson.node_id, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || browserTaskPresentationJson.node_name != null) {
            c9j5.AAP(browserTaskPresentationJson.node_name, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || !C7384Etj.areEqual(browserTaskPresentationJson.execution, new BrowserTaskExecutionJson("vm", null))) {
            c9j5.AAP(browserTaskPresentationJson.execution, BrowserTaskExecutionJson$$serializer.INSTANCE, c9iZ, 20);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskPresentationJson) {
                BrowserTaskPresentationJson browserTaskPresentationJson = (BrowserTaskPresentationJson) obj;
                if (!C7384Etj.areEqual(this.browser_task_id, browserTaskPresentationJson.browser_task_id) || !C7384Etj.areEqual(this.title, browserTaskPresentationJson.title) || !C7384Etj.areEqual(this.activity_title, browserTaskPresentationJson.activity_title) || !C7384Etj.areEqual(this.status, browserTaskPresentationJson.status) || !C7384Etj.areEqual(this.display_status, browserTaskPresentationJson.display_status) || this.version != browserTaskPresentationJson.version || !C7384Etj.areEqual(this.queue_position, browserTaskPresentationJson.queue_position) || this.capacity_blocked != browserTaskPresentationJson.capacity_blocked || this.occupied_slots != browserTaskPresentationJson.occupied_slots || !C7384Etj.areEqual(this.parked_expires_at_ms, browserTaskPresentationJson.parked_expires_at_ms) || !C7384Etj.areEqual(this.next_parked_expires_at_ms, browserTaskPresentationJson.next_parked_expires_at_ms) || !C7384Etj.areEqual(this.terminal_reason, browserTaskPresentationJson.terminal_reason) || !C7384Etj.areEqual(this.latest_screenshot, browserTaskPresentationJson.latest_screenshot) || !C7384Etj.areEqual(this.current_site, browserTaskPresentationJson.current_site) || !C7384Etj.areEqual(this.active_tab, browserTaskPresentationJson.active_tab) || !C7384Etj.areEqual(this.latest_tab, browserTaskPresentationJson.latest_tab) || this.preview_available != browserTaskPresentationJson.preview_available || !C7384Etj.areEqual(this.control_owner, browserTaskPresentationJson.control_owner) || !C7384Etj.areEqual(this.node_id, browserTaskPresentationJson.node_id) || !C7384Etj.areEqual(this.node_name, browserTaskPresentationJson.node_name) || !C7384Etj.areEqual(this.execution, browserTaskPresentationJson.execution)) {
                }
            }
            return false;
        }
        return true;
    }

    private final BrowserTaskExecution executionDestination() {
        String strA0l;
        BrowserTaskExecution domain;
        String str = this.node_id;
        if (str == null) {
            BrowserTaskExecutionJson browserTaskExecutionJson = this.execution;
            if (browserTaskExecutionJson != null && (domain = browserTaskExecutionJson.toDomain()) != null) {
                return domain;
            }
        } else if (BrowserTaskExecutionJsonKt.isValidBrowserExecutionIdentity(str)) {
            BrowserTaskExecutionKind browserTaskExecutionKind = BrowserTaskExecutionKind.LOCAL_DEVICE;
            String str2 = this.node_id;
            String str3 = this.node_name;
            String str4 = null;
            if (str3 != null && (strA0l = AnonymousClass002.A0l(str3)) != null && BrowserTaskExecutionJsonKt.isValidBrowserExecutionIdentity(strA0l)) {
                str4 = strA0l;
            }
            return new BrowserTaskExecution(browserTaskExecutionKind, str2, str4);
        }
        int i = BrowserTaskExecution.$stable;
        return new BrowserTaskExecution(BrowserTaskExecutionKind.UNSUPPORTED, null, null);
    }

    public final String component1() {
        return this.browser_task_id;
    }

    public final Long component10() {
        return this.parked_expires_at_ms;
    }

    public final Long component11() {
        return this.next_parked_expires_at_ms;
    }

    public final String component12() {
        return this.terminal_reason;
    }

    public final BrowserTaskScreenshotJson component13() {
        return this.latest_screenshot;
    }

    public final BrowserTaskSiteJson component14() {
        return this.current_site;
    }

    public final BrowserTaskTabJson component15() {
        return this.active_tab;
    }

    public final BrowserTaskTabJson component16() {
        return this.latest_tab;
    }

    public final boolean component17() {
        return this.preview_available;
    }

    public final String component18() {
        return this.control_owner;
    }

    public final String component19() {
        return this.node_id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component20() {
        return this.node_name;
    }

    public final BrowserTaskExecutionJson component21() {
        return this.execution;
    }

    public final String component3() {
        return this.activity_title;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.display_status;
    }

    public final int component6() {
        return this.version;
    }

    public final Integer component7() {
        return this.queue_position;
    }

    public final boolean component8() {
        return this.capacity_blocked;
    }

    public final int component9() {
        return this.occupied_slots;
    }

    public final BrowserTaskTabJson getActive_tab() {
        return this.active_tab;
    }

    public final String getActivity_title() {
        return this.activity_title;
    }

    public final String getBrowser_task_id() {
        return this.browser_task_id;
    }

    public final boolean getCapacity_blocked() {
        return this.capacity_blocked;
    }

    public final String getControl_owner() {
        return this.control_owner;
    }

    public final BrowserTaskSiteJson getCurrent_site() {
        return this.current_site;
    }

    public final String getDisplay_status() {
        return this.display_status;
    }

    public final BrowserTaskExecutionJson getExecution() {
        return this.execution;
    }

    public final BrowserTaskScreenshotJson getLatest_screenshot() {
        return this.latest_screenshot;
    }

    public final BrowserTaskTabJson getLatest_tab() {
        return this.latest_tab;
    }

    public final Long getNext_parked_expires_at_ms() {
        return this.next_parked_expires_at_ms;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getNode_name() {
        return this.node_name;
    }

    public final int getOccupied_slots() {
        return this.occupied_slots;
    }

    public final Long getParked_expires_at_ms() {
        return this.parked_expires_at_ms;
    }

    public final boolean getPreview_available() {
        return this.preview_available;
    }

    public final Integer getQueue_position() {
        return this.queue_position;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTerminal_reason() {
        return this.terminal_reason;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.control_owner, C0KA.A01((((((((AnonymousClass005.A0I(this.terminal_reason, (((((C0KA.A01((((AnonymousClass005.A0I(this.display_status, AnonymousClass005.A0I(this.status, AnonymousClass005.A0I(this.activity_title, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.browser_task_id))))) + this.version) * 31) + AnonymousClass006.A0D(this.queue_position)) * 31, this.capacity_blocked) + this.occupied_slots) * 31) + AnonymousClass006.A0D(this.parked_expires_at_ms)) * 31) + AnonymousClass006.A0D(this.next_parked_expires_at_ms)) * 31) + AnonymousClass006.A0D(this.latest_screenshot)) * 31) + AnonymousClass006.A0D(this.current_site)) * 31) + AnonymousClass006.A0D(this.active_tab)) * 31) + AnonymousClass006.A0D(this.latest_tab)) * 31, this.preview_available)) + AnonymousClass006.A0G(this.node_id)) * 31) + AnonymousClass006.A0G(this.node_name)) * 31) + C3cH.A02(this.execution);
    }

    public final BrowserTaskPresentation toDomain() {
        BrowserTaskTabJson browserTaskTabJson;
        String str;
        String strA0l;
        Uri uri;
        String scheme;
        String scheme2;
        String host;
        String strA0l2 = AnonymousClass002.A0l(this.browser_task_id);
        if (strA0l2.length() <= 0) {
            return null;
        }
        String strA0l3 = AnonymousClass002.A0l(this.title);
        String str2 = null;
        if (strA0l3.length() > 0) {
            str2 = strA0l3;
        }
        String strA0l4 = AnonymousClass002.A0l(this.activity_title);
        String str3 = null;
        if (strA0l4.length() > 0) {
            str3 = strA0l4;
        }
        String str4 = this.status;
        String str5 = this.display_status;
        int i = this.version;
        Integer num = this.queue_position;
        boolean z = this.capacity_blocked;
        int i2 = this.occupied_slots;
        Long l = this.parked_expires_at_ms;
        Long l2 = this.next_parked_expires_at_ms;
        String str6 = this.terminal_reason;
        BrowserTaskScreenshotJson browserTaskScreenshotJson = this.latest_screenshot;
        BrowserTaskScreenshot domain = browserTaskScreenshotJson != null ? browserTaskScreenshotJson.toDomain() : null;
        boolean z2 = this.preview_available;
        String str7 = this.control_owner;
        BrowserTaskExecution browserTaskExecutionExecutionDestination = executionDestination();
        BrowserTaskTabJson browserTaskTabJson2 = this.active_tab;
        String displayHost = HatchUrlHostKt.toDisplayHost(browserTaskTabJson2 != null ? browserTaskTabJson2.url : null);
        if (displayHost == null) {
            BrowserTaskSiteJson browserTaskSiteJson = this.current_site;
            displayHost = HatchUrlHostKt.toDisplayHost(browserTaskSiteJson != null ? browserTaskSiteJson.domain : null);
            if (displayHost == null) {
                BrowserTaskTabJson browserTaskTabJson3 = this.latest_tab;
                displayHost = HatchUrlHostKt.toDisplayHost(browserTaskTabJson3 != null ? browserTaskTabJson3.url : null);
            }
        }
        BrowserTaskTabJson browserTaskTabJson4 = this.active_tab;
        if (((browserTaskTabJson4 == null || (str = browserTaskTabJson4.url) == null) && ((browserTaskTabJson = this.latest_tab) == null || (str = browserTaskTabJson.url) == null)) || (strA0l = AnonymousClass002.A0l(str)) == null || ((((scheme = (uri = Uri.parse(strA0l)).getScheme()) == null || !scheme.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP)) && ((scheme2 = uri.getScheme()) == null || !scheme2.equalsIgnoreCase("https"))) || (host = uri.getHost()) == null || C7BY.A0j(host))) {
            strA0l = null;
        }
        return new BrowserTaskPresentation(strA0l2, str2, str3, str4, str5, i, num, z, i2, l, l2, str6, domain, z2, displayHost, strA0l, str7, browserTaskExecutionExecutionDestination);
    }

    public BrowserTaskPresentationJson(String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshotJson browserTaskScreenshotJson, BrowserTaskSiteJson browserTaskSiteJson, BrowserTaskTabJson browserTaskTabJson, BrowserTaskTabJson browserTaskTabJson2, boolean z2, String str7, String str8, String str9, BrowserTaskExecutionJson browserTaskExecutionJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C3cI.A1I(str6, 11, str7);
        this.browser_task_id = str;
        this.title = str2;
        this.activity_title = str3;
        this.status = str4;
        this.display_status = str5;
        this.version = i;
        this.queue_position = num;
        this.capacity_blocked = z;
        this.occupied_slots = i2;
        this.parked_expires_at_ms = l;
        this.next_parked_expires_at_ms = l2;
        this.terminal_reason = str6;
        this.latest_screenshot = browserTaskScreenshotJson;
        this.current_site = browserTaskSiteJson;
        this.active_tab = browserTaskTabJson;
        this.latest_tab = browserTaskTabJson2;
        this.preview_available = z2;
        this.control_owner = str7;
        this.node_id = str8;
        this.node_name = str9;
        this.execution = browserTaskExecutionJson;
    }

    public final BrowserTaskPresentationJson copy(String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshotJson browserTaskScreenshotJson, BrowserTaskSiteJson browserTaskSiteJson, BrowserTaskTabJson browserTaskTabJson, BrowserTaskTabJson browserTaskTabJson2, boolean z2, String str7, String str8, String str9, BrowserTaskExecutionJson browserTaskExecutionJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C3cI.A1I(str6, 11, str7);
        return new BrowserTaskPresentationJson(str, str2, str3, str4, str5, i, num, z, i2, l, l2, str6, browserTaskScreenshotJson, browserTaskSiteJson, browserTaskTabJson, browserTaskTabJson2, z2, str7, str8, str9, browserTaskExecutionJson);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ BrowserTaskPresentationJson copy$default(BrowserTaskPresentationJson browserTaskPresentationJson, String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshotJson browserTaskScreenshotJson, BrowserTaskSiteJson browserTaskSiteJson, BrowserTaskTabJson browserTaskTabJson, BrowserTaskTabJson browserTaskTabJson2, boolean z2, String str7, String str8, String str9, BrowserTaskExecutionJson browserTaskExecutionJson, int i3, Object obj) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        int i4 = i;
        Integer num2 = num;
        boolean z3 = z;
        int i5 = i2;
        Long l3 = l;
        Long l4 = l2;
        String str15 = str6;
        BrowserTaskScreenshotJson browserTaskScreenshotJson2 = browserTaskScreenshotJson;
        BrowserTaskSiteJson browserTaskSiteJson2 = browserTaskSiteJson;
        BrowserTaskTabJson browserTaskTabJson3 = browserTaskTabJson;
        BrowserTaskTabJson browserTaskTabJson4 = browserTaskTabJson2;
        boolean z4 = z2;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        BrowserTaskExecutionJson browserTaskExecutionJson2 = browserTaskExecutionJson;
        if ((i3 & 1) != 0) {
            str10 = browserTaskPresentationJson.browser_task_id;
        }
        if ((i3 & 2) != 0) {
            str11 = browserTaskPresentationJson.title;
        }
        if ((i3 & 4) != 0) {
            str12 = browserTaskPresentationJson.activity_title;
        }
        if ((i3 & 8) != 0) {
            str13 = browserTaskPresentationJson.status;
        }
        if ((i3 & 16) != 0) {
            str14 = browserTaskPresentationJson.display_status;
        }
        if ((i3 & 32) != 0) {
            i4 = browserTaskPresentationJson.version;
        }
        if ((i3 & 64) != 0) {
            num2 = browserTaskPresentationJson.queue_position;
        }
        if ((i3 & 128) != 0) {
            z3 = browserTaskPresentationJson.capacity_blocked;
        }
        if ((i3 & 256) != 0) {
            i5 = browserTaskPresentationJson.occupied_slots;
        }
        if ((i3 & 512) != 0) {
            l3 = browserTaskPresentationJson.parked_expires_at_ms;
        }
        if ((i3 & 1024) != 0) {
            l4 = browserTaskPresentationJson.next_parked_expires_at_ms;
        }
        if ((i3 & 2048) != 0) {
            str15 = browserTaskPresentationJson.terminal_reason;
        }
        if ((i3 & 4096) != 0) {
            browserTaskScreenshotJson2 = browserTaskPresentationJson.latest_screenshot;
        }
        if ((i3 & 8192) != 0) {
            browserTaskSiteJson2 = browserTaskPresentationJson.current_site;
        }
        if ((i3 & 16384) != 0) {
            browserTaskTabJson3 = browserTaskPresentationJson.active_tab;
        }
        if ((i3 & 32768) != 0) {
            browserTaskTabJson4 = browserTaskPresentationJson.latest_tab;
        }
        if ((i3 & 65536) != 0) {
            z4 = browserTaskPresentationJson.preview_available;
        }
        if ((i3 & 131072) != 0) {
            str16 = browserTaskPresentationJson.control_owner;
        }
        if ((i3 & 262144) != 0) {
            str17 = browserTaskPresentationJson.node_id;
        }
        if ((i3 & 524288) != 0) {
            str18 = browserTaskPresentationJson.node_name;
        }
        if ((i3 & 1048576) != 0) {
            browserTaskExecutionJson2 = browserTaskPresentationJson.execution;
        }
        int i6 = i5;
        Long l5 = l3;
        Long l6 = l4;
        String str19 = str15;
        BrowserTaskScreenshotJson browserTaskScreenshotJson3 = browserTaskScreenshotJson2;
        return browserTaskPresentationJson.copy(str10, str11, str12, str13, str14, i4, num2, z3, i6, l5, l6, str19, browserTaskScreenshotJson3, browserTaskSiteJson2, browserTaskTabJson3, browserTaskTabJson4, z4, str16, str17, str18, browserTaskExecutionJson2);
    }

    public /* synthetic */ BrowserTaskPresentationJson(int i, String str, String str2, String str3, String str4, String str5, int i2, Integer num, boolean z, int i3, Long l, Long l2, String str6, BrowserTaskScreenshotJson browserTaskScreenshotJson, BrowserTaskSiteJson browserTaskSiteJson, BrowserTaskTabJson browserTaskTabJson, BrowserTaskTabJson browserTaskTabJson2, boolean z2, String str7, String str8, String str9, BrowserTaskExecutionJson browserTaskExecutionJson, C2hx c2hx) {
        BrowserTaskExecutionJson browserTaskExecutionJson2 = browserTaskExecutionJson;
        if ((i & 1) == 0) {
            this.browser_task_id = "";
        } else {
            this.browser_task_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.activity_title = "";
        } else {
            this.activity_title = str3;
        }
        if ((i & 8) == 0) {
            this.status = "";
        } else {
            this.status = str4;
        }
        if ((i & 16) == 0) {
            this.display_status = "";
        } else {
            this.display_status = str5;
        }
        if ((i & 32) == 0) {
            this.version = 0;
        } else {
            this.version = i2;
        }
        if ((i & 64) == 0) {
            this.queue_position = null;
        } else {
            this.queue_position = num;
        }
        if ((i & 128) == 0) {
            this.capacity_blocked = false;
        } else {
            this.capacity_blocked = z;
        }
        if ((i & 256) == 0) {
            this.occupied_slots = 0;
        } else {
            this.occupied_slots = i3;
        }
        if ((i & 512) == 0) {
            this.parked_expires_at_ms = null;
        } else {
            this.parked_expires_at_ms = l;
        }
        if ((i & 1024) == 0) {
            this.next_parked_expires_at_ms = null;
        } else {
            this.next_parked_expires_at_ms = l2;
        }
        if ((i & 2048) == 0) {
            this.terminal_reason = "";
        } else {
            this.terminal_reason = str6;
        }
        if ((i & 4096) == 0) {
            this.latest_screenshot = null;
        } else {
            this.latest_screenshot = browserTaskScreenshotJson;
        }
        if ((i & 8192) == 0) {
            this.current_site = null;
        } else {
            this.current_site = browserTaskSiteJson;
        }
        if ((i & 16384) == 0) {
            this.active_tab = null;
        } else {
            this.active_tab = browserTaskTabJson;
        }
        if ((32768 & i) == 0) {
            this.latest_tab = null;
        } else {
            this.latest_tab = browserTaskTabJson2;
        }
        if ((65536 & i) == 0) {
            this.preview_available = false;
        } else {
            this.preview_available = z2;
        }
        if ((131072 & i) == 0) {
            this.control_owner = "";
        } else {
            this.control_owner = str7;
        }
        if ((262144 & i) == 0) {
            this.node_id = null;
        } else {
            this.node_id = str8;
        }
        if ((524288 & i) == 0) {
            this.node_name = null;
        } else {
            this.node_name = str9;
        }
        this.execution = (i & 1048576) == 0 ? new BrowserTaskExecutionJson("vm", null) : browserTaskExecutionJson2;
    }

    public /* synthetic */ BrowserTaskPresentationJson(String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshotJson browserTaskScreenshotJson, BrowserTaskSiteJson browserTaskSiteJson, BrowserTaskTabJson browserTaskTabJson, BrowserTaskTabJson browserTaskTabJson2, boolean z2, String str7, String str8, String str9, BrowserTaskExecutionJson browserTaskExecutionJson, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? null : num, C3cH.A1N(i3, z), (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? null : l, (i3 & 1024) != 0 ? null : l2, (i3 & 2048) != 0 ? "" : str6, (i3 & 4096) != 0 ? null : browserTaskScreenshotJson, (i3 & 8192) != 0 ? null : browserTaskSiteJson, (i3 & 16384) != 0 ? null : browserTaskTabJson, (i3 & 32768) != 0 ? null : browserTaskTabJson2, C3cH.A1L(i3, 65536, z2), (i3 & 131072) == 0 ? str7 : "", C3cI.A0V(i3, 262144, str8), C3cI.A0V(i3, 524288, str9), (i3 & 1048576) != 0 ? new BrowserTaskExecutionJson("vm", null) : browserTaskExecutionJson);
    }

    public BrowserTaskPresentationJson() {
        this("", "", "", "", "", 0, null, false, 0, null, null, "", null, null, null, null, false, "", null, null, new BrowserTaskExecutionJson("vm", null));
    }
}

package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import java.util.Set;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskPresentation extends C06G {
    public static final String CONTROL_OWNER_USER = "user";
    public static final Set<BrowserTaskDisplayStatus> RETAINABLE_OUTCOME_DISPLAY_STATES;
    public static final String STATUS_RUNNING = "running";
    public static final String STATUS_USER_CONTROLLED = "user_controlled";
    public static final Set<BrowserTaskDisplayStatus> TERMINAL_DISPLAY_STATES;
    public final String activityTitle;
    public final String browserTaskId;
    public final boolean capacityBlocked;
    public final String controlOwner;
    public final String displayStatus;
    public final BrowserTaskExecution execution;
    public final BrowserTaskScreenshot latestScreenshot;
    public final Long nextParkedExpiresAtMs;
    public final int occupiedSlots;
    public final String pageUrl;
    public final Long parkedExpiresAtMs;
    public final boolean previewAvailable;
    public final Integer queuePosition;
    public final String siteDomain;
    public final String status;
    public final String terminalReason;
    public final String title;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final int $stable = BrowserTaskExecution.$stable;
    public static final Set<String> ALWAYS_TOMBSTONE_STATUSES = BFI.A0H(new String[]{"stopped", "superseded"});
    public static final String STATUS_NEEDS_USER = "needs_user";
    public static final Set<String> RETAINABLE_OUTCOME_STATUSES = BFI.A0H(new String[]{STATUS_NEEDS_USER, "completed", "failed"});
    public static final Set<String> TERMINAL_STATUSES = BFI.A0H(new String[]{"failed", "superseded", "stopped", "completed"});

    public final class Companion {
        public final String normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(String str) {
            C7384Etj.A0Y(str, 0);
            return C3cJ.A0J(str).replace(' ', '_');
        }

        public final C9hr<BrowserTaskPresentation> serializer() {
            return BrowserTaskPresentation$$serializer.INSTANCE;
        }

        public final BrowserTaskPresentation fromJson(JsonElement jsonElement) {
            return BrowserTaskPresentationJsonKt.parseBrowserTaskPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskPresentation browserTaskPresentation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(browserTaskPresentation.browserTaskId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || browserTaskPresentation.title != null) {
            c9j5.AAP(browserTaskPresentation.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || browserTaskPresentation.activityTitle != null) {
            c9j5.AAP(browserTaskPresentation.activityTitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !"".equals(browserTaskPresentation.status)) {
            c9j5.AAV(browserTaskPresentation.status, c9iZ, 3);
        }
        if (zAfR || !"".equals(browserTaskPresentation.displayStatus)) {
            c9j5.AAV(browserTaskPresentation.displayStatus, c9iZ, 4);
        }
        if (zAfR || browserTaskPresentation.version != 0) {
            c9j5.AAK(c9iZ, 5, browserTaskPresentation.version);
        }
        if (zAfR || browserTaskPresentation.queuePosition != null) {
            c9j5.AAP(browserTaskPresentation.queuePosition, C07729ii.A00, c9iZ, 6);
        }
        if (zAfR || browserTaskPresentation.capacityBlocked) {
            c9j5.AA7(c9iZ, 7, browserTaskPresentation.capacityBlocked);
        }
        if (zAfR || browserTaskPresentation.occupiedSlots != 0) {
            c9j5.AAK(c9iZ, 8, browserTaskPresentation.occupiedSlots);
        }
        if (zAfR || browserTaskPresentation.parkedExpiresAtMs != null) {
            c9j5.AAP(browserTaskPresentation.parkedExpiresAtMs, C9j1.A00, c9iZ, 9);
        }
        if (zAfR || browserTaskPresentation.nextParkedExpiresAtMs != null) {
            c9j5.AAP(browserTaskPresentation.nextParkedExpiresAtMs, C9j1.A00, c9iZ, 10);
        }
        if (zAfR || !"".equals(browserTaskPresentation.terminalReason)) {
            c9j5.AAV(browserTaskPresentation.terminalReason, c9iZ, 11);
        }
        if (zAfR || browserTaskPresentation.latestScreenshot != null) {
            c9j5.AAP(browserTaskPresentation.latestScreenshot, BrowserTaskScreenshot$$serializer.INSTANCE, c9iZ, 12);
        }
        if (zAfR || browserTaskPresentation.previewAvailable) {
            c9j5.AA7(c9iZ, 13, browserTaskPresentation.previewAvailable);
        }
        if (zAfR || browserTaskPresentation.siteDomain != null) {
            c9j5.AAP(browserTaskPresentation.siteDomain, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || browserTaskPresentation.pageUrl != null) {
            c9j5.AAP(browserTaskPresentation.pageUrl, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || !"".equals(browserTaskPresentation.controlOwner)) {
            c9j5.AAV(browserTaskPresentation.controlOwner, c9iZ, 16);
        }
        if (!zAfR) {
            BrowserTaskExecution browserTaskExecution = browserTaskPresentation.execution;
            int i = BrowserTaskExecution.$stable;
            if (C7384Etj.areEqual(browserTaskExecution, new BrowserTaskExecution(BrowserTaskExecutionKind.VM, null, null))) {
                return;
            }
        }
        c9j5.AAQ(browserTaskPresentation.execution, BrowserTaskExecution$$serializer.INSTANCE, c9iZ, 17);
    }

    public final BrowserTaskPresentation copy(String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshot browserTaskScreenshot, boolean z2, String str7, String str8, String str9, BrowserTaskExecution browserTaskExecution) {
        AnonymousClass005.A12(str, str4, str5, 0);
        C7384Etj.A0Y(str6, 11);
        C3cI.A1I(str9, 16, browserTaskExecution);
        return new BrowserTaskPresentation(str, str2, str3, str4, str5, i, num, z, i2, l, l2, str6, browserTaskScreenshot, z2, str7, str8, str9, browserTaskExecution);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskPresentation) {
                BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) obj;
                if (!C7384Etj.areEqual(this.browserTaskId, browserTaskPresentation.browserTaskId) || !C7384Etj.areEqual(this.title, browserTaskPresentation.title) || !C7384Etj.areEqual(this.activityTitle, browserTaskPresentation.activityTitle) || !C7384Etj.areEqual(this.status, browserTaskPresentation.status) || !C7384Etj.areEqual(this.displayStatus, browserTaskPresentation.displayStatus) || this.version != browserTaskPresentation.version || !C7384Etj.areEqual(this.queuePosition, browserTaskPresentation.queuePosition) || this.capacityBlocked != browserTaskPresentation.capacityBlocked || this.occupiedSlots != browserTaskPresentation.occupiedSlots || !C7384Etj.areEqual(this.parkedExpiresAtMs, browserTaskPresentation.parkedExpiresAtMs) || !C7384Etj.areEqual(this.nextParkedExpiresAtMs, browserTaskPresentation.nextParkedExpiresAtMs) || !C7384Etj.areEqual(this.terminalReason, browserTaskPresentation.terminalReason) || !C7384Etj.areEqual(this.latestScreenshot, browserTaskPresentation.latestScreenshot) || this.previewAvailable != browserTaskPresentation.previewAvailable || !C7384Etj.areEqual(this.siteDomain, browserTaskPresentation.siteDomain) || !C7384Etj.areEqual(this.pageUrl, browserTaskPresentation.pageUrl) || !C7384Etj.areEqual(this.controlOwner, browserTaskPresentation.controlOwner) || !C7384Etj.areEqual(this.execution, browserTaskPresentation.execution)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        BrowserTaskDisplayStatus browserTaskDisplayStatus = BrowserTaskDisplayStatus.COMPLETED;
        BrowserTaskDisplayStatus browserTaskDisplayStatus2 = BrowserTaskDisplayStatus.FAILED;
        BrowserTaskDisplayStatus browserTaskDisplayStatus3 = BrowserTaskDisplayStatus.NEEDS_YOU;
        RETAINABLE_OUTCOME_DISPLAY_STATES = BFI.A0H(new BrowserTaskDisplayStatus[]{browserTaskDisplayStatus, browserTaskDisplayStatus2, browserTaskDisplayStatus3});
        TERMINAL_DISPLAY_STATES = BFI.A0H(new BrowserTaskDisplayStatus[]{browserTaskDisplayStatus, browserTaskDisplayStatus2, BrowserTaskDisplayStatus.STOPPED, browserTaskDisplayStatus3});
    }

    public final String component1() {
        return this.browserTaskId;
    }

    public final Long component10() {
        return this.parkedExpiresAtMs;
    }

    public final Long component11() {
        return this.nextParkedExpiresAtMs;
    }

    public final String component12() {
        return this.terminalReason;
    }

    public final BrowserTaskScreenshot component13() {
        return this.latestScreenshot;
    }

    public final boolean component14() {
        return this.previewAvailable;
    }

    public final String component15() {
        return this.siteDomain;
    }

    public final String component16() {
        return this.pageUrl;
    }

    public final String component17() {
        return this.controlOwner;
    }

    public final BrowserTaskExecution component18() {
        return this.execution;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.activityTitle;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.displayStatus;
    }

    public final int component6() {
        return this.version;
    }

    public final Integer component7() {
        return this.queuePosition;
    }

    public final boolean component8() {
        return this.capacityBlocked;
    }

    public final int component9() {
        return this.occupiedSlots;
    }

    public final String getActivityTitle() {
        return this.activityTitle;
    }

    public final String getBrowserTaskId() {
        return this.browserTaskId;
    }

    public final boolean getCapacityBlocked() {
        return this.capacityBlocked;
    }

    public final String getControlOwner() {
        return this.controlOwner;
    }

    public final BrowserTaskDisplayStatus getDisplayState() {
        BrowserTaskDisplayStatus.Companion companion = BrowserTaskDisplayStatus.Companion;
        BrowserTaskDisplayStatus browserTaskDisplayStatusFromDisplayStatus = companion.fromDisplayStatus(this.displayStatus);
        return browserTaskDisplayStatusFromDisplayStatus == null ? companion.fromStatus(this.status, this.terminalReason) : browserTaskDisplayStatusFromDisplayStatus;
    }

    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    public final BrowserTaskExecution getExecution() {
        return this.execution;
    }

    public final BrowserTaskScreenshot getLatestScreenshot() {
        return this.latestScreenshot;
    }

    public final Long getNextParkedExpiresAtMs() {
        return this.nextParkedExpiresAtMs;
    }

    public final int getOccupiedSlots() {
        return this.occupiedSlots;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final Long getParkedExpiresAtMs() {
        return this.parkedExpiresAtMs;
    }

    public final boolean getPreviewAvailable() {
        return this.previewAvailable;
    }

    public final Integer getQueuePosition() {
        return this.queuePosition;
    }

    public final String getSiteDomain() {
        return this.siteDomain;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTerminalReason() {
        return this.terminalReason;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.execution, AnonymousClass005.A0I(this.controlOwner, (((C0KA.A01((AnonymousClass005.A0I(this.terminalReason, (((((C0KA.A01((((AnonymousClass005.A0I(this.displayStatus, AnonymousClass005.A0I(this.status, (((AnonymousClass001.A0G(this.browserTaskId) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.activityTitle)) * 31)) + this.version) * 31) + AnonymousClass006.A0D(this.queuePosition)) * 31, this.capacityBlocked) + this.occupiedSlots) * 31) + AnonymousClass006.A0D(this.parkedExpiresAtMs)) * 31) + AnonymousClass006.A0D(this.nextParkedExpiresAtMs)) * 31) + AnonymousClass006.A0D(this.latestScreenshot)) * 31, this.previewAvailable) + AnonymousClass006.A0G(this.siteDomain)) * 31) + AnonymousClass005.A0H(this.pageUrl)) * 31));
    }

    public final boolean isControlledByUser() {
        return "user".equals(Companion.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(this.controlOwner));
    }

    public final boolean isRunning() {
        return STATUS_RUNNING.equals(Companion.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(this.status));
    }

    public final boolean isTerminal() {
        return TERMINAL_STATUSES.contains(Companion.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(this.status)) || TERMINAL_DISPLAY_STATES.contains(getDisplayState());
    }

    public final boolean isTombstone() {
        Companion companion = Companion;
        String strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model = companion.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(this.status);
        String strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model2 = companion.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(this.displayStatus);
        if (ALWAYS_TOMBSTONE_STATUSES.contains(strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model)) {
            return true;
        }
        return (RETAINABLE_OUTCOME_STATUSES.contains(strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model) || STATUS_NEEDS_USER.equals(strNormalized$fbandroid_express_aura_java_com_facebook_aura_model_model2) || RETAINABLE_OUTCOME_DISPLAY_STATES.contains(getDisplayState())) ? !this.previewAvailable : isTerminal();
    }

    public final boolean isUserControlled() {
        return STATUS_USER_CONTROLLED.equals(Companion.normalized$fbandroid_express_aura_java_com_facebook_aura_model_model(this.status));
    }

    public final boolean isLiveViewable() {
        return (isTombstone() || getDisplayState() == BrowserTaskDisplayStatus.QUEUED || getDisplayState() == BrowserTaskDisplayStatus.STARTING) ? false : true;
    }

    public final boolean isWaitingForUser() {
        return !isTombstone() && getDisplayState() == BrowserTaskDisplayStatus.WAITING;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ BrowserTaskPresentation copy$default(BrowserTaskPresentation browserTaskPresentation, String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshot browserTaskScreenshot, boolean z2, String str7, String str8, String str9, BrowserTaskExecution browserTaskExecution, int i3, Object obj) {
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
        BrowserTaskScreenshot browserTaskScreenshot2 = browserTaskScreenshot;
        boolean z4 = z2;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        BrowserTaskExecution browserTaskExecution2 = browserTaskExecution;
        if ((i3 & 1) != 0) {
            str10 = browserTaskPresentation.browserTaskId;
        }
        if ((i3 & 2) != 0) {
            str11 = browserTaskPresentation.title;
        }
        if ((i3 & 4) != 0) {
            str12 = browserTaskPresentation.activityTitle;
        }
        if ((i3 & 8) != 0) {
            str13 = browserTaskPresentation.status;
        }
        if ((i3 & 16) != 0) {
            str14 = browserTaskPresentation.displayStatus;
        }
        if ((i3 & 32) != 0) {
            i4 = browserTaskPresentation.version;
        }
        if ((i3 & 64) != 0) {
            num2 = browserTaskPresentation.queuePosition;
        }
        if ((i3 & 128) != 0) {
            z3 = browserTaskPresentation.capacityBlocked;
        }
        if ((i3 & 256) != 0) {
            i5 = browserTaskPresentation.occupiedSlots;
        }
        if ((i3 & 512) != 0) {
            l3 = browserTaskPresentation.parkedExpiresAtMs;
        }
        if ((i3 & 1024) != 0) {
            l4 = browserTaskPresentation.nextParkedExpiresAtMs;
        }
        if ((i3 & 2048) != 0) {
            str15 = browserTaskPresentation.terminalReason;
        }
        if ((i3 & 4096) != 0) {
            browserTaskScreenshot2 = browserTaskPresentation.latestScreenshot;
        }
        if ((i3 & 8192) != 0) {
            z4 = browserTaskPresentation.previewAvailable;
        }
        if ((i3 & 16384) != 0) {
            str16 = browserTaskPresentation.siteDomain;
        }
        if ((i3 & 32768) != 0) {
            str17 = browserTaskPresentation.pageUrl;
        }
        if ((i3 & 65536) != 0) {
            str18 = browserTaskPresentation.controlOwner;
        }
        if ((i3 & 131072) != 0) {
            browserTaskExecution2 = browserTaskPresentation.execution;
        }
        int i6 = i4;
        Integer num3 = num2;
        boolean z5 = z3;
        return browserTaskPresentation.copy(str10, str11, str12, str13, str14, i6, num3, z5, i5, l3, l4, str15, browserTaskScreenshot2, z4, str16, str17, str18, browserTaskExecution2);
    }

    public /* synthetic */ BrowserTaskPresentation(int i, String str, String str2, String str3, String str4, String str5, int i2, Integer num, boolean z, int i3, Long l, Long l2, String str6, BrowserTaskScreenshot browserTaskScreenshot, boolean z2, String str7, String str8, String str9, BrowserTaskExecution browserTaskExecution, C2hx c2hx) {
        BrowserTaskExecution browserTaskExecution2;
        if (1 != (i & 1)) {
            C9iI.A00(BrowserTaskPresentation$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.browserTaskId = str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.activityTitle = null;
        } else {
            this.activityTitle = str3;
        }
        if ((i & 8) == 0) {
            this.status = "";
        } else {
            this.status = str4;
        }
        if ((i & 16) == 0) {
            this.displayStatus = "";
        } else {
            this.displayStatus = str5;
        }
        if ((i & 32) == 0) {
            this.version = 0;
        } else {
            this.version = i2;
        }
        if ((i & 64) == 0) {
            this.queuePosition = null;
        } else {
            this.queuePosition = num;
        }
        if ((i & 128) == 0) {
            this.capacityBlocked = false;
        } else {
            this.capacityBlocked = z;
        }
        if ((i & 256) == 0) {
            this.occupiedSlots = 0;
        } else {
            this.occupiedSlots = i3;
        }
        if ((i & 512) == 0) {
            this.parkedExpiresAtMs = null;
        } else {
            this.parkedExpiresAtMs = l;
        }
        if ((i & 1024) == 0) {
            this.nextParkedExpiresAtMs = null;
        } else {
            this.nextParkedExpiresAtMs = l2;
        }
        if ((i & 2048) == 0) {
            this.terminalReason = "";
        } else {
            this.terminalReason = str6;
        }
        if ((i & 4096) == 0) {
            this.latestScreenshot = null;
        } else {
            this.latestScreenshot = browserTaskScreenshot;
        }
        if ((i & 8192) == 0) {
            this.previewAvailable = false;
        } else {
            this.previewAvailable = z2;
        }
        if ((i & 16384) == 0) {
            this.siteDomain = null;
        } else {
            this.siteDomain = str7;
        }
        if ((32768 & i) == 0) {
            this.pageUrl = null;
        } else {
            this.pageUrl = str8;
        }
        if ((65536 & i) == 0) {
            this.controlOwner = "";
        } else {
            this.controlOwner = str9;
        }
        if ((i & 131072) == 0) {
            int i4 = BrowserTaskExecution.$stable;
            browserTaskExecution2 = new BrowserTaskExecution(BrowserTaskExecutionKind.VM, null, null);
        } else {
            browserTaskExecution2 = browserTaskExecution;
        }
        this.execution = browserTaskExecution2;
    }

    public /* synthetic */ BrowserTaskPresentation(String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshot browserTaskScreenshot, boolean z2, String str7, String str8, String str9, BrowserTaskExecution browserTaskExecution, int i3, C06H c06h) {
        String str10 = str4;
        String str11 = str5;
        int i4 = i;
        Integer num2 = num;
        int i5 = i2;
        Long l3 = l;
        Long l4 = l2;
        String str12 = str6;
        BrowserTaskScreenshot browserTaskScreenshot2 = browserTaskScreenshot;
        BrowserTaskExecution browserTaskExecution2 = browserTaskExecution;
        String strA0e = C3cG.A0e(str2, i3 & 2);
        String strA0e2 = C3cG.A0e(str3, i3 & 4);
        str10 = (i3 & 8) != 0 ? "" : str10;
        str11 = (i3 & 16) != 0 ? "" : str11;
        i4 = (i3 & 32) != 0 ? 0 : i4;
        num2 = (i3 & 64) != 0 ? null : num2;
        boolean zA1N = C3cH.A1N(i3, z);
        i5 = (i3 & 256) != 0 ? 0 : i5;
        l3 = (i3 & 512) != 0 ? null : l3;
        l4 = (i3 & 1024) != 0 ? null : l4;
        str12 = (i3 & 2048) != 0 ? "" : str12;
        browserTaskScreenshot2 = (i3 & 4096) != 0 ? null : browserTaskScreenshot2;
        boolean z3 = (i3 & 8192) == 0 ? z2 : false;
        String strA0e3 = C3cG.A0e(str7, i3 & 16384);
        String strA0V = C3cI.A0V(i3, 32768, str8);
        String str13 = (i3 & 65536) == 0 ? str9 : "";
        if ((i3 & 131072) != 0) {
            int i6 = BrowserTaskExecution.$stable;
            browserTaskExecution2 = new BrowserTaskExecution(BrowserTaskExecutionKind.VM, null, null);
        }
        this(str, strA0e, strA0e2, str10, str11, i4, num2, zA1N, i5, l3, l4, str12, browserTaskScreenshot2, z3, strA0e3, strA0V, str13, browserTaskExecution2);
    }

    public BrowserTaskPresentation(String str, String str2, String str3, String str4, String str5, int i, Integer num, boolean z, int i2, Long l, Long l2, String str6, BrowserTaskScreenshot browserTaskScreenshot, boolean z2, String str7, String str8, String str9, BrowserTaskExecution browserTaskExecution) {
        AnonymousClass005.A12(str, str4, str5, 0);
        C7384Etj.A0Y(str6, 11);
        C3cI.A1I(str9, 16, browserTaskExecution);
        this.browserTaskId = str;
        this.title = str2;
        this.activityTitle = str3;
        this.status = str4;
        this.displayStatus = str5;
        this.version = i;
        this.queuePosition = num;
        this.capacityBlocked = z;
        this.occupiedSlots = i2;
        this.parkedExpiresAtMs = l;
        this.nextParkedExpiresAtMs = l2;
        this.terminalReason = str6;
        this.latestScreenshot = browserTaskScreenshot;
        this.previewAvailable = z2;
        this.siteDomain = str7;
        this.pageUrl = str8;
        this.controlOwner = str9;
        this.execution = browserTaskExecution;
    }
}

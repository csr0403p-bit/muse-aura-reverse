package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskConfirmationApprovalJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String body;
    public final String browser_action_label;
    public final String browser_task_id;
    public final String title;

    public final class Companion {
        public final C9hr<BrowserTaskConfirmationApprovalJson> serializer() {
            return BrowserTaskConfirmationApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(browserTaskConfirmationApprovalJson.title)) {
            c9j5.AAV(browserTaskConfirmationApprovalJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(browserTaskConfirmationApprovalJson.body)) {
            c9j5.AAV(browserTaskConfirmationApprovalJson.body, c9iZ, 1);
        }
        if (zAfR || !"".equals(browserTaskConfirmationApprovalJson.browser_action_label)) {
            c9j5.AAV(browserTaskConfirmationApprovalJson.browser_action_label, c9iZ, 2);
        }
        if (zAfR || !"".equals(browserTaskConfirmationApprovalJson.browser_task_id)) {
            c9j5.AAV(browserTaskConfirmationApprovalJson.browser_task_id, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskConfirmationApprovalJson) {
                BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson = (BrowserTaskConfirmationApprovalJson) obj;
                if (!C7384Etj.areEqual(this.title, browserTaskConfirmationApprovalJson.title) || !C7384Etj.areEqual(this.body, browserTaskConfirmationApprovalJson.body) || !C7384Etj.areEqual(this.browser_action_label, browserTaskConfirmationApprovalJson.browser_action_label) || !C7384Etj.areEqual(this.browser_task_id, browserTaskConfirmationApprovalJson.browser_task_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserTaskConfirmationApprovalJson copy$default(BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserTaskConfirmationApprovalJson.title;
        }
        if ((i & 2) != 0) {
            str2 = browserTaskConfirmationApprovalJson.body;
        }
        if ((i & 4) != 0) {
            str3 = browserTaskConfirmationApprovalJson.browser_action_label;
        }
        if ((i & 8) != 0) {
            str4 = browserTaskConfirmationApprovalJson.browser_task_id;
        }
        return browserTaskConfirmationApprovalJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.browser_action_label;
    }

    public final String component4() {
        return this.browser_task_id;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getBrowser_action_label() {
        return this.browser_action_label;
    }

    public final String getBrowser_task_id() {
        return this.browser_task_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.browser_task_id, AnonymousClass005.A0I(this.browser_action_label, AnonymousClass005.A0I(this.body, AnonymousClass001.A0G(this.title))));
    }

    public final HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval toDomainOrNull() {
        String strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.browser_task_id);
        if (strTrimToNonEmpty == null) {
            return null;
        }
        return new HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval(HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.title), HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.body), HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.browser_action_label), strTrimToNonEmpty);
    }

    public BrowserTaskConfirmationApprovalJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.title = str;
        this.body = str2;
        this.browser_action_label = str3;
        this.browser_task_id = str4;
    }

    public final BrowserTaskConfirmationApprovalJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new BrowserTaskConfirmationApprovalJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BrowserTaskConfirmationApprovalJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = "";
        } else {
            this.body = str2;
        }
        if ((i & 4) == 0) {
            this.browser_action_label = "";
        } else {
            this.browser_action_label = str3;
        }
        if ((i & 8) == 0) {
            this.browser_task_id = "";
        } else {
            this.browser_task_id = str4;
        }
    }

    public /* synthetic */ BrowserTaskConfirmationApprovalJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public BrowserTaskConfirmationApprovalJson() {
        this("", "", "", "");
    }
}

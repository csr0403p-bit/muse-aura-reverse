package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskExecutionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String device_id;
    public final String kind;

    public final class Companion {
        public final C9hr<BrowserTaskExecutionJson> serializer() {
            return BrowserTaskExecutionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public BrowserTaskExecutionJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.device_id = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskExecutionJson browserTaskExecutionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(browserTaskExecutionJson.kind)) {
            c9j5.AAV(browserTaskExecutionJson.kind, c9iZ, 0);
        }
        if (zAfR || browserTaskExecutionJson.device_id != null) {
            c9j5.AAP(browserTaskExecutionJson.device_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public final BrowserTaskExecutionJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskExecutionJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskExecutionJson) {
                BrowserTaskExecutionJson browserTaskExecutionJson = (BrowserTaskExecutionJson) obj;
                if (!C7384Etj.areEqual(this.kind, browserTaskExecutionJson.kind) || !C7384Etj.areEqual(this.device_id, browserTaskExecutionJson.device_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserTaskExecutionJson copy$default(BrowserTaskExecutionJson browserTaskExecutionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserTaskExecutionJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = browserTaskExecutionJson.device_id;
        }
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskExecutionJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.device_id;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getKind() {
        return this.kind;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.device_id);
    }

    public final BrowserTaskExecution toDomain() {
        String str;
        String str2 = this.kind;
        if ("vm".equals(str2) && this.device_id == null) {
            int i = BrowserTaskExecution.$stable;
            return new BrowserTaskExecution(BrowserTaskExecutionKind.VM, null, null);
        }
        if ("local_device".equals(str2) && (str = this.device_id) != null && BrowserTaskExecutionJsonKt.isValidBrowserExecutionIdentity(str)) {
            int i2 = BrowserTaskExecution.$stable;
            return new BrowserTaskExecution(BrowserTaskExecutionKind.LOCAL_DEVICE, this.device_id, null);
        }
        int i3 = BrowserTaskExecution.$stable;
        return new BrowserTaskExecution(BrowserTaskExecutionKind.UNSUPPORTED, null, null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BrowserTaskExecutionJson(int i, String str, String str2, C2hx c2hx) {
        this.kind = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str2;
        }
    }

    public /* synthetic */ BrowserTaskExecutionJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public BrowserTaskExecutionJson() {
        this("", null);
    }
}

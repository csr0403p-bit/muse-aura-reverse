package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskExecution extends C06G {
    public static final int $stable = 0;
    public final String deviceId;
    public final String deviceName;
    public final BrowserTaskExecutionKind kind;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, BrowserTaskExecution$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<BrowserTaskExecution> serializer() {
            return BrowserTaskExecution$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public BrowserTaskExecution(BrowserTaskExecutionKind browserTaskExecutionKind, String str, String str2) {
        C7384Etj.A0Y(browserTaskExecutionKind, 0);
        this.kind = browserTaskExecutionKind;
        this.deviceId = str;
        this.deviceName = str2;
    }

    public final BrowserTaskExecution copy(BrowserTaskExecutionKind browserTaskExecutionKind, String str, String str2) {
        C7384Etj.A0Y(browserTaskExecutionKind, 0);
        return new BrowserTaskExecution(browserTaskExecutionKind, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskExecution) {
                BrowserTaskExecution browserTaskExecution = (BrowserTaskExecution) obj;
                if (this.kind != browserTaskExecution.kind || !C7384Etj.areEqual(this.deviceId, browserTaskExecution.deviceId) || !C7384Etj.areEqual(this.deviceName, browserTaskExecution.deviceName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserTaskExecution copy$default(BrowserTaskExecution browserTaskExecution, BrowserTaskExecutionKind browserTaskExecutionKind, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskExecutionKind = browserTaskExecution.kind;
        }
        if ((i & 2) != 0) {
            str = browserTaskExecution.deviceId;
        }
        if ((i & 4) != 0) {
            str2 = browserTaskExecution.deviceName;
        }
        return browserTaskExecution.copy(browserTaskExecutionKind, str, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskExecution browserTaskExecution, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || browserTaskExecution.kind != BrowserTaskExecutionKind.VM) {
            c9j5.AAQ(browserTaskExecution.kind, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || browserTaskExecution.deviceId != null) {
            c9j5.AAP(browserTaskExecution.deviceId, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || browserTaskExecution.deviceName != null) {
            c9j5.AAP(browserTaskExecution.deviceName, C07779iq.A01, c9iZ, 2);
        }
    }

    public final BrowserTaskExecutionKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.deviceName;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final BrowserTaskExecutionKind getKind() {
        return this.kind;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.kind) + AnonymousClass006.A0G(this.deviceId)) * 31) + AnonymousClass005.A0H(this.deviceName);
    }

    public final boolean isVm() {
        return this.kind == BrowserTaskExecutionKind.VM && this.deviceId == null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BrowserTaskExecution(int i, BrowserTaskExecutionKind browserTaskExecutionKind, String str, String str2, C2hx c2hx) {
        this.kind = (i & 1) == 0 ? BrowserTaskExecutionKind.VM : browserTaskExecutionKind;
        if ((i & 2) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str;
        }
        if ((i & 4) == 0) {
            this.deviceName = null;
        } else {
            this.deviceName = str2;
        }
    }

    public /* synthetic */ BrowserTaskExecution(BrowserTaskExecutionKind browserTaskExecutionKind, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? BrowserTaskExecutionKind.VM : browserTaskExecutionKind, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public BrowserTaskExecution() {
        this(BrowserTaskExecutionKind.VM, null, null);
    }
}

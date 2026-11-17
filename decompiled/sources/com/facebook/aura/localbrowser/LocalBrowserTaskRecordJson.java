package com.facebook.aura.localbrowser;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class LocalBrowserTaskRecordJson {
    public static final int $stable = 0;
    public final String bindingId;
    public final String deviceId;
    public final LocalBrowserTaskOutcome outcome;
    public final Integer pid;
    public final String runtimeId;
    public final boolean stopPending;
    public final String taskId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = LocalBrowserTaskRecordJson.$stable;
            return AnonymousClass001.A12(LocalBrowserTaskOutcome.$cachedSerializer$delegate);
        }
    }), null, null, null};

    public final class Companion {
        public final C9hr<LocalBrowserTaskRecordJson> serializer() {
            return LocalBrowserTaskRecordJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ LocalBrowserTaskRecordJson copy$default(LocalBrowserTaskRecordJson localBrowserTaskRecordJson, String str, String str2, String str3, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, String str4, Integer num, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        LocalBrowserTaskOutcome localBrowserTaskOutcome2 = localBrowserTaskOutcome;
        boolean z2 = z;
        String str8 = str4;
        Integer num2 = num;
        if ((i & 1) != 0) {
            str5 = localBrowserTaskRecordJson.taskId;
        }
        if ((i & 2) != 0) {
            str6 = localBrowserTaskRecordJson.bindingId;
        }
        if ((i & 4) != 0) {
            str7 = localBrowserTaskRecordJson.deviceId;
        }
        if ((i & 8) != 0) {
            localBrowserTaskOutcome2 = localBrowserTaskRecordJson.outcome;
        }
        if ((i & 16) != 0) {
            z2 = localBrowserTaskRecordJson.stopPending;
        }
        if ((i & 32) != 0) {
            str8 = localBrowserTaskRecordJson.runtimeId;
        }
        if ((i & 64) != 0) {
            num2 = localBrowserTaskRecordJson.pid;
        }
        AnonymousClass005.A0x(str5, str6, str7);
        return new LocalBrowserTaskRecordJson(str5, str6, str7, localBrowserTaskOutcome2, z2, str8, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserTaskRecordJson) {
                LocalBrowserTaskRecordJson localBrowserTaskRecordJson = (LocalBrowserTaskRecordJson) obj;
                if (!C7384Etj.areEqual(this.taskId, localBrowserTaskRecordJson.taskId) || !C7384Etj.areEqual(this.bindingId, localBrowserTaskRecordJson.bindingId) || !C7384Etj.areEqual(this.deviceId, localBrowserTaskRecordJson.deviceId) || this.outcome != localBrowserTaskRecordJson.outcome || this.stopPending != localBrowserTaskRecordJson.stopPending || !C7384Etj.areEqual(this.runtimeId, localBrowserTaskRecordJson.runtimeId) || !C7384Etj.areEqual(this.pid, localBrowserTaskRecordJson.pid)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LocalBrowserTaskRecordJson(int i, String str, String str2, String str3, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, String str4, Integer num, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(LocalBrowserTaskRecordJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.taskId = str;
        this.bindingId = str2;
        this.deviceId = str3;
        if ((i & 8) == 0) {
            this.outcome = null;
        } else {
            this.outcome = localBrowserTaskOutcome;
        }
        if ((i & 16) == 0) {
            this.stopPending = false;
        } else {
            this.stopPending = z;
        }
        if ((i & 32) == 0) {
            this.runtimeId = null;
        } else {
            this.runtimeId = str4;
        }
        if ((i & 64) == 0) {
            this.pid = null;
        } else {
            this.pid = num;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(LocalBrowserTaskRecordJson localBrowserTaskRecordJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(localBrowserTaskRecordJson.taskId, c9iZ, 0);
        c9j5.AAV(localBrowserTaskRecordJson.bindingId, c9iZ, 1);
        c9j5.AAV(localBrowserTaskRecordJson.deviceId, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || localBrowserTaskRecordJson.outcome != null) {
            c9j5.AAP(localBrowserTaskRecordJson.outcome, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || localBrowserTaskRecordJson.stopPending) {
            c9j5.AA7(c9iZ, 4, localBrowserTaskRecordJson.stopPending);
        }
        if (zAfR || localBrowserTaskRecordJson.runtimeId != null) {
            c9j5.AAP(localBrowserTaskRecordJson.runtimeId, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || localBrowserTaskRecordJson.pid != null) {
            c9j5.AAP(localBrowserTaskRecordJson.pid, C07729ii.A00, c9iZ, 6);
        }
    }

    public final String component1() {
        return this.taskId;
    }

    public final String component2() {
        return this.bindingId;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final LocalBrowserTaskOutcome component4() {
        return this.outcome;
    }

    public final boolean component5() {
        return this.stopPending;
    }

    public final String component6() {
        return this.runtimeId;
    }

    public final Integer component7() {
        return this.pid;
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final LocalBrowserTaskOutcome getOutcome() {
        return this.outcome;
    }

    public final Integer getPid() {
        return this.pid;
    }

    public final String getRuntimeId() {
        return this.runtimeId;
    }

    public final boolean getStopPending() {
        return this.stopPending;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return ((C0KA.A01((AnonymousClass005.A0I(this.deviceId, AnonymousClass005.A0I(this.bindingId, AnonymousClass001.A0G(this.taskId))) + AnonymousClass006.A0D(this.outcome)) * 31, this.stopPending) + AnonymousClass006.A0G(this.runtimeId)) * 31) + C3cH.A02(this.pid);
    }

    public String toString() {
        String str = this.taskId;
        String str2 = this.bindingId;
        String str3 = this.deviceId;
        LocalBrowserTaskOutcome localBrowserTaskOutcome = this.outcome;
        boolean z = this.stopPending;
        String str4 = this.runtimeId;
        Integer num = this.pid;
        StringBuilder sbA0x = C3cI.A0x("LocalBrowserTaskRecordJson(taskId=", str);
        sbA0x.append(", bindingId=");
        sbA0x.append(str2);
        sbA0x.append(", deviceId=");
        sbA0x.append(str3);
        sbA0x.append(", outcome=");
        sbA0x.append(localBrowserTaskOutcome);
        sbA0x.append(", stopPending=");
        sbA0x.append(z);
        sbA0x.append(", runtimeId=");
        sbA0x.append(str4);
        return C3cJ.A0L(num, ", pid=", sbA0x);
    }

    public final LocalBrowserTaskRecordJson copy(String str, String str2, String str3, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, String str4, Integer num) {
        AnonymousClass005.A0x(str, str2, str3);
        return new LocalBrowserTaskRecordJson(str, str2, str3, localBrowserTaskOutcome, z, str4, num);
    }

    public /* synthetic */ LocalBrowserTaskRecordJson(String str, String str2, String str3, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, String str4, Integer num, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : localBrowserTaskOutcome, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num);
    }

    public LocalBrowserTaskRecordJson(String str, String str2, String str3, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, String str4, Integer num) {
        AnonymousClass005.A0x(str, str2, str3);
        this.taskId = str;
        this.bindingId = str2;
        this.deviceId = str3;
        this.outcome = localBrowserTaskOutcome;
        this.stopPending = z;
        this.runtimeId = str4;
        this.pid = num;
    }
}

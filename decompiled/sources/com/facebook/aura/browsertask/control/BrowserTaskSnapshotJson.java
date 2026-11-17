package com.facebook.aura.browsertask.control;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C07729ii;
import X.C07799it;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskSnapshotJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Double device_pixel_ratio;
    public final Integer height;
    public final BrowserControlLeaseJson lease;
    public final String presented_task_id;
    public final Integer width;

    public final class Companion {
        public final C9hr<BrowserTaskSnapshotJson> serializer() {
            return BrowserTaskSnapshotJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public BrowserTaskSnapshotJson(String str, BrowserControlLeaseJson browserControlLeaseJson, Integer num, Integer num2, Double d) {
        C7384Etj.A0Y(str, 0);
        this.presented_task_id = str;
        this.lease = browserControlLeaseJson;
        this.width = num;
        this.height = num2;
        this.device_pixel_ratio = d;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_browsertask_control_control(BrowserTaskSnapshotJson browserTaskSnapshotJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(browserTaskSnapshotJson.presented_task_id)) {
            c9j5.AAV(browserTaskSnapshotJson.presented_task_id, c9iZ, 0);
        }
        if (zAfR || browserTaskSnapshotJson.lease != null) {
            c9j5.AAP(browserTaskSnapshotJson.lease, BrowserControlLeaseJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || browserTaskSnapshotJson.width != null) {
            c9j5.AAP(browserTaskSnapshotJson.width, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || browserTaskSnapshotJson.height != null) {
            c9j5.AAP(browserTaskSnapshotJson.height, C07729ii.A00, c9iZ, 3);
        }
        if (zAfR || browserTaskSnapshotJson.device_pixel_ratio != null) {
            c9j5.AAP(browserTaskSnapshotJson.device_pixel_ratio, C07799it.A00, c9iZ, 4);
        }
    }

    public final BrowserTaskSnapshotJson copy(String str, BrowserControlLeaseJson browserControlLeaseJson, Integer num, Integer num2, Double d) {
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskSnapshotJson(str, browserControlLeaseJson, num, num2, d);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskSnapshotJson) {
                BrowserTaskSnapshotJson browserTaskSnapshotJson = (BrowserTaskSnapshotJson) obj;
                if (!C7384Etj.areEqual(this.presented_task_id, browserTaskSnapshotJson.presented_task_id) || !C7384Etj.areEqual(this.lease, browserTaskSnapshotJson.lease) || !C7384Etj.areEqual(this.width, browserTaskSnapshotJson.width) || !C7384Etj.areEqual(this.height, browserTaskSnapshotJson.height) || !C7384Etj.areEqual(this.device_pixel_ratio, browserTaskSnapshotJson.device_pixel_ratio)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserTaskSnapshotJson copy$default(BrowserTaskSnapshotJson browserTaskSnapshotJson, String str, BrowserControlLeaseJson browserControlLeaseJson, Integer num, Integer num2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserTaskSnapshotJson.presented_task_id;
        }
        if ((i & 2) != 0) {
            browserControlLeaseJson = browserTaskSnapshotJson.lease;
        }
        if ((i & 4) != 0) {
            num = browserTaskSnapshotJson.width;
        }
        if ((i & 8) != 0) {
            num2 = browserTaskSnapshotJson.height;
        }
        if ((i & 16) != 0) {
            d = browserTaskSnapshotJson.device_pixel_ratio;
        }
        return browserTaskSnapshotJson.copy(str, browserControlLeaseJson, num, num2, d);
    }

    public final String component1() {
        return this.presented_task_id;
    }

    public final BrowserControlLeaseJson component2() {
        return this.lease;
    }

    public final Integer component3() {
        return this.width;
    }

    public final Integer component4() {
        return this.height;
    }

    public final Double component5() {
        return this.device_pixel_ratio;
    }

    public final Double getDevice_pixel_ratio() {
        return this.device_pixel_ratio;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final BrowserControlLeaseJson getLease() {
        return this.lease;
    }

    public final String getPresented_task_id() {
        return this.presented_task_id;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.presented_task_id) + AnonymousClass006.A0D(this.lease)) * 31) + AnonymousClass006.A0D(this.width)) * 31) + AnonymousClass006.A0D(this.height)) * 31) + C3cH.A02(this.device_pixel_ratio);
    }

    public String toString() {
        String str = this.presented_task_id;
        BrowserControlLeaseJson browserControlLeaseJson = this.lease;
        Integer num = this.width;
        Integer num2 = this.height;
        Double d = this.device_pixel_ratio;
        StringBuilder sbA0x = C3cI.A0x("BrowserTaskSnapshotJson(presented_task_id=", str);
        sbA0x.append(", lease=");
        sbA0x.append(browserControlLeaseJson);
        sbA0x.append(", width=");
        sbA0x.append(num);
        sbA0x.append(", height=");
        sbA0x.append(num2);
        return C3cJ.A0L(d, ", device_pixel_ratio=", sbA0x);
    }

    public /* synthetic */ BrowserTaskSnapshotJson(String str, BrowserControlLeaseJson browserControlLeaseJson, Integer num, Integer num2, Double d, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : browserControlLeaseJson, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : d);
    }

    public /* synthetic */ BrowserTaskSnapshotJson(int i, String str, BrowserControlLeaseJson browserControlLeaseJson, Integer num, Integer num2, Double d, C2hx c2hx) {
        this.presented_task_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.lease = null;
        } else {
            this.lease = browserControlLeaseJson;
        }
        if ((i & 4) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 8) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        if ((i & 16) == 0) {
            this.device_pixel_ratio = null;
        } else {
            this.device_pixel_ratio = d;
        }
    }

    public BrowserTaskSnapshotJson() {
        this("", null, null, null, null);
    }
}

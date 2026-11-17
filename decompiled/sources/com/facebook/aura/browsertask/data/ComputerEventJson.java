package com.facebook.aura.browsertask.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ComputerEventJson {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String event;
    public final ComputerContextJson payload;
    public final long seq;
    public final long ts_ms;
    public final String type;

    public final class Companion {
        public final C9hr<ComputerEventJson> serializer() {
            return ComputerEventJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_browsertask_data_data(ComputerEventJson computerEventJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(computerEventJson.type)) {
            c9j5.AAV(computerEventJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(computerEventJson.event)) {
            c9j5.AAV(computerEventJson.event, c9iZ, 1);
        }
        if (zAfR || computerEventJson.payload != null) {
            c9j5.AAP(computerEventJson.payload, ComputerContextJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || computerEventJson.seq != 0) {
            c9j5.AAN(c9iZ, 3, computerEventJson.seq);
        }
        if (zAfR || computerEventJson.ts_ms != 0) {
            c9j5.AAN(c9iZ, 4, computerEventJson.ts_ms);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComputerEventJson) {
                ComputerEventJson computerEventJson = (ComputerEventJson) obj;
                if (!C7384Etj.areEqual(this.type, computerEventJson.type) || !C7384Etj.areEqual(this.event, computerEventJson.event) || !C7384Etj.areEqual(this.payload, computerEventJson.payload) || this.seq != computerEventJson.seq || this.ts_ms != computerEventJson.ts_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ComputerEventJson copy$default(ComputerEventJson computerEventJson, String str, String str2, ComputerContextJson computerContextJson, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = computerEventJson.type;
        }
        if ((i & 2) != 0) {
            str2 = computerEventJson.event;
        }
        if ((i & 4) != 0) {
            computerContextJson = computerEventJson.payload;
        }
        if ((i & 8) != 0) {
            j = computerEventJson.seq;
        }
        if ((i & 16) != 0) {
            j2 = computerEventJson.ts_ms;
        }
        return computerEventJson.copy(str, str2, computerContextJson, j, j2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.event;
    }

    public final ComputerContextJson component3() {
        return this.payload;
    }

    public final long component4() {
        return this.seq;
    }

    public final long component5() {
        return this.ts_ms;
    }

    public final String getEvent() {
        return this.event;
    }

    public final ComputerContextJson getPayload() {
        return this.payload;
    }

    public final long getSeq() {
        return this.seq;
    }

    public final long getTs_ms() {
        return this.ts_ms;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.seq, (AnonymousClass005.A0I(this.event, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0D(this.payload)) * 31) + C3cG.A02(this.ts_ms);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.event;
        ComputerContextJson computerContextJson = this.payload;
        long j = this.seq;
        long j2 = this.ts_ms;
        StringBuilder sbA0x = C3cI.A0x("ComputerEventJson(type=", str);
        sbA0x.append(", event=");
        sbA0x.append(str2);
        sbA0x.append(", payload=");
        sbA0x.append(computerContextJson);
        sbA0x.append(", seq=");
        sbA0x.append(j);
        sbA0x.append(", ts_ms=");
        sbA0x.append(j2);
        return AnonymousClass001.A0v(")", sbA0x);
    }

    public ComputerEventJson(String str, String str2, ComputerContextJson computerContextJson, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        this.type = str;
        this.event = str2;
        this.payload = computerContextJson;
        this.seq = j;
        this.ts_ms = j2;
    }

    public final ComputerEventJson copy(String str, String str2, ComputerContextJson computerContextJson, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        return new ComputerEventJson(str, str2, computerContextJson, j, j2);
    }

    public /* synthetic */ ComputerEventJson(String str, String str2, ComputerContextJson computerContextJson, long j, long j2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : computerContextJson, (i & 8) != 0 ? 0L : j, C3cH.A03(i & 16, j2));
    }

    public /* synthetic */ ComputerEventJson(int i, String str, String str2, ComputerContextJson computerContextJson, long j, long j2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.event = "";
        } else {
            this.event = str2;
        }
        if ((i & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = computerContextJson;
        }
        if ((i & 8) == 0) {
            this.seq = 0L;
        } else {
            this.seq = j;
        }
        if ((i & 16) == 0) {
            this.ts_ms = 0L;
        } else {
            this.ts_ms = j2;
        }
    }

    public ComputerEventJson() {
        this("", "", null, 0L, 0L);
    }
}

package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchTranscriptMetadata extends C06G {
    public static final int $stable = 8;
    public final Long completedAtMs;
    public final boolean isSpokenSummary;
    public final List<HatchLifecycleSummaryEntry> lifecycleSummaries;
    public final String model;
    public final Long serverStartedAtMs;
    public final String source;
    public final long startedAtMs;
    public final HatchStatusNarration statusNarration;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchTranscriptMetadata$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<HatchTranscriptMetadata> serializer() {
            return HatchTranscriptMetadata$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchTranscriptMetadata(String str, String str2, long j, Long l, Long l2, HatchStatusNarration hatchStatusNarration, List<HatchLifecycleSummaryEntry> list, boolean z) {
        C7384Etj.A0Y(list, 6);
        this.model = str;
        this.source = str2;
        this.startedAtMs = j;
        this.serverStartedAtMs = l;
        this.completedAtMs = l2;
        this.statusNarration = hatchStatusNarration;
        this.lifecycleSummaries = list;
        this.isSpokenSummary = z;
    }

    public final HatchTranscriptMetadata copy(String str, String str2, long j, Long l, Long l2, HatchStatusNarration hatchStatusNarration, List<HatchLifecycleSummaryEntry> list, boolean z) {
        C7384Etj.A0Y(list, 6);
        return new HatchTranscriptMetadata(str, str2, j, l, l2, hatchStatusNarration, list, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTranscriptMetadata) {
                HatchTranscriptMetadata hatchTranscriptMetadata = (HatchTranscriptMetadata) obj;
                if (!C7384Etj.areEqual(this.model, hatchTranscriptMetadata.model) || !C7384Etj.areEqual(this.source, hatchTranscriptMetadata.source) || this.startedAtMs != hatchTranscriptMetadata.startedAtMs || !C7384Etj.areEqual(this.serverStartedAtMs, hatchTranscriptMetadata.serverStartedAtMs) || !C7384Etj.areEqual(this.completedAtMs, hatchTranscriptMetadata.completedAtMs) || !C7384Etj.areEqual(this.statusNarration, hatchTranscriptMetadata.statusNarration) || !C7384Etj.areEqual(this.lifecycleSummaries, hatchTranscriptMetadata.lifecycleSummaries) || this.isSpokenSummary != hatchTranscriptMetadata.isSpokenSummary) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchTranscriptMetadata copy$default(HatchTranscriptMetadata hatchTranscriptMetadata, String str, String str2, long j, Long l, Long l2, HatchStatusNarration hatchStatusNarration, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTranscriptMetadata.model;
        }
        if ((i & 2) != 0) {
            str2 = hatchTranscriptMetadata.source;
        }
        if ((i & 4) != 0) {
            j = hatchTranscriptMetadata.startedAtMs;
        }
        if ((i & 8) != 0) {
            l = hatchTranscriptMetadata.serverStartedAtMs;
        }
        if ((i & 16) != 0) {
            l2 = hatchTranscriptMetadata.completedAtMs;
        }
        if ((i & 32) != 0) {
            hatchStatusNarration = hatchTranscriptMetadata.statusNarration;
        }
        if ((i & 64) != 0) {
            list = hatchTranscriptMetadata.lifecycleSummaries;
        }
        if ((i & 128) != 0) {
            z = hatchTranscriptMetadata.isSpokenSummary;
        }
        return hatchTranscriptMetadata.copy(str, str2, j, l, l2, hatchStatusNarration, list, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchTranscriptMetadata hatchTranscriptMetadata, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(hatchTranscriptMetadata.model, c07779iq, c9iZ, 0);
        c9j5.AAP(hatchTranscriptMetadata.source, c07779iq, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, hatchTranscriptMetadata.startedAtMs);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchTranscriptMetadata.serverStartedAtMs != null) {
            c9j5.AAP(hatchTranscriptMetadata.serverStartedAtMs, C9j1.A00, c9iZ, 3);
        }
        c9j5.AAP(hatchTranscriptMetadata.completedAtMs, C9j1.A00, c9iZ, 4);
        if (zAfR || hatchTranscriptMetadata.statusNarration != null) {
            c9j5.AAP(hatchTranscriptMetadata.statusNarration, HatchStatusNarration$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || !C7384Etj.areEqual(hatchTranscriptMetadata.lifecycleSummaries, C3cG.A0h())) {
            c9j5.AAQ(hatchTranscriptMetadata.lifecycleSummaries, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || hatchTranscriptMetadata.isSpokenSummary) {
            c9j5.AA7(c9iZ, 7, hatchTranscriptMetadata.isSpokenSummary);
        }
    }

    public final String component1() {
        return this.model;
    }

    public final String component2() {
        return this.source;
    }

    public final long component3() {
        return this.startedAtMs;
    }

    public final Long component4() {
        return this.serverStartedAtMs;
    }

    public final Long component5() {
        return this.completedAtMs;
    }

    public final HatchStatusNarration component6() {
        return this.statusNarration;
    }

    public final List<HatchLifecycleSummaryEntry> component7() {
        return this.lifecycleSummaries;
    }

    public final boolean component8() {
        return this.isSpokenSummary;
    }

    public final Long getCompletedAtMs() {
        return this.completedAtMs;
    }

    public final List<HatchLifecycleSummaryEntry> getLifecycleSummaries() {
        return this.lifecycleSummaries;
    }

    public final String getModel() {
        return this.model;
    }

    public final Long getServerStartedAtMs() {
        return this.serverStartedAtMs;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final HatchStatusNarration getStatusNarration() {
        return this.statusNarration;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.lifecycleSummaries, (((((C60R.A00(this.startedAtMs, ((AnonymousClass006.A0G(this.model) * 31) + AnonymousClass006.A0G(this.source)) * 31) + AnonymousClass006.A0D(this.serverStartedAtMs)) * 31) + AnonymousClass006.A0D(this.completedAtMs)) * 31) + C3cH.A02(this.statusNarration)) * 31), this.isSpokenSummary);
    }

    public final boolean isSpokenSummary() {
        return this.isSpokenSummary;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTranscriptMetadata(String str, String str2, long j, Long l, Long l2, HatchStatusNarration hatchStatusNarration, List list, boolean z, int i, C06H c06h) {
        this(str, str2, j, (i & 8) != 0 ? null : l, l2, (i & 32) != 0 ? null : hatchStatusNarration, (i & 64) != 0 ? C3cG.A0h() : list, C3cH.A1N(i, z));
    }

    public /* synthetic */ HatchTranscriptMetadata(int i, String str, String str2, long j, Long l, Long l2, HatchStatusNarration hatchStatusNarration, List list, boolean z, C2hx c2hx) {
        if (23 != (i & 23)) {
            C9iI.A00(HatchTranscriptMetadata$$serializer.descriptor, i, 23);
            throw F60.createAndThrow();
        }
        this.model = str;
        this.source = str2;
        this.startedAtMs = j;
        if ((i & 8) == 0) {
            this.serverStartedAtMs = null;
        } else {
            this.serverStartedAtMs = l;
        }
        this.completedAtMs = l2;
        if ((i & 32) == 0) {
            this.statusNarration = null;
        } else {
            this.statusNarration = hatchStatusNarration;
        }
        if ((i & 64) == 0) {
            this.lifecycleSummaries = C3cG.A0h();
        } else {
            this.lifecycleSummaries = list;
        }
        if ((i & 128) == 0) {
            this.isSpokenSummary = false;
        } else {
            this.isSpokenSummary = z;
        }
    }
}

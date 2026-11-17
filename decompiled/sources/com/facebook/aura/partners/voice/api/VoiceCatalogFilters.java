package com.facebook.aura.partners.voice.api;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoiceCatalogFilters extends C06G {
    public static final int $stable = 0;
    public final AHD<VoiceCatalogFilterOption> accent;
    public final AHD<VoiceCatalogFilterOption> gender;
    public final AHD<VoiceCatalogFilterOption> tone;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogFilters) {
                VoiceCatalogFilters voiceCatalogFilters = (VoiceCatalogFilters) obj;
                if (!C7384Etj.areEqual(this.gender, voiceCatalogFilters.gender) || !C7384Etj.areEqual(this.accent, voiceCatalogFilters.accent) || !C7384Etj.areEqual(this.tone, voiceCatalogFilters.tone)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceCatalogFilters copy$default(VoiceCatalogFilters voiceCatalogFilters, AHD ahd, AHD ahd2, AHD ahd3, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = voiceCatalogFilters.gender;
        }
        if ((i & 2) != 0) {
            ahd2 = voiceCatalogFilters.accent;
        }
        if ((i & 4) != 0) {
            ahd3 = voiceCatalogFilters.tone;
        }
        return voiceCatalogFilters.copy(ahd, ahd2, ahd3);
    }

    public final AHD<VoiceCatalogFilterOption> component1() {
        return this.gender;
    }

    public final AHD<VoiceCatalogFilterOption> component2() {
        return this.accent;
    }

    public final AHD<VoiceCatalogFilterOption> component3() {
        return this.tone;
    }

    public final AHD<VoiceCatalogFilterOption> getAccent() {
        return this.accent;
    }

    public final AHD<VoiceCatalogFilterOption> getGender() {
        return this.gender;
    }

    public final AHD<VoiceCatalogFilterOption> getTone() {
        return this.tone;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.tone, AnonymousClass005.A0F(this.accent, AnonymousClass005.A0E(this.gender)));
    }

    public VoiceCatalogFilters(AHD<VoiceCatalogFilterOption> ahd, AHD<VoiceCatalogFilterOption> ahd2, AHD<VoiceCatalogFilterOption> ahd3) {
        AnonymousClass005.A0x(ahd, ahd2, ahd3);
        this.gender = ahd;
        this.accent = ahd2;
        this.tone = ahd3;
    }

    public final VoiceCatalogFilters copy(AHD<VoiceCatalogFilterOption> ahd, AHD<VoiceCatalogFilterOption> ahd2, AHD<VoiceCatalogFilterOption> ahd3) {
        AnonymousClass005.A0x(ahd, ahd2, ahd3);
        return new VoiceCatalogFilters(ahd, ahd2, ahd3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceCatalogFilters(AHD ahd, AHD ahd2, AHD ahd3, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2, (i & 4) != 0 ? AHI.A01 : ahd3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VoiceCatalogFilters() {
        AHI ahi = AHI.A01;
        this(ahi, ahi, ahi);
    }
}

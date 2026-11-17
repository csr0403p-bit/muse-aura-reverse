package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchConsentItem extends C06G {
    public final boolean mandatory;
    public final AHD<HatchTosBodyRun> sentence;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchConsentItem) {
                HatchConsentItem hatchConsentItem = (HatchConsentItem) obj;
                if (!C7384Etj.areEqual(this.title, hatchConsentItem.title) || !C7384Etj.areEqual(this.sentence, hatchConsentItem.sentence) || this.mandatory != hatchConsentItem.mandatory) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchConsentItem copy$default(HatchConsentItem hatchConsentItem, String str, AHD ahd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchConsentItem.title;
        }
        if ((i & 2) != 0) {
            ahd = hatchConsentItem.sentence;
        }
        if ((i & 4) != 0) {
            z = hatchConsentItem.mandatory;
        }
        return hatchConsentItem.copy(str, ahd, z);
    }

    public final String component1() {
        return this.title;
    }

    public final AHD<HatchTosBodyRun> component2() {
        return this.sentence;
    }

    public final boolean component3() {
        return this.mandatory;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final AHD<HatchTosBodyRun> getSentence() {
        return this.sentence;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.sentence, AnonymousClass001.A0G(this.title)), this.mandatory);
    }

    public HatchConsentItem(String str, AHD<HatchTosBodyRun> ahd, boolean z) {
        AnonymousClass003.A0u(str, ahd);
        this.title = str;
        this.sentence = ahd;
        this.mandatory = z;
    }

    public final HatchConsentItem copy(String str, AHD<HatchTosBodyRun> ahd, boolean z) {
        AnonymousClass003.A0u(str, ahd);
        return new HatchConsentItem(str, ahd, z);
    }

    public String toString() {
        return super.toString();
    }
}

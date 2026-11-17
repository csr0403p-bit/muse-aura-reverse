package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoiceCatalogFilterOption extends C06G {
    public static final int $stable = 0;
    public final int count;
    public final String label;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogFilterOption) {
                VoiceCatalogFilterOption voiceCatalogFilterOption = (VoiceCatalogFilterOption) obj;
                if (!C7384Etj.areEqual(this.value, voiceCatalogFilterOption.value) || !C7384Etj.areEqual(this.label, voiceCatalogFilterOption.label) || this.count != voiceCatalogFilterOption.count) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceCatalogFilterOption copy$default(VoiceCatalogFilterOption voiceCatalogFilterOption, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = voiceCatalogFilterOption.value;
        }
        if ((i2 & 2) != 0) {
            str2 = voiceCatalogFilterOption.label;
        }
        if ((i2 & 4) != 0) {
            i = voiceCatalogFilterOption.count;
        }
        return voiceCatalogFilterOption.copy(str, str2, i);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.value)) + this.count;
    }

    public VoiceCatalogFilterOption(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        this.value = str;
        this.label = str2;
        this.count = i;
    }

    public final VoiceCatalogFilterOption copy(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        return new VoiceCatalogFilterOption(str, str2, i);
    }

    public String toString() {
        return super.toString();
    }
}

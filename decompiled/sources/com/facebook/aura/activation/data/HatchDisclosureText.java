package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchDisclosureText extends C06G {
    public final List<HatchDisclosureEntity> entities;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDisclosureText) {
                HatchDisclosureText hatchDisclosureText = (HatchDisclosureText) obj;
                if (!C7384Etj.areEqual(this.text, hatchDisclosureText.text) || !C7384Etj.areEqual(this.entities, hatchDisclosureText.entities)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDisclosureText copy$default(HatchDisclosureText hatchDisclosureText, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchDisclosureText.text;
        }
        if ((i & 2) != 0) {
            list = hatchDisclosureText.entities;
        }
        AnonymousClass003.A0u(str, list);
        return new HatchDisclosureText(str, list);
    }

    public final String component1() {
        return this.text;
    }

    public final List<HatchDisclosureEntity> component2() {
        return this.entities;
    }

    public final List<HatchDisclosureEntity> getEntities() {
        return this.entities;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.entities, AnonymousClass001.A0G(this.text));
    }

    public HatchDisclosureText(String str, List<HatchDisclosureEntity> list) {
        AnonymousClass003.A0u(str, list);
        this.text = str;
        this.entities = list;
    }

    public final HatchDisclosureText copy(String str, List<HatchDisclosureEntity> list) {
        AnonymousClass003.A0u(str, list);
        return new HatchDisclosureText(str, list);
    }

    public String toString() {
        return super.toString();
    }
}

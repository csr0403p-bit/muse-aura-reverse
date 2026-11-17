package com.facebook.aura.checkout.ui;

import X.AGI;
import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class HatchFormSection extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;
    public final String label;
    public final AHD<HatchFormRow> rows;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchFormSection) {
                HatchFormSection hatchFormSection = (HatchFormSection) obj;
                if (!C7384Etj.areEqual(this.id, hatchFormSection.id) || !C7384Etj.areEqual(this.rows, hatchFormSection.rows) || !C7384Etj.areEqual(this.label, hatchFormSection.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public final HatchFormSection invoke(String str, AHD<HatchFormField> ahd, String str2) {
            AnonymousClass003.A0u(str, ahd);
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(new HatchFormRow(AGI.A0E((HatchFormField) it.next())));
            }
            return new HatchFormSection(str, AGI.A07(arrayListA0i), str2);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchFormSection copy$default(HatchFormSection hatchFormSection, String str, AHD ahd, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchFormSection.id;
        }
        if ((i & 2) != 0) {
            ahd = hatchFormSection.rows;
        }
        if ((i & 4) != 0) {
            str2 = hatchFormSection.label;
        }
        return hatchFormSection.copy(str, ahd, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final AHD<HatchFormRow> component2() {
        return this.rows;
    }

    public final String component3() {
        return this.label;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final AHD<HatchFormRow> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.rows, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.label);
    }

    public HatchFormSection(String str, AHD<HatchFormRow> ahd, String str2) {
        AnonymousClass003.A0u(str, ahd);
        this.id = str;
        this.rows = ahd;
        this.label = str2;
    }

    public final HatchFormSection copy(String str, AHD<HatchFormRow> ahd, String str2) {
        AnonymousClass003.A0u(str, ahd);
        return new HatchFormSection(str, ahd, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchFormSection(String str, AHD ahd, String str2, int i, C06H c06h) {
        this(str, ahd, AnonymousClass006.A0t(i, str2));
    }
}

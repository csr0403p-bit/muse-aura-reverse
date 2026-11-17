package com.facebook.aura.bloks.bottomsheet;

import X.AbstractC7608F5v;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.FDW;

/* loaded from: classes6.dex */
public final class AuraBloksBottomSheetHeaderData extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final FDW bloksModel;
    public final boolean hideBackButton;
    public final String title;

    public AuraBloksBottomSheetHeaderData() {
        this("", false, null);
    }

    public final AuraBloksBottomSheetHeaderData copy(String str, boolean z, FDW fdw) {
        C7384Etj.A0Y(str, 0);
        return new AuraBloksBottomSheetHeaderData(str, z, fdw);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBloksBottomSheetHeaderData) {
                AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData = (AuraBloksBottomSheetHeaderData) obj;
                if (!C7384Etj.areEqual(this.title, auraBloksBottomSheetHeaderData.title) || this.hideBackButton != auraBloksBottomSheetHeaderData.hideBackButton || !C7384Etj.areEqual(this.bloksModel, auraBloksBottomSheetHeaderData.bloksModel)) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public final AuraBloksBottomSheetHeaderData fromBloksBottomSheetContribs(FDW fdw) {
            C7384Etj.A0Y(fdw, 0);
            String strA0p = AbstractC7608F5v.A0p(fdw);
            return new AuraBloksBottomSheetHeaderData(strA0p != null ? strA0p : "", fdw.A0L(76, false), fdw);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ AuraBloksBottomSheetHeaderData copy$default(AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, String str, boolean z, FDW fdw, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraBloksBottomSheetHeaderData.title;
        }
        if ((i & 2) != 0) {
            z = auraBloksBottomSheetHeaderData.hideBackButton;
        }
        if ((i & 4) != 0) {
            fdw = auraBloksBottomSheetHeaderData.bloksModel;
        }
        return auraBloksBottomSheetHeaderData.copy(str, z, fdw);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component2() {
        return this.hideBackButton;
    }

    public final FDW component3() {
        return this.bloksModel;
    }

    public final FDW getBloksModel() {
        return this.bloksModel;
    }

    public final boolean getHideBackButton() {
        return this.hideBackButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass001.A0G(this.title), this.hideBackButton) + AnonymousClass006.A0D(this.bloksModel);
    }

    public String toString() {
        return super.toString();
    }

    public AuraBloksBottomSheetHeaderData(String str, boolean z, FDW fdw) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.hideBackButton = z;
        this.bloksModel = fdw;
    }

    public /* synthetic */ AuraBloksBottomSheetHeaderData(String str, boolean z, FDW fdw, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : fdw);
    }
}

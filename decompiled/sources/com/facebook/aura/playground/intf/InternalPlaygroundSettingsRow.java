package com.facebook.aura.playground.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class InternalPlaygroundSettingsRow extends C06G {
    public final String id;
    public final String keywords;
    public final G0U<AbstractC3358CGz, Unit> onSelected;
    public final String subtitle;
    public final AuraNavKey target;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InternalPlaygroundSettingsRow) {
                InternalPlaygroundSettingsRow internalPlaygroundSettingsRow = (InternalPlaygroundSettingsRow) obj;
                if (!C7384Etj.areEqual(this.id, internalPlaygroundSettingsRow.id) || !C7384Etj.areEqual(this.title, internalPlaygroundSettingsRow.title) || !C7384Etj.areEqual(this.target, internalPlaygroundSettingsRow.target) || !C7384Etj.areEqual(this.onSelected, internalPlaygroundSettingsRow.onSelected) || !C7384Etj.areEqual(this.subtitle, internalPlaygroundSettingsRow.subtitle) || !C7384Etj.areEqual(this.keywords, internalPlaygroundSettingsRow.keywords)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ InternalPlaygroundSettingsRow(String str, String str2, AuraNavKey auraNavKey, G0U g0u, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : auraNavKey, (i & 8) != 0 ? null : g0u, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? "" : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InternalPlaygroundSettingsRow copy$default(InternalPlaygroundSettingsRow internalPlaygroundSettingsRow, String str, String str2, AuraNavKey auraNavKey, G0U g0u, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalPlaygroundSettingsRow.id;
        }
        if ((i & 2) != 0) {
            str2 = internalPlaygroundSettingsRow.title;
        }
        if ((i & 4) != 0) {
            auraNavKey = internalPlaygroundSettingsRow.target;
        }
        if ((i & 8) != 0) {
            g0u = internalPlaygroundSettingsRow.onSelected;
        }
        if ((i & 16) != 0) {
            str3 = internalPlaygroundSettingsRow.subtitle;
        }
        if ((i & 32) != 0) {
            str4 = internalPlaygroundSettingsRow.keywords;
        }
        return internalPlaygroundSettingsRow.copy(str, str2, auraNavKey, g0u, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final AuraNavKey component3() {
        return this.target;
    }

    public final G0U<AbstractC3358CGz, Unit> component4() {
        return this.onSelected;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.keywords;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKeywords() {
        return this.keywords;
    }

    public final G0U<AbstractC3358CGz, Unit> getOnSelected() {
        return this.onSelected;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.keywords, (((((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0D(this.target)) * 31) + AnonymousClass006.A0D(this.onSelected)) * 31) + AnonymousClass005.A0H(this.subtitle)) * 31);
    }

    public final InternalPlaygroundSettingsRow copy(String str, String str2, AuraNavKey auraNavKey, G0U<? super AbstractC3358CGz, Unit> g0u, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str4, 5);
        return new InternalPlaygroundSettingsRow(str, str2, auraNavKey, g0u, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternalPlaygroundSettingsRow(String str, String str2, AuraNavKey auraNavKey, G0U<? super AbstractC3358CGz, Unit> g0u, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str4, 5);
        this.id = str;
        this.title = str2;
        this.target = auraNavKey;
        this.onSelected = g0u;
        this.subtitle = str3;
        this.keywords = str4;
    }
}

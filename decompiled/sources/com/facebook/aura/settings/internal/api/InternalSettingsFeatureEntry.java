package com.facebook.aura.settings.internal.api;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class InternalSettingsFeatureEntry extends C06G {
    public final Uri deeplink;
    public final String id;
    public final String keywords;
    public final G0U<AbstractC3358CGz, Unit> onSelected;
    public final AuraNavKey target;
    public final int titleRes;
    public final InternalSettingsFeatureToggle toggle;

    public static /* synthetic */ InternalSettingsFeatureEntry copy$default(InternalSettingsFeatureEntry internalSettingsFeatureEntry, String str, int i, AuraNavKey auraNavKey, String str2, G0U g0u, Uri uri, InternalSettingsFeatureToggle internalSettingsFeatureToggle, int i2, Object obj) {
        String str3 = str;
        int i3 = i;
        AuraNavKey auraNavKey2 = auraNavKey;
        String str4 = str2;
        G0U g0u2 = g0u;
        Uri uri2 = uri;
        InternalSettingsFeatureToggle internalSettingsFeatureToggle2 = internalSettingsFeatureToggle;
        if ((i2 & 1) != 0) {
            str3 = internalSettingsFeatureEntry.id;
        }
        if ((i2 & 2) != 0) {
            i3 = internalSettingsFeatureEntry.titleRes;
        }
        if ((i2 & 4) != 0) {
            auraNavKey2 = internalSettingsFeatureEntry.target;
        }
        if ((i2 & 8) != 0) {
            str4 = internalSettingsFeatureEntry.keywords;
        }
        if ((i2 & 16) != 0) {
            g0u2 = internalSettingsFeatureEntry.onSelected;
        }
        if ((i2 & 32) != 0) {
            uri2 = internalSettingsFeatureEntry.deeplink;
        }
        if ((i2 & 64) != 0) {
            internalSettingsFeatureToggle2 = internalSettingsFeatureEntry.toggle;
        }
        AnonymousClass003.A0w(str3, str4);
        return new InternalSettingsFeatureEntry(str3, i3, auraNavKey2, str4, g0u2, uri2, internalSettingsFeatureToggle2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InternalSettingsFeatureEntry) {
                InternalSettingsFeatureEntry internalSettingsFeatureEntry = (InternalSettingsFeatureEntry) obj;
                if (!C7384Etj.areEqual(this.id, internalSettingsFeatureEntry.id) || this.titleRes != internalSettingsFeatureEntry.titleRes || !C7384Etj.areEqual(this.target, internalSettingsFeatureEntry.target) || !C7384Etj.areEqual(this.keywords, internalSettingsFeatureEntry.keywords) || !C7384Etj.areEqual(this.onSelected, internalSettingsFeatureEntry.onSelected) || !C7384Etj.areEqual(this.deeplink, internalSettingsFeatureEntry.deeplink) || !C7384Etj.areEqual(this.toggle, internalSettingsFeatureEntry.toggle)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ InternalSettingsFeatureEntry(String str, int i, AuraNavKey auraNavKey, String str2, G0U g0u, Uri uri, InternalSettingsFeatureToggle internalSettingsFeatureToggle, int i2, C06H c06h) {
        this(str, i, (i2 & 4) != 0 ? null : auraNavKey, str2, (i2 & 16) != 0 ? null : g0u, (i2 & 32) != 0 ? null : uri, (i2 & 64) != 0 ? null : internalSettingsFeatureToggle);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.titleRes;
    }

    public final AuraNavKey component3() {
        return this.target;
    }

    public final String component4() {
        return this.keywords;
    }

    public final G0U<AbstractC3358CGz, Unit> component5() {
        return this.onSelected;
    }

    public final Uri component6() {
        return this.deeplink;
    }

    public final InternalSettingsFeatureToggle component7() {
        return this.toggle;
    }

    public final Uri getDeeplink() {
        return this.deeplink;
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

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final InternalSettingsFeatureToggle getToggle() {
        return this.toggle;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.keywords, (((AnonymousClass001.A0G(this.id) + this.titleRes) * 31) + AnonymousClass006.A0D(this.target)) * 31) + AnonymousClass006.A0D(this.onSelected)) * 31) + AnonymousClass006.A0D(this.deeplink)) * 31) + C3cH.A02(this.toggle);
    }

    public final InternalSettingsFeatureEntry copy(String str, int i, AuraNavKey auraNavKey, String str2, G0U<? super AbstractC3358CGz, Unit> g0u, Uri uri, InternalSettingsFeatureToggle internalSettingsFeatureToggle) {
        AnonymousClass003.A0w(str, str2);
        return new InternalSettingsFeatureEntry(str, i, auraNavKey, str2, g0u, uri, internalSettingsFeatureToggle);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternalSettingsFeatureEntry(String str, int i, AuraNavKey auraNavKey, String str2, G0U<? super AbstractC3358CGz, Unit> g0u, Uri uri, InternalSettingsFeatureToggle internalSettingsFeatureToggle) {
        AnonymousClass003.A0w(str, str2);
        this.id = str;
        this.titleRes = i;
        this.target = auraNavKey;
        this.keywords = str2;
        this.onSelected = g0u;
        this.deeplink = uri;
        this.toggle = internalSettingsFeatureToggle;
    }
}

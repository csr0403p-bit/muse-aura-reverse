package com.facebook.aura.settings.internal.api;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public final class InternalSettingsDataResetEntry extends C06G {
    public final String id;
    public final Integer subtitleRes;
    public final AuraNavKey target;
    public final int titleRes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InternalSettingsDataResetEntry) {
                InternalSettingsDataResetEntry internalSettingsDataResetEntry = (InternalSettingsDataResetEntry) obj;
                if (!C7384Etj.areEqual(this.id, internalSettingsDataResetEntry.id) || this.titleRes != internalSettingsDataResetEntry.titleRes || !C7384Etj.areEqual(this.target, internalSettingsDataResetEntry.target) || !C7384Etj.areEqual(this.subtitleRes, internalSettingsDataResetEntry.subtitleRes)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ InternalSettingsDataResetEntry(String str, int i, AuraNavKey auraNavKey, Integer num, int i2, C06H c06h) {
        this(str, i, auraNavKey, (i2 & 8) != 0 ? null : num);
    }

    public static /* synthetic */ InternalSettingsDataResetEntry copy$default(InternalSettingsDataResetEntry internalSettingsDataResetEntry, String str, int i, AuraNavKey auraNavKey, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = internalSettingsDataResetEntry.id;
        }
        if ((i2 & 2) != 0) {
            i = internalSettingsDataResetEntry.titleRes;
        }
        if ((i2 & 4) != 0) {
            auraNavKey = internalSettingsDataResetEntry.target;
        }
        if ((i2 & 8) != 0) {
            num = internalSettingsDataResetEntry.subtitleRes;
        }
        AnonymousClass003.A0v(str, auraNavKey);
        return new InternalSettingsDataResetEntry(str, i, auraNavKey, num);
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

    public final Integer component4() {
        return this.subtitleRes;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.target, (AnonymousClass001.A0G(this.id) + this.titleRes) * 31) + AnonymousClass006.A0D(this.subtitleRes);
    }

    public final InternalSettingsDataResetEntry copy(String str, int i, AuraNavKey auraNavKey, Integer num) {
        AnonymousClass003.A0v(str, auraNavKey);
        return new InternalSettingsDataResetEntry(str, i, auraNavKey, num);
    }

    public String toString() {
        return super.toString();
    }

    public InternalSettingsDataResetEntry(String str, int i, AuraNavKey auraNavKey, Integer num) {
        AnonymousClass003.A0v(str, auraNavKey);
        this.id = str;
        this.titleRes = i;
        this.target = auraNavKey;
        this.subtitleRes = num;
    }
}

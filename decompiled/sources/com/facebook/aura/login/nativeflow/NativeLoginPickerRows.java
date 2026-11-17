package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class NativeLoginPickerRows<S> extends C06G {
    public final List<AuraRememberedAccount> remembered;
    public final Map<String, HatchMuseProfile> rememberedMuseProfiles;
    public final List<S> siblings;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginPickerRows) {
                NativeLoginPickerRows nativeLoginPickerRows = (NativeLoginPickerRows) obj;
                if (!C7384Etj.areEqual(this.remembered, nativeLoginPickerRows.remembered) || !C7384Etj.areEqual(this.siblings, nativeLoginPickerRows.siblings) || !C7384Etj.areEqual(this.rememberedMuseProfiles, nativeLoginPickerRows.rememberedMuseProfiles)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeLoginPickerRows copy$default(NativeLoginPickerRows nativeLoginPickerRows, List list, List list2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nativeLoginPickerRows.remembered;
        }
        if ((i & 2) != 0) {
            list2 = nativeLoginPickerRows.siblings;
        }
        if ((i & 4) != 0) {
            map = nativeLoginPickerRows.rememberedMuseProfiles;
        }
        return nativeLoginPickerRows.copy(list, list2, map);
    }

    public final List<AuraRememberedAccount> component1() {
        return this.remembered;
    }

    public final List<S> component2() {
        return this.siblings;
    }

    public final Map<String, HatchMuseProfile> component3() {
        return this.rememberedMuseProfiles;
    }

    public final List<AuraRememberedAccount> getRemembered() {
        return this.remembered;
    }

    public final Map<String, HatchMuseProfile> getRememberedMuseProfiles() {
        return this.rememberedMuseProfiles;
    }

    public final List<S> getSiblings() {
        return this.siblings;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rememberedMuseProfiles, AnonymousClass005.A0F(this.siblings, AnonymousClass005.A0E(this.remembered)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginPickerRows(List<AuraRememberedAccount> list, List<? extends S> list2, Map<String, HatchMuseProfile> map) {
        AnonymousClass005.A0x(list, list2, map);
        this.remembered = list;
        this.siblings = list2;
        this.rememberedMuseProfiles = map;
    }

    public final NativeLoginPickerRows<S> copy(List<AuraRememberedAccount> list, List<? extends S> list2, Map<String, HatchMuseProfile> map) {
        AnonymousClass005.A0x(list, list2, map);
        return new NativeLoginPickerRows<>(list, list2, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeLoginPickerRows(List list, List list2, Map map, int i, C06H c06h) {
        this(list, list2, C3cH.A0o(map, i & 4));
    }
}

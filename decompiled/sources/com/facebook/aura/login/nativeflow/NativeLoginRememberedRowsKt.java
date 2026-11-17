package com.facebook.aura.login.nativeflow;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.FGI;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import com.facebook.aura.login.credentials.AuraRememberedLinkedAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class NativeLoginRememberedRowsKt {
    public static final String REMEMBERED_ROW_GLYPH_PLATFORM = "abra";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final NativeLoginAccountUiModel toRememberedUiModel(AuraRememberedAccount auraRememberedAccount, Map<String, HatchMuseProfile> map) {
        ?? A0z;
        HatchMuseProfile hatchMuseProfile;
        boolean zA1a = AnonymousClass002.A1a(auraRememberedAccount, map);
        NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel = null;
        if (auraRememberedAccount.linkedAccounts.isEmpty()) {
            String str = auraRememberedAccount.profilePictureUrl;
            A0z = AbstractC0885AGm.A0z(str != null ? new NativeLoginLinkedAccountUiModel(null, str) : null);
        } else {
            List<AuraRememberedLinkedAccount> list = auraRememberedAccount.linkedAccounts;
            A0z = AnonymousClass002.A0m(list);
            for (AuraRememberedLinkedAccount auraRememberedLinkedAccount : list) {
                A0z.add(new NativeLoginLinkedAccountUiModel(auraRememberedLinkedAccount.platform, auraRememberedLinkedAccount.profilePictureUrl));
            }
        }
        String strA0M = FGI.A0M("remembered-", auraRememberedAccount.abraUserId);
        String strPickerLabel = NativeLoginRememberedAccountsKt.pickerLabel(auraRememberedAccount);
        if (strPickerLabel == null) {
            strPickerLabel = "";
        }
        NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel = (NativeLoginLinkedAccountUiModel) AbstractC0878AGe.A0G(A0z);
        String str2 = nativeLoginLinkedAccountUiModel != null ? nativeLoginLinkedAccountUiModel.photoUrl : null;
        AHD ahdA07 = AGI.A07(AbstractC0878AGe.A0a(A0z, 7));
        int iMax = Math.max(auraRememberedAccount.linkedAccountCount, A0z.size());
        ArrayList arrayListA0m = AnonymousClass002.A0m(A0z);
        for (NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel2 : A0z) {
            arrayListA0m.add(new NativeLoginProfileUiModel(nativeLoginLinkedAccountUiModel2.platform, nativeLoginLinkedAccountUiModel2.photoUrl, null));
        }
        AHD ahdA072 = AGI.A07(arrayListA0m);
        String str3 = auraRememberedAccount.savedAccountId;
        if (str3 != null && (hatchMuseProfile = map.get(str3)) != null) {
            nativeLoginMuseProfileUiModel = new NativeLoginMuseProfileUiModel(hatchMuseProfile.name, hatchMuseProfile.profilePictureUrl);
        }
        return new NativeLoginAccountUiModel(strA0M, strPickerLabel, null, str2, ahdA07, iMax, ahdA072, false, zA1a, zA1a, false, null, REMEMBERED_ROW_GLYPH_PLATFORM, nativeLoginMuseProfileUiModel, false, HatchDisclosurePresentation.INLINE, HatchAccountStatus.ACTIVE);
    }
}

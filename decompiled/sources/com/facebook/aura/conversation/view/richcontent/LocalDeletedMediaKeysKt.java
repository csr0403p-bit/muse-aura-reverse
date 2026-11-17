package com.facebook.aura.conversation.view.richcontent;

import X.AKH;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BGK;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import com.facebook.aura.file.repo.HatchDeletedMediaStore;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class LocalDeletedMediaKeysKt {
    public static final AKH<Set<String>> LocalDeletedMediaKeys = AnonymousClass002.A0L(LocalDeletedMediaKeysKt$LocalDeletedMediaKeys$1.INSTANCE);

    public static final boolean isMediaDeleted(String str, boolean z, String str2, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        Set set = (Set) bfm.A6v(LocalDeletedMediaKeys);
        HatchDeletedMediaStore.Companion companion = HatchDeletedMediaStore.Companion;
        String strCanonicalKey = companion.canonicalKey(str);
        String strCanonicalKey2 = str2 != null ? companion.canonicalKey(str2) : null;
        return z || (strCanonicalKey != null && set.contains(strCanonicalKey)) || (strCanonicalKey2 != null && set.contains(strCanonicalKey2));
    }

    public static final Set<String> rememberDeletedMediaKeys(AbstractC3358CGz abstractC3358CGz, BFM bfm, int i) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        boolean zA65 = bfm.A65(abstractC3358CGz);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchDeletedMediaStore.Companion.getInstance(abstractC3358CGz);
            bfm.Ai0(objAaT);
        }
        HatchDeletedMediaStore hatchDeletedMediaStore = (HatchDeletedMediaStore) objAaT;
        C1BO c1boA02 = C2CK.A02(bfm, hatchDeletedMediaStore.deletedKeys);
        C1BO c1boA022 = C2CK.A02(bfm, hatchDeletedMediaStore.failedLoadKeys);
        C1BO c1boA023 = C2CK.A02(bfm, hatchDeletedMediaStore.sessionHiddenKeys);
        boolean zA1R = AnonymousClass005.A1R(bfm, c1boA02.getValue(), c1boA022.getValue(), c1boA023.getValue());
        Object objAaT2 = bfm.AaT();
        if (zA1R || objAaT2 == C78N.A00) {
            objAaT2 = BGK.A01((Iterable) c1boA023.getValue(), BGK.A01((Iterable) c1boA022.getValue(), (Set) c1boA02.getValue()));
            bfm.Ai0(objAaT2);
        }
        return (Set) objAaT2;
    }

    public static final AKH<Set<String>> getLocalDeletedMediaKeys() {
        return LocalDeletedMediaKeys;
    }
}

package com.facebook.aura.spaces.view;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.C1BO;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.spaces.view.SpaceMetadataViewModel;

/* loaded from: classes.dex */
public abstract class SpaceMetadataViewModelKt {
    public static final SpaceMetadataViewModel rememberSpaceMetadataModel(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        HatchGatewayPrefsStore companion = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGzA0h);
        C1BO c1boA02 = C2CK.A02(bfm, companion.hatcheryVmIdFlow);
        String gatewayUrl = companion.getGatewayUrl();
        int iHashCode = abstractC3358CGzA0h.hashCode();
        String strA08 = C1BO.A08(c1boA02);
        StringBuilder sb = new StringBuilder("space-metadata:");
        sb.append(iHashCode);
        sb.append(":");
        sb.append(strA08);
        sb.append(":");
        sb.append(gatewayUrl);
        sb.append(":");
        String strA0v = AnonymousClass001.A0v(str, sb);
        SpaceMetadataViewModel.Factory factory = new SpaceMetadataViewModel.Factory(abstractC3358CGzA0h, str);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (SpaceMetadataViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SpaceMetadataViewModel.class, strA0v);
        }
        throw AnonymousClass001.A0o();
    }
}

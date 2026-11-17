package X;

import com.facebook.aura.maps.icons.HatchPlaceActionsIconProvider;

/* renamed from: X.0O4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0O4 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Boolean> {
    public C0O4() {
        super(3);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Boolean invoke(BRg bRg, BFM bfm, Integer num) {
        BBI bbiA0M;
        Boolean boolValueOf;
        BRg bRg2 = bRg;
        BFM bfm2 = bfm;
        int iA0F = AnonymousClass001.A0F(num);
        C7384Etj.A0Y(bRg2, 0);
        bfm2.AgE(-256782777);
        HatchPlaceActionsIconProvider hatchPlaceActionsIconProvider = (HatchPlaceActionsIconProvider) bfm2.A6v(C0jH.A00);
        if (hatchPlaceActionsIconProvider == null) {
            bbiA0M = AnonymousClass002.A0M(bfm2, -478910418);
            boolValueOf = null;
        } else {
            bfm2.AgE(-1955111373);
            boolean zCallIcon = hatchPlaceActionsIconProvider.CallIcon(bRg2, bfm2, iA0F & 14);
            bbiA0M = (BBI) bfm2;
            BBI.A0R(bbiA0M, false);
            boolValueOf = Boolean.valueOf(zCallIcon);
        }
        boolean zEquals = AnonymousClass001.A0i().equals(boolValueOf);
        BBI.A0R(bbiA0M, false);
        return Boolean.valueOf(zEquals);
    }
}

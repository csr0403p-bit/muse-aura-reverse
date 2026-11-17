package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.n;
import com.android.billingclient.api.y;
import com.android.billingclient.r1;
import com.android.billingclient.t5;
import com.facebook.payments.dcp.xapp.billingclient.impl.v9.QueryDcpProductDetailsV9Kt;
import java.util.concurrent.Callable;

/* renamed from: X.GNo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9536GNo implements HuC {
    public final GOL A00;
    public final Hy6 A01 = Hy6.A02;

    @Override // X.HuC
    public final void ACo(HyF hyF, String str) {
        GOL gol = this.A00;
        final GOW gow = new GOW(hyF);
        final C9530GNh c9530GNh = (C9530GNh) gol;
        if (C9530GNh.A05(c9530GNh, new Runnable() { // from class: X.GOF
            public static final String __redex_internal_original_name = "BillingClientImpl$$ExternalSyntheticLambda26";

            @Override // java.lang.Runnable
            public final void run() {
                C9530GNh c9530GNh2 = c9530GNh;
                GOW gow2 = gow;
                EnumC9535GNn enumC9535GNn = EnumC9535GNn.A2H;
                EnumC9540GNw enumC9540GNw = EnumC9540GNw.A0B;
                GNM gnm = GO0.A0N;
                C9530GNh.A0B(c9530GNh2, gnm, enumC9540GNw, enumC9535GNn);
                gow2.A00(null, gnm);
            }
        }, new Callable() { // from class: X.GNl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t5 t5Var;
                GNM gnm;
                C9530GNh c9530GNh2 = c9530GNh;
                GOW gow2 = gow;
                try {
                    if (!C9530GNh.A0L(c9530GNh2, AbstractC9566GOx.A02)) {
                        GNN.A06("BillingClient", "Service disconnected.");
                        EnumC9535GNn enumC9535GNn = EnumC9535GNn.A1D;
                        EnumC9540GNw enumC9540GNw = EnumC9540GNw.A0B;
                        gnm = GO0.A0M;
                        C9530GNh.A0B(c9530GNh2, gnm, enumC9540GNw, enumC9535GNn);
                    } else {
                        if (c9530GNh2.A0F) {
                            synchronized (c9530GNh2.A0O) {
                                t5Var = c9530GNh2.A0U;
                            }
                            if (t5Var == null) {
                                GNM gnm2 = GO0.A0M;
                                EnumC9535GNn enumC9535GNn2 = EnumC9535GNn.A1I;
                                GNN.A07("BillingClient", "getBillingConfig got an exception.", null);
                                EnumC9540GNw enumC9540GNw2 = EnumC9540GNw.A0B;
                                GNr gNr = GNr.$redex_init_class;
                                C9530GNh.A0C(c9530GNh2, gnm2, enumC9540GNw2, enumC9535GNn2, null);
                                gow2.A00(null, gnm2);
                                return null;
                            }
                            if (!AbstractC9566GOx.A04 || !c9530GNh2.A06) {
                                String packageName = c9530GNh2.A01.getPackageName();
                                String str2 = c9530GNh2.A0P;
                                String str3 = c9530GNh2.A0Q;
                                long jLongValue = c9530GNh2.A0N.longValue();
                                Bundle bundleA0N = BV6.A0N();
                                GNN.A04(bundleA0N, str2, str3, jLongValue);
                                if (!TextUtils.isEmpty(null)) {
                                    bundleA0N.putString("accountName", null);
                                }
                                n nVar = new n(c9530GNh2.A04, gow2, c9530GNh2.A00);
                                Parcel parcelA01 = r1.A01(t5Var);
                                parcelA01.writeInt(18);
                                parcelA01.writeString(packageName);
                                parcelA01.writeInt(1);
                                bundleA0N.writeToParcel(parcelA01, 0);
                                parcelA01.writeStrongBinder(nVar.asBinder());
                                Parcel parcelObtain = Parcel.obtain();
                                try {
                                    t5Var.A00.transact(1301, parcelA01, parcelObtain, 0);
                                    parcelObtain.readException();
                                    return null;
                                } finally {
                                    parcelA01.recycle();
                                    parcelObtain.recycle();
                                }
                            }
                            String str4 = c9530GNh2.A0P;
                            Context context = c9530GNh2.A01;
                            int i = GO1.c;
                            C9555GOm c9555GOm = new C9555GOm();
                            GO1 go1 = (GO1) GIG.A02(c9555GOm);
                            go1.getClass();
                            str4.getClass();
                            go1.bitField0_ |= 8;
                            go1.playBillingLibraryVersion_ = str4;
                            GO1 go12 = (GO1) GIG.A02(c9555GOm);
                            go12.bitField0_ |= 1;
                            go12.requiredBillingVersion_ = 24;
                            String packageName2 = context.getPackageName();
                            GO1 go13 = (GO1) GIG.A02(c9555GOm);
                            go13.getClass();
                            go13.bitField0_ |= 16;
                            go13.callingPackage_ = packageName2;
                            GO1 go14 = (GO1) GIG.A02(c9555GOm);
                            go14.getClass();
                            go14.bitField0_ |= 32;
                            go14.playBillingLibraryMethod_ = "getBillingConfig";
                            try {
                                String strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                                GO1 go15 = (GO1) GIG.A02(c9555GOm);
                                go15.getClass();
                                go15.bitField0_ |= 4;
                                go15.appVersion_ = strValueOf;
                            } catch (PackageManager.NameNotFoundException unused) {
                                GNN.A06("DelegationApiParamsBuilder", "No version code is found!");
                            }
                            GO1 go16 = (GO1) c9555GOm.A03();
                            int i2 = GIW.c;
                            GIX gix = new GIX();
                            int i3 = C9415GIe.c;
                            C9416GIf c9416GIf = new C9416GIf();
                            C9415GIe c9415GIe = (C9415GIe) GIG.A02(c9416GIf);
                            c9415GIe.getClass();
                            c9415GIe.kindCase_ = 3;
                            c9415GIe.kind_ = str4;
                            gix.A05((C9415GIe) c9416GIf.A03(), "PLAY_BILLING_LIBRARY_VERSION");
                            C9416GIf c9416GIf2 = new C9416GIf();
                            String packageName3 = context.getPackageName();
                            C9415GIe c9415GIe2 = (C9415GIe) GIG.A02(c9416GIf2);
                            c9415GIe2.getClass();
                            c9415GIe2.kindCase_ = 3;
                            c9415GIe2.kind_ = packageName3;
                            gix.A05((C9415GIe) c9416GIf2.A03(), "CALLING_PACKAGE");
                            GI0 gi0A03 = gix.A03();
                            Bundle bundleA0N2 = BV6.A0N();
                            bundleA0N2.putByteArray("REQUEST_METADATA", go16.A0C());
                            bundleA0N2.putByteArray("REQUEST_PARAMS", gi0A03.A0C());
                            if (!TextUtils.isEmpty(null)) {
                                bundleA0N2.putString("accountName", null);
                            }
                            y yVar = new y(c9530GNh2.A04, gow2, c9530GNh2.A00);
                            Parcel parcelA012 = r1.A01(t5Var);
                            parcelA012.writeInt(1);
                            bundleA0N2.writeToParcel(parcelA012, 0);
                            parcelA012.writeStrongBinder(yVar.asBinder());
                            t5Var.A03(parcelA012, 2001);
                            return null;
                        }
                        GNN.A06("BillingClient", "Current client doesn't support get billing config.");
                        EnumC9535GNn enumC9535GNn3 = EnumC9535GNn.A0J;
                        EnumC9540GNw enumC9540GNw3 = EnumC9540GNw.A0B;
                        gnm = GO0.A00;
                        C9530GNh.A0B(c9530GNh2, gnm, enumC9540GNw3, enumC9535GNn3);
                    }
                    gow2.A00(null, gnm);
                    return null;
                } catch (DeadObjectException e) {
                    GNM gnm3 = GO0.A0M;
                    EnumC9535GNn enumC9535GNn4 = EnumC9535GNn.A1c;
                    GNN.A07("BillingClient", "getBillingConfig got an exception.", e);
                    C9530GNh.A0C(c9530GNh2, gnm3, EnumC9540GNw.A0B, enumC9535GNn4, GNr.A02(e));
                    gow2.A00(null, gnm3);
                    return null;
                } catch (Exception e2) {
                    GNM gnm4 = GO0.A0K;
                    EnumC9535GNn enumC9535GNn5 = EnumC9535GNn.A1c;
                    GNN.A07("BillingClient", "getBillingConfig got an exception.", e2);
                    C9530GNh.A0C(c9530GNh2, gnm4, EnumC9540GNw.A0B, enumC9535GNn5, GNr.A02(e2));
                    gow2.A00(null, gnm4);
                    return null;
                }
            }
        }) == null) {
            GNM gnmA01 = C9530GNh.A01(c9530GNh);
            C9530GNh.A0B(c9530GNh, gnmA01, EnumC9540GNw.A0B, EnumC9535GNn.A2K);
            gow.A00(null, gnmA01);
        }
    }

    public static GO7 A00(EnumC8950FuP enumC8950FuP, GIG gig) {
        int i = GO7.c;
        C9554GOl c9554GOl = new C9554GOl();
        c9554GOl.A04();
        GO7 go7 = (GO7) c9554GOl.A00;
        go7.getClass();
        go7.featureType_ = enumC8950FuP.a;
        go7.bitField0_ |= 1;
        GO7 go72 = (GO7) c9554GOl.A03();
        gig.A04();
        return go72;
    }

    @Override // X.HuC
    public final Object A2s(Hz2 hz2, HtJ<? super InterfaceC10512HoG> htJ) {
        String str = hz2.A03;
        if (str == null) {
            throw C60O.A0i("Purchase token must be set");
        }
        GPB gpb = new GPB();
        gpb.A00 = str;
        return HyA.A00(new FZG(9, gpb, this), htJ);
    }

    @Override // X.HuC
    public final Object A6z(Hz2 hz2, HtJ<? super InterfaceC10512HoG> htJ) {
        String str = hz2.A03;
        if (str == null) {
            throw C60O.A0i("Purchase token must be set");
        }
        GPC gpc = new GPC();
        gpc.A00 = str;
        return HyA.A00(new FZG(10, gpc, this), htJ);
    }

    @Override // X.HuC
    public final InterfaceC9726Gee A7h() {
        return new C9538GNu();
    }

    @Override // X.HuC
    public final void AAa() {
        this.A00.A0N();
    }

    @Override // X.HuC
    public final String ACn() {
        return String.valueOf(this.A01.major);
    }

    @Override // X.HuC
    public final /* synthetic */ Integer AIk() {
        return Hso.A00;
    }

    @Override // X.HuC
    public final Hy6 AIm() {
        return this.A01;
    }

    @Override // X.HuC
    public final Object APU(Activity activity, C79e c79e, HtJ<? super InterfaceC10512HoG> htJ) {
        C7384Etj.A0Z(c79e, "null cannot be cast to non-null type com.facebook.payments.dcp.xapp.billingclient.impl.v9.DcpBillingFlowParamsV9");
        GNM gnmA0M = this.A00.A0M(activity, ((C9547GOd) c79e).A00);
        int i = 0;
        switch (AbstractC9718GeW.A00(gnmA0M.A00).ordinal()) {
            case 0:
                i = 3;
                break;
            case 1:
                i = 5;
                break;
            case 2:
                i = 6;
                break;
            case 3:
                i = -2;
                break;
            case 4:
                i = 7;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 4;
                break;
            case 7:
                i = 12;
                break;
            case 8:
                break;
            case 9:
                i = -1;
                break;
            case 10:
                i = -3;
                break;
            case 11:
                i = 2;
                break;
            default:
                i = 1;
                break;
        }
        String str = gnmA0M.A02;
        C7384Etj.A0U(str);
        return new GOD(GNM.A00(str, i, 0));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GOz;ZLX/HtJ<-LX/HzU;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // X.HuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AYy(X.GOz r13, X.HtJ r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9536GNo.AYy(X.GOz, X.HtJ, boolean):java.lang.Object");
    }

    @Override // X.HuC
    public final boolean isReady() {
        return C9530GNh.A0K((C9530GNh) this.A00);
    }

    public C9536GNo(Context context, Hwq hwq) {
        Hxa hxa = new Hxa(hwq);
        GPA gpa = new GPA();
        try {
        } catch (Exception e) {
            GNN.A07("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
        }
        GOL c9531GNi = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false) ? new C9531GNi(context, gpa, hxa) : new C9530GNh(context, gpa, hxa);
        this.A00 = c9531GNi;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hkg;ZLX/HtJ<-LX/Hkf;>;)Ljava/lang/Object; */
    @Override // X.HuC
    public final Object AYx(Hkg hkg, HtJ htJ, boolean z) {
        return QueryDcpProductDetailsV9Kt.A00(this, hkg, htJ);
    }
}

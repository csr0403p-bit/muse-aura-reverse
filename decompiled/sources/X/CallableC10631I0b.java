package X;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.billingclient.r1;
import com.android.billingclient.t5;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* renamed from: X.I0b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC10631I0b implements Callable {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public CallableC10631I0b(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        t5 t5Var;
        GNM gnm;
        t5 t5Var2;
        int iA00;
        String strA03;
        C9557GOo c9557GOo;
        GNM gnmA00;
        EnumC9535GNn enumC9535GNn;
        String str;
        t5 t5Var3;
        EnumC9535GNn enumC9535GNn2;
        EnumC9540GNw enumC9540GNw;
        GNM gnm2;
        switch (this.$t) {
            case 0:
                C9530GNh c9530GNh = (C9530GNh) this.A00;
                GOY goy = (GOY) this.A01;
                GPB gpb = (GPB) this.A02;
                try {
                    if (!C9530GNh.A0L(c9530GNh, AbstractC9566GOx.A02)) {
                        EnumC9535GNn enumC9535GNn3 = EnumC9535GNn.A1D;
                        EnumC9540GNw enumC9540GNw2 = EnumC9540GNw.A04;
                        gnm = GO0.A0M;
                        C9530GNh.A0B(c9530GNh, gnm, enumC9540GNw2, enumC9535GNn3);
                    } else if (TextUtils.isEmpty(gpb.A00)) {
                        GNN.A06("BillingClient", "Please provide a valid purchase token.");
                        EnumC9535GNn enumC9535GNn4 = EnumC9535GNn.A01;
                        EnumC9540GNw enumC9540GNw3 = EnumC9540GNw.A04;
                        gnm = GO0.A0J;
                        C9530GNh.A0B(c9530GNh, gnm, enumC9540GNw3, enumC9535GNn4);
                    } else {
                        if (c9530GNh.A0A) {
                            synchronized (c9530GNh.A0O) {
                                t5Var = c9530GNh.A0U;
                            }
                            if (t5Var == null) {
                                GNM gnm3 = GO0.A0M;
                                EnumC9535GNn enumC9535GNn5 = EnumC9535GNn.A1I;
                                GNN.A07("BillingClient", "Error in acknowledge purchase!", null);
                                EnumC9540GNw enumC9540GNw4 = EnumC9540GNw.A04;
                                GNr gNr = GNr.$redex_init_class;
                                C9530GNh.A0C(c9530GNh, gnm3, enumC9540GNw4, enumC9535GNn5, null);
                                goy.A00(gnm3);
                                return null;
                            }
                            c9530GNh.A01.getPackageName();
                            String str2 = gpb.A00;
                            String str3 = c9530GNh.A0P;
                            String str4 = c9530GNh.A0Q;
                            long jLongValue = c9530GNh.A0N.longValue();
                            Bundle bundleA0N = BV6.A0N();
                            GNN.A04(bundleA0N, str3, str4, jLongValue);
                            Parcel parcelA01 = r1.A01(t5Var);
                            AbstractC7609F5w.A18(parcelA01, str2, 9);
                            parcelA01.writeInt(1);
                            bundleA0N.writeToParcel(parcelA01, 0);
                            Parcel parcelA02 = t5Var.A02(parcelA01, 902);
                            Bundle bundle = (Bundle) (parcelA02.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelA02));
                            parcelA02.recycle();
                            int iA002 = GNN.A00(bundle, "BillingClient");
                            String strA032 = GNN.A03(bundle, "BillingClient");
                            GNM gnm4 = GO0.A00;
                            goy.A00(GNM.A00(strA032, iA002, 0));
                            return null;
                        }
                        EnumC9535GNn enumC9535GNn6 = EnumC9535GNn.A04;
                        EnumC9540GNw enumC9540GNw5 = EnumC9540GNw.A04;
                        gnm = GO0.A0D;
                        C9530GNh.A0B(c9530GNh, gnm, enumC9540GNw5, enumC9535GNn6);
                    }
                    goy.A00(gnm);
                    return null;
                } catch (DeadObjectException e) {
                    GNM gnm5 = GO0.A0M;
                    EnumC9535GNn enumC9535GNn7 = EnumC9535GNn.A07;
                    GNN.A07("BillingClient", "Error in acknowledge purchase!", e);
                    C9530GNh.A0C(c9530GNh, gnm5, EnumC9540GNw.A04, enumC9535GNn7, GNr.A02(e));
                    goy.A00(gnm5);
                    return null;
                } catch (Exception e2) {
                    GNM gnm6 = GO0.A0K;
                    EnumC9535GNn enumC9535GNn8 = EnumC9535GNn.A07;
                    GNN.A07("BillingClient", "Error in acknowledge purchase!", e2);
                    C9530GNh.A0C(c9530GNh, gnm6, EnumC9540GNw.A04, enumC9535GNn8, GNr.A02(e2));
                    goy.A00(gnm6);
                    return null;
                }
            case 1:
                C9530GNh c9530GNh2 = (C9530GNh) this.A00;
                GOX gox = (GOX) this.A01;
                GPC gpc = (GPC) this.A02;
                if (!C9530GNh.A0L(c9530GNh2, AbstractC9566GOx.A02)) {
                    EnumC9535GNn enumC9535GNn9 = EnumC9535GNn.A1D;
                    EnumC9540GNw enumC9540GNw6 = EnumC9540GNw.A05;
                    GNM gnm7 = GO0.A0M;
                    C9530GNh.A0B(c9530GNh2, gnm7, enumC9540GNw6, enumC9535GNn9);
                    gox.A00(gnm7);
                    return null;
                }
                String str5 = gpc.A00;
                try {
                    GNN.A05("BillingClient", FGI.A0M("Consuming purchase with token: ", str5));
                    synchronized (c9530GNh2.A0O) {
                        t5Var2 = c9530GNh2.A0U;
                    }
                    if (t5Var2 == null) {
                        GNM gnm8 = GO0.A0M;
                        EnumC9535GNn enumC9535GNn10 = EnumC9535GNn.A1I;
                        GNN.A07("BillingClient", "Service has been reset to null.", null);
                        EnumC9540GNw enumC9540GNw7 = EnumC9540GNw.A05;
                        GNr gNr2 = GNr.$redex_init_class;
                        C9530GNh.A0C(c9530GNh2, gnm8, enumC9540GNw7, enumC9535GNn10, null);
                        gox.A00(gnm8);
                        return null;
                    }
                    boolean z = c9530GNh2.A0A;
                    Context context = c9530GNh2.A01;
                    if (z) {
                        context.getPackageName();
                        boolean z2 = c9530GNh2.A0A;
                        String str6 = c9530GNh2.A0P;
                        String str7 = c9530GNh2.A0Q;
                        long jLongValue2 = c9530GNh2.A0N.longValue();
                        Bundle bundleA0N2 = BV6.A0N();
                        if (z2) {
                            GNN.A04(bundleA0N2, str6, str7, jLongValue2);
                        }
                        Parcel parcelA012 = r1.A01(t5Var2);
                        AbstractC7609F5w.A18(parcelA012, str5, 9);
                        parcelA012.writeInt(1);
                        bundleA0N2.writeToParcel(parcelA012, 0);
                        Parcel parcelA022 = t5Var2.A02(parcelA012, 12);
                        Bundle bundle2 = (Bundle) (parcelA022.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelA022));
                        parcelA022.recycle();
                        iA00 = bundle2.getInt("RESPONSE_CODE");
                        strA03 = GNN.A03(bundle2, "BillingClient");
                    } else {
                        context.getPackageName();
                        Parcel parcelA013 = r1.A01(t5Var2);
                        AbstractC7609F5w.A18(parcelA013, str5, 3);
                        iA00 = r1.A00(parcelA013, t5Var2, 5);
                        strA03 = "";
                    }
                    GNM gnm9 = GO0.A00;
                    GNO gno = new GNO();
                    gno.A00 = iA00;
                    gno.A01 = strA03;
                    GNM gnmA002 = gno.A00();
                    if (iA00 == 0) {
                        GNN.A05("BillingClient", "Successfully consumed purchase.");
                        gox.A00(gnmA002);
                        return null;
                    }
                    EnumC9535GNn enumC9535GNn11 = EnumC9535GNn.A2E;
                    GNN.A07("BillingClient", FGI.A0H("Error consuming purchase with token. Response code: ", iA00), null);
                    EnumC9540GNw enumC9540GNw8 = EnumC9540GNw.A05;
                    GNr gNr3 = GNr.$redex_init_class;
                    C9530GNh.A0C(c9530GNh2, gnmA002, enumC9540GNw8, enumC9535GNn11, null);
                    gox.A00(gnmA002);
                    return null;
                } catch (DeadObjectException e3) {
                    GNM gnm10 = GO0.A0M;
                    EnumC9535GNn enumC9535GNn12 = EnumC9535GNn.A0A;
                    GNN.A07("BillingClient", "Error consuming purchase!", e3);
                    C9530GNh.A0C(c9530GNh2, gnm10, EnumC9540GNw.A05, enumC9535GNn12, GNr.A02(e3));
                    gox.A00(gnm10);
                    return null;
                } catch (Exception e4) {
                    GNM gnm11 = GO0.A0K;
                    EnumC9535GNn enumC9535GNn13 = EnumC9535GNn.A0A;
                    GNN.A07("BillingClient", "Error consuming purchase!", e4);
                    C9530GNh.A0C(c9530GNh2, gnm11, EnumC9540GNw.A05, enumC9535GNn13, GNr.A02(e4));
                    gox.A00(gnm11);
                    return null;
                }
            case 2:
                C9530GNh c9530GNh3 = (C9530GNh) this.A00;
                GO3 go3 = (GO3) this.A01;
                GP2 gp2 = (GP2) this.A02;
                if (!C9530GNh.A0L(c9530GNh3, AbstractC9566GOx.A02)) {
                    enumC9535GNn2 = EnumC9535GNn.A1D;
                    enumC9540GNw = EnumC9540GNw.A08;
                    gnm2 = GO0.A0M;
                } else {
                    if (c9530GNh3.A0E) {
                        ArrayList arrayListA0h = C3cG.A0h();
                        ArrayList arrayListA0h2 = C3cG.A0h();
                        GNE gne = gp2.A00;
                        String str8 = ((GP1) gne.get(0)).A01;
                        int size = gne.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                c9557GOo = new C9557GOo("", arrayListA0h, arrayListA0h2, 0);
                            } else {
                                int i2 = i + 20;
                                int i3 = i2;
                                if (i3 > size) {
                                    i3 = size;
                                }
                                ArrayList arrayListA0t = BV4.A0t(gne.subList(i, i3));
                                ArrayList<String> arrayListA0h3 = C3cG.A0h();
                                Iterator it = arrayListA0t.iterator();
                                while (it.hasNext()) {
                                    arrayListA0h3.add(((GP1) it.next()).A00);
                                }
                                Bundle bundleA0N3 = BV6.A0N();
                                bundleA0N3.putStringArrayList("ITEM_ID_LIST", arrayListA0h3);
                                String str9 = c9530GNh3.A0P;
                                bundleA0N3.putString("playBillingLibraryVersion", str9);
                                try {
                                    synchronized (c9530GNh3.A0O) {
                                        t5Var3 = c9530GNh3.A0U;
                                    }
                                    if (t5Var3 == null) {
                                        c9557GOo = C9530GNh.A02(c9530GNh3, GO0.A0M, EnumC9535GNn.A1I, null, "Service has been reset to null.");
                                    } else {
                                        C9527GNe c9527GNe = c9530GNh3.A0M;
                                        if (TextUtils.isEmpty(null)) {
                                            c9530GNh3.A01.getPackageName();
                                        }
                                        c9527GNe.getClass();
                                        if (TextUtils.isEmpty(null)) {
                                            c9530GNh3.A01.getPackageName();
                                        }
                                        if (TextUtils.isEmpty(null)) {
                                            c9530GNh3.A01.getPackageName();
                                        }
                                        if (TextUtils.isEmpty(null)) {
                                            c9530GNh3.A01.getPackageName();
                                        }
                                        int i4 = c9530GNh3.A0H ? 20 : 17;
                                        c9530GNh3.A01.getPackageName();
                                        String str10 = c9530GNh3.A0Q;
                                        long jLongValue3 = c9530GNh3.A0N.longValue();
                                        Bundle bundleA0N4 = BV6.A0N();
                                        GNN.A04(bundleA0N4, str9, str10, jLongValue3);
                                        bundleA0N4.putBoolean("enablePendingPurchases", true);
                                        bundleA0N4.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                        boolean z3 = false;
                                        bundleA0N4.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", BV4.A0t(GNE.A01("subs", "inapp")));
                                        bundleA0N4.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", BV4.A0t(GNE.A01("inapp")));
                                        bundleA0N4.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", BV4.A0t(GNE.A01("inapp")));
                                        bundleA0N4.putStringArrayList("PRODUCT_TYPES_TO_RETURN_AUTOPAY_OFFERS", BV4.A0t(GNE.A01("inapp")));
                                        bundleA0N4.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
                                        ArrayList<String> arrayListA0h4 = C3cG.A0h();
                                        ArrayList<String> arrayListA0h5 = C3cG.A0h();
                                        ArrayList<String> arrayListA0h6 = C3cG.A0h();
                                        Iterator it2 = arrayListA0t.iterator();
                                        boolean z4 = false;
                                        while (it2.hasNext()) {
                                            GP1 gp1 = (GP1) it2.next();
                                            gp1.getClass();
                                            arrayListA0h4.add(null);
                                            z3 |= !TextUtils.isEmpty(null);
                                            arrayListA0h6.add(gp1.A02);
                                            z4 |= !TextUtils.isEmpty(r0);
                                            if (gp1.A01.equals("first_party")) {
                                                throw BV4.A0a("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                            }
                                        }
                                        if (z3) {
                                            bundleA0N4.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayListA0h4);
                                        }
                                        if (!arrayListA0h5.isEmpty()) {
                                            bundleA0N4.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayListA0h5);
                                        }
                                        if (!TextUtils.isEmpty(null)) {
                                            bundleA0N4.putString("accountName", null);
                                        }
                                        if (z4) {
                                            bundleA0N4.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayListA0h6);
                                        }
                                        Parcel parcelA014 = r1.A01(t5Var3);
                                        AbstractC7609F5w.A18(parcelA014, str8, i4);
                                        parcelA014.writeInt(1);
                                        bundleA0N3.writeToParcel(parcelA014, 0);
                                        parcelA014.writeInt(1);
                                        bundleA0N4.writeToParcel(parcelA014, 0);
                                        Parcel parcelA023 = t5Var3.A02(parcelA014, 901);
                                        Bundle bundle3 = (Bundle) (parcelA023.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelA023));
                                        parcelA023.recycle();
                                        if (bundle3 == null) {
                                            c9557GOo = C9530GNh.A02(c9530GNh3, GO0.A02, EnumC9535GNn.A0s, null, "queryProductDetailsAsync got empty product details response.");
                                        } else if (bundle3.containsKey("DETAILS_LIST")) {
                                            ArrayList<String> stringArrayList = bundle3.getStringArrayList("DETAILS_LIST");
                                            if (stringArrayList == null) {
                                                c9557GOo = C9530GNh.A02(c9530GNh3, GO0.A02, EnumC9535GNn.A0w, null, "queryProductDetailsAsync got null response list");
                                            } else {
                                                ArrayList arrayListA0h7 = C3cG.A0h();
                                                Iterator<String> it3 = stringArrayList.iterator();
                                                while (it3.hasNext()) {
                                                    try {
                                                        C9537GNt c9537GNt = new C9537GNt(AnonymousClass005.A0j(it3));
                                                        GNN.A05("BillingClient", AnonymousClass007.A0a("Got product details: ", c9537GNt));
                                                        arrayListA0h7.add(c9537GNt);
                                                    } catch (JSONException e5) {
                                                        e = e5;
                                                        GNM gnm12 = GO0.A00;
                                                        gnmA00 = AbstractC9548GOe.A00("Error trying to decode SkuDetails.", 6);
                                                        enumC9535GNn = EnumC9535GNn.A0y;
                                                        str = "Got a JSON exception trying to decode ProductDetails. \n Exception: ";
                                                        c9557GOo = C9530GNh.A02(c9530GNh3, gnmA00, enumC9535GNn, e, str);
                                                        int i5 = c9557GOo.A00;
                                                        String str11 = c9557GOo.A01;
                                                        GNM gnm13 = GO0.A00;
                                                        GO3.A00(AbstractC9548GOe.A00(str11, i5), go3, c9557GOo.A02, c9557GOo.A03);
                                                        return null;
                                                    }
                                                }
                                                ArrayList<String> stringArrayList2 = bundle3.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                                try {
                                                    ArrayList arrayListA0h8 = C3cG.A0h();
                                                    if (stringArrayList2 != null) {
                                                        Iterator<String> it4 = stringArrayList2.iterator();
                                                        while (it4.hasNext()) {
                                                            GO2 go2 = new GO2(AnonymousClass005.A0j(it4));
                                                            GNN.A05("BillingClient", AnonymousClass007.A0a("Got unfetchedProduct: ", go2));
                                                            arrayListA0h8.add(go2);
                                                        }
                                                    } else {
                                                        Iterator it5 = arrayListA0t.iterator();
                                                        while (it5.hasNext()) {
                                                            GP1 gp12 = (GP1) it5.next();
                                                            Iterator it6 = arrayListA0h7.iterator();
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    C9537GNt c9537GNt2 = (C9537GNt) it6.next();
                                                                    if (!gp12.A00.equals(c9537GNt2.A00) || !gp12.A01.equals(c9537GNt2.A01)) {
                                                                    }
                                                                } else {
                                                                    arrayListA0h8.add(new GO2(BV4.A18().put("productId", gp12.A00).put("type", gp12.A01).put("statusCode", 0).toString()));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    arrayListA0h.addAll(arrayListA0h7);
                                                    arrayListA0h2.addAll(arrayListA0h8);
                                                    i = i2;
                                                } catch (JSONException e6) {
                                                    e = e6;
                                                    GNM gnm14 = GO0.A00;
                                                    gnmA00 = AbstractC9548GOe.A00("Error trying to decode SkuDetails.", 6);
                                                    enumC9535GNn = EnumC9535GNn.A0y;
                                                    str = "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ";
                                                    c9557GOo = C9530GNh.A02(c9530GNh3, gnmA00, enumC9535GNn, e, str);
                                                    int i52 = c9557GOo.A00;
                                                    String str112 = c9557GOo.A01;
                                                    GNM gnm132 = GO0.A00;
                                                    GO3.A00(AbstractC9548GOe.A00(str112, i52), go3, c9557GOo.A02, c9557GOo.A03);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            int iA003 = GNN.A00(bundle3, "BillingClient");
                                            String strA033 = GNN.A03(bundle3, "BillingClient");
                                            GNM gnm15 = GO0.A00;
                                            c9557GOo = iA003 != 0 ? C9530GNh.A02(c9530GNh3, AbstractC9548GOe.A00(strA033, iA003), EnumC9535GNn.A2E, null, FGI.A0H("getSkuDetails() failed for queryProductDetailsAsync. Response code: ", iA003)) : C9530GNh.A02(c9530GNh3, AbstractC9548GOe.A00(strA033, 6), EnumC9535GNn.A0u, null, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                        }
                                    }
                                } catch (DeadObjectException e7) {
                                    e = e7;
                                    gnmA00 = GO0.A0M;
                                    enumC9535GNn = EnumC9535GNn.A0q;
                                    str = "queryProductDetailsAsync got a remote exception (try to reconnect).";
                                    c9557GOo = C9530GNh.A02(c9530GNh3, gnmA00, enumC9535GNn, e, str);
                                    int i522 = c9557GOo.A00;
                                    String str1122 = c9557GOo.A01;
                                    GNM gnm1322 = GO0.A00;
                                    GO3.A00(AbstractC9548GOe.A00(str1122, i522), go3, c9557GOo.A02, c9557GOo.A03);
                                    return null;
                                } catch (Exception e8) {
                                    e = e8;
                                    gnmA00 = GO0.A0K;
                                    enumC9535GNn = EnumC9535GNn.A0q;
                                    str = "queryProductDetailsAsync got a remote exception (try to reconnect).";
                                    c9557GOo = C9530GNh.A02(c9530GNh3, gnmA00, enumC9535GNn, e, str);
                                    int i5222 = c9557GOo.A00;
                                    String str11222 = c9557GOo.A01;
                                    GNM gnm13222 = GO0.A00;
                                    GO3.A00(AbstractC9548GOe.A00(str11222, i5222), go3, c9557GOo.A02, c9557GOo.A03);
                                    return null;
                                }
                            }
                        }
                        int i52222 = c9557GOo.A00;
                        String str112222 = c9557GOo.A01;
                        GNM gnm132222 = GO0.A00;
                        GO3.A00(AbstractC9548GOe.A00(str112222, i52222), go3, c9557GOo.A02, c9557GOo.A03);
                        return null;
                    }
                    GNN.A06("BillingClient", "Querying product details is not supported.");
                    enumC9535GNn2 = EnumC9535GNn.A25;
                    enumC9540GNw = EnumC9540GNw.A08;
                    gnm2 = GO0.A0U;
                }
                C9530GNh.A0B(c9530GNh3, gnm2, enumC9540GNw, enumC9535GNn2);
                GNC gnc = GNE.A00;
                GNJ gnj = GNJ.A02;
                GO3.A00(gnm2, go3, gnj, gnj);
                return null;
            default:
                FBB fbb = (FBB) this.A00;
                C7684FAc c7684FAc = (C7684FAc) this.A02;
                Map<String, ? extends Object> map = (Map) this.A01;
                C7674F9s c7674F9s = c7684FAc.A01;
                F9N f9n = F9N.A01;
                SparseArray<Object> sparseArray = fbb.A01;
                Object obj = sparseArray.get(R.id.bk_context_key_performance_logger);
                if (obj != null && !(obj instanceof HsW)) {
                    FFI.A03("Expected PerformanceLogger but found ", C60Q.A0e(obj));
                }
                sparseArray.get(R.id.bk_context_key_performance_logger);
                AbstractC7693FAn.A00.getAndIncrement();
                C7674F9s c7674F9sA00 = C7679F9x.A00(fbb, c7684FAc.A00.A04(map), c7674F9s, c7684FAc.A02, f9n);
                AbstractC7692FAm.A00.incrementAndGet();
                return c7674F9sA00;
        }
    }
}

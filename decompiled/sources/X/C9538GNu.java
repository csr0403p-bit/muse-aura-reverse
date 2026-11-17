package X;

import android.text.TextUtils;
import com.facebook.payments.dcp.xapp.model.IapSdkException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.GNu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9538GNu implements InterfaceC9726Gee {
    public GOR A00;
    public final C9544GOa A01 = new C9544GOa();
    public final C9565GOw A02 = new C9565GOw();

    @Override // X.InterfaceC9726Gee
    public final /* bridge */ /* synthetic */ void AdG(GOU gou) {
        C7384Etj.A0Y(gou, 0);
        GOR gor = (GOR) gou;
        this.A00 = gor;
        C9565GOw c9565GOw = this.A02;
        C9537GNt c9537GNt = gor instanceof GOQ ? ((GOQ) gor).A00 : ((GOM) gor).A00;
        c9565GOw.A01 = c9537GNt;
        if (c9537GNt.A00() != null) {
            c9537GNt.A00().getClass();
            String str = c9537GNt.A00().A04;
            if (str != null) {
                c9565GOw.A02 = str;
            }
        }
    }

    @Override // X.InterfaceC9726Gee
    public final C79e A5Q() {
        GNE gneA00;
        C9544GOa c9544GOa = this.A01;
        C9565GOw c9565GOw = this.A02;
        if (c9565GOw.A01 == null) {
            throw BV4.A0a("ProductDetails is required for constructing ProductDetailsParams.");
        }
        ArrayList arrayListA0t = BV4.A0t(Collections.singletonList(new GOV(c9565GOw)));
        c9544GOa.A03 = arrayListA0t;
        if (arrayListA0t.isEmpty()) {
            throw C60O.A0i("Details of the products must be provided.");
        }
        Iterator it = arrayListA0t.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw C60O.A0i("ProductDetailsParams cannot be null.");
            }
        }
        C9545GOb c9545GOb = new C9545GOb();
        c9545GOb.A05 = ((GOV) c9544GOa.A03.get(0)).A01.A06.optString("packageName").isEmpty() ? false : true;
        c9545GOb.A02 = c9544GOa.A01;
        c9545GOb.A03 = c9544GOa.A02;
        c9545GOb.A00 = c9544GOa.A00.A00();
        c9545GOb.A04 = C3cG.A0h();
        ArrayList arrayList = c9544GOa.A03;
        if (arrayList != null) {
            gneA00 = GNE.A00(arrayList);
        } else {
            GNC gnc = GNE.A00;
            gneA00 = GNJ.A02;
        }
        c9545GOb.A01 = gneA00;
        GOR gor = this.A00;
        if (gor != null) {
            return new C9547GOd(c9545GOb, gor);
        }
        C7384Etj.A0b("dcpProductDetails");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC9726Gee
    public final /* bridge */ /* synthetic */ void Acf(String str) {
        if (str != null) {
            this.A01.A01 = str;
        }
    }

    @Override // X.InterfaceC9726Gee
    public final /* synthetic */ void Act(String str) {
    }

    @Override // X.InterfaceC9726Gee
    public final /* bridge */ /* synthetic */ void AeK(String str) {
        if (str != null) {
            this.A01.A02 = str;
        }
    }

    @Override // X.InterfaceC9726Gee
    public final /* bridge */ /* synthetic */ void AeS(String str) {
        GOR gor = this.A00;
        if (gor == null) {
            throw new IapSdkException(GPM.A02, "You must set DcpProductDetails before setting the offer token.");
        }
        if ("subs".equals((gor instanceof GOQ ? ((GOQ) gor).A00 : ((GOM) gor).A00).A01)) {
            if (str == null || C7BY.A0j(str)) {
                throw new IapSdkException(GPM.A03, "The resolved offer token is empty.");
            }
            C9565GOw c9565GOw = this.A02;
            if (TextUtils.isEmpty(str)) {
                throw C60O.A0i("offerToken can not be empty");
            }
            c9565GOw.A02 = str;
        }
    }

    @Override // X.InterfaceC9726Gee
    public final /* bridge */ /* synthetic */ void Aep(String str, Integer num, String str2) {
        AnonymousClass005.A0x(str, str2, num);
        C9544GOa c9544GOa = this.A01;
        GOH goh = new GOH();
        goh.A01 = str;
        GP0 gp0A00 = goh.A00();
        GOH goh2 = new GOH();
        goh2.A01 = gp0A00.A01;
        goh2.A00 = gp0A00.A00;
        goh2.A02 = gp0A00.A02;
        c9544GOa.A00 = goh2;
        C9565GOw c9565GOw = this.A02;
        int i = 0;
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 4;
                break;
            default:
                throw C3cG.A0q();
        }
        GP9 gp9 = new GP9();
        gp9.A01 = str2;
        gp9.A00 = i;
        c9565GOw.A00 = gp9;
    }
}

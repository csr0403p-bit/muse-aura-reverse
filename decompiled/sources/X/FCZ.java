package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.aura.R;
import com.facebook.aura.bloks.screenquery.AuraBloksFullScreenContainerNavigator;
import com.facebook.aura.bloks.screenquery.navigator.AuraCdsScreenQueryNavigator;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FCZ implements InterfaceC7646F8n {
    public final /* synthetic */ C7933FLf A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ F6D A02;
    public final /* synthetic */ FDW A03;
    public final /* synthetic */ FDW A04;
    public final /* synthetic */ boolean A05;

    @Override // X.InterfaceC7646F8n
    public final void execute(Context context, FBB fbb, Integer num) {
        int i;
        SparseArray<Object> sparseArrayA0B;
        boolean z;
        boolean z2;
        C7384Etj.A0Y(context, 0);
        if (fbb != null) {
            FDW fdw = this.A04;
            FDW fdw2 = this.A03;
            C7933FLf c7933FLf = this.A00;
            F6D f6d = this.A02;
            i = fdw2.A05;
            FBB fbb2 = f6d.A02;
            if (fbb2 != null) {
                SparseArray<Object> sparseArray = fbb2.A01;
                String str = (String) sparseArray.get(R.id.bk_screen_container_id);
                if (str != null) {
                    String str2 = c7933FLf.A08;
                    HsM hsMA0D = fdw.A0D(57);
                    HsM hsMA0D2 = fdw.A0D(58);
                    String str3 = (String) sparseArray.get(R.id.bk_context_key_app_id);
                    String str4 = c7933FLf.A07;
                    if (hsMA0D != null) {
                        if (i == 16542) {
                            z2 = true;
                        } else {
                            if (i != 22848) {
                                throw AnonymousClass005.A0c(i);
                            }
                            z2 = false;
                        }
                        C7747FCz c7747FCz = new C7747FCz(new C7633F7q(hsMA0D, f6d), str, str2, str3, str4, !z2);
                        c7747FCz.A06.add(C8472Feb.A00(4));
                        AbstractC7724FCa.A00 = c7747FCz;
                    }
                    if (hsMA0D2 != null) {
                        if (i == 16542) {
                            z = true;
                        } else {
                            if (i != 22848) {
                                throw AnonymousClass005.A0c(i);
                            }
                            z = false;
                        }
                        C7747FCz c7747FCz2 = new C7747FCz(new C7633F7q(hsMA0D2, f6d), str2, str, str4, str3, !z);
                        String str5 = c7747FCz2.A03;
                        c7747FCz2.A06.add(new FYU(str5, 0));
                        FBG fbg = new FBG(str5);
                        Set set = (Set) fbb2.A03(R.id.bk_context_key_cleanup_callbacks);
                        if (set.contains(fbg)) {
                            FFI.A01(null, "Attempting to add a cleanup callback that already exists.", null);
                        } else {
                            set.add(fbg);
                        }
                        AbstractC7724FCa.A01.put(str5, c7747FCz2);
                    }
                }
            }
            sparseArrayA0B = fbb.A02.createObjectSet();
        } else {
            i = this.A03.A05;
            FD4 fd4 = FD3.A00;
            if (fd4 == null || fd4.A00 != C79.A0C) {
                new C7727FCd(this.A01.A02.createObjectSet());
            }
            if (i != 16542 && i != 22848) {
                throw AnonymousClass005.A0c(i);
            }
            sparseArrayA0B = BV4.A0B();
        }
        C7727FCd c7727FCd = new C7727FCd(sparseArrayA0B);
        C7933FLf c7933FLf2 = this.A00;
        boolean z3 = this.A05;
        if (i == 16542) {
            AuraCdsScreenQueryNavigator.INSTANCE.openScreen(context, c7933FLf2, c7727FCd, z3);
        } else {
            if (i != 22848) {
                throw AnonymousClass005.A0c(i);
            }
            AuraBloksFullScreenContainerNavigator.INSTANCE.openScreen(context, c7933FLf2, c7727FCd, z3);
        }
    }

    public FCZ(C7933FLf c7933FLf, FBB fbb, F6D f6d, FDW fdw, FDW fdw2, boolean z) {
        this.A03 = fdw;
        this.A01 = fbb;
        this.A00 = c7933FLf;
        this.A05 = z;
        this.A04 = fdw2;
        this.A02 = f6d;
    }
}

package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.View;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.notifications.push.AuraPushManager;
import com.facebook.aura.notifications.push.AuraPushManager$Companion$createRefresherConfig$1;
import com.facebook.aura.notifications.push.AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1;
import com.facebook.pushlite.PushTokenManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EQf extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQf(Object obj, int i) {
        super(0);
        this.$t = i;
        this.A00 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        switch (this.$t) {
            case 0:
                C3939ChS c3939ChS = (C3939ChS) this.A00;
                Object objAMN = c3939ChS.A03.AMN();
                C7384Etj.A0U(objAMN);
                F0G f0g = c3939ChS.A02;
                return new C3973CiN(c3939ChS.A00, c3939ChS.A01, (C3966CiB) objAMN, f0g);
            case 1:
                return ((C3939ChS) this.A00).A04.AMN();
            case 2:
                return new EtU(C9u.A00, ((C3939ChS) this.A00).A05.AMN().A00);
            case 3:
                PushTokenManager pushTokenManager = (PushTokenManager) this.A00;
                EtU etU = (EtU) pushTokenManager.A05.getValue();
                DQZ<String, InterfaceC7409Eus> dqz = pushTokenManager.A02;
                AuraPushManager$Companion$createRefresherConfig$1 auraPushManager$Companion$createRefresherConfig$1 = pushTokenManager.A03;
                return new C3942ChY(dqz, new AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1(), etU, auraPushManager$Companion$createRefresherConfig$1.senders(), auraPushManager$Companion$createRefresherConfig$1.isAsyncRegister);
            case 4:
                return ((PushTokenManager) this.A00).A06.invoke();
            case 5:
                C3939ChS c3939ChS2 = AuraPushManager.instance;
                C7384Etj.A0Z(c3939ChS2, "null cannot be cast to non-null type com.facebook.pushlite.PushManager");
                return new C3967CiC(((C3966CiB) this.A00).A01, (EtU) c3939ChS2.A08.getValue());
            case 6:
                return new DIY((C4958DIb) this.A00);
            case 7:
                C4958DIb c4958DIb = (C4958DIb) this.A00;
                return new DJD(c4958DIb.A00, ((DIY) c4958DIb.A04.getValue()).A03);
            case 8:
                Context context = (Context) this.A00;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HatchLinkOrderSheetKt.PHONE);
                if (telephonyManager == null) {
                    return null;
                }
                return new DYL(telephonyManager, new DYM(), new DYN(), new C7603F5q(context, 0));
            case 9:
                return new EDX((EDT) ((EDC) this.A00));
            case 10:
                return new EDg(new C6541EDw(), (EDT) ((EDC) this.A00));
            case 11:
                return new EDf(new C6541EDw(), (EDT) ((EDC) this.A00));
            case 12:
                return new EDi((EDT) ((EDC) this.A00));
            case 13:
                return new DDY(E7C.A00, ((DDR) this.A00).A05);
            case 14:
                C5627DmA c5627DmA = (C5627DmA) this.A00;
                if (c5627DmA.A0b.get() && (view = c5627DmA.A02) != null) {
                    C5627DmA.A1B.post(new RunnableC5833DqP(view, c5627DmA));
                }
                return Unit.INSTANCE;
            case 15:
                return new RunnableC5945Dsf((C5630DmE) this.A00);
            case 16:
                return C5649Dmd.A00((Context) this.A00);
            case 17:
                Set<String> set = ((C3306CDf) this.A00).A01;
                CDH cdhA00 = CDH.A04.A00();
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    C7384Etj.A0Y(strA0j, 0);
                    CDI cdi = cdhA00.A00;
                    AbstractC0882AGj.A0r(BFI.A0F(new String[]{CDI.A02(cdi, C79.A00, strA0j), CDI.A02(cdi, C79.A01, strA0j)}), arrayListA0h);
                }
                return AbstractC0878AGe.A0g(arrayListA0h);
            case 18:
                return this.A00;
            case 19:
                try {
                    return ((Function0) this.A00).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C0881AGi.A00;
                }
            default:
                C6797Ea8 c6797Ea8 = ((C6862EbK) this.A00).A07;
                C7384Etj.A0X(c6797Ea8);
                List list = (List) c6797Ea8.A01.getValue();
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    BV6.A1S(arrayListA0i, it2);
                }
                return arrayListA0i;
        }
    }
}

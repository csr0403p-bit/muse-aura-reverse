package X;

import android.text.TextUtils;
import androidx.work.OperationKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;

/* loaded from: classes5.dex */
public final class EKG {
    public static final String A08 = EK9.A01("WorkContinuationImpl");
    public boolean A00;
    public InterfaceC6657EMp A01;
    public final C7yC A02;
    public final EK5 A03;
    public final String A04;
    public final List<String> A05;
    public final List<? extends AbstractC6631ELb> A06;
    public final List<String> A07;

    public final InterfaceC6657EMp A00() {
        if (this.A00) {
            EK9.A00();
            BV4.A1K("Already enqueued work ids (", TextUtils.join(", ", this.A05), ")", A08);
        } else {
            EK5 ek5 = this.A03;
            this.A01 = OperationKt.A00(ek5.A02.A04, FGI.A0M("EnqueueRunnable_", this.A02.name()), ((C6616EKj) ek5.A06).A01, new C7589F5c(this, 12));
        }
        return this.A01;
    }

    public EKG() {
    }

    public EKG(C7yC c7yC, EK5 ek5, String str, List list) {
        this.A03 = ek5;
        this.A04 = str;
        this.A02 = c7yC;
        this.A06 = list;
        this.A05 = C60Q.A0t(list);
        this.A07 = C3cG.A0h();
        for (int i = 0; i < list.size(); i++) {
            if (c7yC == C7yC.A05 && ((AbstractC6631ELb) list.get(i)).A00.A09 != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                throw C60O.A0i("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((AbstractC6631ELb) list.get(i)).A02.toString();
            this.A05.add(string);
            this.A07.add(string);
        }
    }
}

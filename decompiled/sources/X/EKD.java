package X;

import X.AbstractC6631ELb;
import X.EKD;
import androidx.work.OverwritingInputMerger;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class EKD<B extends EKD<B, ?>, W extends AbstractC6631ELb> {
    public EKE A00;
    public UUID A01;
    public final Set<String> A02;

    public EKD(Class<? extends AbstractC6610EKa> cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        C7384Etj.A0U(uuidRandomUUID);
        this.A01 = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        String name = cls.getName();
        EnumC6619EKm enumC6619EKm = EnumC6619EKm.A04;
        String name2 = OverwritingInputMerger.class.getName();
        BzB bzB = BzB.A01;
        EKL ekl = EKL.A09;
        Integer num = C79.A00;
        this.A00 = new EKE(ekl, bzB, bzB, enumC6619EKm, false, num, num, string, name, name2, null, 0, 0, 0, 0, -256, 0L, 0L, 0L, 30000L, -1L, 0L, -1L, LinkEncryptedPairingKt.LINK_COUNTER_MAX, false);
        LinkedHashSet linkedHashSet = new LinkedHashSet(2);
        linkedHashSet.add(new String[]{name}[0]);
        this.A02 = linkedHashSet;
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/BzB;)TB; */
    public final void A03(BzB bzB) {
        C7384Etj.A0Y(bzB, 0);
        this.A00.A0C = bzB;
    }

    public W A00() {
        return new C7yw(this.A00, this.A02, this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0108, code lost:
    
        if (r2.length() > 127) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W A01() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKD.A01():X.ELb");
    }

    /* JADX WARN: Incorrect return type in method signature: (JLjava/util/concurrent/TimeUnit;)TB; */
    public final void A02(long j, TimeUnit timeUnit) {
        this.A00.A05 = timeUnit.toMillis(j);
        if (LinkEncryptedPairingKt.LINK_COUNTER_MAX - System.currentTimeMillis() <= this.A00.A05) {
            throw C60O.A0i("The given initial delay is too large and will cause an overflow!");
        }
    }
}

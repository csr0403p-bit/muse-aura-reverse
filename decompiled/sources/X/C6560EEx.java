package X;

import com.facebook.secure.attestation.keystore.KeystoreOperationException;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.security.ProviderException;
import java.util.List;

/* renamed from: X.EEx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6560EEx {
    public final ImmutableSet<EF2> A00;
    public final List<EEy> A01;

    public static boolean A02(RuntimeException runtimeException, Class<? extends RuntimeException>[] clsArr) {
        for (Class<? extends RuntimeException> cls : clsArr) {
            if (cls.isInstance(runtimeException)) {
                return true;
            }
        }
        return false;
    }

    public static EEy A00(EFC efc, C6560EEx c6560EEx, Exception exc, Integer num) {
        Integer num2 = efc.A01;
        EEy eEy = new EEy(efc.A00, RegularImmutableMap.A03, exc, num2, num, RegularImmutableSet.A05);
        ImmutableSet<EF2> immutableSet = c6560EEx.A00;
        Integer num3 = eEy.A04;
        Integer num4 = eEy.A05;
        return new EEy(eEy.A00, eEy.A01, eEy.A03, num3, num4, immutableSet);
    }

    public static KeystoreOperationException A01(C6560EEx c6560EEx, Exception exc, Integer num, Integer num2) {
        if (exc instanceof ProviderException) {
            num2 = C79.A0A;
        }
        EFC efc = new EFC(EFB.A02, num2);
        Exception exc2 = efc.A00.A00;
        if (exc2 == null) {
            exc2 = exc;
        }
        return new KeystoreOperationException(A00(efc, c6560EEx, exc2, num));
    }

    public final KeystoreOperationException A03(Integer num, Integer num2) {
        return new KeystoreOperationException(A00(new EFC(EFB.A02, num2), this, null, num));
    }

    public C6560EEx(ImmutableSet<EF2> immutableSet, List<EEy> list) {
        this.A00 = immutableSet;
        this.A01 = list;
    }
}

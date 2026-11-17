package X;

import android.content.Context;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Cpt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4205Cpt extends AbstractC4162CoM {
    public final GoogleSignInOptions A00;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.Cpu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.Cpu] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    public C4205Cpt(Context context, Looper looper, GoogleSignInOptions googleSignInOptions, InterfaceC4139Cng interfaceC4139Cng, InterfaceC4140Cnh interfaceC4140Cnh, C4173Cod c4173Cod) {
        ?? c4206Cpu;
        super(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, 91);
        if (googleSignInOptions != null) {
            C4206Cpu c4206Cpu2 = new C4206Cpu();
            c4206Cpu.A05 = C60O.A13();
            c4206Cpu.A04 = BV4.A0u();
            Parcelable.Creator<GoogleSignInOptions> creator = GoogleSignInOptions.CREATOR;
            c4206Cpu.A05 = BV4.A0x(googleSignInOptions.A08);
            c4206Cpu.A06 = googleSignInOptions.A09;
            c4206Cpu.A07 = googleSignInOptions.A0A;
            c4206Cpu.A08 = googleSignInOptions.A05;
            c4206Cpu.A01 = googleSignInOptions.A01;
            c4206Cpu.A00 = googleSignInOptions.A00;
            c4206Cpu.A02 = googleSignInOptions.A02;
            ArrayList arrayList = googleSignInOptions.A04;
            HashMap mapA0u = BV4.A0u();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                    BV6.A1E(googleSignInOptionsExtensionParcelable, mapA0u, googleSignInOptionsExtensionParcelable.A00);
                }
            }
            c4206Cpu.A04 = mapA0u;
            c4206Cpu.A03 = googleSignInOptions.A03;
            c4206Cpu = c4206Cpu2;
        } else {
            c4206Cpu = new C4206Cpu();
        }
        byte[] bArr = new byte[16];
        AbstractC4383Cuj.A00.nextBytes(bArr);
        c4206Cpu.A03 = BV6.A0q(bArr);
        Set set = c4173Cod.A05;
        if (!set.isEmpty()) {
            for (Object obj : set) {
                Set set2 = c4206Cpu.A05;
                set2.add(obj);
                set2.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.A00 = c4206Cpu.A00();
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final int AHi() {
        return 12451000;
    }
}

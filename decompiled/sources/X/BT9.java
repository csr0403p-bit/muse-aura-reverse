package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BT9 implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    public BT9(G0U g0u, G0U<Object, Unit> g0u2, G0U<Object, Unit> g0u3) {
        this.$t = g0u3;
        if (17 - g0u3 != 0) {
            this.A00 = g0u;
            this.A01 = g0u2;
        } else {
            this.A00 = g0u;
            this.A01 = g0u2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final Object invoke(Object obj) {
        String string;
        String str;
        int iA0I;
        int i;
        Unit unit;
        long j;
        Unit unit2;
        Object obj2;
        Object obj3;
        C2297BSx c2297BSxA00;
        int i2;
        boolean z;
        G0U<C1805ArO, Unit> g0u;
        C1805ArO c1805ArO;
        C9e5 c9e5;
        C0881AGi c0881AGi;
        boolean z2;
        C9iZ descriptor;
        String str2;
        boolean z3;
        C1940Aud c1940AudA01;
        G0U g0u2;
        switch (this.$t) {
            case 0:
                C1875Asp c1875Asp = (C1875Asp) this.A00;
                ApQ apQ = (ApQ) obj;
                if (c1875Asp.A09 || !c1875Asp.A07) {
                    z = false;
                } else {
                    AuB auB = c1875Asp.A00.A04;
                    if (auB != null) {
                        List<? extends AzK> listAsList = Arrays.asList(new C2027Awg(), new C1916Atd(apQ, 1));
                        C1897AtH c1897AtH = c1875Asp.A00;
                        C1905AtQ c1905AtQ = c1897AtH.A0O;
                        g0u = c1897AtH.A0R;
                        c1805ArO = c1905AtQ.A00(listAsList);
                        auB.A00(null, c1805ArO);
                    } else {
                        C1805ArO c1805ArO2 = c1875Asp.A05;
                        String str3 = c1805ArO2.A01.A00;
                        long j2 = c1805ArO2.A00;
                        String string2 = C7BY.A0c(str3, apQ, (int) (j2 >> 32), AnonymousClass002.A09(j2)).toString();
                        int length = ((int) (c1875Asp.A05.A00 >> 32)) + apQ.length();
                        long jA00 = AbstractC1815ArZ.A00(length, length);
                        g0u = c1875Asp.A00.A0R;
                        c1805ArO = new C1805ArO(string2, jA00);
                    }
                    g0u.invoke(c1805ArO);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return AtM.A09((F1E) this.A00, (F1E) this.A01, (C1Lu) obj);
            case 2:
                return AtM.A0A((F1E) this.A00, (F1E) this.A01, (C1Lu) obj);
            case 3:
                ((TransformedTextFieldState) this.A01).A01.A06.A0I(this.A00);
                return Unit.INSTANCE;
            case 4:
                return AnonymousClass001.A0i();
            case 5:
                C8j3.A1I(C79.A0K, BU6.A0M(obj, this.A01, null, 36), (C3UX) this.A00);
                return Unit.INSTANCE;
            case 6:
                C1943Aug c1943Aug = (C1943Aug) this.A00;
                g0u2 = (G0U) this.A01;
                c1943Aug.A0F.Af8(obj);
                if (obj != null) {
                    C1943Aug.A04(c1943Aug);
                }
                g0u2.invoke(obj);
                return Unit.INSTANCE;
            case 7:
            case 12:
                Function0 function0 = (Function0) this.A00;
                Function0 function02 = (Function0) this.A01;
                InterfaceC2266BNk interfaceC2266BNk = (InterfaceC2266BNk) obj;
                function0.invoke();
                if (function02 == null || AnonymousClass003.A1Y(function02)) {
                    interfaceC2266BNk.close();
                }
                return Unit.INSTANCE;
            case 8:
            case 13:
                AXN axn = (AXN) this.A00;
                MutableState mutableState = (MutableState) this.A01;
                long j3 = ((C73O) obj).A00;
                mutableState.Af8(BL4.A00(C8j3.A0V(axn.Abr(Float.intBitsToFloat(AnonymousClass002.A09(j3))), axn.Abr(AnonymousClass001.A00(j3)) << 32)));
                return Unit.INSTANCE;
            case 9:
                C1943Aug c1943Aug2 = (C1943Aug) this.A00;
                Context context = (Context) this.A01;
                C1794ArD c1794ArD = (C1794ArD) obj;
                C0912AHo<C7dn> c0912AHo = c1794ArD.A00;
                C7dm c7dm = C7dm.A00;
                c0912AHo.A09(c7dm);
                AbstractC1914Atb.A00(context.getResources(), BRQ.A03, c1794ArD, new BT9(7, (Object) null, C2293BSt.A00(c1943Aug2, 13)), c1943Aug2.A0C());
                BRQ brq = BRQ.A06;
                C1949Aun c1949Aun = c1943Aug2.A0D;
                List<InterfaceC2043AxB> listA00 = c1949Aun.A00(c1943Aug2.A08());
                if (listA00.isEmpty()) {
                    z3 = true;
                    AbstractC1914Atb.A00(context.getResources(), brq, c1794ArD, new BT9(7, C2293BSt.A00(c1943Aug2, 14), C2293BSt.A00(c1943Aug2, 15)), !z3);
                    c0912AHo.A09(c7dm);
                } else {
                    int size = listA00.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        InterfaceC2043AxB interfaceC2043AxB = listA00.get(i3);
                        ApQ apQALZ = interfaceC2043AxB.ALZ();
                        if (apQALZ.length() != 0 && ((c1940AudA01 = AXH.A01(c1949Aun.A0A, interfaceC2043AxB)) == null || Math.abs(c1940AudA01.A01.A00 - c1940AudA01.A00.A00) != apQALZ.length())) {
                            z3 = false;
                            AbstractC1914Atb.A00(context.getResources(), brq, c1794ArD, new BT9(7, C2293BSt.A00(c1943Aug2, 14), C2293BSt.A00(c1943Aug2, 15)), !z3);
                            c0912AHo.A09(c7dm);
                        }
                    }
                    z3 = true;
                    AbstractC1914Atb.A00(context.getResources(), brq, c1794ArD, new BT9(7, C2293BSt.A00(c1943Aug2, 14), C2293BSt.A00(c1943Aug2, 15)), !z3);
                    c0912AHo.A09(c7dm);
                }
                return Unit.INSTANCE;
            case 10:
                obj2 = this.A00;
                obj3 = this.A01;
                c2297BSxA00 = C2297BSx.A00(obj, 18);
                i2 = 8;
                return new AvS(AVh.A00, c2297BSxA00, new BT9(i2, obj3, obj2));
            case 11:
                obj2 = this.A00;
                obj3 = this.A01;
                c2297BSxA00 = C2297BSx.A00(obj, 20);
                i2 = 13;
                return new AvS(AVh.A00, c2297BSxA00, new BT9(i2, obj3, obj2));
            case 14:
                BBH bbh = (BBH) this.A00;
                Throwable th = (Throwable) this.A01;
                Throwable th2 = (Throwable) obj;
                BLG<AKC<ApI>> blg = BBH.A0R;
                synchronized (bbh.A0K) {
                    if (th != null) {
                        if (th2 != null) {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                CU7.A01(th, th2);
                            }
                        }
                    }
                    th = null;
                    bbh.A03 = th;
                    AnonymousClass001.A1E(bbh.A0Q, null, BFw.A06);
                    unit2 = Unit.INSTANCE;
                }
                return unit2;
            case 15:
                BCN bcn = (BCN) this.A00;
                C0917AHt c0917AHt = (C0917AHt) this.A01;
                BLG<AKC<ApI>> blg2 = BBH.A0R;
                bcn.AZq(obj);
                if (c0917AHt != null) {
                    c0917AHt.A0B(obj);
                }
                return Unit.INSTANCE;
            case 16:
                C9jG c9jG = (C9jG) this.A00;
                C9jC c9jC = (C9jC) this.A01;
                Bundle bundle = (Bundle) obj;
                C7384Etj.A0Y(bundle, 1);
                return new A5Y(bundle, c9jC).A8b(c9jG);
            case 17:
                AI7 ai7 = (AI7) obj;
                synchronized (BDh.A08) {
                    j = BDh.A00;
                    BDh.A00 = j + 1;
                }
                return new BDi(ai7, (G0U) this.A00, (G0U) this.A01, j);
            case 18:
            case 19:
            default:
                G0U g0u3 = (G0U) this.A00;
                g0u2 = (G0U) this.A01;
                C2254BDx<Snapshot> c2254BDx = BDh.A05;
                g0u3.invoke(obj);
                g0u2.invoke(obj);
                return Unit.INSTANCE;
            case 20:
                return ((Parcel) this.A00).readValue((ClassLoader) this.A01);
            case 21:
                B97 b97 = (B97) this.A00;
                Object obj4 = this.A01;
                B9E b9e = (B9E) obj;
                synchronized (b97.A01) {
                    if (b9e.ADA()) {
                        b97.A00.A05(obj4, b9e);
                    } else {
                        b97.A00.A04(obj4);
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            case 22:
                AzK azK = (AzK) obj;
                String str4 = this.A00 == azK ? " > " : "   ";
                if (azK instanceof C1916Atd) {
                    str = "CommitTextCommand(text.length=";
                    C1916Atd c1916Atd = (C1916Atd) azK;
                    iA0I = C8j3.A0I(c1916Atd.A01);
                    i = c1916Atd.A00;
                } else {
                    if (!(azK instanceof C1920Ath)) {
                        if ((azK instanceof AuF) || (azK instanceof C1937Au0) || (azK instanceof C1936Atz) || (azK instanceof AuH) || (azK instanceof C2027Awg) || (azK instanceof C1993Avy)) {
                            string = azK.toString();
                        } else {
                            String strA0n = C60O.A0n(azK);
                            if (strA0n == null) {
                                strA0n = "{anonymous EditCommand}";
                            }
                            string = FGI.A0M("Unknown EditCommand: ", strA0n);
                        }
                        return FGI.A0M(str4, string);
                    }
                    str = "SetComposingTextCommand(text.length=";
                    C1920Ath c1920Ath = (C1920Ath) azK;
                    iA0I = C8j3.A0I(c1920Ath.A01);
                    i = c1920Ath.A00;
                }
                string = C8j4.A0y(str, ", newCursorPosition=", iA0I, i);
                return FGI.A0M(str4, string);
            case 23:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.A00;
                HxO hxO = (HxO) this.A01;
                if (C3cI.A1W(atomicBoolean)) {
                    hxO.AhZ(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 24:
                C1HY c1hy = (C1HY) this.A00;
                C9nm c9nm = (C9nm) this.A01;
                C2290BSq c2290BSq = new C2290BSq(c9nm, 1);
                if (c1hy != null) {
                    F2N lifecycle = c1hy.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.A04(c2290BSq);
                    }
                } else {
                    c9nm.A01 = EnumC3085Bxl.ON_RESUME.A01();
                    C9nm.A00(c9nm);
                }
                return new BSO(c2290BSq, c9nm, c1hy, 2);
            case 25:
                int iA0F = AnonymousClass001.A0F(obj);
                return ((G0V) this.A01).invoke(Integer.valueOf(iA0F), ((List) this.A00).get(iA0F));
            case 26:
                ((B8t) this.A00).A00.removeCallbacks((Runnable) this.A01);
                return Unit.INSTANCE;
            case 27:
                C9hr c9hr = (C9hr) this.A00;
                C9hr c9hr2 = (C9hr) this.A01;
                c9e5 = (C9e5) obj;
                C7384Etj.A0Y(c9e5, 2);
                C9iZ descriptor2 = c9hr.getDescriptor();
                c0881AGi = C0881AGi.A00;
                z2 = false;
                C9e5.A00("key", c0881AGi, c9e5, descriptor2, false);
                descriptor = c9hr2.getDescriptor();
                str2 = BrowserOperationCatalogKt.VALUE;
                C9e5.A00(str2, c0881AGi, c9e5, descriptor, z2);
                return Unit.INSTANCE;
            case 28:
                C9hr c9hr3 = (C9hr) this.A00;
                C9hr c9hr4 = (C9hr) this.A01;
                c9e5 = (C9e5) obj;
                C7384Etj.A0Y(c9e5, 2);
                C9iZ descriptor3 = c9hr3.getDescriptor();
                c0881AGi = C0881AGi.A00;
                z2 = false;
                C9e5.A00("first", c0881AGi, c9e5, descriptor3, false);
                descriptor = c9hr4.getDescriptor();
                str2 = "second";
                C9e5.A00(str2, c0881AGi, c9e5, descriptor, z2);
                return Unit.INSTANCE;
        }
    }

    public BT9(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}

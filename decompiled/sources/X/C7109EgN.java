package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: X.EgN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7109EgN {
    public static C7109EgN A0F;
    public static C7182Ehs A0G;
    public AnimatedFactoryV2Impl A00;
    public InterfaceC7127Egh A01;
    public C7112EgS<CCV, InterfaceC7064EfB> A02;
    public C7155EhQ A03;
    public C7154EhP A04;
    public InterfaceC7068EfO A05;
    public InterfaceC7006EeD A06;
    public AbstractC7151EhM A07;
    public InterfaceC7127Egh<CCV, InterfaceC7064EfB> A08;
    public C7112EgS A09;
    public C6987Edn A0A;
    public final InterfaceC7005EeA A0B;
    public final C7069EfP A0C;
    public final C7110EgO A0D;
    public final C7037Eej A0E;

    private void A05(Map<C7003Ee6, InterfaceC7068EfO> map) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("com.facebook.animated.gif.GifImageDecoder");
            Class cls2 = Boolean.TYPE;
            map.put(AbstractC6994Edv.A04, (InterfaceC7068EfO) cls.getConstructor(AbstractC7151EhM.class, cls2, cls2, cls2).newInstance(A00(this), false, false, true));
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            AbstractC3422CMk.A01(C7109EgN.class, "Failed to instantiate GIF decoder via reflection", e);
        }
        try {
            Class<?> cls3 = Class.forName("com.facebook.animated.webp.WebPImageDecoder");
            Class cls4 = Boolean.TYPE;
            map.put(AbstractC6994Edv.A09, (InterfaceC7068EfO) cls3.getConstructor(AbstractC7151EhM.class, cls4, cls4, cls4).newInstance(A00(this), false, false, true));
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e2) {
            AbstractC3422CMk.A01(C7109EgN.class, "Failed to instantiate WebP decoder via reflection", e2);
        }
    }

    public static final AbstractC7151EhM A00(C7109EgN c7109EgN) {
        AbstractC7151EhM efM = c7109EgN.A07;
        if (efM == null) {
            C7114EgU c7114EgU = c7109EgN.A0D.A0I;
            c7109EgN.A04();
            C7069EfP c7069EfP = c7109EgN.A0C;
            C7384Etj.A0Y(c7114EgU, 0);
            int i = Build.VERSION.SDK_INT;
            InterfaceC6522EBw interfaceC6522EBw = (InterfaceC6522EBw) c7114EgU.A03.getValue();
            efM = i >= 31 ? new EfM(c7069EfP, interfaceC6522EBw) : new C7054Ef0(c7069EfP, interfaceC6522EBw);
            c7109EgN.A07 = efM;
        }
        return efM;
    }

    public static final InterfaceC7127Egh A01(C7109EgN c7109EgN) {
        InterfaceC7127Egh<CCV, InterfaceC7064EfB> interfaceC7127Egh = c7109EgN.A08;
        if (interfaceC7127Egh != null) {
            return interfaceC7127Egh;
        }
        C7110EgO c7110EgO = c7109EgN.A0D;
        InterfaceC7005EeA<C7167Ehc> interfaceC7005EeA = c7110EgO.A03;
        EC1 ec1 = c7110EgO.A07;
        ECV ecv = c7110EgO.A09;
        AnonymousClass005.A0x(interfaceC7005EeA, ec1, ecv);
        C7158EhT c7158EhT = new C7158EhT(interfaceC7005EeA, ecv, new C7137Egt());
        ec1.registerMemoryTrimmable(c7158EhT);
        c7109EgN.A08 = c7158EhT;
        return c7158EhT;
    }

    private final C7112EgS A02() {
        C7112EgS c7112EgS = this.A09;
        if (c7112EgS != null) {
            return c7112EgS;
        }
        C7110EgO c7110EgO = this.A0D;
        InterfaceC7127Egh c7158EhT = this.A01;
        if (c7158EhT == null) {
            InterfaceC7005EeA<C7167Ehc> interfaceC7005EeA = c7110EgO.A05;
            EC1 ec1 = c7110EgO.A07;
            c7158EhT = new C7158EhT(interfaceC7005EeA, c7110EgO.A0A, new C7130Egl());
            ec1.registerMemoryTrimmable(c7158EhT);
            this.A01 = c7158EhT;
        }
        C7112EgS c7112EgS2 = new C7112EgS(c7158EhT, new C7134Egq(c7110EgO.A0B));
        this.A09 = c7112EgS2;
        return c7112EgS2;
    }

    public static C7109EgN A03() {
        C7109EgN c7109EgN = A0F;
        if (c7109EgN != null) {
            return c7109EgN;
        }
        throw BV5.A0Y("ImagePipelineFactory was not initialized!");
    }

    private final C6987Edn A04() {
        C6987Edn c6987Edn = this.A0A;
        if (c6987Edn != null) {
            return c6987Edn;
        }
        C7110EgO c7110EgO = this.A0D;
        C7114EgU c7114EgU = c7110EgO.A0I;
        Eh2 eh2 = c7110EgO.A0E.A03;
        AnonymousClass003.A0v(c7114EgU, eh2);
        int i = c7114EgU.A01.A03.A00;
        C3110ByZ c3110ByZ = new C3110ByZ(i);
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
            C7384Etj.A0U(byteBufferAllocate);
            c3110ByZ.AaC(byteBufferAllocate);
        }
        F0C f0c = c7114EgU.A03;
        C6987Edn c6987Edn2 = new C6987Edn((InterfaceC6522EBw) f0c.getValue(), new EGT(c3110ByZ, (InterfaceC6522EBw) f0c.getValue(), eh2, new EGU()), eh2);
        this.A0A = c6987Edn2;
        return c6987Edn2;
    }

    public final C7182Ehs A06() {
        C7182Ehs c7182Ehs = A0G;
        if (c7182Ehs != null) {
            return c7182Ehs;
        }
        CancellationException cancellationException = C7182Ehs.A0E;
        C7110EgO c7110EgO = this.A0D;
        C7122Egc c7122Egc = c7110EgO.A0E;
        C7154EhP c7154EhP = this.A04;
        if (c7154EhP == null) {
            Context context = c7110EgO.A00;
            ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
            C7155EhQ c7155EhQ = this.A03;
            if (c7155EhQ == null) {
                C7114EgU c7114EgU = c7110EgO.A0I;
                C6524EBy c6524EBy = (C6524EBy) c7114EgU.A08.getValue();
                if (this.A05 == null) {
                    Ee8 ee8 = c7110EgO.A0G;
                    HashMap mapA0u = BV4.A0u();
                    if (ee8 == null) {
                        A05(mapA0u);
                        this.A05 = new C7045Eer(A04(), mapA0u);
                    } else {
                        A05(mapA0u);
                        Map<C7003Ee6, InterfaceC7068EfO> map = ee8.A01;
                        if (map != null) {
                            mapA0u.putAll(map);
                        }
                        this.A05 = new C7045Eer(A04(), mapA0u);
                        C6991Eds value = C6991Eds.A03.getValue();
                        value.A01 = ee8.A00;
                        C6991Eds.A01(value);
                    }
                }
                InterfaceC7068EfO interfaceC7068EfO = this.A05;
                Eh5 eh5 = c7110EgO.A0H;
                BXh bXh = c7110EgO.A0C;
                boolean z = c7110EgO.A0O;
                InterfaceC7147EhG interfaceC7147EhG = c7110EgO.A0D;
                C7011EeI c7011EeIA00 = c7114EgU.A00();
                Object value2 = c7114EgU.A07.getValue();
                C7112EgS<CCV, InterfaceC7064EfB> c7112EgS = this.A02;
                if (c7112EgS == null) {
                    c7112EgS = new C7112EgS<>(A01(this), new C7135Egr(c7110EgO.A0B));
                    this.A02 = c7112EgS;
                }
                C7112EgS c7112EgSA02 = A02();
                InterfaceC7005EeA interfaceC7005EeA = this.A0B;
                DV5 dv5 = c7110EgO.A08;
                AbstractC7151EhM abstractC7151EhMA00 = A00(this);
                C7069EfP c7069EfP = this.A0C;
                AnonymousClass005.A11(c6524EBy, interfaceC7068EfO, eh5, 1);
                C7384Etj.A0Y(bXh, 4);
                AnonymousClass002.A1F(interfaceC7147EhG, 7, value2);
                C7384Etj.A0Y(interfaceC7005EeA, 12);
                C7384Etj.A0Y(dv5, 13);
                c7155EhQ = new C7155EhQ(context, interfaceC7005EeA, abstractC7151EhMA00, dv5, c7112EgS, c7112EgSA02, c7069EfP, bXh, interfaceC7147EhG, c7110EgO, interfaceC7068EfO, eh5, c6524EBy, c7011EeIA00, z);
                this.A03 = c7155EhQ;
            }
            AbstractC6692EUz abstractC6692EUz = c7110EgO.A0J;
            boolean z2 = c7110EgO.A0O;
            C7037Eej c7037Eej = this.A0E;
            BXh bXh2 = c7110EgO.A0C;
            boolean z3 = c7110EgO.A0N;
            InterfaceC7006EeD c6998Ee0 = this.A06;
            if (c6998Ee0 == null) {
                c6998Ee0 = new C6998Ee0();
                this.A06 = c6998Ee0;
            }
            c7154EhP = new C7154EhP(contentResolver, c7122Egc.A00, bXh2, c7155EhQ, abstractC6692EUz, c7037Eej, c6998Ee0, c7110EgO.A0K, z2, z3);
            this.A04 = c7154EhP;
        }
        Set<InterfaceC7250EjU> set = c7110EgO.A0M;
        Set<InterfaceC7251EjV> set2 = c7110EgO.A0L;
        InterfaceC7005EeA<Boolean> interfaceC7005EeA2 = c7110EgO.A06;
        C7112EgS<CCV, InterfaceC7064EfB> c7112EgS2 = this.A02;
        if (c7112EgS2 == null) {
            c7112EgS2 = new C7112EgS<>(A01(this), new C7135Egr(c7110EgO.A0B));
            this.A02 = c7112EgS2;
        }
        C7112EgS c7112EgSA022 = A02();
        C7182Ehs c7182Ehs2 = new C7182Ehs(interfaceC7005EeA2, this.A0B, c7122Egc.A02, c7122Egc.A01, c7110EgO.A08, c7112EgS2, c7112EgSA022, c7110EgO, c7154EhP, this.A0E, set, set2);
        A0G = c7182Ehs2;
        return c7182Ehs2;
    }

    public C7109EgN(C7110EgO c7110EgO) {
        C7267Ejs.A00();
        this.A0D = c7110EgO;
        this.A0E = new C7037Eej(((C7120Ega) c7110EgO.A0D).A03);
        this.A0C = new C7069EfP(c7110EgO.A0F);
        C7267Ejs.A00();
        this.A0B = c7110EgO.A04;
    }
}

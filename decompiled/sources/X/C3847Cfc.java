package X;

import android.content.Context;
import com.facebook.aura.commands.photos.DeviceMediaStoreReaderKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Cfc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3847Cfc implements InterfaceC3926Ch7 {
    public static volatile C3851Cfg A04;
    public final InterfaceC3924Ch5 A00;
    public final C3856Cfl A01;
    public final InterfaceC3770CeD A02;
    public final InterfaceC3770CeD A03;

    public static C3847Cfc A00() {
        C3851Cfg c3851Cfg = A04;
        if (c3851Cfg != null) {
            return c3851Cfg.A09.AMN();
        }
        throw C3cG.A0Q("Not initialized!");
    }

    public static void A01(Context context) {
        if (A04 == null) {
            synchronized (C3847Cfc.class) {
                if (A04 == null) {
                    context.getClass();
                    C3851Cfg c3851Cfg = new C3851Cfg();
                    C3838CfR c3838CfR = AbstractC3909Cgn.A00;
                    C3849Cfe c3849Cfe = new C3849Cfe();
                    Object obj = C3849Cfe.A02;
                    c3849Cfe.A00 = obj;
                    c3849Cfe.A01 = c3838CfR;
                    c3851Cfg.A03 = c3849Cfe;
                    C3885CgM c3885CgM = new C3885CgM(context);
                    c3851Cfg.A08 = c3885CgM;
                    C3896Cga c3896Cga = AbstractC3905Cgj.A00;
                    C3895CgZ c3895CgZ = AbstractC3904Cgi.A00;
                    C3598CWh c3598CWh = new C3598CWh(c3885CgM, c3896Cga, c3895CgZ);
                    c3851Cfg.A01 = c3598CWh;
                    C3595CWe c3595CWe = new C3595CWe(c3885CgM, c3598CWh);
                    C3849Cfe c3849Cfe2 = new C3849Cfe();
                    c3849Cfe2.A00 = obj;
                    c3849Cfe2.A01 = c3595CWe;
                    c3851Cfg.A04 = c3849Cfe2;
                    F18<Context> f18 = c3851Cfg.A08;
                    Cg8 cg8 = new Cg8(f18, AbstractC3908Cgm.A00, AbstractC3907Cgl.A00);
                    c3851Cfg.A07 = cg8;
                    C3141BzR c3141BzR = new C3141BzR(f18);
                    c3851Cfg.A05 = c3141BzR;
                    C3858Cfn c3858Cfn = new C3858Cfn(c3896Cga, c3895CgZ, AbstractC3906Cgk.A00, cg8, c3141BzR);
                    C3849Cfe c3849Cfe3 = new C3849Cfe();
                    c3849Cfe3.A00 = obj;
                    c3849Cfe3.A01 = c3858Cfn;
                    c3851Cfg.A06 = c3849Cfe3;
                    C3766Ce8 c3766Ce8 = new C3766Ce8(c3896Cga);
                    c3851Cfg.A00 = c3766Ce8;
                    F18<Context> f182 = c3851Cfg.A08;
                    Cg1 cg1 = new Cg1(f182, c3849Cfe3, c3766Ce8, c3895CgZ);
                    c3851Cfg.A0C = cg1;
                    F18<Executor> f183 = c3851Cfg.A03;
                    F18 f184 = c3851Cfg.A04;
                    C3859Cfo c3859Cfo = new C3859Cfo(f183, f184, cg1, c3849Cfe3, c3849Cfe3);
                    c3851Cfg.A02 = c3859Cfo;
                    C3855Cfk c3855Cfk = new C3855Cfk(f182, f184, c3849Cfe3, cg1, f183, c3849Cfe3, c3896Cga, c3895CgZ, c3849Cfe3);
                    c3851Cfg.A0A = c3855Cfk;
                    C3871Cg0 c3871Cg0 = new C3871Cg0(f183, c3849Cfe3, cg1, c3849Cfe3);
                    c3851Cfg.A0B = c3871Cg0;
                    C3870Cfz c3870Cfz = new C3870Cfz(c3896Cga, c3895CgZ, c3859Cfo, c3855Cfk, c3871Cg0);
                    C3849Cfe c3849Cfe4 = new C3849Cfe();
                    c3849Cfe4.A00 = obj;
                    c3849Cfe4.A01 = c3870Cfz;
                    c3851Cfg.A09 = c3849Cfe4;
                    A04 = c3851Cfg;
                }
            }
        }
    }

    public final C3846Cfb A02(InterfaceC3742Cdf interfaceC3742Cdf) {
        Set setUnmodifiableSet = interfaceC3742Cdf instanceof InterfaceC3829CfI ? Collections.unmodifiableSet(CfH.A03) : Collections.singleton(new Ce6("proto"));
        Ce5 ce5 = Ce5.DEFAULT;
        String str = ((CfH) interfaceC3742Cdf).A00;
        return new C3846Cfb(AbstractC3873Cg4.A00(ce5, "cct", str == null ? null : String.format("%s%s%s%s", "1$", str, DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR, "").getBytes(Charset.forName(HatchWebPageParserKt.UTF_8))), this, setUnmodifiableSet);
    }

    public C3847Cfc(InterfaceC3924Ch5 interfaceC3924Ch5, C3856Cfl c3856Cfl, final C3881CgI c3881CgI, InterfaceC3770CeD interfaceC3770CeD, InterfaceC3770CeD interfaceC3770CeD2) {
        this.A02 = interfaceC3770CeD;
        this.A03 = interfaceC3770CeD2;
        this.A00 = interfaceC3924Ch5;
        this.A01 = c3856Cfl;
        c3881CgI.A03.execute(new Runnable() { // from class: X.CfY
            public static final String __redex_internal_original_name = "WorkInitializer$$ExternalSyntheticLambda0";

            /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
            
                throw r0;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r9 = this;
                    X.CgI r6 = r1
                    X.Ch3 r0 = r6.A02
                    X.CfV r0 = (X.C3842CfV) r0
                    android.database.sqlite.SQLiteDatabase r4 = X.C3842CfV.A00(r0)
                    X.C3842CfV.A03(r4, r0)
                    X.CgU r0 = r6.A01     // Catch: java.lang.Throwable -> L97
                    X.CfV r0 = (X.C3842CfV) r0     // Catch: java.lang.Throwable -> L97
                    android.database.sqlite.SQLiteDatabase r3 = X.C3842CfV.A00(r0)     // Catch: java.lang.Throwable -> L97
                    r3.beginTransaction()     // Catch: java.lang.Throwable -> L97
                    r5 = 0
                    java.lang.String[] r1 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L92
                    java.lang.String r0 = "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"
                    android.database.Cursor r2 = r3.rawQuery(r0, r1)     // Catch: java.lang.Throwable -> L92
                    java.util.ArrayList r9 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L8d
                L25:
                    boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L8d
                    if (r0 == 0) goto L64
                    r0 = 1
                    java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L8d
                    if (r8 == 0) goto L5d
                    r0 = 2
                    int r7 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L8d
                    android.util.SparseArray<X.Ce5> r0 = X.Ce7.A00     // Catch: java.lang.Throwable -> L8d
                    java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L8d
                    X.Ce5 r1 = (X.Ce5) r1     // Catch: java.lang.Throwable -> L8d
                    if (r1 == 0) goto L56
                    r0 = 3
                    java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L8d
                    if (r0 != 0) goto L4a
                    r0 = 0
                    goto L4e
                L4a:
                    byte[] r0 = android.util.Base64.decode(r0, r5)     // Catch: java.lang.Throwable -> L8d
                L4e:
                    X.Cfw r0 = X.AbstractC3873Cg4.A00(r1, r8, r0)     // Catch: java.lang.Throwable -> L8d
                    r9.add(r0)     // Catch: java.lang.Throwable -> L8d
                    goto L25
                L56:
                    java.lang.String r0 = "Unknown Priority for value "
                    java.lang.IllegalArgumentException r0 = X.BV5.A0Q(r0, r7)     // Catch: java.lang.Throwable -> L8d
                    throw r0     // Catch: java.lang.Throwable -> L8d
                L5d:
                    java.lang.String r0 = "Null backendName"
                    java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: java.lang.Throwable -> L8d
                    throw r0     // Catch: java.lang.Throwable -> L8d
                L64:
                    r2.close()     // Catch: java.lang.Throwable -> L92
                    r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L92
                    r3.endTransaction()     // Catch: java.lang.Throwable -> L97
                    java.util.Iterator r3 = r9.iterator()     // Catch: java.lang.Throwable -> L97
                L71:
                    boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L97
                    if (r0 == 0) goto L86
                    java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L97
                    X.Cg5 r2 = (X.AbstractC3874Cg5) r2     // Catch: java.lang.Throwable -> L97
                    X.Cgd r1 = r6.A00     // Catch: java.lang.Throwable -> L97
                    r0 = 1
                    X.CfW r1 = (X.C3843CfW) r1     // Catch: java.lang.Throwable -> L97
                    r1.Ac7(r2, r0, r5)     // Catch: java.lang.Throwable -> L97
                    goto L71
                L86:
                    r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L97
                    r4.endTransaction()
                    return
                L8d:
                    r0 = move-exception
                    r2.close()     // Catch: java.lang.Throwable -> L92
                    throw r0     // Catch: java.lang.Throwable -> L92
                L92:
                    r0 = move-exception
                    r3.endTransaction()     // Catch: java.lang.Throwable -> L97
                    throw r0     // Catch: java.lang.Throwable -> L97
                L97:
                    r0 = move-exception
                    r4.endTransaction()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC3845CfY.run():void");
            }
        });
    }
}

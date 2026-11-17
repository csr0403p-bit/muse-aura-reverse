package X;

import android.content.Context;
import android.content.Intent;
import androidx.room.coroutines.ConnectionPoolImpl;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EIO {
    public EI3 A00;
    public boolean A01;
    public boolean A02;
    public final EIQ A03;
    public final EIT A04;
    public final EIZ A05;
    public final EEV A06;
    public final List<AbstractC6555EEr> A07;

    public EIO(EIQ eiq, G0U g0u) {
        this.A03 = eiq;
        this.A04 = new C6582EIa();
        List<AbstractC6555EEr> list = eiq.A0C;
        this.A07 = list;
        ArrayList arrayListA0Q = AbstractC0878AGe.A0Q(new C6585EId(new C7590F5d(this, 5)), list);
        Context context = eiq.A02;
        String str = eiq.A0A;
        InterfaceC6553EEo interfaceC6553EEo = eiq.A06;
        EEj eEj = eiq.A04;
        boolean z = eiq.A0L;
        Integer num = eiq.A08;
        Executor executor = eiq.A0G;
        Executor executor2 = eiq.A0H;
        Intent intent = eiq.A03;
        boolean z2 = eiq.A0M;
        boolean z3 = eiq.A0K;
        Set<Integer> set = eiq.A0E;
        String str2 = eiq.A09;
        File file = eiq.A07;
        Callable<InputStream> callable = eiq.A0F;
        EIQ eiq2 = new EIQ(context, intent, eEj, eiq.A05, interfaceC6553EEo, file, num, str, str2, arrayListA0Q, eiq.A0D, eiq.A0B, set, callable, executor, executor2, eiq.A0I, z, z2, z3, eiq.A0J);
        eiq2.A01 = eiq.A01;
        eiq2.A00 = eiq.A00;
        g0u.invoke(eiq2);
        throw null;
    }

    private final void A00(EJV ejv) {
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.A04.identityHash;
        C7384Etj.A0Y(str, 0);
        EIW.A00(ejv, FGI.A0U("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", str, "')"));
    }

    public static final void A01(EJV ejv) {
        EIK eikAYO = ejv.AYO("PRAGMA busy_timeout");
        try {
            eikAYO.AgN();
            long j = eikAYO.getLong(0);
            eikAYO.close();
            if (j < 3000) {
                EIW.A00(ejv, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Hsg.A00(eikAYO, th);
                throw th2;
            }
        }
    }

    public final void A02(EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (eikAYO.AgN()) {
                if (eikAYO.getLong(0) == 0) {
                    z = true;
                }
            }
            eikAYO.close();
            EIT eit = this.A04;
            eit.createAllTables(ejv);
            if (!z) {
                C6587EIf c6587EIfOnValidateSchema = eit.onValidateSchema(ejv);
                if (!c6587EIfOnValidateSchema.A01) {
                    throw BV5.A0U("Pre-packaged database has an invalid schema: ", c6587EIfOnValidateSchema.A00);
                }
            }
            A00(ejv);
            eit.onCreate(ejv);
            Iterator<AbstractC6555EEr> it = this.A07.iterator();
            while (it.hasNext()) {
                it.next();
            }
        } finally {
        }
    }

    public final void A03(EJV ejv) throws Throwable {
        Object objA0s;
        EIT eit;
        C6587EIf c6587EIfOnValidateSchema;
        EIK eikAYO = ejv.AYO("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = false;
            if (eikAYO.AgN()) {
                if (eikAYO.getLong(0) != 0) {
                    z = true;
                }
            }
            eikAYO.close();
            if (z) {
                eikAYO = ejv.AYO("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strALa = eikAYO.AgN() ? eikAYO.ALa(0) : null;
                    eikAYO.close();
                    EIT eit2 = this.A04;
                    if (!C7384Etj.areEqual(eit2.identityHash, strALa) && !C7384Etj.areEqual(eit2.legacyIdentityHash, strALa)) {
                        throw C3cG.A0Q(FGI.A0d("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", eit2.identityHash, ", found: ", strALa));
                    }
                } finally {
                }
            } else {
                EIW.A00(ejv, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    eit = this.A04;
                    c6587EIfOnValidateSchema = eit.onValidateSchema(ejv);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (!c6587EIfOnValidateSchema.A01) {
                    throw BV5.A0U("Pre-packaged database has an invalid schema: ", c6587EIfOnValidateSchema.A00);
                }
                eit.onPostMigrate(ejv);
                A00(ejv);
                objA0s = Unit.INSTANCE;
                if (!(objA0s instanceof C10571Hud)) {
                    EIW.A00(ejv, "END TRANSACTION");
                }
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 != null) {
                    EIW.A00(ejv, "ROLLBACK TRANSACTION");
                    throw thA00;
                }
            }
            this.A04.onOpen(ejv);
            Iterator<AbstractC6555EEr> it = this.A07.iterator();
            while (it.hasNext()) {
                it.next().onOpen(ejv);
            }
            this.A01 = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.AGi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.EJV r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIO.A04(X.EJV, int, int):void");
    }

    public EIO() {
    }

    public EIO(EIQ eiq, EIT eit, G0V<? super G0U<? super HtJ<Object>, ? extends Object>, ? super HtJ<Object>, ? extends Object> g0v) {
        EIZ connectionPoolImpl;
        this.A03 = eiq;
        this.A04 = eit;
        this.A07 = eiq.A0C;
        InterfaceC6586EIe interfaceC6586EIe = eiq.A05;
        if (interfaceC6586EIe == null) {
            InterfaceC6553EEo interfaceC6553EEo = eiq.A06;
            if (interfaceC6553EEo != null) {
                Context context = eiq.A02;
                String str = eiq.A0A;
                EET eetA7T = interfaceC6553EEo.A7T(new C6552EEn(context, new ECx(this, eit.version), str));
                this.A06 = eetA7T;
                this.A05 = new EJI(new EEU(eetA7T), str != null ? str : ":memory:", g0v);
            } else {
                throw C60O.A0i("SQLiteManager was constructed with both null driver and open helper factory!");
            }
        } else {
            this.A06 = null;
            if (interfaceC6586EIe.AN7()) {
                EIP eip = new EIP(this, interfaceC6586EIe);
                String str2 = eiq.A0A;
                connectionPoolImpl = new EJI(eip, str2 != null ? str2 : ":memory:", g0v);
            } else {
                String str3 = eiq.A0A;
                EIP eip2 = new EIP(this, interfaceC6586EIe);
                if (str3 == null) {
                    connectionPoolImpl = new ConnectionPoolImpl(eip2, eiq.A00);
                } else {
                    int iIntValue = eiq.A08.intValue();
                    int i = 1;
                    if (iIntValue != 1) {
                        if (iIntValue == 2) {
                            i = 4;
                        } else {
                            throw C3cG.A0Q(FGI.A0N("Can't get max number of reader for journal mode '", "AUTOMATIC", '\''));
                        }
                    }
                    connectionPoolImpl = new ConnectionPoolImpl(eip2, str3, i, eiq.A00);
                }
            }
            this.A05 = connectionPoolImpl;
        }
        boolean zA1Z = AnonymousClass002.A1Z(this.A03.A08, C79.A0C);
        EEV eev = this.A06;
        if (eev != null) {
            EET eet = (EET) eev;
            F0C<C6528ECv> f0c = eet.A04;
            if (f0c.AOX()) {
                f0c.getValue().setWriteAheadLoggingEnabled(zA1Z);
            }
            eet.A00 = zA1Z;
        }
    }
}

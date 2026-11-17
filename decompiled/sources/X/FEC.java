package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import com.facebook.aura.R;
import java.util.List;

/* loaded from: classes6.dex */
public final class FEC {
    public static final FEC A00 = new FEC();
    public static final F9N A01 = F9N.A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static final FEE A00(FEE fee, FBB fbb, FDW fdw, long j) {
        C7384Etj.A0Y(fdw, 0);
        if (FBA.A0A(fbb)) {
            FCA fcaA0m = AbstractC7610F5x.A0m(fbb);
            if (fcaA0m == null) {
                throw BV4.A0U();
            }
            FCA fcaA04 = fcaA0m.A04(fee != null ? (FCH) fee.A04 : null);
            return A01(fee, fbb, fdw, fcaA04, fcaA04.A03, -1, j);
        }
        Context contextA00 = FBB.A00(fbb);
        fbb.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        C7764FDr c7764FDr = new C7764FDr(contextA00, new C7749FDb(fee != null ? fee.A00 : null), fbb, -1);
        try {
            FEE feeA01 = FEE.A01(c7764FDr, fdw, null, j);
            c7764FDr.A00 = null;
            return feeA01;
        } catch (Throwable th) {
            c7764FDr.A00 = null;
            throw th;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/FDW;TT;JLX/FEE<TT;LX/FBB;>;LX/FBB;LX/FCA;I)LX/FEE<TT;LX/FBB;>; */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3 A[Catch: all -> 0x0188, TryCatch #1 {all -> 0x0188, blocks: (B:18:0x0052, B:20:0x0061, B:23:0x0070, B:25:0x0074, B:27:0x0078, B:31:0x009f, B:33:0x00ad, B:41:0x00c3, B:43:0x00cd, B:44:0x00cf, B:45:0x00d4, B:36:0x00b5, B:39:0x00bb, B:40:0x00c0, B:74:0x0187, B:46:0x00e9, B:50:0x00fb, B:51:0x00fd, B:54:0x0117, B:56:0x0134, B:58:0x0140, B:60:0x0144, B:62:0x0148, B:67:0x0159, B:69:0x0163, B:70:0x0165, B:63:0x014d, B:29:0x0096, B:52:0x0109, B:66:0x0153), top: B:82:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153 A[Catch: all -> 0x0186, Merged into TryCatch #1 {all -> 0x0188, blocks: (B:18:0x0052, B:20:0x0061, B:23:0x0070, B:25:0x0074, B:27:0x0078, B:31:0x009f, B:33:0x00ad, B:41:0x00c3, B:43:0x00cd, B:44:0x00cf, B:45:0x00d4, B:36:0x00b5, B:39:0x00bb, B:40:0x00c0, B:74:0x0187, B:46:0x00e9, B:50:0x00fb, B:51:0x00fd, B:54:0x0117, B:56:0x0134, B:58:0x0140, B:60:0x0144, B:62:0x0148, B:67:0x0159, B:69:0x0163, B:70:0x0165, B:63:0x014d, B:29:0x0096, B:52:0x0109, B:66:0x0153), top: B:82:0x0052 }, TRY_ENTER, TRY_LEAVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FEE A01(X.FEE r17, X.FBB r18, X.FDW r19, X.FCA r20, java.lang.Object r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FEC.A01(X.FEE, X.FBB, X.FDW, X.FCA, java.lang.Object, int, long):X.FEE");
    }

    public static final void A04(C7765FDs c7765FDs, FDW fdw, InterfaceC7780FEk interfaceC7780FEk) {
        C7748FDa c7748FDa;
        C7384Etj.A0Y(fdw, 0);
        Object obj = c7765FDs.A01.get(fdw);
        if (obj == null) {
            obj = null;
        }
        if ((obj instanceof C7748FDa) && (c7748FDa = (C7748FDa) obj) != null && c7748FDa.A06) {
            List list = c7748FDa.A05;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((FE2) list.get(i)).ANz(interfaceC7780FEk);
                }
            }
            FDW[] fdwArr = c7748FDa.A09;
            if (fdwArr != null) {
                for (FDW fdw2 : fdwArr) {
                    A04(c7765FDs, fdw2, interfaceC7780FEk);
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;JLX/FEE<*LX/FBB;>;LX/FBB;LX/FCA;I)LX/FEE<+Ljava/lang/Object;LX/FBB;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public final FEE A05(FEE fee, FBB fbb, FDW fdw, FCA fca, int i, long j) {
        AnonymousClass003.A0w(fdw, fbb);
        if (fca == null) {
            return A02(fee, fbb, fdw, null, i, j);
        }
        FCA fcaA04 = fca.A04(fee != null ? (FCH) fee.A04 : null);
        return A01(fee, fbb, fdw, fcaA04, fcaA04.A03, -1, j);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;Ljava/lang/Object;JLX/FEE<*LX/FBB;>;LX/FBB;I)LX/FEE<+Ljava/lang/Object;LX/FBB;>; */
    public static final FEE A02(FEE fee, FBB fbb, FDW fdw, Object obj, int i, long j) {
        if (fee != null) {
            FGW fgw = fee.A03;
            if (fdw == fee.A02) {
                long j2 = fgw.A00;
                Rect rect = fgw.A02.A03;
                if (AbstractC7826FGh.A02(j, j2, FEP.A00(rect.width(), rect.height()))) {
                    return new FEE(fee.A00, fee.A01, fdw, obj);
                }
            }
        }
        fbb.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        C7764FDr c7764FDr = new C7764FDr(FBB.A00(fbb), new C7749FDb(fee != null ? fee.A00 : null), fbb, i);
        try {
            return FEE.A01(c7764FDr, fdw, obj, j);
        } finally {
            c7764FDr.A00 = null;
        }
    }

    public static final void A03(SparseIntArray sparseIntArray) {
        FEL felA01 = AbstractC7759FDl.A00.A01();
        if (felA01 == null) {
            throw BV4.A0U();
        }
        FEL fel = felA01;
        int i = fel.A00;
        if (i <= 0) {
            throw C3cG.A0Q("Cannot restore a layout dirtiness cache without a matching acquire");
        }
        fel.A00 = i - 1;
        fel.A01 = sparseIntArray;
    }
}

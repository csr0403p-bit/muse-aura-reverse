package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Dx9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC6166Dx9 extends Handler {
    public final /* synthetic */ C6160Dx3 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6166Dx9(Looper looper, C6160Dx3 c6160Dx3) {
        super(looper);
        this.A00 = c6160Dx3;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                C6160Dx3 c6160Dx3 = this.A00;
                if (obj == c6160Dx3.A01) {
                    int i2 = c6160Dx3.A00;
                    if (i2 == 3 || i2 == 4) {
                        c6160Dx3.A01 = null;
                        if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                            C6160Dx3.A02(c6160Dx3, (Throwable) obj2, false);
                            return;
                        }
                        try {
                            byte[] bArr = (byte[]) obj2;
                            byte[] bArrAYf = c6160Dx3.A0D.AYf(c6160Dx3.A04, bArr);
                            if (c6160Dx3.A03 != null && bArrAYf != null && bArrAYf.length != 0) {
                                c6160Dx3.A03 = bArrAYf;
                            }
                            c6160Dx3.A00 = 4;
                            Iterator<C6014Dtx> it = c6160Dx3.A0A.A01().iterator();
                            while (it.hasNext()) {
                                it.next().A00();
                            }
                            return;
                        } catch (Exception | NoSuchMethodError e) {
                            C6160Dx3.A02(c6160Dx3, e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        C6160Dx3 c6160Dx32 = this.A00;
        if (obj == c6160Dx32.A02) {
            int i3 = c6160Dx32.A00;
            if (i3 == 2 || i3 == 3 || i3 == 4) {
                c6160Dx32.A02 = null;
                if (obj2 instanceof Exception) {
                    Throwable th = (Throwable) obj2;
                    C6182DxQ c6182DxQ = (C6182DxQ) c6160Dx32.A0B;
                    c6182DxQ.A00 = null;
                    Set<C6160Dx3> set = c6182DxQ.A01;
                    ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) set);
                    set.clear();
                    Iterator it2 = immutableListCopyOf.iterator();
                    while (it2.hasNext()) {
                        C6160Dx3.A01((C6160Dx3) it2.next(), th, 3);
                    }
                    return;
                }
                try {
                    c6160Dx32.A0D.AYg((byte[]) obj2);
                    C6182DxQ c6182DxQ2 = (C6182DxQ) c6160Dx32.A0B;
                    c6182DxQ2.A00 = null;
                    Set<C6160Dx3> set2 = c6182DxQ2.A01;
                    ImmutableList immutableListCopyOf2 = ImmutableList.copyOf((Collection) set2);
                    set2.clear();
                    Iterator it3 = immutableListCopyOf2.iterator();
                    while (it3.hasNext()) {
                        C6160Dx3 c6160Dx33 = (C6160Dx3) it3.next();
                        if (C6160Dx3.A05(c6160Dx33)) {
                            C6160Dx3.A03(c6160Dx33, true);
                        }
                    }
                } catch (Exception e2) {
                    C6182DxQ c6182DxQ3 = (C6182DxQ) c6160Dx32.A0B;
                    c6182DxQ3.A00 = null;
                    Set<C6160Dx3> set3 = c6182DxQ3.A01;
                    ImmutableList immutableListCopyOf3 = ImmutableList.copyOf((Collection) set3);
                    set3.clear();
                    Iterator it4 = immutableListCopyOf3.iterator();
                    while (it4.hasNext()) {
                        C6160Dx3.A01((C6160Dx3) it4.next(), e2, 1);
                    }
                }
            }
        }
    }
}

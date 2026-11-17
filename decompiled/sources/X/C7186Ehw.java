package X;

import android.util.Pair;
import com.facebook.common.util.TriState;
import java.io.Closeable;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Ehw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7186Ehw {
    public float A00;
    public int A01;
    public C7185Ehv A02;
    public AbstractC7187Ehx<K, T>.Multiplexer.ForwardingConsumer A03;

    /* JADX INFO: Incorrect field signature: TT; */
    public Closeable A04;
    public final K A05;
    public final CopyOnWriteArraySet<Pair<InterfaceC7028EeZ<T>, InterfaceC7029Eea>> A06 = new CopyOnWriteArraySet<>();
    public final /* synthetic */ AbstractC7187Ehx A07;

    private synchronized EnumC7203EiK A00() {
        EnumC7203EiK enumC7203EiK;
        EnumC7203EiK enumC7203EiK2;
        enumC7203EiK = EnumC7203EiK.A03;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            C7185Ehv c7185Ehv = (C7185Ehv) ((InterfaceC7029Eea) BV6.A0O(it).second);
            synchronized (c7185Ehv) {
                enumC7203EiK2 = c7185Ehv.A00;
            }
            C7384Etj.A0Y(enumC7203EiK2, 1);
            if (enumC7203EiK.ordinal() > enumC7203EiK2.ordinal()) {
                enumC7203EiK2 = enumC7203EiK;
            }
            enumC7203EiK = enumC7203EiK2;
        }
        return enumC7203EiK;
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.Ehw) */
    public static synchronized ArrayList A01(C7186Ehw c7186Ehw) {
        ArrayList arrayListA0t;
        synchronized (c7186Ehw) {
            C7185Ehv c7185Ehv = c7186Ehw.A02;
            if (c7185Ehv == null) {
                return null;
            }
            boolean zA06 = c7186Ehw.A06();
            synchronized (c7185Ehv) {
                if (zA06 == c7185Ehv.A02) {
                    arrayListA0t = null;
                } else {
                    c7185Ehv.A02 = zA06;
                    arrayListA0t = BV4.A0t(c7185Ehv.A0A);
                }
            }
            return arrayListA0t;
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.Ehw) */
    public static synchronized ArrayList A02(C7186Ehw c7186Ehw) {
        ArrayList arrayListA0t;
        synchronized (c7186Ehw) {
            C7185Ehv c7185Ehv = c7186Ehw.A02;
            if (c7185Ehv == null) {
                return null;
            }
            boolean zA07 = c7186Ehw.A07();
            synchronized (c7185Ehv) {
                if (zA07 == c7185Ehv.A03) {
                    arrayListA0t = null;
                } else {
                    c7185Ehv.A03 = zA07;
                    arrayListA0t = BV4.A0t(c7185Ehv.A0A);
                }
            }
            return arrayListA0t;
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.Ehw) */
    public static synchronized ArrayList A03(C7186Ehw c7186Ehw) {
        ArrayList arrayListA0t;
        synchronized (c7186Ehw) {
            C7185Ehv c7185Ehv = c7186Ehw.A02;
            if (c7185Ehv == null) {
                return null;
            }
            EnumC7203EiK enumC7203EiKA00 = c7186Ehw.A00();
            synchronized (c7185Ehv) {
                if (enumC7203EiKA00 == c7185Ehv.A00) {
                    arrayListA0t = null;
                } else {
                    c7185Ehv.A00 = enumC7203EiKA00;
                    arrayListA0t = BV4.A0t(c7185Ehv.A0A);
                }
            }
            return arrayListA0t;
        }
    }

    public static void A04(TriState triState, C7186Ehw c7186Ehw) {
        C7110EgO c7110EgOAGL;
        synchronized (c7186Ehw) {
            CVn.A02(AnonymousClass002.A1Y(c7186Ehw.A02));
            CVn.A02(c7186Ehw.A03 == null);
            AbstractCollection abstractCollection = c7186Ehw.A06;
            if (abstractCollection.isEmpty()) {
                c7186Ehw.A07.A00(c7186Ehw, c7186Ehw.A05);
                return;
            }
            InterfaceC7029Eea interfaceC7029Eea = (InterfaceC7029Eea) BV6.A0O(abstractCollection.iterator()).second;
            C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
            C7183Eht c7183Eht = c7185Ehv.A07;
            String str = c7185Ehv.A09;
            InterfaceC7027EeY interfaceC7027EeY = c7185Ehv.A05;
            Object obj = c7185Ehv.A08;
            EnumC7058Ef5 enumC7058Ef5 = c7185Ehv.A06;
            boolean zA07 = c7186Ehw.A07();
            boolean zA06 = c7186Ehw.A06();
            EnumC7203EiK enumC7203EiKA00 = c7186Ehw.A00();
            if (interfaceC7029Eea instanceof C7185Ehv) {
                c7110EgOAGL = ((C7185Ehv) interfaceC7029Eea).A04;
            } else {
                try {
                    c7110EgOAGL = interfaceC7029Eea.AGL();
                } catch (UnsupportedOperationException unused) {
                    c7110EgOAGL = null;
                }
            }
            C7185Ehv c7185Ehv2 = new C7185Ehv(enumC7203EiKA00, c7110EgOAGL, interfaceC7027EeY, enumC7058Ef5, c7183Eht, obj, str, zA07, zA06);
            c7186Ehw.A02 = c7185Ehv2;
            c7185Ehv2.putExtras(interfaceC7029Eea.getExtras());
            if (triState != TriState.A03) {
                C7185Ehv c7185Ehv3 = c7186Ehw.A02;
                int iOrdinal = triState.ordinal();
                boolean z = false;
                if (iOrdinal == 0) {
                    z = true;
                } else if (iOrdinal != 1) {
                    throw C3cG.A0Q("No boolean equivalent for UNSET");
                }
                c7185Ehv3.putExtra("started_as_prefetch", Boolean.valueOf(z));
            }
            C7188Ehy c7188Ehy = new C7188Ehy(c7186Ehw);
            c7186Ehw.A03 = c7188Ehy;
            c7186Ehw.A07.A01.AYc(c7188Ehy, c7186Ehw.A02);
        }
    }

    private synchronized boolean A06() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7029Eea) BV6.A0O(it).second).AOc()) {
                return true;
            }
        }
        return false;
    }

    private synchronized boolean A07() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC7029Eea) BV6.A0O(it).second).AOu()) {
                return false;
            }
        }
        return true;
    }

    public C7186Ehw(AbstractC7187Ehx abstractC7187Ehx, K k) {
        this.A07 = abstractC7187Ehx;
        this.A05 = k;
    }

    public static void A05(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw BV4.A0e(e);
            }
        }
    }
}

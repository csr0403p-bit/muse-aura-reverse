package X;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EXs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6734EXs<K, V> extends AbstractC6735EXt<Map<K, V>> {
    public final AbstractC6735EXt<K> A00;
    public final AbstractC6735EXt<V> A01;
    public final InterfaceC6739EXx<? extends Map<K, V>> A02;
    public final /* synthetic */ EYG A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C6734EXs(AbstractC6735EXt abstractC6735EXt, AbstractC6735EXt<K> abstractC6735EXt2, AbstractC6735EXt<V> abstractC6735EXt3, InterfaceC6739EXx<? extends Map<K, V>> interfaceC6739EXx) {
        this.A03 = interfaceC6739EXx;
        this.A00 = abstractC6735EXt;
        this.A01 = abstractC6735EXt2;
        this.A02 = abstractC6735EXt3;
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c6733EXr.A0B();
            return;
        }
        c6733EXr.A08();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            c6733EXr.A0G(String.valueOf(entryA0l.getKey()));
            this.A01.write(c6733EXr, entryA0l.getValue());
        }
        c6733EXr.A0A();
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Object read(EY1 ey1) throws MalformedJsonException {
        int i;
        Integer numA0R = ey1.A0R();
        if (numA0R == C79.A0Z) {
            ey1.A0a();
            return null;
        }
        Map<K, V> mapA6t = this.A02.A6t();
        if (numA0R == C79.A00) {
            ey1.A0W();
            while (ey1.A0c()) {
                ey1.A0W();
                K k = this.A00.read(ey1);
                if (mapA6t.put(k, this.A01.read(ey1)) != null) {
                    throw new JsonSyntaxException(AnonymousClass007.A0a("duplicate key: ", k));
                }
                ey1.A0Y();
            }
            ey1.A0Y();
            return mapA6t;
        }
        ey1.A0X();
        while (ey1.A0c()) {
            if (ey1 instanceof C6731EXp) {
                C6731EXp c6731EXp = (C6731EXp) ey1;
                C6731EXp.A02(c6731EXp, C79.A0P);
                Map.Entry entryA0l = C3cH.A0l((Iterator) EY1.A09(c6731EXp));
                C6731EXp.A03(c6731EXp, entryA0l.getValue());
                C6731EXp.A03(c6731EXp, new JsonPrimitive(C60O.A0t(entryA0l)));
            } else {
                int iA05 = EY1.A05(ey1);
                if (iA05 == 13) {
                    i = 9;
                } else if (iA05 == 12) {
                    i = 8;
                } else {
                    if (iA05 != 14) {
                        throw EY1.A08(ey1, "a name");
                    }
                    i = 10;
                }
                ey1.A03 = i;
            }
            K k2 = this.A00.read(ey1);
            if (mapA6t.put(k2, this.A01.read(ey1)) != null) {
                throw new JsonSyntaxException(AnonymousClass007.A0a("duplicate key: ", k2));
            }
        }
        ey1.A0Z();
        return mapA6t;
    }
}

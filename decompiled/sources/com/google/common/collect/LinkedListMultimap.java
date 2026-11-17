package com.google.common.collect;

import X.AbstractC5024DOu;
import X.AbstractC7483Exg;
import X.BV8;
import X.C3cG;
import X.DPP;
import X.DPS;
import X.DPT;
import X.DPU;
import X.InterfaceC5010DNv;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class LinkedListMultimap<K, V> extends AbstractC5024DOu<K, V> implements InterfaceC5010DNv<K, V>, Serializable {
    public static final long serialVersionUID = 0;
    public transient int A00;
    public transient int A01;
    public transient DPS<K, V> A02;
    public transient DPS<K, V> A03;
    public transient Map<K, DPU<K, V>> A04 = new CompactHashMap(12);

    /* JADX WARN: Incorrect return type in method signature: (TK;TV;)Z */
    @Override // X.InterfaceC5023DOs
    public final void AYl(Object key, Object value) {
        A00(null, this, key, value);
    }

    @Override // X.InterfaceC5023DOs
    public final void clear() {
        this.A02 = null;
        this.A03 = null;
        this.A04.clear();
        this.A01 = 0;
        this.A00++;
    }

    public static DPS A00(DPS dps, LinkedListMultimap linkedListMultimap, Object obj, Object obj2) {
        DPS<K, V> dps2 = new DPS<>(obj, obj2);
        if (linkedListMultimap.A02 != null) {
            if (dps == null) {
                DPS<K, V> dps3 = linkedListMultimap.A03;
                dps3.getClass();
                dps3.A00 = dps2;
                dps2.A02 = linkedListMultimap.A03;
                linkedListMultimap.A03 = dps2;
                DPU<K, V> dpu = linkedListMultimap.A04.get(obj);
                if (dpu != null) {
                    dpu.A00++;
                    DPS<K, V> dps4 = dpu.A02;
                    dps4.A01 = dps2;
                    dps2.A03 = dps4;
                    dpu.A02 = dps2;
                }
            } else {
                DPU<K, V> dpu2 = linkedListMultimap.A04.get(obj);
                dpu2.getClass();
                dpu2.A00++;
                dps2.A02 = dps.A02;
                dps2.A03 = dps.A03;
                dps2.A00 = dps;
                dps2.A01 = dps;
                DPS<K, V> dps5 = dps.A03;
                if (dps5 == null) {
                    dpu2.A01 = dps2;
                } else {
                    dps5.A01 = dps2;
                }
                DPS<K, V> dps6 = dps.A02;
                if (dps6 == null) {
                    linkedListMultimap.A02 = dps2;
                } else {
                    dps6.A00 = dps2;
                }
                dps.A02 = dps2;
                dps.A03 = dps2;
            }
            linkedListMultimap.A01++;
            return dps2;
        }
        linkedListMultimap.A03 = dps2;
        linkedListMultimap.A02 = dps2;
        Map<K, DPU<K, V>> map = linkedListMultimap.A04;
        DPU<K, V> dpu3 = new DPU<>();
        dpu3.A01 = dps2;
        dpu3.A02 = dps2;
        dps2.A03 = null;
        dps2.A01 = null;
        dpu3.A00 = 1;
        map.put(obj, dpu3);
        linkedListMultimap.A00++;
        linkedListMultimap.A01++;
        return dps2;
    }

    public static void A01(DPS dps, LinkedListMultimap linkedListMultimap) {
        DPS<K, V> dps2 = dps.A02;
        DPS<K, V> dps3 = dps.A00;
        if (dps2 != null) {
            dps2.A00 = dps3;
        } else {
            linkedListMultimap.A02 = dps3;
        }
        DPS<K, V> dps4 = dps.A00;
        if (dps4 != null) {
            dps4.A02 = dps2;
        } else {
            linkedListMultimap.A03 = dps2;
        }
        if (dps.A03 == null && dps.A01 == null) {
            DPU<K, V> dpuRemove = linkedListMultimap.A04.remove(dps.A05);
            dpuRemove.getClass();
            dpuRemove.A00 = 0;
            linkedListMultimap.A00++;
        } else {
            DPU<K, V> dpu = linkedListMultimap.A04.get(dps.A05);
            dpu.getClass();
            dpu.A00--;
            DPS<K, V> dps5 = dps.A03;
            DPS<K, V> dps6 = dps.A01;
            if (dps5 == null) {
                dps6.getClass();
                dpu.A01 = dps6;
            } else {
                dps5.A01 = dps6;
            }
            DPS<K, V> dps7 = dps.A01;
            DPS<K, V> dps8 = dps.A03;
            if (dps7 == null) {
                dps8.getClass();
                dpu.A02 = dps8;
            } else {
                dps7.A03 = dps8;
            }
        }
        linkedListMultimap.A01--;
    }

    public static void A02(LinkedListMultimap linkedListMultimap, Object obj) {
        DPP dpp = new DPP(linkedListMultimap, obj);
        while (dpp.hasNext()) {
            dpp.next();
            dpp.remove();
        }
    }

    @Override // X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Collection AC1(final Object key) {
        return new DPT(this, key);
    }

    @Override // X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Collection Aah(Object key) {
        DPP dpp = new DPP(this, key);
        ArrayList arrayListA0h = C3cG.A0h();
        AbstractC7483Exg.A01(arrayListA0h, dpp);
        List listUnmodifiableList = Collections.unmodifiableList(arrayListA0h);
        A02(this, key);
        return listUnmodifiableList;
    }

    @Override // X.InterfaceC5023DOs
    public final boolean containsKey(Object key) {
        return this.A04.containsKey(key);
    }

    @Override // X.InterfaceC5023DOs
    public final int size() {
        return this.A01;
    }

    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.A04 = new CompactLinkedHashMap(3);
        int i = stream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            AYl(stream.readObject(), stream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(this.A01);
        Iterator it = ((List) super.AAn()).iterator();
        while (it.hasNext()) {
            BV8.A1J(stream, it);
        }
    }

    @Override // X.AbstractC5024DOu, X.InterfaceC5023DOs
    public final /* bridge */ /* synthetic */ Collection AAn() {
        return super.AAn();
    }
}

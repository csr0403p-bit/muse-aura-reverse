package X;

import java.util.List;

/* renamed from: X.6tq, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6tq {
    public static C6od A00(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? new C6tr((C6od[]) list.toArray(new C6od[size])) : (C6od) list.get(0) : C6tp.A00;
    }
}

package X;

import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Ehy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7188Ehy<T> extends AbstractC6691EUy<T> {
    public final /* synthetic */ C7186Ehw A00;

    public C7188Ehy(C7186Ehw c7186Ehw) {
        this.A00 = c7186Ehw;
    }

    @Override // X.AbstractC6691EUy
    public final void A04(float f) {
        try {
            C7267Ejs.A00();
            C7186Ehw c7186Ehw = this.A00;
            synchronized (c7186Ehw) {
                try {
                    if (c7186Ehw.A03 == this) {
                        c7186Ehw.A00 = f;
                        Iterator<Pair<InterfaceC7028EeZ<T>, InterfaceC7029Eea>> it = c7186Ehw.A06.iterator();
                        while (it.hasNext()) {
                            Pair pairA0O = BV6.A0O(it);
                            synchronized (pairA0O) {
                                try {
                                    ((InterfaceC7028EeZ) pairA0O.first).AV9(f);
                                } finally {
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            C7267Ejs.A00();
        }
    }
}

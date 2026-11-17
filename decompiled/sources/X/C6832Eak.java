package X;

import java.util.RandomAccess;

/* renamed from: X.Eak, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6832Eak extends AH7<C6788EZx> implements RandomAccess {
    public static final C6820EaY A02 = new C6820EaY();
    public final int[] A00;
    public final C6788EZx[] A01;

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A01.length;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C6788EZx) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A01[i];
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C6788EZx) {
            return super.indexOf(obj);
        }
        return -1;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C6788EZx) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }

    public C6832Eak(int[] iArr, C6788EZx[] c6788EZxArr) {
        this.A01 = c6788EZxArr;
        this.A00 = iArr;
    }
}

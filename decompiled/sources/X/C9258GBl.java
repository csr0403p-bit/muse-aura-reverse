package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* renamed from: X.GBl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9258GBl extends GCI implements InterfaceC2261BLa {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C9258GBl.class, Object.class, "owner$volatile");
    public final G0W A00;
    public volatile /* synthetic */ Object owner$volatile;

    public C9258GBl() {
        super(1);
        this.owner$volatile = AbstractC9272GBz.A00;
        this.A00 = new GY7(this, 2);
    }

    @Override // X.InterfaceC2261BLa
    public final boolean AOf() {
        return AnonymousClass002.A1M(Math.max(GCI.A02.get(this), 0));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Mutex@");
        AbstractC7609F5w.A1K(sbA0x, this);
        sbA0x.append("[isLocked=");
        sbA0x.append(AOf());
        sbA0x.append(",owner=");
        sbA0x.append(A01.get(this));
        return BV5.A0o(sbA0x);
    }

    @Override // X.InterfaceC2261BLa
    public final Object APs(Object obj, HtJ<? super Unit> htJ) {
        if (!AhW(obj)) {
            GBL gblA00 = GBO.A00(C7Bm.A02(htJ));
            try {
                A01(new GBV(obj, gblA00, this));
                Object objA0F = gblA00.A0F();
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                if (objA0F != enumC10460Hji) {
                    objA0F = Unit.INSTANCE;
                }
                if (objA0F == enumC10460Hji) {
                    return objA0F;
                }
            } catch (Throwable th) {
                gblA00.A0J();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.InterfaceC2261BLa
    public final boolean AhW(Object obj) {
        while (!AhT()) {
            if (obj == null) {
                return false;
            }
            while (AOf()) {
                Object obj2 = A01.get(this);
                if (obj2 != AbstractC9272GBz.A00) {
                    if (obj2 != obj) {
                        return false;
                    }
                    StringBuilder sb = new StringBuilder("This mutex is already locked by the specified owner: ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        A01.set(this, obj);
        return true;
    }

    @Override // X.InterfaceC2261BLa
    public final void Ahe(Object obj) {
        while (AOf()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            HrH hrH = AbstractC9272GBz.A00;
            if (obj2 != hrH) {
                if (obj2 != obj && obj != null) {
                    StringBuilder sbA0f = C3cG.A0f(obj2, "This mutex is locked by ");
                    sbA0f.append(", but ");
                    sbA0f.append(obj);
                    throw BV8.A0m(" is expected", sbA0f);
                }
                if (AbstractC5217DdT.A00(this, obj2, hrH, atomicReferenceFieldUpdater)) {
                    release();
                    return;
                }
            }
        }
        throw C3cG.A0Q("This mutex is not locked");
    }
}

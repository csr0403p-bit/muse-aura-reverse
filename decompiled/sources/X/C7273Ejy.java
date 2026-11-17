package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ejy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7273Ejy implements InterfaceC7274Ejz {
    public final int A00;

    @Override // X.InterfaceC7274Ejz
    public final /* bridge */ void A6I() {
    }

    @Override // X.InterfaceC7274Ejz
    public final /* bridge */ void AWF() {
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ehl;LX/Ek1;LX/Ek4;ILkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    @Override // X.InterfaceC7274Ejz
    public final void AYQ(InterfaceC7278Ek4 interfaceC7278Ek4, InterfaceC7275Ek1 interfaceC7275Ek1, InterfaceC7176Ehl interfaceC7176Ehl, Function0 function0, int i) {
        AnonymousClass005.A0x(interfaceC7176Ehl, interfaceC7275Ek1, interfaceC7278Ek4);
        int i2 = this.A00;
        int i3 = 1;
        while (true) {
            int frameCount = (i + i3) % interfaceC7278Ek4.getFrameCount();
            Ek0 ek0 = (Ek0) interfaceC7176Ehl;
            int iA0E = AnonymousClass005.A0E(interfaceC7278Ek4) + frameCount;
            SparseArray<Runnable> sparseArray = ek0.A01;
            synchronized (sparseArray) {
                if (sparseArray.get(iA0E) == null && !interfaceC7275Ek1.A72(frameCount)) {
                    RunnableC7272Ejx runnableC7272Ejx = new RunnableC7272Ejx(interfaceC7278Ek4, interfaceC7275Ek1, ek0, frameCount, iA0E);
                    sparseArray.put(iA0E, runnableC7272Ejx);
                    ek0.A04.execute(runnableC7272Ejx);
                }
            }
            if (i3 == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C7273Ejy(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC7274Ejz
    public final /* bridge */ void AYR(int i, int i2) {
    }

    @Override // X.InterfaceC7274Ejz
    public final /* bridge */ EfF<Bitmap> ACp(int i, int i2, int i3) {
        return null;
    }

    public C7273Ejy() {
        this(3);
    }
}

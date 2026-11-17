package com.google.android.gms.common.api.internal;

import X.AbstractC4272Cry;
import X.AbstractC4354Ctw;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.Bq0;
import X.C3cG;
import X.C4152Cnx;
import X.C4154Co9;
import X.C4183Cot;
import X.C4184Cou;
import X.C4186Cow;
import X.C4236Cqx;
import X.C4351Ctt;
import X.C4365CuK;
import X.C4366CuL;
import X.CRy;
import X.HandlerC4175Coi;
import X.InterfaceC4391Cut;
import X.InterfaceC4394Cux;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes5.dex */
public abstract class BasePendingResult<R extends InterfaceC4391Cut> extends AbstractC4354Ctw<R> {
    public static final ThreadLocal A0B = new Bq0();
    public InterfaceC4391Cut A00;
    public Status A01;
    public boolean A02;
    public boolean A03;
    public final Object A04;
    public final ArrayList A05;
    public final CountDownLatch A06;
    public final AtomicReference A07;
    public final HandlerC4175Coi A08;
    public final WeakReference A09;
    public volatile boolean A0A;

    public final R A01(Status status) {
        if (this instanceof C4236Cqx) {
            return (R) ((C4236Cqx) this).A00;
        }
        if (!(this instanceof C4152Cnx)) {
            if (this instanceof C4183Cot) {
                return new C4154Co9(status, null);
            }
            if (this instanceof C4186Cow) {
                return new C4351Ctt(status, C3cG.A0h());
            }
            if (this instanceof C4184Cou) {
                return new C4366CuL(status, -1);
            }
        }
        return status;
    }

    public final void A02(R r) {
        synchronized (this.A04) {
            if (!this.A03) {
                CountDownLatch countDownLatch = this.A06;
                countDownLatch.getCount();
                CRy.A09(!AnonymousClass002.A1M((countDownLatch.getCount() > 0L ? 1 : (countDownLatch.getCount() == 0L ? 0 : -1))), "Results have already been set");
                CRy.A09(!this.A0A, "Result has already been consumed");
                this.A00 = r;
                this.A01 = r.AL3();
                countDownLatch.countDown();
                ArrayList arrayList = this.A05;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC4394Cux) arrayList.get(i)).ASJ(this.A01);
                }
                arrayList.clear();
            }
        }
    }

    @Deprecated
    public final void A03(Status status) {
        synchronized (this.A04) {
            if (this.A06.getCount() != 0) {
                A02(A01(status));
                this.A03 = true;
            }
        }
    }

    public BasePendingResult(AbstractC4272Cry abstractC4272Cry) {
        this.A04 = C3cG.A0T();
        this.A06 = BV5.A16();
        this.A05 = C3cG.A0h();
        this.A07 = BV4.A15();
        this.A02 = false;
        this.A08 = new HandlerC4175Coi(abstractC4272Cry != null ? ((C4365CuK) abstractC4272Cry).A00.A02 : Looper.getMainLooper());
        this.A09 = BV4.A0q(abstractC4272Cry);
    }

    @Deprecated
    public BasePendingResult() {
        this.A04 = C3cG.A0T();
        this.A06 = BV5.A16();
        this.A05 = C3cG.A0h();
        this.A07 = BV4.A15();
        this.A02 = false;
        this.A08 = new HandlerC4175Coi(Looper.getMainLooper());
        this.A09 = BV4.A0q(null);
    }
}

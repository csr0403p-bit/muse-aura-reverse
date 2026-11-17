package X;

import X.AOd;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX WARN: Unknown type variable: S in type: X.AOP<S> */
/* loaded from: classes4.dex */
public final class AOQ<T, V extends AOd> implements C1BO<T> {
    public V A00;
    public AOV A01;
    public C0997AOa<T, V> A02;
    public boolean A03;
    public boolean A04;
    public final AOe<T> A05;
    public final C31w<T, V> A06;
    public final C00q A07;
    public final C00s A08;
    public final MutableState A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final MutableState A0C;
    public final MutableState A0D;
    public final C1003AOr<T> A0E;
    public final /* synthetic */ AOP<S> A0F;

    /* JADX WARN: Incorrect types in method signature: (TT;TV;LX/31w<TT;TV;>;Ljava/lang/String;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public AOQ(AOd aOd, AOP aop, C31w c31w, Object obj) {
        this.A0F = aop;
        this.A06 = c31w;
        Object objInvoke = null;
        AGE age = AGE.A00;
        this.A0C = C3cG.A08(age, obj);
        C1003AOr<T> c1003AOr = new C1003AOr<>(null, 1.0f, 1500.0f);
        this.A0E = c1003AOr;
        ParcelableSnapshotMutableState parcelableSnapshotMutableStateA08 = C3cG.A08(age, c1003AOr);
        this.A0A = parcelableSnapshotMutableStateA08;
        this.A09 = C3cG.A08(age, new C0997AOa((AOc) parcelableSnapshotMutableStateA08.getValue(), aOd, c31w, obj, this.A0C.getValue()));
        this.A0B = C3cG.A08(age, AnonymousClass001.A0i());
        this.A07 = new ParcelableSnapshotMutableFloatState(-1.0f);
        this.A0D = C3cG.A08(age, obj);
        this.A00 = aOd;
        this.A08 = new ParcelableSnapshotMutableLongState(C8j3.A0d(this.A09).AEu());
        Float f = AbstractC1005AOw.A01.get(c31w);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AOd aOdA00 = AOl.A00(c31w, obj);
            int iA02 = aOdA00.A02();
            for (int i = 0; i < iA02; i++) {
                aOdA00.A05(i, fFloatValue);
            }
            objInvoke = ((AOl) this.A06).A00.invoke(aOdA00);
        }
        this.A05 = new C1003AOr(objInvoke, 1.0f, 1500.0f);
    }

    private final void A01(T t, boolean z) {
        C0997AOa<T, V> c0997AOa = this.A02;
        T t2 = c0997AOa != null ? c0997AOa.A05 : null;
        MutableState mutableState = this.A0C;
        if (MutableState.A0B(mutableState, t2)) {
            C0997AOa c0997AOa2 = new C0997AOa(this.A05, this.A00.A03(), this.A06, t, t);
            MutableState mutableState2 = this.A09;
            mutableState2.Af8(c0997AOa2);
            this.A03 = true;
            A00(this, mutableState2);
            return;
        }
        AOc c0998AOb = (!z || this.A04 || (this.A0A.getValue() instanceof C1003AOr)) ? (AOc) this.A0A.getValue() : this.A05;
        AOP<S> aop = this.A0F;
        if (aop.A02() > 0) {
            c0998AOb = new C0998AOb(c0998AOb, aop.A02());
        }
        C0997AOa c0997AOa3 = new C0997AOa(c0998AOb, this.A00, this.A06, t, mutableState.getValue());
        MutableState mutableState3 = this.A09;
        mutableState3.Af8(c0997AOa3);
        A00(this, mutableState3);
        this.A03 = false;
        MutableState mutableState4 = aop.A08;
        MutableState.A09(true, mutableState4);
        if (aop.A0G()) {
            SnapshotStateList<AOP<S>.TransitionAnimationState<?, ?>> snapshotStateList = aop.A0A;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                AOQ aoq = (AOQ) snapshotStateList.get(i);
                aoq.A08.AHH();
                aoq.A02(aop.A00);
            }
            MutableState.A09(false, mutableState4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(long j) {
        if (this.A07.AFn() == -1.0f) {
            this.A04 = true;
            MutableState mutableState = this.A09;
            boolean zAreEqual = C7384Etj.areEqual(C8j3.A0d(mutableState).A05, C8j3.A0d(mutableState).A04);
            C0997AOa c0997AOa = (C0997AOa) mutableState.getValue();
            if (zAreEqual) {
                this.A0D.Af8(c0997AOa.A05);
            } else {
                this.A0D.Af8(c0997AOa.AMR(j));
                this.A00 = (V) C8j3.A0d(mutableState).AMb(j);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/AOe<TT;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(AOe aOe, Object obj) {
        if (this.A03) {
            C0997AOa<T, V> c0997AOa = this.A02;
            if (C7384Etj.areEqual(obj, c0997AOa != null ? c0997AOa.A05 : null)) {
                return;
            }
        }
        MutableState mutableState = this.A0C;
        if (C7384Etj.areEqual(mutableState.getValue(), obj) && this.A07.AFn() == -1.0f) {
            return;
        }
        mutableState.Af8(obj);
        this.A0A.Af8(aOe);
        C00q c00q = this.A07;
        Object value = c00q.AFn() == -3.0f ? obj : this.A0D.getValue();
        MutableState mutableState2 = this.A0B;
        A01(value, !MutableState.A0A(mutableState2));
        MutableState.A09(c00q.AFn() == -3.0f, mutableState2);
        if (c00q.AFn() < 0.0f) {
            if (c00q.AFn() == -3.0f) {
            }
            this.A03 = false;
            c00q.AdS(-1.0f);
        }
        obj = C8j3.A0d(this.A09).AMR((long) (C8j3.A0d(r1).AEu() * c00q.AFn()));
        this.A0D.Af8(obj);
        this.A03 = false;
        c00q.AdS(-1.0f);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;TT;LX/AOe<TT;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A04(AOe aOe, Object obj, Object obj2) {
        this.A0C.Af8(obj2);
        this.A0A.Af8(aOe);
        MutableState mutableState = this.A09;
        if (C7384Etj.areEqual(C8j3.A0d(mutableState).A04, obj) && C7384Etj.areEqual(C8j3.A0d(mutableState).A05, obj2)) {
            return;
        }
        A01(obj, false);
    }

    @Override // X.C1BO
    public final T getValue() {
        return (T) this.A0D.getValue();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("current value: ");
        sbA0x.append(this.A0D.getValue());
        sbA0x.append(", target: ");
        sbA0x.append(this.A0C.getValue());
        sbA0x.append(", spec: ");
        return C8j3.A14(this.A0A.getValue(), sbA0x);
    }

    public static void A00(AOQ aoq, MutableState mutableState) {
        aoq.A08.Adh(((C0997AOa) mutableState.getValue()).AEu());
    }
}

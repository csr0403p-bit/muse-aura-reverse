package X;

import X.AOd;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes4.dex */
public final class AT7<T, V extends AOd> implements C1BO<T> {
    public long A00;
    public long A01;
    public V A02;
    public boolean A03;
    public final C31w<T, V> A04;
    public final MutableState A05;

    public static float A00(AT7 at7) {
        return ((Number) ((AOl) at7.A04).A00.invoke(at7.A02)).floatValue();
    }

    @Override // X.C1BO
    public final T getValue() {
        return (T) this.A05.getValue();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnimationState(value=");
        sbA0x.append(this.A05.getValue());
        sbA0x.append(", velocity=");
        sbA0x.append(((AOl) this.A04).A00.invoke(this.A02));
        sbA0x.append(", isRunning=");
        sbA0x.append(this.A03);
        sbA0x.append(", lastFrameTimeNanos=");
        sbA0x.append(this.A01);
        sbA0x.append(", finishedTimeNanos=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/31w<TT;TV;>;TT;TV;JJZ)V */
    public AT7(AOd aOd, C31w c31w, Object obj, long j, long j2, boolean z) {
        V vInvoke;
        this.A04 = c31w;
        this.A05 = new ParcelableSnapshotMutableState(AGE.A00, obj);
        if (aOd != null) {
            vInvoke = (V) AOg.A00(aOd);
        } else {
            vInvoke = ((AOl) c31w).A01.invoke(obj);
            vInvoke.A04();
        }
        this.A02 = vInvoke;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }
}

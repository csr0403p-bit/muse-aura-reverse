package androidx.compose.ui.platform;

import X.Am4;
import X.AmD;
import X.C3UX;
import X.C78T;
import X.C7Bb;
import X.InterfaceC1655Ane;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class AndroidPlatformTextInputSession implements C3UX, InterfaceC1655Ane {
    public final View A00;
    public final AmD A01;
    public final AtomicReference<C7Bb<Am4>> A02 = new AtomicReference<>(null);
    public final C3UX A03;

    @Override // X.C3UX
    public final C78T AEA() {
        return this.A03.AEA();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @Override // X.InterfaceC1655Ane
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ag6(X.InterfaceC1631An5 r11, X.HtJ<?> r12) {
        /*
            r10 = this;
            r4 = 25
            boolean r0 = r12 instanceof X.C2310BTk
            if (r0 == 0) goto L28
            r3 = r12
            X.BTk r3 = (X.C2310BTk) r3
            int r0 = r3.$t
            if (r0 != r4) goto L28
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r2 = r3.A01
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r9 = 1
            if (r0 == 0) goto L2e
            if (r0 == r9) goto L50
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            X.BTk r3 = new X.BTk
            r3.<init>(r10, r12, r4)
            goto L18
        L2e:
            X.Hwg.A00(r2)
            java.util.concurrent.atomic.AtomicReference<X.7Bb<X.Am4>> r5 = r10.A02
            r0 = 15
            X.BUi r7 = new X.BUi
            r7.<init>(r0, r11, r10)
            r8 = 0
            r0 = 42
            X.BUC r6 = new X.BUC
            r6.<init>(r10, r8, r4, r0)
            r3.A00 = r9
            X.8ii r4 = new X.8ii
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r0 = X.Hxb.A00(r4, r3)
            if (r0 != r1) goto L53
            return r1
        L50:
            X.Hwg.A00(r2)
        L53:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.Ag6(X.An5, X.HtJ):X.Hji");
    }

    public AndroidPlatformTextInputSession(View view, AmD amD, C3UX c3ux) {
        this.A00 = view;
        this.A01 = amD;
        this.A03 = c3ux;
    }
}

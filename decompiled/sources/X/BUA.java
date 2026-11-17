package X;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUA extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUA(TextFieldSelectionState textFieldSelectionState, BRr bRr, TextFieldSelectionState textFieldSelectionState2, boolean z, HtJ<? super BUA> htJ) {
        super(2, textFieldSelectionState2);
        this.$t = z ? 1 : 0;
        if (z) {
            this.A02 = textFieldSelectionState;
            this.A01 = bRr;
        } else {
            this.A01 = bRr;
            this.A02 = textFieldSelectionState;
        }
        this.A03 = htJ;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        BRr bRr;
        TextFieldSelectionState textFieldSelectionState;
        boolean z;
        int i;
        if (this.$t != 0) {
            textFieldSelectionState = (TextFieldSelectionState) this.A02;
            bRr = (BRr) this.A01;
            z = this.A03;
            i = 1;
        } else {
            bRr = (BRr) this.A01;
            textFieldSelectionState = (TextFieldSelectionState) this.A02;
            z = this.A03;
            i = 0;
        }
        return new BUA(textFieldSelectionState, bRr, htJ, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r1 = r7.$t
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r5 = 1
            if (r1 == 0) goto L21
            if (r0 != 0) goto L48
            X.Hwg.A00(r8)
            java.lang.Object r2 = r7.A02
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            java.lang.Object r1 = r7.A01
            X.BRr r1 = (X.BRr) r1
            boolean r0 = r7.A03
            r7.A00 = r5
            java.lang.Object r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A05(r2, r1, r7, r0)
        L1e:
            if (r0 != r6) goto L4b
            return r6
        L21:
            if (r0 != 0) goto L48
            X.Hwg.A00(r8)
            java.lang.Object r4 = r7.A01
            X.BRr r4 = (X.BRr) r4
            java.lang.Object r1 = r7.A02
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
            boolean r0 = r7.A03
            X.AWr r3 = new X.AWr
            r3.<init>(r1, r0)
            r0 = 47
            X.BSy r2 = X.C2298BSy.A00(r1, r0)
            r7.A00 = r5
            r1 = 0
            X.BTx r0 = new X.BTx
            r0.<init>(r3, r1, r2)
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r4, r7, r0)
            goto L1e
        L48:
            X.Hwg.A00(r8)
        L4b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUA) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}

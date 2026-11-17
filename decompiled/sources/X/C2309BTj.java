package X;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;

/* renamed from: X.BTj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2309BTj extends HzP {
    public final int $t;
    public int A00;
    public Object A01;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A01 = obj;
        switch (i) {
            case 0:
                this.A00 |= Integer.MIN_VALUE;
                return AnchoredDraggableKt.A04(this, null, null);
            case 1:
                int i2 = this.A00 | Integer.MIN_VALUE;
                this.A00 = i2;
                int i3 = i2 - Integer.MIN_VALUE;
                this.A00 = i3;
                if (i3 == 0) {
                    Hwg.A00(obj);
                    throw new NullPointerException("view");
                }
                if (i3 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                throw C3cG.A0p();
            case 2:
                this.A00 |= Integer.MIN_VALUE;
                return AndroidTextInputSession_androidKt.A00(null, null, null, null, null, null, null, this, null, null, null, null);
            case 3:
                this.A00 |= Integer.MIN_VALUE;
                PlatformTextInputModifierNodeKt.A01(null, this, null);
                throw F60.createAndThrow();
            default:
                this.A00 |= Integer.MIN_VALUE;
                PlatformTextInputModifierNodeKt.A00(null, this, null);
                throw F60.createAndThrow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2309BTj(int i, HtJ<? super C2309BTj> htJ) {
        super(htJ);
        this.$t = i;
    }
}

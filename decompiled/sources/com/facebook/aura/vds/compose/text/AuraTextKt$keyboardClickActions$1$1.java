package com.facebook.aura.vds.compose.text;

import X.AbstractC1712Aov;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C10384HaO;
import X.C2AA;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import android.view.KeyEvent;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraTextKt$keyboardClickActions$1$1 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
    public final /* synthetic */ G0U<Integer, Unit> $onClick;
    public final /* synthetic */ G0U<Integer, Unit> $onDoubleClick;
    public final /* synthetic */ G0U<Integer, Unit> $onLongClick;
    public final /* synthetic */ Set<C10384HaO> $pressedKeys;

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m2645invokeZmokQxo(KeyEvent keyEvent) {
        G0U<Integer, Unit> g0u;
        C7384Etj.A0Y(keyEvent, 0);
        int iA00 = AbstractC1712Aov.A00(keyEvent);
        boolean z = false;
        if (AnonymousClass002.A1Q(iA00, 2)) {
            this.$pressedKeys.add(new C10384HaO(keyEvent.getKeyCode() << 32));
            long keyCode = keyEvent.getKeyCode() << 32;
            long j = C10384HaO.A0F;
            if (keyCode == j) {
                g0u = this.$onClick;
            } else {
                if (this.$pressedKeys.contains(new C10384HaO(C10384HaO.A07)) && this.$pressedKeys.contains(new C10384HaO(j))) {
                    g0u = this.$onLongClick;
                } else if (this.$pressedKeys.contains(new C10384HaO(C10384HaO.A0a)) && this.$pressedKeys.contains(new C10384HaO(j))) {
                    g0u = this.$onDoubleClick;
                }
                if (g0u != null) {
                }
                z = true;
            }
            g0u.invoke(0);
            z = true;
        } else if (iA00 == 1) {
            this.$pressedKeys.remove(new C10384HaO(C8j4.A0N(keyEvent)));
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTextKt$keyboardClickActions$1$1(Set<C10384HaO> set, G0U<? super Integer, Unit> g0u, G0U<? super Integer, Unit> g0u2, G0U<? super Integer, Unit> g0u3) {
        super(1);
        this.$pressedKeys = set;
        this.$onClick = g0u;
        this.$onLongClick = g0u2;
        this.$onDoubleClick = g0u3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
        return m2645invokeZmokQxo(c2aa.A00);
    }
}

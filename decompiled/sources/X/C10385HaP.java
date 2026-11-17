package X;

import android.view.KeyEvent;

/* renamed from: X.HaP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10385HaP implements InterfaceC2125Ayr {
    @Override // X.InterfaceC2125Ayr
    public final EnumC10381HaL AQ4(KeyEvent keyEvent) {
        int iA00 = FV7.A00(keyEvent);
        if (iA00 == 9) {
            long jA0N = C8j4.A0N(keyEvent);
            if (jA0N == C10384HaO.A0C) {
                return EnumC10381HaL.A0b;
            }
            if (jA0N == C10384HaO.A0D) {
                return EnumC10381HaL.A0c;
            }
            if (jA0N == C10384HaO.A0E) {
                return EnumC10381HaL.A0X;
            }
            if (jA0N == C10384HaO.A0B) {
                return EnumC10381HaL.A0W;
            }
        } else if (iA00 == 1) {
            long jA0N2 = C8j4.A0N(keyEvent);
            if (jA0N2 == C10384HaO.A0C) {
                return EnumC10381HaL.A0I;
            }
            if (jA0N2 == C10384HaO.A0D) {
                return EnumC10381HaL.A0J;
            }
            if (jA0N2 == C10384HaO.A0E) {
                return EnumC10381HaL.A0E;
            }
            if (jA0N2 == C10384HaO.A0B) {
                return EnumC10381HaL.A0D;
            }
            if (jA0N2 == C10384HaO.A04) {
                return EnumC10381HaL.A05;
            }
        }
        return AbstractC10386HaQ.A00.AQ4(keyEvent);
    }
}

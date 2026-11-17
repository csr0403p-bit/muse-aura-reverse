package X;

import android.view.KeyEvent;

/* renamed from: X.HaN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10383HaN implements InterfaceC2125Ayr {
    public final /* synthetic */ InterfaceC2125Ayr A00;

    public C10383HaN(InterfaceC2125Ayr interfaceC2125Ayr) {
        this.A00 = interfaceC2125Ayr;
    }

    @Override // X.InterfaceC2125Ayr
    public final EnumC10381HaL AQ4(KeyEvent keyEvent) {
        int iA00 = FV7.A00(keyEvent);
        long keyCode = keyEvent.getKeyCode() << 32;
        if (keyCode == C10384HaO.A04) {
            if (iA00 != 0 && iA00 != 8 && iA00 != 12) {
                if (iA00 == 2 || iA00 == 10) {
                    return EnumC10381HaL.A09;
                }
            }
            return EnumC10381HaL.A08;
        }
        if ((keyCode == C10384HaO.A0F || keyCode == C10384HaO.A0R) && (iA00 == 0 || iA00 == 8 || iA00 == 2 || iA00 == 10)) {
            return EnumC10381HaL.A0L;
        }
        int iA002 = FV7.A00(keyEvent);
        if (iA002 == 10) {
            long keyCode2 = keyEvent.getKeyCode() << 32;
            if (keyCode2 == C10384HaO.A0C || keyCode2 == C10384HaO.A0O) {
                return EnumC10381HaL.A0Z;
            }
            if (keyCode2 == C10384HaO.A0D || keyCode2 == C10384HaO.A0P) {
                return EnumC10381HaL.A0j;
            }
            if (keyCode2 == C10384HaO.A0E || keyCode2 == C10384HaO.A0Q) {
                return EnumC10381HaL.A0h;
            }
            if (keyCode2 == C10384HaO.A0B || keyCode2 == C10384HaO.A0N) {
                return EnumC10381HaL.A0e;
            }
        } else {
            if (iA002 == 2) {
                long keyCode3 = keyEvent.getKeyCode() << 32;
                if (keyCode3 == C10384HaO.A0C || keyCode3 == C10384HaO.A0O) {
                    return EnumC10381HaL.A0G;
                }
                if (keyCode3 == C10384HaO.A0D || keyCode3 == C10384HaO.A0P) {
                    return EnumC10381HaL.A0T;
                }
                if (keyCode3 == C10384HaO.A0E || keyCode3 == C10384HaO.A0Q) {
                    return EnumC10381HaL.A0Q;
                }
                if (keyCode3 == C10384HaO.A0B || keyCode3 == C10384HaO.A0N) {
                    return EnumC10381HaL.A0M;
                }
                if (keyCode3 != C10384HaO.A0H) {
                    if (keyCode3 == C10384HaO.A09) {
                        return EnumC10381HaL.A07;
                    }
                    if (keyCode3 == C10384HaO.A03) {
                        return EnumC10381HaL.A0B;
                    }
                }
                return EnumC10381HaL.A08;
            }
            if (iA002 == 8) {
                long keyCode4 = keyEvent.getKeyCode() << 32;
                if (keyCode4 == C10384HaO.A0K || keyCode4 == C10384HaO.A0U) {
                    return EnumC10381HaL.A0d;
                }
                if (keyCode4 == C10384HaO.A0J || keyCode4 == C10384HaO.A0T) {
                    return EnumC10381HaL.A0a;
                }
            } else if (iA002 == 1 && (keyEvent.getKeyCode() << 32) == C10384HaO.A09) {
                return EnumC10381HaL.A0A;
            }
        }
        return this.A00.AQ4(keyEvent);
    }
}

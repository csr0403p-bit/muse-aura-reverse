package X;

import android.view.KeyEvent;

/* renamed from: X.HaM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10382HaM implements InterfaceC2125Ayr {
    @Override // X.InterfaceC2125Ayr
    public final EnumC10381HaL AQ4(KeyEvent keyEvent) {
        int iA00 = FV7.A00(keyEvent);
        if (!AnonymousClass002.A1Q(iA00, 10)) {
            if (iA00 == 2) {
                long jA0N = C8j4.A0N(keyEvent);
                if (jA0N != C10384HaO.A05 && jA0N != C10384HaO.A0I && jA0N != C10384HaO.A0S) {
                    if (jA0N != C10384HaO.A0d) {
                        if (jA0N != C10384HaO.A0e) {
                            if (jA0N == C10384HaO.A01) {
                                return EnumC10381HaL.A0U;
                            }
                            if (jA0N != C10384HaO.A0f) {
                                if (jA0N == C10384HaO.A0g) {
                                    return EnumC10381HaL.A0m;
                                }
                                return null;
                            }
                        }
                        return EnumC10381HaL.A04;
                    }
                    return EnumC10381HaL.A0P;
                }
                return EnumC10381HaL.A03;
            }
            if (iA00 == 8) {
                long jA0N2 = C8j4.A0N(keyEvent);
                if (jA0N2 == C10384HaO.A0C || jA0N2 == C10384HaO.A0O) {
                    return EnumC10381HaL.A0Y;
                }
                if (jA0N2 == C10384HaO.A0D || jA0N2 == C10384HaO.A0P) {
                    return EnumC10381HaL.A0i;
                }
                if (jA0N2 == C10384HaO.A0E || jA0N2 == C10384HaO.A0Q) {
                    return EnumC10381HaL.A0k;
                }
                if (jA0N2 == C10384HaO.A0B || jA0N2 == C10384HaO.A0N) {
                    return EnumC10381HaL.A0V;
                }
                if (jA0N2 == C10384HaO.A0Y || jA0N2 == C10384HaO.A0W) {
                    return EnumC10381HaL.A0g;
                }
                if (jA0N2 == C10384HaO.A0X || jA0N2 == C10384HaO.A0V) {
                    return EnumC10381HaL.A0f;
                }
                if (jA0N2 == C10384HaO.A0K || jA0N2 == C10384HaO.A0U) {
                    return EnumC10381HaL.A0d;
                }
                if (jA0N2 == C10384HaO.A0J || jA0N2 == C10384HaO.A0T) {
                    return EnumC10381HaL.A0a;
                }
                if (jA0N2 != C10384HaO.A0I && jA0N2 != C10384HaO.A0S) {
                    return null;
                }
            } else {
                if (iA00 != 0) {
                    return null;
                }
                long jA0N3 = C8j4.A0N(keyEvent);
                if (jA0N3 == C10384HaO.A0C || jA0N3 == C10384HaO.A0O) {
                    return EnumC10381HaL.A0F;
                }
                if (jA0N3 == C10384HaO.A0D || jA0N3 == C10384HaO.A0P) {
                    return EnumC10381HaL.A0S;
                }
                if (jA0N3 == C10384HaO.A0E || jA0N3 == C10384HaO.A0Q) {
                    return EnumC10381HaL.A0n;
                }
                if (jA0N3 == C10384HaO.A0B || jA0N3 == C10384HaO.A0N) {
                    return EnumC10381HaL.A0C;
                }
                if (jA0N3 == C10384HaO.A0A) {
                    return EnumC10381HaL.A02;
                }
                if (jA0N3 == C10384HaO.A0Y || jA0N3 == C10384HaO.A0W) {
                    return EnumC10381HaL.A0O;
                }
                if (jA0N3 == C10384HaO.A0X || jA0N3 == C10384HaO.A0V) {
                    return EnumC10381HaL.A0N;
                }
                if (jA0N3 == C10384HaO.A0K || jA0N3 == C10384HaO.A0U) {
                    return EnumC10381HaL.A0K;
                }
                if (jA0N3 == C10384HaO.A0J || jA0N3 == C10384HaO.A0T) {
                    return EnumC10381HaL.A0H;
                }
                if (jA0N3 == C10384HaO.A0F || jA0N3 == C10384HaO.A0R) {
                    return EnumC10381HaL.A0L;
                }
                if (jA0N3 == C10384HaO.A04) {
                    return EnumC10381HaL.A08;
                }
                if (jA0N3 == C10384HaO.A09) {
                    return EnumC10381HaL.A06;
                }
                if (jA0N3 != C10384HaO.A0Z) {
                    if (jA0N3 != C10384HaO.A08) {
                        if (jA0N3 != C10384HaO.A06) {
                            if (jA0N3 == C10384HaO.A0c) {
                                return EnumC10381HaL.A0l;
                            }
                            return null;
                        }
                        return EnumC10381HaL.A03;
                    }
                    return EnumC10381HaL.A04;
                }
            }
            return EnumC10381HaL.A0P;
        }
        if (C8j4.A0N(keyEvent) != C10384HaO.A0g) {
            return null;
        }
        return EnumC10381HaL.A0R;
    }
}
